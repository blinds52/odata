#OData meeting #49, Monday, 15 Aug 2013, 0800 - 0900 PT

**Note**: For explanations of conventions and other formal aspects common to OData TC meeting minutes which are used in this document please cf. "[Formal Aspects of Meeting Minutes](https://www.oasis-open.org/committees/download.php/48109/formal-aspects-meeting-minutes-v1.html)".

Meeting chaired by Ram Jeyaraman

## 1 Roll call

### 1.1 Members Present:

        Dale Moberg (Axway Software)
        Edmond Bourne (BlackBerry)
        Gerald Krause (SAP AG)
        Hubert Heijkers (IBM)
        John Willson (Individual)
        Matthew Borges (SAP AG) a.k.a. Matt
        Michael Pizzo (Microsoft) a.k.a. Mike
        Patrick Durusau (Individual)
        Ralf Handl (SAP AG)
        Ram Jeyaraman (Microsoft)
        Stan Mitranic (CA Technologies)
        Stefan Drees (Individual)
        Susan Malaika (IBM)
        Ted Jones (Red Hat)

Quorum achieved. Details cf. [normative attendance sheet for this meeting](https://www.oasis-open.org/apps/org/workgroup/odata/event.php?event_id=34210).

## 2 Approval of Agenda

Approved.

## 3 Approval of Minutes from Previous Meeting(s)

### 3.1 Approval of [[Minutes of 2013-08-08 Meeting#48](https://www.oasis-open.org/committees/download.php/50225/odata-meeting-48_on-20130808-minutes.html)

**Meeting minutes approved with no objections**.

## 4 Review of [Action Items](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_items.php) (AI) and Progress [AIH]

Context:
> See the "[List of Open Action Items Before the Meeting][AI_REF]" section in the appendix.

###4.1 Action items due by 2013-08-15 (end of day)

None.

###4.2 Action items NOT due by 2013-08-15 (end of day) but MAY be ready for closure

None.

##5 Discuss results of recently concluded Special Majority Ballot to approve OData v4.0 with Non-Material Changes as a Committee Specification

###5.1 Next step: Need at least 3 Statements of Use before we can advance OData v4.0 to Candidate OASIS Standard

Discussion:

* Mike asks for sample statements of use

* Ram mentions, that the TC Admin sent recently a template for such a stetement of use we could build upon.

* Ram adds that this is more or less a 3 to 4 lines statement

* Hubert asks, if this statement has to refer to a public product to be verifiable.

* Ram clarifies, that this is not needed, as it would preclude eg. a university statement of use (as there might be no product involved)

* All agree, that a statement of use in our case may cover client, server or even both

* All discuss on the roadmaps for the planned and working implementations of OData v4 as candidates for issuers of Statements of Use

* John points to one such candidate visible at: https://data.environment.alberta.ca/Services/Land/LandRec.svc

* Three members at least mention, that they will be able to state usage. Another member also sees it as possible.

* All agree to further prepare these during the next weeks and months.

##6 Discuss What's New in OData Version 4.0

Context:
> [What's New in OData Version 4.0](https://www.oasis-open.org/committees/download.php/50287/new-in-odata-v4.0-wd01-final-2013-08-15.docx) which is the version with all changes accepted.

###6.1 Any more comments?

Discussion:

* Ralf received one comment from Stefan and uploaded this new version into Kavi that reflects this change

###6.2 Next step: Approve as a Committee Note

Note:
> This can be done during the TC meeting via a motion using full majority vote

Stefan:
>I **move** that we accept [this document revision](https://www.oasis-open.org/committees/download.php/50287/new-in-odata-v4.0-wd01-final-2013-08-15.docx) to progress it to a non-normative Committee Note. **Mike seconds**.

**No further discussion**. **No objections**. The **motion passes**.


##7 Review of [Issues List](https://tools.oasis-open.org/issues/secure/IssueNavigator.jspa?reset=true&mode=hide&pid=10103&sorter/field=issuekey&sorter/order=ASC) (IL) and Progress [IPH]

**Notes**:

* Issues in this section (7) may have been progressed out of sequence, but have been noted here to better group by components impacted or state before the meeting and as a service for the reader.
* There is an "[Index of Issues Processed During the Meeting][IP_REF]" section in the appendix.

###7.1 [ODATA-467](https://tools.oasis-open.org/issues/browse/ODATA-467)

ODATA-467:
: "Clarify relationship between EntitySet in Function/ActionImport and EntitySetPath in Function/Action definition" [component: OData CSDL] is **New**.

Discussion:

* Mike summarizes
* Issue is OPEN
* Mike explains two suggested proposals
* Ralf likes the more flexible proposal, where the override of EntitySetPath by EntitySet is allowed
* Hubert asks, if the paths are relative to where you "are" (binding parameter)
* All discuss various scenarios
* Ralf cites from the spec that we cannot run into situations where you have an EntitySet and an EntitySetPath at the same time
* Mike concludes: "Only bound functions can have an entitysetpath, and only unbound functions can be imported into a function, so this is not an issue."
* Mike proposes that we close with no action.
* All agree

Mike:
>I **move** to close ODATA-467 with no action. **Stefan seconds**.

Discussion of motion:

* Ralf requests to add the reason into the ticket
* Mike already has added the note why this is a non issue into the ticket
* Ralf is thus fine with the motion

**No further discussion**. **No objections**. The **motion passes**.

ODATA-467:
: "Clarify relationship between EntitySet in Function/ActionImport and EntitySetPath in Function/Action definition" [component: OData CSDL] is **Closed** with no objections.

###7.2 [ODATA-468](https://tools.oasis-open.org/issues/browse/ODATA-468)

ODATA-468:
: "Define explicit concepts in ABNF for referenced sets of rules" [components: OData CSDL, OData ABNF Construction Rules] is **New**.

Discussion:

* Mike summarizesthe issue and classifies the proposal as a clarification.
* Ralf asks where this shall be noted: Errata for 4.0 or in specs of 4.1 and also how to tag the component in JIRA when things should go into errata?
* Ram suggests component_errata as pattern
* All discuss a pattern to avoid have divergent labelling sytems
* Ram will check existing guidance for naming in this case and act so accordingly
* All discuss, if the issue should be resolved now (as it should be a quick one) or better left for the next meeting as not much time is left for this meeting.
* Ralf suggests to do this next time
* All agree

ODATA-468:
: "Define explicit concepts in ABNF for referenced sets of rules" [components: OData CSDL, OData ABNF Construction Rules] is **Open**.

##8 Discuss [timeline][TL_REF] and how to proceed

All discuss the timeline. Nothing new.

## 9 Next Meetings

### 9.1 Meeting on 2013-09-05 by Call during 0800-0900 PT

Agreed.


## 10 AOB

None.

Meeting adjourned on 0901 PT

## List of Open Action Items Before the Meeting [AI_REF]

**Retrieval time stamp**: `2013-08-15 16:16 +02:00`.

AI#0018
: "Prepare Working Draft 01 (WD01) version of OData Extension for Temporal Data" [owner: Hubert Heijkers] is **Ongoing** (Note: Due 2013-09-05)

AI#0019
: "Prepare Working Draft 01 (WD01) version of OData Extension for XML Data" [owner: Stefan Drees] is **Ongoing** (Note: Due 2013-09-05)

AI#0020
: "Prepare Working Draft 01 (WD01) version of OData Extension for JSON Data" [owner: Susan Malaika] is **Ongoing** (Note: Due 2013-09-05)


**Note**: The actual action item processing is documented in section [4][AIH] and subsections thereof.

## Index of Issues Processed During the Meeting [IP_REF]

**Note**: The actual issue processing is documented in sections [7][IPH]. The below index has two main parts: First come the public comments (if any), second the JIRA issues. Each list of issues is sorted by ascending issue number. Noted are the ID, the summary and the reference to the relevant subsection where the issue progression has been documented:

Public Comments:

None.

JIRA Issues:

* [ODATA-467](https://tools.oasis-open.org/issues/browse/ODATA-467) "Clarify relationship between EntitySet in Function/ActionImport and EntitySetPath in Function/Action definition" [7.1][odata-467]
* [ODATA-468](https://tools.oasis-open.org/issues/browse/ODATA-468) "Define explicit concepts in ABNF for referenced sets of rules" [7.2][odata-468]

## Timeline Reference [TL_REF]

**Note**: Please cf. the current revision of the [TC timeline](https://www.oasis-open.org/committees/download.php/49178/TC%20Timeline%205.htm).


