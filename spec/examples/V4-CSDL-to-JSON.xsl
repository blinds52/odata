<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:edmx="http://docs.oasis-open.org/odata/ns/edmx"
  xmlns:edm="http://docs.oasis-open.org/odata/ns/edm" xmlns:json="http://json.org/"
>
  <!--
    This style sheet transforms OData 4.0 CSDL documents into an experimental JSON metadata format.

    - The Edmx root element becomes a JSON object
    - Attributes become name-value pairs with the lowerCamelCased attribute name and the attribute value as a string
    - Single-occurrence child elements become name-value pairs with the lowerCamelCased element name and an object value
    - Multi-occurrence child elements with a unique identifier become name-value pairs with the pluralized lowerCamelCased
    element name and a hash of
    objects
    - Multi-occurrence child elements become name-value pairs with the pluralized and lowerCamelCased element name and an
    array of objects
    - Annotation elements become JSON payload annotations with @Term#Qualifier name and an object value
    - Tagging annotations get an object that is empty except for nested annotations
    - Annotation expressions become objects containing a name-value pair with the expression name
    - Bool, Decimal, Int, and numeric Float expressions get an unquoted value
    - Other constant expressions and dynamic expressions with attribute notation or a text body get a string value
    - Null gets an empty object
    - Collections get an array with one object per nested expression
    - Records get an object with one name-value pair per PropertyValue, the name is the property, the value the expression
    - Other dynamic expressions get an object value
    - Logical expressions get an array with one object per nested expression
    - Annotations nested within logical expressions are placed next to the expression using form expr@Term#Qualifier
  -->

  <xsl:output method="text" indent="yes" encoding="UTF-8" omit-xml-declaration="yes" />
  <xsl:strip-space elements="*" />

  <xsl:template name="edmUri">
    <xsl:text>http://odata.org/schemas/edm-v4.0</xsl:text>
  </xsl:template>

  <xsl:template match="edmx:Edmx">
    <xsl:text>{"@odata.context":"#","$schema":"</xsl:text>
    <xsl:call-template name="edmUri" />
    <xsl:text>#"</xsl:text>
    <xsl:apply-templates select="edmx:Reference" mode="hash">
      <xsl:with-param name="key" select="'Uri'" />
    </xsl:apply-templates>
    <xsl:apply-templates select="edmx:DataServices" />
    <xsl:call-template name="validation" />
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template match="edmx:Reference" mode="hashvalue">
    <xsl:apply-templates select="@*[local-name() != 'Uri']" />
    <xsl:apply-templates select="edmx:Include" mode="hash">
      <xsl:with-param name="key" select="'Namespace'" />
      <xsl:with-param name="after" />
    </xsl:apply-templates>
    <xsl:apply-templates select="edmx:IncludeAnnotations" mode="array">
      <xsl:with-param name="after" select="edmx:Include" />
    </xsl:apply-templates>
    <xsl:apply-templates select="edm:Annotation" mode="list">
      <xsl:with-param name="after" select="edmx:Include|edmx:IncludeAnnotations" />
    </xsl:apply-templates>

  </xsl:template>

  <xsl:template match="edmx:DataServices">
    <xsl:apply-templates select="edm:Schema/edm:EntityType|edm:Schema/edm:ComplexType" mode="definitions" />
    <xsl:apply-templates select="edm:Schema" mode="hash">
      <xsl:with-param name="key" select="'Namespace'" />
    </xsl:apply-templates>
  </xsl:template>

  <xsl:template match="edm:*" mode="definitions">
    <xsl:if test="position() = 1">
      <xsl:text>,"definitions":{</xsl:text>
    </xsl:if>
    <xsl:apply-templates select="." mode="hashpair" />
    <xsl:if test="position() != last()">
      <xsl:text>,</xsl:text>
    </xsl:if>
    <xsl:if test="position() = last()">
      <xsl:text>}</xsl:text>
    </xsl:if>
  </xsl:template>

  <xsl:template match="edm:Schema" mode="hashvalue">
    <!-- always force alias here even if it is not present in XML -->
    <xsl:text>"alias":</xsl:text>
    <xsl:choose>
      <xsl:when test="@Alias">
        <xsl:text>"</xsl:text>
        <xsl:value-of select="@Alias" />
        <xsl:text>"</xsl:text>
      </xsl:when>
      <xsl:otherwise>
        <xsl:text>null</xsl:text>
      </xsl:otherwise>
    </xsl:choose>
    <xsl:apply-templates select="edm:Annotation" mode="list2" />
    <xsl:apply-templates select="edm:EnumType" mode="hash" />
    <xsl:apply-templates select="edm:TypeDefinition" mode="hash" />
    <xsl:apply-templates select="edm:Action" mode="array" />
    <xsl:apply-templates select="edm:Function" mode="array" />
    <xsl:apply-templates select="edm:Term" mode="hash" />
    <xsl:apply-templates select="edm:EntityContainer" />
    <xsl:apply-templates select="edm:Annotations" mode="array" />
  </xsl:template>

  <xsl:template name="validation">
    <!-- TODO: produce validation body using anyOf and all relevant types -->
  </xsl:template>

  <xsl:template match="edm:Annotation">
    <xsl:param name="target" />
    <xsl:text>"</xsl:text>
    <xsl:value-of select="$target" />
    <xsl:text>@</xsl:text>
    <xsl:value-of select="@Term" />
    <xsl:if test="@Qualifier">
      <xsl:text>#</xsl:text>
      <xsl:value-of select="@Qualifier" />
    </xsl:if>
    <!-- TODO: can we optimize this if we detect there are no child elements of Annotation other than a single constant expression? -->
    <xsl:text>":{</xsl:text>
    <xsl:apply-templates select="@*[local-name() != 'Term' and local-name() != 'Qualifier']|*" mode="list" />
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template match="edm:EntityType|edm:ComplexType" mode="hashpair">
    <xsl:if test="../@Alias">
      <xsl:text>"</xsl:text>
      <xsl:value-of select="../@Alias" />
      <xsl:text>.</xsl:text>
      <xsl:value-of select="@Name" />
      <xsl:text>":{"$ref":"#/definitions/</xsl:text>
      <xsl:value-of select="../@Namespace" />
      <xsl:text>.</xsl:text>
      <xsl:value-of select="@Name" />
      <xsl:text>"},</xsl:text>
    </xsl:if>
    <xsl:text>"</xsl:text>
    <xsl:value-of select="../@Namespace" />
    <xsl:text>.</xsl:text>
    <xsl:value-of select="@Name" />
    <xsl:text>":{</xsl:text>
    <xsl:text>"typekind":"</xsl:text>
    <xsl:value-of select="local-name()" />
    <xsl:text>"</xsl:text>
    <xsl:apply-templates select="@*[local-name() != 'Name']|edm:Key" mode="list2" />
    <xsl:apply-templates select="edm:Property" mode="hash" />
    <xsl:apply-templates select="edm:NavigationProperty" mode="hash" />
    <xsl:apply-templates select="edm:Annotation" mode="list2" />
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template match="edm:Property" mode="hashvalue">
    <xsl:choose>
      <!-- TODO: $ref to edm.json instead? -->
      <xsl:when test="@Type = 'Edm.String'">
        <xsl:text>"type":"string"</xsl:text>
        <xsl:apply-templates select="@MaxLength" />
      </xsl:when>
      <xsl:when test="@Type = 'Edm.Boolean'">
        <xsl:text>"type":"boolean"</xsl:text>
      </xsl:when>
      <xsl:when test="@Type = 'Edm.Byte'">
        <xsl:text>"type":"integer","minimum":0,"maximum":255</xsl:text>
      </xsl:when>
      <xsl:when test="@Type = 'Edm.SByte'">
        <xsl:text>"type":"integer","minimum":-128,"maximum":127</xsl:text>
      </xsl:when>
      <xsl:when test="@Type = 'Edm.Int16'">
        <xsl:text>"type":"integer","minimum": −32768,"maximum":32767</xsl:text>
      </xsl:when>
      <xsl:when test="@Type = 'Edm.Int32'">
        <xsl:text>"type":"integer","minimum":-2147483648,"maximum":2147483647</xsl:text>
      </xsl:when>
      <xsl:when test="@Type = 'Edm.Int64'">
        <xsl:text>"type":"integer","minimum":-9223372036854775808,"maximum":9223372036854775807</xsl:text>
      </xsl:when>
      <xsl:when test="@Type = 'Edm.Single'">
        <xsl:text>"type":"number"</xsl:text>
        <!-- TODO: range or odataType, anyOf with enum -INF, INF, NaN, null if nullable -->
      </xsl:when>
      <xsl:when test="@Type = 'Edm.Double'">
        <xsl:text>"type":"number"</xsl:text>
        <!-- TODO: range or odataType -->
      </xsl:when>
      <xsl:when test="@Type = 'Edm.Decimal'">
        <xsl:text>"type":"number"</xsl:text>
        <!-- TODO: Scale, Precision -->
      </xsl:when>
      <!-- TODO: Guid, Date, TimeOfDay, DateTimeOffset, Geo* -->
      <xsl:otherwise>
        <xsl:text>"odataType":"</xsl:text>
        <xsl:value-of select="@Type" />
        <xsl:text>"</xsl:text>
      </xsl:otherwise>
    </xsl:choose>
    <xsl:apply-templates
      select="@*[local-name() != 'Name' and local-name() != 'Type' and local-name() != 'Nullable' and local-name() != 'MaxLength']|*"
      mode="list2" />
  </xsl:template>

  <xsl:template match="edm:Key">
    <xsl:text>"keys":{</xsl:text>
    <xsl:apply-templates select="edm:PropertyRef" mode="list" />
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template match="edm:PropertyRef">
    <xsl:text>"</xsl:text>
    <xsl:choose>
      <xsl:when test="@Alias">
        <xsl:value-of select="@Alias" />
      </xsl:when>
      <xsl:otherwise>
        <xsl:value-of select="@Name" />
      </xsl:otherwise>
    </xsl:choose>
    <xsl:text>":"</xsl:text>
    <xsl:value-of select="@Name" />
    <xsl:text>"</xsl:text>
  </xsl:template>

  <xsl:template match="edm:NavigationProperty" mode="hashvalue">
    <xsl:apply-templates select="@*[local-name() != 'Name']|node()[local-name() != 'ReferentialConstraint']"
      mode="list" />
    <xsl:apply-templates select="edm:ReferentialConstraint" mode="hash">
      <xsl:with-param name="key" select="'Property'" />
    </xsl:apply-templates>
  </xsl:template>

  <xsl:template match="edm:ReferentialConstraint" mode="item">
    <xsl:text>{</xsl:text>
    <xsl:apply-templates select="@*|node()" mode="list" />
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template match="edm:Action|edm:Function" mode="item">
    <xsl:text>{</xsl:text>
    <xsl:apply-templates select="@*" mode="list" />
    <xsl:apply-templates select="edm:Parameter" mode="hash" />
    <xsl:apply-templates select="edm:ReturnType" />
    <xsl:apply-templates select="edm:Annotation" mode="list2" />
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template match="edm:EnumType" mode="hashvalue">
    <xsl:apply-templates select="@*[local-name() != 'Name']" mode="list" />
    <xsl:apply-templates select="edm:Member" mode="hash">
      <xsl:with-param name="after" select="@*[local-name() != 'Name']" />
    </xsl:apply-templates>
    <xsl:apply-templates select="edm:Annotation" mode="list2" />
  </xsl:template>

  <xsl:template match="edm:ReturnType">
    <xsl:text>,"</xsl:text>
    <xsl:call-template name="lowerCamelCase">
      <xsl:with-param name="name" select="local-name()" />
    </xsl:call-template>
    <xsl:text>":{</xsl:text>
    <xsl:apply-templates select="@*|node()" mode="list" />
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template match="edm:Annotations" mode="item">
    <xsl:text>{</xsl:text>
    <xsl:apply-templates select="@*" mode="list" />
    <xsl:apply-templates select="edm:Annotation" mode="list2" />
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template match="edm:EntityContainer">
    <xsl:text>,"entityContainer":{</xsl:text>
    <xsl:apply-templates select="@*" />
    <xsl:apply-templates select="edm:EntitySet" mode="hash" />
    <xsl:apply-templates select="edm:Singleton" mode="hash" />
    <xsl:apply-templates select="edm:ActionImport" mode="hash" />
    <xsl:apply-templates select="edm:FunctionImport" mode="hash" />
    <xsl:apply-templates select="edm:Annotation" mode="list2" />
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template match="edm:EntitySet|edm:Singleton" mode="hashvalue">
    <xsl:apply-templates select="@*[local-name() != 'Name']" />
    <xsl:apply-templates select="edm:NavigationPropertyBinding" mode="hash">
      <xsl:with-param name="key" select="'Path'" />
    </xsl:apply-templates>
    <xsl:apply-templates select="edm:Annotation" mode="list2" />
  </xsl:template>

  <xsl:template match="edm:Property/@MaxLength">
    <xsl:if test=". != 'max'">
      <xsl:text>,"maxLength":</xsl:text>
      <xsl:value-of select="." />
    </xsl:if>
  </xsl:template>

  <!-- name : unquoted value -->
  <xsl:template
    match="@Nullable|@HasStream|@OpenType|@ContainsTarget|@IsFlags|@IsBound|@IsComposable|@Abstract|@IncludeInServiceDocument|@Unicode|@Bool|@Decimal|@Int|edm:Bool|edm:Decimal|edm:Int"
  >
    <xsl:text>"</xsl:text>
    <xsl:call-template name="lowerCamelCase">
      <xsl:with-param name="name" select="local-name()" />
    </xsl:call-template>
    <xsl:text>":</xsl:text>
    <xsl:value-of select="." />
  </xsl:template>

  <!-- name : quoted or unquoted float value -->
  <xsl:template match="@Float|edm:Float">
    <xsl:text>"</xsl:text>
    <xsl:call-template name="lowerCamelCase">
      <xsl:with-param name="name" select="local-name()" />
    </xsl:call-template>
    <xsl:text>":</xsl:text>
    <xsl:choose>
      <xsl:when test=". = 'INF' or . = '-INF' or . = 'NaN'">
        <xsl:text>"</xsl:text>
        <xsl:value-of select="." />
        <xsl:text>"</xsl:text>
      </xsl:when>
      <xsl:otherwise>
        <xsl:value-of select="." />
      </xsl:otherwise>
    </xsl:choose>
  </xsl:template>

  <!-- name : escaped string value -->
  <xsl:template match="@String|edm:String">
    <xsl:text>"</xsl:text>
    <xsl:call-template name="lowerCamelCase">
      <xsl:with-param name="name" select="local-name()" />
    </xsl:call-template>
    <xsl:text>":"</xsl:text>
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
      <xsl:when test="contains($string,'/')">
        <xsl:call-template name="replace">
          <xsl:with-param name="string" select="$string" />
          <xsl:with-param name="old" select="'/'" />
          <xsl:with-param name="new" select="'\/'" />
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
    <xsl:text>"record":{</xsl:text>
    <xsl:if test="@Type">
      <xsl:text>"@odata.type":"</xsl:text>
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
    <xsl:text>":{</xsl:text>
    <xsl:apply-templates select="@*[local-name() != 'Property']|node()" mode="list" />
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template match="edm:Collection|edm:If|edm:Eq|edm:Ne|edm:Ge|edm:Gt|edm:Le|edm:Lt|edm:And|edm:Or">
    <xsl:text>"</xsl:text>
    <xsl:call-template name="lowerCamelCase">
      <xsl:with-param name="name" select="local-name()" />
    </xsl:call-template>
    <xsl:text>":[</xsl:text>
    <xsl:apply-templates select="*[local-name() != 'Annotation']" mode="object" />
    <xsl:text>]</xsl:text>
    <xsl:apply-templates select="edm:Annotation" mode="list2">
      <xsl:with-param name="target">
        <xsl:call-template name="lowerCamelCase">
          <xsl:with-param name="name" select="local-name()" />
        </xsl:call-template>
      </xsl:with-param>
    </xsl:apply-templates>
  </xsl:template>

  <xsl:template match="edm:Apply">
    <xsl:text>"apply":{</xsl:text>
    <xsl:apply-templates select="@*" />
    <xsl:text>,"values":[</xsl:text>
    <xsl:apply-templates select="*[local-name() != 'Annotation']" mode="object" />
    <xsl:text>]</xsl:text>
    <xsl:apply-templates select="edm:Annotation" mode="list2" />
    <xsl:text>}</xsl:text>
  </xsl:template>

  <!-- name : array -->
  <xsl:template match="*" mode="array">
    <xsl:param name="after" select="'something'" />
    <xsl:if test="position() = 1">
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
    <xsl:if test="position() != last()">
      <xsl:text>,</xsl:text>
    </xsl:if>
    <xsl:if test="position() = last()">
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
    <xsl:param name="key" select="'Name'" />
    <xsl:param name="after" select="'something'" />
    <xsl:if test="position() = 1">
      <xsl:if test="$after">
        <xsl:text>,</xsl:text>
      </xsl:if>
      <xsl:text>"</xsl:text>
      <xsl:call-template name="pluralize">
        <xsl:with-param name="name" select="local-name()" />
      </xsl:call-template>
      <xsl:text>":{</xsl:text>
    </xsl:if>
    <xsl:apply-templates select="." mode="hashpair">
      <xsl:with-param name="key" select="$key" />
    </xsl:apply-templates>
    <xsl:if test="position() != last()">
      <xsl:text>,</xsl:text>
    </xsl:if>
    <xsl:if test="position() = last()">
      <xsl:text>}</xsl:text>
    </xsl:if>
  </xsl:template>

  <xsl:template match="*" mode="hashpair">
    <xsl:param name="key" select="'Name'" />
    <xsl:text>"</xsl:text>
    <xsl:value-of select="@*[local-name() = $key]" />
    <xsl:text>":{</xsl:text>
    <xsl:apply-templates select="." mode="hashvalue">
      <xsl:with-param name="key" select="$key" />
    </xsl:apply-templates>
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template match="*" mode="hashvalue">
    <xsl:param name="key" select="'Name'" />
    <xsl:apply-templates select="@*[local-name() != $key]|node()" mode="list" />
  </xsl:template>

  <xsl:template match="*" mode="object">
    <xsl:if test="position() != 1">
      <xsl:text>,</xsl:text>
    </xsl:if>
    <xsl:text>{</xsl:text>
    <xsl:apply-templates select="." />
    <xsl:text>}</xsl:text>
  </xsl:template>

  <!-- comma-separated list -->
  <xsl:template match="@*|*" mode="list">
    <xsl:param name="after" />
    <xsl:choose>
      <xsl:when test="position() > 1">
        <xsl:text>,</xsl:text>
      </xsl:when>
      <xsl:when test="$after">
        <xsl:text>,</xsl:text>
      </xsl:when>
    </xsl:choose>
    <xsl:apply-templates select="." />
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
      <xsl:when test="$name = 'Annotations'">
        <xsl:text>annotations</xsl:text>
      </xsl:when>
      <xsl:when test="$name = 'IncludeAnnotations'">
        <xsl:text>includeAnnotations</xsl:text>
      </xsl:when>
      <xsl:when test="$name = 'NavigationProperty'">
        <xsl:text>navigationProperties</xsl:text>
      </xsl:when>
      <xsl:when test="$name = 'Property'">
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
      <xsl:when test="$name = 'SRID'">
        <xsl:text>SRID</xsl:text>
      </xsl:when>
      <xsl:otherwise>
        <xsl:value-of select="translate(substring($name,1,1),'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz')" />
        <xsl:value-of select="substring($name,2)" />
      </xsl:otherwise>
    </xsl:choose>
  </xsl:template>

</xsl:stylesheet>