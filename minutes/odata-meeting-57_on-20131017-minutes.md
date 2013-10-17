#OData meeting #57, Thursday, 17 Oct 2013, 0800 - 0900 PT

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
        Patrick Durusau (Individual)
        Ralf Handl (SAP AG)
        Ram Jeyaraman (Microsoft)
        Ron Dagostino (State Street Corp)
        Stan Mitranic (CA Technologies)
        Stefan Drees (Individual)
        Susan Malaika (IBM)
        Ted Jones (Red Hat)

Quorum achieved. Details cf. [normative attendance sheet for this meeting](https://www.oasis-open.org/apps/org/workgroup/odata/event.php?event_id=34219).

## 2 Approval of Agenda

Approved.

## 3 Approval of Minutes from Previous Meeting(s)

### 3.1 Approval of [Minutes of 2013-10-10 Meeting#56](https://www.oasis-open.org/committees/download.php/51005/odata-meeting-56_on-20131010-minutes.html)

**Meeting minutes approved with no objections**.

## 4 Review of [Action Items](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_items.php) (AI) and Progress [AIH]

Context:
> See the "[List of Open Action Items Before the Meeting][AI_REF]" section in the appendix.

###4.1 Action items due by 2013-10-17 (end of day)

None.

###4.2 Action items NOT due by 2013-10-17 (end of day) but MAY be ready for closure

####4.2.1 [AI#0030](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_item.php?action_item_id=3655)

AI#0030
: "Update the links in specs to CS02" [owner: Ralf Handl] is **Open** (Note: Due 2013-10-31)

Discussion:

* No news. Ongoing.

AI#0030
: "Update the links in specs to CS02" [owner: Ralf Handl] is **Open** (Note: Due 2013-10-31)

##5 Review of [Issues List](https://tools.oasis-open.org/issues/secure/IssueNavigator.jspa?reset=true&mode=hide&pid=10103&sorter/field=issuekey&sorter/order=ASC) (IL) and Progress [IPH]

**Notes**:

* Issues in this section (5) may have been progressed out of sequence, but have been noted here to better group by components impacted or state before the meeting and as a service for the reader.
* There is an "[Index of Issues Processed During the Meeting][IP_REF]" section in the appendix.

###5.1 Issues on CSD03 in New or Open state

Note:
> Ralf received a comment, that the work products refer (non-normatively) to an IEEE floating point number specification, which is not available free for non-members of IEEE SA and that the wikipedia entries in this regard comparing german and english versions differ significantly, thus makng it possible, that non-interoperable implementations are being created.
The proposal was made from the reporter, that we include text from the spec, but the members of the committee are reluctant to do so.
Ralf will create a JIRA ticket to allow tracking this

####5.1.1 OData JSON Format [cojson]

#####5.1.1.1 [ODATA-549](https://tools.oasis-open.org/issues/browse/ODATA-549)

ODATA-549:
: "Clarify use of IEEE754Compatible format parameter" [component: OData JSON Format] is **New**.

Discussion:

* Mike summarizes the issue

Mike:
>I **move** to resolve ODATA-549 as a non-material change as proposed. **Martin seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-549:
: "Clarify use of IEEE754Compatible format parameter" [component: OData JSON Format] is **Resolved** with no objections.

####5.1.2 OData Protocol [coprot]

#####5.1.2.1 [ODATA-550](https://tools.oasis-open.org/issues/browse/ODATA-550)

ODATA-550:
: "Define 'transient entity' in Part 1: Protocol" [component: OData Protocol] is **New**.

Discussion:

* Ralf summarizes the issue.

Martin:
>I **move** to resolve ODATA-550 as a non-material change as proposed. **Mike seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-550:
: "Define 'transient entity' in Part 1: Protocol" [component: OData Protocol] is **Resolved** with no objections.

#####5.1.2.2 [ODATA-551](https://tools.oasis-open.org/issues/browse/ODATA-551)

ODATA-551:
: "Clarify ContextUrl patterns for projected/expanded singletons" [component: OData Protocol] is **New**.

Discussion:

* Mike summarizes the issue
* All discuss the issue and the proposed resolution

Mike:
>I **move** we resolve ODATA-551 as proposed, including addressing the comment that $expand with no $select (or nested $select) has no appended property-list. **Hubert seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-551:
: "Clarify ContextUrl patterns for projected/expanded singletons" [component: OData Protocol] is **Resolved as noted in the motion** with no objections.

###5.2 Issues in Applied state

####5.2.1 [ODATA-547](https://tools.oasis-open.org/issues/browse/ODATA-547)

ODATA-547:
: "Clarify that the standard resources $id, $entity, $batch etc. win over content-id referencing" [component: OData Batch Processing Format] is **New**.

Discussion:

* Ralf summarizes the application of the resolution to the document.
* All discuss the application in context of the shared document.
* All agree to make a further change (but leave the issue in applied state) and then revisit next meeting to close it.

ODATA-547:
: "Clarify that the standard resources $id, $entity, $batch etc. win over content-id referencing" [component: OData Batch Processing Format] is **Applied** with no objections.

####5.2.2 [ODATA-548](https://tools.oasis-open.org/issues/browse/ODATA-548)

ODATA-548:
: "Clarify pattern for future odata-version and odata-maxversion numbers" [component: OData ABNF Construction Rules] is **New**.

Discussion:

* Ralf summarizes the application of the resolution to the document.

Ralf:
>I **move** to close ODATA-548 as applied. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-548:
: "Clarify pattern for future odata-version and odata-maxversion numbers" [component: OData ABNF Construction Rules] is **Closed** with no objections.

##6 Non-material changes

###6.1 Let's review and approve the [recent changes](https://www.oasis-open.org/committees/download.php/51066/CSD03%20Summary%20of%20Non-Material%20Changes%202013-10-17.docx)

Discussion:

* Ralf summarizes the non-material changes document

Mike:
>I **move** we accept the reviewed non-material changes as non-material edits to our documents. **Martin seconds**.

**No further discussion**. **No objections**. The **motion passes**.

##7 Review revised [TC timeline][TL_REF] and immediate next steps

###7.1 Public review of OData v4, OData JSON Format v4, OData ATOM Format v4 Work Products?

Discussion:

* Ram summarizes the state of public review (no change so far).

###7.2 Oct 31st, 2013

####7.2.1 Process public review comments if any

####7.2.2 Approve Non-Material changes to CSD03

Suggested approval procedure is doing so by documenting the changes via a JIRA ticket.

####7.2.3 Review and approve Statements of Use

####7.2.4 Resolve to start a Special Majority e-ballot

Suggested is resolution to start a Special Majority e-ballott approve CSD03 with approved Non-Material changes as Committee Specification 02 and promote to Candidate OASIS Standard

Discussion:

* All discuss the next steps


##8 Statement of Use (readiness check)?

Discussion:

* Ram summarizes the state
* All discuss conditions to be met

###8.1 Sample Statement of Use:

[Mail with sample statement of use](https://lists.oasis-open.org/archives/odata/201310/msg00198.html)


##9 Next meetings

###9.1 October 24, 2013 during 8-9am PT

Agreed.

###9.2 Special TC meeting on Monday Nov 4th, 2013?

Discussion:
* Ram suggests to meet during 08:00 - 08:30 am PT, so the TC can move to conduct the ballot.
* All agree

##10 AOB

None.

Meeting adjourned on 0907 PT

## List of Open Action Items Before the Meeting [AI_REF]

**Retrieval time stamp**: `2013-10-17 14:24 +02:00`.

AI#0030
: "Update the links in specs to CS02" [owner: Ralf Handl] is **Open** (Note: Due 2013-10-31)

**Note**: The actual action item processing is documented in section [4][AIH] and subsections thereof.

## Index of Issues Processed During the Meeting [IP_REF]

**Note**: The actual issue processing is documented in sections [5][IPH]. The below index has two main parts: First come the public comments (if any), second the JIRA issues. Each list of issues is sorted by ascending issue number. Noted are the ID, the summary and the reference to the relevant subsection where the issue progression has been documented:

Public Comments:

None.

JIRA Issues:

* [ODATA-547](https://tools.oasis-open.org/issues/browse/ODATA-547) "Clarify that the standard resources $id, $entity, $batch etc. win over content-id referencing" [5.2.1][odata-547]
* [ODATA-548](https://tools.oasis-open.org/issues/browse/ODATA-548) "Clarify pattern for future odata-version and odata-maxversion numbers" [5.2.2][odata-548]
* [ODATA-549](https://tools.oasis-open.org/issues/browse/ODATA-549) "Clarify use of IEEE754Compatible format parameter" [5.1.1.1][odata-549]
* [ODATA-550](https://tools.oasis-open.org/issues/browse/ODATA-550) "Define 'transient entity' in Part 1: Protocol" [5.1.2.1][odata-550]
* [ODATA-551](https://tools.oasis-open.org/issues/browse/ODATA-551) "Clarify ContextUrl patterns for projected/expanded singletons" [5.1.2.2][odata-551]

## Timeline Reference [TL_REF]

**Note**: Please cf. the current revision of the [TC timeline](https://www.oasis-open.org/committees/download.php/50823/TC%20Timeline%206.htm).


