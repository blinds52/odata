<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:edmx="http://docs.oasis-open.org/odata/ns/edmx"
  xmlns:edm="http://docs.oasis-open.org/odata/ns/edm" xmlns:json="http://json.org/"
>
  <!--
    This style sheet transforms OData 4.0 XML CSDL documents into Swagger JSON

    TODO:
    - x-resourcetype on container children with values EntitySet, Singleton, ...
    - annotations
    - action and function definitions
    - edmx:Reference/edmx:Include reflected in human-readable description of service, with links to parameterized Swagger UI
    - $expand, $select, $orderby per entity type used as base type of an entity set with array of enum values derived from
    property names
    - $orderby: both asc (no suffix) and desc in enumeration
    - system query options for actions/functions/imports depending on "Collection("
    - security/authentication
    - primitive types in function/action return types
    - Singletons: should be almost identical to single entities, just without the keys
    - 200 response for PATCH
    - If-Match for PATCH
    - property description for key parameters in single-entity requests
    - better description for operations
    - suppress annotations/constructs (relation, ...) that are not strictly Swagger?
    - remove duplicated code
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

  <xsl:variable name="extension-prefix" select="'x-'" />

  <xsl:template match="edmx:Edmx">
    <xsl:text>{"swagger":"2.0"</xsl:text>
    <xsl:text>,"info":{"title":"</xsl:text>
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
    <xsl:text>","description":"</xsl:text>
    <xsl:variable name="description"
      select="edmx:DataServices/edm:Schema/edm:EntityContainer/edm:Annotation[@Term='Org.OData.Core.V1.LongDescription' or @Term=concat($coreAlias,'.LongDescription')]/@String" />
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
        <xsl:text>/</xsl:text>
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
    <xsl:text>,"parameters":{
        "expand":{"name":"$expand","in":"query","description":"Expand related entities, see [OData Expand](http://docs.oasis-open.org/odata/odata/v4.0/errata02/os/complete/part1-protocol/odata-v4.0-errata02-os-part1-protocol-complete.html#_Toc406398298)","type":"string"},
        "select":{"name":"$select","in":"query","description":"Select properties to be returned, see [OData Select](http://docs.oasis-open.org/odata/odata/v4.0/errata02/os/complete/part1-protocol/odata-v4.0-errata02-os-part1-protocol-complete.html#_Toc406398297)","type":"string"},
        "orderby":{"name":"$orderby","in":"query","description":"Order by property values, see [OData Sorting](http://docs.oasis-open.org/odata/odata/v4.0/errata02/os/complete/part1-protocol/odata-v4.0-errata02-os-part1-protocol-complete.html#_Toc406398305)","type":"string"},
        "top":{"name":"$top","in":"query","description":"Show only the first n elements, see [OData Paging - Top](http://docs.oasis-open.org/odata/odata/v4.0/errata02/os/complete/part1-protocol/odata-v4.0-errata02-os-part1-protocol-complete.html#_Toc406398306)","type":"integer"},
        "skip":{"name":"$skip","in":"query","description":"Skip the first n elements, see [OData Paging - Skip](http://docs.oasis-open.org/odata/odata/v4.0/errata02/os/complete/part1-protocol/odata-v4.0-errata02-os-part1-protocol-complete.html#_Toc406398307)","type":"integer"},
        "count":{"name":"$count","in":"query","description":"Include count of elements, see [OData Count](http://docs.oasis-open.org/odata/odata/v4.0/errata02/os/complete/part1-protocol/odata-v4.0-errata02-os-part1-protocol-complete.html#_Toc406398308)","type":"boolean"},
        "filter":{"name":"$filter","in":"query","description":"Filter elements by property values, see [OData Filtering](http://docs.oasis-open.org/odata/odata/v4.0/errata02/os/complete/part1-protocol/odata-v4.0-errata02-os-part1-protocol-complete.html#_Toc406398301)","type":"string"},
        "search":{"name":"$search","in":"query","description":"Search elements by search phrases, see [OData Searching](http://docs.oasis-open.org/odata/odata/v4.0/errata02/os/complete/part1-protocol/odata-v4.0-errata02-os-part1-protocol-complete.html#_Toc406398309)","type":"string"}}</xsl:text>
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template match="edm:Schema">
    <xsl:apply-templates select="edm:EntityType|edm:ComplexType|edm:TypeDefinition|edm:EnumType"
      mode="hash"
    >
      <xsl:with-param name="name" select="'definitions'" />
      <xsl:with-param name="constantProperties">
        <xsl:text>,"_Error":{"properties":{"error":{"$ref":"#/definitions/_InError"}}},"_InError":{"properties":{"code":{"type":"string"},"message":{"type":"string"}}}</xsl:text>
      </xsl:with-param>
    </xsl:apply-templates>

    <xsl:text>,"paths":{</xsl:text>
    <xsl:apply-templates
      select="edm:EntityContainer/edm:EntitySet|edm:EntityContainer/edm:FunctionImport|edm:EntityContainer/edm:ActionImport"
      mode="list" />
    <xsl:text>}</xsl:text>
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
    <xsl:text>","description":"Get entities from entity set </xsl:text>
    <xsl:value-of select="@Name" />
    <xsl:text>","tags":["</xsl:text>
    <xsl:value-of select="@Name" />
    <xsl:text>"]</xsl:text>
    <xsl:text>,"parameters":[{"$ref":"#/parameters/top"},{"$ref":"#/parameters/skip"},{"$ref":"#/parameters/orderby"},{"$ref":"#/parameters/search"},{"$ref":"#/parameters/filter"},{"$ref":"#/parameters/count"},{"$ref":"#/parameters/select"},{"$ref":"#/parameters/expand"}]</xsl:text>
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
    <xsl:text>","description":"Post a new entity to entity set </xsl:text>
    <xsl:value-of select="@Name" />
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

  <xsl:template match="edm:PropertyRef" mode="parameter">
    <xsl:variable name="name" select="@Name" />
    <xsl:variable name="type" select="../../edm:Property[@Name=$name]/@Type" />
    <!-- TODO: inheritance - find key definition in base type (recursively) -->
    <xsl:if test="position()>1">
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

    <xsl:text>"/</xsl:text>
    <xsl:value-of select="@Name" />
    <xsl:text>":{"post":{"summary":"Invoke action import </xsl:text>
    <xsl:value-of select="@Name" />
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

    <xsl:text>"/</xsl:text>
    <xsl:value-of select="@Name" />
    <xsl:text>(</xsl:text>
    <xsl:apply-templates select="edm:Parameter" mode="path" />
    <xsl:text>)</xsl:text>
    <xsl:text>":{"get":{"summary":"Invoke function import </xsl:text>
    <xsl:value-of select="@Name" />
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
        <xsl:call-template name="type">
          <xsl:with-param name="type" select="$type" />
          <xsl:with-param name="nullableFacet" select="'false'" />
        </xsl:call-template>
        <xsl:text>}</xsl:text>
        <xsl:text>}</xsl:text>
      </xsl:otherwise>
    </xsl:choose>
    <xsl:text>,"default":{"description":"Unexpected error","schema":{"$ref":"#/definitions/_Error"}}}}}</xsl:text>
  </xsl:template>

  <xsl:template match="edm:Action" mode="bound">
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
    <xsl:text>"],"parameters":[</xsl:text>
    <xsl:apply-templates select="//edm:Schema[@Namespace=$namespace]/edm:EntityType[@Name=$type]/edm:Key/edm:PropertyRef"
      mode="parameter" />
    <xsl:text>,{"name":"body","in":"body","description":"Request body","schema":{"type":"object"</xsl:text>
    <xsl:apply-templates select="edm:Parameter[position()>1]" mode="hash">
      <xsl:with-param name="name" select="'properties'" />
    </xsl:apply-templates>
    <xsl:text>}}]</xsl:text>

    <xsl:call-template name="responses">
      <xsl:with-param name="type" select="edm:ReturnType/@Type" />
    </xsl:call-template>
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

    <xsl:text>,"/</xsl:text>
    <xsl:value-of select="$entitySet" />
    <xsl:text>(</xsl:text>
    <xsl:apply-templates select="//edm:Schema[@Namespace=$namespace]/edm:EntityType[@Name=$type]/edm:Key/edm:PropertyRef"
      mode="path" />
    <xsl:text>)/</xsl:text>
    <xsl:value-of select="../@Namespace" />
    <xsl:text>.</xsl:text>
    <xsl:value-of select="@Name" />
    <xsl:text>(</xsl:text>
    <xsl:apply-templates select="edm:Parameter[position()>1]" mode="path" />
    <xsl:text>)":{"get":{"summary":"Invoke function </xsl:text>
    <xsl:value-of select="@Name" />
    <xsl:text>","tags":["</xsl:text>
    <xsl:value-of select="$entitySet" />
    <xsl:text>"],"parameters":[</xsl:text>
    <xsl:apply-templates
      select="//edm:Schema[@Namespace=$namespace]/edm:EntityType[@Name=$type]/edm:Key/edm:PropertyRef|edm:Parameter[position()>1]"
      mode="parameter" />
    <xsl:text>]</xsl:text>

    <xsl:call-template name="responses">
      <xsl:with-param name="type" select="edm:ReturnType/@Type" />
    </xsl:call-template>
  </xsl:template>

  <xsl:template match="edm:Action/edm:Parameter" mode="hashvalue">
    <xsl:call-template name="type">
      <xsl:with-param name="type" select="@Type" />
      <xsl:with-param name="nullableFacet" select="'false'" />
    </xsl:call-template>
  </xsl:template>

  <xsl:template match="edm:Function/edm:Parameter">
    <xsl:text>{"name":"</xsl:text>
    <xsl:value-of select="@Name" />
    <xsl:text>","in":"path",</xsl:text>
    <xsl:call-template name="type">
      <xsl:with-param name="type" select="@Type" />
      <xsl:with-param name="nullableFacet" select="'false'" />
    </xsl:call-template>
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template match="edm:Function/edm:Parameter" mode="parameter">
    <xsl:text>,</xsl:text>
    <xsl:apply-templates select="." />
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

  <xsl:template name="nullableType">
    <xsl:param name="type" />
    <xsl:param name="nullable" />
    <xsl:text>"type":"</xsl:text>
    <xsl:choose>
      <xsl:when test="contains($type,',')">
        <xsl:value-of select="substring-before($type,',')" />
      </xsl:when>
      <xsl:otherwise>
        <xsl:value-of select="$type" />
      </xsl:otherwise>
    </xsl:choose>
    <xsl:text>"</xsl:text>
    <xsl:if test="not($nullable='false')">
      <xsl:text>,"x-nullable":true</xsl:text>
    </xsl:if>
  </xsl:template>

  <xsl:template name="Edm.Stream">
    "description": "unfulfillable constraint, no inline representation of Edm.Stream",
    "type": "string",
    "enum": [ null ]
  </xsl:template>

  <xsl:template name="single-format">
    <xsl:text>,"format":"float"</xsl:text>
  </xsl:template>

  <xsl:template name="Edm.Geo">
    <xsl:param name="singleType" />
    <xsl:text>"description": "GeoJSON object </xsl:text>
    <xsl:value-of select="$singleType" />
    <xsl:text>","type": "object"</xsl:text>
  </xsl:template>

  <xsl:template name="otherType">
    <xsl:param name="anyOf" />
    <xsl:param name="qualifier" />
    <xsl:param name="singleType" />
    <xsl:param name="nullable" />
    <xsl:call-template name="ref">
      <xsl:with-param name="qualifier" select="$qualifier" />
      <xsl:with-param name="name">
        <xsl:call-template name="substring-after-last">
          <xsl:with-param name="input" select="$singleType" />
          <xsl:with-param name="marker" select="'.'" />
        </xsl:call-template>
      </xsl:with-param>
    </xsl:call-template>
    <xsl:if test="not($nullable='false')">
      <xsl:text>,"x-nullable":true</xsl:text>
    </xsl:if>
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
        <xsl:with-param name="name">
          <xsl:call-template name="substring-after-last">
            <xsl:with-param name="input" select="@BaseType" />
            <xsl:with-param name="marker" select="'.'" />
          </xsl:call-template>
        </xsl:with-param>
      </xsl:call-template>
      <xsl:text>},{</xsl:text>
    </xsl:if>
    <xsl:text>"type":"object"</xsl:text>
    <xsl:if test="@Abstract='true'">
      <xsl:text>,"x-abstract":true</xsl:text>
      <xsl:if test="local-name()='EntityType' and not(edm:Key)">
        <xsl:text>,"x-keys":[]</xsl:text>
      </xsl:if>
    </xsl:if>
    <xsl:if test="@HasStream='true'">
      <xsl:text>,"x-mediaEntity":true</xsl:text>
    </xsl:if>
    <xsl:apply-templates select="@OpenType|edm:Key" mode="list2" />
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
    <xsl:call-template name="type">
      <xsl:with-param name="type" select="@Type" />
      <xsl:with-param name="nullableFacet" select="@Nullable" />
    </xsl:call-template>
    <xsl:choose>
      <xsl:when test="local-name()='Property'">
        <xsl:apply-templates select="@Unicode|*[local-name()!='Annotation']" mode="list2" />
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

  <!-- TODO: also reduce to exception overrides -->
  <xsl:template match="edm:Annotation">
    <xsl:param name="target" />
    <xsl:variable name="name">
      <!-- prefix with x- to satisfy Swagger restriction for extension names -->
      <xsl:text>x-</xsl:text>
      <xsl:value-of select="$target" />
      <xsl:text>@</xsl:text>
      <xsl:value-of select="@Term" />
      <xsl:if test="@Qualifier">
        <xsl:text>#</xsl:text>
        <xsl:value-of select="@Qualifier" />
      </xsl:if>
    </xsl:variable>
    <xsl:choose>
      <xsl:when test="$name='x-@Org.OData.Core.V1.Description' or $name=concat('x-@',$coreDescription)">
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
        <xsl:if test="count(@*[local-name()!='Term' and local-name()!='Qualifier']|*[local-name()!='Annotation'])=0">
          <!-- tagging term -->
          <!-- TODO: try to get default value from term definition, use true if not possible -->
          <xsl:text>true</xsl:text>
        </xsl:if>
      </xsl:otherwise>
    </xsl:choose>
  </xsl:template>

</xsl:stylesheet>