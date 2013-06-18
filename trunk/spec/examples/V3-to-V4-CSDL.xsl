<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:edmx1="http://schemas.microsoft.com/ado/2007/06/edmx"
  xmlns:edmx3="http://schemas.microsoft.com/ado/2009/11/edmx" xmlns:edm3="http://schemas.microsoft.com/ado/2009/11/edm" xmlns:m="http://schemas.microsoft.com/ado/2007/08/dataservices/metadata"
  exclude-result-prefixes="edmx1 edmx3 edm3 m"
>
  <!--
    This style sheet transforms OData 3.0 $metadata documents or VS2012 EDMX 3.0 documents into OData 4.0 EDMX documents.
    Existing constructs that have an equivalent in V4 are automatically translated.
    The retired primitive type Edm.DateTime is translated into Edm.DateTimeOffset.
    The retired primitive type Edm.Time is translated into the Edm.Duration.
    <edmx:Reference> elements automatically get an <edmx:Include> child element with an invalid Namespace attribute value.
    Change the Namespace attribute value appropriately.

    V4 features that are not available in V3 can be produced via the following workarounds.

    To model navigation properties to the abstract V4 entity type Edm.EntityType create an entity type named V4_Edm_EntityType
    and an identically named entity set to your model. This type will be ignored, and navigation to it will be replaced with
    navigation to Edm.EntityType. Don't define referential constraints on associations to this dummy entity type.

    To model partner attributes for unidirectional relationships enter #V4:Partner: followed by the value of the Partner attribute
    into the LongDescription of the Documentation of the navigation property.

    To model properties that are collections of complex or primitive type in VS2012 Entity Modeler, enter #V4:Collection
    into the LongDescription of the Documentation.

    To model nullable complex properties, enter #V4:Nullable into the LongDescription of the Documentation.

    To model properties with the new abstract or concrete Edm types, enter #V4:Type: followed by the desired type into the
    LongDescription of the Documentation. The value after the second colon is taken literally, so you can use Collection(...)
    for collection-valued properties. Use fully qualified types in the literal to produce valid V4 CSDL.

    To model navigation properties in complex types, enter #V4:Navigation: followed by the target type into the LongDescription
    of the Documentation. The value after the second colon is taken literally, so you can use Collection(...) for collection-valued
    navigation properties. Use fully qualified types in the literal to produce valid V4 CSDL.
    
    To model derived complex types, add a complex property named V4_BaseType that is typed with the base complex type.
    
    To model abstract complex types, add a property named V4_Abstract of any type.
    
    To model type definitions, add a complex type with the name of the type definition and a property named V4_TypeDefinition
    that has the underlying type and the facets fixed by the type definition.
  -->

  <!-- TODO: Use Alias instead of Namespace as qualifier -->
  <!-- TODO: Annotations, ValueAnnotation -> Annotation, TypeAnnotation -> Annotation with Record -->

  <xsl:output method="xml" indent="yes" />
  <xsl:strip-space elements="*" />

  <xsl:template match="edmx1:Edmx|edmx3:Edmx">
    <edmx:Edmx xmlns:edmx="http://docs.oasis-open.org/odata/ns/edmx" Version="4.0">
      <edmx:Reference Uri="http://tinyurl.com/Org-OData-Core">
        <edmx:Include Namespace="Org.OData.Core.V1" Alias="Core" />
      </edmx:Reference>
      <xsl:apply-templates />
    </edmx:Edmx>
  </xsl:template>

  <xsl:template match="edmx1:Reference">
    <edmx:Reference xmlns:edmx="http://docs.oasis-open.org/odata/ns/edmx">
      <xsl:attribute name="Uri">
        <xsl:value-of select="@Url" />
      </xsl:attribute>
      <!--
        <edmx:Include Namespace="Insert included namespace here" />
      -->
    </edmx:Reference>
  </xsl:template>

  <xsl:template match="edmx1:DataServices|edmx3:ConceptualModels">
    <edmx:DataServices xmlns:edmx="http://docs.oasis-open.org/odata/ns/edmx">
      <xsl:apply-templates />
    </edmx:DataServices>
  </xsl:template>

  <xsl:template match="edm3:Schema">
    <Schema xmlns="http://docs.oasis-open.org/odata/ns/edm">
      <xsl:copy-of select="@Namespace|@Alias" />
      <xsl:apply-templates />
      <xsl:apply-templates select="edm3:EntityContainer/edm3:FunctionImport" mode="Schema" />
    </Schema>
  </xsl:template>

  <xsl:template match="edm3:EntityType">
    <xsl:if test="@Name != 'V4_Edm_EntityType'">
      <EntityType>
        <xsl:copy-of select="@Name|@Abstract|@BaseType|@OpenType" />
        <xsl:apply-templates select="@m:HasStream|edm3:Key" />
        <!-- TODO: add |edm3:ValueAnnotation|edm3:TypeAnnotation if necessary -->
        <xsl:apply-templates select="edm3:Documentation|edm3:Property|edm3:NavigationProperty" />
      </EntityType>
    </xsl:if>
  </xsl:template>

  <xsl:template match="@m:HasStream">
    <xsl:attribute name="HasStream">
      <xsl:value-of select="." />
    </xsl:attribute>
  </xsl:template>

  <xsl:template match="edm3:Key">
    <Key>
      <xsl:apply-templates select="edm3:PropertyRef" mode="Key" />
    </Key>
  </xsl:template>

  <xsl:template match="edm3:PropertyRef" mode="Key">
    <PropertyRef>
      <xsl:copy-of select="@Name" />
      <xsl:apply-templates />
    </PropertyRef>
  </xsl:template>

  <xsl:template match="edm3:ComplexType[edm3:Property[@Name='V4_TypeDefinition']]">
    <TypeDefinition>
      <xsl:copy-of select="@Name" />
      <xsl:attribute name="UnderlyingType">
        <xsl:choose>
          <xsl:when test="contains(@Type,'.')"><xsl:value-of select="edm3:Property[@Name = 'V4_TypeDefinition']/@Type" /></xsl:when>
          <xsl:when test="not(contains(@Type,'.'))">Edm.<xsl:value-of select="edm3:Property[@Name = 'V4_TypeDefinition']/@Type" /></xsl:when>
        </xsl:choose>
      </xsl:attribute>
      <xsl:copy-of select="edm3:Property[@Name = 'V4_TypeDefinition']/@MaxLength" />
      <xsl:copy-of select="edm3:Property[@Name = 'V4_TypeDefinition']/@Precision" />
      <xsl:copy-of select="edm3:Property[@Name = 'V4_TypeDefinition']/@Scale" />
      <xsl:copy-of select="edm3:Property[@Name = 'V4_TypeDefinition']/@Unicode" />
      <xsl:copy-of select="edm3:Property[@Name = 'V4_TypeDefinition']/@SRID" />
    </TypeDefinition>
  </xsl:template>
  
  <xsl:template match="edm3:ComplexType">
    <ComplexType>
      <xsl:copy-of select="@Name|@Abstract|@BaseType|@OpenType" />
      <xsl:if test="edm3:Property[@Name = 'V4_BaseType']">
        <xsl:attribute name="BaseType">
          <xsl:value-of select="edm3:Property[@Name = 'V4_BaseType']/@Type" />
        </xsl:attribute>
      </xsl:if>
      <xsl:if test="edm3:Property[@Name = 'V4_Abstract']">
        <xsl:attribute name="Abstract">
          <xsl:value-of select="'true'" />
        </xsl:attribute>
      </xsl:if>
      <xsl:apply-templates />
    </ComplexType>
  </xsl:template>

  <xsl:template match="edm3:Property">
    <xsl:choose>
      <xsl:when test="starts-with(edm3:Documentation/edm3:LongDescription,'#V4:Navigation:')">
        <NavigationProperty>
          <xsl:copy-of select="@Name" />
          <xsl:attribute name="Type">
            <xsl:value-of select="substring(edm3:Documentation/edm3:LongDescription,16)" />
          </xsl:attribute>
          <xsl:if test="not(starts-with(substring(edm3:Documentation/edm3:LongDescription,16),'Collection(') or @Nullable='true')">
            <xsl:copy-of select="@Nullable" />
          </xsl:if>
        </NavigationProperty>
      </xsl:when>
      <xsl:when test="@Name = 'V4_Abstract'" />
      <xsl:when test="@Name = 'V4_BaseType'" />
      <xsl:otherwise>
        <Property>
          <xsl:copy-of select="@Name" />
          <xsl:attribute name="Type">
            <xsl:choose>
              <xsl:when test="edm3:Documentation/edm3:LongDescription = '#V4:Collection'">
                <xsl:choose>
                  <xsl:when test="contains(@Type,'.')">Collection(<xsl:value-of select="@Type" />)</xsl:when>
                  <xsl:when test="not(contains(@Type,'.'))">Collection(Edm.<xsl:value-of select="@Type" />)</xsl:when>
                </xsl:choose>
              </xsl:when>
              <xsl:when test="starts-with(edm3:Documentation/edm3:LongDescription,'#V4:Type:')"><xsl:value-of select="substring(edm3:Documentation/edm3:LongDescription,10)" /></xsl:when>
              <xsl:when test="@Type='Time' or @Type='Edm.Time'">Edm.Duration</xsl:when>
              <xsl:when test="@Type='DateTime' or @Type='Edm.DateTime'">Edm.DateTimeOffset</xsl:when>
              <xsl:when test="contains(@Type,'.')"><xsl:value-of select="@Type" /></xsl:when>
              <xsl:otherwise><xsl:value-of select="concat('Edm.',@Type)" /></xsl:otherwise>
            </xsl:choose>
          </xsl:attribute>
          <xsl:choose>
            <xsl:when test="edm3:Documentation/edm3:LongDescription = '#V4:Nullable'" />
            <xsl:when test="not(edm3:Documentation/edm3:LongDescription = '#V4:Collection' or @Nullable='true')">
              <xsl:copy-of select="@Nullable" />
            </xsl:when>
          </xsl:choose>
          <xsl:copy-of select="@DefaultValue|@MaxLength|@Precision|@Scale|@Unicode|@SRID" />
          <xsl:apply-templates />
        </Property>
      </xsl:otherwise>
    </xsl:choose>
  </xsl:template>

  <xsl:template match="edm3:NavigationProperty">
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
      <xsl:variable name="type" select="../../edm3:Association[@Name=$assoc]/edm3:End[@Role=$torole]/@Type" />
      <xsl:variable name="mult" select="../../edm3:Association[@Name=$assoc]/edm3:End[@Role=$torole]/@Multiplicity" />
      <xsl:attribute name="Type">
        <xsl:choose>
          <xsl:when test="contains($type,'.V4_Edm_EntityType') and $mult='*'">Collection(Edm.EntityType)</xsl:when>
          <xsl:when test="contains($type,'.V4_Edm_EntityType')">Edm.EntityType</xsl:when>
          <xsl:when test="$mult='*'"><xsl:value-of select="concat('Collection(',$type,')')" /></xsl:when>
          <xsl:otherwise><xsl:value-of select="$type" /></xsl:otherwise>
        </xsl:choose>
      </xsl:attribute>
      <xsl:if test="$mult='1'">
        <xsl:attribute name="Nullable">false</xsl:attribute>
      </xsl:if>
      <xsl:variable name="partner" select="../../edm3:EntityType/edm3:NavigationProperty[@Relationship=$relation and @FromRole=$torole]/@Name" />
      <xsl:choose>
        <xsl:when test="$partner">
          <xsl:attribute name="Partner">
            <xsl:value-of select="$partner" />
          </xsl:attribute>
        </xsl:when>
        <xsl:when test="starts-with(edm3:Documentation/edm3:LongDescription,'#V4:Partner:')">
          <xsl:attribute name="Partner">
            <xsl:value-of select="substring(edm3:Documentation/edm3:LongDescription,13)" />
          </xsl:attribute>
        </xsl:when>
      </xsl:choose>
      <xsl:apply-templates mode="NavProp" select="../../edm3:Association[@Name=$assoc]/edm3:End[@Role=$fromrole]/edm3:OnDelete" />
      <xsl:apply-templates mode="NavProp" select="../../edm3:Association[@Name=$assoc]/edm3:ReferentialConstraint/edm3:Principal[@Role=$torole]" />
      <xsl:apply-templates />
    </NavigationProperty>
  </xsl:template>

  <xsl:template match="edm3:OnDelete" mode="NavProp">
    <OnDelete>
      <xsl:copy-of select="@Action" />
      <xsl:apply-templates />
    </OnDelete>
  </xsl:template>

  <xsl:template match="edm3:PropertyRef" mode="NavProp">
    <xsl:variable name="index" select="position()" />
    <ReferentialConstraint>
      <xsl:attribute name="Property">
        <xsl:value-of select="../../edm3:Dependent/edm3:PropertyRef[$index]/@Name" />
      </xsl:attribute>
      <xsl:attribute name="ReferencedProperty">
        <xsl:value-of select="@Name" />
      </xsl:attribute>
    </ReferentialConstraint>
  </xsl:template>

  <xsl:template match="edm3:EnumType">
    <EnumType>
      <xsl:copy-of select="@Name|@IsFlags" />
      <xsl:if test="@UnderlyingType">
        <xsl:attribute name="UnderlyingType">
          <xsl:value-of select="concat('Edm.',@UnderlyingType)" />
        </xsl:attribute>
      </xsl:if>
      <xsl:apply-templates />
    </EnumType>
  </xsl:template>

  <xsl:template match="edm3:Member">
    <Member>
      <xsl:copy-of select="@Name|@Value" />
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
    <xsl:if test="@Name != 'V4_Edm_EntityType'">
      <EntitySet>
        <xsl:copy-of select="@Name|@EntityType" />
        <xsl:apply-templates />
        <xsl:variable name="name" select="@Name" />
        <xsl:apply-templates select="../edm3:AssociationSet/edm3:End[@EntitySet=$name]" mode="Binding">
          <xsl:with-param name="entitytype" select="@EntityType" />
        </xsl:apply-templates>
      </EntitySet>
    </xsl:if>
  </xsl:template>

  <xsl:template match="edm3:AssociationSet/edm3:End" mode="Binding">
    <xsl:param name="entitytype" />
    <xsl:variable name="role" select="@Role" />
    <xsl:variable name="set" select="../edm3:End[not(@Role=$role)]/@EntitySet" />
    <xsl:if test="$set!='V4_Edm_EntityType'">
      <xsl:variable name="assoc" select="../@Association" />
      <xsl:variable name="navprop" select="../../../edm3:EntityType/edm3:NavigationProperty[@Relationship=$assoc and @FromRole=$role]/@Name" />
      <xsl:if test="$navprop">
        <xsl:variable name="namespace" select="../../../@Namespace" />
        <xsl:variable name="typename" select="../../../*/edm3:NavigationProperty[@Relationship=$assoc and @FromRole=$role]/../@Name" />
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
    </xsl:if>
  </xsl:template>

  <xsl:template match="edm3:FunctionImport">
    <xsl:choose>
      <xsl:when test="@IsSideEffecting='true'">
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
          <xsl:if test="not(edm3:Parameter)">
            <xsl:attribute name="IncludeInServiceDocument">true</xsl:attribute>
          </xsl:if>
        </FunctionImport>
      </xsl:otherwise>
    </xsl:choose>
  </xsl:template>

  <xsl:template match="edm3:FunctionImport" mode="Schema">
    <xsl:choose>
      <xsl:when test="@IsSideEffecting='true'">
        <Action>
          <xsl:copy-of select="@Name|@ReturnType|@EntitySetPath" />
          <xsl:if test="@IsBindable">
            <xsl:attribute name="IsBound"><xsl:value-of select="@IsBindable"/></xsl:attribute>
          </xsl:if>
          <xsl:apply-templates />
        </Action>
      </xsl:when>
      <xsl:otherwise>
        <Function>
          <xsl:copy-of select="@Name|@ReturnType|@EntitySetPath|@IsComposable" />
          <xsl:if test="@IsBindable">
            <xsl:attribute name="IsBound"><xsl:value-of select="@IsBindable"/></xsl:attribute>
          </xsl:if>
          <xsl:apply-templates />
        </Function>
      </xsl:otherwise>
    </xsl:choose>
  </xsl:template>

  <xsl:template match="edm3:Parameter">
    <Parameter>
      <xsl:copy-of select="@Name|@Type|@Nullable|@MaxLength|@Precision|@Scale|@SRID" />
      <xsl:apply-templates />
    </Parameter>
  </xsl:template>

  <xsl:template match="edm3:ReturnType">
    <ReturnType>
      <xsl:copy-of select="@Name|@Type|@Nullable|@MaxLength|@Precision|@Scale|@SRID" />
      <xsl:apply-templates />
    </ReturnType>
  </xsl:template>

  <xsl:template match="edm3:Association" />
  <xsl:template match="edm3:AssociationSet" />

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