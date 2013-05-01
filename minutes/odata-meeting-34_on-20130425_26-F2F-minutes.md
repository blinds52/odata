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

**Note**:
> Issue state has been further progressed by grouping motion on second day (cf. section [[6.1.1][GM1]])

ODATA-338:
: "Representation of entity references in odata.metadata annotation" [components: OData JSON Format, OData ATOM Format] is **Closed** with no objections.

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

ODATA-323:
: "InlineCount should just be boolean" [components: OData Protocol, OData ABNF Construction Rules] is **Resolved** with no objections.

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

**Note**:
> Issue state has been further progressed by grouping motion on second day (cf. section [[6.1.1][GM1]])

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

#### 6.1.1 [ODATA-362](https://tools.oasis-open.org/issues/browse/ODATA-362) [GM1]

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

####6.1.1.1 [ODATA-31](https://tools.oasis-open.org/issues/browse/ODATA-31)

ODATA-31:
: "Section 9.1.3: Describe call choreography for 202 Accepted (Async responses)" [component: OData Protocol] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[6.1.1][GM1]])

ODATA-31:
: "Section 9.1.3: Describe call choreography for 202 Accepted (Async responses)" [component: OData Protocol] is **Closed** with no objections.

####6.1.1.2 [ODATA-37](https://tools.oasis-open.org/issues/browse/ODATA-37)

ODATA-37:
: "UPSERT: allow PUT and PATCH to the URL of a not yet existing entity to create this entity " [component: OData Protocol] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[6.1.1][GM1]])

ODATA-37:
: "UPSERT: allow PUT and PATCH to the URL of a not yet existing entity to create this entity " [component: OData Protocol] is **Closed** with no objections.

####6.1.1.3 [ODATA-42](https://tools.oasis-open.org/issues/browse/ODATA-42)

ODATA-42:
: "8.2.5 If-None-Match: clarify use of If-None-Match in data modification or action requests" [component: OData Protocol] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[6.1.1][GM1]])

ODATA-42:
: "8.2.5 If-None-Match: clarify use of If-None-Match in data modification or action requests" [component: OData Protocol] is **Closed** with no objections.

####6.1.1.4 [ODATA-68](https://tools.oasis-open.org/issues/browse/ODATA-68)

ODATA-68:
: "Describe representation of ReferenceTypes in responses" [components: OData CSDL, OData ATOM Format, OData JSON Format] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[6.1.1][GM1]])

ODATA-68:
: "Describe representation of ReferenceTypes in responses" [components: OData CSDL, OData ATOM Format, OData JSON Format] is **Closed** with no objections.

####6.1.1.5 [ODATA-111](https://tools.oasis-open.org/issues/browse/ODATA-111)

ODATA-111:
: "Define supported numeric promotions" [component: OData Protocol] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[6.1.1][GM1]])

ODATA-111:
: "Define supported numeric promotions" [component: OData Protocol] is **Closed** with no objections.

####6.1.1.6 [ODATA-124](https://tools.oasis-open.org/issues/browse/ODATA-124)

ODATA-124:
: "For round-tripping values, what precision must agents support for DateTime(Offset), and are leap seconds permitted?" [components: OData CSDL, OData ABNF Construction Rules] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[6.1.1][GM1]])

ODATA-124:
: "For round-tripping values, what precision must agents support for DateTime(Offset), and are leap seconds permitted?" [components: OData CSDL, OData ABNF Construction Rules] is **Closed** with no objections.

####6.1.1.7 [ODATA-139](https://tools.oasis-open.org/issues/browse/ODATA-139)

ODATA-139:
: "New system query option $search for free-text search within an entity set" [components: OData Protocol, OData ABNF Construction Rules, OData URL Conventions] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[6.1.1][GM1]])

ODATA-139:
: "New system query option $search for free-text search within an entity set" [components: OData Protocol, OData ABNF Construction Rules, OData URL Conventions] is **Closed** with no objections.

####6.1.1.8 [ODATA-159](https://tools.oasis-open.org/issues/browse/ODATA-159)

ODATA-159:
: "Handling inline attachments in requests/responses" [components: OData Protocol, OData ABNF Construction Rules, OData URL Conventions] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[6.1.1][GM1]])

ODATA-159:
: "Handling inline attachments in requests/responses" [components: OData Protocol, OData ABNF Construction Rules, OData URL Conventions] is **Closed** with no objections.

####6.1.1.9 [ODATA-204](https://tools.oasis-open.org/issues/browse/ODATA-204)

ODATA-204:
: "Define namespace versioning policy for XML namespaces" [components: OData Protocol, OData CSDL] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[6.1.1][GM1]])

ODATA-204:
: "Define namespace versioning policy for XML namespaces" [components: OData Protocol, OData CSDL] is **Closed** with no objections.

####6.1.1.10 [ODATA-222](https://tools.oasis-open.org/issues/browse/ODATA-222)

ODATA-222:
: "free-text search within a property" [components: OData URL Conventions, OData ABNF Construction Rules] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[6.1.1][GM1]])

ODATA-222:
: "free-text search within a property" [components: OData URL Conventions, OData ABNF Construction Rules] is **Closed** with no objections.

####6.1.1.11 [ODATA-228](https://tools.oasis-open.org/issues/browse/ODATA-228)

ODATA-228:
: "Specify $search for free-text search within a OData Service and specify $search for free-text search within an entityContainer" [components: OData Protocol, OData ABNF Construction Rules, OData URL Conventions] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[6.1.1][GM1]])

ODATA-228:
: "Specify $search for free-text search within a OData Service and specify $search for free-text search within an entityContainer" [components: OData Protocol, OData ABNF Construction Rules, OData URL Conventions] is **Closed** with no objections.

####6.1.1.12 [ODATA-230](https://tools.oasis-open.org/issues/browse/ODATA-230)

ODATA-230:
: Support use of parameter aliases in $filter and $orderby" [components: OData URL Conventions, OData ABNF Construction Rules] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[6.1.1][GM1]])

ODATA-230:
: Support use of parameter aliases in $filter and $orderby" [components: OData URL Conventions, OData ABNF Construction Rules] is **Closed** with no objections.

####6.1.1.13 [ODATA-232](https://tools.oasis-open.org/issues/browse/ODATA-232)

ODATA-232:
: "Enhance description of normalization procedures (public comment c201301e00001)" [components: OData URL Conventions, OData ABNF Construction Rules] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[6.1.1][GM1]])

ODATA-232:
: "Enhance description of normalization procedures (public comment c201301e00001)" [components: OData URL Conventions, OData ABNF Construction Rules] is **Closed** with no objections.

####6.1.1.14 [ODATA-244](https://tools.oasis-open.org/issues/browse/ODATA-244)

ODATA-244:
: "Support navigation properties on complex types" [components: OData CSDL, OData ABNF Construction Rules, OData Protocol] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[6.1.1][GM1]])

ODATA-244:
: "Support navigation properties on complex types" [components: OData CSDL, OData ABNF Construction Rules, OData Protocol] is **Closed** with no objections.

####6.1.1.15 [ODATA-246](https://tools.oasis-open.org/issues/browse/ODATA-246)

ODATA-246:
: "IDs should be dereferenceable URIs" [component: OData Protocol] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[6.1.1][GM1]])

ODATA-246:
: "IDs should be dereferenceable URIs" [component: OData Protocol] is **Closed** with no objections.

####6.1.1.16 [ODATA-258](https://tools.oasis-open.org/issues/browse/ODATA-258)

ODATA-258:
: "Advertise function imports in service document" [components: OData CSDL, OData ATOM Format, OData JSON Format] is **Open**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[6.1.1][GM1]])

ODATA-258:
: "Advertise function imports in service document" [components: OData CSDL, OData ATOM Format, OData JSON Format] is **Closed** with no objections.

####6.1.1.17 [ODATA-260](https://tools.oasis-open.org/issues/browse/ODATA-260)

ODATA-260:
: "Make explicit that DELETE on an entity may implicitly change links to and from other entities" [component: OData Protocol] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[6.1.1][GM1]])

ODATA-260:
: "Make explicit that DELETE on an entity may implicitly change links to and from other entities" [component: OData Protocol] is **Closed** with no objections.

####6.1.1.18 [ODATA-263](https://tools.oasis-open.org/issues/browse/ODATA-263)

ODATA-263:
: "Define whether $select=* returns only structural properties or also navigation properties" [components: OData Protocol, OData ABNF Construction Rules, OData URL Conventions] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[6.1.1][GM1]])

ODATA-263:
: "Define whether $select=* returns only structural properties or also navigation properties" [components: OData Protocol, OData ABNF Construction Rules, OData URL Conventions] is **Closed** with no objections.

####6.1.1.19 [ODATA-264](https://tools.oasis-open.org/issues/browse/ODATA-264)

ODATA-264:
: "Allow omitting parent key(s) in URLs to contained children" [component: OData URL Conventions] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[6.1.1][GM1]])

ODATA-264:
: "Allow omitting parent key(s) in URLs to contained children" [component: OData URL Conventions] is **Closed** with no objections.

####6.1.1.20 [ODATA-266](https://tools.oasis-open.org/issues/browse/ODATA-266)

ODATA-266:
: "Strengthen the requirements for the URL Attribute in edmx:Reference and edmx:AnnotationReference" [component: OData CSDL] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[6.1.1][GM1]])

ODATA-266:
: "Strengthen the requirements for the URL Attribute in edmx:Reference and edmx:AnnotationReference" [component: OData CSDL] is **Closed** with no objections.

####6.1.1.21 [ODATA-267](https://tools.oasis-open.org/issues/browse/ODATA-267)

ODATA-267:
: "Allow Qualifier attribute on Annotation elements within an Annotations element that does NOT specify a Qualifier attribute" [component: OData CSDL] is  **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[6.1.1][GM1]])

ODATA-267:
: "Allow Qualifier attribute on Annotation elements within an Annotations element that does NOT specify a Qualifier attribute" [component: OData CSDL] is  **Closed** with no objections.

####6.1.1.22 [ODATA-270](https://tools.oasis-open.org/issues/browse/ODATA-270)

ODATA-270:
: "Collections of Edm.PrimitiveType are problematic in JSON" [component: OData CSDL] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[6.1.1][GM1]])

ODATA-270:
: "Collections of Edm.PrimitiveType are problematic in JSON" [component: OData CSDL] is **Closed** with no objections.

####6.1.1.23 [ODATA-271](https://tools.oasis-open.org/issues/browse/ODATA-271)

ODATA-271:
: "Support IsAlwaysBindable through annotation, rather than attribute of function/action" [component: OData CSDL] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[6.1.1][GM1]])

ODATA-271:
: "Support IsAlwaysBindable through annotation, rather than attribute of function/action" [component: OData CSDL] is **Closed** with no objections.

####6.1.1.24 [ODATA-274](https://tools.oasis-open.org/issues/browse/ODATA-274)

ODATA-274:
: "OData clients should always use PATCH, deprecate PUT" [component: OData Protocol] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[6.1.1][GM1]])

ODATA-274:
: "OData clients should always use PATCH, deprecate PUT" [component: OData Protocol] is **Closed** with no objections.

####6.1.1.25 [ODATA-275](https://tools.oasis-open.org/issues/browse/ODATA-275)

ODATA-275:
: "Clarify whether binding parameters for actions and functions can be nullable" [component: OData CSDL] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[6.1.1][GM1]])

ODATA-275:
: "Clarify whether binding parameters for actions and functions can be nullable" [component: OData CSDL] is **Closed** with no objections.

####6.1.1.26 [ODATA-276](https://tools.oasis-open.org/issues/browse/ODATA-276)

ODATA-276:
: "Fix issues with entity references and rationalize with $links" [components: OData ATOM Format, OData ABNF Construction Rules, OData Protocol, OData JSON Format, OData URL Conventions] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[6.1.1][GM1]])

ODATA-276:
: "Fix issues with entity references and rationalize with $links" [components: OData ATOM Format, OData ABNF Construction Rules, OData Protocol, OData JSON Format, OData URL Conventions] is **Closed** with no objections.

####6.1.1.27 [ODATA-277](https://tools.oasis-open.org/issues/browse/ODATA-277)

ODATA-277:
: "Remove Collation attribute" [component: OData CSDL] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[6.1.1][GM1]])

ODATA-277:
: "Remove Collation attribute" [component: OData CSDL] is **Closed** with no objections.

####6.1.1.28 [ODATA-279](https://tools.oasis-open.org/issues/browse/ODATA-279)

ODATA-279:
: "Define URL conventions for addressing functions and function imports" [components: OData CSDL, OData ABNF Construction Rules, OData URL Conventions, OData Protocol] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[6.1.1][GM1]])

ODATA-279:
: "Define URL conventions for addressing functions and function imports" [components: OData CSDL, OData ABNF Construction Rules, OData URL Conventions, OData Protocol] is **Closed** with no objections.

####6.1.1.29 [ODATA-280](https://tools.oasis-open.org/issues/browse/ODATA-280)

ODATA-280:
: "Support cast segment in $expand" [components: OData Protocol, OData ABNF Construction Rules, OData URL Conventions] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[6.1.1][GM1]])

ODATA-280:
: "Support cast segment in $expand" [components: OData Protocol, OData ABNF Construction Rules, OData URL Conventions] is **Closed** with no objections.

####6.1.1.30 [ODATA-281](https://tools.oasis-open.org/issues/browse/ODATA-281)

ODATA-281:
: "Keep second() as integer, introduce FractionalSeconds" [components: OData Protocol, OData ABNF Construction Rules, OData URL Conventions] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[6.1.1][GM1]])

ODATA-281:
: "Keep second() as integer, introduce FractionalSeconds" [components: OData Protocol, OData ABNF Construction Rules, OData URL Conventions] is **Closed** with no objections.

####6.1.1.31 [ODATA-283](https://tools.oasis-open.org/issues/browse/ODATA-283)

ODATA-283:
: "Accept-Charset HTTP Request Header and charset content-type parameter" [components: OData Protocol, OData JSON Format] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[6.1.1][GM1]])

ODATA-283:
: "Accept-Charset HTTP Request Header and charset content-type parameter" [components: OData Protocol, OData JSON Format] is **Closed** with no objections.

####6.1.1.32 [ODATA-284](https://tools.oasis-open.org/issues/browse/ODATA-284)

ODATA-284:
: "Annotating an Annotation" [component: OData CSDL] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[6.1.1][GM1]])

ODATA-284:
: "Annotating an Annotation" [component: OData CSDL] is **Closed** with no objections.

####6.1.1.33 [ODATA-285](https://tools.oasis-open.org/issues/browse/ODATA-285)

ODATA-285:
: "Section 4.7: explicitly mention which property types allow appending /$value" [component: OData URL Conventions] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[6.1.1][GM1]])

ODATA-285:
: "Section 4.7: explicitly mention which property types allow appending /$value" [component: OData URL Conventions] is **Closed** with no objections.

####6.1.1.34 [ODATA-288](https://tools.oasis-open.org/issues/browse/ODATA-288)

ODATA-288:
: "Change default decimal Scale to variable" [component: OData CSDL] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[6.1.1][GM1]])

ODATA-288:
: "Change default decimal Scale to variable" [component: OData CSDL] is **Closed** with no objections.

####6.1.1.35 [ODATA-292](https://tools.oasis-open.org/issues/browse/ODATA-292)

ODATA-292:
: "Questions on POST, PATCH and merge/replace semantics with related entities in composite relationships" [component: OData Protocol] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[6.1.1][GM1]])

ODATA-292:
: "Questions on POST, PATCH and merge/replace semantics with related entities in composite relationships" [component: OData Protocol] is **Closed** with no objections.

####6.1.1.36 [ODATA-297](https://tools.oasis-open.org/issues/browse/ODATA-297)

ODATA-297:
: "State explicitly if Content-Length is required, and if so, for which request types it is required" [component: OData Protocol] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[6.1.1][GM1]])

ODATA-297:
: "State explicitly if Content-Length is required, and if so, for which request types it is required" [component: OData Protocol] is **Closed** with no objections.

####6.1.1.37 [ODATA-300](https://tools.oasis-open.org/issues/browse/ODATA-300)

ODATA-300:
: "Valid Syntax in JSON samples" [component: OData JSON Format] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[6.1.1][GM1]])

ODATA-300:
: "Valid Syntax in JSON samples" [component: OData JSON Format] is **Closed** with no objections.

####6.1.1.38 [ODATA-302](https://tools.oasis-open.org/issues/browse/ODATA-302)

ODATA-302:
: "Clarify scope uniqueness for EntityContainer name" [component: OData CSDL] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[6.1.1][GM1]])

ODATA-302:
: "Clarify scope uniqueness for EntityContainer name" [component: OData CSDL] is **Closed** with no objections.

####6.1.1.39 [ODATA-303](https://tools.oasis-open.org/issues/browse/ODATA-303)

ODATA-303:
: "Support abstract entity types without key properties" [component: OData CSDL] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[6.1.1][GM1]])

ODATA-303:
: "Support abstract entity types without key properties" [component: OData CSDL] is **Closed** with no objections.

####6.1.1.40 [ODATA-304](https://tools.oasis-open.org/issues/browse/ODATA-304)

ODATA-304:
: "Add TargetKey attribute to &lt;PropertyRef&gt; within a &lt;ReferentialConstraint&gt;" [component: OData CSDL] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[6.1.1][GM1]])

ODATA-304:
: "Add TargetKey attribute to &lt;PropertyRef&gt; within a &lt;ReferentialConstraint&gt;" [component: OData CSDL] is **Closed** with no objections.

####6.1.1.41 [ODATA-305](https://tools.oasis-open.org/issues/browse/ODATA-305)

ODATA-305:
: "Annotations: introduce path segment to address the count of a collection" [component: OData CSDL] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[6.1.1][GM1]])

ODATA-305:
: "Annotations: introduce path segment to address the count of a collection" [component: OData CSDL] is **Closed** with no objections.

####6.1.1.42 [ODATA-306](https://tools.oasis-open.org/issues/browse/ODATA-306)

ODATA-306:
: "Batch Request processing: Define server behavior, if one or more request(s) didn't succeed" [component: OData Protocol] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[6.1.1][GM1]])

ODATA-306:
: "Batch Request processing: Define server behavior, if one or more request(s) didn't succeed" [component: OData Protocol] is **Closed** with no objections.

####6.1.1.43 [ODATA-307](https://tools.oasis-open.org/issues/browse/ODATA-307)

ODATA-307:
: "Return odata.etag in collections also for odata=minimalmetadata" [component: OData JSON Format] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[6.1.1][GM1]])

ODATA-307:
: "Return odata.etag in collections also for odata=minimalmetadata" [component: OData JSON Format] is **Closed** with no objections.

####6.1.1.44 [ODATA-308](https://tools.oasis-open.org/issues/browse/ODATA-308)

ODATA-308:
: "Clarify whether format parameters odata.metadata and odata.streaming may be ignored by services" [component: OData JSON Format] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[6.1.1][GM1]])

ODATA-308:
: "Clarify whether format parameters odata.metadata and odata.streaming may be ignored by services" [component: OData JSON Format] is **Closed** with no objections.

####6.1.1.45 [ODATA-312](https://tools.oasis-open.org/issues/browse/ODATA-312)

ODATA-312:
: "ATOM and JSON formats for Service Document appear to omit information for action imports" [component: OData CSDL] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[6.1.1][GM1]])

ODATA-312:
: "ATOM and JSON formats for Service Document appear to omit information for action imports" [component: OData CSDL] is **Closed** with no objections.

####6.1.1.46 [ODATA-313](https://tools.oasis-open.org/issues/browse/ODATA-313)

ODATA-313:
: "Problem with 'Function Overload Resolution' due to null values having ambiguous type" [components: OData URL Conventions, OData Protocol] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[6.1.1][GM1]])

ODATA-313:
: "Problem with 'Function Overload Resolution' due to null values having ambiguous type" [components: OData URL Conventions, OData Protocol] is **Closed** with no objections.

####6.1.1.47 [ODATA-315](https://tools.oasis-open.org/issues/browse/ODATA-315)

ODATA-315:
: "Entities that may be queryable can be omitted from service document, but then their 'url' cannot be specified." [components: OData JSON Format, OData ATOM Format, OData URL Conventions, OData Protocol] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[6.1.1][GM1]])

ODATA-315:
: "Entities that may be queryable can be omitted from service document, but then their 'url' cannot be specified." [components: OData JSON Format, OData ATOM Format, OData URL Conventions, OData Protocol] is **Closed** with no objections.

####6.1.1.48 [ODATA-318](https://tools.oasis-open.org/issues/browse/ODATA-318)

ODATA-318:
: "Explicitly state which calendar Date and DateTimeOffset use" [component: OData CSDL] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[6.1.1][GM1]])

ODATA-318:
: "Explicitly state which calendar Date and DateTimeOffset use" [component: OData CSDL] is **Closed** with no objections.

####6.1.1.49 [ODATA-319](https://tools.oasis-open.org/issues/browse/ODATA-319)

ODATA-319:
: "Allow services to include metadata links and metadata ETags into responses" [components: OData JSON Format, OData ATOM Format] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[6.1.1][GM1]])

ODATA-319:
: "Allow services to include metadata links and metadata ETags into responses" [components: OData JSON Format, OData ATOM Format] is **Closed** with no objections.

####6.1.1.50 [ODATA-320](https://tools.oasis-open.org/issues/browse/ODATA-320)

ODATA-320:
: "Should use /@&lt;annotation-name&gt; to reference applied annotations" [component: OData CSDL] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[6.1.1][GM1]])

ODATA-320:
: "Should use /@&lt;annotation-name&gt; to reference applied annotations" [component: OData CSDL] is **Closed** with no objections.

####6.1.1.51 [ODATA-321](https://tools.oasis-open.org/issues/browse/ODATA-321)

ODATA-321:
: "Use consistent naming for headers" [component: OData Protocol] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[6.1.1][GM1]])

ODATA-321:
: "Use consistent naming for headers" [component: OData Protocol] is **Closed** with no objections.

####6.1.1.52 [ODATA-322](https://tools.oasis-open.org/issues/browse/ODATA-322)

ODATA-322:
: "Define how nested service documents are supported" [components: OData JSON Format, OData ATOM Format, OData Protocol] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[6.1.1][GM1]])

ODATA-322:
: "Define how nested service documents are supported" [components: OData JSON Format, OData ATOM Format, OData Protocol] is **Closed** with no objections.

####6.1.1.53 [ODATA-324](https://tools.oasis-open.org/issues/browse/ODATA-324)

ODATA-324:
: "Support external metadata references in payload" [components: OData JSON Format, OData ATOM Format, OData Protocol] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[6.1.1][GM1]])

ODATA-324:
: "Support external metadata references in payload" [components: OData JSON Format, OData ATOM Format, OData Protocol] is **Closed** with no objections.

####6.1.1.54 [ODATA-325](https://tools.oasis-open.org/issues/browse/ODATA-325)

ODATA-325:
: "Clarify what aliases can be used in instance annotations" [components: OData JSON Format, OData ATOM Format, OData Protocol] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[6.1.1][GM1]])

ODATA-325:
: "Clarify what aliases can be used in instance annotations" [components: OData JSON Format, OData ATOM Format, OData Protocol] is **Closed** with no objections.

####6.1.1.55 [ODATA-327](https://tools.oasis-open.org/issues/browse/ODATA-327)

ODATA-327:
: Service MUST only return async if return-async is specified" [component: OData Protocol] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[6.1.1][GM1]])

ODATA-327:
: Service MUST only return async if return-async is specified" [component: OData Protocol] is **Closed** with no objections.

####6.1.1.56 [ODATA-328](https://tools.oasis-open.org/issues/browse/ODATA-328)

ODATA-328:
: "Remove MinDataServiceVersion (OData-MinVersion)" [component: OData Protocol] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[6.1.1][GM1]])

ODATA-328:
: "Remove MinDataServiceVersion (OData-MinVersion)" [component: OData Protocol] is **Closed** with no objections.

####6.1.1.57 [ODATA-348](https://tools.oasis-open.org/issues/browse/ODATA-348)

ODATA-348:
: "Require the use of &lt;edmx:Include&gt; to pull in specific namespaces from &lt;edmx:Reference&gt;" [component: OData CSDL] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[6.1.1][GM1]])

ODATA-348:
: "Require the use of &lt;edmx:Include&gt; to pull in specific namespaces from &lt;edmx:Reference&gt;" [component: OData CSDL] is **Closed** with no objections.

####6.1.1.58 [ODATA-350](https://tools.oasis-open.org/issues/browse/ODATA-350)

ODATA-350:
: "Clearly describe the service documents role, expected usage and responsibility in comparison with $metadata" [components: OData CSDL, OData ATOM Format, OData Protocol, OData JSON Format, OData URL Conventions] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[6.1.1][GM1]])

ODATA-350:
: "Clearly describe the service documents role, expected usage and responsibility in comparison with $metadata" [components: OData CSDL, OData ATOM Format, OData Protocol, OData JSON Format, OData URL Conventions] is **Closed** with no objections.

        __FIXME__ Note: Has been reset to applied in JIRA!

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

* [ODATA-31](https://tools.oasis-open.org/issues/browse/ODATA-31) "Section 9.1.3: Describe call choreography for 202 Accepted (Async responses)" [6.1.1.1][odata-31]
* [ODATA-37](https://tools.oasis-open.org/issues/browse/ODATA-37) "UPSERT: allow PUT and PATCH to the URL of a not yet existing entity to create this entity " [6.1.1.2][odata-37]
* [ODATA-42](https://tools.oasis-open.org/issues/browse/ODATA-42) "8.2.5 If-None-Match: clarify use of If-None-Match in data modification or action requests" [6.1.1.3][odata-42]
* [ODATA-68](https://tools.oasis-open.org/issues/browse/ODATA-68) "Describe representation of ReferenceTypes in responses" [6.1.1.4][odata-68]
* [ODATA-102](https://tools.oasis-open.org/issues/browse/ODATA-102) "Representing Actions/Functions Bound to Multiple Entities" [4.9.3][odata-102]
* [ODATA-111](https://tools.oasis-open.org/issues/browse/ODATA-111) "Define supported numeric promotions" [6.1.1.5][odata-111]
* [ODATA-124](https://tools.oasis-open.org/issues/browse/ODATA-124) "For round-tripping values, what precision must agents support for DateTime(Offset), and are leap seconds permitted?" [6.1.1.6][odata-124]
* [ODATA-139](https://tools.oasis-open.org/issues/browse/ODATA-139) "New system query option $search for free-text search within an entity set" [6.1.1.7][odata-139]
* [ODATA-159](https://tools.oasis-open.org/issues/browse/ODATA-159) "Handling inline attachments in requests/responses" [6.1.1.8][odata-159]
* [ODATA-166](https://tools.oasis-open.org/issues/browse/ODATA-166) "Inconsistent lifted operators for $filter" [6.2.1][odata-166]
* [ODATA-204](https://tools.oasis-open.org/issues/browse/ODATA-204) "Define namespace versioning policy for XML namespaces" [6.1.1.9][odata-204]
* [ODATA-222](https://tools.oasis-open.org/issues/browse/ODATA-222) "free-text search within a property" [6.1.1.10][odata-222]
* [ODATA-223](https://tools.oasis-open.org/issues/browse/ODATA-223) "Specify Service behavior for not implemented functionality" [4.8.2][odata-223]
* [ODATA-228](https://tools.oasis-open.org/issues/browse/ODATA-228) "Specify $search for free-text search within a OData Service and specify $search for free-text search within an entityContainer" [6.1.1.11][odata-228]
* [ODATA-230](https://tools.oasis-open.org/issues/browse/ODATA-230) "Support use of parameter aliases in $filter and $orderby" [6.1.1.12][odata-230]
* [ODATA-232](https://tools.oasis-open.org/issues/browse/ODATA-232) "Enhance description of normalization procedures (public comment c201301e00001)" [6.1.1.13][odata-232]
* [ODATA-239](https://tools.oasis-open.org/issues/browse/ODATA-239) "Allowing expressions to be passed as parameters to (super) functions" [4.5.6][odata-239]
* [ODATA-240](https://tools.oasis-open.org/issues/browse/ODATA-240) "Better describe, and possible extend, expected behavior of dealing with async $batch requests" [6.2.4][odata-240]
* [ODATA-244](https://tools.oasis-open.org/issues/browse/ODATA-244) "Support navigation properties on complex types" [6.1.1.14][odata-244]
* [ODATA-246](https://tools.oasis-open.org/issues/browse/ODATA-246) "IDs should be dereferenceable URIs" [6.1.1.15][odata-246]
* [ODATA-248](https://tools.oasis-open.org/issues/browse/ODATA-248) "Define required/optional format(s) for OData" [4.8.1][odata-248]
* [ODATA-258](https://tools.oasis-open.org/issues/browse/ODATA-258) "Advertise function imports in service document" [6.1.1.16][odata-258]
* [ODATA-260](https://tools.oasis-open.org/issues/browse/ODATA-260) "Make explicit that DELETE on an entity may implicitly change links to and from other entities" [6.1.1.17][odata-260]
* [ODATA-263](https://tools.oasis-open.org/issues/browse/ODATA-263) "Define whether $select=* returns only structural properties or also navigation properties" [6.1.1.18][odata-263]
* [ODATA-264](https://tools.oasis-open.org/issues/browse/ODATA-264) "Allow omitting parent key(s) in URLs to contained children" [6.1.1.19][odata-264]
* [ODATA-266](https://tools.oasis-open.org/issues/browse/ODATA-266) "Strengthen the requirements for the URL Attribute in edmx:Reference and edmx:AnnotationReference" [6.1.1.20][odata-266]
* [ODATA-267](https://tools.oasis-open.org/issues/browse/ODATA-267) "Allow Qualifier attribute on Annotation elements within an Annotations element that does NOT specify a Qualifier attribute" [6.1.1.21][odata-267]
* [ODATA-270](https://tools.oasis-open.org/issues/browse/ODATA-270) "Collections of Edm.PrimitiveType are problematic in JSON" [6.1.1.22][odata-270]
* [ODATA-271](https://tools.oasis-open.org/issues/browse/ODATA-271) "Support IsAlwaysBindable through annotation, rather than attribute of function/action" [6.1.1.23][odata-271]
* [ODATA-274](https://tools.oasis-open.org/issues/browse/ODATA-274) "OData clients should always use PATCH, deprecate PUT" [6.1.1.24][odata-274]
* [ODATA-275](https://tools.oasis-open.org/issues/browse/ODATA-275) "Clarify whether binding parameters for actions and functions can be nullable" [6.1.1.25][odata-275]
* [ODATA-276](https://tools.oasis-open.org/issues/browse/ODATA-276) "Fix issues with entity references and rationalize with $links" [6.1.1.26][odata-276]
* [ODATA-277](https://tools.oasis-open.org/issues/browse/ODATA-277) "Remove Collation attribute" [6.1.1.27][odata-277]
* [ODATA-279](https://tools.oasis-open.org/issues/browse/ODATA-279) "Define URL conventions for addressing functions and function imports" [6.1.1.28][odata-279]
* [ODATA-280](https://tools.oasis-open.org/issues/browse/ODATA-280) "Support cast segment in $expand" [6.1.1.29][odata-280]
* [ODATA-281](https://tools.oasis-open.org/issues/browse/ODATA-281) "Keep second() as integer, introduce FractionalSeconds" [6.1.1.30][odata-281]
* [ODATA-283](https://tools.oasis-open.org/issues/browse/ODATA-283) "Accept-Charset HTTP Request Header and charset content-type parameter" [6.1.1.31][odata-283]
* [ODATA-284](https://tools.oasis-open.org/issues/browse/ODATA-284) "Annotating an Annotation" [6.1.1.32][odata-284]
* [ODATA-285](https://tools.oasis-open.org/issues/browse/ODATA-285) "Section 4.7: explicitly mention which property types allow appending /$value" [6.1.1.33][odata-285]
* [ODATA-286](https://tools.oasis-open.org/issues/browse/ODATA-286) "Need clarity about JSON encoding of Single and Double (and the applicability or not of ABNF rules) particularly for NaN, INF and -INF" [4.4.4][odata-286]
* [ODATA-288](https://tools.oasis-open.org/issues/browse/ODATA-288) "Change default decimal Scale to variable" [6.1.1.34][odata-288]
* [ODATA-289](https://tools.oasis-open.org/issues/browse/ODATA-289) "Async invocation of Create, Update, Delete and Service Operations" [4.7.1][odata-289]
* [ODATA-292](https://tools.oasis-open.org/issues/browse/ODATA-292) "Questions on POST, PATCH and merge/replace semantics with related entities in composite relationships" [6.1.1.35][odata-292]
* [ODATA-294](https://tools.oasis-open.org/issues/browse/ODATA-294) "Clarifications needed for Filter System Query Option: Operators and Functions" [6.2.2][odata-294]
* [ODATA-297](https://tools.oasis-open.org/issues/browse/ODATA-297) "State explicitly if Content-Length is required, and if so, for which request types it is required" [6.1.1.36][odata-297]
* [ODATA-298](https://tools.oasis-open.org/issues/browse/ODATA-298) "Clarify Requesting Changes to entity sets that include Stream properties" [4.6.1][odata-298]
* [ODATA-300](https://tools.oasis-open.org/issues/browse/ODATA-300) "Valid Syntax in JSON samples" [6.1.1.37][odata-300]
* [ODATA-302](https://tools.oasis-open.org/issues/browse/ODATA-302) "Clarify scope uniqueness for EntityContainer name" [6.1.1.38][odata-302]
* [ODATA-303](https://tools.oasis-open.org/issues/browse/ODATA-303) "Support abstract entity types without key properties" [6.1.1.39][odata-303]
* [ODATA-304](https://tools.oasis-open.org/issues/browse/ODATA-304) "Add TargetKey attribute to &lt;PropertyRef&gt; within a &lt;ReferentialConstraint&gt;" [6.1.1.40][odata-304]
* [ODATA-305](https://tools.oasis-open.org/issues/browse/ODATA-305) "Annotations: introduce path segment to address the count of a collection" [6.1.1.41][odata-305]
* [ODATA-306](https://tools.oasis-open.org/issues/browse/ODATA-306) "Batch Request processing: Define server behavior, if one or more request(s) didn't succeed" [6.1.1.42][odata-306]
* [ODATA-307](https://tools.oasis-open.org/issues/browse/ODATA-307) "Return odata.etag in collections also for odata=minimalmetadata" [6.1.1.43][odata-307]
* [ODATA-308](https://tools.oasis-open.org/issues/browse/ODATA-308) "Clarify whether format parameters odata.metadata and odata.streaming may be ignored by services" [6.1.1.44][odata-308]
* [ODATA-312](https://tools.oasis-open.org/issues/browse/ODATA-312) "ATOM and JSON formats for Service Document appear to omit information for action imports" [6.1.1.45][odata-312]
* [ODATA-313](https://tools.oasis-open.org/issues/browse/ODATA-313) "Problem with 'Function Overload Resolution' due to null values having ambiguous type" [6.1.1.46][odata-313]
* [ODATA-315](https://tools.oasis-open.org/issues/browse/ODATA-315) "Entities that may be queryable can be omitted from service document, but then their 'url' cannot be specified." [6.1.1.47][odata-315]
* [ODATA-318](https://tools.oasis-open.org/issues/browse/ODATA-318) "Explicitly state which calendar Date and DateTimeOffset use" [6.1.1.48][odata-318]
* [ODATA-319](https://tools.oasis-open.org/issues/browse/ODATA-319) "Allow services to include metadata links and metadata ETags into responses" [6.1.1.49][odata-319]
* [ODATA-320](https://tools.oasis-open.org/issues/browse/ODATA-320) "Should use /@&lt;annotation-name&gt; to reference applied annotations" [6.1.1.50][odata-320]
* [ODATA-321](https://tools.oasis-open.org/issues/browse/ODATA-321) "Use consistent naming for headers" [6.1.1.51][odata-321]
* [ODATA-322](https://tools.oasis-open.org/issues/browse/ODATA-322) "Define how nested service documents are supported" [6.1.1.52][odata-322]
* [ODATA-323](https://tools.oasis-open.org/issues/browse/ODATA-323) "InlineCount should just be boolean" [4.3.2][odata-323]
* [ODATA-324](https://tools.oasis-open.org/issues/browse/ODATA-324) "Support external metadata references in payload" [6.1.1.53][odata-324]
* [ODATA-325](https://tools.oasis-open.org/issues/browse/ODATA-325) "Clarify what aliases can be used in instance annotations" [6.1.1.54][odata-325]
* [ODATA-326](https://tools.oasis-open.org/issues/browse/ODATA-326) "include-annotations should allow inclusion (or exclusion) of specific terms" [4.5.4][odata-326]
* [ODATA-327](https://tools.oasis-open.org/issues/browse/ODATA-327) "Service MUST only return async if return-async is specified" [6.1.1.55][odata-327]
* [ODATA-328](https://tools.oasis-open.org/issues/browse/ODATA-328) "Remove MinDataServiceVersion (OData-MinVersion)" [6.1.1.56][odata-328]
* [ODATA-330](https://tools.oasis-open.org/issues/browse/ODATA-330) "Define whether null values come first or last with $orderby asc" [4.5.3][odata-330]
* [ODATA-334](https://tools.oasis-open.org/issues/browse/ODATA-334) "Integrate conformance concept with careful consideration of versioning semantics (into protocol work product)" [4.8.3][odata-334]
* [ODATA-336](https://tools.oasis-open.org/issues/browse/ODATA-336) "Be more generous on accepting values for the $format query option" [4.5.5][odata-336]
* [ODATA-338](https://tools.oasis-open.org/issues/browse/ODATA-338) "Representation of entity references in odata.metadata annotation" [4.2.3][odata-338]
* [ODATA-339](https://tools.oasis-open.org/issues/browse/ODATA-339) "$inlinecount and $count, do we need both? Could we use $count in select clause as well?" [4.3.1][odata-339]
* [ODATA-340](https://tools.oasis-open.org/issues/browse/ODATA-340) "How to retrieve both the entity references as well as the count of a collection referenced by a navigation property?" [4.2.2][odata-340]
* [ODATA-341](https://tools.oasis-open.org/issues/browse/ODATA-341) "Can we get rid of the optional trailing 'L'/'l' for int64 numbers" [4.4.3][odata-341]
* [ODATA-342](https://tools.oasis-open.org/issues/browse/ODATA-342) "Can we relax the requirement of int64 numbers being represented as strings in the JSON Format for integer numbers that don't lose precision in ECMAScript when represented as numbers?" [4.4.2][odata-342]
* [ODATA-345](https://tools.oasis-open.org/issues/browse/ODATA-345) "Specify which nested query options can be used when expanding only references, and adapt syntax" [4.2.1][odata-345]
* [ODATA-348](https://tools.oasis-open.org/issues/browse/ODATA-348) "Require the use of &lt;edmx:Include&gt; to pull in specific namespaces from &lt;edmx:Reference&gt;" [6.1.1.57][odata-348]
* [ODATA-349](https://tools.oasis-open.org/issues/browse/ODATA-349) "CSDL for Collection types is not clear on nullability of elements" [6.2.3][odata-349]
* [ODATA-350](https://tools.oasis-open.org/issues/browse/ODATA-350) "Clearly describe the service documents role, expected usage and responsibility in comparison with $metadata" [6.1.1.58][odata-350]
* [ODATA-354](https://tools.oasis-open.org/issues/browse/ODATA-354) "Make Edm. prefix required when referring to built-in types" [4.5.2][odata-354]
* [ODATA-355](https://tools.oasis-open.org/issues/browse/ODATA-355) "Define how property paths are represented in key part of URL" [4.9.1][odata-355]
* [ODATA-356](https://tools.oasis-open.org/issues/browse/ODATA-356) "Review the changes in the latest version of Working Drafts" [4.1.1][odata-356]
* [ODATA-357](https://tools.oasis-open.org/issues/browse/ODATA-357) "Use GeoJSON to format geo types in JSON" [4.4.1][odata-357]
* [ODATA-358](https://tools.oasis-open.org/issues/browse/ODATA-358) "Second parameter of the canonical search function should not allow search expressions" [4.9.2][odata-358]
* [ODATA-359](https://tools.oasis-open.org/issues/browse/ODATA-359) "Allow only true and false as boolean values, remove values 1 and 0, make values case-sensitive, all-lowercase" [4.5.1][odata-359]
* [ODATA-360](https://tools.oasis-open.org/issues/browse/ODATA-360) "Remove edm:documentation element from [CSDL]" [4.7.2][odata-360]
* [ODATA-361](https://tools.oasis-open.org/issues/browse/ODATA-361) "Remove requirement that annotations come after all defined properties in CSDL" [4.7.3][odata-361]
* [ODATA-363](https://tools.oasis-open.org/issues/browse/ODATA-363) "specifiying selected properties in metadataurl is broken" [6.2.5][odata-363]

## Timeline Reference [TL_REF]

**Note**: Please cf. the current revision of the [TC timeline](https://www.oasis-open.org/committees/download.php/48609/TC%20Timeline%204.htm).
