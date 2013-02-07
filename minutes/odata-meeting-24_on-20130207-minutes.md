#OData meeting #24, Thursday, 07 Feb 2013, 0800 - 0900 PT

**Note**: For explanations of conventions and other formal aspects common to OData TC meeting minutes which are used in this document please cf. "[Formal Aspects of Meeting Minutes](https://www.oasis-open.org/committees/download.php/48109/formal-aspects-meeting-minutes-v1.html)". 

Meeting chaired by Barbara Hartel and Ram Jeyaraman

Acting Chair: Ram Jeyaraman

## 1 Roll call
 
### 1.1 Members Present: 

        Anila Kumar GVN (CA Technologies)        Barbara Hartel (SAP AG)        Dale Moberg (Axway Software)        Diane Downie (Citrix Systems)        Erik de Voogd (SDL)        Gerald Krause (SAP AG)        Hubert Heijkers (IBM)        Jeffrey Turpin (Axway Software)        John Willson (Individual)        Matthew Borges (SAP AG)        Michael Pizzo (Microsoft) a.k.a. Mike        Nuno Linhares (SDL)        Patrick Durusau (Individual)        Ralf Handl (SAP AG)        Ram Jeyaraman (Microsoft)        Robert Richards (Mashery)        Stan Mitranic (CA Technologies)        Stefan Drees (Individual)        Susan Malaika (IBM)

Quorum achieved. Details cf. [normative attendance sheet for this meeting](https://www.oasis-open.org/apps/org/workgroup/odata/event.php?event_id=34183).

## 2 Approval of Agenda

Agenda approved as published. 

## 3 Approval of Minutes from Previous Meeting(s)

### 3.1 Approval of [Minutes of 2013-01-30/31 Meeting#23](https://www.oasis-open.org/committees/download.php/48116/odata-meeting-23_on-20130130_31-F2F-minutes.html)

**Meeting minutes approved with no objections**. 

##4 Review of [Action Items](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_items.php) (AI) and Progress [AIH]

Context:
> See the "[List of Open Action Items Before the Meeting][AI_REF]" section in the appendix.
  
Discussion:

* Mike suggests to figure out some dates for eg. xml extensions etc.
* Mike also thinks, data aggregation and temporal might go into separate standards
* Hubert asks, if a timeline for those deliverables shall be discussed (and proposed) now
* All think, that we need at least a broad, general timeline for these before the next face to face meeting.
* Mike explains, that the xml extensions should be largely implemented through vocabularies as discussed during face to face meeting in Z&uuml;rich
* All agree, to create new actions (first on data aggregation) which Ram will support to make it happen and that the desciption of these action items shall also clarify, what the exact target is.
* Hubert suggests, that we shall especially clarify how data aggregation will be handled. Part of it may end up in a new SuperFunction inside core, the other somewhere else.
* Ram will consider this in his suggestions on a first timeline

**No further discussion**. **No objections**.

###4.1 Action items due by 2013-02-07 (end of day)

####4.1.1 [AI#0028](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_item.php?action_item_id=3559)

AI#0028
: "Come up with a first milestone for the temporal extension" [owner: Andrew Eisenberg] is **Ongoing** (Note: Due 2013-02-07)

Discussion:

* Still ongoing. 
* Due date will be shifted for one week, due date now set to 2013-02-14. 

AI#0028
: "Come up with a first milestone for the temporal extension" [owner: Andrew Eisenberg] is **Ongoing** (Note: Due 2013-02-14)

###4.2 Action items NOT due by 2013-02-07 (end of day) but MAY be ready for closure

####4.2.1 [AI#0005](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_item.php?action_item_id=3462)

AI#0005
: "Come up with a first milestone for the temporal extension" [owner: Andrew Eisenberg] is **Ongoing** (Note: Due 2013-04-26)

Discussion:

* Closed as discussed in unified extension handling context inside section [4][AIH].

AI#0005
: "Come up with a first milestine for the temporal extension" [owner: Andrew Eisenberg] is **Closed**.

####4.2.2 [AI#0006](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_item.php?action_item_id=3463)

AI#0006
: "Come up with estimate for first milestone for XML data extension" [owner: Andrew Eisenberg] is **Ongoing** (Note: Due 2013-04-26)

Discussion:

* Closed as discussed in unified extension handling context inside section [4][AIH].

AI#0006
: "Come up with estimate for first milestone for XML data extension" [owner: Andrew Eisenberg] is **Closed**.

####4.2.3 [AI#0007](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_item.php?action_item_id=3464)

AI#0007
: "Come up with estimate for first milestone for JSON data extension" [owner: Susan Malaika] is **Ongoing** (Note: Due 2013-04-26)

Discussion:

* Closed as discussed in unified extension handling context inside section [4][AIH].

AI#0007
: "Come up with estimate for first milestone for JSON data extension" [owner: Susan Malaika] is **Closed**.

##5 Review of [Issues List](https://tools.oasis-open.org/issues/secure/IssueNavigator.jspa?reset=true&mode=hide&pid=10103&sorter/field=issuekey&sorter/order=ASC) (IL) and Progress [IPH]

**Notes**:

* Issues in this section (5) may have been progressed out of sequence, but have been noted here to better group by components impacted as a service for the reader.
* There is an "[Index of Issues Processed During the Meeting][IP_REF]" section in the appendix.

Discussion:

* All agree, that ODATA-272 is the last issue belonging to the period before 2013-02-07. All later issues will fall under the agreed ruling as established at [meeting#23](https://www.oasis-open.org/committees/download.php/48116/odata-meeting-23_on-20130130_31-F2F-minutes.html#timelinereviewtl_ref) and further detailed in message [RE: Higher bar for accepting issues for OData v4.0](https://lists.oasis-open.org/archives/odata/201302/msg00157.html). 

###5.1 Issues in Applied state

####5.1.1 [ODATA-11](https://tools.oasis-open.org/issues/browse/ODATA-11)

ODATA-11
: "date/time values without explicit time zones need further investigation" [components: OData URL Conventions, OData CSDL] is **Applied**.

Ralf: 
>I **move** close ODATA-11 as applied. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-11
: "date/time values without explicit time zones need further investigation" [components: OData URL Conventions, OData CSDL] is **Closed** with no objections.

####5.1.2 [ODATA-107](https://tools.oasis-open.org/issues/browse/ODATA-107)

ODATA-107
: "Should OData support a 'clock time' (xs:time) datatype?" [components: OData CSDL, OData ABNF Construction Rules, OData URL Conventions] is **Applied**.

Ralf: 
>I **move** to close ODATA-107 as applied. **Hubert seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-107
: "Should OData support a 'clock time' (xs:time) datatype?" [components: OData CSDL, OData ABNF Construction Rules, OData URL Conventions] is **Closed** with no objections.

####5.1.3 [ODATA-194](https://tools.oasis-open.org/issues/browse/ODATA-194)

ODATA-194
: "Inside section 4.1.1 The Version Attribute, the version defined by this spec should be 4.0 and not 1.0 for the EDMX wrapper" [component: OData CSDL] is  **Applied**.

Ralf: 
>I **move** close ODATA-194 as applied. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-194
: "Inside section 4.1.1 The Version Attribute, the version defined by this spec should be 4.0 and not 1.0 for the EDMX wrapper" [component: OData CSDL] is **Closed** with no objections.

####5.1.4 [ODATA-195](https://tools.oasis-open.org/issues/browse/ODATA-195)

ODATA-195
: "Simplify entity set qualification rules for NavigationPropertyBinding" [component: OData CSDL] is **Applied**.

Ralf: 
>I **move** to close ODATA-195 as applied. **Hubert seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-195
: "Simplify entity set qualification rules for NavigationPropertyBinding" [component: OData CSDL] is **Closed** with no objections.

####5.1.5 [ODATA-60](https://tools.oasis-open.org/issues/browse/ODATA-60)

ODATA-60
: "Allow complex properties or components of complex properties as key parts" [component: OData CSDL] is **Applied**.

Ralf: 
>I **move** to close ODATA-60 as applied. **Hubert seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-60
: "Allow complex properties or components of complex properties as key parts" [component: OData CSDL] is **Closed** with no objections.
 
###5.2 Issues in Proposed state

####5.2.1 OData CSDL

#####5.2.1.1 [ODATA-235](https://tools.oasis-open.org/issues/browse/ODATA-235)

ODATA-235
: "Limit primitive types allowed as key parts to the 'sufficiently discrete' types" [component: OData CSDL] is **New**.

Discussion:

* John asks, why the latlong types are excluded (Edm.Geo*)
* Ralf answers, that he understood from the Z&uuml;rich meeting, that there are issues with precision, but does not know, if this should lead to exclusion or not.
* Mike asks, if these types are essential as keys in the use cases known to John, which he answers as yes.
* John mentions, that from the application perspective it would be good to at least be able to join digits from the left (probably no protocol issue)
* Ralf mentions, that for such a correlation, it might not be necessary to have a type.
* Mike states, that in some situations keys or edit links make no sense and suggests to take this discussion offline.
* Mike will create a JIRA issue and work with John on a solution for it, but suggests to accept ODATA-235 as proposed now with some ammendment for some types.
* John likes that proposal

Mike: 
>I **move** we approve ODATA-235 with the modification that Geo.Point may be used as a key. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-235
: "Limit primitive types allowed as key parts to the 'sufficiently discrete' types" [component: OData CSDL] is **Resolved as noted in the motion** with no objections.

#####5.2.1.2 [ODATA-234](https://tools.oasis-open.org/issues/browse/ODATA-234)

ODATA-234
: "Merge Reference and AnnotationReference element" [component: OData CSDL] is **New**.

Discussion:

* Mike asks, what the proposal implies, when the IncludeAnnotations element is not included
* Ralf answers, that one way to trigger the lookup is by using a "term cast" segment in a path expression
* All discuss what happens, if we introduce an alias for annotations.
* Mike asks, what if he has a Reference, but no IncludeAnnotations only the terms from the vocabulary? 
* Ralf states, we do not bring it in, but make it findable, that is bring it in, when we use it.
* All agree, that the references are returned as links to the client, which in turn may retrieve them, but never the server recursively crawling along these links
* Mike thinks the area around references and what is returned, seems tricky, so suggests some more thinking about it
* Ralf agrees to continue discussion on it.

**No further discussion**. **No objections**. 

ODATA-234
: "Merge Reference and AnnotationReference element" [component: OData CSDL] is **Open** with no objections.

#####5.2.1.3 [ODATA-227](https://tools.oasis-open.org/issues/browse/ODATA-227)

ODATA-227
: "Support of symbolic names in annotations" [component: OData CSDL] is **New**.

Discussion:

* Ralf summarizes the rationale behind the proposal and gives samples 
* After discussion with Mike he offers to additionally allow the at-syntax, that is eg. NamedProperty/odata.mediaReadLink or NamedProperty@odata.mediaReadLink
* All agree, that one look at the JSON payload would show what it means.

Ralf: 
>I **move** to resolve ODATA-227 as proposed with the addition of using NamedStream@odata.media*. **Mike seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-227
: "Support of symbolic names in annotations" [component: OData CSDL] is **Resolved as noted in the motion** with no objections.

#####5.2.1.4 [ODATA-217](https://tools.oasis-open.org/issues/browse/ODATA-217)

ODATA-217
: "property facets in ValueTerm element" [component: OData CSDL] is **New**.

Discussion:

* Mike asks if we have the right set today (as in the proposal) or if changes still have to be made?
* Ralf answers, that this has already been fixed and applied in SVN with the exception of unicode related stuff.

Ralf: 
>I **move** to resolve ODATA-217 as proposed, with the change of moving Unicode out of the common group. **Mike seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-217
: "property facets in ValueTerm element" [component: OData CSDL] is is **Resolved as noted in the motion** with no objections.

#####5.2.1.5 [ODATA-216](https://tools.oasis-open.org/issues/browse/ODATA-216)

ODATA-216
: "Allow edm:Documentation element in edm:TypeDefinition and edm:Annotations element" [component: OData CSDL] is **Resolved**.

Discussion:

* Ralf has applied but wishes to give the members one more week, to go over the documents and verify that all are satisfied with it.
* All: Promise to look over the application, so the issue can move to close next week.

**No further discussion**. **No objections**. 

ODATA-216
: "Allow edm:Documentation element in edm:TypeDefinition and edm:Annotations element" [component: OData CSDL] is **Applied** with no objections.

######5.2.1.5.1 End of Issue Processing [eoip]

Note:
>Time slot for issue processing gone. Skip all remaining agenda sub items of 5.

##6 Next Meeting
Next weekly TC meeting will be 2013-02-14 during 8-9am PT.

Regrets from Martin and Hubert

##7 AOB

None. 
 
### Meeting adjourned on 0900 PT FIXME

# Appendices

## List of Open Action Items Before the Meeting [AI_REF]

**Retrieval time stamp**: `2013-02-07 14:45 +01:00`.

AI#0005
: "Come up with a first milestine for the temporal extension" [owner: Andrew Eisenberg] is **Ongoing** (Note: Due 2013-01-31)

AI#0006
: "Come up with estimate for first milestone for XML data extension" [owner: Andrew Eisenberg] is **Ongoing** (Note: Due 2013-01-31)

AI#0007
: "Come up with estimate for first milestone for JSON data extension" [owner: Susan Malaika] is **Ongoing** (Note: Due 2013-01-31)

AI#0018
: "Prepare Working Draft 01 (WD01) version of OData Extension for Temporal Data" [owner: Andrew Eisenberg] is **Ongoing**

AI#0019
: "Prepare Working Draft 01 (WD01) version of OData Extension for XML Data" [owner: Andrew Eisenberg] is **Ongoing**

AI#0020
: "Prepare Working Draft 01 (WD01) version of OData Extension for JSON Data" [owner: Susan Malaika] is **Ongoing**

AI#0028
: "Introduce fix target versions 4.0, minor and next major into JIRA" [owner: Ram Jeyaraman] is **Ongoing** (Note: Due 2013-02-07)


**Note**: The actual action item processing is documented in section [4][AIH] and subsections thereof.

## Index of Issues Processed During the Meeting [IP_REF]

**Note**: The actual issue processing is documented in sections [5][IPH]. The below index has two main parts: First come the public comments (if any), second the JIRA issues. Each list of issues is sorted by ascending issue number. Noted are the ID, the summary and the reference to the relevant subsection where the issue progression has been documented:

Public Comments:

None.

JIRA Issues:

* [ODATA-11](https://tools.oasis-open.org/issues/browse/ODATA-11) "date/time values without explicit time zones need further investigation" [5.1.1][odata-11]
* [ODATA-60](https://tools.oasis-open.org/issues/browse/ODATA-60) "Allow complex properties or components of complex properties as key parts" [5.1.5][odata-60] 
* [ODATA-107](https://tools.oasis-open.org/issues/browse/ODATA-107) "Should OData support a 'clock time' (xs:time) datatype?" [5.1.2][odata-107]
* [ODATA-194](https://tools.oasis-open.org/issues/browse/ODATA-194) "Inside section 4.1.1 The Version Attribute, the version defined by this spec should be 4.0 and not 1.0 for the EDMX wrapper" [5.1.3][odata-194]
* [ODATA-195](https://tools.oasis-open.org/issues/browse/ODATA-195) "Simplify entity set qualification rules for NavigationPropertyBinding" [5.1.4][odata-195]
* [ODATA-216](https://tools.oasis-open.org/issues/browse/ODATA-216) "Allow edm:Documentation element in edm:TypeDefinition and edm:Annotations element" cf. section [5.2.1.5][odata-216]
* [ODATA-217](https://tools.oasis-open.org/issues/browse/ODATA-217) "property facets in ValueTerm element" cf. section [5.2.1.4][odata-217]
* [ODATA-227](https://tools.oasis-open.org/issues/browse/ODATA-227) "Support of symbolic names in annotations" [5.2.1.3][odata-227]
* [ODATA-234](https://tools.oasis-open.org/issues/browse/ODATA-234) "Merge Reference and AnnotationReference element" [5.2.1.2][odata-234]
* [ODATA-235](https://tools.oasis-open.org/issues/browse/ODATA-235) "Limit primitive types allowed as key parts to the 'sufficiently discrete' types" [5.2.1.1][odata-235]

## Timeline Reference [TL_REF]
  
**Note**: Please cf. the current revision of the [TC timeline](https://www.oasis-open.org/committees/download.php/48148/TC%20Timeline%203.htm).
