#OData meeting #34, Thursday, 25 Apr 2013, 0900 - 1800 CEST and Friday, 26 Apr 2013, 0900 - 1600 CEST

**Note**: For explanations of conventions and other formal aspects common to OData TC meeting minutes which are used in this document please cf. "[Formal Aspects of Meeting Minutes](https://www.oasis-open.org/committees/download.php/48109/formal-aspects-meeting-minutes-v1.html)".

Meeting chaired by Barbara Hartel and Ram Jeyaraman

Acting Chair: Barbara Hartel

# Day One

## 1 Roll call

### 1.1 Members Present:

        Anila Kumar GVN (CA Technologies)
        Barbara Hartel (SAP AG)
        Dale Moberg (Axway Software)
        Diane Downie (Citrix Systems)
        Gerald Krause (SAP AG)
        Hubert Heijkers (IBM)
        Jeffrey Turpin (Axway Software)
        Jens H¸sken (SAP AG)
        John Willson (Individual)
        Martin Zurmuehl (SAP AG)
        Matthew Borges (SAP AG) a.k.a. Matt
        Michael Pizzo (Microsoft) a.k.a. Mike
        Peter Brown (Individual)
        Ralf Handl (SAP AG)
        Ram Jeyaraman (Microsoft)
        Stefan Drees (Individual)
        Susan Malaika (IBM)
        Ted Jones (Red Hat)

Quorum achieved. Details cf. [normative attendance sheet for this meeting](https://www.oasis-open.org/apps/org/workgroup/odata/event.php?event_id=35050).

## 2 Approval of Agenda [agenda_one]

Agenda approved as published.

## 3 Approval of Minutes from Previous Meeting(s)

### 3.1 Approval of [Minutes of 2013-04-18 Meeting#33](https://www.oasis-open.org/committees/download.php/48871/odata-meeting-33_on-20130418-minutes.html)

**Meeting minutes approved with no objections**.

## 4 Review of [Issues List](https://tools.oasis-open.org/issues/secure/IssueNavigator.jspa?reset=true&mode=hide&pid=10103&sorter/field=issuekey&sorter/order=ASC) (IL) and Progress [IPH]

**Notes**:

* Issues in this section (4) may have been progressed out of sequence, but have been noted here to better group by components impacted as a service for the reader.
* There is an "[Index of Issues Processed During the Meeting][IP_REF]" section in the appendix.

### 4.1 Baseline

#### 4.1.1 [ODATA-356](https://tools.oasis-open.org/issues/browse/ODATA-356)

ODATA-356:
: "Review the changes in the latest version of Working Drafts" [components: OData Batch Processing Format, OData ATOM Format, OData JSON Format, OData CSDL, OData URL Conventions, OData Protocol, Vocabularies] is **New**.


Ram:
>I **move** to resolve ODATA-356 as proposed (and accept the latest Working Drafts as the baseline). **John seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-356:
: "Review the changes in the latest version of Working Drafts" [components: OData Batch Processing Format, OData ATOM Format, OData JSON Format, OData CSDL, OData URL Conventions, OData Protocol, Vocabularies] is **Resolved** with no objections.


### 4.2 $ref Issues

#### 4.2.1 [ODATA-345](https://tools.oasis-open.org/issues/browse/ODATA-345)

ODATA-345:
: "Specify which nested query options can be used when expanding only references, and adapt syntax" [components: OData Protocol, OData ABNF Construction Rules, OData URL Conventions] is **New**.

Hubert:
>I **move** to resolve ODATA-345 as proposed. **Ralf seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-345:
: "Specify which nested query options can be used when expanding only references, and adapt syntax" [components: OData Protocol, OData ABNF Construction Rules, OData URL Conventions] is **Resolved** with no objections.


#### 4.2.2 [ODATA-340](https://tools.oasis-open.org/issues/browse/ODATA-340)

ODATA-340:
: "How to retrieve both the entity references as well as the count of a collection referenced by a navigation property?" [component: OData Protocol] is **New**.

Hubert:
>I **move** to resolve ODATA-340 with no further action as it is being resolved with resolving ODATA-345. **Mike seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-340:
: "How to retrieve both the entity references as well as the count of a collection referenced by a navigation property?" [component: OData Protocol] is **Resolved** with no objections.


#### 4.2.3 [ODATA-338](https://tools.oasis-open.org/issues/browse/ODATA-338)

ODATA-338:
: "Representation of entity references in odata.metadata annotation" [components: OData JSON Format, OData ATOM Format] is **New**.

Hubert:
>I **move** to resolve ODATA-338 as proposed. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-338:
: "Representation of entity references in odata.metadata annotation" [components: OData JSON Format, OData ATOM Format] is **Resolved** with no objections.

### 4.3 $count/$inlinecount Issues

#### 4.3.1 [ODATA-339](https://tools.oasis-open.org/issues/browse/ODATA-339)

ODATA-339:
: "$inlinecount and $count, do we need both? Could we use $count in select clause as well?" [components: OData Protocol, OData ABNF Construction Rules] is **New**.

Hubert:
>I **move** to resolve ODATA-339 as proposed. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-339:
: "$inlinecount and $count, do we need both? Could we use $count in select clause as well?" [components: OData Protocol, OData ABNF Construction Rules] is **Resolved** with no objections.

#### 4.3.2 [ODATA-323](https://tools.oasis-open.org/issues/browse/ODATA-323)

ODATA-323:
: "InlineCount should just be boolean" [components: OData Protocol, OData ABNF Construction Rules] is **New**.

Hubert:
>I **move** to resolve ODATA-323 as proposed. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-339:
: "$inlinecount and $count, do we need both? Could we use $count in select clause as well?" [components: OData Protocol, OData ABNF Construction Rules] is **Resolved** with no objections.

### 4.4 JSON Formatting Issues:

#### 4.4.1 [ODATA-357](https://tools.oasis-open.org/issues/browse/ODATA-357)

ODATA-357:
: "Use GeoJSON to format geo types in JSON" [component: OData JSON Format] is **New**.

John:
>I **move** ODATA-357 as proposed. **Mike seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-357:
: "Use GeoJSON to format geo types in JSON" [component: OData JSON Format] is **Resolved** with no objections.

#### 4.4.2 [ODATA-342](https://tools.oasis-open.org/issues/browse/ODATA-342)

ODATA-342:
: "Can we relax the requirement of int64 numbers being represented as strings in the JSON Format for integer numbers that don't lose precision in ECMAScript when represented as numbers?" [component: OData JSON Format] is **New**.

ODATA-342:
: "Can we relax the requirement of int64 numbers being represented as strings in the JSON Format for integer numbers that don't lose precision in ECMAScript when represented as numbers?" [component: OData JSON Format] is **Open** with no objections.

Note:
> Processing continued on second day.

Ralf: 
>I **move** to resolve ODATA-342 as proposed. **Hubert seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-342:
: "Can we relax the requirement of int64 numbers being represented as strings in the JSON Format for integer numbers that don't lose precision in ECMAScript when represented as numbers?" [component: OData JSON Format] is **Resolved** with no objections.

#### 4.4.3 [ODATA-341](https://tools.oasis-open.org/issues/browse/ODATA-341)

ODATA-341:
: "Can we get rid of the optional trailing 'L'/'l' for int64 numbers" [component: OData ABNF Construction Rules] is **New**.

Stefan:
>I **move** to resolve ODATA-341 as proposed. **Mike seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-341:
: "Can we get rid of the optional trailing 'L'/'l' for int64 numbers" [component: OData ABNF Construction Rules] is **Resolved** with no objections.

#### 4.4.4 [ODATA-286](https://tools.oasis-open.org/issues/browse/ODATA-286)

ODATA-286:
: "Need clarity about JSON encoding of Single and Double (and the applicability or not of ABNF rules) particularly for NaN, INF and -INF" [component: OData JSON Format] is **New**.

Hubert:
>I **move** to resolve ODATA-286 as proposed. **Mike seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-286:
: "Need clarity about JSON encoding of Single and Double (and the applicability or not of ABNF rules) particularly for NaN, INF and -INF" [component: OData JSON Format] is **Resolved** with no objections.

### 4.5 Misc. Issues

#### 4.5.1 [ODATA-359](https://tools.oasis-open.org/issues/browse/ODATA-359)

ODATA-359:
: "Allow yes, true and no, false as boolean values, remove 1 and 0 as boolean values, make values case-insensitive" [component: Unknown] is **New**.

Discussion:

* All agree to not allow yes nor no as values for boolean types.

Ralf:
>I **move** to resolve ODATA-359 as proposed. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-359:
: "Allow only true and false as boolean values, remove values 1 and 0, make values case-sensitive, all-lowercase" [component: Unknown] is **Resolved** with no objections.

#### 4.5.2 [ODATA-354](https://tools.oasis-open.org/issues/browse/ODATA-354)

ODATA-354:
: "Make Edm. prefix required when referring to built-in types" [component: OData CSDL] is **New**.

Mike:
>I **move** we accept ODATA-354 as updated. **Hubert seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-354:
: "Require Edm. in URL and CSDL, prohibit in Atom and JSON" [component: OData CSDL] is **Resolved** with no objections.

#### 4.5.3 [ODATA-330](https://tools.oasis-open.org/issues/browse/ODATA-330)

ODATA-330:
: "Define whether null values come first or last with $orderby asc" [component: OData Protocol] is **New**.

Ralf:
>I **move** to resolve ODATA-330 as proposed. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-330:
: "Define whether null values come first or last with $orderby asc" [component: OData Protocol] is **Resolved** with no objections.

#### 4.5.4 [ODATA-326](https://tools.oasis-open.org/issues/browse/ODATA-326)

ODATA-326:
: "include-annotations should allow inclusion (or exclusion) of specific terms" [component: OData Protocol] is **Open**.

Mike:
>I **move** we accept ODATA-326 as proposed. **Ralf seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-326:
: "include-annotations should allow inclusion (or exclusion) of specific terms" [component: OData Protocol] is **Resolved** with no objections.

#### 4.5.5 [ODATA-336](https://tools.oasis-open.org/issues/browse/ODATA-336)

ODATA-336:
: "Be more generous on accepting values for the $format query option" [components: OData ATOM Format, OData ABNF Construction Rules, OData JSON Format] is **Open**.

Ralf:
>I **move** to resolve ODATA-336 as proposed. **Martin seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-336:
: "Be more generous on accepting values for the $format query option" [components: OData ATOM Format, OData ABNF Construction Rules, OData JSON Format] is **Resolved** with no objections.

#### 4.5.6 [ODATA-239](https://tools.oasis-open.org/issues/browse/ODATA-239)

ODATA-239:
: "Allowing expressions to be passed as parameters to (super) functions" [component: OData CSDL] is **Open**.

Hubert:
>I **move** to resolve ODATA-239 as proposed. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-239:
: "Allowing expressions to be passed as parameters to (super) functions" [component: OData CSDL] is **Resolved** with no objections.

### 4.6 Delta issues:

#### 4.6.1 [ODATA-298](https://tools.oasis-open.org/issues/browse/ODATA-298)

ODATA-298:
: "Clarify Requesting Changes to entity sets that include Stream properties" [component: OData Protocol] is **Open**.

Mike:
>I **move** we accept ODATA-298 as proposed. **Hubert seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-298:
: "Clarify Requesting Changes to entity sets that include Stream properties" [component: OData Protocol] is **Resolved** with no objections.

### 4.7 Async Issues:

#### 4.7.1 [ODATA-289](https://tools.oasis-open.org/issues/browse/ODATA-289)

ODATA-289:
: "Async invocation of Create, Update, Delete and Service Operations" [component: OData URL Conventions] is **New**.

Discussion:

* All discuss the current state and suggest to have the final discussion after lunch
* Martin walks us through the current proposal for async invocatio embedded in the latest revision of the protocol workproduct
* Feedback received will be embedded offline so it may be included in the first public review draft revision

**No further discussion**.

ODATA-289:
: "Async invocation of Create, Update, Delete and Service Operations" [component: OData URL Conventions] is **Open** with no objections.

Note:
> Processing continued on second day.

Discussion:

* Needs more discussion offline.

**No further discussion**.

ODATA-289:
: "Async invocation of Create, Update, Delete and Service Operations" [component: OData URL Conventions] is **Open** with no objections.

#### 4.7.2 [ODATA-360](https://tools.oasis-open.org/issues/browse/ODATA-360)

ODATA-360:
: "Remove edm:documentation element from [CSDL]" [component: OData CSDL] is **New**.

Ralf:
>I **move** to resolve ODATA-360 as proposed. **Martin seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-360:
: "Remove edm:documentation element from [CSDL]" [component: OData CSDL] is **Resolved** with no objections.

#### 4.7.3 [ODATA-361](https://tools.oasis-open.org/issues/browse/ODATA-361)

ODATA-361:
: "Remove requirement that annotations come after all defined properties in CSDL" [component: OData CSDL] is **New**.

Martin:
>I **move** to resolve ODATA-361 as proposed. **Ralf seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-361:
: "Remove requirement that annotations come after all defined properties in CSDL" [component: OData CSDL] is **Resolved** with no objections.

### 4.8 Conformance

#### 4.8.1 [ODATA-248](https://tools.oasis-open.org/issues/browse/ODATA-248)

ODATA-248:
: "Define required/optional format(s) for OData" [component: OData Protocol] is **Open**.

Hubert:
>I **move** to resolve ODATA-248 as proposed. **Mike seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-248:
: "Define required/optional format(s) for OData" [component: OData Protocol] is **Resolved** with no objections.

Note:
> Closed as approved in ODATA-362

ODATA-248:
: "Define required/optional format(s) for OData" [component: OData Protocol] is **Closed** with no objections.

#### 4.8.2 [ODATA-223](https://tools.oasis-open.org/issues/browse/ODATA-223)

ODATA-223:
: "Specify Service behavior for not implemented functionality" [components: OData Batch Processing Format, OData ATOM Format, OData Extension for Data Aggregation, OData CSDL, OData Extension for Temporal Data, OData Extension for JSON Data, OData JSON Format, OData Extension for XML Data, OData URL Conventions, OData Protocol] is **Open**.

Hubert:
>I **move** to resolve ODATA-223 as proposed. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-223:
: "Specify Service behavior for not implemented functionality" [components: OData Batch Processing Format, OData ATOM Format, OData Extension for Data Aggregation, OData CSDL, OData Extension for Temporal Data, OData Extension for JSON Data, OData JSON Format, OData Extension for XML Data, OData URL Conventions, OData Protocol] is **Resolved** with no objections.

#### 4.8.3 [ODATA-334](https://tools.oasis-open.org/issues/browse/ODATA-334)

ODATA-334:
: "Integrate conformance concept with careful consideration of versioning semantics (into protocol work product)" [component: OData Protocol] is **Open**.

Discussion:

* To introduce the issue, Mike walks over the conformance sections in the latest revisions of the work products.
* Note: we are proposing that services MUST support either JSON or ATOM at the lowest two levels of conformance, and MUST support JSON (may additionally support Atom) at the most advanced level as per OData-248.
* We are additionally saying that clients must support JSON in order to be considered an interoperable client.

Stefan:
>I **move** to resolve ODATA-334 as proposed. **Hubert seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-334:
: "Integrate conformance concept with careful consideration of versioning semantics (into protocol work product)" [component: OData Protocol] is **Resolved** with no objections.

### 4.9 Issues Requiring more Discussion [complex_one]

#### 4.9.1 [ODATA-355](https://tools.oasis-open.org/issues/browse/ODATA-355)

ODATA-355:
: "Define how property paths are represented in key part of URL" [component: OData URL Conventions] is **New**.

Discussion:
* Result is a modified proposal suggesting to omit key property names and require key values to appear in the order of the key definition.

**No further discussion**.

ODATA-355:
: "Define how property paths are represented in key part of URL" [component: OData URL Conventions] is **Open** with no objections.

Note:
> Processing continued on second day.

Discussion:

* Updated proposal in JIRA: Add an 'alias' attribute to the &lt;edmropertyref&gt; element within a &lt;edm:key&gt;. name must be unique across properties/nav props. if defined, you must use the alias in a key lookup and  you are only allowed to use the alias in a key lookup. Name of alias is 'Alias' (upper case A) and MUST be a simple identifier'

Hubert: 
>I **move** to resolve ODATA-355 as per the updated proposal described above. **Ralf seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-355:
: "Define how property paths are represented in key part of URL" [component: OData URL Conventions] is **Resolved as noted in the motion** with no objections.

#### 4.9.2 [ODATA-358](https://tools.oasis-open.org/issues/browse/ODATA-358)

ODATA-358:
: "Second parameter of the canonical search function should not allow search expressions" [component: OData URL Conventions] is **New**.

Mike:
>I **move** we accept ODATA-358 to remove the search canonical function. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-358:
: "Second parameter of the canonical search function should not allow search expressions" [component: OData URL Conventions] is **Resolved as noted in the motion and in the updated issue** with no objections.

#### 4.9.3 [ODATA-102](https://tools.oasis-open.org/issues/browse/ODATA-102)

ODATA-102:
: "Representing Actions/Functions Bound to Multiple Entities" [components: OData JSON Format, OData ATOM Format] is **Open**.

Discussion:

* Proposal needs offline checking, will be reconsidered tomorrow

**No further discussion**.

ODATA-102:
: "Representing Actions/Functions Bound to Multiple Entities" [components: OData JSON Format, OData ATOM Format] is **Open** with no objections.

Note:
> Processing continued on second day.

Ralf: 
>I **move** to resolve ODATA-102 as proposed and add examples to the Atom and JSON specifications. **Hubert seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-102:
: "Representing Actions/Functions Bound to Multiple Entities" [components: OData JSON Format, OData ATOM Format] is **Resolved as noted in the motion** with no objections.

######4.9.3.1 End of Issue Processing [eoip]

Note:
>Time slot for issue processing on day one gone. Skip all remaining agenda sub items of 4.

Note:
> meeting is paused and will continue tomorrow at 0900 CEST

# Day Two

## 5 Approval of Agenda [agenda_two]

Agenda approved as published.

## 6 Review of [Issues List](https://tools.oasis-open.org/issues/secure/IssueNavigator.jspa?reset=true&mode=hide&pid=10103&sorter/field=issuekey&sorter/order=ASC) (IL) and Progress [IPH_two]

**Notes**:

* Issues in this section (6) may have been progressed out of sequence, but have been noted here to better group by components impacted as a service for the reader.
* There is an "[Index of Issues Processed During the Meeting][IP_REF]" section in the appendix.

### 6.1 Issues with Application included in the Baseline

#### 6.1.1 [ODATA-362](https://tools.oasis-open.org/issues/browse/ODATA-362)

ODATA-362:
: "Accept the application of 61 of the 64 issues applied in the latest work product revisions in one grouping motion" [components: OData ATOM Format, OData ABNF Construction Rules, OData JSON Format, OData CSDL, OData URL Conventions, OData Protocol] is **New**.

Discussion:

* Proposal reads: "Let us accept the application of the 61 issues ODATA-31, ODATA-37, ODATA-42, ODATA-68, ODATA-102, ODATA-111, ODATA-124, ODATA-139, ODATA-159, ODATA-204, ODATA-222, ODATA-228, ODATA-230, ODATA-232, ODATA-234, ODATA-243, ODATA-244, ODATA-246, ODATA-248, ODATA-258, ODATA-260, ODATA-263, ODATA-264, ODATA-266, ODATA-267, ODATA-270, ODATA-271, ODATA-274, ODATA-275, ODATA-276, ODATA-277, ODATA-279, ODATA-280, ODATA-281, ODATA-283, ODATA-284, ODATA-285, ODATA-288, ODATA-292, ODATA-297, ODATA-300, ODATA-302, ODATA-303, ODATA-304, ODATA-305, ODATA-306, ODATA-307, ODATA-308, ODATA-311, ODATA-312, ODATA-313, ODATA-315, ODATA-318, ODATA-319, ODATA-320, ODATA-321, ODATA-322, ODATA-324, ODATA-325, ODATA-327, ODATA-328, ODATA-338, ODATA-348, and ODATA-350 in one grouping motion.
The minutes of the meeting where this motion takes place will as usual document each issues' state transition from applied to closed in a dedicated section per issue."

Stefan: 
>I **move** to resolve ODATA-362 as proposed and thereby accept the application of the 61 issues Let us accept the application of the 61 issues ODATA-31, ODATA-37, ODATA-42, ODATA-68, ODATA-102, ODATA-111, ODATA-124, ODATA-139, ODATA-159, ODATA-204, ODATA-222, ODATA-228, ODATA-230, ODATA-232, ODATA-244, ODATA-246, ODATA-248, ODATA-258, ODATA-260, ODATA-263, ODATA-264, ODATA-266, ODATA-267, ODATA-270, ODATA-271, ODATA-274, ODATA-275, ODATA-276, ODATA-277, ODATA-279, ODATA-280, ODATA-281, ODATA-283, ODATA-284, ODATA-285, ODATA-288, ODATA-292, ODATA-297, ODATA-300, ODATA-302, ODATA-303, ODATA-304, ODATA-305, ODATA-306, ODATA-307, ODATA-308, ODATA-312, ODATA-313, ODATA-315, ODATA-318, ODATA-319, ODATA-320, ODATA-321, ODATA-322, ODATA-324, ODATA-325, ODATA-327, ODATA-328, ODATA-338, ODATA-348, and ODATA-350 and close these all as applied.
The minutes of the meeting where this motion takes place MUST as usual document each issues' state transition from applied/open/new to closed in a dedicated section per issue. When all targeted other issues are updated in JIRA, this issue will be regarded as Applied. **Hubert seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-362:
: "Accept the application of 61 of the 64 issues applied in the latest work product revisions in one grouping motion" [components: OData ATOM Format, OData ABNF Construction Rules, OData JSON Format, OData CSDL, OData URL Conventions, OData Protocol] is **Resolved** with no objections.

Stefan: 
>I **move** to close ODATA-362 as closed. **John seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-362:
: "Accept the application of 61 of the 64 issues applied in the latest work product revisions in one grouping motion" [components: OData ATOM Format, OData ABNF Construction Rules, OData JSON Format, OData CSDL, OData URL Conventions, OData Protocol] is **Closed** with no objections.

Note:
> The Close of ODATA-102 has been cancelled based on discussions during the meeting.

### 6.2 Issues requiring more discussion [complex_two]

#### 6.2.1 [ODATA-166](https://tools.oasis-open.org/issues/browse/ODATA-166)

ODATA-166:
: "Inconsistent lifted operators for $filter" [component: OData Protocol] is **Open**.

Discussion:

* Needs more discussion.

**No further discussion**.

ODATA-166:
: "Inconsistent lifted operators for $filter" [component: OData Protocol] is **Open** with no objections.

#### 6.2.2 [ODATA-294](https://tools.oasis-open.org/issues/browse/ODATA-294)

ODATA-294:
: "Clarifications needed for Filter System Query Option: Operators and Functions" [component: OData URL Conventions] is **New**.

Discussion:

* Needs a proposal.

**No further discussion**.

ODATA-294:
: "Clarifications needed for Filter System Query Option: Operators and Functions" [component: OData URL Conventions] is **Open** with no objections.


#### 6.2.3 [ODATA-349](https://tools.oasis-open.org/issues/browse/ODATA-349)

ODATA-349:
: "CSDL for Collection types is not clear on nullability of elements" [component: OData CSDL] is **New**.

Ralf: 
>I **move** to close ODATA-349 without action (as proposed). **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-349:
: "CSDL for Collection types is not clear on nullability of elements" [component: OData CSDL] is  **Closed** with no objections.

#### 6.2.4 [ODATA-240](https://tools.oasis-open.org/issues/browse/ODATA-240)

ODATA-240:
: "Better describe, and possible extend, expected behavior of dealing with async $batch requests" [component: OData Protocol] is **New**.

Hubert: 
>I **move** to resolve ODATA-240 as proposed. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-240:
: "Better describe, and possible extend, expected behavior of dealing with async $batch requests" [component: OData Protocol] is **Resolved** with no objections.


#### 6.2.5 [ODATA-363](https://tools.oasis-open.org/issues/browse/ODATA-363)

ODATA-363:
: "specifiying selected properties in metadataurl is broken" [component: Unknown] is **New**.

Hubert: 
>I **move** to resolve ODATA-363 as proposed. **Mike seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-363:
: "specifiying selected properties in metadataurl is broken" [component: Unknown] is **Resolved** with no objections.

######6.2.5.1 End of Issue Processing [eoip_two]

Note:
>Time slot for issue processing on day two gone. Skip all remaining agenda sub items of 6.

## 7 Submission of First Public Drafts

### 7.1 OASIS Open Data Protocol (OData) version 4.0 multi-part Work Product including associated files

Hubert: 
>I **move** I move to approve the latest Working Draft of the OASIS Open Data Protocol (OData) version 4.0 multi-part Work Product including associated files, all contained in [https://www.oasis-open.org/committees/download.php/48956/ODataCoreWorkProduct2013-4-26.zip](https://www.oasis-open.org/committees/download.php/48956/ODataCoreWorkProduct2013-4-26.zip), as Committee Specification Draft 01, and start a 30-day public review. **Ralf seconds**.

**No further discussion**. **No objections**. The **motion passes**.

### 7.2 OASIS OData Atom Format version 4.0 Work Product including associated files

Martin: 
>I move to approve the latest Working Draft of the OASIS OData Atom Format version 4.0 Work Product including associated files, all contained in [https://www.oasis-open.org/committees/download.php/48958/ODataAtomWorkProduct2013-4-26.zip](https://www.oasis-open.org/committees/download.php/48958/ODataAtomWorkProduct2013-4-26.zip), as Committee Specification Draft 01, and start a 30-day public review. **Matt seconds**.

**No further discussion**. **No objections**. The **motion passes**.

### 7.3 OASIS OData JSON Format version 4.0 Work Product including associated files

Ralf: 
>I move to approve the latest Working Draft of the OASIS OData JSON Format version 4.0 Work Product including associated files, all contained in [https://www.oasis-open.org/committees/download.php/48957/ODataJSONWorkProduct2013-4-26.zip](https://www.oasis-open.org/committees/download.php/48957/ODataJSONWorkProduct2013-4-26.zip), as Committee Specification Draft 01, and start a 30-day public review. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.


## 8 Timeline Discussion

Discussion:

* Ram walks through the [Timeline][TL_REF].
* First idea for location of next face to face meeting is North America, maybe Seattle
* Tentative time slot would week of June, 17th

## 9 Next Meeting

### 9.1 Weekly Meeting on 2013-05-02 by Call during 0800-1000 PT

Agreed.

## 10 AOB

None.

Meeting adjourned on 1815 CEST

## Index of Issues Processed During the Meeting [IP_REF]

**Note**: The actual issue processing is documented in sections [4][IPH] and [6][IPH_two]. The below index has two main parts: First come the public comments (if any), second the JIRA issues. Each list of issues is sorted by ascending issue number. Noted are the ID, the summary and the reference to the relevant subsection where the issue progression has been documented:

Public Comments:

None.

JIRA Issues:

* [ODATA-102](https://tools.oasis-open.org/issues/browse/ODATA-102) "Representing Actions/Functions Bound to Multiple Entities" [4.9.3][odata-102]
* [ODATA-166](https://tools.oasis-open.org/issues/browse/ODATA-166) "Inconsistent lifted operators for $filter" [6.2.1][odata-166]
* [ODATA-223](https://tools.oasis-open.org/issues/browse/ODATA-223) "Specify Service behavior for not implemented functionality" [4.8.2][odata-223]
* [ODATA-239](https://tools.oasis-open.org/issues/browse/ODATA-239) "Allowing expressions to be passed as parameters to (super) functions" [4.5.6][odata-239]
* [ODATA-240](https://tools.oasis-open.org/issues/browse/ODATA-240) "Better describe, and possible extend, expected behavior of dealing with async $batch requests" [6.2.4][odata-240]
* [ODATA-248](https://tools.oasis-open.org/issues/browse/ODATA-248) "Define required/optional format(s) for OData" [4.8.1][odata-248]
* [ODATA-286](https://tools.oasis-open.org/issues/browse/ODATA-286) "Need clarity about JSON encoding of Single and Double (and the applicability or not of ABNF rules) particularly for NaN, INF and -INF" [4.4.4][odata-286]
* [ODATA-289](https://tools.oasis-open.org/issues/browse/ODATA-289) "Async invocation of Create, Update, Delete and Service Operations" [4.7.1][odata-289]
* [ODATA-294](https://tools.oasis-open.org/issues/browse/ODATA-294) "Clarifications needed for Filter System Query Option: Operators and Functions" [6.2.2][odata-294]
* [ODATA-298](https://tools.oasis-open.org/issues/browse/ODATA-298) "Clarify Requesting Changes to entity sets that include Stream properties" [4.6.1][odata-298]
* [ODATA-323](https://tools.oasis-open.org/issues/browse/ODATA-323) "InlineCount should just be boolean" [4.3.2][odata-323]
* [ODATA-326](https://tools.oasis-open.org/issues/browse/ODATA-326) "include-annotations should allow inclusion (or exclusion) of specific terms" [4.5.4][odata-326]
* [ODATA-330](https://tools.oasis-open.org/issues/browse/ODATA-330) "Define whether null values come first or last with $orderby asc" [4.5.3][odata-330]
* [ODATA-334](https://tools.oasis-open.org/issues/browse/ODATA-334) "Integrate conformance concept with careful consideration of versioning semantics (into protocol work product)" [4.8.3][odata-334]
* [ODATA-336](https://tools.oasis-open.org/issues/browse/ODATA-336) "Be more generous on accepting values for the $format query option" [4.5.5][odata-336]
* [ODATA-338](https://tools.oasis-open.org/issues/browse/ODATA-338) "Representation of entity references in odata.metadata annotation" [4.2.3][odata-338]
* [ODATA-339](https://tools.oasis-open.org/issues/browse/ODATA-339) "$inlinecount and $count, do we need both? Could we use $count in select clause as well?" [4.3.1][odata-339]
* [ODATA-340](https://tools.oasis-open.org/issues/browse/ODATA-340) "How to retrieve both the entity references as well as the count of a collection referenced by a navigation property?" [4.2.2][odata-340]
* [ODATA-341](https://tools.oasis-open.org/issues/browse/ODATA-341) "Can we get rid of the optional trailing 'L'/'l' for int64 numbers" [4.4.3][odata-341]
* [ODATA-342](https://tools.oasis-open.org/issues/browse/ODATA-342) "Can we relax the requirement of int64 numbers being represented as strings in the JSON Format for integer numbers that don't lose precision in ECMAScript when represented as numbers?" [4.4.2][odata-342]
* [ODATA-345](https://tools.oasis-open.org/issues/browse/ODATA-345) "Specify which nested query options can be used when expanding only references, and adapt syntax" [4.2.1][odata-345]
* [ODATA-349](https://tools.oasis-open.org/issues/browse/ODATA-349) "CSDL for Collection types is not clear on nullability of elements" [6.2.3][odata-349]
* [ODATA-354](https://tools.oasis-open.org/issues/browse/ODATA-354) "Make Edm. prefix required when referring to built-in types" [4.5.2][odata-354]
* [ODATA-355](https://tools.oasis-open.org/issues/browse/ODATA-355) "Define how property paths are represented in key part of URL" [4.9.1][odata-355]
* [ODATA-356](https://tools.oasis-open.org/issues/browse/ODATA-356) "Review the changes in the latest version of Working Drafts" [4.1.1][odata-356]
* [ODATA-357](https://tools.oasis-open.org/issues/browse/ODATA-357) "Use GeoJSON to format geo types in JSON" [4.4.1][odata-357]
* [ODATA-358](https://tools.oasis-open.org/issues/browse/ODATA-358) "Second parameter of the canonical search function should not allow search expressions" [4.9.2][odata-358]
* [ODATA-359](https://tools.oasis-open.org/issues/browse/ODATA-359) "Allow only true and false as boolean values, remove values 1 and 0, make values case-sensitive, all-lowercase" [4.5.1][odata-359]
* [ODATA-360](https://tools.oasis-open.org/issues/browse/ODATA-360) "Remove edm:documentation element from [CSDL]" [4.7.2][odata-360]
* [ODATA-361](https://tools.oasis-open.org/issues/browse/ODATA-361) "Remove requirement that annotations come after all defined properties in CSDL" [4.7.3][odata-361]
* [ODATA-362](https://tools.oasis-open.org/issues/browse/ODATA-362) "Accept the application of 61 of the 64 issues applied in the latest work product revisions in one grouping motion" [6.1.1][odata-362]
* [ODATA-363](https://tools.oasis-open.org/issues/browse/ODATA-363) "specifiying selected properties in metadataurl is broken" [6.2.5][odata-363]

## Timeline Reference [TL_REF]

**Note**: Please cf. the current revision of the [TC timeline](https://www.oasis-open.org/committees/download.php/48609/TC%20Timeline%204.htm).
