<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:edmx="http://docs.oasis-open.org/odata/ns/edmx"
  xmlns:edm="http://docs.oasis-open.org/odata/ns/edm" xmlns:json="http://json.org/"
>
  <!--
    This style sheet transforms OData 4.0 XML CSDL documents into Swagger JSON.

    TODO:
    - Multi-part keys
    - FunctionImports
    - ActionImports
    - Bound Functions on top-level entities
    - Bound Actions on top-level entities
    - Singletons
    - 200 response for PATCH
    - If-Match for PATCH
    - summary/title and description from @Core.(Long)Description (or Common.Label->title, Core.Description->description)
    - verbose allOf to please Swagger-UI -> check with JSON Schema, create GitHub issue
    - security/authentication
  -->

  <xsl:import href="V4-CSDL-to-JSONSchema.xsl" />

  <xsl:output method="text" indent="yes" encoding="UTF-8" omit-xml-declaration="yes" />
  <xsl:strip-space elements="*" />

  <xsl:param name="scheme" select="'http'" />
  <xsl:param name="host" select="'localhost'" />
  <xsl:param name="basePath" select="'/service-root'" />
  <!--
    <xsl:param name="metadata" select="'$metadata'" />
  -->
  <xsl:variable name="metadata" select="''" />

  <xsl:template match="edmx:Edmx">
    <xsl:text>{"swagger":"2.0"</xsl:text>
    <xsl:text>,"info":{"title":"</xsl:text>
    <xsl:variable name="title"
      select="edmx:DataServices/edm:Schema/edm:EntityContainer/edm:Annotation[@Term='Org.OData.Core.V1.Description']/@String" />
    <xsl:choose>
      <xsl:when test="$title">
        <xsl:value-of select="$title"></xsl:value-of>
      </xsl:when>
      <xsl:otherwise>
        <xsl:text>OData Service</xsl:text>
      </xsl:otherwise>
    </xsl:choose>
    <xsl:text>","description":"</xsl:text>
    <xsl:variable name="description"
      select="edmx:DataServices/edm:Schema/edm:EntityContainer/edm:Annotation[@Term='Org.OData.Core.V1.LongDescription']/@String" />
    <xsl:choose>
      <xsl:when test="$description">
        <xsl:value-of select="$description"></xsl:value-of>
      </xsl:when>
      <xsl:otherwise>
        <xsl:text>The OData Service at </xsl:text>
        <xsl:value-of select="$scheme"></xsl:value-of>
        <xsl:text>://</xsl:text>
        <xsl:value-of select="$host"></xsl:value-of>
        <xsl:value-of select="$basePath"></xsl:value-of>
      </xsl:otherwise>
    </xsl:choose>
    <!-- TODO: version -->
    <xsl:text>","version":"0.1.0","x-odata-version":"4.0"}</xsl:text>
    <xsl:text>,"host":"</xsl:text>
    <xsl:value-of select="$host" />
    <xsl:text>"</xsl:text>
    <xsl:text>,"schemes":["</xsl:text>
    <xsl:value-of select="$scheme"></xsl:value-of>
    <xsl:text>"],"basePath":"</xsl:text>
    <xsl:value-of select="$basePath" />
    <xsl:text>"</xsl:text>
    <!-- TODO: Capabilities.SupportedFormats -->
    <xsl:text>,"consumes":["application/json"]</xsl:text>
    <xsl:text>,"produces":["application/json"]</xsl:text>
    <xsl:apply-templates select="edmx:DataServices/edm:Schema" />
    <xsl:text>,"parameters":{"expand":{"name":"$expand","in":"query","description":"expand navigation property","type":"string"},"select":{"name":"$select","in":"query","description":"select structural property","type":"string"},"orderby":{"name":"$orderby","in":"query","description":"order by some property","type":"string"},"top":{"name":"$top","in":"query","description":"top elements","type":"integer"},"skip":{"name":"$skip","in":"query","description":"skip elements","type":"integer"},"count":{"name":"$count","in":"query","description":"include count in response","type":"boolean"}}</xsl:text>
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template match="edm:Schema">
    <xsl:text>,"paths":{</xsl:text>
    <xsl:apply-templates
      select="edm:EntityContainer/edm:EntitySet|edm:EntityContainer/edm:FunctionImport|edm:EntityContainer/edm:ActionImport"
      mode="list" />
    <xsl:text>}</xsl:text>

    <xsl:apply-templates select="edm:EntityType|edm:ComplexType|edm:TypeDefinition|edm:EnumType"
      mode="hash"
    >
      <xsl:with-param name="name" select="'definitions'" />
      <xsl:with-param name="constantProperties">
        <xsl:text>,"_Error":{"properties":{"error":{"$ref":"#/definitions/_InError"}}},"_InError":{"properties":{"code":{"type":"string"},"message":{"type":"string"}}}</xsl:text>
      </xsl:with-param>
    </xsl:apply-templates>

  </xsl:template>

  <xsl:template match="edm:EntitySet">
    <xsl:apply-templates select="." mode="entitySet" />
    <xsl:apply-templates select="." mode="entity" />
  </xsl:template>

  <xsl:template match="edm:EntitySet" mode="entitySet">
    <xsl:variable name="qualifier">
      <xsl:call-template name="substring-before-last">
        <xsl:with-param name="input" select="@EntityType" />
        <xsl:with-param name="marker" select="'.'" />
      </xsl:call-template>
    </xsl:variable>
    <xsl:variable name="namespace">
      <xsl:choose>
        <xsl:when test="//edm:Schema[@Alias=$qualifier]">
          <xsl:value-of select="//edm:Schema[@Alias=$qualifier]/@Namespace" />
        </xsl:when>
        <xsl:otherwise>
          <xsl:value-of select="$qualifier" />
        </xsl:otherwise>
      </xsl:choose>
    </xsl:variable>
    <xsl:variable name="type">
      <xsl:call-template name="substring-after-last">
        <xsl:with-param name="input" select="@EntityType" />
        <xsl:with-param name="marker" select="'.'" />
      </xsl:call-template>
    </xsl:variable>
    <xsl:variable name="qualifiedType">
      <xsl:value-of select="$namespace" />
      <xsl:text>.</xsl:text>
      <xsl:value-of select="$type" />
    </xsl:variable>

    <xsl:text>"/</xsl:text>
    <xsl:value-of select="@Name" />
    <xsl:text>":{</xsl:text>

    <!-- GET -->
    <xsl:text>"get":{</xsl:text>
    <xsl:text>"summary":"Get entities from entity set </xsl:text>
    <xsl:value-of select="@Name" />
    <xsl:text>","description":"Entity type </xsl:text>
    <xsl:value-of select="@EntityType" />
    <xsl:text>","tags":["</xsl:text>
    <xsl:value-of select="@Name" />
    <xsl:text>"]</xsl:text>
    <!-- TODO: reference parameters instead of repeating it, unless we want to provide default values for e.g. $expand -->
    <xsl:text>,"parameters":[{"$ref":"#/parameters/expand"},{"$ref":"#/parameters/select"},{"$ref":"#/parameters/orderby"},{"$ref":"#/parameters/top"},{"$ref":"#/parameters/skip"},{"$ref":"#/parameters/count"}]</xsl:text>
    <xsl:text>,"responses":{"200":{"description":"EntitySet </xsl:text>
    <xsl:value-of select="@Name" />
    <xsl:text>","schema":{"type":"object","properties":{"value":{"type":"array","items":{"$ref":"</xsl:text>
    <xsl:value-of select="$metadata" />
    <xsl:text>#/definitions/</xsl:text>
    <xsl:value-of select="$qualifiedType" />
    <xsl:text>"}}}}},"default":{"description":"Unexpected error","schema":{"$ref":"#/definitions/_Error"}}}</xsl:text>
    <xsl:text>}</xsl:text>

    <!-- POST -->
    <xsl:text>,"post":{</xsl:text>
    <xsl:text>"summary":"Post a new entity to entity set </xsl:text>
    <xsl:value-of select="@Name" />
    <xsl:text>","description":"Entity type </xsl:text>
    <xsl:value-of select="@EntityType" />
    <xsl:text>","tags":["</xsl:text>
    <xsl:value-of select="@Name" />
    <xsl:text>"]</xsl:text>
    <xsl:text>,"parameters":[{"name":"</xsl:text>
    <xsl:value-of select="$type" />
    <xsl:text>","in":"body","description":"The entity to post","schema":{"$ref":"</xsl:text>
    <xsl:value-of select="$metadata" />
    <xsl:text>#/definitions/</xsl:text>
    <xsl:value-of select="$qualifiedType" />
    <xsl:text>"}}]</xsl:text>
    <!-- TODO: responses -->
    <xsl:text>,"responses":{"201":{"description":"Created entity","schema":{"$ref":"</xsl:text>
    <xsl:value-of select="$metadata" />
    <xsl:text>#/definitions/</xsl:text>
    <xsl:value-of select="$qualifiedType" />
    <xsl:text>"}},"default":{"description":"Unexpected error","schema":{"$ref":"#/definitions/_Error"}}}</xsl:text>
    <xsl:text>}</xsl:text>

    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template match="edm:EntitySet" mode="entity">
    <xsl:variable name="qualifier">
      <xsl:call-template name="substring-before-last">
        <xsl:with-param name="input" select="@EntityType" />
        <xsl:with-param name="marker" select="'.'" />
      </xsl:call-template>
    </xsl:variable>
    <xsl:variable name="namespace">
      <xsl:choose>
        <xsl:when test="//edm:Schema[@Alias=$qualifier]">
          <xsl:value-of select="//edm:Schema[@Alias=$qualifier]/@Namespace" />
        </xsl:when>
        <xsl:otherwise>
          <xsl:value-of select="$qualifier" />
        </xsl:otherwise>
      </xsl:choose>
    </xsl:variable>
    <xsl:variable name="type">
      <xsl:call-template name="substring-after-last">
        <xsl:with-param name="input" select="@EntityType" />
        <xsl:with-param name="marker" select="'.'" />
      </xsl:call-template>
    </xsl:variable>
    <xsl:variable name="qualifiedType">
      <xsl:value-of select="$namespace" />
      <xsl:text>.</xsl:text>
      <xsl:value-of select="$type" />
    </xsl:variable>
    <xsl:variable name="aliasQualifiedType">
      <xsl:value-of select="//edm:Schema[@Namespace=$namespace]/@Alias" />
      <xsl:text>.</xsl:text>
      <xsl:value-of select="$type" />
    </xsl:variable>

    <!-- entity path template -->
    <xsl:text>,"/</xsl:text>
    <xsl:value-of select="@Name" />
    <xsl:text>(</xsl:text>
    <xsl:apply-templates select="//edm:Schema[@Namespace=$namespace]/edm:EntityType[@Name=$type]/edm:Key/edm:PropertyRef"
      mode="path" />
    <xsl:text>)":{</xsl:text>

    <!-- GET -->
    <xsl:text>"get":{</xsl:text>
    <xsl:text>"summary":"Get entity from </xsl:text>
    <xsl:value-of select="@Name" />
    <xsl:text> by key.","description":"Returns the entity with the key from </xsl:text>
    <xsl:value-of select="@Name" />
    <xsl:text>","tags":["</xsl:text>
    <xsl:value-of select="@Name" />
    <xsl:text>"]</xsl:text>
    <xsl:text>,"parameters":[</xsl:text>
    <xsl:apply-templates select="//edm:Schema[@Namespace=$namespace]/edm:EntityType[@Name=$type]/edm:Key/edm:PropertyRef"
      mode="parameter" />
    <xsl:text>,{"$ref":"#/parameters/expand"},{"$ref":"#/parameters/select"}],"responses":{"200":{"description":"EntitySet </xsl:text>
    <xsl:value-of select="@Name" />
    <!-- TODO: variable for schema URL or use local definitions -->
    <xsl:text>","schema":{"$ref":"</xsl:text>
    <xsl:value-of select="$metadata" />
    <xsl:text>#/definitions/</xsl:text>
    <xsl:value-of select="$qualifiedType" />
    <xsl:text>"}},"default":{"description":"Unexpected error","schema":{"$ref":"#/definitions/_Error"}}}</xsl:text>
    <xsl:text>}</xsl:text>

    <!-- PATCH -->
    <xsl:text>,"patch":{</xsl:text>
    <xsl:text>"summary":"Update entity in EntitySet </xsl:text>
    <xsl:value-of select="@Name" />
    <xsl:text>","description":"Update entity in EntitySet </xsl:text>
    <xsl:value-of select="@Name" />
    <xsl:text>","tags":["</xsl:text>
    <xsl:value-of select="@Name" />
    <xsl:text>"]</xsl:text>
    <xsl:text>,"parameters":[</xsl:text>
    <xsl:apply-templates select="//edm:Schema[@Namespace=$namespace]/edm:EntityType[@Name=$type]/edm:Key/edm:PropertyRef"
      mode="parameter" />
    <xsl:text>,{"name":"</xsl:text>
    <xsl:value-of select="$type" />
    <xsl:text>","in":"body","description":"The entity to patch","schema":{"$ref":"</xsl:text>
    <xsl:value-of select="$metadata" />
    <xsl:text>#/definitions/</xsl:text>
    <xsl:value-of select="$qualifiedType" />
    <xsl:text>"}}],"responses":{"204":{"description":"Empty response"},"default":{"description":"Unexpected error","schema":{"$ref":"#/definitions/_Error"}}}</xsl:text>
    <xsl:text>}</xsl:text>

    <!-- DELETE -->
    <xsl:text>,"delete":{</xsl:text>
    <xsl:text>"summary":"Delete entity in EntitySet </xsl:text>
    <xsl:value-of select="@Name" />
    <xsl:text>","description":"Delete entity in EntitySet </xsl:text>
    <xsl:value-of select="@Name" />
    <xsl:text>","tags":["</xsl:text>
    <xsl:value-of select="@Name" />
    <xsl:text>"]</xsl:text>
    <xsl:text>,"parameters":[</xsl:text>
    <xsl:apply-templates select="//edm:Schema[@Namespace=$namespace]/edm:EntityType[@Name=$type]/edm:Key/edm:PropertyRef"
      mode="parameter" />
    <xsl:text>,{"name":"If-Match","in":"header","description":"If-Match header","type":"string"}]</xsl:text>
    <xsl:text>,"responses":{"204":{"description":"Empty response"},"default":{"description":"Unexpected error","schema":{"$ref":"#/definitions/_Error"}}}</xsl:text>
    <xsl:text>}</xsl:text>

    <xsl:text>}</xsl:text>

    <xsl:apply-templates
      select="//edm:Function[@IsBound='true' and (edm:Parameter[1]/@Type=$qualifiedType or edm:Parameter[1]/@Type=$aliasQualifiedType)]"
      mode="entity"
    >
      <xsl:with-param name="entitySet" select="@Name" />
      <xsl:with-param name="namespace" select="$namespace" />
      <xsl:with-param name="type" select="$type" />
    </xsl:apply-templates>
    <xsl:apply-templates
      select="//edm:Action[@IsBound='true' and (edm:Parameter[1]/@Type=$qualifiedType or edm:Parameter[1]/@Type=$aliasQualifiedType)]"
      mode="entity"
    >
      <xsl:with-param name="entitySet" select="@Name" />
      <xsl:with-param name="namespace" select="$namespace" />
      <xsl:with-param name="type" select="$type" />
    </xsl:apply-templates>
  </xsl:template>

  <xsl:template match="edm:PropertyRef" mode="path">
    <xsl:variable name="name" select="@Name" />
    <xsl:variable name="type" select="../../edm:Property[@Name=$name]/@Type" />
    <!-- TODO: inheritance - maybe XSLT isn't the best choice for this -->
    <!-- TODO: handling of more than one key: name={@Name}, comma before all but first -->
    <xsl:choose>
      <xsl:when test="$type='Edm.Int64'" />
      <!-- TODO: handle other Edm types, enumeration types, and type definitions -->
      <xsl:otherwise>
        <xsl:text>'</xsl:text>
      </xsl:otherwise>
    </xsl:choose>
    <xsl:text>{</xsl:text>
    <xsl:value-of select="@Name" />
    <xsl:text>}</xsl:text>
    <xsl:choose>
      <xsl:when test="$type='Edm.Int64'" />
      <!-- TODO: handle other Edm types, enumeration types, and type definitions -->
      <xsl:otherwise>
        <xsl:text>'</xsl:text>
      </xsl:otherwise>
    </xsl:choose>
  </xsl:template>

  <xsl:template match="edm:PropertyRef" mode="parameter">
    <xsl:variable name="name" select="@Name" />
    <xsl:variable name="type" select="../../edm:Property[@Name=$name]/@Type" />
    <!-- TODO: inheritance - maybe XSLT isn't the best choice for this -->
    <xsl:if test="position()!=1">
      <xsl:text>,</xsl:text>
    </xsl:if>
    <xsl:text>{"name":"</xsl:text>
    <xsl:value-of select="@Name" />
    <xsl:text>","in":"path","required":true,"description":"key: </xsl:text>
    <xsl:value-of select="@Name" />
    <xsl:text>","type":</xsl:text>
    <xsl:choose>
      <xsl:when test="$type='Edm.Int64'">
        <xsl:text>"integer","format":"int64"</xsl:text>
      </xsl:when>
      <xsl:when test="$type='Edm.Int32'">
        <xsl:text>"integer","format":"int32"</xsl:text>
      </xsl:when>
      <!-- TODO: handle other Edm types, enumeration types, and type definitions -->
      <xsl:otherwise>
        <xsl:text>"string"</xsl:text>
      </xsl:otherwise>
    </xsl:choose>
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template match="edm:ActionImport">
    <xsl:text>"/</xsl:text>
    <xsl:value-of select="@Name" />
    <xsl:text>":{</xsl:text>
    <!-- TODO: POST -->
    <!-- TODO: action parameter body -->
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template match="edm:FunctionImport">
    <xsl:text>"/</xsl:text>
    <xsl:value-of select="@Name" />
    <!-- TODO; function parameters in path -->
    <xsl:text>":{</xsl:text>
    <!-- TODO: GET -->
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template match="edm:Action" mode="entity">
    <xsl:param name="entitySet" />
    <xsl:param name="namespace" />
    <xsl:param name="type" />
    <xsl:text>,"/</xsl:text>
    <xsl:value-of select="$entitySet" />
    <xsl:text>(</xsl:text>
    <xsl:apply-templates select="//edm:Schema[@Namespace=$namespace]/edm:EntityType[@Name=$type]/edm:Key/edm:PropertyRef"
      mode="path" />
    <xsl:text>)/</xsl:text>
    <xsl:value-of select="../@Namespace" />
    <xsl:text>.</xsl:text>
    <xsl:value-of select="@Name" />
    <xsl:text>":{"post":{"summary":"Invoke action </xsl:text>
    <xsl:value-of select="@Name" />
    <xsl:text>","tags":["</xsl:text>
    <xsl:value-of select="$entitySet" />
    <xsl:text>"],"parameters":{</xsl:text>
    <xsl:text>},"responses":{</xsl:text>
    <xsl:text>"default":{"description":"Unexpected error","schema":{"$ref":"#/definitions/_Error"}}}}}</xsl:text>
    <!-- TODO: action -->
  </xsl:template>

  <xsl:template match="edm:Function" mode="entity">
    <xsl:param name="entitySet" />
    <xsl:param name="namespace" />
    <xsl:param name="type" />
    <xsl:text>,"/</xsl:text>
    <xsl:value-of select="$entitySet" />
    <xsl:text>(</xsl:text>
    <xsl:apply-templates select="//edm:Schema[@Namespace=$namespace]/edm:EntityType[@Name=$type]/edm:Key/edm:PropertyRef"
      mode="path" />
    <xsl:text>)/</xsl:text>
    <xsl:value-of select="../@Namespace" />
    <xsl:text>.</xsl:text>
    <xsl:value-of select="@Name" />
    <xsl:text>()":{"get":{"summary":"Invoke function </xsl:text>
    <xsl:value-of select="@Name" />
    <xsl:text>","tags":["</xsl:text>
    <xsl:value-of select="$entitySet" />
    <xsl:text>"],"parameters":{</xsl:text>
    <xsl:text>},"responses":{</xsl:text>
    <xsl:text>"default":{"description":"Unexpected error","schema":{"$ref":"#/definitions/_Error"}}}}}</xsl:text>
    <!-- TODO: function -->
  </xsl:template>

  <!-- TODO: adapt to restrictions of Swagger -->
  <xsl:template name="type">
    <xsl:param name="type" />
    <xsl:variable name="nullable" select="'false'" />
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
    <xsl:choose>
      <xsl:when test="$singleType='Edm.Stream'">
      </xsl:when>
      <xsl:when test="$singleType='Edm.String'">
        <xsl:text>"type":"string"</xsl:text>
        <xsl:apply-templates select="@MaxLength" />
      </xsl:when>
      <xsl:when test="$singleType='Edm.Boolean'">
        <xsl:text>"type":"boolean"</xsl:text>
      </xsl:when>
      <xsl:when test="$singleType='Edm.Double'">
        <xsl:text>"type":"number","format":"double"</xsl:text>
      </xsl:when>
      <xsl:when test="$singleType='Edm.Single'">
        <xsl:text>"type":"number","format":"float"</xsl:text>
      </xsl:when>
      <xsl:when test="$singleType='Edm.Date'">
        <xsl:text>"type":"string","format":"date"</xsl:text>
      </xsl:when>
      <xsl:when test="$singleType='Edm.DateTimeOffset'">
        <xsl:text>"type":"string","format":"date-time"</xsl:text>
      </xsl:when>
      <xsl:when test="$singleType='Edm.Int64'">
        <xsl:text>"type":"integer","format":"int64"</xsl:text>
      </xsl:when>
      <xsl:when test="$singleType='Edm.Int32'">
        <xsl:text>"type":"integer","format":"int32"</xsl:text>
      </xsl:when>
      <xsl:when test="$singleType='Edm.Int16'">
        <xsl:text>"type":"integer","minimum":-32768,"maximum":32767</xsl:text>
      </xsl:when>
      <xsl:when test="$singleType='Edm.SByte'">
        <xsl:text>"type":"integer","minimum":-128,"maximum":127</xsl:text>
      </xsl:when>
      <xsl:when test="$singleType='Edm.Byte'">
        <xsl:text>"type":"integer","minimum":0,"maximum":255</xsl:text>
      </xsl:when>
      <xsl:when test="$singleType='Edm.Decimal'">
        <xsl:text>"type":"number"</xsl:text>
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
      <xsl:when test="$qualifier='Edm'">
        <!-- TODO: default remaining types to string, or default to object for Geo*, string for others? -->
        <xsl:text>"type":"string"</xsl:text>
      </xsl:when>
      <xsl:otherwise>
        <xsl:call-template name="ref">
          <xsl:with-param name="qualifier" select="$qualifier" />
          <xsl:with-param name="typeName">
            <xsl:call-template name="substring-after-last">
              <xsl:with-param name="input" select="$singleType" />
              <xsl:with-param name="marker" select="'.'" />
            </xsl:call-template>
          </xsl:with-param>
        </xsl:call-template>
      </xsl:otherwise>
    </xsl:choose>
    <xsl:apply-templates select="@DefaultValue">
      <xsl:with-param name="type" select="$singleType" />
    </xsl:apply-templates>
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
    <xsl:choose>
      <!-- TODO: Core.Description: handle aliases and fully qualified names and Core.LongDescription -->
      <xsl:when test="$name='@Core.Description'">
        <xsl:text>"title":</xsl:text>
        <xsl:apply-templates select="@String|edm:String" />
      </xsl:when>
      <xsl:when test="$name='@Core.LongDescription'">
        <xsl:text>"description":</xsl:text>
        <xsl:apply-templates select="@String|edm:String" />
      </xsl:when>
      <xsl:otherwise>
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
      </xsl:otherwise>
    </xsl:choose>
  </xsl:template>

</xsl:stylesheet>