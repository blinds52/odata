#OData meeting #58, Thursday, 24 Oct 2013, 0800 - 0900 PT

**Note**: For explanations of conventions and other formal aspects common to OData TC meeting minutes which are used in this document please cf. "[Formal Aspects of Meeting Minutes](https://www.oasis-open.org/committees/download.php/48109/formal-aspects-meeting-minutes-v1.html)".

Meeting chaired by Ram Jeyaraman

## 1 Roll call

### 1.1 Members Present:

        Dale Moberg (Axway Software)
        Gerald Krause (SAP AG)
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

Quorum achieved. Details cf. [normative attendance sheet for this meeting](https://www.oasis-open.org/apps/org/workgroup/odata/event.php?event_id=34220).

## 2 Approval of Agenda

Approved.

## 3 Approval of Minutes from Previous Meeting(s)

### 3.1 Approval of [Minutes of 2013-10-17 Meeting#57](https://www.oasis-open.org/committees/download.php/51073/odata-meeting-57_on-20131017-minutes.html)

**Meeting minutes approved with no objections**.

## 4 Review of [Action Items](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_items.php) (AI) and Progress [AIH]

Context:
> See the "[List of Open Action Items Before the Meeting][AI_REF]" section in the appendix.

###4.1 Action items due by 2013-10-24 (end of day)

None.

###4.2 Action items NOT due by 2013-10-24 (end of day) but MAY be ready for closure

None.

##5 Review of [Issues List](https://tools.oasis-open.org/issues/secure/IssueNavigator.jspa?reset=true&mode=hide&pid=10103&sorter/field=issuekey&sorter/order=ASC) (IL) and Progress [IPH]

**Notes**:

* Issues in this section (5) may have been progressed out of sequence, but have been noted here to better group by components impacted or state before the meeting and as a service for the reader.
* There is an "[Index of Issues Processed During the Meeting][IP_REF]" section in the appendix.

###5.1 Issues on CSD03 in New or Open state

####5.1.1 OData URL Conventions, OData Protocol [courlc_prot]

#####5.1.1.1 [ODATA-555](https://tools.oasis-open.org/issues/browse/ODATA-555)

ODATA-555:
: "Clarify whether or not system query options can be used more than once in a URL" [components: OData URL Conventions, OData Protocol] is **New**.

Discussion:

* Matt summarizes the issue

Matt:
>I **move** to resolve ODATA-555 using proposal 1. **Mike seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-555:
: "Clarify whether or not system query options can be used more than once in a URL" [components: OData URL Conventions, OData Protocol] is **Resolved** with no objections.

####5.1.2 Others [coothe]

#####5.1.2.1 [ODATA-554](https://tools.oasis-open.org/issues/browse/ODATA-554)

ODATA-554:
"Clarify representation of floating-point numbers" [component: Unknown] is **New**.

Discussion:

* Ralf summarizes the issue.

Ralf:
>I **move** to resolve ODATA-554 as proposed. **Martin seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-554:
"Clarify representation of floating-point numbers" [component: Unknown] is **Resolved** with no objections.


###5.2 Issues in Applied state

Discussion:

* Ralf summarizes the application of the following issues resolutions while going over the shared documents.

####5.2.1 [ODATA-547](https://tools.oasis-open.org/issues/browse/ODATA-547)

ODATA-547:
: "Clarify that the standard resources $id, $entity, $batch etc. win over content-id referencing" [component: OData Batch Processing Format] is **Applied**.

Note:
> For details cf. [6.1][ga_01] where the motion is documented.

ODATA-547:
: "Clarify that the standard resources $id, $entity, $batch etc. win over content-id referencing" [component: OData Batch Processing Format] is **OutState** with no objections.

####5.2.2 [ODATA-549](https://tools.oasis-open.org/issues/browse/ODATA-549)

ODATA-549:
: "Clarify use of IEEE754Compatible format parameter" [component: OData JSON Format] is **Applied**.

Note:
> For details cf. [6.1][ga_01] where the motion is documented.

ODATA-549:
: "Clarify use of IEEE754Compatible format parameter" [component: OData JSON Format] is **Closed** with no objections.

####5.2.3 [ODATA-550](https://tools.oasis-open.org/issues/browse/ODATA-550)

ODATA-550:
: "Define 'transient entity' in Part 1: Protocol" [component: OData Protocol] is **Applied**.

Note:
> For details cf. [6.1][ga_01] where the motion is documented.

ODATA-550:
: "Define 'transient entity' in Part 1: Protocol" [component: OData Protocol] is **Closed** with no objections.

####5.2.4 [ODATA-551](https://tools.oasis-open.org/issues/browse/ODATA-551)

ODATA-551:
: "Clarify ContextUrl patterns for projected/expanded singletons" [components: OData Protocol, OData ABNF Construction Rules] is **Applied**.

Note:
> For details cf. [6.1][ga_01] where the motion is documented.

ODATA-551:
: "Clarify ContextUrl patterns for projected/expanded singletons" [components: OData Protocol, OData ABNF Construction Rules] is **Closed** with no objections.

####5.2.5 [ODATA-552](https://tools.oasis-open.org/issues/browse/ODATA-552)

ODATA-552:
: "Clarify that the serialization of odata.count is affected by IEE754Compatible flag" [component: OData JSON Format] is **Applied**.

Note:
> For details cf. [6.1][ga_01] where the motion is documented.

ODATA-552:
: "Clarify that the serialization of odata.count is affected by IEE754Compatible flag" [component: OData JSON Format] is **Closed** with no objections.


####5.2.6 [ODATA-553](https://tools.oasis-open.org/issues/browse/ODATA-553)

ODATA-553:
: "Explicitly state that OData supports language negotiation with Accept-Language" [component: OData Protocol] is **Applied**.

Note:
> For details cf. [6.1][ga_01] where the motion is documented.

ODATA-553:
: "Explicitly state that OData supports language negotiation with Accept-Language" [component: OData Protocol] is **Closed** with no objections.


##6 Non-material changes

###6.1 Let's review and approve the [recent changes](https://www.oasis-open.org/committees/download.php/51161/CSD03%20Summary%20of%20Non-Material%20Changes%202013-10-24.docx) [ga_01]

Discussion:

* Ralf summarizes the non-material changes document

Mike Pizzo:
>I **move** we accept the applied issues and other non-normative changes described in the non-normative changes document. **Martin seconds**.

**No further discussion**. **No objections**. The **motion passes**.

##7 Statement of Use readiness check

Discussion:

* Ram summarizes the state
* All discuss conditions to be met

###7.1 Sample Statement of Use:

[Mail with updated sample statement of use](https://lists.oasis-open.org/archives/odata/201310/msg00218.html)


##8 Review revised [TC timeline][TL_REF] and immediate next steps

Discussion:

* Ram summarizes the state of public review (no change so far).

###8.1 Oct 31st, 2013

###8.1 Milestones for Monday Nov 4th, 2013 (special TC meeting)

####8.1.1 Review all changes since CSD03 and confirm that they are Non-Material
####8.1.2 Review and approve Statements of Use
####8.1.3 Resolve to start an e-ballot to approve Committee Specification 02
####8.1.4 Resolve to start an e-ballot to approve Candidate OASIS Standard

##9 Next meetings

###9.1 Special TC meeting on Monday Nov 4th, 2013

As agreed we will meet during 08:00 - 08:30 am PT, so the TC can move to conduct the ballot.

##10 AOB

None.

Meeting adjourned on 0844 PT

## List of Open Action Items Before the Meeting [AI_REF]

**Retrieval time stamp**: `2013-10-24 15:00 +02:00`.

AI#0030
: "Update the links in specs to CS02" [owner: Ralf Handl] is **Open** (Note: Due 2013-10-31)

**Note**: The actual action item processing is documented in section [4][AIH] and subsections thereof.

## Index of Issues Processed During the Meeting [IP_REF]

**Note**: The actual issue processing is documented in sections [5][IPH]. The below index has two main parts: First come the public comments (if any), second the JIRA issues. Each list of issues is sorted by ascending issue number. Noted are the ID, the summary and the reference to the relevant subsection where the issue progression has been documented:

Public Comments:

None.

JIRA Issues:

* [ODATA-547](https://tools.oasis-open.org/issues/browse/ODATA-547) "Clarify that the standard resources $id, $entity, $batch etc. win over content-id referencing" [5.2.1][odata-547]
* [ODATA-549](https://tools.oasis-open.org/issues/browse/ODATA-549) "Clarify use of IEEE754Compatible format parameter" [5.2.2][odata-549]
* [ODATA-550](https://tools.oasis-open.org/issues/browse/ODATA-550) "Define 'transient entity' in Part 1: Protocol" [5.2.3][odata-550]
* [ODATA-551](https://tools.oasis-open.org/issues/browse/ODATA-551) "Clarify ContextUrl patterns for projected/expanded singletons" [5.2.4][odata-551]
* [ODATA-552](https://tools.oasis-open.org/issues/browse/ODATA-552) "Clarify that the serialization of odata.count is affected by IEE754Compatible flag" [5.2.5][odata-552]
* [ODATA-553](https://tools.oasis-open.org/issues/browse/ODATA-553) "Explicitly state that OData supports language negotiation with Accept-Language" [5.2.6][odata-553]
* [ODATA-554](https://tools.oasis-open.org/issues/browse/ODATA-554) "Clarify representation of floating-point numbers" [5.1.2.1][odata-554]
* [ODATA-555](https://tools.oasis-open.org/issues/browse/ODATA-555) "Clarify whether or not system query options can be used more than once in a URL" [5.1.1.1][odata-555]

## Timeline Reference [TL_REF]

**Note**: Please cf. the current revision of the [TC timeline](https://www.oasis-open.org/committees/download.php/50823/TC%20Timeline%206.htm).


