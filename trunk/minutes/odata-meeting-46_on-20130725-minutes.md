#OData meeting #46, Monday, 25 Jul 2013, 0800 - 1000 PT

**Note**: For explanations of conventions and other formal aspects common to OData TC meeting minutes which are used in this document please cf. "[Formal Aspects of Meeting Minutes](https://www.oasis-open.org/committees/download.php/48109/formal-aspects-meeting-minutes-v1.html)".

Meeting chaired by Barbara Hartel

## 1 Roll call

### 1.1 Members Present:

        Barbara Hartel (SAP AG)
        Dale Moberg (Axway Software)
        Diane Downie (Citrix Systems)
        Edmond Bourne (BlackBerry)
        Gerald Krause (SAP AG)
        John Willson (Individual)
        Ken Baclawski (Northeastern University)
        Martin Zurmuehl (SAP AG)
        Matthew Borges (SAP AG) a.k.a. Matt
        Michael Pizzo (Microsoft) a.k.a. Mike
        Patrick Durusau (Individual)
        Ralf Handl (SAP AG)
        Stan Mitranic (CA Technologies)
        Stefan Drees (Individual)
        Susan Malaika (IBM)

Quorum achieved. Details cf. [normative attendance sheet for this meeting](https://www.oasis-open.org/apps/org/workgroup/odata/event.php?event_id=34207).

## 2 Approval of Agenda

Approved.

## 3 Approval of Minutes from Previous Meeting(s)

### 3.1 Approval of [Minutes of 2013-07-18 Meeting#45](https://www.oasis-open.org/committees/download.php/50026/odata-meeting-45_on-20130718-minutes.html)

**Meeting minutes approved with no objections**.

## 4 Review of [Action Items](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_items.php) (AI) and Progress [AIH]

Context:
> See the "[List of Open Action Items Before the Meeting][AI_REF]" section in the appendix.

###4.1 Action items due by 2013-07-25 (end of day)

None.

###4.2 Action items NOT due by 2013-07-25 (end of day) but MAY be ready for closure

None.


##5 Review of [Issues List](https://tools.oasis-open.org/issues/secure/IssueNavigator.jspa?reset=true&mode=hide&pid=10103&sorter/field=issuekey&sorter/order=ASC) (IL) and Progress [IPH]

**Notes**:

* Issues in this section (5) may have been progressed out of sequence, but have been noted here to better group by components impacted or state before the meeting and as a service for the reader.
* There is an "[Index of Issues Processed During the Meeting][IP_REF]" section in the appendix.

###5.1 [ODATA-465](https://tools.oasis-open.org/issues/browse/ODATA-465)

ODATA-465:
: "Explicitly mention that complex type instances can have stream properties (public comment c201307e00000)" [components: OData JSON Format, OData ATOM Format] is **Applied**.


Ralf:
>I **move** to close ODATA-465 as applied. **Mike seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-465:
: "Explicitly mention that complex type instances can have stream properties (public comment c201307e00000)" [components: OData JSON Format, OData ATOM Format] is **Closed** with no objections.


###5.2 [ODATA-391](https://tools.oasis-open.org/issues/browse/ODATA-391)

ODATA-391:
: "Add query function isdefined(PropertyPath) to determine whether an instance has a property of that name" [component: OData Extension for Data Aggregation] is **Applied**.

Ralf:
>I **move** to close ODATA-391 as applied. **John seconds**.

**No further discussion**. **No objections**. The **motion passes**.

Add query function isdefined(PropertyPath) to determine whether an instance has a property of that name" [component: OData Extension for Data Aggregation] is **Closed** with no objections.

###5.3 [ODATA-461](https://tools.oasis-open.org/issues/browse/ODATA-461)

ODATA-461:
: "Explicitly disallow certain XML constructs (for CSDL, ATOM) to enhance OData security" [component: Securing Open Data] is **New**.

Discussion:

* Ralf summarizes that "Servers MUST reject XML documents with XML DOCTYPE definitions, XML ENTITY definitions, and XML processing instructions. Clients MAY reject XML documents with XML DOCTYPE definitions, XML ENTITY definitions, and XML processing instructions."
* Ralf suggests the component: Securing Open Data
* John volunteers to be editor for the Committee Note Securing OData Version 4.0
* Barbara will create action item for Securing Open Data with due date for the action item september 5
* All agree

ODATA-461:
: "Explicitly disallow certain XML constructs (for CSDL, ATOM) to enhance OData security" [component: Securing Open Data] is **Open** with no objections.

##6 Review Non-Material Changes

###6.1 CSDL

Section 7.2: Clarified that a navigation property can have multiple referential constraints
OData supports multi-part keys, so multiple referential constraints can be present.

Making this explicit does not add or remove a feature, so it is a non-material change.

Section 7.3: Clarified that a navigation property can have at most one OnDelete element
The on-delete actions are mutually exclusive, so more than one OnDelete element does not make sense.

Making this explicit does not add or remove a feature, so it is a non-material change.

Section 14.5: Added edm:AnnotationPath to list of expressions supporting attribute notation
The edm:AnnotationPath is defined in section 14.5.2 as allowing both element and attribute notation. It was forgotten this introductory section.

Correcting the list does not add or remove a feature, so it is a non-material change.

All agree that these changes are non-material

###6.2 Atom Format

Section 9.1: Added or complex type instance and removed of an entity
CSDL sections 9 and 4.4 state that complex types can have stream properties. This was not explicitly stated in the format specification, the text only mentioned entities.

Making the description more explicit does not add or remove a feature, so it is a non-material change.

###6.3 JSON Format

Chapter 5: Changed odata.value to value
This was a typo; all top-level collections are represented as a name-value pair with name "value". Also the accompanying example used the correct name.

Correcting the typo does not add or remove a feature, so it is a non-material change.

Chapter 9: Added or complex type instance and changed entity to representation
CSDL sections 9 and 4.4 state that complex types can have stream properties. This was not explicitly stated in the format specification.

Making the description more explicit does not add or remove a feature, so it is a non-material change.

All agree the changes are non-material

###6.4 XML Schema edm.xsd

Added attribute UrlRef to attribute group GInlineExpressions
The UrlRef expression is defined in CSDL to allow element and attribute notation; the attribute notation was missing in the schema definition.

Correcting the schema does not add or remove a feature, so it is a non-material change.

Removed superfluous &lt;xs:sequence&gt; elements
Several complex types contained an &lt;xs:sequence> element with a single &lt;xs:choice&gt; element. These should have been removed when applying ODATA-360 and ODATA-361.

Simplifying the schema does not add or remove a feature, so it is a non-material change.

Changed type of body for type TLabeledElementReferenceExpression

All agree the changes are non-material

###6.5 Part 3: CSDL

Section 7.2, Example 10: Removed OnDelete element
The OnDelete element should have been removed when applying ODATA-411.

Section 7.3: Added Example (now 11) for OnDelete element
This example should have been added when applying ODATA-411.

Section 14.5.1: Removed superfluous space
The closing &lt;/Ge&gt; element in the example for the &lt;edm:Ge&gt; expression contained a superfluous space character.

All agree the changes are non-materail

###6.5 Examples in JSON Format

Section 6, Examples 9 and 10: Removed erroneous comma

The last name-value pair was followed by a comma, which is syntactically incorrect.

Section 7.2, Example 12: Removed erroneous comma

The last name-value pair was followed by a comma, which is syntactically incorrect.

Chapter 12, Example 27: Removed erroneous comma
The last name-value pair was followed by a comma, which is syntactically incorrect.

All agree the chnages are no-material


Ralf:
>I **move** to approve the latest Working Draft of the OASIS OData Extension for Data Aggregation Version 4.0  Work Product including associated files, all contained [https://www.oasis-open.org/apps/org/workgroup/odata/download.php/50067/odata-data-aggregation-ext-v4.0-wd01-final-2013-07-24.zip](https://www.oasis-open.org/apps/org/workgroup/odata/download.php/50067/odata-data-aggregation-ext-v4.0-wd01-final-2013-07-24.zip), as Committee Specification Draft 01, and start a 30-day public review. **Ed** seconds.

**No further discussion**. **No objections**. The **motion passes**.

## 7 Next Meetings

### 7.1 Meeting on 2013-08-01 by Call during 0800-0900 PT

Agreed.

## 8 AOB

None.

Meeting adjourned on 0843 PT

## List of Open Action Items Before the Meeting [AI_REF]

**Retrieval time stamp**: `2013-07-25 13:13 +02:00`.

AI#0018
: "Prepare Working Draft 01 (WD01) version of OData Extension for Temporal Data" [owner: Hubert Heijkers] is **Ongoing** (Note: Due 2013-07-31)

AI#0019
: "Prepare Working Draft 01 (WD01) version of OData Extension for XML Data" [owner: Stefan Drees] is **Ongoing** (Note: Due 2013-07-31)

AI#0020
: "Prepare Working Draft 01 (WD01) version of OData Extension for JSON Data" [owner: Susan Malaika] is **Ongoing** (Note: Due 2013-07-31)


**Note**: The actual action item processing is documented in section [4][AIH] and subsections thereof.

## Index of Issues Processed During the Meeting [IP_REF]

**Note**: The actual issue processing is documented in sections [5][IPH]. The below index has two main parts: First come the public comments (if any), second the JIRA issues. Each list of issues is sorted by ascending issue number. Noted are the ID, the summary and the reference to the relevant subsection where the issue progression has been documented:

Public Comments:

None.

JIRA Issues:

* [ODATA-391](https://tools.oasis-open.org/issues/browse/ODATA-391) "Add query function isdefined(PropertyPath) to determine whether an instance has a property of that name" [5.2][odata-391]
* [ODATA-461](https://tools.oasis-open.org/issues/browse/ODATA-461) "Explicitly disallow certain XML constructs (for CSDL, ATOM) to enhance OData security" [5.3][odata-461]
* [ODATA-465](https://tools.oasis-open.org/issues/browse/ODATA-465) "Explicitly mention that complex type instances can have stream properties (public comment c201307e00000)" [5.1][odata-465]

## Timeline Reference [TL_REF]

**Note**: Please cf. the current revision of the [TC timeline](https://www.oasis-open.org/committees/download.php/49178/TC%20Timeline%205.htm).


