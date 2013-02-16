#OData meeting #25, Thursday, 14 Feb 2013, 0800 - 0900 PT

**Note**: For explanations of conventions and other formal aspects common to OData TC meeting minutes which are used in this document please cf. "[Formal Aspects of Meeting Minutes](https://www.oasis-open.org/committees/download.php/48109/formal-aspects-meeting-minutes-v1.html)". 

Meeting chaired by Ram Jeyaraman

## 1 Roll call
 
### 1.1 Members Present: 

        Andrew Eisenberg (IBM)        Dale Moberg (Axway Software)        Erik de Voogd (SDL)        Gerald Krause (SAP AG)        Hubert Heijkers (IBM)        Jeffrey Turpin (Axway Software)        John Willson (Individual)        Ken Baclawski (Northeastern University)        Martin Zurmuehl (SAP AG)        Matthew Borges (SAP AG)        Michael Pizzo (Microsoft) a.k.a. Mike        Nuno Linhares (SDL)        Patrick Durusau (Individual)        Ralf Handl (SAP AG)        Ram Jeyaraman (Microsoft)        Robert Richards (Mashery)        Stan Mitranic (CA Technologies)        Stefan Drees (Individual)        Susan Malaika (IBM)        Ted Jones (Red Hat)

Quorum achieved. Details cf. [normative attendance sheet for this meeting](https://www.oasis-open.org/apps/org/workgroup/odata/event.php?event_id=34184).

## 2 Approval of Agenda

Agenda approved as published.

## 3 Approval of Minutes from Previous Meeting(s)

### 3.1 Approval of [Minutes of 2013-02-07 Meeting#24](https://www.oasis-open.org/committees/download.php/48258/odata-meeting-24_on-20130207-minutes.html)

**Meeting minutes approved with no objections**. 

##4 Review of [Action Items](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_items.php) (AI) and Progress [AIH]

Context:
> See the "[List of Open Action Items Before the Meeting][AI_REF]" section in the appendix.
  
###4.1 Action items due by 2013-02-14 (end of day)

####4.1.1 [AI#0028](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_item.php?action_item_id=3559)

AI#0028
: "Introduce fix target versions 4.0, minor and next major into JIRA" [owner: Ram Jeyaraman] is **Ongoing** (Note: Due 2013-02-14)

Discussion:

* Ram checked with the TC admin, that we MAY start with version 4.0 (instead of the until now used 1.0) for the work products, thus recognizing, that there are already three major versions of OpenData specified and in use today.
* Ram asks for a motion to accept renaming the planned versions of Open Data accordingly, namely 4.0, 4.1 and 5.0.

Stefan: 
>I **move** to call the OASIS OData Work Products as version 4.0 (instead of version 1.0) and call the next major revision as version 5.0 and next minor revision as version 4.1 . **Nuno seconds**.

**No further discussion**. **No objections**. The **motion passes**.

**Note**:

* Ram kindly asks the editors to please change the versions inside the work products accordingly from v1.0 into v4.0. 
* Ram will change JIRA entries where needed.
* The asscoiated action item 28 thus remains ongoing and the due date will be shifted to 2013-02-21.

AI#0028
: "Introduce fix target versions 4.0, minor and next major into JIRA" [owner: Ram Jeyaraman] is **Ongoing** (Note: Due 2013-02-21)

###4.2 Action items NOT due by 2013-02-14 (end of day) but MAY be ready for closure

None. 

##5 Review of [Issues List](https://tools.oasis-open.org/issues/secure/IssueNavigator.jspa?reset=true&mode=hide&pid=10103&sorter/field=issuekey&sorter/order=ASC) (IL) and Progress [IPH]

**Notes**:

* Issues in this section (5) may have been progressed out of sequence, but have been noted here to better group by components impacted as a service for the reader.
* There is an "[Index of Issues Processed During the Meeting][IP_REF]" section in the appendix.

Discussion:

* Ram reminds everyone, that he kindly asked for offline review of the applied issues, so that we may close the large number of pending applied issues as fast as possible.
* All agree, they had enough time to review the applications.

###5.1 Issues in Applied state

All accept to follow the grouping and sequence for processing of applied issues that Mike suggested in his mail "[RE: Agenda for OData TC meeting 2013.02.14](https://lists.oasis-open.org/archives/odata/201302/msg00212.html)".

####5.1.1 Already reviewed and approved for all components but OData Protocol [GM1]

Discussion:

* Mike summarizes and comments on subgroupings of this sections issues ODATA-11, 13, 14, 24, 32, 38, 73, 107, 114 and 132.

John: 
>I **move** to close the issues ODATA-11, 13, 14, 24, 32, 38, 73, 107, 114 and 132 as applied. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

#####5.1.1.1 [ODATA-107](https://tools.oasis-open.org/issues/browse/ODATA-107)

ODATA-107
: "Should OData support a 'clock time' (xs:time) datatype?" [components: CSDL, ABNF Construction Rules, URL Conventions] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[5.1.1][GM1]])

ODATA-107
: "Should OData support a 'clock time' (xs:time) datatype?" [components: CSDL, ABNF Construction Rules, URL Conventions] is **Closed** with no objections.

####5.1.1.2 [ODATA-14](https://tools.oasis-open.org/issues/browse/ODATA-14)

ODATA-14
: "add Edm.Date to the OData primitive data types" [components: URL Conventions, CSDL] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[5.1.1][GM1]])

ODATA-14
: "add Edm.Date to the OData primitive data types" [components: URL Conventions, CSDL] is **Closed** with no objections.

####5.1.1.3 [ODATA-13](https://tools.oasis-open.org/issues/browse/ODATA-13)

ODATA-13
: "A function that returns the current date and time is needed" [component: URL Conventions] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[5.1.1][GM1]])

ODATA-13
: "A function that returns the current date and time is needed" [component: URL Conventions] is **Closed** with no objections.

####5.1.1.4 [ODATA-11](https://tools.oasis-open.org/issues/browse/ODATA-11)

ODATA-11
: "date/time values without explicit time zones need further investigation" [components: URL Conventions, CSDL] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[5.1.1][GM1]])

ODATA-11
: "date/time values without explicit time zones need further investigation" [components: URL Conventions, CSDL] is **Closed** with no objections.

####5.1.1.5 [ODATA-73](https://tools.oasis-open.org/issues/browse/ODATA-73)

ODATA-73
: "Retrieve the count of related entities together with the base entity" [component: URL Conventions] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[5.1.1][GM1]])

ODATA-73
: "Retrieve the count of related entities together with the base entity" [component: URL Conventions] is **Closed** with no objections.

####5.1.1.6 [ODATA-38](https://tools.oasis-open.org/issues/browse/ODATA-38)

ODATA-38
: "Recursive $expand and $select" [component: URL Conventions] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[5.1.1][GM1]])

ODATA-38
: "Recursive $expand and $select" [component: URL Conventions] is **Closed** with no objections.

####5.1.1.7 [ODATA-32](https://tools.oasis-open.org/issues/browse/ODATA-32)

ODATA-32
: "Allow filtering of expanded to-many navigation properties" [component: URL Conventions] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[5.1.1][GM1]])

ODATA-32
: "Allow filtering of expanded to-many navigation properties" [component: URL Conventions] is **Closed** with no objections.

####5.1.1.8 [ODATA-132](https://tools.oasis-open.org/issues/browse/ODATA-132)

ODATA-132
: "Support /$count in $filter and $orderby" [components: URL Conventions, ABNF Construction Rules] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[5.1.1][GM1]])

ODATA-132
: "Support /$count in $filter and $orderby" [components: URL Conventions, ABNF Construction Rules] is **Closed** with no objections.

####5.1.1.9 [ODATA-114](https://tools.oasis-open.org/issues/browse/ODATA-114)

ODATA-114
: "Allow /$count path suffix also for collection properties" [components: URL Conventions, ABNF Construction Rules] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[5.1.1][GM1]])

ODATA-114
: "Allow /$count path suffix also for collection properties" [components: URL Conventions, ABNF Construction Rules] is **Closed** with no objections.

####5.1.1.10 [ODATA-24](https://tools.oasis-open.org/issues/browse/ODATA-24)

ODATA-24
: "Simplify how Relationships are expressed in CSDL" [component: CSDL] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[5.1.1][GM1]])

ODATA-24
: "Simplify how Relationships are expressed in CSDL" [component: CSDL] is **Closed** with no objections.


####5.1.2 Model References Changes [GM2]

Discussion:

* Mike summarizes and comments on subgroupings of this sections issues ODATA-180, 181, 182 and 193.

Ralf: 
>I **move** to close ODATA-180, 181, 182 and 193 as applied. **Mike seconds**.

**No further discussion**. **No objections**. The **motion passes**.

####5.1.2.1 [ODATA-193](https://tools.oasis-open.org/issues/browse/ODATA-193)

ODATA-193
: "Allow function imports to return entities from a different service" [component: CSDL] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[5.1.2][GM2]])

ODATA-193
: "Allow function imports to return entities from a different service" [component: CSDL] is **Closed** with no objections.

####5.1.2.2 [ODATA-182](https://tools.oasis-open.org/issues/browse/ODATA-182)

ODATA-182
: "Define the term 'model'" [component: CSDL] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[5.1.2][GM2]])

ODATA-182
: "Define the term 'model'" [component: CSDL] is **Closed** with no objections.

####5.1.2.3 [ODATA-181](https://tools.oasis-open.org/issues/browse/ODATA-181)

ODATA-181
: "Referencing/reusing a model element from a different schema does not require to 'include' this schema via a Using element" [component: CSDL] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[5.1.2][GM2]])

ODATA-181
: "Referencing/reusing a model element from a different schema does not require to 'include' this schema via a Using element" [component: CSDL] is **Closed** with no objections.

####5.1.2.4 [ODATA-180](https://tools.oasis-open.org/issues/browse/ODATA-180)

ODATA-180
: "Remove Extends attribute from EntityContainer element" [component: CSDL] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[5.1.2][GM2]])

ODATA-180
: "Remove Extends attribute from EntityContainer element" [component: CSDL] is **Closed** with no objections.


####5.1.3 Annotations [GM3]

Discussion:

* Ralf summarizes and comments on subgroupings of this sections issues ODATA-12, 108, 109, 217, 226, 227, 229, 231 and 241.
* Mike suggests, that even the application of ODATA-227 shall be accepted as applied and might be later re-considered to add the at-sign if necessary.

Mike: 
>I **move** we approve the applied resolutions to ODATA-12, ODATA-108, ODATA-109, ODATA-217, ODATA-226, ODATA-227, ODATA-229, ODATA-231 and ODATA-241. **Ralf seconds**.

**No further discussion**. **No objections**. The **motion passes**.


####5.1.3.1 [ODATA-226](https://tools.oasis-open.org/issues/browse/ODATA-226)

ODATA-226
: "Clarify that the root of the Path attribute of a element is rooted at the containing entity " [component: CSDL] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[5.1.3][GM3]])

ODATA-226
: "Clarify that the root of the Path attribute of a element is rooted at the containing entity " [component: CSDL] is **Closed** with no objections.

####5.1.3.2 [ODATA-109](https://tools.oasis-open.org/issues/browse/ODATA-109)

ODATA-109
: "Define rules for specifying annotations within annotations" [component: CSDL] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[5.1.3][GM3]])

ODATA-109
: "Define rules for specifying annotations within annotations" [component: CSDL] is **Closed** with no objections.

####5.1.3.3 [ODATA-108](https://tools.oasis-open.org/issues/browse/ODATA-108)

ODATA-108
: "Define rules for the target of an annotation that supports implicit casting of relationships" [component: CSDL] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[5.1.3][GM3]])

ODATA-108
: "Define rules for the target of an annotation that supports implicit casting of relationships" [component: CSDL] is **Closed** with no objections.

####5.1.3.4 [ODATA-12](https://tools.oasis-open.org/issues/browse/ODATA-12)

ODATA-12
: "create a data type for property names" [component: CSDL] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[5.1.3][GM3]])

ODATA-12
: "create a data type for property names" [component: CSDL] is **Closed** with no objections.

####5.1.3.5 [ODATA-231](https://tools.oasis-open.org/issues/browse/ODATA-231)

ODATA-231
: "Define how to specify enumeration values in annotations" [component: CSDL] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[5.1.3][GM3]])

ODATA-231
: "Define how to specify enumeration values in annotations" [component: CSDL] is **Closed** with no objections.

####5.1.3.6 [ODATA-229](https://tools.oasis-open.org/issues/browse/ODATA-229)

ODATA-229
: "Allow annotations to target all model elements" [component: CSDL] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[5.1.3][GM3]])

ODATA-229
: "Allow annotations to target all model elements" [component: CSDL] is **Closed** with no objections.

####5.1.3.7 [ODATA-227](https://tools.oasis-open.org/issues/browse/ODATA-227)

ODATA-227
: "Support of symbolic names in annotations" [component: CSDL] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[5.1.3][GM3]])

ODATA-227
: "Support of symbolic names in annotations" [component: CSDL] is **Closed** with no objections.

####5.1.3.8 [ODATA-217](https://tools.oasis-open.org/issues/browse/ODATA-217)

ODATA-217
: "property facets in ValueTerm element" [component: CSDL] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[5.1.3][GM3]])

ODATA-217
: "property facets in ValueTerm element" [component: CSDL] is **Closed** with no objections.

####5.1.3.9 [ODATA-241](https://tools.oasis-open.org/issues/browse/ODATA-241)

ODATA-241
: "Consistently require annotations to be placed at the end of the annotated CSDL element" [component: CSDL] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[5.1.3][GM3]])

ODATA-241
: "Consistently require annotations to be placed at the end of the annotated CSDL element" [component: CSDL] is **Closed** with no objections.


####5.1.4 Application of relatively straight-forward changes [GM4]

Discussion:

* Mike summarizes again the issues.
* Ralf adds that we need to adapt some rules 
* Mike suggests to **not act on ODATA-225** today.
* Ralf and Mike further discuss application of ODATA-110
* Ralf cites the Snell-RFC-draft, that the server MAY respond and asks, if we shall forbid this in our spec?
* Mike suggests to also **leave this issue ODATA-110 out** (for today) and sketches his proposal to handle it.

Stefan: 
>I **move** we close the issues ODATA-41, ODATA-158, ODATA-169, ODATA-187, ODATA-197, ODATA-213, ODATA-216, ODATA-218, ODATA-235 and ODATA-238 as applied. **Ralf seconds**.

**No further discussion**. **No objections**. The **motion passes**.

**Note**:

* ODATA-110 has not been closed today.
* ODATA-225 has not been closed today.

####5.1.4.1 [ODATA-169](https://tools.oasis-open.org/issues/browse/ODATA-169)

ODATA-169
: "Representation of named entities in the service document" [components: JSON Format, ATOM Format] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[5.1.4][GM4]])

ODATA-169
: "Representation of named entities in the service document" [components: JSON Format, ATOM Format] is **Closed** with no objections.

####5.1.4.2 [ODATA-158](https://tools.oasis-open.org/issues/browse/ODATA-158)

ODATA-158
: "OData ATOM format should require element" [component: ATOM Format] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[5.1.4][GM4]])

ODATA-158
: "OData ATOM format should require element" [component: ATOM Format] is **Closed** with no objections.

####5.1.4.3 [ODATA-238](https://tools.oasis-open.org/issues/browse/ODATA-238)

ODATA-238
: "Restrict values of the Qualifier attribute to QualifiedName values" [component: CSDL] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[5.1.4][GM4]])

ODATA-238
: "Restrict values of the Qualifier attribute to QualifiedName values" [component: CSDL] is **Closed** with no objections.

####5.1.4.4 [ODATA-235](https://tools.oasis-open.org/issues/browse/ODATA-235)

ODATA-235
: "Limit primitive types allowed as key parts to the 'sufficiently discrete' types" [component: CSDL] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[5.1.4][GM4]])

ODATA-235
: "Limit primitive types allowed as key parts to the 'sufficiently discrete' types" [component: CSDL] is **Closed** with no objections.

####5.1.4.5 [ODATA-216](https://tools.oasis-open.org/issues/browse/ODATA-216)

ODATA-216
: "Allow edm:Documentation element in edm:TypeDefinition and edm:Annotations element" [component: CSDL] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[5.1.4][GM4]])

ODATA-216
: "Allow edm:Documentation element in edm:TypeDefinition and edm:Annotations element" [component: CSDL] is **Closed** with no objections.

####5.1.4.6 [ODATA-213](https://tools.oasis-open.org/issues/browse/ODATA-213)

ODATA-213
: "Allow all dynamic expressions of the appropriate type within edm:Collection expressions" [component: CSDL] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[5.1.4][GM4]])

ODATA-213
: "Allow all dynamic expressions of the appropriate type within edm:Collection expressions" [component: CSDL] is **Closed** with no objections.

####5.1.4.7 [ODATA-197](https://tools.oasis-open.org/issues/browse/ODATA-197)

ODATA-197
: "Define standard functions for edm:Apply element" [component: CSDL] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[5.1.4][GM4]])

ODATA-197
: "Define standard functions for edm:Apply element" [component: CSDL] is **Closed** with no objections.

####5.1.4.8 [ODATA-218](https://tools.oasis-open.org/issues/browse/ODATA-218)

ODATA-218
: "Remove doubled last paragraph in section 8.5.2 The Preference-Applied Header" [component: Protocol] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[5.1.4][GM4]])

ODATA-218
: "Remove doubled last paragraph in section 8.5.2 The Preference-Applied Header" [component: Protocol] is **Closed** with no objections.

####5.1.4.9 [ODATA-187](https://tools.oasis-open.org/issues/browse/ODATA-187)

ODATA-187
: "Need to remove references to associations and associationsets from protocol doc" [component: Protocol] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[5.1.4][GM4]])

ODATA-187
: "Need to remove references to associations and associationsets from protocol doc" [component: Protocol] is **Closed** with no objections.

####5.1.4.10 [ODATA-110](https://tools.oasis-open.org/issues/browse/ODATA-110)

ODATA-110
: "Track Prefer Header in Http" [component: Protocol] is **Applied**.

**Note**:
> Issue state has **not** been progressed as noted in discussion before grouping motion (cf. section [[5.1.4][GM4]])

####5.1.4.11 [ODATA-41](https://tools.oasis-open.org/issues/browse/ODATA-41)

ODATA-41
: "Specify which URL formats are acceptable within $batch, and which to prefer" [component: Protocol] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[5.1.4][GM4]])

ODATA-41
: "Specify which URL formats are acceptable within $batch, and which to prefer" [component: Protocol] is **Closed** with no objections.

####5.1.4.12 [ODATA-225](https://tools.oasis-open.org/issues/browse/ODATA-225)

ODATA-225
: "Define Functions in Schema; reference in Container using FunctionImport." [components: CSDL, ABNF Construction Rules] is **Applied**.

**Note**:
> Issue state has **not** been progressed as noted in discussion before grouping motion (cf. section [[5.1.4][GM4]])


###5.1.5 Applied changes with more significant impact on the documents

####5.1.5.1 [ODATA-205](https://tools.oasis-open.org/issues/browse/ODATA-205)

ODATA-205
: "Merge TypeAnnotation and ValueAnnotation into Annotation" [component: CSDL] is **Applied**.

Mike: 
>I **move** we close issue ODATA-205 as applied. **Ralf seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-205
: "Merge TypeAnnotation and ValueAnnotation into Annotation" [component: CSDL] is **Closed** with no objections.


####5.1.5.2 [ODATA-25](https://tools.oasis-open.org/issues/browse/ODATA-25)

ODATA-25
: "Support Obtaining Changes (Deltas) from a result." [component: Protocol] is **Applied**.

Discussion:

* Ralf notes, that there is a copy and paste error in the JSON document, that should be automatically repaired in the next revision, since it already has been applied to the editors working revision.
* Stefan suggests to close the issue, to not hamper the acting editors with pending issues of that weight.

Ralf: 
>I **move** to close ODATA-25 as applied. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-25
: "Support Obtaining Changes (Deltas) from a result." [component: Protocol] is **Closed** with no objections.

####5.1.5.3 [ODATA-199](https://tools.oasis-open.org/issues/browse/ODATA-199)

ODATA-199
: "$expand should be allowed to return only ids for already seen objects" [components: JSON Format, ATOM Format] is **Applied**.

Ralf: 
>I **move** to close ODATA-199 as applied. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-199
: "$expand should be allowed to return only ids for already seen objects" [components: JSON Format, ATOM Format] is **Closed** with no objections.

####5.1.5.4 [ODATA-16](https://tools.oasis-open.org/issues/browse/ODATA-16)

ODATA-16
: "Define an Edm.AnyType to allow functions to apply to entity sets of any entity type" [component: CSDL] is **Applied**.

Ralf: 
>I **move** to close ODATA-16 as applied. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-16
: "Define an Edm.AnyType to allow functions to apply to entity sets of any entity type" [component: CSDL] is **Closed** with no objections.

####5.1.5.5 [ODATA-119](https://tools.oasis-open.org/issues/browse/ODATA-119)

ODATA-119
: "Allow definition of 'simple' types that fix values for facet attributes of primitive types" [component: CSDL] is **Applied**.

Ralf: 
>I **move** to close ODATA-119 as applied. **Mike seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-119
: "Allow definition of 'simple' types that fix values for facet attributes of primitive types" [component: CSDL] is **Closed** with no objections.



###5.2 Issues in Proposed state (carried over from Feb 7, 2013 TC meeting)

####5.2.1 OData CSDL

####5.2.1.1 [ODATA-202](https://tools.oasis-open.org/issues/browse/ODATA-202)

ODATA-202
: "Custom Mapping to Atom Elements not defined" [component: ATOM Format] is **New**.

Mike: 
>I **move** we resolve ODATA-202 by removing the dangling reference to Custom mapping to ATOM, as proposed. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-202
: "Custom Mapping to Atom Elements not defined" [component: ATOM Format] is **Resolved as noted in the motion** with no objections.


####5.2.2 OData Atom, OData JSON

####5.2.2.1 [ODATA-212](https://tools.oasis-open.org/issues/browse/ODATA-212)

ODATA-212
: "Define request body format for Actions in Atom and JSON format specifications" [components: JSON Format, ATOM Format, Protocol] is **New**.

Ralf: 
>I **move** to resolve ODATA-212 as proposed. **Martin seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-212
: "Define request body format for Actions in Atom and JSON format specifications" [components: JSON Format, ATOM Format, Protocol] is **Resolved** with no objections.

####5.2.2.2 [ODATA-221](https://tools.oasis-open.org/issues/browse/ODATA-221)

ODATA-221
: "Flatten the message element in the JSON Error Represention (Section 4.18 Representing Errors in a Response)" [component: JSON Format] is **New**.

Discussion:

* Mike suggests to also remove any special references to xml:lang inside the ATOM spec.

Stefan: 
>I **move** to accept ODATA-221 as proposed including removal of any special references to xml:lang inside the OData ATOM work product. **Martin seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-221
: "Flatten the message element in the JSON Error Represention (Section 4.18 Representing Errors in a Response)" [component: JSON Format] is **Resolved as noted in the motion** with no objections.
 
######5.2.2.2.1 End of Issue Processing [eoip]

Note:
>Time slot for issue processing gone. Skip all remaining agenda sub items of 5.

 
##6 Next Face to Face Meeting

###6.1 Determine location and venue based on poll results

####6.1.1 Geographic location preference

Context:
> Ballot "[Choose a geographic location for the 4th TC F2F meeting](https://www.oasis-open.org/committees/ballot.php?id=2357)".

Discussion:

* Slight preference for Europe.

####6.1.2 Date preferences

Context:
> Ballot "[Select dates for the 4th F2F meeting](https://www.oasis-open.org/committees/ballot.php?id=2356)".

Discussion:

* For Mike and Hubert the week of the 22nd would be better for them if venue is located in Europe.
* Ralf may only participate in person during week of April 22nd if it is hosted in Walldorf, Germany.
* Ram asks, if SAP may host the event, so that Ralf may also attend in person and to maximize the attendance potential.
* Ralf will check with Barbara before meeting#26 next week.

##7 Next Meeting

###7.1 Next weekly TC meeting will be 2013-02-21 during 8-9am PT.

Agreed.

###7.2 Meeting duration

Shall the TC meetings be extended by another half hour (to facilitate making progress on issues)?

Discussion:

* Hubert will be fine with that, but will not be present next week.
* Stefan suggests to extend, but the meetings will need **as good a preparation as todays meeting received**, so we do not run out of issues or order.
* Hubert and Mike both prefer starting at 0800 PT and meeting longer (instead of starting earlier).
* Ram thus concludes, that the TC will experiment the next weeks with extension of calls by one hour, so that inlcuding the next meeting #26 on 2013-02-21 it will last from 0800 until 1000 PT.
* All agree.

##8 AOB

None. 
 
### Meeting adjourned on 0900 PT

# Appendices

## List of Open Action Items Before the Meeting [AI_REF]

**Retrieval time stamp**: `2013-02-14 14:09 +01:00`.

AI#0018
: "Prepare Working Draft 01 (WD01) version of OData Extension for Temporal Data" [owner: Andrew Eisenberg] is **Ongoing**

AI#0019
: "Prepare Working Draft 01 (WD01) version of OData Extension for XML Data" [owner: Andrew Eisenberg] is **Ongoing**

AI#0020
: "Prepare Working Draft 01 (WD01) version of OData Extension for JSON Data" [owner: Susan Malaika] is **Ongoing**

AI#0028
: "Introduce fix target versions 4.0, minor and next major into JIRA" [owner: Ram Jeyaraman] is **Ongoing** (Note: Due 2013-02-14)


**Note**: The actual action item processing is documented in section [4][AIH] and subsections thereof.

## Index of Issues Processed During the Meeting [IP_REF]

**Note**: The actual issue processing is documented in sections [5][IPH]. The below index has two main parts: First come the public comments (if any), second the JIRA issues. Each list of issues is sorted by ascending issue number. Noted are the ID, the summary and the reference to the relevant subsection where the issue progression has been documented:

Public Comments:

None.

JIRA Issues:

* [ODATA-11](https://tools.oasis-open.org/issues/browse/ODATA-11) "date/time values without explicit time zones need further investigation" [5.1.1.4][odata-11]
* [ODATA-12](https://tools.oasis-open.org/issues/browse/ODATA-12) "create a data type for property names" [5.1.3.4][odata-12]
* [ODATA-13](https://tools.oasis-open.org/issues/browse/ODATA-13) "A function that returns the current date and time is needed" [5.1.1.3][odata-13]
* [ODATA-14](https://tools.oasis-open.org/issues/browse/ODATA-14) "add Edm.Date to the OData primitive data types" [5.1.1.2][odata-14]
* [ODATA-16](https://tools.oasis-open.org/issues/browse/ODATA-16) "Define an Edm.AnyType to allow functions to apply to entity sets of any entity type" [5.1.5.4][odata-16]
* [ODATA-24](https://tools.oasis-open.org/issues/browse/ODATA-24) "Simplify how Relationships are expressed in CSDL" [5.1.1.10][odata-24]
* [ODATA-25](https://tools.oasis-open.org/issues/browse/ODATA-25) "Support Obtaining Changes (Deltas) from a result." [5.1.5.2][odata-25]
* [ODATA-32](https://tools.oasis-open.org/issues/browse/ODATA-32) "Allow filtering of expanded to-many navigation properties" [5.1.1.7][odata-32]
* [ODATA-38](https://tools.oasis-open.org/issues/browse/ODATA-38) "Recursive $expand and $select" [5.1.1.6][odata-38]
* [ODATA-41](https://tools.oasis-open.org/issues/browse/ODATA-41) "Specify which URL formats are acceptable within $batch, and which to prefer" [5.1.4.11][odata-41]
* [ODATA-73](https://tools.oasis-open.org/issues/browse/ODATA-73) "Retrieve the count of related entities together with the base entity" [5.1.1.5][odata-73]
* [ODATA-107](https://tools.oasis-open.org/issues/browse/ODATA-107) "Should OData support a 'clock time' (xs:time) datatype?" [5.1.1.1][odata-107]
* [ODATA-108](https://tools.oasis-open.org/issues/browse/ODATA-108) "Define rules for the target of an annotation that supports implicit casting of relationships" [5.1.3.3][odata-108]
* [ODATA-109](https://tools.oasis-open.org/issues/browse/ODATA-109) "Define rules for specifying annotations within annotations" [5.1.3.2][odata-109]
* [ODATA-110](https://tools.oasis-open.org/issues/browse/ODATA-110) "Track Prefer Header in Http" [5.1.4.10][odata-110]
* [ODATA-114](https://tools.oasis-open.org/issues/browse/ODATA-114) "Allow /$count path suffix also for collection properties" [5.1.1.9][odata-114]
* [ODATA-119](https://tools.oasis-open.org/issues/browse/ODATA-119) "New / alternative XML namespaces with OASIS naming convention" [5.1.5.5][odata-119]
* [ODATA-132](https://tools.oasis-open.org/issues/browse/ODATA-132) "Support /$count in $filter and $orderby" [5.1.1.8][odata-132]
* [ODATA-158](https://tools.oasis-open.org/issues/browse/ODATA-158) "OData ATOM format should require element" [5.1.4.2][odata-158]
* [ODATA-169](https://tools.oasis-open.org/issues/browse/ODATA-169) "Representation of named entities in the service document" [5.1.4.1][odata-169]
* [ODATA-180](https://tools.oasis-open.org/issues/browse/ODATA-180) "Remove Extends attribute from EntityContainer element" [5.1.2.4][odata-180]
* [ODATA-181](https://tools.oasis-open.org/issues/browse/ODATA-181) "Referencing/reusing a model element from a different schema does not require to 'include' this schema via a Using element" [5.1.2.3][odata-181]
* [ODATA-182](https://tools.oasis-open.org/issues/browse/ODATA-182) "Define the term 'model'" [5.1.2.2][odata-182]
* [ODATA-187](https://tools.oasis-open.org/issues/browse/ODATA-187) "Need to remove references to associations and associationsets from protocol doc" [5.1.4.9][odata-187]
* [ODATA-193](https://tools.oasis-open.org/issues/browse/ODATA-193) "Allow function imports to return entities from a different service" [5.1.2.1][odata-193]
* [ODATA-197](https://tools.oasis-open.org/issues/browse/ODATA-197) "Define standard functions for edm:Apply element" [5.1.4.7][odata-197]
* [ODATA-199](https://tools.oasis-open.org/issues/browse/ODATA-199) "$expand should be allowed to return only ids for already seen objects" [5.1.5.3][odata-199]
* [ODATA-202](https://tools.oasis-open.org/issues/browse/ODATA-202) "Custom Mapping to Atom Elements not defined" [5.2.1.1][odata-202]
* [ODATA-205](https://tools.oasis-open.org/issues/browse/ODATA-205) "Merge TypeAnnotation and ValueAnnotation into Annotation" [5.1.5.1][odata-205]
* [ODATA-212](https://tools.oasis-open.org/issues/browse/ODATA-212) "Define request body format for Actions in Atom and JSON format specifications" [5.2.2.1][odata-212]
* [ODATA-213](https://tools.oasis-open.org/issues/browse/ODATA-213) "Allow all dynamic expressions of the appropriate type within edm:Collection expressions" [5.1.4.6][odata-213]
* [ODATA-216](https://tools.oasis-open.org/issues/browse/ODATA-216) "Allow edm:Documentation element in edm:TypeDefinition and edm:Annotations element" [5.1.4.5][odata-216]
* [ODATA-217](https://tools.oasis-open.org/issues/browse/ODATA-217) "property facets in ValueTerm element" [5.1.3.8][odata-217]
* [ODATA-218](https://tools.oasis-open.org/issues/browse/ODATA-218) "Remove doubled last paragraph in section 8.5.2 The Preference-Applied Header" [5.1.4.8][odata-218]
* [ODATA-221](https://tools.oasis-open.org/issues/browse/ODATA-221) "Flatten the message element in the JSON Error Represention (Section 4.18 Representing Errors in a Response)" [5.2.2.2][odata-221]
* [ODATA-225](https://tools.oasis-open.org/issues/browse/ODATA-225) "Define Functions in Schema; reference in Container using FunctionImport." [5.1.4.12][odata-225]
* [ODATA-226](https://tools.oasis-open.org/issues/browse/ODATA-226) "Clarify that the root of the Path attribute of a element is rooted at the containing entity" [5.1.3.1][odata-226]
* [ODATA-227](https://tools.oasis-open.org/issues/browse/ODATA-227) "Support of symbolic names in annotations" [5.1.3.7][odata-227]
* [ODATA-229](https://tools.oasis-open.org/issues/browse/ODATA-229) "Allow annotations to target all model elements" [5.1.3.6][odata-229]
* [ODATA-231](https://tools.oasis-open.org/issues/browse/ODATA-231) "Define how to specify enumeration values in annotations" [5.1.3.5][odata-231]
* [ODATA-235](https://tools.oasis-open.org/issues/browse/ODATA-235) "Limit primitive types allowed as key parts to the 'sufficiently discrete' types" [5.1.4.4][odata-235]
* [ODATA-238](https://tools.oasis-open.org/issues/browse/ODATA-238) "Restrict values of the Qualifier attribute to QualifiedName values" [5.1.4.3][odata-238]
* [ODATA-241](https://tools.oasis-open.org/issues/browse/ODATA-241) "Consistently require annotations to be placed at the end of the annotated CSDL element" [5.1.3.9][odata-241]

## Timeline Reference [TL_REF]
  
**Note**: Please cf. the current revision of the [TC timeline](https://www.oasis-open.org/committees/download.php/48148/TC%20Timeline%203.htm).
