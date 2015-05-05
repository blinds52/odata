<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="1.0" exclude-result-prefixes="edmx1 edm2 edm sap m" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
  xmlns:edm="http://docs.oasis-open.org/odata/ns/edm" xmlns:edmx="http://docs.oasis-open.org/odata/ns/edmx" xmlns:edmx1="http://schemas.microsoft.com/ado/2007/06/edmx"
  xmlns:edm2="http://schemas.microsoft.com/ado/2008/09/edm" xmlns:sap="http://www.sap.com/Protocols/SAPData"
  xmlns:m="http://schemas.microsoft.com/ado/2007/08/dataservices/metadata" xmlns="http://docs.oasis-open.org/odata/ns/edm"
>
  <!--

    This style sheet transforms OData 2.0 $metadata documents into OData 4.0 EDMX documents.
    Existing constructs that have an equivalent in V4 are automatically translated.
    The retired primitive type Edm.DateTime is translated into Edm.DateTimeOffset.
    The retired primitive type Edm.Time is translated into the Edm.TimeOfDay.

    In addition the SAP annotations are translated into corresponding V4 annotations in the OASIS vocabularies or SAP vocabularies.

    TODO: TimeOfDay as target for Time
    TODO: IsComposable for functions generated from function imports
    TODO: translate more sap: annotations

  -->
  <xsl:output method="xml" indent="yes" />
  <xsl:strip-space elements="*" />

  <xsl:template match="edmx1:Edmx">
    <edmx:Edmx Version="4.0">
      <xsl:apply-templates />
    </edmx:Edmx>
  </xsl:template>

  <xsl:template match="edmx:Reference">
    <edmx:Reference>
      <xsl:apply-templates select="@*|node()" />
    </edmx:Reference>
  </xsl:template>

  <xsl:template match="edmx:Include">
    <edmx:Include>
      <xsl:copy-of select="@Namespace|@Alias" />
    </edmx:Include>
  </xsl:template>

  <xsl:template match="edmx:IncludeAnnotations">
    <edmx:IncludeAnnotations>
      <xsl:copy-of select="@Namespace|@Qualifier|@TargetNamespace" />
    </edmx:IncludeAnnotations>
  </xsl:template>

  <xsl:template match="edmx1:DataServices">
    <edmx:DataServices>
      <xsl:apply-templates />
    </edmx:DataServices>
  </xsl:template>

  <xsl:template match="edm2:Schema">
    <Schema xmlns="http://docs.oasis-open.org/odata/ns/edm">
      <xsl:copy-of select="@Namespace|@Alias" />
      <xsl:apply-templates />
      <xsl:apply-templates select="edm2:EntityContainer/edm2:FunctionImport" mode="Schema" />
    </Schema>
  </xsl:template>

  <xsl:template match="edm2:Property">
    <Property>
      <xsl:copy-of select="@Name" />
      <xsl:attribute name="Type">
        <xsl:choose>
          <xsl:when test="@Type='Time' or @Type='Edm.Time'">Edm.TimeOfDay</xsl:when>
          <xsl:when test="@Type='DateTime' or @Type='Edm.DateTime'">Edm.DateTimeOffset</xsl:when>
          <xsl:when test="contains(@Type,'.')"><xsl:value-of select="@Type" /></xsl:when>
          <xsl:otherwise><xsl:value-of select="concat('Edm.',@Type)" /></xsl:otherwise>
        </xsl:choose>
      </xsl:attribute>
      <xsl:if test="@Nullable != 'true'">
        <xsl:copy-of select="@Nullable" />
      </xsl:if>
      <xsl:apply-templates select="@DefaultValue|@MaxLength|@Precision|@Scale|@Unicode|@SRID|@sap:*|node()" />
    </Property>
  </xsl:template>

  <xsl:template match="edm2:NavigationProperty">
    <NavigationProperty>
      <xsl:copy-of select="@Name" />
      <!-- Extract @Type and @Multiplicity from matching Association/End -->
      <xsl:variable name="relation" select="@Relationship" />
      <xsl:variable name="assoc">
        <xsl:call-template name="substring-after-last">
          <xsl:with-param name="input" select="@Relationship" />
          <xsl:with-param name="marker" select="'.'" />
        </xsl:call-template>
      </xsl:variable>
      <xsl:variable name="fromrole" select="@FromRole" />
      <xsl:variable name="torole" select="@ToRole" />
      <xsl:variable name="type" select="../../edm2:Association[@Name=$assoc]/edm2:End[@Role=$torole]/@Type" />
      <xsl:variable name="mult" select="../../edm2:Association[@Name=$assoc]/edm2:End[@Role=$torole]/@Multiplicity" />
      <xsl:attribute name="Type">
        <xsl:choose>
          <xsl:when test="$mult='*'"><xsl:value-of select="concat('Collection(',$type,')')" /></xsl:when>
          <xsl:otherwise><xsl:value-of select="$type" /></xsl:otherwise>
        </xsl:choose>
      </xsl:attribute>
      <xsl:if test="$mult='1'">
        <xsl:attribute name="Nullable">false</xsl:attribute>
      </xsl:if>
      <xsl:variable name="partner"
        select="../../edm2:EntityType/edm2:NavigationProperty[@Relationship=$relation and @FromRole=$torole]/@Name" />
      <xsl:if test="$partner">
        <xsl:attribute name="Partner">
          <xsl:value-of select="$partner" />
        </xsl:attribute>
      </xsl:if>
      <xsl:apply-templates mode="NavProp"
        select="../../edm2:Association[@Name=$assoc]/edm2:End[@Role=$fromrole]/edm2:OnDelete" />
      <xsl:apply-templates mode="NavProp"
        select="../../edm2:Association[@Name=$assoc]/edm2:ReferentialConstraint/edm2:Principal[@Role=$torole]" />
      <xsl:apply-templates />
    </NavigationProperty>
  </xsl:template>

  <xsl:template match="edm2:OnDelete" mode="NavProp">
    <OnDelete>
      <xsl:copy-of select="@Action" />
      <xsl:apply-templates />
    </OnDelete>
  </xsl:template>

  <xsl:template match="edm2:PropertyRef" mode="NavProp">
    <xsl:variable name="index" select="position()" />
    <ReferentialConstraint>
      <xsl:attribute name="Property">
        <xsl:value-of select="../../edm2:Dependent/edm2:PropertyRef[$index]/@Name" />
      </xsl:attribute>
      <xsl:attribute name="ReferencedProperty">
        <xsl:value-of select="@Name" />
      </xsl:attribute>
    </ReferentialConstraint>
  </xsl:template>

  <xsl:template match="edm2:EntitySet">
    <xsl:variable name="name" select="@Name" />
    <EntitySet>
      <xsl:copy-of select="@Name|@EntityType" />
      <xsl:apply-templates select="@sap:*|node()" />
      <xsl:apply-templates select="../edm2:AssociationSet/edm2:End[@EntitySet=$name]" mode="Binding">
        <xsl:with-param name="entitytype" select="@EntityType" />
      </xsl:apply-templates>
    </EntitySet>
  </xsl:template>

  <xsl:template match="edm2:AssociationSet/edm2:End" mode="Binding">
    <xsl:param name="entitytype" />
    <xsl:variable name="role" select="@Role" />
    <xsl:variable name="set" select="../edm2:End[not(@Role=$role)]/@EntitySet" />
    <xsl:variable name="assoc" select="../@Association" />
    <xsl:variable name="navprop"
      select="../../../edm2:EntityType/edm2:NavigationProperty[@Relationship=$assoc and @FromRole=$role]/@Name" />
    <xsl:if test="$navprop">
      <xsl:variable name="namespace" select="../../../@Namespace" />
      <xsl:variable name="typename"
        select="../../../*/edm2:NavigationProperty[@Relationship=$assoc and @FromRole=$role]/../@Name" />
      <xsl:variable name="type" select="concat($namespace,'.',$typename)" />
      <NavigationPropertyBinding>
        <xsl:attribute name="Target"><xsl:value-of select="$set" /></xsl:attribute>
        <xsl:attribute name="Path">
          <xsl:if test="not($type=$entitytype)"><xsl:value-of select="concat($type,'/')" /></xsl:if>
          <xsl:value-of select="$navprop" />
        </xsl:attribute>
        <xsl:apply-templates />
      </NavigationPropertyBinding>
    </xsl:if>
  </xsl:template>

  <xsl:template match="edm2:FunctionImport">
    <xsl:choose>
      <xsl:when test="@m:HttpMethod='POST'">
        <ActionImport>
          <xsl:copy-of select="@Name|@EntitySet" />
          <xsl:attribute name="Action">
            <xsl:value-of select="../../@Namespace" />.<xsl:value-of select="@Name" />
          </xsl:attribute>
        </ActionImport>
      </xsl:when>
      <xsl:otherwise>
        <FunctionImport>
          <xsl:copy-of select="@Name|@EntitySet" />
          <xsl:attribute name="Function">
            <xsl:value-of select="../../@Namespace" />.<xsl:value-of select="@Name" />
          </xsl:attribute>
          <xsl:if test="not(edm2:Parameter)">
            <xsl:attribute name="IncludeInServiceDocument">true</xsl:attribute>
          </xsl:if>
        </FunctionImport>
      </xsl:otherwise>
    </xsl:choose>
  </xsl:template>

  <xsl:template match="edm2:FunctionImport" mode="Schema">
    <xsl:choose>
      <xsl:when test="@m:HttpMethod='POST'">
        <Action>
          <xsl:copy-of select="@Name|@EntitySetPath" />
          <xsl:if test="@IsBindable">
            <xsl:attribute name="IsBound"><xsl:value-of select="@IsBindable" /></xsl:attribute>
          </xsl:if>
          <xsl:apply-templates />
          <xsl:if test="@ReturnType">
            <ReturnType>
              <xsl:attribute name="Type"><xsl:value-of select="@ReturnType" /></xsl:attribute>
            </ReturnType>
          </xsl:if>
        </Action>
      </xsl:when>
      <xsl:otherwise>
        <Function>
          <xsl:copy-of select="@Name|@EntitySetPath|@IsComposable" />
          <xsl:if test="@IsBindable">
            <xsl:attribute name="IsBound"><xsl:value-of select="@IsBindable" /></xsl:attribute>
          </xsl:if>
          <xsl:apply-templates />
          <xsl:if test="@ReturnType">
            <ReturnType>
              <xsl:attribute name="Type"><xsl:value-of select="@ReturnType" /></xsl:attribute>
            </ReturnType>
          </xsl:if>
        </Function>
      </xsl:otherwise>
    </xsl:choose>
  </xsl:template>

  <xsl:template match="edm2:Function">
    <Function>
      <xsl:apply-templates select="@Name|node()" />
      <xsl:if test="@ReturnType">
        <ReturnType>
          <xsl:attribute name="Type">
            <xsl:if test="not(contains(@ReturnType,'.'))">
              <xsl:text>Edm.</xsl:text>
            </xsl:if>
            <xsl:value-of select="@ReturnType" />
          </xsl:attribute>
          <xsl:apply-templates select="@*[name() != 'Name' and name() != 'ReturnType']" />
        </ReturnType>
      </xsl:if>
    </Function>
  </xsl:template>

  <xsl:template match="edm2:Documentation">
    <!-- ignore this node and translate children -->
    <xsl:apply-templates />
  </xsl:template>

  <xsl:template match="edm2:Summary">
    <Annotation Term="Core.Description">
      <String>
        <xsl:value-of select="." />
      </String>
    </Annotation>
  </xsl:template>

  <xsl:template match="edm2:LongDescription">
    <Annotation Term="Core.LongDescription">
      <String>
        <xsl:value-of select="." />
      </String>
    </Annotation>
  </xsl:template>

  <xsl:template match="@Type|@UnderlyingType">
    <xsl:attribute name="{name()}"> 
      <xsl:if test="not(contains(.,'.'))">
        <xsl:text>Edm.</xsl:text>
      </xsl:if>
      <xsl:value-of select="." />
    </xsl:attribute>
  </xsl:template>

  <xsl:template match="@m:HasStream">
    <xsl:attribute name="HasStream">
      <xsl:value-of select="." />
    </xsl:attribute>
  </xsl:template>

  <!-- SAP annotations -->
  <xsl:template match="@sap:label">
    <Annotation Term="Common.Label">
      <xsl:attribute name="String">
        <xsl:value-of select="." />
      </xsl:attribute>
    </Annotation>
  </xsl:template>

  <xsl:template match="@sap:*">
    <Annotation>
      <xsl:attribute name="Term">
        <xsl:text>TODO.</xsl:text>
        <xsl:value-of select="local-name()" />
      </xsl:attribute>
      <xsl:attribute name="String">
        <xsl:value-of select="." />
      </xsl:attribute>
    </Annotation>
  </xsl:template>

  <!-- ignore -->
  <xsl:template match="@sap:content-version" />
  <xsl:template match="edm2:Association|edm2:AssociationSet|edm2:Using" />
  <xsl:template match="@Collation|@FixedLength|@Mode|edm2:Parameter/@DefaultValue" />
  <xsl:template match="@m:IsDefaultEntityContainer" />

  <!-- literally copy from edm2 to edm namespace -->
  <xsl:template match="edm2:*">
    <xsl:element name="{local-name()}">
      <xsl:apply-templates select="@*|node()" />
    </xsl:element>
  </xsl:template>

  <!-- literally copy OData 4.0 edm elements -->
  <xsl:template match="@edm:*|edm:*">
    <xsl:element name="{name()}">
      <xsl:apply-templates select="@*|node()" />
    </xsl:element>
  </xsl:template>

  <xsl:template match="@*">
    <xsl:copy />
  </xsl:template>

  <!-- get last segment -->
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