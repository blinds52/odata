<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:edmx="http://docs.oasis-open.org/odata/ns/edmx"
  xmlns:edm="http://docs.oasis-open.org/odata/ns/edm" xmlns:json="http://json.org/"
>
  <!--
    This style sheet transforms OData 4.0 XML CSDL documents into Swagger JSON

    TODO:
    - no x- prefix for annotations, instead wrap them in x-annotations object within Swagger markup
    - x-resourcetype on container children within /paths with values EntitySet, Singleton, ...
    - Swagger UI complains about correct $ref to #/x-schemas: bug or just represent aliases differently?
    - reconsider $ref for type/action/function referencing: Sweagger resolves local references *after* resolving external
    references, i.e. local references in referenced files are processed in the wrong context
    - @Extends for entity container: ideally should include /paths from referenced container
    - annotations (other than description) on the entity container
    - edmx:Reference/edmx:Include reflected in human-readable description of service, with links to parameterized Swagger
    UI
    - extract /parameters to OData.v4.0.OpenAPI.json and use external references
    - extract common /definitions to OData.v4.0.OpenAPI.json
    - $expand, $select, $orderby per entity type used as base type of an entity set with array of enum values derived from
    property names
    - $orderby: both asc (no suffix) and desc in enumeration
    - try again for both "clickable" and freestyle $orderby
    - system query options for actions/functions/imports depending on "Collection("
    - security/authentication
    - primitive types in function/action return types
    - Singletons: should be almost identical to single entities, just without the keys
    - 200 response for PATCH
    - If-Match for PATCH
    - property description for key parameters in single-entity requests
    - better description for operations
    - remove duplicated code
    - Validation annotations -> pattern, minimum, maximum, exclusiveM??imum, see ODATA-856, inline and explace style
    - default for Geo types in GeoJSON
    - annotations without explicit value: default from term definition (if inline)
    - trim leading and trailing \n from descriptions
  -->

  <xsl:output method="text" indent="yes" encoding="UTF-8" omit-xml-declaration="yes" />
  <xsl:strip-space elements="*" />

  <xsl:param name="scheme" select="'http'" />
  <xsl:param name="host" select="'localhost'" />
  <xsl:param name="basePath" select="'/service-root'" />
  <xsl:param name="odata-definitions" select="'http://localhost/examples/OData.V4.OpenAPI.json'" />
  <!-- TODO: consider splitting /paths file == core Swagger description from /definitions == JSON $metadata
    <xsl:param name="metadata" select="'$metadata'" />
  -->
  <xsl:variable name="metadata" select="''" />

  <xsl:variable name="coreNamespace" select="'Org.OData.Core.V1'" />
  <xsl:variable name="coreAlias"
    select="//edmx:Include[@Namespace=$coreNamespace]/@Alias|//edm:Schema[@Namespace=$coreNamespace]/@Alias" />
  <xsl:variable name="coreDescription" select="concat($coreNamespace,'.Description')" />
  <xsl:variable name="coreDescriptionAliased" select="concat($coreAlias,'.Description')" />

  <xsl:key name="methods"
    match="edmx:Edmx/edmx:DataServices/edm:Schema/edm:Action|edmx:Edmx/edmx:DataServices/edm:Schema/edm:Function" use="concat(../@Namespace,'.',@Name)" />

  <xsl:key name="targets" match="edmx:Edmx/edmx:DataServices/edm:Schema/edm:Annotations" use="concat(../@Namespace,'/',@Target)" />
  <xsl:key name="includeannotations" match="edmx:Edmx/edmx:Reference/edmx:IncludeAnnotations" use="concat(../@Uri,'|',@TermNamespace)" />

  <xsl:template match="edmx:Edmx">
    <xsl:text>{</xsl:text>
    <xsl:apply-templates select="@*" mode="list" />
    <xsl:if test="//edm:EntityContainer">
      <xsl:text>,"swagger":"2.0"</xsl:text>
      <xsl:text>,"info":{"title":"</xsl:text>
      <!-- TODO: also cover element notation of string -->
      <xsl:variable name="title"
        select="edmx:DataServices/edm:Schema/edm:EntityContainer/edm:Annotation[@Term=$coreDescription or @Term=$coreDescriptionAliased]/@String" />
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
      <!-- TODO: service version as a Core annotation? - Jira issue -->
      <xsl:text>","version":"0.1.0"}</xsl:text>
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
    </xsl:if>
    <xsl:apply-templates select="edmx:DataServices" />
    <xsl:apply-templates select="edmx:Reference[edmx:IncludeAnnotations|edm:Annotation]" mode="hash">
      <xsl:with-param name="key" select="'Uri'" />
    </xsl:apply-templates>
    <xsl:if test="//edm:EntityContainer">
      <!-- TODO: external file -->
      <xsl:text>,"parameters":{
        "expand":{"name":"$expand","in":"query","description":"Expand related entities, see [OData Expand](http://docs.oasis-open.org/odata/odata/v4.0/errata02/os/complete/part1-protocol/odata-v4.0-errata02-os-part1-protocol-complete.html#_Toc406398298)","type":"string"},
        "select":{"name":"$select","in":"query","description":"Select properties to be returned, see [OData Select](http://docs.oasis-open.org/odata/odata/v4.0/errata02/os/complete/part1-protocol/odata-v4.0-errata02-os-part1-protocol-complete.html#_Toc406398297)","type":"string"},
        "orderby":{"name":"$orderby","in":"query","description":"Order by property values, see [OData Sorting](http://docs.oasis-open.org/odata/odata/v4.0/errata02/os/complete/part1-protocol/odata-v4.0-errata02-os-part1-protocol-complete.html#_Toc406398305)","type":"string"},
        "top":{"name":"$top","in":"query","description":"Show only the first n elements, see [OData Paging - Top](http://docs.oasis-open.org/odata/odata/v4.0/errata02/os/complete/part1-protocol/odata-v4.0-errata02-os-part1-protocol-complete.html#_Toc406398306)","type":"integer"},
        "skip":{"name":"$skip","in":"query","description":"Skip the first n elements, see [OData Paging - Skip](http://docs.oasis-open.org/odata/odata/v4.0/errata02/os/complete/part1-protocol/odata-v4.0-errata02-os-part1-protocol-complete.html#_Toc406398307)","type":"integer"},
        "count":{"name":"$count","in":"query","description":"Include count of elements, see [OData Count](http://docs.oasis-open.org/odata/odata/v4.0/errata02/os/complete/part1-protocol/odata-v4.0-errata02-os-part1-protocol-complete.html#_Toc406398308)","type":"boolean"},
        "filter":{"name":"$filter","in":"query","description":"Filter elements by property values, see [OData Filtering](http://docs.oasis-open.org/odata/odata/v4.0/errata02/os/complete/part1-protocol/odata-v4.0-errata02-os-part1-protocol-complete.html#_Toc406398301)","type":"string"},
        "search":{"name":"$search","in":"query","description":"Search elements by search phrases, see [OData Searching](http://docs.oasis-open.org/odata/odata/v4.0/errata02/os/complete/part1-protocol/odata-v4.0-errata02-os-part1-protocol-complete.html#_Toc406398309)","type":"string"}}</xsl:text>
    </xsl:if>
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template match="edmx:Edmx/@Version">
    <xsl:text>"x-odata-version":"</xsl:text>
    <xsl:value-of select="." />
    <xsl:text>"</xsl:text>
  </xsl:template>

  <xsl:template match="edmx:Reference" mode="hashvalue">
    <xsl:apply-templates select="@*[local-name()!='Uri']" />
    <xsl:apply-templates
      select="edmx:IncludeAnnotations[generate-id() = generate-id(key('includeannotations', concat(../@Uri,'|',@TermNamespace))[1])]"
      mode="hash"
    >
      <xsl:with-param name="after" />
      <xsl:with-param name="key" select="'TermNamespace'" />
    </xsl:apply-templates>
    <xsl:apply-templates select="edm:Annotation" mode="list">
      <xsl:with-param name="after" select="edmx:IncludeAnnotations" />
    </xsl:apply-templates>
  </xsl:template>

  <xsl:template match="edmx:IncludeAnnotations" mode="hashpair">
    <xsl:text>"</xsl:text>
    <xsl:value-of select="@TermNamespace" />
    <xsl:text>":[</xsl:text>
    <xsl:for-each select="key('includeannotations', concat(../@Uri,'|',@TermNamespace))">
      <xsl:if test="position()>1">
        <xsl:text>,</xsl:text>
      </xsl:if>
      <xsl:text>{</xsl:text>
      <xsl:apply-templates select="@*[name()!='TermNamespace']" mode="list" />
      <xsl:text>}</xsl:text>
    </xsl:for-each>
    <xsl:text>]</xsl:text>
  </xsl:template>

  <xsl:template match="edmx:DataServices">
    <xsl:apply-templates
      select="edm:Schema/edm:EntityType|edm:Schema/edm:ComplexType|edm:Schema/edm:TypeDefinition|edm:Schema/edm:EnumType"
      mode="hash"
    >
      <xsl:with-param name="name" select="'definitions'" />
      <xsl:with-param name="constantProperties">
        <xsl:if test="//edm:EntityContainer">
          <xsl:text>
          ,"_Error":{"properties":{"error":{"$ref":"#/definitions/_InError"}}}
          ,"_InError":{"properties":{"code":{"type":"string"},"message":{"type":"string"}}}</xsl:text>
        </xsl:if>
      </xsl:with-param>
    </xsl:apply-templates>
    <xsl:apply-templates select="edm:Schema|../edmx:Reference/edmx:Include" mode="hash">
      <xsl:with-param name="key" select="'Namespace'" />
      <xsl:with-param name="name" select="'x-schemas'" />
    </xsl:apply-templates>
    <xsl:apply-templates
      select="edm:Schema/edm:Action[generate-id() = generate-id(key('methods', concat(../@Namespace,'.',@Name))[1])]"
      mode="hash"
    >
      <xsl:with-param name="name" select="'x-actions'" />
    </xsl:apply-templates>
    <xsl:apply-templates
      select="edm:Schema/edm:Function[generate-id() = generate-id(key('methods', concat(../@Namespace,'.',@Name))[1])]"
      mode="hash"
    >
      <xsl:with-param name="name" select="'x-functions'" />
    </xsl:apply-templates>

    <xsl:apply-templates select="edm:Schema/edm:Term" mode="hash">
      <xsl:with-param name="name" select="'x-terms'" />
    </xsl:apply-templates>
    <xsl:apply-templates select="edm:Schema/edm:EntityContainer" mode="list2" />
  </xsl:template>

  <xsl:template match="edmx:Include" mode="hashpair">
    <xsl:text>"</xsl:text>
    <xsl:value-of select="@Namespace" />
    <xsl:text>":{"$ref":"</xsl:text>
    <xsl:call-template name="json-url">
      <xsl:with-param name="url" select="../@Uri" />
    </xsl:call-template>
    <xsl:text>#/x-schemas/</xsl:text>
    <xsl:value-of select="@Namespace" />
    <xsl:text>"}</xsl:text>
    <xsl:if test="@Alias">
      <xsl:text>,"</xsl:text>
      <xsl:value-of select="@Alias" />
      <xsl:text>":{"$ref":"</xsl:text>
      <xsl:call-template name="json-url">
        <xsl:with-param name="url" select="../@Uri" />
      </xsl:call-template>
      <xsl:text>#/x-schemas/</xsl:text>
      <xsl:value-of select="@Namespace" />
      <xsl:text>"}</xsl:text>
    </xsl:if>
  </xsl:template>

  <xsl:template match="edm:Schema" mode="hashpair">
    <xsl:if test="@Alias">
      <xsl:text>"</xsl:text>
      <xsl:value-of select="@Alias" />
      <xsl:text>":{"aliasFor":"</xsl:text>
      <xsl:value-of select="@Namespace" />
      <xsl:text>"},</xsl:text>
    </xsl:if>
    <xsl:text>"</xsl:text>
    <xsl:value-of select="@Namespace" />
    <xsl:text>":{</xsl:text>
    <xsl:apply-templates select="edm:Annotation" mode="list" />
    <xsl:apply-templates
      select="edm:Annotations[generate-id() = generate-id(key('targets', concat(../@Namespace,'/',@Target))[1])]" mode="hash"
    >
      <xsl:with-param name="key" select="'Target'" />
      <xsl:with-param name="after" select="edm:Annotation" />
    </xsl:apply-templates>
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template match="edm:EnumType" mode="hashpair">
    <xsl:text>"</xsl:text>
    <xsl:value-of select="../@Namespace" />
    <xsl:text>.</xsl:text>
    <xsl:value-of select="@Name" />
    <xsl:text>":{"type":"string",</xsl:text>
    <xsl:text>"enum":[</xsl:text>
    <xsl:apply-templates select="edm:Member" mode="enum" />
    <xsl:text>]</xsl:text>
    <xsl:if test="@IsFlags='true'">
      <xsl:text>,"x-isFlags":true</xsl:text>
    </xsl:if>
    <xsl:call-template name="x-annotations">
      <xsl:with-param name="annotations" select="edm:Annotation" />
      <xsl:with-param name="members" select="edm:Member/@Value|edm:Member/edm:Annotation" />
    </xsl:call-template>
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template match="edm:Member" mode="enum">
    <xsl:if test="position() > 1">
      <xsl:text>,</xsl:text>
    </xsl:if>
    <xsl:text>"</xsl:text>
    <xsl:value-of select="@Name" />
    <xsl:text>"</xsl:text>
  </xsl:template>

  <xsl:template match="edm:Member/@Value">
    <xsl:text>"</xsl:text>
    <xsl:value-of select="../@Name" />
    <xsl:text>@odata.value":</xsl:text>
    <xsl:value-of select="." />
  </xsl:template>

  <xsl:template match="edm:Member/edm:Annotation">
    <xsl:apply-templates select=".">
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
    <!-- TODO: test annotations within TypeDefinition -->
    <xsl:apply-templates select="node()" mode="list2" />
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template match="edm:EntityType|edm:ComplexType" mode="hashpair">
    <xsl:text>"</xsl:text>
    <xsl:value-of select="../@Namespace" />
    <xsl:text>.</xsl:text>
    <xsl:value-of select="@Name" />
    <xsl:text>":{</xsl:text>
    <xsl:if test="@BaseType">
      <xsl:text>"allOf":[{</xsl:text>
      <xsl:call-template name="schema-ref">
        <xsl:with-param name="qualifiedName" select="@BaseType" />
        <xsl:with-param name="element" select="'definitions'" />
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
    <xsl:call-template name="x-annotations">
      <xsl:with-param name="annotations" select="edm:Annotation" />
    </xsl:call-template>
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
    <xsl:call-template name="x-annotations">
      <xsl:with-param name="annotations" select="edm:Annotation" />
    </xsl:call-template>
  </xsl:template>

  <xsl:template match="edm:Term" mode="hashpair">
    <xsl:text>"</xsl:text>
    <xsl:value-of select="../@Namespace" />
    <xsl:text>.</xsl:text>
    <xsl:value-of select="@Name" />
    <xsl:text>":{</xsl:text>
    <xsl:call-template name="type">
      <xsl:with-param name="type" select="@Type" />
      <xsl:with-param name="nullableFacet" select="@Nullable" />
    </xsl:call-template>
    <xsl:apply-templates select="@AppliesTo|@BaseTerm|edm:Annotation" mode="list2" />
    <xsl:text>}</xsl:text>
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
    <xsl:param name="wrap" select="false" />
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
    <xsl:variable name="collection" select="starts-with($type,'Collection(')" />
    <xsl:variable name="anyOf"
      select="not($nullable='false') or (not($collection) and ($wrap or @BaseTerm or @DefaultValue or @MaxLength or @Precision or @SRID))" />
    <xsl:if test="$collection">
      <xsl:text>"type":"array","items":{</xsl:text>
    </xsl:if>
    <xsl:choose>
      <xsl:when test="$singleType='Edm.Stream'">
        <xsl:text>"type":"string","readOnly":true</xsl:text>
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
        <xsl:text>,"format":"float"</xsl:text>
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
        <xsl:text>"type": "object","format":"</xsl:text>
        <xsl:value-of select="$singleType" />
        <xsl:text>"</xsl:text>
        <xsl:apply-templates select="@SRID" mode="list2" />
      </xsl:when>
      <xsl:otherwise>
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
        <xsl:apply-templates select="@MaxLength" />
        <xsl:apply-templates select="@Precision" mode="list2" />
      </xsl:otherwise>
    </xsl:choose>
    <xsl:apply-templates select="@DefaultValue">
      <xsl:with-param name="type" select="$singleType" />
    </xsl:apply-templates>
    <xsl:if test="$collection">
      <xsl:text>}</xsl:text>
    </xsl:if>
  </xsl:template>

  <xsl:template name="ref">
    <xsl:param name="qualifier" />
    <xsl:param name="name" />
    <xsl:param name="element" select="'definitions'" />
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
    <xsl:text>#/</xsl:text>
    <xsl:value-of select="$element" />
    <xsl:if test="$element!='entityContainer'">
      <xsl:text>/</xsl:text>
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
      <xsl:value-of select="$name" />
    </xsl:if>
    <xsl:text>"</xsl:text>
  </xsl:template>

  <xsl:template name="schema-ref">
    <xsl:param name="qualifiedName" />
    <xsl:param name="element" />
    <xsl:call-template name="ref">
      <xsl:with-param name="qualifier">
        <xsl:call-template name="substring-before-last">
          <xsl:with-param name="input" select="$qualifiedName" />
          <xsl:with-param name="marker" select="'.'" />
        </xsl:call-template>
      </xsl:with-param>
      <xsl:with-param name="name">
        <xsl:call-template name="substring-after-last">
          <xsl:with-param name="input" select="$qualifiedName" />
          <xsl:with-param name="marker" select="'.'" />
        </xsl:call-template>
      </xsl:with-param>
      <xsl:with-param name="element" select="$element" />
    </xsl:call-template>
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
    <xsl:text>"x-precision":</xsl:text>
    <xsl:value-of select="." />
  </xsl:template>

  <xsl:template match="@Scale">
    <xsl:text>"x-scale":</xsl:text>
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
  <xsl:template match="@Nullable|@OpenType|@Unicode">
    <xsl:text>"x-</xsl:text>
    <xsl:call-template name="lowerCamelCase">
      <xsl:with-param name="name" select="local-name()" />
    </xsl:call-template>
    <xsl:text>":</xsl:text>
    <xsl:value-of select="." />
  </xsl:template>

  <xsl:template match="@ContainsTarget|@IsBound|@IsComposable|@IncludeInServiceDocument">
    <xsl:text>"</xsl:text>
    <xsl:call-template name="lowerCamelCase">
      <xsl:with-param name="name" select="local-name()" />
    </xsl:call-template>
    <xsl:text>":</xsl:text>
    <xsl:value-of select="." />
  </xsl:template>

  <xsl:template match="edm:Key">
    <xsl:text>"x-keys":[</xsl:text>
    <xsl:apply-templates select="edm:PropertyRef" mode="list" />
    <xsl:text>]</xsl:text>
  </xsl:template>

  <xsl:template match="edm:PropertyRef">
    <xsl:choose>
      <xsl:when test="@Alias">
        <xsl:text>{"</xsl:text>
        <xsl:value-of select="@Alias" />
        <xsl:text>":"</xsl:text>
        <xsl:value-of select="@Name" />
        <xsl:text>"}</xsl:text>
      </xsl:when>
      <xsl:otherwise>
        <xsl:text>"</xsl:text>
        <xsl:value-of select="@Name" />
        <xsl:text>"</xsl:text>
      </xsl:otherwise>
    </xsl:choose>
  </xsl:template>

  <xsl:template match="edm:ReferentialConstraint" mode="item">
    <xsl:text>{</xsl:text>
    <xsl:apply-templates select="@*|node()" mode="list" />
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template match="edm:Action|edm:Function" mode="hashpair">
    <xsl:text>"</xsl:text>
    <xsl:value-of select="../@Namespace" />
    <xsl:text>.</xsl:text>
    <xsl:value-of select="@Name" />
    <xsl:text>":[</xsl:text>
    <xsl:for-each select="key('methods', concat(../@Namespace,'.',@Name))">
      <xsl:if test="position()>1">
        <xsl:text>,</xsl:text>
      </xsl:if>
      <xsl:text>{</xsl:text>
      <xsl:text>"parameters":[</xsl:text>
      <xsl:apply-templates select="edm:Parameter" mode="list" />
      <xsl:text>]</xsl:text>
      <xsl:apply-templates select="edm:ReturnType" mode="list2" />
      <xsl:apply-templates select="@*[local-name()!='Name']" mode="list2" />
      <xsl:apply-templates select="edm:Annotation" mode="list2" />
      <xsl:text>}</xsl:text>
    </xsl:for-each>
    <xsl:text>]</xsl:text>
  </xsl:template>

  <xsl:template match="edm:Parameter">
    <xsl:text>{</xsl:text>
    <xsl:apply-templates select="@Name" />
    <xsl:text>,"parameterType":{</xsl:text>
    <xsl:call-template name="type">
      <xsl:with-param name="type" select="@Type" />
      <xsl:with-param name="nullableFacet" select="@Nullable" />
    </xsl:call-template>
    <xsl:text>}</xsl:text>
    <xsl:apply-templates select="edm:Annotation" mode="list2" />
    <xsl:text>}</xsl:text>
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
    <xsl:text>"paths":{</xsl:text>
    <!-- TODO: where to put these?
      <xsl:apply-templates select="@*" mode="list" />
      <xsl:apply-templates select="edm:Annotation" mode="list2" />
    -->
    <xsl:apply-templates select="edm:EntitySet|edm:FunctionImport|edm:ActionImport" mode="list" />
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

    <xsl:variable name="qualifiedBasetype" select="//edm:Schema[@Namespace=$namespace]/edm:EntityType[@Name=$type]/@BaseType" />
    <xsl:variable name="basetypeQualifier">
      <xsl:call-template name="substring-before-last">
        <xsl:with-param name="input" select="$qualifiedBasetype" />
        <xsl:with-param name="marker" select="'.'" />
      </xsl:call-template>
    </xsl:variable>
    <xsl:variable name="basetypeNamespace">
      <xsl:choose>
        <xsl:when test="//edm:Schema[@Alias=$basetypeQualifier]">
          <xsl:value-of select="//edm:Schema[@Alias=$basetypeQualifier]/@Namespace" />
        </xsl:when>
        <xsl:otherwise>
          <xsl:value-of select="$basetypeQualifier" />
        </xsl:otherwise>
      </xsl:choose>
    </xsl:variable>
    <xsl:variable name="basetype">
      <xsl:call-template name="substring-after-last">
        <xsl:with-param name="input" select="$qualifiedBasetype" />
        <xsl:with-param name="marker" select="'.'" />
      </xsl:call-template>
    </xsl:variable>

    <!-- entity path template -->
    <xsl:text>,"/</xsl:text>
    <xsl:value-of select="@Name" />
    <xsl:text>(</xsl:text>
    <xsl:apply-templates
      select="//edm:Schema[@Namespace=$namespace]/edm:EntityType[@Name=$type]/edm:Key/edm:PropertyRef|//edm:Schema[@Namespace=$basetypeNamespace]/edm:EntityType[@Name=$basetype]/edm:Key/edm:PropertyRef"
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
    <xsl:apply-templates
      select="//edm:Schema[@Namespace=$namespace]/edm:EntityType[@Name=$type]/edm:Key/edm:PropertyRef|//edm:Schema[@Namespace=$basetypeNamespace]/edm:EntityType[@Name=$basetype]/edm:Key/edm:PropertyRef"
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
    <xsl:apply-templates
      select="//edm:Schema[@Namespace=$namespace]/edm:EntityType[@Name=$type]/edm:Key/edm:PropertyRef|//edm:Schema[@Namespace=$basetypeNamespace]/edm:EntityType[@Name=$basetype]/edm:Key/edm:PropertyRef"
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
    <xsl:apply-templates
      select="//edm:Schema[@Namespace=$namespace]/edm:EntityType[@Name=$type]/edm:Key/edm:PropertyRef|//edm:Schema[@Namespace=$basetypeNamespace]/edm:EntityType[@Name=$basetype]/edm:Key/edm:PropertyRef"
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

  <xsl:template name="entityTypeDescription">
    <xsl:param name="namespace" />
    <xsl:param name="type" />
    <xsl:param name="default" />
    <xsl:text>,"description":"</xsl:text>
    <!-- TODO: also allow element notation - extract into template and reuse -->
    <xsl:variable name="description"
      select="//edm:Schema[@Namespace=$namespace]/edm:EntityType[@Name=$type]/edm:Annotation[@Term=$coreDescription or @Term=$coreDescriptionAliased]/@String" />
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
    <xsl:if test="//edm:Schema[@Namespace=$namespace]/edm:Action[@Name=$action and not(@IsBound='true')]/edm:Parameter">
      <xsl:text>{"name":"body","in":"body","description":"Request body","schema":{"type":"object"</xsl:text>
      <xsl:apply-templates
        select="//edm:Schema[@Namespace=$namespace]/edm:Action[@Name=$action and not(@IsBound='true')]/edm:Parameter"
        mode="hash"
      >
        <xsl:with-param name="name" select="'properties'" />
      </xsl:apply-templates>
      <xsl:text>}}</xsl:text>
    </xsl:if>
    <xsl:text>]</xsl:text>

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
    <xsl:text>","in":"path","required":true,</xsl:text>
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

  <xsl:template match="edm:Annotations" mode="hashpair">
    <xsl:text>"</xsl:text>
    <xsl:value-of select="@Target" />
    <xsl:text>":{</xsl:text>
    <xsl:for-each select="key('targets', concat(../@Namespace,'/',@Target))">
      <xsl:if test="position()>1">
        <xsl:text>,</xsl:text>
      </xsl:if>
      <xsl:apply-templates select="*" mode="list">
        <xsl:with-param name="qualifier" select="@Qualifier" />
      </xsl:apply-templates>
    </xsl:for-each>
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template name="x-annotations">
    <xsl:param name="annotations" />
    <xsl:param name="members" />
    <xsl:apply-templates
      select="$annotations[(@Term=$coreDescription or @Term=$coreDescriptionAliased) and not(@Qualifier) and (@String or edm:String)]"
      mode="list2" />
    <xsl:variable name="remaining"
      select="$annotations[not((@Term=$coreDescription or @Term=$coreDescriptionAliased) and not(@Qualifier) and (@String or edm:String))]" />
    <xsl:if test="$remaining or $members">
      <xsl:text>,"x-annotations":{</xsl:text>
      <xsl:apply-templates select="$remaining" mode="list" />
      <xsl:if test="$members">
        <xsl:apply-templates select="$members" mode="list">
          <xsl:with-param name="after" select="$remaining" />
        </xsl:apply-templates>
      </xsl:if>
      <xsl:text>}</xsl:text>
    </xsl:if>
  </xsl:template>

  <xsl:template match="edm:Annotation">
    <xsl:param name="target" />
    <xsl:param name="qualifier" />
    <xsl:variable name="name">
      <xsl:value-of select="$target" />
      <xsl:text>@</xsl:text>
      <xsl:value-of select="@Term" />
      <xsl:if test="@Qualifier or $qualifier">
        <xsl:text>#</xsl:text>
        <xsl:value-of select="@Qualifier" />
        <xsl:value-of select="$qualifier" />
      </xsl:if>
    </xsl:variable>
    <xsl:text>"</xsl:text>
    <xsl:choose>
      <xsl:when
        test="(substring($name,2)=$coreDescription or substring($name,2)=$coreDescriptionAliased) and (@String or edm:String)"
      >
        <xsl:text>description</xsl:text>
      </xsl:when>
      <xsl:otherwise>
        <xsl:value-of select="$name" />
      </xsl:otherwise>
    </xsl:choose>
    <xsl:text>":</xsl:text>
    <xsl:apply-templates select="@*[local-name()!='Term' and local-name()!='Qualifier']|*[local-name()!='Annotation']"
      mode="list"
    >
      <xsl:with-param name="target" select="$name" />
    </xsl:apply-templates>
    <xsl:if test="count(@*[local-name()!='Term' and local-name()!='Qualifier']|*[local-name()!='Annotation'])=0">
      <!-- tagging term -->
      <!-- TODO: try to get default value from term definition, use true if not possible -->
      <xsl:text>true</xsl:text>
    </xsl:if>
    <xsl:apply-templates select="edm:Annotation" mode="list2">
      <xsl:with-param name="target" select="$name" />
    </xsl:apply-templates>
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
    <xsl:text>{"@odata.</xsl:text>
    <xsl:call-template name="lowerCamelCase">
      <xsl:with-param name="name" select="local-name()" />
    </xsl:call-template>
    <xsl:text>":"</xsl:text>
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
    <xsl:text>{"@odata.</xsl:text>
    <xsl:call-template name="lowerCamelCase">
      <xsl:with-param name="name" select="local-name()" />
    </xsl:call-template>
    <xsl:text>":[</xsl:text>
    <xsl:apply-templates select="*[local-name()!='Annotation']" mode="list" />
    <xsl:text>]</xsl:text>
    <xsl:apply-templates select="edm:Annotation" mode="list2" />
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template match="edm:Apply">
    <xsl:text>{"@odata.apply":"</xsl:text>
    <xsl:value-of select="@Function" />
    <xsl:text>","parameterValues":[</xsl:text>
    <xsl:apply-templates select="*[local-name()!='Annotation']" mode="list" />
    <xsl:text>]</xsl:text>
    <xsl:apply-templates select="edm:Annotation" mode="list2" />
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template match="edm:Cast|edm:IsOf">
    <xsl:text>{"@odata.</xsl:text>
    <xsl:call-template name="lowerCamelCase">
      <xsl:with-param name="name" select="local-name()" />
    </xsl:call-template>
    <xsl:text>":"</xsl:text>
    <xsl:value-of select="@Type" />
    <xsl:text>"</xsl:text>
    <xsl:apply-templates select="@MaxLength" />
    <xsl:apply-templates select="@*[local-name()!='Type' and local-name()!='MaxLength']" mode="list2" />
    <xsl:text>,"value":</xsl:text>
    <xsl:apply-templates select="node()" />
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template match="edm:LabeledElement">
    <xsl:text>{"@odata.labeledElement":"</xsl:text>
    <xsl:value-of select="ancestor::edm:Schema/@Namespace" />
    <xsl:text>.</xsl:text>
    <xsl:value-of select="@Name" />
    <xsl:text>","value":</xsl:text>
    <xsl:apply-templates select="@*[local-name()!='Name']|node()" />
    <xsl:text>}</xsl:text>
  </xsl:template>

  <xsl:template match="edm:LabeledElementReference">
    <xsl:text>{"@odata.labeledElementReference":"</xsl:text>
    <xsl:value-of select="." />
    <xsl:text>"}</xsl:text>
  </xsl:template>

  <xsl:template match="edm:Null">
    <xsl:text>{"@odata.null":{</xsl:text>
    <xsl:apply-templates select="@*|node()" mode="list" />
    <xsl:text>}}</xsl:text>
  </xsl:template>

  <xsl:template match="edm:Not|edm:UrlRef">
    <xsl:text>{"@odata.</xsl:text>
    <xsl:call-template name="lowerCamelCase">
      <xsl:with-param name="name" select="local-name()" />
    </xsl:call-template>
    <xsl:text>":</xsl:text>
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
    <xsl:param name="qualifier" />
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
      <xsl:with-param name="qualifier" select="$qualifier" />
    </xsl:apply-templates>
  </xsl:template>

  <!-- continuation of comma-separated list -->
  <xsl:template match="@*|*" mode="list2">
    <xsl:param name="target" />
    <xsl:param name="qualifier" />
    <xsl:text>,</xsl:text>
    <xsl:apply-templates select=".">
      <xsl:with-param name="target" select="$target" />
      <xsl:with-param name="qualifier" select="$qualifier" />
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
        <xsl:text>x-srid</xsl:text>
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