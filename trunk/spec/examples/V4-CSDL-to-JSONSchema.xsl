<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:edmx="http://docs.oasis-open.org/odata/ns/edmx"
  xmlns:edm="http://docs.oasis-open.org/odata/ns/edm" xmlns:json="http://json.org/"
>
  <!--
    This style sheet transforms OData 4.0 XML CSDL documents into JSON Schema with OData extensions

    TODO:
    - Validation annotations -> pattern, minimum, maximum, exclusiveM??imum, see ODATA-856
    - - inline and explace style
    - Core.Description -> title/description?
  -->

  <xsl:output method="text" indent="yes" encoding="UTF-8" omit-xml-declaration="yes" />
  <xsl:strip-space elements="*" />

  <xsl:variable name="edmUri" select="'http://docs.oasis-open.org/odata/odata-json-csdl/v4.0/edm.json'" />

  <xsl:key name="methods"
    match="edmx:Edmx/edmx:DataServices/edm:Schema/edm:Action|edmx:Edmx/edmx:DataServices/edm:Schema/edm:Function" use="concat(../@Namespace,'.',@Name)" />

  <xsl:template match="edmx:Edmx">
    <xsl:text>{"$schema":"</xsl:text>
    <xsl:value-of select="$edmUri" />
    <xsl:text>#"</xsl:text>
    <xsl:apply-templates select="@*" mode="list2" />
    <xsl:apply-templates select="edmx:DataServices" />
    <xsl:apply-templates select="edmx:Reference[edmx:IncludeAnnotations|edm:Annotation]" mode="hash">
      <xsl:with-param name="key" select="'Uri'" />
    </xsl:apply-templates>
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template match="edmx:Edmx/@Version">
    <xsl:text>"odata-version":"</xsl:text>
    <xsl:value-of select="." />
    <xsl:text>"</xsl:text>
  </xsl:template>

  <xsl:template match="edmx:Reference" mode="hashvalue">
    <xsl:apply-templates select="@*[local-name()!='Uri']" />
    <xsl:apply-templates select="edmx:IncludeAnnotations" mode="array">
      <xsl:with-param name="after" />
    </xsl:apply-templates>
    <xsl:apply-templates select="edm:Annotation" mode="list">
      <xsl:with-param name="after" select="edmx:IncludeAnnotations" />
    </xsl:apply-templates>
  </xsl:template>

  <xsl:template match="edmx:DataServices">
    <xsl:apply-templates
      select="edm:Schema/edm:EntityType|edm:Schema/edm:ComplexType|edm:Schema/edm:TypeDefinition|edm:Schema/edm:EnumType"
      mode="hash"
    >
      <xsl:with-param name="name" select="'definitions'" />
    </xsl:apply-templates>
    <xsl:apply-templates select="edm:Schema|../edmx:Reference/edmx:Include" mode="hash">
      <xsl:with-param name="key" select="'Namespace'" />
      <xsl:with-param name="name" select="'schemas'" />
    </xsl:apply-templates>
  </xsl:template>

  <xsl:template match="edmx:Include" mode="hashpair">
    <xsl:text>"</xsl:text>
    <xsl:value-of select="@Namespace" />
    <xsl:text>":{"$ref":"</xsl:text>
    <xsl:call-template name="json-url">
      <xsl:with-param name="url" select="../@Uri" />
    </xsl:call-template>
    <xsl:text>#/schemas/</xsl:text>
    <xsl:value-of select="@Namespace" />
    <xsl:text>"}</xsl:text>
    <xsl:if test="@Alias">
      <xsl:text>,"</xsl:text>
      <xsl:value-of select="@Alias" />
      <xsl:text>":{"$ref":"</xsl:text>
      <xsl:call-template name="json-url">
        <xsl:with-param name="url" select="../@Uri" />
      </xsl:call-template>
      <xsl:text>#/schemas/</xsl:text>
      <xsl:value-of select="@Namespace" />
      <xsl:text>"}</xsl:text>
    </xsl:if>
  </xsl:template>

  <xsl:template match="edm:Schema" mode="hashpair">
    <xsl:if test="@Alias">
      <xsl:text>"</xsl:text>
      <xsl:value-of select="@Alias" />
      <xsl:text>":{"$ref":"#/schemas/</xsl:text>
      <xsl:value-of select="@Namespace" />
      <xsl:text>"},</xsl:text>
    </xsl:if>
    <xsl:text>"</xsl:text>
    <xsl:value-of select="@Namespace" />
    <xsl:text>":{</xsl:text>
    <xsl:apply-templates select="edm:Annotation" mode="list" />
    <xsl:apply-templates select="edm:Action[generate-id() = generate-id(key('methods', concat(../@Namespace,'.',@Name))[1])]"
      mode="hash"
    >
      <xsl:with-param name="after" select="edm:Annotation" />
    </xsl:apply-templates>
    <xsl:apply-templates select="edm:Function[generate-id() = generate-id(key('methods', concat(../@Namespace,'.',@Name))[1])]"
      mode="hash"
    >
      <xsl:with-param name="after" select="edm:Annotation|edm:Action" />
    </xsl:apply-templates>
    <xsl:apply-templates select="edm:Term" mode="hash">
      <xsl:with-param name="after" select="edm:Annotation|edm:Action|edm:Function" />
    </xsl:apply-templates>
    <xsl:apply-templates select="edm:EntityContainer" mode="list">
      <xsl:with-param name="after" select="edm:Annotation|edm:Action|edm:Function|edm:Term" />
    </xsl:apply-templates>
    <xsl:apply-templates select="edm:Annotations" mode="array">
      <xsl:with-param name="after" select="edm:Annotation|edm:Action|edm:Function|edm:Term|edm:EntityContainer" />
    </xsl:apply-templates>
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template match="edm:EnumType" mode="hashpair">
    <xsl:text>"</xsl:text>
    <xsl:value-of select="../@Namespace" />
    <xsl:text>.</xsl:text>
    <xsl:value-of select="@Name" />
    <xsl:text>":{</xsl:text>
    <xsl:if test="@IsFlags='true'">
      <xsl:text>"anyOf":[{</xsl:text>
    </xsl:if>
    <xsl:text>"enum":[</xsl:text>
    <xsl:apply-templates select="edm:Member" mode="list" />
    <xsl:text>]</xsl:text>
    <xsl:if test="@IsFlags='true'">
      <xsl:text>},{"type":"string","pattern":"^</xsl:text>
      <xsl:variable name="pattern">
        <xsl:apply-templates select="edm:Member" mode="pattern" />
        <xsl:text>|[1-9][0-9]*</xsl:text>
      </xsl:variable>
      <xsl:text>(</xsl:text>
      <xsl:value-of select="$pattern" />
      <xsl:text>)(,(</xsl:text>
      <xsl:value-of select="$pattern" />
      <xsl:text>))*</xsl:text>
      <xsl:text>$"}]</xsl:text>
    </xsl:if>
    <xsl:apply-templates select="edm:Member" mode="annotation" />
    <xsl:apply-templates select="edm:Annotation" mode="list2" />
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template match="edm:Member" mode="list">
    <xsl:if test="position() > 1">
      <xsl:text>,</xsl:text>
    </xsl:if>
    <xsl:text>"</xsl:text>
    <xsl:value-of select="@Name" />
    <xsl:text>"</xsl:text>
  </xsl:template>

  <xsl:template match="edm:Member" mode="pattern">
    <xsl:if test="position() > 1">
      <xsl:text>|</xsl:text>
    </xsl:if>
    <xsl:value-of select="@Name" />
  </xsl:template>

  <xsl:template match="edm:Member" mode="annotation">
    <xsl:if test="@Value">
      <xsl:text>,"</xsl:text>
      <xsl:value-of select="@Name" />
      <xsl:text>@odata.value":</xsl:text>
      <xsl:value-of select="@Value" />
    </xsl:if>
    <xsl:apply-templates select="edm:Annotation" mode="list2">
      <xsl:with-param name="target" select="@Name" />
    </xsl:apply-templates>
  </xsl:template>

  <xsl:template match="edm:TypeDefinition" mode="hashpair">
    <xsl:text>"</xsl:text>
    <xsl:value-of select="../@Namespace" />
    <xsl:text>.</xsl:text>
    <xsl:value-of select="@Name" />
    <xsl:text>":{</xsl:text>
    <xsl:call-template name="type">
      <xsl:with-param name="type" select="@UnderlyingType" />
      <xsl:with-param name="nullableFacet" select="'false'" />
    </xsl:call-template>
    <xsl:apply-templates select="node()" mode="list2" />
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template match="edm:EntityType|edm:ComplexType" mode="hashpair">
    <xsl:text>"</xsl:text>
    <xsl:value-of select="../@Namespace" />
    <xsl:text>.</xsl:text>
    <xsl:value-of select="@Name" />
    <xsl:text>":{"type":"object"</xsl:text>
    <xsl:if test="@BaseType">
      <xsl:text>,"allOf":[{</xsl:text>
      <xsl:call-template name="ref">
        <xsl:with-param name="qualifier">
          <xsl:call-template name="substring-before-last">
            <xsl:with-param name="input" select="@BaseType" />
            <xsl:with-param name="marker" select="'.'" />
          </xsl:call-template>
        </xsl:with-param>
        <xsl:with-param name="typeName">
          <xsl:call-template name="substring-after-last">
            <xsl:with-param name="input" select="@BaseType" />
            <xsl:with-param name="marker" select="'.'" />
          </xsl:call-template>
        </xsl:with-param>
      </xsl:call-template>
      <xsl:text>}]</xsl:text>
    </xsl:if>
    <xsl:if test="@Abstract='true'">
      <xsl:text>,"abstract":true</xsl:text>
      <xsl:if test="not(edm:Key)">
        <xsl:text>,"keys":[]</xsl:text>
      </xsl:if>
    </xsl:if>
    <xsl:if test="@HasStream='true'">
      <xsl:text>,"mediaEntity":true</xsl:text>
    </xsl:if>
    <xsl:apply-templates select="@OpenType|edm:Key" mode="list2" />
    <xsl:apply-templates select="edm:Property|edm:NavigationProperty" mode="hash">
      <xsl:with-param name="name" select="'properties'" />
    </xsl:apply-templates>
    <xsl:apply-templates select="edm:Annotation" mode="list2" />
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template match="edm:Property|edm:NavigationProperty" mode="hashvalue">
    <xsl:call-template name="type">
      <xsl:with-param name="type" select="@Type" />
      <xsl:with-param name="nullableFacet" select="@Nullable" />
    </xsl:call-template>
    <xsl:choose>
      <xsl:when test="local-name()='Property'">
        <xsl:apply-templates select="@Unicode|*[local-name()!='Annotation']" mode="list2" />
      </xsl:when>
      <xsl:otherwise>
        <xsl:text>,"relationship":{</xsl:text>
        <xsl:apply-templates
          select="@*[local-name()!='Name' and local-name()!='Type' and local-name()!='Nullable']|node()[local-name()!='ReferentialConstraint' and local-name()!='Annotation']"
          mode="list" />
        <xsl:apply-templates select="edm:ReferentialConstraint" mode="hash">
          <xsl:with-param name="after"
            select="@*[local-name()!='Name' and local-name()!='Type' and local-name()!='Nullable']|node()[local-name()!='ReferentialConstraint' and local-name()!='Annotation']" />
          <xsl:with-param name="key" select="'Property'" />
        </xsl:apply-templates>
        <xsl:text>}</xsl:text>
      </xsl:otherwise>
    </xsl:choose>
    <xsl:apply-templates select="edm:Annotation" mode="list2" />
  </xsl:template>

  <xsl:template match="edm:Term" mode="hashvalue">
    <xsl:call-template name="type">
      <xsl:with-param name="type" select="@Type" />
      <xsl:with-param name="nullableFacet" select="@Nullable" />
    </xsl:call-template>
    <xsl:apply-templates select="@AppliesTo|@BaseTerm|edm:Annotation" mode="list2" />
  </xsl:template>

  <xsl:template match="@AppliesTo">
    <!-- TODO: lower-case values? -->
    <xsl:text>"appliesTo":</xsl:text>
    <xsl:variable name="appliesTo" select="normalize-space()" />
    <xsl:choose>
      <xsl:when test="contains($appliesTo,' ')">
        <xsl:text>["</xsl:text>
        <xsl:call-template name="replace-all">
          <xsl:with-param name="string" select="$appliesTo" />
          <xsl:with-param name="old" select="' '" />
          <xsl:with-param name="new" select="'&quot;,&quot;'" />
        </xsl:call-template>
        <xsl:text>"]</xsl:text>
      </xsl:when>
      <xsl:otherwise>
        <xsl:text>"</xsl:text>
        <xsl:value-of select="." />
        <xsl:text>"</xsl:text>
      </xsl:otherwise>
    </xsl:choose>
  </xsl:template>

  <xsl:template match="@BaseTerm">
    <xsl:text>"baseTerm":{</xsl:text>
    <xsl:call-template name="schema-ref">
      <xsl:with-param name="qualifiedName" select="." />
      <xsl:with-param name="element" select="'terms'" />
    </xsl:call-template>
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template name="nullableFacetValue">
    <xsl:param name="type" />
    <xsl:param name="nullableFacet" />
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
  </xsl:template>

  <xsl:template name="type">
    <xsl:param name="type" />
    <xsl:param name="nullableFacet" />
    <xsl:variable name="nullable">
      <xsl:call-template name="nullableFacetValue">
        <xsl:with-param name="type" select="$type" />
        <xsl:with-param name="nullableFacet" select="$nullableFacet" />
      </xsl:call-template>
    </xsl:variable>
    <xsl:variable name="singleType">
      <xsl:choose>
        <xsl:when test="starts-with($type,'Collection(')">
          <xsl:value-of select="substring-before(substring-after($type,'('),')')" />
        </xsl:when>
        <xsl:otherwise>
          <xsl:value-of select="$type" />
        </xsl:otherwise>
      </xsl:choose>
    </xsl:variable>
    <xsl:variable name="qualifier">
      <xsl:call-template name="substring-before-last">
        <xsl:with-param name="input" select="$singleType" />
        <xsl:with-param name="marker" select="'.'" />
      </xsl:call-template>
    </xsl:variable>
    <xsl:if test="starts-with($type,'Collection(')">
      <xsl:text>"type":"array","items":{</xsl:text>
    </xsl:if>
    <xsl:choose>
      <xsl:when test="$singleType='Edm.Stream'">
        <xsl:text>"$ref":"</xsl:text>
        <xsl:value-of select="$edmUri" />
        <xsl:text>#/definitions/Edm.Stream"</xsl:text>
      </xsl:when>
      <xsl:when test="$singleType='Edm.String'">
        <xsl:call-template name="nullableType">
          <xsl:with-param name="type" select="'string'" />
          <xsl:with-param name="nullable" select="$nullable" />
        </xsl:call-template>
        <xsl:apply-templates select="@MaxLength" />
      </xsl:when>
      <xsl:when test="$singleType='Edm.Binary'">
        <xsl:call-template name="nullableType">
          <xsl:with-param name="type" select="'string'" />
          <xsl:with-param name="nullable" select="$nullable" />
        </xsl:call-template>
        <xsl:text>,"format":"base64url"</xsl:text>
        <xsl:apply-templates select="@MaxLength">
          <xsl:with-param name="byteLength" select="'yes'" />
        </xsl:apply-templates>
      </xsl:when>
      <xsl:when test="$singleType='Edm.Boolean'">
        <xsl:call-template name="nullableType">
          <xsl:with-param name="type" select="'boolean'" />
          <xsl:with-param name="nullable" select="$nullable" />
        </xsl:call-template>
      </xsl:when>
      <xsl:when test="$singleType='Edm.Decimal'">
        <xsl:call-template name="nullableType">
          <xsl:with-param name="type" select="'number,string'" />
          <xsl:with-param name="nullable" select="$nullable" />
        </xsl:call-template>
        <xsl:text>,"format":"decimal"</xsl:text>
        <xsl:apply-templates select="@Precision|@Scale[.!=0]" mode="list2" />
        <xsl:choose>
          <xsl:when test="not(@Scale) or @Scale='0'">
            <xsl:text>,"multipleOf":1</xsl:text>
          </xsl:when>
          <xsl:when test="@Scale!='variable'">
            <xsl:text>,"multipleOf":1e-</xsl:text>
            <xsl:value-of select="@Scale" />
          </xsl:when>
        </xsl:choose>
        <xsl:if test="@Precision">
          <xsl:variable name="scale">
            <xsl:choose>
              <xsl:when test="not(@Scale)">
                <xsl:value-of select="0" />
              </xsl:when>
              <xsl:when test="@Scale='variable'">
                <xsl:value-of select="0" />
              </xsl:when>
              <xsl:otherwise>
                <xsl:value-of select="@Scale" />
              </xsl:otherwise>
            </xsl:choose>
          </xsl:variable>
          <xsl:variable name="limit">
            <xsl:call-template name="repeat">
              <xsl:with-param name="string" select="'9'" />
              <xsl:with-param name="count" select="@Precision - $scale" />
            </xsl:call-template>
            <xsl:if test="$scale > 0">
              <xsl:text>.</xsl:text>
              <xsl:call-template name="repeat">
                <xsl:with-param name="string" select="'9'" />
                <xsl:with-param name="count" select="$scale" />
              </xsl:call-template>
            </xsl:if>
          </xsl:variable>
          <xsl:text>,"minimum":-</xsl:text>
          <xsl:value-of select="$limit" />
          <xsl:text>,"maximum":</xsl:text>
          <xsl:value-of select="$limit" />
        </xsl:if>
      </xsl:when>
      <xsl:when test="$singleType='Edm.Byte'">
        <xsl:call-template name="nullableType">
          <xsl:with-param name="type" select="'integer'" />
          <xsl:with-param name="nullable" select="$nullable" />
        </xsl:call-template>
        <xsl:text>,"format":"uint8"</xsl:text>
      </xsl:when>
      <xsl:when test="$singleType='Edm.SByte'">
        <xsl:call-template name="nullableType">
          <xsl:with-param name="type" select="'integer'" />
          <xsl:with-param name="nullable" select="$nullable" />
        </xsl:call-template>
        <xsl:text>,"format":"int8"</xsl:text>
      </xsl:when>
      <xsl:when test="$singleType='Edm.Int16'">
        <xsl:call-template name="nullableType">
          <xsl:with-param name="type" select="'integer'" />
          <xsl:with-param name="nullable" select="$nullable" />
        </xsl:call-template>
        <xsl:text>,"format":"int16"</xsl:text>
      </xsl:when>
      <xsl:when test="$singleType='Edm.Int32'">
        <xsl:call-template name="nullableType">
          <xsl:with-param name="type" select="'integer'" />
          <xsl:with-param name="nullable" select="$nullable" />
        </xsl:call-template>
        <xsl:text>,"format":"int32"</xsl:text>
      </xsl:when>
      <xsl:when test="$singleType='Edm.Int64'">
        <xsl:call-template name="nullableType">
          <xsl:with-param name="type" select="'integer,string'" />
          <xsl:with-param name="nullable" select="$nullable" />
        </xsl:call-template>
        <xsl:text>,"format":"int64"</xsl:text>
      </xsl:when>
      <xsl:when test="$singleType='Edm.Date'">
        <xsl:call-template name="nullableType">
          <xsl:with-param name="type" select="'string'" />
          <xsl:with-param name="nullable" select="$nullable" />
        </xsl:call-template>
        <xsl:text>,"format":"date"</xsl:text>
      </xsl:when>
      <xsl:when test="$singleType='Edm.Double'">
        <xsl:call-template name="nullableType">
          <xsl:with-param name="type" select="'number,string'" />
          <xsl:with-param name="nullable" select="$nullable" />
        </xsl:call-template>
        <xsl:text>,"format":"double"</xsl:text>
      </xsl:when>
      <xsl:when test="$singleType='Edm.Single'">
        <xsl:call-template name="nullableType">
          <xsl:with-param name="type" select="'number,string'" />
          <xsl:with-param name="nullable" select="$nullable" />
        </xsl:call-template>
        <xsl:text>,"format":"single"</xsl:text>
      </xsl:when>
      <xsl:when test="$singleType='Edm.Guid'">
        <xsl:call-template name="nullableType">
          <xsl:with-param name="type" select="'string'" />
          <xsl:with-param name="nullable" select="$nullable" />
        </xsl:call-template>
        <xsl:text>,"format":"uuid"</xsl:text>
      </xsl:when>
      <xsl:when test="$singleType='Edm.DateTimeOffset'">
        <xsl:call-template name="nullableType">
          <xsl:with-param name="type" select="'string'" />
          <xsl:with-param name="nullable" select="$nullable" />
        </xsl:call-template>
        <xsl:text>,"format":"date-time"</xsl:text>
        <xsl:apply-templates select="@Precision" mode="list2" />
      </xsl:when>
      <xsl:when test="$singleType='Edm.TimeOfDay'">
        <xsl:call-template name="nullableType">
          <xsl:with-param name="type" select="'string'" />
          <xsl:with-param name="nullable" select="$nullable" />
        </xsl:call-template>
        <xsl:text>,"format":"time"</xsl:text>
        <xsl:apply-templates select="@Precision" mode="list2" />
      </xsl:when>
      <xsl:when test="$singleType='Edm.Duration'">
        <xsl:call-template name="nullableType">
          <xsl:with-param name="type" select="'string'" />
          <xsl:with-param name="nullable" select="$nullable" />
        </xsl:call-template>
        <xsl:text>,"format":"duration"</xsl:text>
      </xsl:when>
      <xsl:when test="$qualifier='Edm'">
        <xsl:if test="not($nullable='false') or @DefaultValue or @SRID">
          <xsl:text>"anyOf":[{</xsl:text>
        </xsl:if>
        <xsl:text>"$ref":"</xsl:text>
        <xsl:value-of select="$edmUri" />
        <xsl:text>#/definitions/</xsl:text>
        <xsl:value-of select="$singleType" />
        <xsl:text>"</xsl:text>
        <xsl:if test="not($nullable='false')">
          <xsl:text>},{"type":"null"</xsl:text>
        </xsl:if>
        <xsl:if test="not($nullable='false') or @DefaultValue or @SRID">
          <xsl:text>}]</xsl:text>
        </xsl:if>
        <xsl:apply-templates select="@SRID" mode="list2" />
      </xsl:when>
      <xsl:otherwise>
        <xsl:if test="not($nullable='false') or @DefaultValue or @MaxLength or @Precision">
          <xsl:text>"anyOf":[{</xsl:text>
        </xsl:if>
        <xsl:call-template name="ref">
          <xsl:with-param name="qualifier" select="$qualifier" />
          <xsl:with-param name="typeName">
            <xsl:call-template name="substring-after-last">
              <xsl:with-param name="input" select="$singleType" />
              <xsl:with-param name="marker" select="'.'" />
            </xsl:call-template>
          </xsl:with-param>
        </xsl:call-template>
        <xsl:if test="not($nullable='false')">
          <xsl:text>},{"type":"null"</xsl:text>
        </xsl:if>
        <xsl:if test="not($nullable='false') or @DefaultValue or @MaxLength or @Precision">
          <xsl:text>}]</xsl:text>
        </xsl:if>
        <xsl:apply-templates select="@MaxLength" />
        <xsl:apply-templates select="@Precision" mode="list2" />
      </xsl:otherwise>
    </xsl:choose>
    <xsl:apply-templates select="@DefaultValue">
      <xsl:with-param name="type" select="$singleType" />
    </xsl:apply-templates>
    <xsl:if test="starts-with(@Type,'Collection(')">
      <xsl:text>}</xsl:text>
    </xsl:if>
  </xsl:template>

  <xsl:template name="ref">
    <xsl:param name="qualifier" />
    <xsl:param name="typeName" />
    <xsl:variable name="internalNamespace" select="//edm:Schema[@Alias=$qualifier]/@Namespace" />
    <xsl:variable name="externalNamespace">
      <xsl:choose>
        <xsl:when test="//edmx:Include[@Alias=$qualifier]/@Namespace">
          <xsl:value-of select="//edmx:Include[@Alias=$qualifier]/@Namespace" />
        </xsl:when>
        <xsl:otherwise>
          <xsl:value-of select="//edmx:Include[@Namespace=$qualifier]/@Namespace" />
        </xsl:otherwise>
      </xsl:choose>
    </xsl:variable>
    <xsl:text>"$ref":"</xsl:text>
    <xsl:call-template name="json-url">
      <xsl:with-param name="url" select="//edmx:Include[@Namespace=$externalNamespace]/../@Uri" />
    </xsl:call-template>
    <xsl:text>#/definitions/</xsl:text>
    <xsl:choose>
      <xsl:when test="$internalNamespace">
        <xsl:value-of select="$internalNamespace" />
      </xsl:when>
      <xsl:when test="string-length($externalNamespace)>0">
        <xsl:value-of select="$externalNamespace" />
      </xsl:when>
      <xsl:otherwise>
        <xsl:value-of select="$qualifier" />
      </xsl:otherwise>
    </xsl:choose>
    <xsl:text>.</xsl:text>
    <xsl:value-of select="$typeName" />
    <xsl:text>"</xsl:text>
  </xsl:template>

  <xsl:template name="schema-ref">
    <xsl:param name="qualifiedName" />
    <xsl:param name="element" />
    <xsl:variable name="qualifier">
      <xsl:call-template name="substring-before-last">
        <xsl:with-param name="input" select="$qualifiedName" />
        <xsl:with-param name="marker" select="'.'" />
      </xsl:call-template>
    </xsl:variable>
    <xsl:variable name="name">
      <xsl:call-template name="substring-after-last">
        <xsl:with-param name="input" select="$qualifiedName" />
        <xsl:with-param name="marker" select="'.'" />
      </xsl:call-template>
    </xsl:variable>
    <xsl:variable name="internalNamespace" select="//edm:Schema[@Alias=$qualifier]/@Namespace" />
    <xsl:variable name="externalNamespace">
      <xsl:choose>
        <xsl:when test="//edmx:Include[@Alias=$qualifier]/@Namespace">
          <xsl:value-of select="//edmx:Include[@Alias=$qualifier]/@Namespace" />
        </xsl:when>
        <xsl:otherwise>
          <xsl:value-of select="//edmx:Include[@Namespace=$qualifier]/@Namespace" />
        </xsl:otherwise>
      </xsl:choose>
    </xsl:variable>
    <xsl:text>"$ref":"</xsl:text>
    <xsl:call-template name="json-url">
      <xsl:with-param name="url" select="//edmx:Include[@Namespace=$externalNamespace]/../@Uri" />
    </xsl:call-template>
    <xsl:text>#/schemas/</xsl:text>
    <xsl:choose>
      <xsl:when test="$internalNamespace">
        <xsl:value-of select="$internalNamespace" />
      </xsl:when>
      <xsl:when test="string-length($externalNamespace)>0">
        <xsl:value-of select="$externalNamespace" />
      </xsl:when>
      <xsl:otherwise>
        <xsl:value-of select="$qualifier" />
      </xsl:otherwise>
    </xsl:choose>
    <xsl:text>/</xsl:text>
    <xsl:value-of select="$element" />
    <xsl:if test="$element!='entityContainer'">
      <xsl:text>/</xsl:text>
      <xsl:value-of select="$name" />
    </xsl:if>
    <xsl:text>"</xsl:text>
  </xsl:template>

  <xsl:template name="repeat">
    <xsl:param name="string" />
    <xsl:param name="count" />
    <xsl:value-of select="$string" />
    <xsl:if test="$count &gt; 1">
      <xsl:call-template name="repeat">
        <xsl:with-param name="string" select="$string" />
        <xsl:with-param name="count" select="$count - 1" />
      </xsl:call-template>
    </xsl:if>
  </xsl:template>

  <xsl:template name="nullableType">
    <xsl:param name="type" />
    <xsl:param name="nullable" />
    <xsl:text>"type":</xsl:text>
    <xsl:if test="not($nullable='false') or contains($type,',')">
      <xsl:text>[</xsl:text>
    </xsl:if>
    <xsl:text>"</xsl:text>
    <xsl:call-template name="replace-all">
      <xsl:with-param name="string" select="$type" />
      <xsl:with-param name="old" select="','" />
      <xsl:with-param name="new" select="'&quot;,&quot;'" />
    </xsl:call-template>
    <xsl:text>"</xsl:text>
    <xsl:if test="not($nullable='false')">
      <xsl:text>,"null"</xsl:text>
    </xsl:if>
    <xsl:if test="not($nullable='false') or contains($type,',')">
      <xsl:text>]</xsl:text>
    </xsl:if>
  </xsl:template>

  <xsl:template match="@MaxLength">
    <xsl:param name="byteLength" />
    <xsl:if test=".!='max'">
      <xsl:text>,"maxLength":</xsl:text>
      <xsl:if test="$byteLength">
        <xsl:value-of select="4*ceiling(. div 3)" />
        <xsl:text>,"byteLength":</xsl:text>
      </xsl:if>
      <xsl:value-of select="." />
    </xsl:if>
  </xsl:template>

  <xsl:template match="@Precision">
    <xsl:text>"precision":</xsl:text>
    <xsl:value-of select="." />
  </xsl:template>

  <xsl:template match="@Scale">
    <xsl:text>"scale":</xsl:text>
    <xsl:choose>
      <xsl:when test=".='variable'">
        <xsl:text>"variable"</xsl:text>
      </xsl:when>
      <xsl:otherwise>
        <xsl:value-of select="." />
      </xsl:otherwise>
    </xsl:choose>
  </xsl:template>

  <xsl:template match="@DefaultValue">
    <xsl:param name="type" />
    <xsl:text>,"default":</xsl:text>
    <xsl:variable name="qualifier">
      <xsl:call-template name="substring-before-last">
        <xsl:with-param name="input" select="$type" />
        <xsl:with-param name="marker" select="'.'" />
      </xsl:call-template>
    </xsl:variable>
    <xsl:variable name="typeName">
      <xsl:call-template name="substring-after-last">
        <xsl:with-param name="input" select="$type" />
        <xsl:with-param name="marker" select="'.'" />
      </xsl:call-template>
    </xsl:variable>
    <xsl:variable name="underlyingType">
      <xsl:choose>
        <xsl:when test="//edm:Schema[@Namespace=$qualifier]/edm:TypeDefinition[@Name=$typeName]/@UnderlyingType">
          <xsl:value-of select="//edm:Schema[@Namespace=$qualifier]/edm:TypeDefinition[@Name=$typeName]/@UnderlyingType" />
        </xsl:when>
        <xsl:when test="//edm:Schema[@Alias=$qualifier]/edm:TypeDefinition[@Name=$typeName]/@UnderlyingType">
          <xsl:value-of select="//edm:Schema[@Alias=$qualifier]/edm:TypeDefinition[@Name=$typeName]/@UnderlyingType" />
        </xsl:when>
        <xsl:otherwise>
          <xsl:value-of select="$type" />
        </xsl:otherwise>
      </xsl:choose>
    </xsl:variable>
    <xsl:variable name="underlyingQualifier">
      <xsl:call-template name="substring-before-last">
        <xsl:with-param name="input" select="$underlyingType" />
        <xsl:with-param name="marker" select="'.'" />
      </xsl:call-template>
    </xsl:variable>
    <xsl:choose>
      <xsl:when
        test="$underlyingType='Edm.Boolean' or $underlyingType='Edm.Decimal' or $underlyingType='Edm.Double' or $underlyingType='Edm.Single' or $underlyingType='Edm.Byte' or $underlyingType='Edm.SByte' or $underlyingType='Edm.Int16' or $underlyingType='Edm.Int32' or $underlyingType='Edm.Int64'"
      >
        <xsl:value-of select="." />
      </xsl:when>
      <!-- FAKE: couldn't determine underlying primitive type, so guess from value -->
      <xsl:when test="$underlyingQualifier!='Edm' and (.='true' or .='false' or .='null' or number(.))">
        <xsl:value-of select="." />
      </xsl:when>
      <xsl:otherwise>
        <xsl:text>"</xsl:text>
        <xsl:call-template name="escape">
          <xsl:with-param name="string" select="." />
        </xsl:call-template>
        <xsl:text>"</xsl:text>
      </xsl:otherwise>
    </xsl:choose>
  </xsl:template>

  <!-- name : unquoted boolean value -->
  <xsl:template match="@Nullable|@OpenType|@ContainsTarget|@IsBound|@IsComposable|@IncludeInServiceDocument|@Unicode">
    <xsl:text>"</xsl:text>
    <xsl:call-template name="lowerCamelCase">
      <xsl:with-param name="name" select="local-name()" />
    </xsl:call-template>
    <xsl:text>":</xsl:text>
    <xsl:value-of select="." />
  </xsl:template>

  <xsl:template match="edm:Key">
    <xsl:text>"keys":[</xsl:text>
    <xsl:apply-templates select="edm:PropertyRef" mode="list" />
    <xsl:text>]</xsl:text>
  </xsl:template>

  <xsl:template match="edm:PropertyRef">
    <xsl:text>{</xsl:text>
    <xsl:apply-templates select="@Name|@Alias" mode="list" />
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template match="edm:ReferentialConstraint" mode="item">
    <xsl:text>{</xsl:text>
    <xsl:apply-templates select="@*|node()" mode="list" />
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template match="edm:Action|edm:Function" mode="hashpair">
    <xsl:text>"</xsl:text>
    <xsl:value-of select="@Name" />
    <xsl:text>":</xsl:text>
    <xsl:if test="count(key('methods', concat(../@Namespace,'.',@Name)))>1">
      <xsl:text>[</xsl:text>
    </xsl:if>
    <xsl:for-each select="key('methods', concat(../@Namespace,'.',@Name))">
      <xsl:if test="position()>1">
        <xsl:text>,</xsl:text>
      </xsl:if>
      <xsl:text>{</xsl:text>
      <xsl:apply-templates select="@*[local-name()!='Name']" mode="list" />
      <xsl:apply-templates select="edm:Parameter" mode="hash">
        <xsl:with-param name="after" select="@*[local-name()!='Name']" />
      </xsl:apply-templates>
      <xsl:apply-templates select="edm:ReturnType" mode="list">
        <xsl:with-param name="after" select="@*[local-name()!='Name']|edm:Parameter" />
      </xsl:apply-templates>
      <xsl:apply-templates select="edm:Annotation" mode="list2" />
      <xsl:text>}</xsl:text>
    </xsl:for-each>
    <xsl:if test="count(key('methods', concat(../@Namespace,'.',@Name)))>1">
      <xsl:text>]</xsl:text>
    </xsl:if>
  </xsl:template>

  <xsl:template match="edm:Parameter" mode="hashvalue">
    <xsl:call-template name="type">
      <xsl:with-param name="type" select="@Type" />
      <xsl:with-param name="nullableFacet" select="@Nullable" />
    </xsl:call-template>
    <xsl:apply-templates select="edm:Annotation" mode="list2" />
  </xsl:template>

  <xsl:template match="edm:ReturnType">
    <xsl:text>"returnType":{</xsl:text>
    <xsl:call-template name="type">
      <xsl:with-param name="type" select="@Type" />
      <xsl:with-param name="nullableFacet" select="@Nullable" />
    </xsl:call-template>
    <xsl:apply-templates select="edm:Annotation" mode="list2" />
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template match="edm:EntityContainer">
    <xsl:text>"entityContainer":{</xsl:text>
    <xsl:apply-templates select="@*" mode="list" />
    <xsl:apply-templates select="edm:EntitySet" mode="hash" />
    <xsl:apply-templates select="edm:Singleton" mode="hash" />
    <xsl:apply-templates select="edm:ActionImport" mode="hash" />
    <xsl:apply-templates select="edm:FunctionImport" mode="hash" />
    <xsl:apply-templates select="edm:Annotation" mode="list2" />
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template match="@Extends">
    <xsl:text>"extends":{</xsl:text>
    <xsl:call-template name="schema-ref">
      <xsl:with-param name="qualifiedName" select="." />
      <xsl:with-param name="element" select="'entityContainer'" />
    </xsl:call-template>
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template match="edm:EntitySet|edm:Singleton" mode="hashvalue">
    <xsl:apply-templates select="@*[local-name()!='Name']" mode="list" />
    <xsl:apply-templates select="edm:NavigationPropertyBinding" mode="hash">
      <xsl:with-param name="key" select="'Path'" />
    </xsl:apply-templates>
    <xsl:apply-templates select="edm:Annotation" mode="list2" />
  </xsl:template>

  <xsl:template match="edm:EntitySet/@EntityType|edm:Singleton/@Type">
    <xsl:text>"</xsl:text>
    <xsl:call-template name="lowerCamelCase">
      <xsl:with-param name="name" select="local-name()" />
    </xsl:call-template>
    <xsl:text>":{</xsl:text>
    <xsl:call-template name="type">
      <xsl:with-param name="type" select="." />
      <xsl:with-param name="nullableFacet" select="'false'" />
    </xsl:call-template>
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template match="edm:ActionImport/@Action|edm:FunctionImport/@Function">
    <xsl:variable name="name">
      <xsl:call-template name="lowerCamelCase">
        <xsl:with-param name="name" select="local-name()" />
      </xsl:call-template>
    </xsl:variable>
    <xsl:text>"</xsl:text>
    <xsl:value-of select="$name" />
    <xsl:text>":{</xsl:text>
    <xsl:call-template name="schema-ref">
      <xsl:with-param name="qualifiedName" select="." />
      <xsl:with-param name="element" select="concat($name,'s')" />
    </xsl:call-template>
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template match="edm:Annotation">
    <xsl:param name="target" />
    <xsl:variable name="name">
      <xsl:value-of select="$target" />
      <xsl:text>@</xsl:text>
      <xsl:value-of select="@Term" />
      <xsl:if test="@Qualifier">
        <xsl:text>#</xsl:text>
        <xsl:value-of select="@Qualifier" />
      </xsl:if>
    </xsl:variable>
    <xsl:text>"</xsl:text>
    <xsl:value-of select="$name" />
    <xsl:text>":</xsl:text>
    <xsl:apply-templates select="@*[local-name()!='Term' and local-name()!='Qualifier']|*[local-name()!='Annotation']"
      mode="list"
    >
      <xsl:with-param name="target" select="$name" />
    </xsl:apply-templates>
    <xsl:apply-templates select="edm:Annotation" mode="list2">
      <xsl:with-param name="target" select="$name" />
    </xsl:apply-templates>
    <!-- for tagging terms -->
    <xsl:if test="count(@*[local-name()!='Term' and local-name()!='Qualifier']|*[local-name()!='Annotation'])=0">
      <xsl:text>{}</xsl:text>
    </xsl:if>
  </xsl:template>

  <!-- name : unquoted direct value or annotated quoted special value -->
  <xsl:template match="@Float|edm:Float">
    <xsl:choose>
      <xsl:when test=".='INF' or .='-INF' or .='NaN'">
        <xsl:text>"</xsl:text>
        <xsl:value-of select="." />
        <xsl:text>"</xsl:text>
      </xsl:when>
      <xsl:otherwise>
        <xsl:value-of select="." />
      </xsl:otherwise>
    </xsl:choose>
  </xsl:template>

  <!-- unquoted direct value -->
  <xsl:template match="@Bool|edm:Bool|@Decimal|edm:Decimal|@Int|edm:Int">
    <xsl:value-of select="." />
  </xsl:template>

  <!-- direct quoted value -->
  <xsl:template
    match="@Binary|edm:Binary|@Date|edm:Date|@DateTimeOffset|edm:DateTimeOffset|@Duration|edm:Duration|@Guid|edm:Guid|@TimeOfDay|edm:TimeOfDay"
  >
    <xsl:text>"</xsl:text>
    <xsl:value-of select="." />
    <xsl:text>"</xsl:text>
  </xsl:template>

  <xsl:template match="@EnumMember|edm:EnumMember">
    <xsl:variable name="type" select="substring-before(.,'/')" />
    <xsl:text>"</xsl:text>
    <xsl:call-template name="replace-all">
      <xsl:with-param name="string">
        <xsl:call-template name="replace-all">
          <xsl:with-param name="string" select="." />
          <xsl:with-param name="old" select="concat($type,'/')" />
          <xsl:with-param name="new" select="''" />
        </xsl:call-template>
      </xsl:with-param>
      <xsl:with-param name="old" select="' '" />
      <xsl:with-param name="new" select="','" />
    </xsl:call-template>
    <xsl:text>"</xsl:text>
  </xsl:template>

  <!-- name : object with escaped string value -->
  <xsl:template
    match="@AnnotationPath|edm:AnnotationPath|@NavigationPropertyPath|edm:NavigationPropertyPath|@Path|edm:Path|@PropertyPath|edm:PropertyPath|@UrlRef"
  >
    <xsl:text>{"@odata.type":"#</xsl:text>
    <xsl:value-of select="local-name()" />
    <xsl:text>","value":"</xsl:text>
    <xsl:call-template name="escape">
      <xsl:with-param name="string" select="." />
    </xsl:call-template>
    <xsl:text>"}</xsl:text>
  </xsl:template>

  <!-- escaped string value -->
  <xsl:template match="@String|edm:String">
    <xsl:text>"</xsl:text>
    <xsl:call-template name="escape">
      <xsl:with-param name="string" select="." />
    </xsl:call-template>
    <xsl:text>"</xsl:text>
  </xsl:template>

  <xsl:template name="escape">
    <xsl:param name="string" />
    <xsl:choose>
      <xsl:when test="contains($string,'&quot;')">
        <xsl:call-template name="replace">
          <xsl:with-param name="string" select="$string" />
          <xsl:with-param name="old" select="'&quot;'" />
          <xsl:with-param name="new" select="'\&quot;'" />
        </xsl:call-template>
      </xsl:when>
      <xsl:when test="contains($string,'\')">
        <xsl:call-template name="replace">
          <xsl:with-param name="string" select="$string" />
          <xsl:with-param name="old" select="'\'" />
          <xsl:with-param name="new" select="'\\'" />
        </xsl:call-template>
      </xsl:when>
      <xsl:when test="contains($string,'&#x0A;')">
        <xsl:call-template name="replace">
          <xsl:with-param name="string" select="$string" />
          <xsl:with-param name="old" select="'&#x0A;'" />
          <xsl:with-param name="new" select="'\n'" />
        </xsl:call-template>
      </xsl:when>
      <xsl:when test="contains($string,'&#x0D;')">
        <xsl:call-template name="replace">
          <xsl:with-param name="string" select="$string" />
          <xsl:with-param name="old" select="'&#x0D;'" />
          <xsl:with-param name="new" select="'\r'" />
        </xsl:call-template>
      </xsl:when>
      <xsl:when test="contains($string,'&#x09;')">
        <xsl:call-template name="replace">
          <xsl:with-param name="string" select="$string" />
          <xsl:with-param name="old" select="'&#x09;'" />
          <xsl:with-param name="new" select="'\t'" />
        </xsl:call-template>
      </xsl:when>
      <xsl:otherwise>
        <xsl:value-of select="$string" />
      </xsl:otherwise>
    </xsl:choose>
  </xsl:template>

  <xsl:template name="replace">
    <xsl:param name="string" />
    <xsl:param name="old" />
    <xsl:param name="new" />
    <xsl:call-template name="escape">
      <xsl:with-param name="string" select="substring-before($string,$old)" />
    </xsl:call-template>
    <xsl:value-of select="$new" />
    <xsl:call-template name="escape">
      <xsl:with-param name="string" select="substring-after($string,$old)" />
    </xsl:call-template>
  </xsl:template>

  <xsl:template match="edm:Record">
    <xsl:text>{</xsl:text>
    <xsl:if test="@Type">
      <xsl:text>"@odata.type":"#</xsl:text>
      <xsl:value-of select="@Type" />
      <xsl:text>"</xsl:text>
    </xsl:if>
    <xsl:apply-templates select="*" mode="list">
      <xsl:with-param name="after" select="@Type" />
    </xsl:apply-templates>
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template match="edm:PropertyValue">
    <xsl:text>"</xsl:text>
    <xsl:value-of select="@Property" />
    <xsl:text>":</xsl:text>
    <xsl:apply-templates select="@*[local-name()!='Property']|node()[local-name()!='Annotation']" />
    <xsl:apply-templates select="edm:Annotation" mode="list2">
      <xsl:with-param name="target" select="@Property" />
    </xsl:apply-templates>
  </xsl:template>

  <xsl:template match="edm:Collection">
    <xsl:text>[</xsl:text>
    <xsl:apply-templates select="node()" mode="list" />
    <xsl:text>]</xsl:text>
  </xsl:template>

  <xsl:template match="edm:If|edm:Eq|edm:Ne|edm:Ge|edm:Gt|edm:Le|edm:Lt|edm:And|edm:Or">
    <xsl:text>{"@odata.type":"#</xsl:text>
    <xsl:value-of select="local-name()" />
    <xsl:text>","value":[</xsl:text>
    <xsl:apply-templates select="*[local-name()!='Annotation']" mode="list" />
    <xsl:text>]</xsl:text>
    <xsl:apply-templates select="edm:Annotation" mode="list2" />
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template match="edm:Apply">
    <xsl:text>{"@odata.type":"#Apply"</xsl:text>
    <xsl:apply-templates select="@*" mode="list2" />
    <xsl:text>,"value":[</xsl:text>
    <xsl:apply-templates select="*[local-name()!='Annotation']" mode="list" />
    <xsl:text>]</xsl:text>
    <xsl:apply-templates select="edm:Annotation" mode="list2" />
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template match="edm:LabeledElement">
    <xsl:text>{"@odata.type":"#</xsl:text>
    <xsl:value-of select="local-name()" />
    <xsl:text>","name":"</xsl:text>
    <xsl:value-of select="@Name" />
    <xsl:text>","value":</xsl:text>
    <xsl:apply-templates select="@*[local-name()!='Name']|node()" />
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template match="edm:LabeledElementReference">
    <xsl:text>{"@odata.type":"#</xsl:text>
    <xsl:value-of select="local-name()" />
    <xsl:text>","value":"</xsl:text>
    <xsl:value-of select="." />
    <xsl:text>"}</xsl:text>
  </xsl:template>

  <xsl:template match="edm:Cast|edm:IsOf">
    <xsl:text>{"@odata.type":"#</xsl:text>
    <xsl:value-of select="local-name()" />
    <xsl:text>"</xsl:text>
    <xsl:apply-templates select="@*" mode="list2" />
    <xsl:text>,"value":</xsl:text>
    <xsl:apply-templates select="node()" />
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template match="edm:Null">
    <xsl:text>{"@odata.type":"#</xsl:text>
    <xsl:value-of select="local-name()" />
    <xsl:text>"</xsl:text>
    <xsl:apply-templates select="@*|node()" mode="list2" />
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template match="edm:Not|edm:UrlRef">
    <xsl:text>{"@odata.type":"#</xsl:text>
    <xsl:value-of select="local-name()" />
    <xsl:text>","value":</xsl:text>
    <xsl:apply-templates select="@*|node()" />
    <xsl:text>}</xsl:text>
  </xsl:template>

  <!-- name : object -->
  <xsl:template match="@*|*" mode="object">
    <xsl:param name="name" />
    <xsl:param name="after" select="'something'" />
    <xsl:if test="position()=1">
      <xsl:if test="$after">
        <xsl:text>,</xsl:text>
      </xsl:if>
      <xsl:text>"</xsl:text>
      <xsl:value-of select="$name" />
      <xsl:text>":{</xsl:text>
    </xsl:if>
    <xsl:apply-templates select="." />
    <xsl:if test="position()!=last()">
      <xsl:text>,</xsl:text>
    </xsl:if>
    <xsl:if test="position()=last()">
      <xsl:text>}</xsl:text>
    </xsl:if>
  </xsl:template>

  <!-- name : array -->
  <xsl:template match="*" mode="array">
    <xsl:param name="after" select="'something'" />
    <xsl:if test="position()=1">
      <xsl:if test="$after">
        <xsl:text>,</xsl:text>
      </xsl:if>
      <xsl:text>"</xsl:text>
      <xsl:call-template name="pluralize">
        <xsl:with-param name="name" select="local-name()" />
      </xsl:call-template>
      <xsl:text>":[</xsl:text>
    </xsl:if>
    <xsl:apply-templates select="." mode="item" />
    <xsl:if test="position()!=last()">
      <xsl:text>,</xsl:text>
    </xsl:if>
    <xsl:if test="position()=last()">
      <xsl:text>]</xsl:text>
    </xsl:if>
  </xsl:template>

  <!-- object within array -->
  <xsl:template match="*" mode="item">
    <xsl:text>{</xsl:text>
    <xsl:apply-templates select="@*|node()" mode="list" />
    <xsl:text>}</xsl:text>
  </xsl:template>

  <!-- pluralize(name) : hash -->
  <xsl:template match="*" mode="hash">
    <xsl:param name="name" />
    <xsl:param name="key" select="'Name'" />
    <xsl:param name="after" select="'something'" />
    <xsl:param name="constantProperties" />
    <xsl:if test="position()=1">
      <xsl:if test="$after">
        <xsl:text>,</xsl:text>
      </xsl:if>
      <xsl:text>"</xsl:text>
      <xsl:choose>
        <xsl:when test="$name">
          <xsl:value-of select="$name" />
        </xsl:when>
        <xsl:otherwise>
          <xsl:call-template name="pluralize">
            <xsl:with-param name="name" select="local-name()" />
          </xsl:call-template>
        </xsl:otherwise>
      </xsl:choose>
      <xsl:text>":{</xsl:text>
    </xsl:if>
    <xsl:apply-templates select="." mode="hashpair">
      <xsl:with-param name="name" select="$name" />
      <xsl:with-param name="key" select="$key" />
    </xsl:apply-templates>
    <xsl:if test="position()!=last()">
      <xsl:text>,</xsl:text>
    </xsl:if>
    <xsl:if test="position()=last()">
      <xsl:value-of select="$constantProperties" />
      <xsl:text>}</xsl:text>
    </xsl:if>
  </xsl:template>

  <xsl:template match="*" mode="hashpair">
    <xsl:param name="name" />
    <xsl:param name="key" select="'Name'" />
    <xsl:text>"</xsl:text>
    <xsl:value-of select="@*[local-name()=$key]" />
    <xsl:text>":{</xsl:text>
    <xsl:apply-templates select="." mode="hashvalue">
      <xsl:with-param name="name" select="$name" />
      <xsl:with-param name="key" select="$key" />
    </xsl:apply-templates>
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template match="*" mode="hashvalue">
    <xsl:param name="key" select="'Name'" />
    <xsl:apply-templates select="@*[local-name()!=$key]|node()" mode="list" />
  </xsl:template>

  <!-- comma-separated list -->
  <xsl:template match="@*|*" mode="list">
    <xsl:param name="target" />
    <xsl:param name="after" />
    <xsl:choose>
      <xsl:when test="position() > 1">
        <xsl:text>,</xsl:text>
      </xsl:when>
      <xsl:when test="$after">
        <xsl:text>,</xsl:text>
      </xsl:when>
    </xsl:choose>
    <xsl:apply-templates select=".">
      <xsl:with-param name="target" select="$target" />
    </xsl:apply-templates>
  </xsl:template>

  <!-- continuation of comma-separated list -->
  <xsl:template match="@*|*" mode="list2">
    <xsl:param name="target" />
    <xsl:text>,</xsl:text>
    <xsl:apply-templates select=".">
      <xsl:with-param name="target" select="$target" />
    </xsl:apply-templates>
  </xsl:template>

  <!-- name : quoted value -->
  <xsl:template match="@*">
    <xsl:text>"</xsl:text>
    <xsl:call-template name="lowerCamelCase">
      <xsl:with-param name="name" select="local-name()" />
    </xsl:call-template>
    <xsl:text>":"</xsl:text>
    <xsl:value-of select="." />
    <xsl:text>"</xsl:text>
  </xsl:template>

  <!-- name : object -->
  <xsl:template match="*">
    <xsl:text>"</xsl:text>
    <xsl:call-template name="lowerCamelCase">
      <xsl:with-param name="name" select="local-name()" />
    </xsl:call-template>
    <xsl:text>":{</xsl:text>
    <xsl:apply-templates select="@*|node()" mode="list" />
    <xsl:text>}</xsl:text>
  </xsl:template>

  <!-- leftover text -->
  <xsl:template match="text()">
    <xsl:text>"TODO:text()":"</xsl:text>
    <xsl:value-of select="." />
    <xsl:text>"</xsl:text>
  </xsl:template>

  <!-- helper functions -->
  <xsl:template name="pluralize">
    <xsl:param name="name" />
    <xsl:choose>
      <xsl:when test="$name='Annotations'">
        <xsl:text>annotations</xsl:text>
      </xsl:when>
      <xsl:when test="$name='IncludeAnnotations'">
        <xsl:text>includeAnnotations</xsl:text>
      </xsl:when>
      <xsl:when test="$name='NavigationProperty'">
        <xsl:text>navigationProperties</xsl:text>
      </xsl:when>
      <xsl:when test="$name='Property'">
        <xsl:text>properties</xsl:text>
      </xsl:when>
      <xsl:otherwise>
        <xsl:value-of select="translate(substring($name,1,1),'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz')" />
        <xsl:value-of select="substring($name,2)" />
        <xsl:text>s</xsl:text>
      </xsl:otherwise>
    </xsl:choose>
  </xsl:template>

  <xsl:template name="lowerCamelCase">
    <xsl:param name="name" />
    <xsl:choose>
      <xsl:when test="$name='SRID'">
        <xsl:text>srid</xsl:text>
      </xsl:when>
      <xsl:otherwise>
        <xsl:value-of select="translate(substring($name,1,1),'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz')" />
        <xsl:value-of select="substring($name,2)" />
      </xsl:otherwise>
    </xsl:choose>
  </xsl:template>

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

  <xsl:template name="json-url">
    <xsl:param name="url" />
    <xsl:choose>
      <xsl:when test="substring($url,string-length($url)-3) = '.xml'">
        <xsl:choose>
          <xsl:when test="substring($url,0,34) = 'http://docs.oasis-open.org/odata/'">
            <xsl:text>https://tools.oasis-open.org/version-control/browse/wsvn/odata/trunk/spec/vocabularies/</xsl:text>
            <xsl:variable name="filename">
              <xsl:call-template name="substring-after-last">
                <xsl:with-param name="input" select="$url" />
                <xsl:with-param name="marker" select="'/'" />
              </xsl:call-template>
            </xsl:variable>
            <xsl:value-of select="substring($filename,0,string-length($filename)-3)" />
          </xsl:when>
          <xsl:otherwise>
            <xsl:value-of select="substring($url,0,string-length($url)-3)" />
          </xsl:otherwise>
        </xsl:choose>
        <xsl:value-of select="'.json'" />
      </xsl:when>
      <xsl:otherwise>
        <xsl:value-of select="$url" />
      </xsl:otherwise>
    </xsl:choose>
  </xsl:template>

</xsl:stylesheet>