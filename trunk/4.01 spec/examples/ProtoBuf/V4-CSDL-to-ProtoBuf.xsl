<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:edmx="http://docs.oasis-open.org/odata/ns/edmx"
  xmlns:edm="http://docs.oasis-open.org/odata/ns/edm" xmlns:json="http://json.org/"
>
  <!--
    This style sheet transforms OData 4.0 XML CSDL documents into Protocol Buffers Version 3

    TODO:
    - edmx:Include -> import
    - Edm.Geo* types
    - Edm.PrimitiveType
    - Edm.PropertyPath and other stuff that can only be used within annotations
    - @Nullable
    - edm:TypeDefinition: avoid dummy property "value"
    - collection wrappers for entity sets, (navigation) properties, and return types
    - control information: count, nextLink etc.
  -->

  <xsl:output method="text" indent="yes" encoding="UTF-8" omit-xml-declaration="yes" />
  <xsl:strip-space elements="*" />

  <xsl:key name="types" match="//edm:Property/@Type|//edm:NavigationProperty/@Type|//edm:ReturnType/@Type" use="." />

  <xsl:template match="edmx:Edmx">
    <xsl:text>syntax = "proto3";&#xA;</xsl:text>
    <xsl:apply-templates select="//edmx:Include" />
    <xsl:apply-templates select="//edm:Schema" />
  </xsl:template>

  <xsl:template match="edmx:Include">
    <xsl:text>&#xA;// import "</xsl:text>
    <xsl:value-of select="@Namespace" />
    <xsl:text>.proto";</xsl:text>
  </xsl:template>

  <xsl:template match="edm:Schema">
    <!-- TODO:
      - decide on whether to use packages or nested messages
    -->
    <xsl:call-template name="namespace-wrapper">
      <xsl:with-param name="namespace" select="@Namespace" />
      <xsl:with-param name="indent" select="''" />
    </xsl:call-template>
    <!--
      <xsl:text>&#xA;&#xA;package </xsl:text>
      <xsl:value-of select="@Namespace" />
      <xsl:text>;</xsl:text>

      <xsl:apply-templates select="edm:EntityType|edm:ComplexType|edm:TypeDefinition|edm:EnumType">
      <xsl:with-param name="indent" select="''" />
      </xsl:apply-templates>
    -->

  </xsl:template>

  <xsl:template name="namespace-wrapper">
    <xsl:param name="namespace" />
    <xsl:param name="indent" />

    <xsl:text>&#xA;&#xA;</xsl:text>
    <xsl:value-of select="$indent" />
    <xsl:text>message </xsl:text>

    <xsl:choose>
      <xsl:when test="contains($namespace,'.')">
        <xsl:value-of select="substring-before($namespace,'.')" />
        <xsl:text> {</xsl:text>

        <xsl:call-template name="namespace-wrapper">
          <xsl:with-param name="namespace" select="substring-after($namespace,'.')" />
          <xsl:with-param name="indent" select="concat($indent,'  ')" />
        </xsl:call-template>
      </xsl:when>
      <xsl:otherwise>
        <xsl:value-of select="$namespace" />
        <xsl:text> {</xsl:text>

        <xsl:apply-templates select="edm:EntityType|edm:ComplexType|edm:TypeDefinition|edm:EnumType">
          <xsl:with-param name="indent" select="concat($indent,'  ')" />
        </xsl:apply-templates>
      </xsl:otherwise>
    </xsl:choose>

    <xsl:text>&#xA;&#xA;</xsl:text>
    <xsl:value-of select="$indent" />
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template match="edm:EntityType|edm:ComplexType">
    <xsl:param name="indent" />

    <xsl:text>&#xA;&#xA;</xsl:text>
    <xsl:value-of select="$indent" />
    <xsl:text>message </xsl:text>
    <xsl:value-of select="@Name" />
    <xsl:text> {&#xA;</xsl:text>

    <xsl:apply-templates select="edm:Property|edm:NavigationProperty">
      <xsl:with-param name="indent" select="concat($indent,'  ')" />
      <xsl:with-param name="offset" select="0" />
    </xsl:apply-templates>

    <xsl:if test="@BaseType">
      <xsl:call-template name="basetype">
        <xsl:with-param name="basetype" select="@BaseType" />
        <xsl:with-param name="indent" select="$indent" />
        <xsl:with-param name="offset" select="count(edm:Property|edm:NavigationProperty)" />
      </xsl:call-template>
    </xsl:if>

    <xsl:value-of select="$indent" />
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template name="basetype">
    <xsl:param name="basetype" />
    <xsl:param name="indent" />
    <xsl:param name="offset" />

    <!-- find base type -->
    <xsl:variable name="qualifier">
      <xsl:call-template name="substring-before-last">
        <xsl:with-param name="input" select="$basetype" />
        <xsl:with-param name="marker" select="'.'" />
      </xsl:call-template>
    </xsl:variable>
    <xsl:variable name="name">
      <xsl:call-template name="substring-after-last">
        <xsl:with-param name="input" select="$basetype" />
        <xsl:with-param name="marker" select="'.'" />
      </xsl:call-template>
    </xsl:variable>

    <xsl:variable name="base"
      select="//edm:Schema[@Namespace=$qualifier or @Alias=$qualifier]/edm:EntityType[@Name=$name]|//edm:Schema[@Namespace=$qualifier or @Alias=$qualifier]/edm:ComplexType[@Name=$name]" />

    <xsl:if test="not($base)">
      <xsl:message>
        <xsl:text>BaseType not found: </xsl:text>
        <xsl:value-of select="$basetype" />
      </xsl:message>
    </xsl:if>

    <!-- treat properties -->
    <xsl:apply-templates select="$base/edm:Property|$base/edm:NavigationProperty">
      <xsl:with-param name="indent" select="concat($indent,'  ')" />
      <xsl:with-param name="offset" select="$offset" />
    </xsl:apply-templates>


    <!-- recurse to base type -->
    <xsl:if test="$base/@BaseType">
      <xsl:call-template name="basetype">
        <xsl:with-param name="basetype" select="$base/@BaseType" />
        <xsl:with-param name="indent" select="$indent" />
        <xsl:with-param name="offset" select="$offset + count($base/edm:Property|$base/edm:NavigationProperty)" />
      </xsl:call-template>
    </xsl:if>
  </xsl:template>

  <xsl:template match="edm:Property|edm:NavigationProperty">
    <xsl:param name="indent" />
    <xsl:param name="offset" />

    <xsl:value-of select="$indent" />
    <xsl:call-template name="type">
      <xsl:with-param name="type" select="@Type" />
      <xsl:with-param name="nullableFacet" select="@Nullable" />
    </xsl:call-template>
    <xsl:text> </xsl:text>
    <xsl:value-of select="@Name" />
    <xsl:text> = </xsl:text>
    <xsl:value-of select="$offset + position()" />
    <xsl:text>;&#xA;</xsl:text>
  </xsl:template>

  <xsl:template match="edm:EnumType">
    <xsl:param name="indent" />

    <xsl:text>&#xA;&#xA;</xsl:text>
    <xsl:value-of select="$indent" />
    <xsl:text>enum </xsl:text>
    <xsl:value-of select="@Name" />
    <xsl:text> {&#xA;</xsl:text>
    <!-- TODO: create this if a Value appears more than once
      <xsl:text>option allow_alias = true;&#xA;</xsl:text>
    -->

    <xsl:if test="@IsFlags='true'">
      <xsl:value-of select="$indent" />
      <xsl:text>  // NOTE: this is a Flags enum&#xA;</xsl:text>
    </xsl:if>

    <xsl:if test="edm:Member/@Value and not(edm:Member/@Value[.='0'])">
      <xsl:value-of select="$indent" />
      <xsl:text>  NOTHING = 0;&#xA;</xsl:text>
    </xsl:if>

    <xsl:apply-templates select="edm:Member">
      <xsl:with-param name="indent" select="concat($indent,'  ')" />
    </xsl:apply-templates>

    <xsl:value-of select="$indent" />
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template match="edm:Member">
    <xsl:param name="indent" />

    <xsl:value-of select="$indent" />
    <xsl:value-of select="@Name" />
    <xsl:text> = </xsl:text>

    <xsl:choose>
      <xsl:when test="@Value">
        <xsl:value-of select="@Value" />
      </xsl:when>
      <xsl:otherwise>
        <xsl:value-of select="position()-1" />
      </xsl:otherwise>
    </xsl:choose>

    <xsl:text>;&#xA;</xsl:text>
  </xsl:template>

  <xsl:template match="edm:TypeDefinition">
    <xsl:param name="indent" />

    <xsl:text>&#xA;&#xA;</xsl:text>
    <xsl:value-of select="$indent" />
    <xsl:text>message </xsl:text>
    <xsl:value-of select="@Name" />
    <xsl:text> {&#xA;</xsl:text>

    <xsl:value-of select="$indent" />
    <xsl:text>  </xsl:text>
    <xsl:call-template name="type">
      <xsl:with-param name="type" select="@UnderlyingType" />
      <xsl:with-param name="nullableFacet" select="'false'" />
    </xsl:call-template>
    <xsl:text> value = 1;&#xA;</xsl:text>

    <xsl:value-of select="$indent" />
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template name="type">
    <xsl:param name="type" />
    <xsl:param name="nullableFacet" />

    <xsl:variable name="collection" select="starts-with($type,'Collection(')" />
    <xsl:variable name="singleType">
      <xsl:choose>
        <xsl:when test="$collection">
          <xsl:value-of select="substring-before(substring-after($type,'('),')')" />
        </xsl:when>
        <xsl:otherwise>
          <xsl:value-of select="$type" />
        </xsl:otherwise>
      </xsl:choose>
    </xsl:variable>
    <xsl:variable name="nullable">
      <xsl:choose>
        <xsl:when test="$nullableFacet">
          <xsl:value-of select="$nullableFacet" />
        </xsl:when>
        <xsl:when test="starts-with($type,'Collection(')">
          <xsl:value-of select="'false'" />
        </xsl:when>
        <xsl:otherwise>
          <xsl:value-of select="'true'" />
        </xsl:otherwise>
      </xsl:choose>
    </xsl:variable>
    <xsl:variable name="qualifier">
      <xsl:call-template name="substring-before-last">
        <xsl:with-param name="input" select="$singleType" />
        <xsl:with-param name="marker" select="'.'" />
      </xsl:call-template>
    </xsl:variable>

    <xsl:if test="$collection">
      <xsl:text>repeated </xsl:text>
    </xsl:if>

    <xsl:choose>
      <xsl:when
        test="$singleType='Edm.String' or $singleType='Edm.Guid' or $singleType='Edm.Decimal'
           or $singleType='Edm.Date' or $singleType='Edm.DateTimeOffset'
           or $singleType='Edm.Duration' or $singleType='Edm.TimeOfDay'"
      >
        <xsl:call-template name="nullableType">
          <xsl:with-param name="type" select="'string'" />
          <xsl:with-param name="nullable" select="$nullable" />
        </xsl:call-template>
      </xsl:when>
      <xsl:when test="$singleType='Edm.Double'">
        <xsl:call-template name="nullableType">
          <xsl:with-param name="type" select="'double'" />
          <xsl:with-param name="nullable" select="$nullable" />
        </xsl:call-template>
      </xsl:when>
      <xsl:when test="$singleType='Edm.Single'">
        <xsl:call-template name="nullableType">
          <xsl:with-param name="type" select="'float'" />
          <xsl:with-param name="nullable" select="$nullable" />
        </xsl:call-template>
      </xsl:when>
      <xsl:when test="$singleType='Edm.Int32' or $singleType='Edm.Int16' or $singleType='Edm.Byte' or $singleType='Edm.SByte'">
        <xsl:call-template name="nullableType">
          <xsl:with-param name="type" select="'sint32'" />
          <xsl:with-param name="nullable" select="$nullable" />
        </xsl:call-template>
      </xsl:when>
      <xsl:when test="$singleType='Edm.Int64'">
        <xsl:call-template name="nullableType">
          <xsl:with-param name="type" select="'sint64'" />
          <xsl:with-param name="nullable" select="$nullable" />
        </xsl:call-template>
      </xsl:when>
      <xsl:when test="$singleType='Edm.Boolean'">
        <xsl:call-template name="nullableType">
          <xsl:with-param name="type" select="'bool'" />
          <xsl:with-param name="nullable" select="$nullable" />
        </xsl:call-template>
      </xsl:when>
      <xsl:when test="$singleType='Edm.Binary' or $singleType='Edm.Stream'">
        <xsl:call-template name="nullableType">
          <xsl:with-param name="type" select="'bytes'" />
          <xsl:with-param name="nullable" select="$nullable" />
        </xsl:call-template>
      </xsl:when>
      <xsl:when test="$qualifier='Edm'">
        <!-- TODO: Edm.Geo* - how to encode? WKT as string? Or "any"? -->
        <xsl:message>
          <xsl:text>TODO: Type=</xsl:text>
          <xsl:value-of select="$singleType" />
        </xsl:message>
        <xsl:call-template name="nullableType">
          <xsl:with-param name="type" select="'string'" />
          <xsl:with-param name="nullable" select="$nullable" />
        </xsl:call-template>
      </xsl:when>
      <xsl:otherwise>
        <xsl:variable name="simpleIdentifier">
          <xsl:call-template name="substring-after-last">
            <xsl:with-param name="input" select="$singleType" />
            <xsl:with-param name="marker" select="'.'" />
          </xsl:call-template>
        </xsl:variable>
        <xsl:variable name="namespace">
          <xsl:choose>
            <xsl:when test="//edm:Schema[@Namespace=$qualifier]">
              <xsl:value-of select="$qualifier" />
            </xsl:when>
            <xsl:when test="//edm:Schema[@Alias=$qualifier]">
              <xsl:value-of select="//edm:Schema[@Alias=$qualifier]/@Namespace" />
            </xsl:when>
            <xsl:when test="//edmx:Include[@Namespace=$qualifier]">
              <xsl:value-of select="$qualifier" />
            </xsl:when>
            <xsl:when test="//edmx:Include[@Alias=$qualifier]">
              <xsl:value-of select="//edmx:Include[@Alias=$qualifier]/@Namespace" />
            </xsl:when>
            <xsl:otherwise>
              <xsl:message>
                <xsl:text>Unknown qualifier in type </xsl:text>
                <xsl:value-of select="$singleType" />
              </xsl:message>
            </xsl:otherwise>
          </xsl:choose>
        </xsl:variable>

        <xsl:call-template name="nullableType">
          <xsl:with-param name="type" select="concat('.',$namespace,'.',$simpleIdentifier)" />
          <xsl:with-param name="nullable" select="$nullable" />
        </xsl:call-template>
      </xsl:otherwise>
    </xsl:choose>
  </xsl:template>

  <xsl:template name="nullableType">
    <xsl:param name="type" />
    <xsl:param name="nullable" />

    <!-- TODO: how to represent nullable primitives in proto3? -->
    <xsl:value-of select="$type" />
  </xsl:template>

  <xsl:template name="Edm.Geo">
    <xsl:param name="anyOf" />
    <xsl:param name="singleType" />
    <xsl:param name="nullable" />
    <xsl:if test="$anyOf">
      <xsl:text>"anyOf":[{</xsl:text>
    </xsl:if>
    <xsl:text>"$ref":"</xsl:text>
    <xsl:text>#/definitions/</xsl:text>
    <xsl:value-of select="$singleType" />
    <xsl:text>"</xsl:text>
    <xsl:if test="not($nullable='false')">
      <xsl:text>},{"type":"null"</xsl:text>
    </xsl:if>
    <xsl:if test="$anyOf">
      <xsl:text>}]</xsl:text>
    </xsl:if>
  </xsl:template>


  <!-- leftover text -->
  <xsl:template match="text()" />

  <!-- helper functions -->
  <xsl:template name="substring-before-last">
    <xsl:param name="input" />
    <xsl:param name="marker" />
    <xsl:if test="contains($input,$marker)">
      <xsl:value-of select="substring-before($input,$marker)" />
      <xsl:if test="contains(substring-after($input,$marker),$marker)">
        <xsl:value-of select="$marker" />
        <xsl:call-template name="substring-before-last">
          <xsl:with-param name="input" select="substring-after($input,$marker)" />
          <xsl:with-param name="marker" select="$marker" />
        </xsl:call-template>
      </xsl:if>
    </xsl:if>
  </xsl:template>

  <xsl:template name="substring-after-last">
    <xsl:param name="input" />
    <xsl:param name="marker" />
    <xsl:choose>
      <xsl:when test="contains($input,$marker)">
        <xsl:call-template name="substring-after-last">
          <xsl:with-param name="input" select="substring-after($input,$marker)" />
          <xsl:with-param name="marker" select="$marker" />
        </xsl:call-template>
      </xsl:when>
      <xsl:otherwise>
        <xsl:value-of select="$input" />
      </xsl:otherwise>
    </xsl:choose>
  </xsl:template>

  <xsl:template name="replace-all">
    <xsl:param name="string" />
    <xsl:param name="old" />
    <xsl:param name="new" />
    <xsl:choose>
      <xsl:when test="contains($string,$old)">
        <xsl:value-of select="substring-before($string,$old)" />
        <xsl:value-of select="$new" />
        <xsl:call-template name="replace-all">
          <xsl:with-param name="string" select="substring-after($string,$old)" />
          <xsl:with-param name="old" select="$old" />
          <xsl:with-param name="new" select="$new" />
        </xsl:call-template>
      </xsl:when>
      <xsl:otherwise>
        <xsl:value-of select="$string" />
      </xsl:otherwise>
    </xsl:choose>
  </xsl:template>

</xsl:stylesheet>