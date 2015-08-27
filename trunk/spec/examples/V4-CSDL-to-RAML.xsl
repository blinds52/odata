<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:edmx="http://docs.oasis-open.org/odata/ns/edmx"
  xmlns:edm="http://docs.oasis-open.org/odata/ns/edm" xmlns:json="http://json.org/"
>
  <!--
    This style sheet transforms OData 4.0 XML CSDL documents into RAML

    TODO:
    - everything :-)
    - Singletons: should be almost identical to single entities, just without the keys

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

  <xsl:variable name="coreAlias" select="//edmx:Include[@Namespace='Org.OData.Core.V1']/@Alias" />
  <xsl:variable name="coreDescription" select="concat($coreAlias,'.Description')" />

  <xsl:template match="edmx:Edmx">
    <xsl:text>#%RAML 0.8&#xA;</xsl:text>
    <xsl:text>&#xA;title: </xsl:text>
    <xsl:variable name="title"
      select="edmx:DataServices/edm:Schema/edm:EntityContainer/edm:Annotation[@Term='Org.OData.Core.V1.Description' or @Term=$coreDescription]/@String" />
    <xsl:choose>
      <xsl:when test="$title">
        <xsl:value-of select="$title"></xsl:value-of>
      </xsl:when>
      <xsl:otherwise>
        <xsl:text>OData Service</xsl:text>
      </xsl:otherwise>
    </xsl:choose>
    <xsl:text>&#xA;baseUri: </xsl:text>
    <xsl:value-of select="$scheme"></xsl:value-of>
    <xsl:text>://</xsl:text>
    <xsl:value-of select="$host" />
    <xsl:value-of select="$basePath" />
    <!--
      <xsl:text>mediaType: application/json&#xA;</xsl:text>
    -->
    <!-- TODO: documentation: optionally from Core.LongDescription, reference to odata.org -->
    <!-- TODO: traits
      <xsl:text>,"parameters":{"expand":{"name":"$expand","in":"query","description":"expand navigation property","type":"string"},"select":{"name":"$select","in":"query","description":"select
      structural property","type":"string"},"orderby":{"name":"$orderby","in":"query","description":"order by some property","type":"string"},"top":{"name":"$top","in":"query","description":"top
      elements","type":"integer"},"skip":{"name":"$skip","in":"query","description":"skip elements","type":"integer"},"count":{"name":"$count","in":"query","description":"include
      count in response","type":"boolean"},"filter":{"name":"$filter","in":"query","description":"filter elements by property
      values","type":"string"}}</xsl:text>
    -->
    <!-- TODO: schemas - include JSON CSDL? -->
    <xsl:apply-templates select="edmx:DataServices/edm:Schema" />

    <xsl:text>&#x0A;</xsl:text>
  </xsl:template>

  <xsl:template match="edm:Schema">
    <xsl:apply-templates
      select="edm:EntityContainer/edm:EntitySet|edm:EntityContainer/edm:FunctionImport|edm:EntityContainer/edm:ActionImport" />
  </xsl:template>

  <xsl:template match="edm:EntitySet">
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

    <xsl:text>&#x0A;&#x0A;/</xsl:text>
    <xsl:value-of select="@Name" />
    <xsl:text>:</xsl:text>

    <!-- TODO: displayName: @Common.Label of entity set -->

    <!-- GET -->
    <xsl:text>&#x0A;  get:</xsl:text>
    <xsl:text>&#x0A;    description: Get entities from entity set </xsl:text>
    <xsl:value-of select="@Name" />
    <!--
      <xsl:text>","tags":["</xsl:text>
      <xsl:value-of select="@Name" />
      <xsl:text>"]</xsl:text>
      <xsl:text>,"parameters":[{"$ref":"#/parameters/filter"},{"$ref":"#/parameters/expand"},{"$ref":"#/parameters/select"},{"$ref":"#/parameters/orderby"},{"$ref":"#/parameters/top"},{"$ref":"#/parameters/skip"},{"$ref":"#/parameters/count"}]</xsl:text>
      <xsl:text>,"responses":{"200":{"description":"EntitySet </xsl:text>
      <xsl:value-of select="@Name" />
      <xsl:text>","schema":{"type":"object","properties":{"value":{"type":"array","items":{"$ref":"</xsl:text>
      <xsl:value-of select="$metadata" />
      <xsl:text>#/definitions/</xsl:text>
      <xsl:value-of select="$qualifiedType" />
      <xsl:text>"}}}}},"default":{"description":"Unexpected error","schema":{"$ref":"#/definitions/_Error"}}}</xsl:text>
      <xsl:text>}</xsl:text>
    -->

    <!-- POST -->
    <xsl:text>&#x0A;&#x0A;  post:</xsl:text>
    <xsl:text>&#x0A;    description: Post a new entity to entity set </xsl:text>
    <xsl:value-of select="@Name" />
    <!--
      <xsl:text>","tags":["</xsl:text>
      <xsl:value-of select="@Name" />
      <xsl:text>"]</xsl:text>
      <xsl:text>,"parameters":[{"name":"</xsl:text>
      <xsl:value-of select="$type" />
      <xsl:text>","in":"body"</xsl:text>
      <xsl:call-template name="entityTypeDescription">
      <xsl:with-param name="namespace" select="$namespace" />
      <xsl:with-param name="type" select="$type" />
      <xsl:with-param name="default" select="'The new entity'" />
      </xsl:call-template>
      <xsl:text>,"schema":{"$ref":"</xsl:text>
      <xsl:value-of select="$metadata" />
      <xsl:text>#/definitions/</xsl:text>
      <xsl:value-of select="$qualifiedType" />
      <xsl:text>"}}]</xsl:text>
      <xsl:text>,"responses":{"201":{"description":"Created entity","schema":{"$ref":"</xsl:text>
      <xsl:value-of select="$metadata" />
      <xsl:text>#/definitions/</xsl:text>
      <xsl:value-of select="$qualifiedType" />
      <xsl:text>"}},"default":{"description":"Unexpected error","schema":{"$ref":"#/definitions/_Error"}}}</xsl:text>
      <xsl:text>}</xsl:text>
    -->

    <xsl:apply-templates select="." mode="entity" />
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
    <xsl:text>&#x0A;&#x0A;/</xsl:text>
    <xsl:value-of select="@Name" />
    <xsl:text>(</xsl:text>
    <xsl:apply-templates select="//edm:Schema[@Namespace=$namespace]/edm:EntityType[@Name=$type]/edm:Key/edm:PropertyRef"
      mode="path" />
    <xsl:text>):</xsl:text>

    <!-- GET -->
    <xsl:text>&#x0A;  get:</xsl:text>
    <xsl:text>&#x0A;    description: Get entity from </xsl:text>
    <xsl:value-of select="@Name" />
    <xsl:text> by key</xsl:text>
    <!--
      <xsl:text>","tags":["</xsl:text>
      <xsl:value-of select="@Name" />
      <xsl:text>"]</xsl:text>
      <xsl:text>,"parameters":[</xsl:text>
      <xsl:apply-templates select="//edm:Schema[@Namespace=$namespace]/edm:EntityType[@Name=$type]/edm:Key/edm:PropertyRef"
      mode="list" />
      <xsl:text>,{"$ref":"#/parameters/expand"},{"$ref":"#/parameters/select"}],"responses":{"200":{"description":"EntitySet
      </xsl:text>
      <xsl:value-of select="@Name" />
      <xsl:text>","schema":{"$ref":"</xsl:text>
      <xsl:value-of select="$metadata" />
      <xsl:text>#/definitions/</xsl:text>
      <xsl:value-of select="$qualifiedType" />
      <xsl:text>"}},"default":{"description":"Unexpected error","schema":{"$ref":"#/definitions/_Error"}}}</xsl:text>
      <xsl:text>}</xsl:text>
    -->

    <!-- PATCH -->
    <xsl:text>&#x0A;&#x0A;  patch:</xsl:text>
    <xsl:text>&#x0A;    description: Update entity in entity set </xsl:text>
    <xsl:value-of select="@Name" />
    <!--
      <xsl:text>","tags":["</xsl:text>
      <xsl:value-of select="@Name" />
      <xsl:text>"]</xsl:text>
      <xsl:text>,"parameters":[</xsl:text>
      <xsl:apply-templates select="//edm:Schema[@Namespace=$namespace]/edm:EntityType[@Name=$type]/edm:Key/edm:PropertyRef"
      mode="list" />
      <xsl:text>,{"name":"</xsl:text>
      <xsl:value-of select="$type" />
      <xsl:text>","in":"body"</xsl:text>
      <xsl:call-template name="entityTypeDescription">
      <xsl:with-param name="namespace" select="$namespace" />
      <xsl:with-param name="type" select="$type" />
      <xsl:with-param name="default" select="'The entity to patch'" />
      </xsl:call-template>
      <xsl:text>,"schema":{"$ref":"</xsl:text>
      <xsl:value-of select="$metadata" />
      <xsl:text>#/definitions/</xsl:text>
      <xsl:value-of select="$qualifiedType" />
      <xsl:text>"}}],"responses":{"204":{"description":"Empty response"},"default":{"description":"Unexpected error","schema":{"$ref":"#/definitions/_Error"}}}</xsl:text>
      <xsl:text>}</xsl:text>
    -->

    <!-- DELETE -->
    <xsl:text>&#x0A;&#x0A;  delete:</xsl:text>
    <xsl:text>&#x0A;    description: Delete entity in entity set </xsl:text>
    <xsl:value-of select="@Name" />
    <!--
      <xsl:text>","tags":["</xsl:text>
      <xsl:value-of select="@Name" />
      <xsl:text>"]</xsl:text>
      <xsl:text>,"parameters":[</xsl:text>
      <xsl:apply-templates select="//edm:Schema[@Namespace=$namespace]/edm:EntityType[@Name=$type]/edm:Key/edm:PropertyRef"
      mode="list" />
      <xsl:text>,{"name":"If-Match","in":"header","description":"If-Match header","type":"string"}]</xsl:text>
      <xsl:text>,"responses":{"204":{"description":"Empty response"},"default":{"description":"Unexpected error","schema":{"$ref":"#/definitions/_Error"}}}</xsl:text>
      <xsl:text>}</xsl:text>

      <xsl:text>}</xsl:text>
    -->

    <xsl:apply-templates
      select="//edm:Function[@IsBound='true' and (edm:Parameter[1]/@Type=$qualifiedType or edm:Parameter[1]/@Type=$aliasQualifiedType)]"
      mode="bound"
    >
      <xsl:with-param name="entitySet" select="@Name" />
      <xsl:with-param name="namespace" select="$namespace" />
      <xsl:with-param name="type" select="$type" />
    </xsl:apply-templates>
    <xsl:apply-templates
      select="//edm:Action[@IsBound='true' and (edm:Parameter[1]/@Type=$qualifiedType or edm:Parameter[1]/@Type=$aliasQualifiedType)]"
      mode="bound"
    >
      <xsl:with-param name="entitySet" select="@Name" />
      <xsl:with-param name="namespace" select="$namespace" />
      <xsl:with-param name="type" select="$type" />
    </xsl:apply-templates>
  </xsl:template>

  <xsl:template match="edm:PropertyRef" mode="path">
    <xsl:variable name="name" select="@Name" />
    <xsl:variable name="type" select="../../edm:Property[@Name=$name]/@Type" />
    <!-- TODO: inheritance - find key definition in base type (recursively) -->
    <xsl:if test="position()>1">
      <xsl:text>,</xsl:text>
    </xsl:if>
    <xsl:if test="last()>1">
      <xsl:value-of select="@Name" />
      <xsl:text>=</xsl:text>
    </xsl:if>
    <xsl:call-template name="pathValuePrefix">
      <xsl:with-param name="type" select="$type" />
    </xsl:call-template>
    <xsl:text>{</xsl:text>
    <xsl:value-of select="@Name" />
    <xsl:text>}</xsl:text>
    <xsl:call-template name="pathValueSuffix">
      <xsl:with-param name="type" select="$type" />
    </xsl:call-template>
  </xsl:template>

  <xsl:template name="pathValuePrefix">
    <xsl:param name="type" />
    <xsl:choose>
      <xsl:when
        test="$type='Edm.Int64' or $type='Edm.Int32' or $type='Edm.Int16' or $type='Edm.SByte' or $type='Edm.Byte' or $type='Edm.Double' or $type='Edm.Single' or $type='Edm.Date' or $type='Edm.DateTimeOffset' or $type='Edm.Guid'" />
      <!-- TODO: handle other Edm types, enumeration types, and type definitions -->
      <xsl:otherwise>
        <xsl:text>'</xsl:text>
      </xsl:otherwise>
    </xsl:choose>
  </xsl:template>

  <xsl:template name="pathValueSuffix">
    <xsl:param name="type" />
    <xsl:choose>
      <xsl:when
        test="$type='Edm.Int64' or $type='Edm.Int32' or $type='Edm.Int16' or $type='Edm.SByte' or $type='Edm.Byte' or $type='Edm.Double' or $type='Edm.Single' or $type='Edm.Date' or $type='Edm.DateTimeOffset' or $type='Edm.Guid'" />
      <!-- TODO: handle other Edm types, enumeration types, and type definitions -->
      <xsl:otherwise>
        <xsl:text>'</xsl:text>
      </xsl:otherwise>
    </xsl:choose>
  </xsl:template>

  <xsl:template match="edm:PropertyRef">
    <xsl:variable name="name" select="@Name" />
    <xsl:variable name="type" select="../../edm:Property[@Name=$name]/@Type" />
    <!-- TODO: inheritance - find key definition in base type (recursively) -->
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
    <xsl:variable name="qualifier">
      <xsl:call-template name="substring-before-last">
        <xsl:with-param name="input" select="@Action" />
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
    <xsl:variable name="action">
      <xsl:call-template name="substring-after-last">
        <xsl:with-param name="input" select="@Action" />
        <xsl:with-param name="marker" select="'.'" />
      </xsl:call-template>
    </xsl:variable>

    <xsl:text>&#x0A;&#x0A;/</xsl:text>
    <xsl:value-of select="@Name" />
    <xsl:text>:&#x0A;  post:&#x0A;    description: Invoke action import </xsl:text>
    <xsl:value-of select="@Name" />
    <!-- TODO
      <xsl:text>","tags":["</xsl:text>
      <xsl:choose>
      <xsl:when test="@EntitySet">
      <xsl:value-of select="@EntitySet" />
      </xsl:when>
      <xsl:otherwise>
      <xsl:text>Service Operations</xsl:text>
      </xsl:otherwise>
      </xsl:choose>

      <xsl:text>"],"parameters":[</xsl:text>
      <xsl:text>{"name":"body","in":"body","description":"Request body","schema":{"type":"object"</xsl:text>
      <xsl:apply-templates select="//edm:Schema[@Namespace=$namespace]/edm:Action[@Name=$action]/edm:Parameter"
      mode="hash"
      >
      <xsl:with-param name="name" select="'properties'" />
      </xsl:apply-templates>
      <xsl:text>}}]</xsl:text>

      <xsl:call-template name="responses">
      <xsl:with-param name="type"
      select="//edm:Schema[@Namespace=$namespace]/edm:Action[@Name=$action]/edm:ReturnType/@Type" />
      </xsl:call-template>
    -->
  </xsl:template>

  <xsl:template match="edm:FunctionImport">
    <xsl:variable name="qualifier">
      <xsl:call-template name="substring-before-last">
        <xsl:with-param name="input" select="@Function" />
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
    <xsl:variable name="function">
      <xsl:call-template name="substring-after-last">
        <xsl:with-param name="input" select="@Function" />
        <xsl:with-param name="marker" select="'.'" />
      </xsl:call-template>
    </xsl:variable>

    <!-- need to apply templates for all function overloads that match the function name -->
    <xsl:apply-templates select="//edm:Schema[@Namespace=$namespace]/edm:Function[@Name=$function]"
      mode="import"
    >
      <xsl:with-param name="functionImport" select="@Name" />
      <xsl:with-param name="entitySet" select="@EntitySet" />
    </xsl:apply-templates>
  </xsl:template>

  <xsl:template match="edm:Function" mode="import">
    <xsl:param name="functionImport" />
    <xsl:param name="entitySet" />

    <xsl:text>&#x0A;&#x0A;/</xsl:text>
    <xsl:value-of select="@Name" />
    <xsl:text>(</xsl:text>
    <xsl:apply-templates select="edm:Parameter" mode="path" />
    <xsl:text>):</xsl:text>
    <xsl:text>&#x0A;  get:&#x0A;    description: Invoke function import </xsl:text>
    <xsl:value-of select="@Name" />
    <!-- TODO
      <xsl:text>","tags":["</xsl:text>
      <xsl:choose>
      <xsl:when test="$entitySet">
      <xsl:value-of select="$entitySet" />
      </xsl:when>
      <xsl:otherwise>
      <xsl:text>Service Operations</xsl:text>
      </xsl:otherwise>
      </xsl:choose>
      <xsl:text>"],"parameters":[</xsl:text>
      <xsl:apply-templates select="edm:Parameter" mode="list" />
      <xsl:text>]</xsl:text>

      <xsl:call-template name="responses">
      <xsl:with-param name="type" select="edm:ReturnType/@Type" />
      </xsl:call-template>
    -->
  </xsl:template>

  <xsl:template name="responses">
    <xsl:param name="type" />

    <xsl:text>,"responses":{</xsl:text>
    <xsl:choose>
      <xsl:when test="not($type)">
        <xsl:text>"204":{"description":"Empty response"}</xsl:text>
      </xsl:when>
      <xsl:otherwise>
        <xsl:text>"200":{"description":"Success","schema":{</xsl:text>
        <xsl:if test="starts-with($type,'Collection(')">
          <xsl:text>"type":"array","items":{</xsl:text>
        </xsl:if>
        <xsl:call-template name="type">
          <xsl:with-param name="type" select="$type" />
        </xsl:call-template>
        <xsl:text>}</xsl:text>
        <xsl:if test="starts-with($type,'Collection(')">
          <xsl:text>}</xsl:text>
        </xsl:if>
        <xsl:text>}</xsl:text>
      </xsl:otherwise>
    </xsl:choose>
    <xsl:text>,"default":{"description":"Unexpected error","schema":{"$ref":"#/definitions/_Error"}}}}}</xsl:text>
  </xsl:template>

  <xsl:template match="edm:Action" mode="bound">
    <xsl:param name="entitySet" />
    <xsl:param name="namespace" />
    <xsl:param name="type" />

    <xsl:text>&#x0A;&#x0A;  /</xsl:text>
    <xsl:value-of select="../@Namespace" />
    <xsl:text>.</xsl:text>
    <xsl:value-of select="@Name" />
    <xsl:text>:&#x0A;    post:</xsl:text>
    <!-- TODO
      <xsl:text>"summary":"Invoke action </xsl:text>
      <xsl:value-of select="@Name" />
      <xsl:text>","tags":["</xsl:text>
      <xsl:value-of select="$entitySet" />
      <xsl:text>"],"parameters":[</xsl:text>
      <xsl:apply-templates select="//edm:Schema[@Namespace=$namespace]/edm:EntityType[@Name=$type]/edm:Key/edm:PropertyRef"
      />
      <xsl:text>,{"name":"body","in":"body","description":"Request body","schema":{"type":"object"</xsl:text>
      <xsl:apply-templates select="edm:Parameter[position()>1]" mode="hash">
      <xsl:with-param name="name" select="'properties'" />
      </xsl:apply-templates>
      <xsl:text>}}]</xsl:text>

      <xsl:call-template name="responses">
      <xsl:with-param name="type" select="edm:ReturnType/@Type" />
      </xsl:call-template>
    -->
  </xsl:template>

  <xsl:template match="edm:Function" mode="bound">
    <xsl:param name="entitySet" />
    <xsl:param name="namespace" />
    <xsl:param name="type" />
    <xsl:variable name="singleReturnType">
      <xsl:choose>
        <xsl:when test="starts-with(edm:ReturnType/@Type,'Collection(')">
          <xsl:value-of select="substring-before(substring-after(edm:ReturnType/@Type,'('),')')" />
        </xsl:when>
        <xsl:otherwise>
          <xsl:value-of select="edm:ReturnType/@Type" />
        </xsl:otherwise>
      </xsl:choose>
    </xsl:variable>

    <xsl:text>&#x0A;&#x0A;  /</xsl:text>
    <xsl:value-of select="../@Namespace" />
    <xsl:text>.</xsl:text>
    <xsl:value-of select="@Name" />
    <xsl:text>(</xsl:text>
    <xsl:apply-templates select="edm:Parameter[position()>1]" mode="path" />
    <xsl:text>):&#x0A;    get:</xsl:text>
    <!-- TODO
      <xsl:text>"summary":"Invoke function </xsl:text>
      <xsl:value-of select="@Name" />
      <xsl:text>","tags":["</xsl:text>
      <xsl:value-of select="$entitySet" />
      <xsl:text>"],"parameters":[</xsl:text>
      <xsl:apply-templates
      select="//edm:Schema[@Namespace=$namespace]/edm:EntityType[@Name=$type]/edm:Key/edm:PropertyRef|edm:Parameter[position()>1]"
      mode="list" />
      <xsl:text>]</xsl:text>

      <xsl:call-template name="responses">
      <xsl:with-param name="type" select="edm:ReturnType/@Type" />
      </xsl:call-template>
    -->
  </xsl:template>

  <xsl:template match="edm:Action/edm:Parameter" mode="hashvalue">
    <xsl:call-template name="type">
      <xsl:with-param name="type" select="@Type" />
    </xsl:call-template>
  </xsl:template>

  <xsl:template match="edm:Function/edm:Parameter">
    <xsl:text>{"name":"</xsl:text>
    <xsl:value-of select="@Name" />
    <xsl:text>","in":"path",</xsl:text>
    <xsl:call-template name="type">
      <xsl:with-param name="type" select="@Type" />
    </xsl:call-template>
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template match="edm:Parameter/@MaxLength">
    <xsl:if test=".!='max'">
      <xsl:text>,"maxLength":</xsl:text>
      <xsl:value-of select="." />
    </xsl:if>
  </xsl:template>

  <xsl:template match="edm:Function/edm:Parameter" mode="path">
    <xsl:if test="position()>1">
      <xsl:text>,</xsl:text>
    </xsl:if>
    <xsl:value-of select="@Name" />
    <xsl:text>=</xsl:text>
    <xsl:call-template name="pathValueSuffix">
      <xsl:with-param name="type" select="@Type" />
    </xsl:call-template>
    <xsl:text>{</xsl:text>
    <xsl:value-of select="@Name" />
    <xsl:text>}</xsl:text>
    <xsl:call-template name="pathValueSuffix">
      <xsl:with-param name="type" select="@Type" />
    </xsl:call-template>
  </xsl:template>

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

  <xsl:template match="edm:EntityType|edm:ComplexType" mode="hashpair">
    <xsl:text>"</xsl:text>
    <xsl:value-of select="../@Namespace" />
    <xsl:text>.</xsl:text>
    <xsl:value-of select="@Name" />
    <xsl:text>":{</xsl:text>
    <xsl:if test="@BaseType">
      <xsl:text>"allOf":[{</xsl:text>
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
      <xsl:text>},{</xsl:text>
    </xsl:if>
    <xsl:text>"type":"object"</xsl:text>
    <xsl:apply-templates select="edm:Property|edm:NavigationProperty" mode="hash">
      <xsl:with-param name="name" select="'properties'" />
    </xsl:apply-templates>
    <xsl:apply-templates select="edm:Annotation" mode="list2" />
    <xsl:if test="@BaseType">
      <xsl:text>}]</xsl:text>
    </xsl:if>
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template match="edm:Property|edm:NavigationProperty" mode="hashvalue">
    <xsl:variable name="nullable">
      <xsl:call-template name="nullableFacetValue">
        <xsl:with-param name="type" select="@Type" />
        <xsl:with-param name="nullable" select="@Nullable" />
      </xsl:call-template>
    </xsl:variable>
    <xsl:if test="starts-with(@Type,'Collection(')">
      <xsl:text>"type":"array","items":{</xsl:text>
    </xsl:if>
    <xsl:call-template name="type">
      <xsl:with-param name="type" select="@Type" />
    </xsl:call-template>
    <xsl:if test="starts-with(@Type,'Collection(')">
      <xsl:text>}</xsl:text>
    </xsl:if>
    <xsl:choose>
      <xsl:when test="local-name()='Property'">
        <xsl:apply-templates select="@SRID|@Unicode|*[local-name()!='Annotation']" mode="list2" />
      </xsl:when>
      <xsl:otherwise>
        <xsl:text>,"x-relationship":{</xsl:text>
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

  <xsl:template match="@SRID">
    <xsl:text>"x-srid":"</xsl:text>
    <xsl:value-of select="." />
    <xsl:text>"</xsl:text>
  </xsl:template>

  <xsl:template name="entityTypeDescription">
    <xsl:param name="namespace" />
    <xsl:param name="type" />
    <xsl:param name="default" />
    <xsl:text>,"description":"</xsl:text>
    <xsl:variable name="description"
      select="//edm:Schema[@Namespace=$namespace]/edm:EntityType[@Name=$type]/edm:Annotation[@Term='Org.OData.Core.V1.Description' or @Term=$coreDescription]/@String" />
    <xsl:choose>
      <xsl:when test="$description">
        <xsl:value-of select="$description" />
      </xsl:when>
      <xsl:otherwise>
        <xsl:value-of select="$default" />
      </xsl:otherwise>
    </xsl:choose>
    <xsl:text>"</xsl:text>
  </xsl:template>

  <xsl:template match="edm:Member" mode="annotation">
    <xsl:if test="@Value">
      <!-- prefix with x- to satisfy Swagger restriction for extension names -->
      <xsl:text>,"x-</xsl:text>
      <xsl:value-of select="@Name" />
      <xsl:text>@odata.value":</xsl:text>
      <xsl:value-of select="@Value" />
    </xsl:if>
    <xsl:apply-templates select="edm:Annotation" mode="list2">
      <xsl:with-param name="target" select="@Name" />
    </xsl:apply-templates>
  </xsl:template>

  <xsl:template match="edm:Annotation">
    <xsl:param name="target" />
    <xsl:variable name="name">
      <!-- prefix with x- to satisfy Swagger restriction for extension names -->
      <xsl:text>x-</xsl:text>
      <xsl:value-of select="$target" />
      <xsl:value-of select="@Term" />
      <xsl:if test="@Qualifier">
        <xsl:text>#</xsl:text>
        <xsl:value-of select="@Qualifier" />
      </xsl:if>
    </xsl:variable>
    <xsl:choose>
      <xsl:when test="$name='x-Org.OData.Core.V1.Description' or $name=concat('x-',$coreDescription)">
        <xsl:text>"description":</xsl:text>
        <xsl:apply-templates select="@String|edm:String" />
      </xsl:when>
      <xsl:otherwise>
        <!-- TODO: filter out all annotations that don't map to swagger? -->
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