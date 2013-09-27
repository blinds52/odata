#OData meeting #53, Monday, 26 Sep 2013, 0800 - 0900 PT

**Note**: For explanations of conventions and other formal aspects common to OData TC meeting minutes which are used in this document please cf. "[Formal Aspects of Meeting Minutes](https://www.oasis-open.org/committees/download.php/48109/formal-aspects-meeting-minutes-v1.html)".

Meeting chaired by Ram Jeyaraman

## 1 Roll call

### 1.1 Members Present:

        Barbara Hartel (SAP AG)
        Dale Moberg (Axway Software)
        Edmond Bourne (BlackBerry)
        Gerald Krause (SAP AG)
        Hubert Heijkers (IBM)
        John Willson (Individual)
        Ken Baclawski (Northeastern University)
        Martin Zurmuehl (SAP AG)
        Matthew Borges (SAP AG) a.k.a. Matt
        Michael Pizzo (Microsoft) a.k.a. Mike
        Patrick Durusau (Individual)
        Ralf Handl (SAP AG)
        Ram Jeyaraman (Microsoft)
        Ron Dagostino (State Street Corp)
        Stan Mitranic (CA Technologies)
        Stefan Drees (Individual)
        Susan Malaika (IBM)
        Ted Jones (Red Hat)

Quorum achieved. Details cf. [normative attendance sheet for this meeting](https://www.oasis-open.org/apps/org/workgroup/odata/event.php?event_id=34216).

## 2 Approval of Agenda

Approved.

## 3 Approval of Minutes from Previous Meeting(s)

### 3.1 Approval of [Minutes of 2013-09-19 Meeting#52](https://www.oasis-open.org/committees/download.php/50763/odata-meeting-52_on-20130919-minutes.html)

**Meeting minutes approved with no objections**.

## 4 Review of [Action Items](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_items.php) (AI) and Progress [AIH]

Context:
> See the "[List of Open Action Items Before the Meeting][AI_REF]" section in the appendix.

###4.1 Action items due by 2013-09-26 (end of day)

None.

###4.2 Action items NOT due by 2013-09-26 (end of day) but MAY be ready for closure

None.

##5 Barbara's resignation as TC co-Chair

Context:
> Mail from Barbara with subject "[Resignation as OData TC Co-Chair](https://lists.oasis-open.org/archives/odata/201309/msg00200.html)"

###5.1 Our sincere thanks to Barbara for leading this TC and for getting us to where we are today!

Discussion:

* Barbara really enjoyed work in the TC and wishes all the best to the members to advance the OpenData Standard further.
* Barbara will work more in the product area, so needs to focus on new topics.
* Ram thanks Barbara for the very much appreciated assistance in acting as co-chair and wishes her the best in her new role.
* Susan wishes good Luck to Barbara in her new role - We will miss you
* All thank Barbara for the tremendous work she contributed and the always pleasant collaboration.

###5.2 Let's discuss the next steps for filling the co-Chair role and the election process.

Discussion:

* Ram explains the boundary conditions of filling the vacant position of the co-chair in the event of more than one candidate.
* Barbara suggested Ralf as successor candidate and Ralf is willing to take on the responsibility.
* Ralf confirms this.
* Ram suggests to wait until 10th of October, if other candidates will be named.
* Ram will send out an email requesting nominations.

##6 Review of [Issues List](https://tools.oasis-open.org/issues/secure/IssueNavigator.jspa?reset=true&mode=hide&pid=10103&sorter/field=issuekey&sorter/order=ASC) (IL) and Progress [IPH]

**Notes**:

* Issues in this section (6) may have been progressed out of sequence, but have been noted here to better group by components impacted or state before the meeting and as a service for the reader.
* There is an "[Index of Issues Processed During the Meeting][IP_REF]" section in the appendix.

###6.1 Issues for v4.0_CS02 in New or Open state

####6.1.1 OData ATOM Format, OData JSON Format, OData CSDL, OData URL Conventions [coatom_json_csdl_urlc]

#####6.1.1.1 [ODATA-466](https://tools.oasis-open.org/issues/browse/ODATA-466)

ODATA-466:
: "Edm.Binary should be base64-encoded (as with OData V3), not base16-encoded (as per current ABNF)" [components: OData ATOM Format, OData ABNF Construction Rules, OData JSON Format, OData CSDL] is **Open**.

Discussion:

* Ralf summarizes the issue and the preferred proposal variant
* Mike asks for whitespace allowance (also in context to v3)

Hubert:
>I **move** to resolve OData-466 as proposed. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-466:
: "Edm.Binary should be base64-encoded (as with OData V3), not base16-encoded (as per current ABNF)" [components: OData ATOM Format, OData ABNF Construction Rules, OData JSON Format, OData CSDL] is **Resolved** with no objections.

####6.1.2 OData CSDL, OData Protocol [cocsdl_prot]

#####6.1.2.1 [ODATA-491](https://tools.oasis-open.org/issues/browse/ODATA-491)

ODATA-491:
: "Language-dependency of key property values" [components: OData Protocol, OData CSDL] is **Open**.

Discussion:

* Ralf summarizes the issue and the proposal

Mike:
>I **move** we accept ODATA-491 as proposed. **Hubert seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-491:
: "Language-dependency of key property values" [components: OData Protocol, OData CSDL] is **Resolved** with no objections.

####6.1.3 OData ATOM Format, OData JSON Format, OData Protocol [coatom_json_prot]

#####6.1.3.1 [ODATA-472](https://tools.oasis-open.org/issues/browse/ODATA-472)

ODATA-472:
: "Explicitly state how dynamic properties are represented if they are not defined on an entity" [components: OData JSON Format, OData ATOM Format, OData Protocol] is **Open**.

Discussion:

* Ralf summarizes the issue and the proposal

Mike:
>I **move** we accept OData-472 as proposed. **Martin seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-472:
: "Explicitly state how dynamic properties are represented if they are not defined on an entity" [components: OData JSON Format, OData ATOM Format, OData Protocol] is **Resolved** with no objections.

#####6.1.3.2 [ODATA-519](https://tools.oasis-open.org/issues/browse/ODATA-519)

ODATA-519:
: "Define server-driven paging for collection-valued resources" [components: OData JSON Format, OData ATOM Format, OData Protocol] is **New**.

Discussion:

* Ralf summarizes the issue

Martin:
>I **move** we accept ODATA-519 as proposed. **Hubert seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-519:
: "Define server-driven paging for collection-valued resources" [components: OData JSON Format, OData ATOM Format, OData Protocol] is **Resolved** with no objections.

####6.1.4 OData URL Conventions [courlc]

#####6.1.4.1 [ODATA-476](https://tools.oasis-open.org/issues/browse/ODATA-476)

ODATA-476:
: "Clarify that type-cast segments are required for properties of derived types in system query options" [component: OData URL Conventions] is **Open**.

Discussion:

* Ralf summarizes the issue

Mike:
>I **move** we adopt ODATA-476 as proposed. **Hubert seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-476:
: "Clarify that type-cast segments are required for properties of derived types in system query options" [component: OData URL Conventions] is **Resolved** with no objections.

####6.1.5 OData ABNF Construction Rules, OData Protocol [coabnf_prot]

#####6.1.5.1 [ODATA-524](https://tools.oasis-open.org/issues/browse/ODATA-524)

ODATA-524:
: "properties in [propertyList] of context URL may be qualified with type" [components: OData Protocol, OData ABNF Construction Rules] is **New**.

Discussion:

* Ralf summarizes the issue in context

Martin:
>I **move** we accept ODATA-524 as proposed. **Hubert seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-524:
: "properties in [propertyList] of context URL may be qualified with type" [components: OData Protocol, OData ABNF Construction Rules] is **Resolved** with no objections.

#####6.1.5.2 [ODATA-521](https://tools.oasis-open.org/issues/browse/ODATA-521)

ODATA-521:
: "Remove typed null literals" [components: OData Protocol, OData ABNF Construction Rules] is **New**.

Discussion:

* Ralf summarizes the issue

Martin:
>I **move** we accept ODATA-521 as proposed. **Hubert seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-521:
: "Remove typed null literals" [components: OData Protocol, OData ABNF Construction Rules] is **Resolved** with no objections.

#####6.1.5.3 [ODATA-528](https://tools.oasis-open.org/issues/browse/ODATA-528)

ODATA-528:
: "$entity should require cast segment in order to apply $select/$expand" [components: OData Protocol, OData ABNF Construction Rules] is **New**.

Discussion:

* Mike summarizes the issue
* Hubert is fine with the proposal, but is not sure if this rule split in that place inside the ABNF might open the door for other widenings
* Ralf prefers the shorter form, given the many places to edit

Martin:
>I **move** we accept ODATA-528 as proposed. **Mike seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-528:
: "$entity should require cast segment in order to apply $select/$expand" [components: OData Protocol, OData ABNF Construction Rules] is **Resolved** with no objections.

####6.1.6 OData ABNF Construction Rules, OData URL Conventions [coabnf_urlc]

#####6.1.6.1 [ODATA-497](https://tools.oasis-open.org/issues/browse/ODATA-497)

ODATA-497:
: "Remove type prefix and single quotes for URL literals of types Date, DateTimeOffset, Guid, and TimeOfDay" [components: OData URL Conventions, OData ABNF Construction Rules] is **New**.

Discussion:

* Ralf summarizes the issue
* All discuss the issue

Martin:
>I **move** we accept ODATA-497 as proposed. **Hubert seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-497:
: "Remove type prefix and single quotes for URL literals of types Date, DateTimeOffset, Guid, and TimeOfDay" [components: OData URL Conventions, OData ABNF Construction Rules] is **Resolved** with no objections.

####6.1.7 OData ATOM Format, Vocabularies [coatom_voca]

#####6.1.7.1 [ODATA-525](https://tools.oasis-open.org/issues/browse/ODATA-525)

ODATA-525:
: "Remove Org.OData.Atom vocabulary" [components: Vocabularies, OData ATOM Format] is **New**.

Discussion:

* Mike summarizes the issue

Martin:
>I **move** we accept ODATA-525 as proposed. **Mike seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-525:
: "Remove Org.OData.Atom vocabulary" [components: Vocabularies, OData ATOM Format] is **Resolved** with no objections.

####6.1.8 OData ATOM Format, OData CSDL, OData JSON Format, OData Protocol [coatom_csdl_json_prot]

#####6.1.8.1 [ODATA-527](https://tools.oasis-open.org/issues/browse/ODATA-527)

ODATA-527:
: "Relative URLs in OData and the ability to put OData services behind an HTTP proxy" [components: OData CSDL, OData ATOM Format, OData Protocol, OData JSON Format] is **New**.

Discussion:

* Mike summarizes the issue and the state of discussion, but sees no final proposal consensus yet

**No further discussion**. **No objections**.

ODATA-527:
: "Relative URLs in OData and the ability to put OData services behind an HTTP proxy" [components: OData CSDL, OData ATOM Format, OData Protocol, OData JSON Format] is **Open** with no objections.

#####6.1.8.2 [ODATA-532](https://tools.oasis-open.org/issues/browse/ODATA-532)

ODATA-532:
: "Clarify whether collections can contain null values" [components: OData CSDL, OData ATOM Format, OData Protocol, OData JSON Format] is **New**.

Discussion:

* Mike summarizes the issue, the context link to v3 and details the proposal.
* Ron explains a use case at State Street in the context of collections he sees a certain asymmetry here.
* Mike sketches a solution for this
* All state, that the server is not required to capture NULL in collections.

Martin:
>I **move** to resolve ODATA-532 as proposed. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-532:
: "Clarify whether collections can contain null values" [components: OData CSDL, OData ATOM Format, OData Protocol, OData JSON Format] is **Resolved** with no objections.

####6.1.9 OData CSDL [cocsdl]

#####6.1.9.1 [ODATA-513](https://tools.oasis-open.org/issues/browse/ODATA-513)

ODATA-513:
: "Special handling of derived types in the dynamic expression edm:Record. Why?" [component: OData CSDL] is **Open**.

Discussion:

* Mike summarizes the state of discussion

**No further discussion**. **No objections**.

ODATA-513:
: "Special handling of derived types in the dynamic expression edm:Record. Why?" [component: OData CSDL] is **Open** with no objections.

#####6.1.9.2 [ODATA-518](https://tools.oasis-open.org/issues/browse/ODATA-518)

ODATA-518:
: "Use NavProp@&lt;annotation-name&gt; to reference annotations applied to a NavProp" [component: OData CSDL] is **New**.

Discussion:

* Martin summarizes the issue

Martin:
>I **move** we accept ODATA-518 as proposed. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-518:
: "Use NavProp@&lt;annotation-name&gt; to reference annotations applied to a NavProp" [component: OData CSDL] is **Resolved** with no objections.

#####6.1.9.3 [ODATA-505](https://tools.oasis-open.org/issues/browse/ODATA-505)

ODATA-505:
: "Remove ReturnType attribute from Action and Function element" [component: OData CSDL] is **New**.

Discussion:

* Ralf summarizes this simplification of the CSDL

Mike:
>I **move** we adopt ODATA-505 as proposed. **Martin seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-505:
: "Remove ReturnType attribute from Action and Function element" [component: OData CSDL] is **Resolved** with no objections.

#####6.1.9.4 [ODATA-517](https://tools.oasis-open.org/issues/browse/ODATA-517)

ODATA-517:
: "Allow NavigationPropertyPath and PropertyPath expressions to end in annotations of appropriate type" [component: OData CSDL] is **New**.

Discussion:

* Ralf summarizes the issue as a straightforward extension to the path syntax

Martin:
>I **move** we accept ODATA-517 as proposed. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-517:
: "Allow NavigationPropertyPath and PropertyPath expressions to end in annotations of appropriate type" [component: OData CSDL] is **Resolved** with no objections.

#####6.1.9.5 [ODATA-481](https://tools.oasis-open.org/issues/browse/ODATA-481)

ODATA-481:
: "Annotation/Navigation/Path expressions: allow paths to continue after multi-valued navigation to e.g. drill into complex properties" [component: OData CSDL] is **New**.

Discussion:

* Ralf summarizes the issue and motivates by giving an example
* Mike has a concern of introducing the functionality where one has a path, that istself cannot be evaluated as a resource path in OData today (direction of a union set)
* Mike added something to the proposal addressing this concern, but which does not address the original concern of the reporter
* Ralf asks if only one level (instead of recursion) would be more acceptable to Mike?
* Ralf further explains the use cases boosting the proposal, mainly rooted in navigation relying heavily upon annotations.
* Hubert thinks this is a good way of dealing ith it.
* Mike states, that even when then the path is not a URL path, he is now - in the light of these explanations - ok with the proposal
* Ralf further explains, that for now it would work for only one level of multivalues, but he fears, that this will soon become necessary to accomodate for two levels, thus he defined it recursively.

Mike:
>I **move** we adopt ODATA-481 as proposed, but with the modification that only a single multi-valued navigation segment may be present in the path. **Martin seconds**.

Discussion of the motion:

* All discuss scenarios, where extending the level of navigation may be extended to an arbitrary number.

Mike:
>I **move** we amend the motion to clarify that &lt;PropertyPath&gt; and &lt;NavigationPropertyPath&gt;, because they terminate in a property (rather than a collection of values) support navigation through an arbitrary number of single- or multi-valued segments. **Ralf seconds**.

**No further discussion**. **No objections**. The **amendment passes**.

**No further discussion**. **No objections**. The **amended motion passes**.

ODATA-481:
: "Annotation/Navigation/Path expressions: allow paths to continue after multi-valued navigation to e.g. drill into complex properties" [component: OData CSDL] is **Resolved** as noted in the amended motion with no objections.

#####6.1.9.6 [ODATA-500](https://tools.oasis-open.org/issues/browse/ODATA-500)

ODATA-500:
: "Require function/action overloads to differ by ordered set of parameter types" [component: OData CSDL] is **New**.

Discussion:

* Mike summarizes the issue

Martin:
>I **move** we accept ODATA-500 as proposed. **Mike seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-500:
: "Require function/action overloads to differ by ordered set of parameter types" [component: OData CSDL] is **Resolved** with no objections.

#####6.1.9.7 [ODATA-533](https://tools.oasis-open.org/issues/browse/ODATA-533)

ODATA-533:
: "Restrict key property aliases to key properties nested in complex properties" [component: OData CSDL] is **New**.

Discussion:

* Ralf summarizes the issue

Martin:
>I **move** we accept ODATA-533 as proposed. **Hubert seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-533:
: "Restrict key property aliases to key properties nested in complex properties" [component: OData CSDL] is **Resolved** with no objections.

#####6.1.9.8 [ODATA-535](https://tools.oasis-open.org/issues/browse/ODATA-535)

ODATA-535:
: "Define specialization for terms" [component: OData CSDL] is **New**.

Discussion:

* Mike summarizes the issue and states, that there is ongoing discussion.
* Martin seconds this

**No further discussion**. **No objections**.

ODATA-535:
: "Define specialization for terms" [component: OData CSDL] is **Open** with no objections.

####6.1.10 OData JSON Format [cojson]

#####6.1.10.1 [ODATA-520](https://tools.oasis-open.org/issues/browse/ODATA-520)

ODATA-520:
: "Instance annotations should be prefixed with '@'" [component: OData JSON Format] is **New**.

Discussion:

* Mike summarizes the issue

Hubert:
>I **move** to resolve ODATA-520 as proposed. **Martin seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-520:
: "Instance annotations should be prefixed with '@'" [component: OData JSON Format] is **Resolved** with no objections.

####6.1.11 OData Protocol [coprot]

#####6.1.11.1 [ODATA-478](https://tools.oasis-open.org/issues/browse/ODATA-478)

ODATA-478:
: "Clarify format for values of Content-ID header in $batch parts" [component: OData Protocol] is **Open**.

Discussion:

* Ralf summarizes the issue

Mike:
>I **move** we adopt ODATA-478 as proposed. **John seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-478:
: "Clarify format for values of Content-ID header in $batch parts" [component: OData Protocol] is **Resolved** with no objections.

#####6.1.11.2 [ODATA-523](https://tools.oasis-open.org/issues/browse/ODATA-523)

ODATA-523:
: "How do clients construct links from the context url for complex types?" [component: OData Protocol] is **New**.

Discussion:

* Mike summarizes the issue
* All discuss the issue

**No further discussion**. **No objections**.

ODATA-523:
: "How do clients construct links from the context url for complex types?" [component: OData Protocol] is **Open** with no objections.

#####6.1.11.3 [ODATA-490](https://tools.oasis-open.org/issues/browse/ODATA-490)

ODATA-490:
: "Clarify Referential Constraints have UpdateRule=Cascade semantics" [component: OData Protocol] is **Open**.

Discussion:

* Mike summarizes the issue

**No further discussion**. **No objections**.

ODATA-490:
: "Clarify Referential Constraints have UpdateRule=Cascade semantics" [component: OData Protocol] is **Open** with no objections.

####6.1.12 Vocabularies [covoca]

#####6.1.12.1 [ODATA-526](https://tools.oasis-open.org/issues/browse/ODATA-526)

ODATA-526:
: "Allow specifying support for cross-joins" [component: Vocabularies] is **New**.

Discussion:

* Gerald summarizes the issue

Martin:
>I **move** we accept ODATA-526 as proposed. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-526:
: "Allow specifying support for cross-joins" [component: Vocabularies] is **Resolved** with no objections.

#####6.1.12.2 [ODATA-530](https://tools.oasis-open.org/issues/browse/ODATA-530)

ODATA-530:
: "Navigable capability term should apply to entityset, not navigationproperty directly" [component: Vocabularies] is **New**.

Discussion:

* Mike summarizes the issue

Mike:
>I **move** we adopt OData-520 as proposed. **Ralf seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-530:
: "Navigable capability term should apply to entityset, not navigationproperty directly" [component: Vocabularies] is **Resolved** with no objections.

#####6.1.12.3 [ODATA-534](https://tools.oasis-open.org/issues/browse/ODATA-534)

ODATA-534:
: "Tag type definition in Core should have default boolean value = true" [component: Vocabularies] is **New**.

Discussion:

* Mike introduces the issue
* All discuss the issue and decide to defer

**No further discussion**. **No objections**.

ODATA-534:
: "Tag type definition in Core should have default boolean value = true" [component: Vocabularies] is **Open** with no objections.

####6.1.13 OData CSDL, OData ATOM Format, OData Extension for JSON Data, OData Extension for Data Aggregation, OData JSON Format, OData Extension for Temporal Data, OData URL Conventions, OData Protocol [cocsdl_atom_exte_urlc_prot]

#####6.1.13.1 [ODATA-483](https://tools.oasis-open.org/issues/browse/ODATA-483)

ODATA-483:
: "Include all section levels in table of contents, provide anchors for all document sections" [components: OData CSDL, OData ATOM Format, OData Extension for JSON Data, OData Extension for Data Aggregation, OData JSON Format, OData Extension for Temporal Data, OData URL Conventions, OData Protocol] is **New**.

Discussion:

* Mike shortly summarizes the issue.

Martin:
>I **move** we accept ODATA-483 as proposed. **Ralf seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-483:
: "Include all section levels in table of contents, provide anchors for all document sections" [components: OData CSDL, OData ATOM Format, OData Extension for JSON Data, OData Extension for Data Aggregation, OData JSON Format, OData Extension for Temporal Data, OData URL Conventions, OData Protocol] is **Resolved** with no objections.

######6.1.13.1.2 End of Issue Processing [eoip]

Note:
>Time slot for issue processing gone. Skip all remaining agenda sub items of 6.

##7 Review revised [TC timeline][TL_REF] and immediate next steps

###7.1 Oct 1st, 2013:

Do we need an additional meeting on Tuesday next week to address any remaining issues for v4.0_CS02?

Discussion:

* Stefan would prefer to not have a meeting on tuesdays just to save a day.
* Susan can be on next tuesday
* Matt can make it on Tuesday
* Ted is not available on Tuesday
* Hubert will be there at least for the first hour
* Ken is available on Tuesday
* Mike can meet on Tuesday
* All take note that next meeting is confirmed on Oct 1 8am-10am PT, which is a special meeting to ensure we stay on track with our plan to approve CSD03 on Oct 3rd.

###7.2 Oct 3rd, 2013:

Approve CSD03? Yes.

###7.3 Oct 10-24, 2013:

3rd public review? If all works as planned, yes.

##8 Next meetings
###8.1 October 1, 2013 during 8-10am PT

Agreed.

###8.2 October 3, 2013 during 8-10am PT

Agreed.

##9 AOB

None.

Meeting adjourned on 1000 PT

## List of Open Action Items Before the Meeting [AI_REF]

**Retrieval time stamp**: `2013-09-26 11:11 +02:00`.

None.

**Note**: The actual action item processing is documented in section [4][AIH] and subsections thereof.

## Index of Issues Processed During the Meeting [IP_REF]

**Note**: The actual issue processing is documented in sections [6][IPH]. The below index has two main parts: First come the public comments (if any), second the JIRA issues. Each list of issues is sorted by ascending issue number. Noted are the ID, the summary and the reference to the relevant subsection where the issue progression has been documented:

Public Comments:

None.

JIRA Issues:

* [ODATA-466](https://tools.oasis-open.org/issues/browse/ODATA-466) "Edm.Binary should be base64-encoded (as with OData V3), not base16-encoded (as per current ABNF)" [6.1.1.1][odata-466]
* [ODATA-472](https://tools.oasis-open.org/issues/browse/ODATA-472) "Explicitly state how dynamic properties are represented if they are not defined on an entity" [6.1.3.1][odata-472]
* [ODATA-476](https://tools.oasis-open.org/issues/browse/ODATA-476) "Clarify that type-cast segments are required for properties of derived types in system query options" [6.1.4.1][odata-476]
* [ODATA-478](https://tools.oasis-open.org/issues/browse/ODATA-478) "Clarify format for values of Content-ID header in $batch parts" [6.1.11.1][odata-478]
* [ODATA-481](https://tools.oasis-open.org/issues/browse/ODATA-481) "Annotation/Navigation/Path expressions: allow paths to continue after multi-valued navigation to e.g. drill into complex properties" [6.1.9.5][odata-481]
* [ODATA-483](https://tools.oasis-open.org/issues/browse/ODATA-483) "Include all section levels in table of contents, provide anchors for all document sections" [6.1.13.1][odata-483]
* [ODATA-490](https://tools.oasis-open.org/issues/browse/ODATA-490) "Clarify Referential Constraints have UpdateRule=Cascade semantics" [6.1.11.3][odata-490]
* [ODATA-491](https://tools.oasis-open.org/issues/browse/ODATA-491) "Language-dependency of key property values" [6.1.2.1][odata-491]
* [ODATA-497](https://tools.oasis-open.org/issues/browse/ODATA-497) "Remove type prefix and single quotes for URL literals of types Date, DateTimeOffset, Guid, and TimeOfDay" [6.1.6.1][odata-497]
* [ODATA-500](https://tools.oasis-open.org/issues/browse/ODATA-500) "Require function/action overloads to differ by ordered set of parameter types" [6.1.9.6][odata-500]
* [ODATA-505](https://tools.oasis-open.org/issues/browse/ODATA-505) "Remove ReturnType attribute from Action and Function element" [6.1.9.3][odata-505]
* [ODATA-513](https://tools.oasis-open.org/issues/browse/ODATA-513) "Special handling of derived types in the dynamic expression edm:Record. Why?" [6.1.9.1][odata-513]
* [ODATA-517](https://tools.oasis-open.org/issues/browse/ODATA-517) "Allow NavigationPropertyPath and PropertyPath expressions to end in annotations of appropriate type" [6.1.9.4][odata-517]
* [ODATA-518](https://tools.oasis-open.org/issues/browse/ODATA-518) "Use NavProp@&lt;annotation-name&gt; to reference annotations applied to a NavProp" [6.1.9.2][odata-518]
* [ODATA-519](https://tools.oasis-open.org/issues/browse/ODATA-519) "Define server-driven paging for collection-valued resources" [6.1.3.2][odata-519]
* [ODATA-520](https://tools.oasis-open.org/issues/browse/ODATA-520) "Instance annotations should be prefixed with '@'" [6.1.10.1][odata-520]
* [ODATA-521](https://tools.oasis-open.org/issues/browse/ODATA-521) "Remove typed null literals" [6.1.5.2][odata-521]
* [ODATA-523](https://tools.oasis-open.org/issues/browse/ODATA-523) "How do clients construct links from the context url for complex types?" [6.1.11.2][odata-523]
* [ODATA-524](https://tools.oasis-open.org/issues/browse/ODATA-524) "properties in [propertyList] of context URL may be qualified with type" [6.1.5.1][odata-524]
* [ODATA-525](https://tools.oasis-open.org/issues/browse/ODATA-525) "Remove Org.OData.Atom vocabulary" [6.1.7.1][odata-525]
* [ODATA-526](https://tools.oasis-open.org/issues/browse/ODATA-526) "Allow specifying support for cross-joins" [6.1.12.1][odata-526]
* [ODATA-527](https://tools.oasis-open.org/issues/browse/ODATA-527) "Relative URLs in OData and the ability to put OData services behind an HTTP proxy" [6.1.8.1][odata-527]
* [ODATA-528](https://tools.oasis-open.org/issues/browse/ODATA-528) "$entity should require cast segment in order to apply $select/$expand" [6.1.5.3][odata-528]
* [ODATA-530](https://tools.oasis-open.org/issues/browse/ODATA-530) "Navigable capability term should apply to entityset, not navigationproperty directly" [6.1.12.2][odata-530]
* [ODATA-532](https://tools.oasis-open.org/issues/browse/ODATA-532) "Clarify whether collections can contain null values" [6.1.8.2][odata-532]
* [ODATA-533](https://tools.oasis-open.org/issues/browse/ODATA-533) "Restrict key property aliases to key properties nested in complex properties" [6.1.9.7][odata-533]
* [ODATA-534](https://tools.oasis-open.org/issues/browse/ODATA-534) "Tag type definition in Core should have default boolean value = true" [6.1.12.3][odata-534]
* [ODATA-535](https://tools.oasis-open.org/issues/browse/ODATA-535) "Define specialization for terms" [6.1.9.8][odata-535]


## Timeline Reference [TL_REF]

**Note**: Please cf. the current revision of the [TC timeline](https://www.oasis-open.org/committees/download.php/50823/TC%20Timeline%206.htm).


