#OData meeting #44, Monday, 11 Jul 2013, 0800 - 1000 PT

**Note**: For explanations of conventions and other formal aspects common to OData TC meeting minutes which are used in this document please cf. "[Formal Aspects of Meeting Minutes](https://www.oasis-open.org/committees/download.php/48109/formal-aspects-meeting-minutes-v1.html)".

Meeting chaired by Barbara Hartel

## 1 Roll call

### 1.1 Members Present:

        Barbara Hartel (SAP AG)
        Dale Moberg (Axway Software)
        Diane Downie (Citrix Systems)
        Edmond Bourne (BlackBerry)
        Hubert Heijkers (IBM)
        John Willson (Individual)
        Ken Baclawski (Northeastern University)
        Martin Zurmuehl (SAP AG)
        Matthew Borges (SAP AG) a.k.a. Matt
        Michael Pizzo (Microsoft) a.k.a. Mike
        Nuno Linhares (SDL)
        Ralf Handl (SAP AG)
        Robert Richards (Mashery)
        Stan Mitranic (CA Technologies)
        Stefan Drees (Individual)
        Susan Malaika (IBM)
        Ted Jones (Red Hat)

Quorum achieved. Details cf. [normative attendance sheet for this meeting](https://www.oasis-open.org/apps/org/workgroup/odata/event.php?event_id=34205).

## 2 Classification of Changes to CSPRD02

###2.1 Document Part 1: Protocol

Change Section 10.17: Removed superfluous dot character
Last sentence of the section contained a dot character in the middle of a sentence. This dot was removed.

Section 11.6: Removed superfluous space character
Paragraph 6, Sentence 4 contained two consecutive space characters. One of them was removed.

All: Change Section 10.17 and Section 11.6 are agreed to be non-material

###2.2 Document Part 3: CSDL

Several Sections: Removed superfluous space characters
In several sentences, two consecutive space characters were reduced to one space character.

All: This editorial change is non-material.

Section 6.2.7: Removed reference to function invocation for DefaultValue attribute
This reference should have been removed when applying ODATA-449.

All: Correcting this sentence does not add or remove a feature, so it is a non-material change.

Section 13.5.1: Changed SimpleIdentifier to QualifiedName
This was a typo; the Action attribute is defined as a QualifiedName in section 13.5.2.

All: Correcting this typo does not add or remove a feature, so it is a non-material change.

Section 13.6.1: Changed SimpleIdentifier to QualifiedName
This was a typo; the Function attribute is defined as a QualifiedName in section 13.6.2.

All: Correcting this typo does not add or remove a feature, so it is a non-material change.

Section 14.5.3.1.2: Clarify that return type of function odata.fillUriTemplate is Edm.String
From the description, it was (implicitly) clear that the return type of the function odata.fillUriTemplate is Edm.String.

All: Making the return type explicit does not add or remove a feature, so it is a non-material change.

Section 14.5.8.1: Clarified uniqueness of attribute Name
The SimpleIdentifier (as all other simple identifiers in CSDL) is unique within the schema.

All: Making this explicit does not add or remove a feature, so it is a non-material change.

Section 14.5.9: Changed SimpleIdentifier to QualifiedName
This was a typo; LabeledElementReference refers to a named element in scope, and as per section 3.3 this is consistently done in CSDL with a QualifiedName.

All: Correcting the description does not add or remove a feature, so it is a non-material change.

Section 14.5.15: Changed Url expression to UrlRef expression
This was a typo; the name of the expression is edm:UrlRef. At one place, we corrected Url expression to UrlRef expression.

All: Correcting the description does not add or remove a feature, so it is a non-material change.

All agree that changes in Part 3: CSDL above are non material

###2.3 XML Schema edm.xsd

Removed attribute IsDefaultEntityContainer from element EntityContainer
The attribute was removed from CSDL with ODATA-435 and should have been removed here, too.

All: Correcting the schema does not add or remove a feature, so it is a non-material change.

Removed attribute EntitySetPath from element ReturnType
The attribute is defined for the parent elements Action and Function of element ReturnType.

All: Correcting the schema does not add or remove a feature, so it is a non-material change.

Changed type of body for element LabeledElementReference
This was a typo; LabeledElementReference refers to a named element in scope, and as per CSDL section 3.3 this is consistently done in CSDL with a QualifiedName.
All: Correcting the schema does not add or remove a feature, so it is a non-material change.

Changed list of enumeration values for type TAppliesTo
The enumeration TAppliesTo is a true subset of the list of annotatable CSDL elements defined in CSDL section 14.3 and contained two typos:
Replaced Annotations with Annotation. The Annotations element (with trailing s) cannot be annotated while the Annotation element (without trailing s) can, see CSDL section 14.3.
Removed Documentation. This CSDL element was removed with ODATA-360.
Added missing values for annotatable CSDL elements that were introduced after introducing the AppliesTo attribute.

All: Correcting the schema does not add or remove a feature, so it is a non-material change.

Removed comments on document status
The "front matter" comments were copied from a working draft template, and the Status section did not make sense in this text document.

All agree that the changes in XML Schema edm.xsd are non-material

###2.4 abnf-construction-rules.txt

Removed comments on document status
The "front matter" comments were copied from a working draft template, and the Status section did not make sense in this text document.

All: Removing the comments does not add or remove a feature, so it is a non-material change.

Extracted rule CollectionNavPath from rule CollectionNavigation
A fragment of rule CollectionNavigation was explicitly named CollectionNavPath to allow easier reference and future extensibility. This does not change the lexical patterns accepted by the grammar.

All: Extracting the rule does not add or remove a feature, so it is a non-material change.

All agree that the changes in abnf-construction-rules.txt are non-material

###2.5 Org.OData.Capabilities.V1.xml, Org.OData.Measures.V1.xml and Org.OData.Atom.V1.xml

Changed value of Uri attribute in line 3 of every file.
The value was a link to the current SVN copy instead of a link to the future publishing location of the committee specification.


All agree that the changes in Org.OData.Capabilities.V1.xml, Org.OData.Measures.V1.xml and Org.OData.Atom.V1.xml above are non-material

###2.6 Changes to Non-Normative Examples

####2.6.1 Part 1: Protocol

Section 11.5.2, Example 71: Corrected two typos
Changed #SampleEntities.MostRecent to #SampleEntities.MostRecentOrder and MostRecentOrder to MostRecentOrder(). Now the example is consistent and correct.

Section 11.5.3.1.1, Example 72: Deleted this request
This was a meaningless text fragment.

Section 11.5.3.1.1, Example 74: Deleted Sales. and clarified description
Sales. was a typo in the URL, and the example description was misleading.

All agree that the changes above in the examples of Part 1: Protocol are non-material

####2.6.2 Part 2: URL Conventions

Section 4.4, Example 25: Changed Products('Bread')  to Products(0)
This example was inconsistent with the other examples in the document.

Section 4.4, Example 36: Added Sample Response
The example for a cross-join request lacked a response.

All agree that the changes above of Part 2: URL Conventions are non-material

####2.6.3 Part 3: CSDL

Section 13, Example 28: Changed Function to Action and added space characters
This was a typo; the attribute is named Action and not Function, see section 13.5.2.

Section 14.5.9, Example 60: Changed DisplayName to Model.CustomerFirstName
This was a typo; the example is now consistent with example 59.

Section 16.1, Example 84: Removed attribute IsDefaultEntityContainer
The attribute should have been removed when applying ODATA-435.

Section 16.1, Example 84: Added edmx:Reference element
The reference to the Core vocabulary was missing, adding it made the example correct.

Section 16.1, Example 84: Changed value of Uri attribute
The value was a link to the current SVN copy instead of a link to the future publishing location of the committee specification.

Section 16.2, Example 85: Changed Self to Vocabulary1
This was a typo.


All agree that the chenages in Part 3: CSDL abobve are non-material

####2.6.4 Atom Format

Section 14, Example 37: Corrected one typo
Corrected a metadata:context URL (changed Orders to Customers).

Section 15.1.1, Example 40: Added missing parameter to function
This was a typo.

All agree that the changes babove in Atom Format are non-material

####2.6.5 JSON Format

Chapter 13, Example 28: Corrected two typos
The context URL still contained the suffix /$entity that was removed with ODATA-439.

Chapter 13, Example 29: Corrected three typos
The context URL was missing the Collection() introduced with ODATA-439, and the odata.id values were missing the closing parentheses.

Chapter 15, Example 30: Corrected two typos
Remove a blank in the first odata.context URL and corrected a context URL (changed Orders to Customers)

Chapter 15, Example 32: Added missing parameter to function
This was a typo.

All agree that the changes above in JSON Format are non-material

##3 Feedback to "Changes to V3"

Discussion:

* All: Add history of this spec in introduction
* All: Highlight main new features
* All: Have a few paragraph highlighting the history and why this new version was created
* Mike will write "history"
* Ralf will Mention change of "substring" to "contains"

## 4 Next Meetings

### 4.1 Meeting on 2013-07-18 by Call during 0800-1000 PT

Agreed.

## 5 AOB

None.

Meeting adjourned on 0900 PT

## Timeline Reference [TL_REF]

**Note**: Please cf. the current revision of the [TC timeline](https://www.oasis-open.org/committees/download.php/49178/TC%20Timeline%205.htm).


