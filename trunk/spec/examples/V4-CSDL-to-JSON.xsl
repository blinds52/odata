<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:edmx="http://docs.oasis-open.org/odata/ns/edmx"
  xmlns:edm="http://docs.oasis-open.org/odata/ns/edm" xmlns:json="http://json.org/"
>
  <!--
    This style sheet transforms OData 4.0 CSDL documents into an experimental JSON metadata format.

    - The Edmx root element becomes a JSON object
    - Attributes become name-value pairs with the attribute name and the attribute value as a string
    - Single-occurrence child elements become name-value pairs with the element name and an object value
    - Multi-occurrence child elements become name-values pair with the element name and an array of objects
    - Annotation elements become JSON payload annotations with @Term#Qualifier name and an object value
    - Tagging annotations get an object that is empty except for nested annotations
    - Annotation expressions become objects containing a name-value pair with the expression name
    - Bool, Decimal, and Int get an unquoted value
    - Other constant expressions and dynamic expressions with attribute notation or a text body get a string value
    - Null gets an empty object
    - Collections get an array with one object per nested expression
    - Record gets an object with one name-value pair per PropertyValue, the name is the property, the value the expression
    - Other dynamic expressions get an object value
    - Logical expressions get an array with one object per nested expression
    - Annotations nested within logical expressions are placed next to the expression using form expr@Term#Qualifier
  -->

  <xsl:output method="text" indent="yes" encoding="UTF-8" omit-xml-declaration="yes" />
  <xsl:strip-space elements="*" />

  <xsl:template match="edmx:Edmx">
    <xsl:text>{"@odata.context":"$metadata",</xsl:text>
    <xsl:apply-templates select="@*" />
    <xsl:apply-templates select="edmx:Reference" mode="array" />
    <xsl:apply-templates select="edmx:DataServices" />
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template match="edmx:Reference" mode="item">
    <xsl:text>{</xsl:text>
    <xsl:apply-templates select="@*" />
    <xsl:apply-templates select="edmx:Include" mode="array" />
    <xsl:apply-templates select="edmx:IncludeAnnotations" mode="array" />
    <xsl:apply-templates select="edm:Annotation" mode="array" />
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template match="edmx:DataServices">
    <xsl:apply-templates select="edm:Schema" mode="array" />
  </xsl:template>

  <xsl:template match="edm:Schema" mode="item">
    <xsl:text>{</xsl:text>
    <xsl:apply-templates select="@*" />
    <xsl:apply-templates select="edm:Annotation" mode="array" />
    <xsl:apply-templates select="edm:EntityType" mode="array" />
    <xsl:apply-templates select="edm:ComplexType" mode="array" />
    <xsl:apply-templates select="edm:EnumType" mode="array" />
    <xsl:apply-templates select="edm:TypeDefinition" mode="array" />
    <xsl:apply-templates select="edm:Action" mode="array" />
    <xsl:apply-templates select="edm:Function" mode="array" />
    <xsl:apply-templates select="edm:Term" mode="array" />
    <xsl:apply-templates select="edm:EntityContainer" mode="array" />
    <xsl:apply-templates select="edm:Annotations" mode="array" />
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template match="edm:EntityType|edm:ComplexType" mode="item">
    <xsl:text>{</xsl:text>
    <xsl:apply-templates select="@*|edm:Key" />
    <xsl:apply-templates select="edm:Property" mode="array" />
    <xsl:apply-templates select="edm:NavigationProperty" mode="array" />
    <xsl:apply-templates select="edm:Annotation" mode="array" />
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template match="edm:Key">
    <xsl:text>,"Key":[</xsl:text>
    <xsl:apply-templates select="edm:PropertyRef" />
    <xsl:text>]</xsl:text>
  </xsl:template>

  <xsl:template match="edm:PropertyRef">
    <xsl:if test="position() != 1">
      <xsl:text>,</xsl:text>
    </xsl:if>
    <xsl:text>{"PropertyRef":"</xsl:text>
    <xsl:value-of select="@Name" />
    <xsl:if test="@Alias">
      <xsl:text>","Alias":"</xsl:text>
      <xsl:value-of select="@Alias" />
    </xsl:if>
    <xsl:text>"}</xsl:text>
  </xsl:template>

  <xsl:template match="edm:NavigationProperty" mode="item">
    <xsl:text>{</xsl:text>
    <xsl:apply-templates select="@*|edm:OnDelete" />
    <xsl:apply-templates select="edm:ReferentialConstraint" mode="array" />
    <xsl:apply-templates select="edm:Annotation" mode="array" />
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template match="edm:OnDelete|edm:ReturnType">
    <xsl:text>,"</xsl:text>
    <xsl:value-of select="local-name()" />
    <xsl:text>":{</xsl:text>
    <xsl:apply-templates select="@*" />
    <xsl:apply-templates select="edm:Annotation" mode="array" />
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template match="edm:Action|edm:Function" mode="item">
    <xsl:text>{</xsl:text>
    <xsl:apply-templates select="@*" />
    <xsl:apply-templates select="edm:Parameter" mode="array" />
    <xsl:apply-templates select="edm:ReturnType" />
    <xsl:apply-templates select="edm:Annotation" mode="array" />
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template match="edm:EnumType" mode="item">
    <xsl:text>{</xsl:text>
    <xsl:apply-templates select="@*" />
    <xsl:apply-templates select="edm:Member" mode="array" />
    <xsl:apply-templates select="edm:Annotation" mode="array" />
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template
    match="edm:TypeDefinition|edm:Term|edm:Member|edm:Property|edm:ActionImport|edm:FunctionImport|edm:NavigationPropertyBinding|edm:ReferentialConstraint"
    mode="item"
  >
    <xsl:text>{</xsl:text>
    <xsl:apply-templates select="@*" />
    <xsl:apply-templates select="edm:Annotation" mode="array" />
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template match="edm:Annotations" mode="item">
    <xsl:text>{</xsl:text>
    <xsl:apply-templates select="@*" />
    <xsl:apply-templates select="edm:Annotation" mode="array" />
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template match="edm:EntityContainer" mode="item">
    <xsl:text>{</xsl:text>
    <xsl:apply-templates select="@*" />
    <xsl:apply-templates select="edm:EntitySet" mode="array" />
    <xsl:apply-templates select="edm:Singleton" mode="array" />
    <xsl:apply-templates select="edm:ActionImport" mode="array" />
    <xsl:apply-templates select="edm:FunctionImport" mode="array" />
    <xsl:apply-templates select="edm:Annotation" mode="array" />
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template match="edm:EntitySet|edm:Singleton" mode="item">
    <xsl:text>{</xsl:text>
    <xsl:apply-templates select="@*" />
    <xsl:apply-templates select="edm:NavigationPropertyBinding" mode="array" />
    <xsl:apply-templates select="edm:Annotation" mode="array" />
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template match="edm:Annotation" mode="array">
    <xsl:param name="first" select="'false'" />
    <xsl:param name="target" />
    <xsl:if test="$first">
      <!-- parameter has been specified without value - quite confusing to read :-) -->
      <xsl:text>,</xsl:text>
    </xsl:if>
    <xsl:text>"</xsl:text>
    <xsl:value-of select="$target" />
    <xsl:text>@</xsl:text>
    <xsl:value-of select="@Term" />
    <xsl:if test="@Qualifier">
      <xsl:text>#</xsl:text>
      <xsl:value-of select="@Qualifier" />
    </xsl:if>
    <xsl:text>":{</xsl:text>
    <xsl:apply-templates select="@*[name() != 'Term' and name() != 'Qualifier']|node()[local-name() != 'Annotation']"
      mode="list" />
    <xsl:apply-templates select="edm:Annotation" mode="array" />
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template match="@*|*" mode="list">
    <xsl:if test="position() != 1">
      <xsl:text>,</xsl:text>
    </xsl:if>
    <xsl:apply-templates select="." />
  </xsl:template>

  <!-- name : unquoted constant value -->
  <xsl:template match="@Bool|@Decimal|@Int|edm:Bool|edm:Decimal|edm:Int">
    <xsl:text>"</xsl:text>
    <xsl:value-of select="name()" />
    <xsl:text>":</xsl:text>
    <xsl:value-of select="." />
  </xsl:template>

  <!-- name : quoted constant value -->
  <xsl:template
    match="edm:Binary|edm:Date|edm:DateTimeOffset|edm:EnumMember|edm:Guid|edm:String|edm:TimeOfDay|edm:AnnotationPath|edm:NavigationPropertyPath|edm:LabeledElementReference|edm:Path|edm:PropertyPath"
  >
    <xsl:text>"</xsl:text>
    <xsl:value-of select="name()" />
    <xsl:text>":"</xsl:text>
    <xsl:value-of select="." />
    <xsl:text>"</xsl:text>
  </xsl:template>

  <!-- name : quoted or unquoted float value -->
  <xsl:template match="@Float|edm:Float">
    <xsl:text>"</xsl:text>
    <xsl:value-of select="name()" />
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
    <xsl:value-of select="name()" />
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


  <xsl:template match="edm:Null">
    <xsl:text>"Null":{</xsl:text>
    <xsl:apply-templates select="edm:Annotation" mode="array">
      <xsl:with-param name="first" />
    </xsl:apply-templates>
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template match="edm:Record">
    <xsl:text>"Record":{</xsl:text>
    <xsl:if test="@Type">
      <xsl:text>"@odata.type":"</xsl:text>
      <xsl:value-of select="@Type" />
      <xsl:text>",</xsl:text>
    </xsl:if>
    <xsl:apply-templates select="edm:PropertyValue" mode="list" />
    <xsl:apply-templates select="edm:Annotation" mode="array" />
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template match="edm:PropertyValue">
    <xsl:text>"</xsl:text>
    <xsl:value-of select="@Property" />
    <xsl:text>":{</xsl:text>
    <xsl:apply-templates select="@*[name() != 'Property']|node()[local-name() != 'Annotation']" />
    <xsl:apply-templates select="edm:Annotation" mode="array" />
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template match="edm:Collection|edm:If|edm:Eq|edm:Ne|edm:Ge|edm:Gt|edm:Le|edm:Lt|edm:And|edm:Or">
    <xsl:text>"</xsl:text>
    <xsl:value-of select="local-name()" />
    <xsl:text>":[</xsl:text>
    <xsl:apply-templates select="*[local-name() != 'Annotation']" mode="object" />
    <xsl:text>]</xsl:text>
    <xsl:apply-templates select="edm:Annotation" mode="array">
      <xsl:with-param name="target" select="local-name()" />
    </xsl:apply-templates>
  </xsl:template>

  <xsl:template match="*" mode="object">
    <xsl:if test="position() != 1">
      <xsl:text>,</xsl:text>
    </xsl:if>
    <xsl:text>{</xsl:text>
    <xsl:apply-templates select="." />
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template match="edm:Apply">
    <xsl:text>"Apply":{</xsl:text>
    <xsl:apply-templates select="@*" />
    <xsl:text>,"Values":[</xsl:text>
    <xsl:apply-templates select="*[local-name() != 'Annotation']" mode="object" />
    <xsl:text>]</xsl:text>
    <xsl:apply-templates select="edm:Annotation" mode="array" />
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template match="edm:Cast|edm:IsOf|edm:LabeledElement">
    <xsl:text>"</xsl:text>
    <xsl:value-of select="local-name()" />
    <xsl:text>":{</xsl:text>
    <xsl:apply-templates select="@*|*[local-name() != 'Annotation']" mode="list" />
    <xsl:apply-templates select="edm:Annotation" mode="array" />
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template match="edm:Not|edm:UrlRef">
    <xsl:text>"</xsl:text>
    <xsl:value-of select="local-name()" />
    <xsl:text>":{</xsl:text>
    <xsl:apply-templates select="*[local-name() != 'Annotation']" mode="list" />
    <xsl:apply-templates select="edm:Annotation" mode="array" />
    <xsl:text>}</xsl:text>
  </xsl:template>

  <!-- name : array -->
  <xsl:template match="*" mode="array">
    <xsl:if test="position() = 1">
      <xsl:text>,"</xsl:text>
      <xsl:value-of select="local-name()" />
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
    <xsl:apply-templates select="@*|node()" />
    <xsl:text>}</xsl:text>
  </xsl:template>

  <!-- name : value -->
  <xsl:template match="@*">
    <xsl:if test="position() != 1">
      <xsl:text>,</xsl:text>
    </xsl:if>
    <xsl:text>"</xsl:text>
    <xsl:value-of select="name()" />
    <xsl:text>":"</xsl:text>
    <xsl:value-of select="." />
    <xsl:text>"</xsl:text>
  </xsl:template>

  <!-- leftover element -->
  <xsl:template match="*">
    <xsl:if test="position() != 1">
      <xsl:text>,</xsl:text>
    </xsl:if>
    <xsl:text>"TODO:</xsl:text>
    <xsl:value-of select="name()" />
    <xsl:text>":{</xsl:text>
    <xsl:apply-templates select="@*|node()" />
    <xsl:text>}</xsl:text>
  </xsl:template>

  <!-- leftover text -->
  <xsl:template match="text()">
    <xsl:text>"TODO:text()":"</xsl:text>
    <xsl:value-of select="." />
    <xsl:text>"</xsl:text>
  </xsl:template>

</xsl:stylesheet>