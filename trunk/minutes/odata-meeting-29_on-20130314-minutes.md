#OData meeting #29, Thursday, 14 Mar 2013, 0800 - 1000 PT

**Note**: For explanations of conventions and other formal aspects common to OData TC meeting minutes which are used in this document please cf. "[Formal Aspects of Meeting Minutes](https://www.oasis-open.org/committees/download.php/48109/formal-aspects-meeting-minutes-v1.html)". 

Meeting chaired by Ram Jeyaraman

## 1 Roll call
 
### 1.1 Members Present: 

        Andrew Eisenberg (IBM)        Barbara Hartel (SAP AG)        Dale Moberg (Axway Software)        Diane Downie (Citrix Systems)        Erik de Voogd (SDL)        Gerald Krause (SAP AG)        Hubert Heijkers (IBM)        John Willson (Individual)        Ken Baclawski (Northeastern University)        Martin Zurmuehl (SAP AG)        Matthew Borges (SAP AG)        Michael Pizzo (Microsoft) a.k.a. Mike        Patrick Durusau (Individual)        Ralf Handl (SAP AG)        Ram Jeyaraman (Microsoft)        Stan Mitranic (CA Technologies)        Stefan Drees (Individual)        Susan Malaika (IBM)        Ted Jones (Red Hat)

Quorum achieved. Details cf. [normative attendance sheet for this meeting](https://www.oasis-open.org/apps/org/workgroup/odata/event.php?event_id=34188).

## 2 Approval of Agenda

Agenda approved as published.

## 3 Approval of Minutes from Previous Meeting(s)

### 3.1 Approval of [Minutes of 2013-03-07 Meeting#28](https://www.oasis-open.org/committees/download.php/48481/odata-meeting-28_on-20130307-minutes.html)

**Meeting minutes approved with no objections**.

##4 Review of [Action Items](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_items.php) (AI) and Progress [AIH]

Context:
> See the "[List of Open Action Items Before the Meeting][AI_REF]" section in the appendix.
  
###4.1 Action items due by 2013-03-14 (end of day)

None.

###4.2 Action items NOT due by 2013-03-14 (end of day) but MAY be ready for closure

None.

##5 Specification Editors for Work Product

Context:
>Current editors as documented in the latest revisions of the work products:

* "OData Version 4.0 Part 1: Protocol" names "Mike and Ralf" in section Editor.
* "OData Version 4.0 Part 2: URL Conventions" names "Mike, Ralf Susan, Christopher and Martin" in section Editor.
* "OData Version 4.0 Part 3: CSDL" names "Mike, Ralf, Susan, Christopher and Martin" in section Editor. 
* "OData ABNF Construction Rules Version 4.0 WD01" names no Editor nor Contact. 
* "OData ATOM Format Version 4.0" names "Martin, Mike and Ralf" in section Editor. 
* "OData JSON Format Version 4.0" names "Ralf, Christopher, Susan and Mark" in section Editor.
* "OData Extension for Data Aggregation Version 1.0" names "Ralf, Hubert, Gerald and Mike" in section Editor. 

Discussion:

* Ram states, that as we prepare towards Committee Specification Draft 01, we should discuss and confirm who the editors are (based on who has been editing the documents).
* Mike adds, that ABNF should state Ralf and Mike as editors
* All agree

##6 Review of [Issues List](https://tools.oasis-open.org/issues/secure/IssueNavigator.jspa?reset=true&mode=hide&pid=10103&sorter/field=issuekey&sorter/order=ASC) (IL) and Progress [IPH]

**Notes**:

* Issues in this section (5) may have been progressed out of sequence, but have been noted here to better group by components impacted as a service for the reader.
* There is an "[Index of Issues Processed During the Meeting][IP_REF]" section in the appendix.

###6.1 Issues in Proposed state (carried over from Feb 21, 2013 TC meeting)

####6.1.1 OData Protocol [coprot1]

#####6.1.1.1 [ODATA-37](https://tools.oasis-open.org/issues/browse/ODATA-37)

ODATA-37:
: "UPSERT: allow PUT and PATCH to the URL of a not yet existing entity to create this entity " [component: OData Protocol] is **Open**.

Ralf: 
>I **move** to resolve ODATA-37 as proposed. **Mike seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-37:
: "UPSERT: allow PUT and PATCH to the URL of a not yet existing entity to create this entity " [component: OData Protocol] is **Resolved** with no objections.

#####6.1.1.2 [ODATA-42](https://tools.oasis-open.org/issues/browse/ODATA-42)

ODATA-42:
: "8.2.5 If-None-Match: clarify use of If-None-Match in data modification or action requests" [component: OData Protocol] is **Open**.

Ralf: 
>I **move** to resolve ODATA-42 as proposed. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-42:
: "8.2.5 If-None-Match: clarify use of If-None-Match in data modification or action requests" [component: OData Protocol] is **Resolved** with no objections.

#####6.1.1.3 [ODATA-246](https://tools.oasis-open.org/issues/browse/ODATA-246)

ODATA-246:
: "IDs should be dereferenceable URIs" [component: OData Protocol] is **New**.

Hubert: 
>I **move** to resolve ODATA-246 as proposed. **John seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-246:
: "IDs should be dereferenceable URIs" [component: OData Protocol] is **Resolved** with no objections.

###6.2 Issues in Proposed state (carried over from Feb 28, 2013 TC meeting)

####6.2.1 OData CSDL [cocsdl1]

#####6.2.1.1 [ODATA-275](https://tools.oasis-open.org/issues/browse/ODATA-275)

ODATA-275:
: "Clarify that binding parameters for actions and functions cannot be nullable" [component: OData CSDL] is **Open**.

Mike: 
>I **move** we resolve ODATA-275 as modified by clarifying that binding parameters may be nullable. **Andrew seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-275:
: "Clarify that binding parameters for actions and functions cannot be nullable" [component: OData CSDL] is **Resolved as noted in the motion** with no objections.

#####6.2.1.2 [ODATA-256](https://tools.oasis-open.org/issues/browse/ODATA-256)

ODATA-256:
: "Simplify numeric data types" [component: OData CSDL] is **New**.

Stefan: 
>I **move** to close ODATA-256 without action. **Martin seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-256:
: "Simplify numeric data types" [component: OData CSDL] is **Closed as noted in the motion** with no objections.

###6.3 Issues in Proposed state (carried over from March  7, 2013 TC meeting)

####6.3.1 OData CSDL, OData Protocol [cocsdl_prot1]

#####6.3.1.1 [ODATA-270](https://tools.oasis-open.org/issues/browse/ODATA-270)

ODATA-270:
: "Collections of Edm.PrimitiveType are problematic in JSON" [components: OData Protocol, OData CSDL] is **Open**.

Mike: 
>I **move** we resolve ODATA-270 as proposed. **John seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-270:
: "Collections of Edm.PrimitiveType are problematic in JSON" [components: OData Protocol, OData CSDL] is **Resolved** with no objections.

####6.3.2 OData ABNF Construction Rules, OData Protocol, OData URL Conventions [coabnf_prot_urlc1]

#####6.3.2.1 [ODATA-177](https://tools.oasis-open.org/issues/browse/ODATA-177)

ODATA-177:
: "Allow entities to be members of multiple entity sets" [component: OData Protocol] is **Open**.

Discussion:

* Mike offers to open a new issue for dealing with transient entities and close the current one.

Ralf: 
>I **move** to close ODATA-177 without action. **Martin seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-177:
: "Allow entities to be members of multiple entity sets" [component: OData Protocol] is **Closed** with no objections.

#####6.3.2.2 [ODATA-139](https://tools.oasis-open.org/issues/browse/ODATA-139)

ODATA-139:
: "New system query option $search for free-text search within an entity set" [components: OData Protocol, OData ABNF Construction Rules, OData URL Conventions] is **Resolved**.

Discussion:

* Stefan explains his comment (based on implementation efforts) and the subsequent inclusion of parenthesis as grouping aid.
* Mike shortly summarizes that he also recognized while implementing, that parenthesis might balance the $search feature optimally.

Steafn: 
>I **move** to resolve ODATA-139 as described in the updated proposal with possible implications for the related $search issues like ODATA-222 i.e. "free-text search within a property" and ODATA-228 "Specify $search for free-text search within a OData Service and specify $search for free-text search within an entityContainer". **Martin seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-139:
: "New system query option $search for free-text search within an entity set" [components: OData Protocol, OData ABNF Construction Rules, OData URL Conventions] is **Resolved as noted in the motion** with no objections.

####6.3.3 OData JSON Format, OData Protocol [cojson_prot1]

#####6.3.3.1 [ODATA-283](https://tools.oasis-open.org/issues/browse/ODATA-283)

ODATA-283:
: "Accept-Charset HTTP Request Header and charset content-type parameter" [components: OData Protocol, OData JSON Format] is **Open**.

Discussion:

* Mike needs more time and suggests to leave the issue as is until next week.

**No further discussion**. **No objections**.

ODATA-283:
: "Accept-Charset HTTP Request Header and charset content-type parameter" [components: OData Protocol, OData JSON Format] is **Open** with no objections.

####6.3.4 OData ATOM Format, OData JSON Format [coatom_json1]

#####6.3.4.1 [ODATA-68](https://tools.oasis-open.org/issues/browse/ODATA-68)

ODATA-68:
: "Describe representation of ReferenceTypes in responses" [components: OData CSDL, OData ATOM Format, OData JSON Format] is **Open**.

Ralf: 
>I **move** to resolve ODATA-68 as proposed. **Hubert seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-68:
: "Describe representation of ReferenceTypes in responses" [components: OData CSDL, OData ATOM Format, OData JSON Format] is **Resolved** with no objections.

###6.4 Issues in Proposed state (since March  7, 2013 TC meeting)

####6.4.1 OData CSDL [cocsdl2]

#####6.4.1.1 [ODATA-277](https://tools.oasis-open.org/issues/browse/ODATA-277)

ODATA-277:
: "Remove Collation attribute" [component: OData CSDL] is **New**.

Discussion:

* Ralf suggests to completely remove it, since ATOM and JSON both have means for specifying charctersets and the like.
* Mike thinks, the collation is an interesting information in the URL but not as a type.
* Mike accepts removing it now and if necessary come back later to add it back in the correct way (not as a type)

Ralf: 
>I **move** to resolve ODATA-277 as proposed. **Martin seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-277:
: "Remove Collation attribute" [component: OData CSDL] is **Resolved** with no objections.

#####6.4.1.2 [ODATA-288](https://tools.oasis-open.org/issues/browse/ODATA-288)

ODATA-288:
: "Change default decimal Scale to variable" [component: OData CSDL] is **New**.

Discussion:

* Mike summarizes the current state and also mentions, that Evan commented on this
 issue and currently there seems to be not a real consensus for a proposal without further discussion
* Ralf explains, that sub issues of Evans comments have been filed as extra issues by Evan.
* Ralf suggests to resolve the issue now, since it should satisfy Evans proposal without the default detail and assumes he might be ok with this.
* Ralf amends the proposal as follows (directly in JIRA): 1) eliminate VariableScale face 2) add special value Scale="Variable" 3) make Scale="0" the default.

Hubert: 
>I **move** to resolve ODATA-288 as per the amended proposal by Ralf and as updated in JIRA. **Martin seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-288:
: "Change default decimal Scale to variable" [component: OData CSDL] is **Resolved as noted in the motion** with no objections.

#####6.4.1.3 [ODATA-124](https://tools.oasis-open.org/issues/browse/ODATA-124)

ODATA-124:
: "For round-tripping values, what precision must agents support for DateTime(Offset), and are leap seconds permitted?" [component: OData CSDL] is **New**.

Stefan: 
>I **move** to resolve ODATA-124 as proposed. **Andrew seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-124:
: "For round-tripping values, what precision must agents support for DateTime(Offset), and are leap seconds permitted?" [component: OData CSDL] is **Resolved** with no objections.

####6.4.2 OData URL Conventions [courlc1]

#####6.4.2.1 [ODATA-285](https://tools.oasis-open.org/issues/browse/ODATA-285)

ODATA-285:
: "Section 4.7: explicitly mention which property types allow appending /$value" [component: OData URL Conventions] is **New**.

Stefan: 
>I **move** to resolve ODATA-285 as proposed. **Ralf seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-285:
: "Section 4.7: explicitly mention which property types allow appending /$value" [component: OData URL Conventions] is **Resolved** with no objections.

####6.4.3 Vocabularies [covoca1]

#####6.4.3.1 [ODATA-192](https://tools.oasis-open.org/issues/browse/ODATA-192)

ODATA-192:
: "Define core vocabulary term as a replacement for StoreGeneratedPattern attribute" [component: Vocabularies] is **New**.

Discussion:

* Ralf likes to know how to proceed, i.e. with Core or Behavior vocabulary?
* Mike suggests using the Core vocabulary
* Mike states, that any vocabulary terms being referenced in other core work products need to be described somewhere. This will need further discussions.
* All agree to discuss a proposal along these lines during next face to face meeting in April.
* Mike updates the current proposal for ODATA-192 during the discussion as: Define term StoreGeneratedPattern in the Core vocabulary with an underlying EnumType and members A) Identity - A value is generated on insert and remains unchanged on update. B) Computed - A value is generated on both insert and update. Comment: V3 had a third value "None", but as this is the normal behavior, absence of the annotation seems sufficient. Also, move existing "Behavior" terms to Core.

Martin: 
>I **move** to resolve ODATA-192 as proposed. **Hubert seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-192:
: "Define core vocabulary term as a replacement for StoreGeneratedPattern attribute" [component: Vocabularies] is **Resolved** with no objections.

####6.4.4 OData CSDL, OData Protocol [cocsdl_prot2]

#####6.4.4.1 [ODATA-292](https://tools.oasis-open.org/issues/browse/ODATA-292)

ODATA-292:
: "Questions on POST, PATCH and merge/replace semantics with related entities in composite relationships" [component: OData Protocol] is **New**.

Mike: 
>I **move** we resolve ODATA-292 with the two clarifications proposed. **Hubert seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-292:
: "Questions on POST, PATCH and merge/replace semantics with related entities in composite relationships" [component: OData Protocol] is **Resolved as noted in the motion** with no objections.

####6.4.5 OData Protocol [coprot2]

#####6.4.5.1 [ODATA-293](https://tools.oasis-open.org/issues/browse/ODATA-293)

ODATA-293:
: "Clarify protocol or JSON spec: are servers REQUIRED to support JSON format?" [components: OData Protocol, OData JSON Format] is **New**.

Discussion:

* Mike states that this issue should be closed without any action as a duplicate of ODATA-248.

Hubert: 
>I **move** to resolve ODATA-293 with no action as proposed. **Mike seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-293:
: "Clarify protocol or JSON spec: are servers REQUIRED to support JSON format?" [components: OData Protocol, OData JSON Format] is **Closed as noted in the motion** with no objections.

###6.5 Issues in Applied state (carried over from Feb 28, 2013) [GM1]

Discussion:

* Mike suggests the editors call out special issues, where creativity or small variations were needed.
* Ralf thinks, we need to go through the issues one by one and look for comments.
* All agree to proceed one by one but move in groups
* Ralf states he changed name of gettotaloffsetminutes to totaloffsetminutes

Stefan:
>I **move** to close ODATA-214, ODATA-179, ODATA-215, ODATA-251, ODATA-250, ODATA-178, ODATA-147 and ODATA-146 as applied. **Mike seconds**.

**No further discussion**. **No objections**. The **motion passes**.

####6.5.1 OData ABNF Construction Rules, OData ATOM Format, OData CSDL, OData JSON Format, OData Protocol, OData URL Conventions [coabnf_atom_csdl_json_prot_urlc1]

#####6.5.1.1 [ODATA-214](https://tools.oasis-open.org/issues/browse/ODATA-214)

ODATA-214:
: "Find consensus on 'Additional artifacts'-section of multi component Work Products (and implement accordingly) " [components: OData ATOM Format, OData ABNF Construction Rules, OData JSON Format, OData CSDL, OData URL Conventions, OData Protocol] is **Applied**.

Note:
> Issue state has been progressed by grouping motion (cf. section [[6.5][GM1]])

ODATA-214:
: "Find consensus on 'Additional artifacts'-section of multi component Work Products (and implement accordingly) " [components: OData ATOM Format, OData ABNF Construction Rules, OData JSON Format, OData CSDL, OData URL Conventions, OData Protocol] is **Closed** with no objections.

#####6.5.1.2 [ODATA-179](https://tools.oasis-open.org/issues/browse/ODATA-179)

ODATA-179:
: "Adapt OData inter document references to new work product structuring of core" [components: OData CSDL, OData ATOM Format, OData Protocol, OData JSON Format, OData URL Conventions] is **Applied**.

Note:
> Issue state has been progressed by grouping motion (cf. section [[6.5][GM1]])

ODATA-179:
: "Adapt OData inter document references to new work product structuring of core" [components: OData CSDL, OData ATOM Format, OData Protocol, OData JSON Format, OData URL Conventions] is **Closed** with no objections.

####6.5.2 OData ABNF Construction Rules, OData URL Conventions [coabnf_urlc1]

#####6.5.2.1 [ODATA-215](https://tools.oasis-open.org/issues/browse/ODATA-215)

ODATA-215:
: "Remove hour(), minute() and second() query functions and add corresponding overloads to the hours(), minutes(), and seconds() functions" [components: OData URL Conventions, OData ABNF Construction Rules] is **Applied**.

Note:
> Issue state has been progressed by grouping motion (cf. section [[6.5][GM1]])

ODATA-215:
: "Remove hour(), minute() and second() query functions and add corresponding overloads to the hours(), minutes(), and seconds() functions" [components: OData URL Conventions, OData ABNF Construction Rules] is **Closed** with no objections.

####6.5.3 OData ATOM Format [coatom1]

#####6.5.3.1 [ODATA-251](https://tools.oasis-open.org/issues/browse/ODATA-251)

ODATA-251:
: "Clarify, within [ATOM], that complex types can be annotated" [component: OData ATOM Format] is **Applied**.

Note:
> Issue state has been progressed by grouping motion (cf. section [[6.5][GM1]])

ODATA-251:
: "Clarify, within [ATOM], that complex types can be annotated" [component: OData ATOM Format] is **Closed** with no objections.

#####6.5.3.2 [ODATA-250](https://tools.oasis-open.org/issues/browse/ODATA-250)

ODATA-250:
: "For instance annotations in Atom, 'Annotation' element, 'Type', 'Term' and 'Target' attributes should be lower case" [component: OData ATOM Format] is  **Applied**.

Note:
> Issue state has been progressed by grouping motion (cf. section [[6.5][GM1]])

ODATA-250:
: "For instance annotations in Atom, 'Annotation' element, 'Type', 'Term' and 'Target' attributes should be lower case" [component: OData ATOM Format] is **Closed** with no objections.

#####6.5.3.3 [ODATA-178](https://tools.oasis-open.org/issues/browse/ODATA-178)

ODATA-178:
: "Enhance abstract, distinguish its content from 1st paragraph of introduction and edit the payload object listing in 2nd para of 1 Introduction" [component: OData ATOM Format] is **Applied**.

Note:
> Issue state has been progressed by grouping motion (cf. section [[6.5][GM1]])

ODATA-178:
: "Enhance abstract, distinguish its content from 1st paragraph of introduction and edit the payload object listing in 2nd para of 1 Introduction" [component: OData ATOM Format] is **Closed** with no objections.

#####6.5.3.4 [ODATA-147](https://tools.oasis-open.org/issues/browse/ODATA-147)

ODATA-147:
: "Add example for $inlinecount representation" [component: OData ATOM Format] is **Applied**.

Note:
> Issue state has been progressed by grouping motion (cf. section [[6.5][GM1]])

ODATA-147:
: "Add example for $inlinecount representation" [component: OData ATOM Format] is **Closed** with no objections.

#####6.5.3.5 [ODATA-146](https://tools.oasis-open.org/issues/browse/ODATA-146)

ODATA-146:
: "Add example for inlining expanded entities" [component: OData ATOM Format] is **Applied**.

Note:
> Issue state has been progressed by grouping motion (cf. section [[6.5][GM1]])

ODATA-146:
: "Add example for inlining expanded entities" [component: OData ATOM Format] is **Closed** with no objections.

####6.5.4 OData CSDL [GM2]

Discussion:

* Mike states there were minor variations, but should be closed as applied.

Stefan:
>I **move** to close ODATA-273, ODATA-272, ODATA-268, ODATA-237, ODATA-76 and ODATA-269 as applied. **Mike seconds**.

**No further discussion**. **No objections**. The **motion passes**.

#####6.5.4.1 [ODATA-273](https://tools.oasis-open.org/issues/browse/ODATA-273)

ODATA-273:
: "Clarify whether derived types MUST introduce new properties" [component: OData CSDL] is **Applied**.

Note:
> Issue state has been progressed by grouping motion (cf. section [[6.5.4][GM2]])

ODATA-273:
: "Clarify whether derived types MUST introduce new properties" [component: OData CSDL] is **Closed** with no objections.

#####6.5.4.2 [ODATA-272](https://tools.oasis-open.org/issues/browse/ODATA-272)

ODATA-272:
: "Remove FixedLength facet" [component: OData CSDL] is **Applied**.

Note:
> Issue state has been progressed by grouping motion (cf. section [[6.5.4][GM2]])

ODATA-272:
: "Remove FixedLength facet" [component: OData CSDL] is **Closed** with no objections.

#####6.5.4.3 [ODATA-268](https://tools.oasis-open.org/issues/browse/ODATA-268)

ODATA-268:
: "Use http://docs.oasis-open.org/odata/ns/edm as the EDM namespace URL" [component: OData CSDL] is **Applied**.

Note:
> Issue state has been progressed by grouping motion (cf. section [[6.5.4][GM2]])

ODATA-268:
: "Use http://docs.oasis-open.org/odata/ns/edm as the EDM namespace URL" [component: OData CSDL] is **Closed** with no objections.

#####6.5.4.4 [ODATA-237](https://tools.oasis-open.org/issues/browse/ODATA-237)

ODATA-237:
: "Require type usage to always specify a qualified name for types other than the built-in primitive types" [component: OData CSDL] is **Applied**.

Note:
> Issue state has been progressed by grouping motion (cf. section [[6.5.4][GM2]])

ODATA-237:
: "Require type usage to always specify a qualified name for types other than the built-in primitive types" [component: OData CSDL] is **Closed** with no objections.

#####6.5.4.5 [ODATA-76](https://tools.oasis-open.org/issues/browse/ODATA-76)

ODATA-76:
: "Edm.Decimal is a floating-point type" [component: OData CSDL] is **Applied**.

Note:
> Issue state has been progressed by grouping motion (cf. section [[6.5.4][GM2]])

ODATA-76:
: "Edm.Decimal is a floating-point type" [component: OData CSDL] is **Closed** with no objections.

####6.5.5 OData CSDL, OData Protocol [cocsdl_prot3]

#####6.5.5.1 [ODATA-269](https://tools.oasis-open.org/issues/browse/ODATA-269)

ODATA-269:
: "Separate Functions and Actions" [components: OData Protocol, OData CSDL] is **Applied**.

Note:
> Issue state has been progressed by grouping motion (cf. section [[6.5.4][GM2]])

ODATA-269:
: "Separate Functions and Actions" [components: OData Protocol, OData CSDL] is **Closed** with no objections.

####6.5.6 OData JSON Format [GM3]

Stefan:
>I **move** to close ODATA-249, ODATA-110, ODATA-129, ODATA-261 and ODATA-103 as applied. **Ralf seconds**.

**No further discussion**. **No objections**. The **motion passes**.

#####6.5.6.1 [ODATA-249](https://tools.oasis-open.org/issues/browse/ODATA-249)

ODATA-249:
: "'Kind' property should be optional for EntitySets in JSON Service Documents" [component: OData JSON Format] is **Applied**.

Note:
> Issue state has been progressed by grouping motion (cf. section [[6.5.6][GM3]])

ODATA-249:
: "'Kind' property should be optional for EntitySets in JSON Service Documents" [component: OData JSON Format] is **Closed** with no objections.

####6.5.7 OData Protocol [coprot3]

#####6.5.7.1 [ODATA-110](https://tools.oasis-open.org/issues/browse/ODATA-110)

ODATA-110:
: "Track Prefer Header in Http" [component: OData Protocol] is **Applied**.

Note:
> Issue state has been progressed by grouping motion (cf. section [[6.5.6][GM3]])

ODATA-110:
: "Track Prefer Header in Http" [component: OData Protocol] is **Closed** with no objections.

#####6.5.7.2 [ODATA-129](https://tools.oasis-open.org/issues/browse/ODATA-129)

ODATA-129:
: "Explicitly mention dynamic navigation properties in [Core]" [component: OData Protocol] is **Applied**.

Note:
> Issue state has been progressed by grouping motion (cf. section [[6.5.6][GM3]])

ODATA-129:
: "Explicitly mention dynamic navigation properties in [Core]" [component: OData Protocol] is **Closed** with no objections.

#####6.5.7.3 [ODATA-261](https://tools.oasis-open.org/issues/browse/ODATA-261)

ODATA-261:
: "Improve section 10.2.3.8 The $format System Query Option" [component: OData Protocol] is **Applied**.

Note:
> Issue state has been progressed by grouping motion (cf. section [[6.5.6][GM3]])

ODATA-261:
: "Improve section 10.2.3.8 The $format System Query Option" [component: OData Protocol] is **Closed** with no objections.

#####6.5.7.4 [ODATA-103](https://tools.oasis-open.org/issues/browse/ODATA-103)

ODATA-103:
: "5.4.1 Representing Actions Bound to Multiple Entities: specify treatment of action overloads" [component: OData Protocol] is **Applied**.

Note:
> Issue state has been progressed by grouping motion (cf. section [[6.5.6][GM3]])

ODATA-103:
: "5.4.1 Representing Actions Bound to Multiple Entities: specify treatment of action overloads" [component: OData Protocol] is **Closed** with no objections.

####6.5.8 OData URL Conventions [GM4]

Stefan:
>I **move** to close ODATA-142, ODATA-140, ODATA-203, ODATA-104, ODATA-72 and ODATA-122 as applied. **Hubert seconds**.

**No further discussion**. **No objections**. The **motion passes**.

#####6.5.8.1 [ODATA-142](https://tools.oasis-open.org/issues/browse/ODATA-142)

ODATA-142:
: "Define URL functions geo.distance, geo.length, geo.intersects, and gettotaloffsetminutes" [component: OData URL Conventions] is **Applied**.

Note:
> Issue state has been progressed by grouping motion (cf. section [[6.5.8][GM4]])

ODATA-142:
: "Define URL functions geo.distance, geo.length, geo.intersects, and gettotaloffsetminutes" [component: OData URL Conventions] is **Closed** with no objections.

#####6.5.8.2 [ODATA-140](https://tools.oasis-open.org/issues/browse/ODATA-140)

ODATA-140:
: "Describe rules for accessing derived entity and complex types in URLs" [component: OData URL Conventions] is **Applied**.

Note:
> Issue state has been progressed by grouping motion (cf. section [[6.5.8][GM4]])

ODATA-140:
: "Describe rules for accessing derived entity and complex types in URLs" [component: OData URL Conventions] is **Closed** with no objections.

#####6.5.8.3 [ODATA-203](https://tools.oasis-open.org/issues/browse/ODATA-203)

ODATA-203:
: "Specify Operator Precedence more clearly" [component: OData URL Conventions] is **Applied**.

Note:
> Issue state has been progressed by grouping motion (cf. section [[6.5.8][GM4]])

ODATA-203:
: "Specify Operator Precedence more clearly" [component: OData URL Conventions] is **Closed** with no objections.

#####6.5.8.4 [ODATA-104](https://tools.oasis-open.org/issues/browse/ODATA-104)

ODATA-104:
: "Consider supporting nullable complex typed properties" [component: OData URL Conventions] is **Applied**.

Note:
> Issue state has been progressed by grouping motion (cf. section [[6.5.8][GM4]])

ODATA-104:
: "Consider supporting nullable complex typed properties" [component: OData URL Conventions] is **Closed** with no objections.

#####6.5.8.5 [ODATA-72](https://tools.oasis-open.org/issues/browse/ODATA-72)

ODATA-72:
: "Describe any() and all() lambda filter expressions " [component: OData URL Conventions] is **Applied**.

Note:
> Issue state has been progressed by grouping motion (cf. section [[6.5.8][GM4]])

ODATA-72:
: "Describe any() and all() lambda filter expressions " [component: OData URL Conventions] is **Closed** with no objections.

#####6.5.8.6 [ODATA-122](https://tools.oasis-open.org/issues/browse/ODATA-122)

ODATA-122:
: "Please clarify the meaning of filter functions applied to DateTimeOffset values" [component: OData URL Conventions] is **Applied**.

Note:
> Issue state has been progressed by grouping motion (cf. section [[6.5.8][GM4]])

ODATA-122:
: "Please clarify the meaning of filter functions applied to DateTimeOffset values" [component: OData URL Conventions] is **Closed** with no objections.

###6.6 Issues in Applied state (carried over from March  7, 2013)

####6.6.1 OData CSDL [GM5]

Stefan:
>I **move** to close ODATA-278, ODATA-242, ODATA-236, ODATA-234, ODATA-173 and ODATA-257 as applied. **Ralf seconds**.

**No further discussion**. **No objections**. The **motion passes**.

#####6.6.1.1 [ODATA-278](https://tools.oasis-open.org/issues/browse/ODATA-278)

ODATA-278:
: "Introduce vocabulary expression edm:Url" [component: OData CSDL] is **Applied**.

Note:
> Issue state has been progressed by grouping motion (cf. section [[6.6.1][GM5]])

ODATA-278:
: "Introduce vocabulary expression edm:Url" [component: OData CSDL] is **Closed** with no objections.

#####6.6.1.2 [ODATA-242](https://tools.oasis-open.org/issues/browse/ODATA-242)

ODATA-242:
: "Allow Path expressions also for annotations targeting an entity container" [component: OData CSDL] is **Applied**.

Note:
> Issue state has been progressed by grouping motion (cf. section [[6.6.1][GM5]])

ODATA-242:
: "Allow Path expressions also for annotations targeting an entity container" [component: OData CSDL] is **Closed** with no objections.

#####6.6.1.3 [ODATA-236](https://tools.oasis-open.org/issues/browse/ODATA-236)

ODATA-236:
: "Define maximum length of namespace names and simple identifiers" [component: OData CSDL] is **Applied**.

Note:
> Issue state has been progressed by grouping motion (cf. section [[6.6.1][GM5]])

ODATA-236:
: "Define maximum length of namespace names and simple identifiers" [component: OData CSDL] is **Closed** with no objections.

#####6.6.1.4 [ODATA-234](https://tools.oasis-open.org/issues/browse/ODATA-234)

ODATA-234:
: "Merge Reference and AnnotationReference element" [component: OData CSDL] is **Applied**.

Note:
> Issue state has been progressed by grouping motion (cf. section [[6.6.1][GM5]])

ODATA-234:
: "Merge Reference and AnnotationReference element" [component: OData CSDL] is **Closed** with no objections.

#####6.6.1.5 [ODATA-173](https://tools.oasis-open.org/issues/browse/ODATA-173)

ODATA-173:
: "Define Action values for OnDelete element" [component: OData CSDL] is **Applied**.

Note:
> Issue state has been progressed by grouping motion (cf. section [[6.6.1][GM5]])

ODATA-173:
: "Define Action values for OnDelete element" [component: OData CSDL] is **Closed** with no objections.

#####6.6.1.6 [ODATA-257](https://tools.oasis-open.org/issues/browse/ODATA-257)

ODATA-257:
: "Define standard client-side function for filling URL templates (RFC6570)" [component: OData CSDL] is **Applied**.

Note:
> Issue state has been progressed by grouping motion (cf. section [[6.6.1][GM5]])

ODATA-257:
: "Define standard client-side function for filling URL templates (RFC6570)" [component: OData CSDL] is **Closed** with no objections.

####6.6.2 OData CSDL, Vocabularies [GM6]

Stefan:
>I **move** to close ODATA-201, ODATA-43, ODATA-253, ODATA-20, ODATA-200, ODATA-254 and ODATA-252 as applied. **John seconds**.

**No further discussion**. **No objections**. The **motion passes**.

#####6.6.2.1 [ODATA-201](https://tools.oasis-open.org/issues/browse/ODATA-201)

ODATA-201:
: "Allow specifying a list of acceptable media types for media entities and named resource properties" [components: Vocabularies, OData CSDL] is **Applied**.

Note:
> Issue state has been progressed by grouping motion (cf. section [[6.6.2][GM6]])

ODATA-201:
: "Allow specifying a list of acceptable media types for media entities and named resource properties" [components: Vocabularies, OData CSDL] is **Closed** with no objections.

####6.6.3 OData CSDL, OData Protocol, Vocabularies [cocsdl_prot_voca1]

#####6.6.3.1 [ODATA-43](https://tools.oasis-open.org/issues/browse/ODATA-43)

ODATA-43:
: "No indicator for optimistic concurrency control on EntityType or EntitySet level" [components: OData Protocol, OData CSDL, Vocabularies] is **Applied**.

Note:
> Issue state has been progressed by grouping motion (cf. section [[6.6.2][GM6]])

ODATA-43:
: "No indicator for optimistic concurrency control on EntityType or EntitySet level" [components: OData Protocol, OData CSDL, Vocabularies] is **Closed** with no objections.

####6.6.4 OData Protocol, Vocabularies [coprot_voca1]

#####6.6.4.1 [ODATA-253](https://tools.oasis-open.org/issues/browse/ODATA-253)

ODATA-253:
: "Clients should be prepared to handle unadvertised properties" [components: Vocabularies, OData Protocol] is **Applied**.

Note:
> Issue state has been progressed by grouping motion (cf. section [[6.6.2][GM6]])

ODATA-253:
: "Clients should be prepared to handle unadvertised properties" [components: Vocabularies, OData Protocol] is **Closed** with no objections.

####6.6.5 OData ATOM Format [coatom2]

#####6.6.5.1 [ODATA-20](https://tools.oasis-open.org/issues/browse/ODATA-20)

ODATA-20:
: "Feedback to document revision" [component: OData ATOM Format] is **Applied**.

Note:
> Issue state has been progressed by grouping motion (cf. section [[6.6.2][GM6]])

ODATA-20:
: "Feedback to document revision" [component: OData ATOM Format] is **Closed** with no objections.

#####6.6.5.2 [ODATA-200](https://tools.oasis-open.org/issues/browse/ODATA-200)

ODATA-200:
: "Handling of metadata:type attribute" [component: OData ATOM Format] is **Applied**.

Note:
> Issue state has been progressed by grouping motion (cf. section [[6.6.2][GM6]])

ODATA-200:
: "Handling of metadata:type attribute" [component: OData ATOM Format] is **Closed** with no objections.

#####6.6.5.3 [ODATA-254](https://tools.oasis-open.org/issues/browse/ODATA-254)

ODATA-254:
: "Selection of individual properties in [ATOM] should not include property name" [component: OData ATOM Format] is **Applied**.

Note:
> Issue state has been progressed by grouping motion (cf. section [[6.6.2][GM6]])

ODATA-254:
: "Selection of individual properties in [ATOM] should not include property name" [component: OData ATOM Format] is **Closed** with no objections.

#####6.6.5.4 [ODATA-252](https://tools.oasis-open.org/issues/browse/ODATA-252)

ODATA-252:
: "Clarify ordering of instance annotations in [ATOM] and [JSON]" [component: OData ATOM Format] is **Applied**.

Note:
> Issue state has been progressed by grouping motion (cf. section [[6.6.2][GM6]])

ODATA-252:
: "Clarify ordering of instance annotations in [ATOM] and [JSON]" [component: OData ATOM Format] is **Closed** with no objections.

####6.6.6 OData Protocol [GM7]

Stefan:
>I **move** to close ODATA-233, ODATA-157, ODATA-121, ODATA-265, ODATA-247 and ODATA-258  as applied. **Mike seconds**.

**No further discussion**. **No objections**. The **motion passes**.

#####6.6.6.1 [ODATA-233](https://tools.oasis-open.org/issues/browse/ODATA-233)

ODATA-233:
: "Change $batch response code from 202 Accepted to 200 OK" [component: OData Protocol] is **Applied**.

Note:
> Issue state has been progressed by grouping motion (cf. section [[6.6.6][GM7]])

ODATA-233:
: "Change $batch response code from 202 Accepted to 200 OK" [component: OData Protocol] is **Closed** with no objections.

#####6.6.6.2 [ODATA-157](https://tools.oasis-open.org/issues/browse/ODATA-157)

ODATA-157:
: "Specify how client correlates requests within a changeset with responses" [component: OData Protocol] is **Applied**.

Note:
> Issue state has been progressed by grouping motion (cf. section [[6.6.6][GM7]])

ODATA-157:
: "Specify how client correlates requests within a changeset with responses" [component: OData Protocol] is **Closed** with no objections.

#####6.6.6.3 [ODATA-121](https://tools.oasis-open.org/issues/browse/ODATA-121)

ODATA-121:
: "Please clarify whether agents handling DateTimeOffset must preserve the UTC offset" [component: OData Protocol] is **Applied**.

Note:
> Issue state has been progressed by grouping motion (cf. section [[6.6.6][GM7]])

ODATA-121:
: "Please clarify whether agents handling DateTimeOffset must preserve the UTC offset" [component: OData Protocol] is **Closed** with no objections.

#####6.6.6.4 [ODATA-265](https://tools.oasis-open.org/issues/browse/ODATA-265)

ODATA-265:
: "Allow omitting key properties from PUT and PATCH request bodies and from nested entities in deep-insert requests" [component: OData Protocol] is **Applied**.

Note:
> Issue state has been progressed by grouping motion (cf. section [[6.6.6][GM7]])

ODATA-265:
: "Allow omitting key properties from PUT and PATCH request bodies and from nested entities in deep-insert requests" [component: OData Protocol] is **Closed** with no objections.

####6.6.7 OData ATOM Format, OData CSDL, OData JSON Format [coatom_csdl_json1]

#####6.6.7.1 [ODATA-258](https://tools.oasis-open.org/issues/browse/ODATA-258)

ODATA-258:
: "Advertise function imports in service document" [components: OData CSDL, OData ATOM Format, OData JSON Format] is **Applied**.

Note:
> Issue state has been progressed by grouping motion (cf. section [[6.6.6][GM7]])

ODATA-258:
: "Advertise function imports in service document" [components: OData CSDL, OData ATOM Format, OData JSON Format] is **Closed** with no objections.

####6.6.8 OData ATOM Format, OData JSON Format, OData Protocol [coatom_csdl_prot1]

#####6.6.8.1 [ODATA-247](https://tools.oasis-open.org/issues/browse/ODATA-247)

ODATA-247:
: "More clearly define extensibility of Formats" [components: OData JSON Format, OData ATOM Format, OData Protocol] is **Applied**.

Note:
> Issue state has been progressed by grouping motion (cf. section [[6.6.6][GM7]])

ODATA-247:
: "More clearly define extensibility of Formats" [components: OData JSON Format, OData ATOM Format, OData Protocol] is **Closed** with no objections.

######6.w.x.y.z End of Issue Processing [eoip]

All take the opportunity to thank Ralf for the huge amount of work he put into the revisions of the work products he prepared and delivered.

Note:
>Time slot for issue processing gone. Skip all remaining agenda sub items of 6.

##7 Specification Reviews

###7.1 Review Request for next weeks

Discussion:

*  Ram gently reminds and brings back to the attention of the group our earlier discussion about specification reviews. We had discussed that after we resolve all the issues we will spend at least two 2-hour sessions during the TC meetings reviewing together the various Work Products before we approve them as Committee Specification Draft 01. Now that we are getting closer than ever before to resolving all the remaining issues (40 or so remaining), I  want to request members to start reviewing the latest drafts and prepare for the specification reviews (anticipated in the next 3 weeks or so).
*  Mike suggests to enter the review phase by offering shared editable review versions of the work products, so everyone can put in editorial stuff directly effectively bypassing JIRA for small issues and short-circuiting the edit-review-feedback loops where feasible.
* All agree todo so.
 
##8 Next Meetings

###8.1 Next weekly TC meeting will be 2013-03-21 during 8-10am PT.

Agreed.

###8.2 TC meeting on 2013-03-28 during 8-10am PT.

Discussion:

* Ram asks, if a spring break in Europe might be in conflict with this date.
* Martin, Mike and Ralf will **not** be available on 2013-03-28
* Mike suggests, that people use the meeting time on 2013-03-28 to review the docs.
* All agree to **not** meet on 2013-03-28.

##9 AOB

None.
 
### Meeting adjourned on 1000 PT

# Appendices

## List of Open Action Items Before the Meeting [AI_REF]

**Retrieval time stamp**: `2013-03-14 10:15 +01:00`.

AI#0018
: "Prepare Working Draft 01 (WD01) version of OData Extension for Temporal Data" [owner: Andrew Eisenberg] is **Ongoing**

AI#0019
: "Prepare Working Draft 01 (WD01) version of OData Extension for XML Data" [owner: Andrew Eisenberg] is **Ongoing**

AI#0020
: "Prepare Working Draft 01 (WD01) version of OData Extension for JSON Data" [owner: Susan Malaika] is **Ongoing**


**Note**: The actual action item processing is documented in section [4][AIH] and subsections thereof.

## Index of Issues Processed During the Meeting [IP_REF]

**Note**: The actual issue processing is documented in sections [6][IPH]. The below index has two main parts: First come the public comments (if any), second the JIRA issues. Each list of issues is sorted by ascending issue number. Noted are the ID, the summary and the reference to the relevant subsection where the issue progression has been documented:

Public Comments:

None.

JIRA Issues:

* [ODATA-20](https://tools.oasis-open.org/issues/browse/ODATA-20) "Feedback to document revision" [6.6.5.1][odata-20]
* [ODATA-37](https://tools.oasis-open.org/issues/browse/ODATA-37) "UPSERT: allow PUT and PATCH to the URL of a not yet existing entity to create this entity " [6.1.1.1][odata-37]
* [ODATA-42](https://tools.oasis-open.org/issues/browse/ODATA-42) "8.2.5 If-None-Match: clarify use of If-None-Match in data modification or action requests" [6.1.1.2][odata-42]
* [ODATA-43](https://tools.oasis-open.org/issues/browse/ODATA-43) "No indicator for optimistic concurrency control on EntityType or EntitySet level" [6.6.3.1][odata-43]
* [ODATA-68](https://tools.oasis-open.org/issues/browse/ODATA-68) "Describe representation of ReferenceTypes in responses" [6.3.4.1][odata-68]
* [ODATA-72](https://tools.oasis-open.org/issues/browse/ODATA-72) "Describe any() and all() lambda filter expressions " [6.5.8.5][odata-72]
* [ODATA-76](https://tools.oasis-open.org/issues/browse/ODATA-76) "Edm.Decimal is a floating-point type" [6.5.4.5][odata-76]
* [ODATA-103](https://tools.oasis-open.org/issues/browse/ODATA-103) "5.4.1 Representing Actions Bound to Multiple Entities: specify treatment of action overloads" [6.5.7.4][odata-103]
* [ODATA-104](https://tools.oasis-open.org/issues/browse/ODATA-104) "Consider supporting nullable complex typed properties" [6.5.8.4][odata-104]
* [ODATA-110](https://tools.oasis-open.org/issues/browse/ODATA-110) "Track Prefer Header in Http" [6.5.7.1][odata-110]
* [ODATA-121](https://tools.oasis-open.org/issues/browse/ODATA-121) "Please clarify whether agents handling DateTimeOffset must preserve the UTC offset" [6.6.6.3][odata-121]
* [ODATA-122](https://tools.oasis-open.org/issues/browse/ODATA-122) "Please clarify the meaning of filter functions applied to DateTimeOffset values" [6.5.8.6][odata-122]
* [ODATA-124](https://tools.oasis-open.org/issues/browse/ODATA-124) "For round-tripping values, what precision must agents support for DateTime(Offset), and are leap seconds permitted?" [6.4.1.3][odata-124]
* [ODATA-129](https://tools.oasis-open.org/issues/browse/ODATA-129) "Explicitly mention dynamic navigation properties in [Core]" [6.5.7.2][odata-129]
* [ODATA-139](https://tools.oasis-open.org/issues/browse/ODATA-139) "New system query option $search for free-text search within an entity set" [6.3.2.2][odata-139]
* [ODATA-140](https://tools.oasis-open.org/issues/browse/ODATA-140) "Describe rules for accessing derived entity and complex types in URLs" [6.5.8.2][odata-140]
* [ODATA-142](https://tools.oasis-open.org/issues/browse/ODATA-142) "Define URL functions geo.distance, geo.length, geo.intersects, and gettotaloffsetminutes" [6.5.8.1][odata-142]
* [ODATA-146](https://tools.oasis-open.org/issues/browse/ODATA-146) "Add example for inlining expanded entities" [6.5.3.5][odata-146]
* [ODATA-147](https://tools.oasis-open.org/issues/browse/ODATA-147) "Add example for $inlinecount representation" [6.5.3.4][odata-147]
* [ODATA-157](https://tools.oasis-open.org/issues/browse/ODATA-157) "Specify how client correlates requests within a changeset with responses" [6.6.6.2][odata-157]
* [ODATA-173](https://tools.oasis-open.org/issues/browse/ODATA-173) "Define Action values for OnDelete element" [6.6.1.5][odata-173]
* [ODATA-177](https://tools.oasis-open.org/issues/browse/ODATA-177) "Allow entities to be members of multiple entity sets" [6.3.2.1][odata-177]
* [ODATA-178](https://tools.oasis-open.org/issues/browse/ODATA-178) "Enhance abstract, distinguish its content from 1st paragraph of introduction and edit the payload object listing in 2nd para of 1 Introduction" [6.5.3.3][odata-178]
* [ODATA-179](https://tools.oasis-open.org/issues/browse/ODATA-179) "Adapt OData inter document references to new work product structuring of core" [6.5.1.2][odata-179]
* [ODATA-192](https://tools.oasis-open.org/issues/browse/ODATA-192) "Define core vocabulary term as a replacement for StoreGeneratedPattern attribute" [6.4.3.1][odata-192]
* [ODATA-200](https://tools.oasis-open.org/issues/browse/ODATA-200) "Handling of metadata:type attribute" [6.6.5.2][odata-200]
* [ODATA-201](https://tools.oasis-open.org/issues/browse/ODATA-201) "Allow specifying a list of acceptable media types for media entities and named resource properties" [6.6.2.1][odata-201]
* [ODATA-203](https://tools.oasis-open.org/issues/browse/ODATA-203) "Specify Operator Precedence more clearly" [6.5.8.3][odata-203]
* [ODATA-214](https://tools.oasis-open.org/issues/browse/ODATA-214) "Find consensus on 'Additional artifacts'-section of multi component Work Products (and implement accordingly) " [6.5.1.1][odata-214]
* [ODATA-215](https://tools.oasis-open.org/issues/browse/ODATA-215) "Remove hour(), minute() and second() query functions and add corresponding overloads to the hours(), minutes(), and seconds() functions" [6.5.2.1][odata-215]
* [ODATA-233](https://tools.oasis-open.org/issues/browse/ODATA-233) "Change $batch response code from 202 Accepted to 200 OK" [6.6.6.1][odata-233]
* [ODATA-234](https://tools.oasis-open.org/issues/browse/ODATA-234) "Merge Reference and AnnotationReference element" [6.6.1.4][odata-234]
* [ODATA-236](https://tools.oasis-open.org/issues/browse/ODATA-236) "Define maximum length of namespace names and simple identifiers" [6.6.1.3][odata-236]
* [ODATA-237](https://tools.oasis-open.org/issues/browse/ODATA-237) "Require type usage to always specify a qualified name for types other than the built-in primitive types" [6.5.4.4][odata-237]
* [ODATA-242](https://tools.oasis-open.org/issues/browse/ODATA-242) "Allow Path expressions also for annotations targeting an entity container" [6.6.1.2][odata-242]
* [ODATA-246](https://tools.oasis-open.org/issues/browse/ODATA-246) "IDs should be dereferenceable URIs" [6.1.1.3][odata-246]
* [ODATA-247](https://tools.oasis-open.org/issues/browse/ODATA-247) "More clearly define extensibility of Formats" [6.6.8.1][odata-247]
* [ODATA-249](https://tools.oasis-open.org/issues/browse/ODATA-249) "'Kind' property should be optional for EntitySets in JSON Service Documents" [6.5.6.1][odata-249]
* [ODATA-250](https://tools.oasis-open.org/issues/browse/ODATA-250) "For instance annotations in Atom, 'Annotation' element, 'Type', 'Term' and 'Target' attributes should be lower case" [6.5.3.2][odata-250]
* [ODATA-251](https://tools.oasis-open.org/issues/browse/ODATA-251) "Clarify, within [ATOM], that complex types can be annotated" [6.5.3.1][odata-251]
* [ODATA-252](https://tools.oasis-open.org/issues/browse/ODATA-252) "Clarify ordering of instance annotations in [ATOM] and [JSON]" [6.6.5.4][odata-252]
* [ODATA-253](https://tools.oasis-open.org/issues/browse/ODATA-253) "Clients should be prepared to handle unadvertised properties" [6.6.4.1][odata-253]
* [ODATA-254](https://tools.oasis-open.org/issues/browse/ODATA-254) "Selection of individual properties in [ATOM] should not include property name" [6.6.5.3][odata-254]
* [ODATA-256](https://tools.oasis-open.org/issues/browse/ODATA-256) "Simplify numeric data types" [6.2.1.2][odata-256]
* [ODATA-257](https://tools.oasis-open.org/issues/browse/ODATA-257) "Define standard client-side function for filling URL templates (RFC6570)" [6.6.1.6][odata-257]
* [ODATA-258](https://tools.oasis-open.org/issues/browse/ODATA-258) "Advertise function imports in service document" [6.6.7.1][odata-258]
* [ODATA-261](https://tools.oasis-open.org/issues/browse/ODATA-261) "Improve section 10.2.3.8 The $format System Query Option" [6.5.7.3][odata-261]
* [ODATA-265](https://tools.oasis-open.org/issues/browse/ODATA-265) "Allow omitting key properties from PUT and PATCH request bodies and from nested entities in deep-insert requests" [6.6.6.4][odata-265]
* [ODATA-268](https://tools.oasis-open.org/issues/browse/ODATA-268) "Use http://docs.oasis-open.org/odata/ns/edm as the EDM namespace URL" [6.5.4.3][odata-268]
* [ODATA-269](https://tools.oasis-open.org/issues/browse/ODATA-269) "Separate Functions and Actions" [6.5.5.1][odata-269]
* [ODATA-270](https://tools.oasis-open.org/issues/browse/ODATA-270) "Collections of Edm.PrimitiveType are problematic in JSON" [6.3.1.1][odata-270]
* [ODATA-272](https://tools.oasis-open.org/issues/browse/ODATA-272) "Remove FixedLength facet" [6.5.4.2][odata-272]
* [ODATA-273](https://tools.oasis-open.org/issues/browse/ODATA-273) "Clarify whether derived types MUST introduce new properties" [6.5.4.1][odata-273]
* [ODATA-275](https://tools.oasis-open.org/issues/browse/ODATA-275) "Clarify that binding parameters for actions and functions cannot be nullable" [6.2.1.1][odata-275]
* [ODATA-277](https://tools.oasis-open.org/issues/browse/ODATA-277) "Remove Collation attribute" [6.4.1.1][odata-277]
* [ODATA-278](https://tools.oasis-open.org/issues/browse/ODATA-278) "Introduce vocabulary expression edm:Url" [6.6.1.1][odata-278]
* [ODATA-283](https://tools.oasis-open.org/issues/browse/ODATA-283) "Accept-Charset HTTP Request Header and charset content-type parameter" [6.3.3.1][odata-283]
* [ODATA-285](https://tools.oasis-open.org/issues/browse/ODATA-285) "Section 4.7: explicitly mention which property types allow appending /$value" [6.4.2.1][odata-285]
* [ODATA-288](https://tools.oasis-open.org/issues/browse/ODATA-288) "Change default decimal Scale to variable" [6.4.1.2][odata-288]
* [ODATA-292](https://tools.oasis-open.org/issues/browse/ODATA-292) "Questions on POST, PATCH and merge/replace semantics with related entities in composite relationships" [6.4.4.1][odata-292]
* [ODATA-293](https://tools.oasis-open.org/issues/browse/ODATA-293) "Clarify protocol or JSON spec: are servers REQUIRED to support JSON format?" [6.4.5.1][odata-293]

## Timeline Reference [TL_REF]
  
**Note**: Please cf. the current revision of the [TC timeline](https://www.oasis-open.org/committees/download.php/48148/TC%20Timeline%203.htm).
