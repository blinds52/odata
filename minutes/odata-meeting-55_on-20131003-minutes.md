#OData meeting #55, Thursday, 03 Oct 2013, 0800 - 0900 PT

**Note**: For explanations of conventions and other formal aspects common to OData TC meeting minutes which are used in this document please cf. "[Formal Aspects of Meeting Minutes](https://www.oasis-open.org/committees/download.php/48109/formal-aspects-meeting-minutes-v1.html)".

Meeting chaired by Ram Jeyaraman

## 1 Roll call

### 1.1 Members Present:

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
        Ram Jeyaraman (Microsoft)
        Ron Dagostino (State Street Corp)
        Stan Mitranic (CA Technologies)
        Stefan Drees (Individual)
        Ted Jones (Red Hat)

Quorum achieved. Details cf. [normative attendance sheet for this meeting](https://www.oasis-open.org/apps/org/workgroup/odata/event.php?event_id=34217).

## 2 Approval of Agenda

Approved.

## 3 Approval of Minutes from Previous Meeting(s)

### 3.1 Approval of [Minutes of 2013-10-01 Meeting#54](https://www.oasis-open.org/committees/download.php/50877/odata-meeting-54_on-20131001-minutes.html)

**Meeting minutes approved with no objections**.

## 4 Review of [Action Items](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_items.php) (AI) and Progress [AIH]

Context:
> See the "[List of Open Action Items Before the Meeting][AI_REF]" section in the appendix.

###4.1 Action items due by 2013-10-03 (end of day)

None.

###4.2 Action items NOT due by 2013-10-03 (end of day) but MAY be ready for closure

None.

##5 Review of [Issues List](https://tools.oasis-open.org/issues/secure/IssueNavigator.jspa?reset=true&mode=hide&pid=10103&sorter/field=issuekey&sorter/order=ASC) (IL) and Progress [IPH]

**Notes**:

* Issues in this section (5) may have been progressed out of sequence, but have been noted here to better group by components impacted or state before the meeting and as a service for the reader.
* There is an "[Index of Issues Processed During the Meeting][IP_REF]" section in the appendix.

###5.1 Issues for v4.0_CS02 in New or Open state

####5.1.1 OData ATOM Format, OData CSDL, OData JSON Format, OData Protocol [coatom_csdl_json_prot]

#####5.1.1.1 [ODATA-527](https://tools.oasis-open.org/issues/browse/ODATA-527)

ODATA-527:
: "Relative URLs in OData and the ability to put OData services behind an HTTP proxy" [components: OData CSDL, OData ATOM Format, OData Protocol, OData JSON Format] is **Open**.

Discussion:

* Ralf summarizes the issue.
* All go through shared document.

Hubert:
>I **move** to resolve OData-527 as proposed. **Mike seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-527:
: "Relative URLs in OData and the ability to put OData services behind an HTTP proxy" [components: OData CSDL, OData ATOM Format, OData Protocol, OData JSON Format] is **Resolved** with no objections.

Hubert:
>I **move** to approve the application of the resolution for ODATA-527 and close the issue. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-527:
: "Relative URLs in OData and the ability to put OData services behind an HTTP proxy" [components: OData CSDL, OData ATOM Format, OData Protocol, OData JSON Format] is **Closed** with no objections.

####5.1.2 OData Protocol [coprot]

#####5.1.2.1 [ODATA-523](https://tools.oasis-open.org/issues/browse/ODATA-523)

ODATA-523:
: "How do clients construct links from the context url for complex types?" [component: OData Protocol] is **Open**.

Discussion:

* Mike summarizes the issue.

Hubert:
>I **move** to resolve ODATA-523 as proposed, approve the applied resolution, and close the issue. **Ralf seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-523:
: "How do clients construct links from the context url for complex types?" [component: OData Protocol] is **Closed** with no objections.

####5.1.3 OData CSDL [cocsdl]

#####5.1.3.1 [ODATA-513](https://tools.oasis-open.org/issues/browse/ODATA-513)

ODATA-513:
: "Special handling of derived types in the dynamic expression edm:Record. Why?" [component: OData CSDL] is **Open**.

Discussion:

* Ralf summarizes the issue and also all relevant facts for issue ODATA-535 (subsection 5.1.3.2).

Ralf:
>I **move** to resolve ODATA-513 and ODATA-535 as proposed, approve the applied resolution, and close the issue. **Mike seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-513:
: "Special handling of derived types in the dynamic expression edm:Record. Why?" [component: OData CSDL] is **Closed** with no objections.

#####5.1.3.2 [ODATA-535](https://tools.oasis-open.org/issues/browse/ODATA-535)

ODATA-535:
: "Define specialization for terms" [components: Vocabularies, OData CSDL] is **Open**.

Discussion:

Note:
> For details cf. [5.1.3.1][odata-513] where the motion is documented.

ODATA-535:
: "Define specialization for terms" [components: Vocabularies, OData CSDL] is **Closed** with no objections.

#####5.1.3.3 [ODATA-543](https://tools.oasis-open.org/issues/browse/ODATA-543)

ODATA-543:
: "Nullable attribute on collection property should specify whether collection can contain null values" [component: OData CSDL] is **New**.

Discussion:

* Mike summarizes the issue.
* All discuss the issue and during the meeting some editorial nits are found and fixed.

Mike:
>I **move** to resolve ODATA-543 as proposed, approve the applied resolution, and close the issue. **Hubert seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-543:
: "Nullable attribute on collection property should specify whether collection can contain null values" [component: OData CSDL] is **Closed** with no objections.

####5.1.4 OData JSON Format [cojson]

#####5.1.4.1 [ODATA-538](https://tools.oasis-open.org/issues/browse/ODATA-538)

ODATA-538:
: "Clarify treatment of odata.type with derived types and odata.context for delta responses for odata.metadata=none" [component: OData JSON Format] is **Open**.

Discussion:

* Mike summarizes the issue.

Hubert:
>I **move** to resolve ODATA-538 as proposed, approve the applied resolution, and close the issue. **Ralf seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-538:
: "Clarify treatment of odata.type with derived types and odata.context for delta responses for odata.metadata=none" [component: OData JSON Format] is **Closed** with no objections.

####5.1.5 OData ATOM Format, OData JSON Format, OData Protocol [coatom_json_prot]

#####5.1.5.1 [ODATA-539](https://tools.oasis-open.org/issues/browse/ODATA-539)

ODATA-539:
: "Delta response encoding is unnecessarily verbose and change type is missing when odata.metadata=none" [components: OData JSON Format, OData ATOM Format, OData Protocol] is **Open**.

Discussion:

* Mike summarizes the issue.
* All discuss the issue and the proposal is adapted to the applied resolution.

Mike:
>I **move** we resolve ODATA-539 by simplifying example 30 in [JSON] to show the more concise representation of the relative Context URLs, accept the edits, and close the issue. **Hubert seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-539:
: "Delta response encoding is unnecessarily verbose and change type is missing when odata.metadata=none" [components: OData JSON Format, OData ATOM Format, OData Protocol] is **Closed as described in the motion** with no objections.

####5.1.6 OData ABNF Construction Rules, OData Protocol [coabnf_prot]

#####5.1.6.1 [ODATA-542](https://tools.oasis-open.org/issues/browse/ODATA-542)

ODATA-542:
: "Clarify that $selected Actions/Functions are included in [project-list] within a ContextUrl" [components: OData Protocol, OData ABNF Construction Rules] is  **New**.

Discussion:

* Mike summarizes the issue.

Hubert:
>I **move** to resolve ODATA-542 as proposed, approve the applied resolution, and close the issue. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-542:
: "Clarify that $selected Actions/Functions are included in [project-list] within a ContextUrl" [components: OData Protocol, OData ABNF Construction Rules] is  **Closed** with no objections.

###5.2  Issues for v4.0_CS02 in Applied state

####5.2.1 Issues whose applications may need some discussion

#####5.2.1.1 [ODATA-537](https://tools.oasis-open.org/issues/browse/ODATA-537)

ODATA-537:
: "Ordering of navigationLink and associationLink annotations in JSON" [component: OData JSON Format] is  **Applied**.

Discussion:

* Mike summarizes the application of the issues resolution.

Hubert:
>I **move** to approve the resolution for ODATA-537 and close the issue. **Martin seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-537:
: "Ordering of navigationLink and associationLink annotations in JSON" [component: OData JSON Format] is  **Closed**.

#####5.2.1.2 [ODATA-532](https://tools.oasis-open.org/issues/browse/ODATA-532)

ODATA-532:
: "Clarify whether collections can contain null values" [components: OData CSDL, OData ATOM Format, OData Protocol, OData JSON Format] is  **Applied**.

Discussion:

* Mike summarizes the application of the issues resolution.

Ralf:
>I **move** to accept ODATA-532 as applied and close it. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-532:
: "Clarify whether collections can contain null values" [components: OData CSDL, OData ATOM Format, OData Protocol, OData JSON Format] is  **Closed**.

####5.2.2 Issues whose application is relatively straight forward

#####5.2.2.1 [ODATA-490](https://tools.oasis-open.org/issues/browse/ODATA-490)

ODATA-490:
: "Clarify Referential Constraints have UpdateRule=Cascade semantics" [component: OData Protocol] is  **Applied**.

Discussion:

* Mike summarizes the application of the issues resolution.

Stefan:
>I **move** to close ODATA-490 as applied. **Ralf seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-490:
: "Clarify Referential Constraints have UpdateRule=Cascade semantics" [component: OData Protocol] is  **Closed**.

#####5.2.2.2 [ODATA-531](https://tools.oasis-open.org/issues/browse/ODATA-531)

ODATA-531:
: "Simplify OptimisticConcurrency in Core vocabulary" [components: Vocabularies, OData CSDL] is  **Applied**.

Discussion:

* Mike summarizes the application of the issues resolution.
* Ralf had to update the example in the CSDL document where that term is used.

Mike:
>I **move** we accept the application of ODATA-531 and close the issue. **Martin seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-531:
: "Simplify OptimisticConcurrency in Core vocabulary" [components: Vocabularies, OData CSDL] is  **Closed**.

#####5.2.2.3 [ODATA-536](https://tools.oasis-open.org/issues/browse/ODATA-536)

ODATA-536:
: "Treatment of circular references when using $levels" [component: OData Protocol] is  **Applied**.

Discussion:

* Ralf summarizes the application of the issues resolution.
* Martin spotted some enhancement potnetial.
* All edit minor phrasing issues, that might otherwise appear imprecise

Hubert:
>I **move** to approve the applied resolution for ODATA-536 and close the issue. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-536:
: "Treatment of circular references when using $levels" [component: OData Protocol] is  **Closed**.

######5.2.2.3.1 End of Issue Processing [eoip]

Note:
>All issues scheduled for processing have been processed.

##6 Approve Committee Specification Draft 03

Context:
> Approve Committee Specification Draft 03 (of OData v4, OData JSON Format v4, OData ATOM Format v4 Work Products) and start public review for 15 days

Discussion:

* All wait a few minutes to allow Ralf repackaging the relevant archives to prepare the below motions.

###6.1 OData v4 ATOM Work Product

Martin:
>I **move** that the TC approve OData ATOM Format v4.0 Working Draft 04 and all associated artifacts packaged together in [OData Atom WD04](https://www.oasis-open.org/committees/download.php/50905/odata-atom-format-v4.0-wd04-2013-10-03.zip) as Committee Specification Draft 03 and submit it for public review for a duration of 15 days. Further, I move to designate the MS Office version of the Work Product as authoritative. **Mike seconds**.

**No further discussion**. **No objections**. The **motion passes**.

###6.2 OData JSON Format v4 Work Product

Hubert:
>I **move** that the TC approve OData JSON Format v4.0 Working Draft 04 and all associated artifacts packaged together in [OData JSON WD04](https://www.oasis-open.org/committees/download.php/50906/odata-json-format-v4.0-wd04-2013-10-03.zip) as Committee Specification Draft 03 and submit it for public review for a duration of 15 days. Further, I move to designate the MS Office version of the Work Product as authoritative. **Martin seconds**.

**No further discussion**. **No objections**. The **motion passes**.

###6.3 OData v4 Work Product

Mike:
>I **move** that the TC approve OData v4.0 Working Draft 04 and all associated artifacts packaged together in [OData WD04](https://www.oasis-open.org/committees/download.php/50919/odata-v4.0-wd04-2013-10-03.zip) as Committee Specification Draft 03 and submit it for public review for a duration of 15 days. Further, I move to designate the MS Office version of the Work Product as authoritative. **Ralf seconds**.

**No further discussion**. **No objections**. The **motion passes**.

##7 Review revised [TC timeline][TL_REF] and immediate next steps

Discussion:

* All look at the timeline.
* All discuss the progress of the known expected statements of use
* All now focus on pushing the progress for obtaining the statements of use

##8 Next meetings

###8.1 October 10, 2013 during 8-10am PT

Agreed.

##9 AOB

None.

Meeting adjourned on 0957 PT

## List of Open Action Items Before the Meeting [AI_REF]

**Retrieval time stamp**: `2013-10-03 16:50 +02:00`.

None.

**Note**: The actual action item processing is documented in section [4][AIH] and subsections thereof.

## Index of Issues Processed During the Meeting [IP_REF]

**Note**: The actual issue processing is documented in sections [5][IPH]. The below index has two main parts: First come the public comments (if any), second the JIRA issues. Each list of issues is sorted by ascending issue number. Noted are the ID, the summary and the reference to the relevant subsection where the issue progression has been documented:

Public Comments:

None.

JIRA Issues:

* [ODATA-490](https://tools.oasis-open.org/issues/browse/ODATA-490) "Clarify Referential Constraints have UpdateRule=Cascade semantics" [5.2.2.1][odata-490]
* [ODATA-513](https://tools.oasis-open.org/issues/browse/ODATA-513) "Special handling of derived types in the dynamic expression edm:Record. Why?" [5.1.3.1][odata-513]
* [ODATA-523](https://tools.oasis-open.org/issues/browse/ODATA-523) "How do clients construct links from the context url for complex types?" [5.1.2.1][odata-523]
* [ODATA-527](https://tools.oasis-open.org/issues/browse/ODATA-527) "Relative URLs in OData and the ability to put OData services behind an HTTP proxy" [5.1.1.1][odata-527]
* [ODATA-531](https://tools.oasis-open.org/issues/browse/ODATA-531) "Simplify OptimisticConcurrency in Core vocabulary" [5.2.2.2][odata-531]
* [ODATA-532](https://tools.oasis-open.org/issues/browse/ODATA-532) "Clarify whether collections can contain null values" [5.2.1.2][odata-532]
* [ODATA-535](https://tools.oasis-open.org/issues/browse/ODATA-535) "Define specialization for terms" [5.1.3.2][odata-535]
* [ODATA-536](https://tools.oasis-open.org/issues/browse/ODATA-536) "Treatment of circular references when using $levels" [5.2.2.3][odata-536]
* [ODATA-537](https://tools.oasis-open.org/issues/browse/ODATA-537) "Ordering of navigationLink and associationLink annotations in JSON" [5.2.1.1][odata-537]
* [ODATA-538](https://tools.oasis-open.org/issues/browse/ODATA-538) "Clarify treatment of odata.type with derived types and odata.context for delta responses for odata.metadata=none" [5.1.4.1][odata-538]
* [ODATA-539](https://tools.oasis-open.org/issues/browse/ODATA-539) "Delta response encoding is unnecessarily verbose and change type is missing when odata.metadata=none" [5.1.5.1][odata-539]
* [ODATA-542](https://tools.oasis-open.org/issues/browse/ODATA-542) "Clarify that $selected Actions/Functions are included in [project-list] within a ContextUrl" [5.1.6.1][odata-542]
* [ODATA-543](https://tools.oasis-open.org/issues/browse/ODATA-543) "Nullable attribute on collection property should specify whether collection can contain null values" [5.1.3.3][odata-543]

## Timeline Reference [TL_REF]

**Note**: Please cf. the current revision of the [TC timeline](https://www.oasis-open.org/committees/download.php/50823/TC%20Timeline%206.htm).


