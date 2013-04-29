<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:edmx3="http://schemas.microsoft.com/ado/2009/11/edmx"
  xmlns:edm3="http://schemas.microsoft.com/ado/2009/11/edm" exclude-result-prefixes="edmx3 edm3"
>
  <xsl:strip-space elements="*" />
  <xsl:output method="xml" indent="yes" />

  <xsl:template match="edmx3:Edmx">
    <edmx:Edmx xmlns:edmx="http://docs.oasis-open.org/odata/ns/edmx" Version="4.0">
      <edmx:Reference Uri="http://tinyurl.com/Org-OData-Core">
        <edmx:Include Namespace="Org.OData.Core.V1" Alias="Core" />
      </edmx:Reference>
      <edmx:DataServices>
        <xsl:apply-templates />
      </edmx:DataServices>
    </edmx:Edmx>
  </xsl:template>

  <xsl:template match="edm3:Schema">
    <Schema xmlns="http://docs.oasis-open.org/odata/ns/edm">
      <xsl:copy-of select="@Namespace|@Alias" />
      <xsl:apply-templates />
    </Schema>
  </xsl:template>

  <xsl:template match="edm3:EntityType">
    <EntityType>
      <xsl:copy-of select="@Name|@Abstract|@BaseType|@OpenType" />
      <xsl:apply-templates />
    </EntityType>
  </xsl:template>

  <xsl:template match="edm3:Key">
    <Key>
      <xsl:apply-templates />
    </Key>
  </xsl:template>

  <xsl:template match="edm3:PropertyRef">
    <PropertyRef>
      <xsl:copy-of select="@Name" />
      <xsl:apply-templates />
    </PropertyRef>
  </xsl:template>

  <xsl:template match="edm3:ComplexType">
    <ComplexType>
      <xsl:copy-of select="@Name|@Abstract|@BaseType|@OpenType" />
      <xsl:apply-templates />
    </ComplexType>
  </xsl:template>

  <!-- TODO: properties (of complex types) may be marked as "navigation" properties -->
  <xsl:template match="edm3:Property">
    <xsl:choose>
      <xsl:when test="starts-with(edm3:Documentation/edm3:LongDescription,'#V4:NavigationProperty:')">
        <!-- Extract @Type and @Nullable from Documentation/LongDescription -->
        <!-- TODO: Extract @Nullable -->
        <NavigationProperty>
          <xsl:copy-of select="@Name" />
          <xsl:attribute name="Type">
            <xsl:value-of select="substring(edm3:Documentation/edm3:LongDescription,24)" />
          </xsl:attribute>
        </NavigationProperty>
      </xsl:when>
      <xsl:otherwise>
        <Property>
          <!-- TODO: @Name first -->
          <xsl:attribute name="Type">
            <xsl:choose>
              <!-- TODO: patch "Time" to "Edm.Duration -->
              <xsl:when test="edm3:Documentation/edm3:LongDescription = '#V4:Collection'">Collection(<xsl:value-of select="@Type" />)</xsl:when>
              <xsl:when test="contains(@Type,'.')"><xsl:value-of select="@Type" /></xsl:when>
              <xsl:otherwise><xsl:value-of select="concat('Edm.',@Type)" /></xsl:otherwise>
            </xsl:choose>
          </xsl:attribute>
          <xsl:copy-of select="@Name" />
          <xsl:if test="not(edm3:Documentation/edm3:LongDescription = '#V4:Collection')"><xsl:copy-of select="@Nullable" /></xsl:if>
          <xsl:copy-of select="@DefaultValue|@MaxLength|@Precision|@Scale|@Unicode|@SRID" />
          <xsl:apply-templates />
        </Property>
      </xsl:otherwise>
    </xsl:choose>
  </xsl:template>

  <xsl:template match="edm3:NavigationProperty">
    <NavigationProperty>
      <xsl:copy-of select="@Name" />
      <xsl:choose>
        <xsl:when test="substring-before(edm3:Documentation/edm3:LongDescription,':') = '#V4'">
          <!-- Extract @Type and @Nullable from Documentation/LongDescription -->
          <!-- TODO: Extract @Nullable -->
          <xsl:attribute name="Type">
            <xsl:value-of select="substring-after(edm3:Documentation/edm3:LongDescription,':')" />
          </xsl:attribute>
        </xsl:when>
        <xsl:otherwise>
          <!-- Extract @Type and @Multiplicity from matching Association/End -->
          <xsl:variable name="assoc">
            <xsl:call-template name="substring-after-last">
              <xsl:with-param name="input" select="@Relationship" />
              <xsl:with-param name="marker" select="'.'" />
            </xsl:call-template>
          </xsl:variable>
          <xsl:variable name="role" select="@ToRole" />
          <xsl:variable name="type" select="//edm3:Association[@Name=$assoc]/edm3:End[@Role=$role]/@Type" />
          <xsl:variable name="mult" select="//edm3:Association[@Name=$assoc]/edm3:End[@Role=$role]/@Multiplicity" />
          <xsl:attribute name="Type">
            <xsl:choose>
              <xsl:when test="$mult='*'"><xsl:value-of select="concat('Collection(',$type,')')" /></xsl:when>
              <xsl:otherwise><xsl:value-of select="$type" /></xsl:otherwise>
            </xsl:choose>
          </xsl:attribute>
          <xsl:if test="$mult='1'">
            <xsl:attribute name="Nullable">false</xsl:attribute>
          </xsl:if>
        </xsl:otherwise>
      </xsl:choose>
      <xsl:apply-templates />
    </NavigationProperty>
  </xsl:template>

  <xsl:template match="edm3:EnumType">
    <EnumType>
      <xsl:copy-of select="@Name|@IsFlags" />
      <xsl:attribute name="UnderlyingType">
        <xsl:value-of select="concat('Edm.',@UnderlyingType)" />
      </xsl:attribute>
      <!-- TODO: prefix UnderlyingType with Edm. -->
      <xsl:apply-templates />
    </EnumType>
  </xsl:template>

  <xsl:template match="edm3:Member">
    <Member>
      <xsl:copy-of select="@Name|@Value" />
      <!-- TODO: prefix UnderlyingType with Edm. -->
      <xsl:apply-templates />
    </Member>
  </xsl:template>

  <xsl:template match="edm3:EntityContainer">
    <EntityContainer>
      <xsl:copy-of select="@Name" />
      <xsl:apply-templates />
    </EntityContainer>
  </xsl:template>

  <xsl:template match="edm3:EntitySet">
    <EntitySet>
      <xsl:copy-of select="@Name|@EntityType" />
      <xsl:apply-templates />
    </EntitySet>
  </xsl:template>

  <xsl:template match="edm3:Documentation">
    <xsl:apply-templates />
  </xsl:template>

  <xsl:template match="edm3:Summary">
    <Annotation Term="Core.Description">
      <String>
        <xsl:value-of select="." />
      </String>
    </Annotation>
  </xsl:template>

  <xsl:template match="edm3:LongDescription">
    <xsl:if test="substring-before(.,':') != '#V4'">
      <Annotation Term="Core.LongDescription">
        <String>
          <xsl:value-of select="." />
        </String>
      </Annotation>
    </xsl:if>
  </xsl:template>

  <!-- TODO: NavigationPropertyBinding -->
  <!-- TODO: FunctionImport, FunctionImport->Function:for-each in Schema -->
  <!-- TODO: replace schema namespace with alias in type references? -->

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

</xsl:stylesheet>