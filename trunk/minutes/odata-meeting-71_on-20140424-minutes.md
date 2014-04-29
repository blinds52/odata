#OData meeting #71, Thursday,   24 Apr 2014, 0800 - 1000 PDT

**Note**: For explanations of conventions and other formal aspects common to OData TC meeting minutes which are used in this document please cf. "[Formal Aspects of Meeting Minutes](https://www.oasis-open.org/committees/download.php/48109/formal-aspects-meeting-minutes-v1.html)".

Meeting chaired by Ram Jeyaraman

## 1 Roll call

### 1.1 Members Present:

        Edmond Bourne (BlackBerry)
        Hubert Heijkers (IBM)
        John Willson (Individual)
        Ken Baclawski (Northeastern University)
        Mark Biamonte (Progress Software)
        Martin Zurmuehl (SAP AG)
        Matthew Borges (SAP AG) a.k.a. Matt
        Michael Pizzo (Microsoft) a.k.a. Mike
        Ram Jeyaraman (Microsoft)
        Stefan Drees (Individual)
        Susan Malaika (IBM)
        Ted Jones (Red Hat)

Quorum achieved. Details cf. [normative attendance sheet for this meeting](https://www.oasis-open.org/apps/org/workgroup/odata/event.php?event_id=36538).

## 2 Approval of Agenda

Approved as published.

## 3 Approval of Minutes from Previous Meeting(s)

### 3.1 Approval of [Minutes of 2014-04-03 Meeting#70](https://www.oasis-open.org/committees/download.php/52767/odata-meeting-70_on-20140403-minutes.html)

**Meeting minutes approved as published (latest revision) with no objections**.

## 4 Review of [Action Items](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_items.php) (AI) and Progress [AIH]

Context:
> See the "[List of Open Action Items Before the Meeting][AI_REF]" section in the appendix.

###4.1 Action items due by 2014-04-24 (end of day)

None.

###4.2 Action items NOT due by 2014-04-24 (end of day) but MAY be ready for closure

None.

## 5 Review of [Timeline][TL_REF]

Discussion:

* Ram walks through the timeline.  Starting at   March through May 2014
* Mike mentions additional F2F items:  temporal, security document, implementers guide
* Ram mentions F2F:  aggredation; internationalization
* All discuss F2F
* Mark can not attend the face to face in person this time.
* F2F agenda to consider scheduled voting discussion times
* Ram asks about remote dial expectations. Central Time zone folks, European Time Zone
* Stefan kindly requests to center quorum relevant topics around the morning sessions of the meeting days, to ease participating remotely after office hours, but before night.
* Ram recommends morning sessions for all with lighter items in the Pacific time zone in afternoon
* Mike invites F2F attendees wanting specific items to advise him for Wednesday PM pre meeting
* Ram goes back to timeline
* Ram discusses how an ISO standard is voted on and the process
* All discussion on ISO timeline and the effort to achieve a standard.

## 6 OData webinar [webinar]

Discussion:

* Ram asks about webinar.
* Webinar tools include GotoMeeting with PPT
* Ram discusses use case scenarios for OData webinar.
* Mike mentions historical background, REST, interoperability
* Hubert addresses 360 view part deux.  Mentions how do we overview versus deep dive with/out questions and answers
* Mike discusses a series of webinars or follow ons on particular OData interests etc.
* Ram in response to Susan states, the webinars are in response to a question by Jane Hanard, OASIS.
* Timeframe for initial webinar discussed.
* John Mentions Solstice

## 7 Interoperation testing [interop]

Discussion:

* Ram discusses Interoperation testing
* Hubert discusses Apach Olingo library issues
* Martin mentions before features should have lighter coverage
* Ted adds to discussion on Olingo bandwagon.
* Mike mentions align interop event around ISO activities to show evidence of implementation
* Mike discusses Atom implementation and Aggregation docs
* Hubert not expecting requests for Atom.  Aggregation is under consideration.
* Martin echos Hubert's discussion.
* Mark echos JSON view and Aggration NOT under consideration.
* Ram moves to processing issues.


## 8 Review of [Issues List](https://tools.oasis-open.org/issues/secure/IssueNavigator.jspa?reset=true&mode=hide&pid=10103&sorter/field=issuekey&sorter/order=ASC) (IL) and Progress [IPH]

**Notes**:

* Issues in this section (8) may have been progressed out of sequence, but have been noted here to better group by components impacted or state before the meeting and as a service for the reader.
* There is an "[Index of Issues Processed During the Meeting][IP_REF]" section in the appendix.

### 8.1 OData v4 Errata issues in New or Open state [ga_01]

Hubert:
>I **move** to resolve ODATA-637, ODATA-638, ODATA-642, ODATA-644, ODATA-647, and ODATA-648 as proposed. **Mark seconds**.

**No further discussion**. **No objections**. The **motion passes**.


#### 8.1.1 [ODATA-642](https://tools.oasis-open.org/issues/browse/ODATA-642)

ODATA-642:
"$select wording clarification; specify, rather than restrict, set of properties" [component: OData URL Conventions] is **New**

Discussion:

* Mike walks through scenario change
* Issue is opened

Note:
> For details cf. [8.1][ga_01] where the motion is documented.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-642:
"$select wording clarification; specify, rather than restrict, set of properties" [component: OData URL Conventions] is **Proposed** with no objections.

#### 8.1.2 [ODATA-646](https://tools.oasis-open.org/issues/browse/ODATA-646)

ODATA-646:
"Clarify; returning content from a data modification should be same as GET" [component: OData Protocol] is **New**

Discussion:

* Martin supports it
* Hubert discusses possible side effects
* Issue is opened

**No further discussion**. **No objections**.

ODATA-646:
"Clarify; returning content from a data modification should be same as GET" [component: OData Protocol] is **Open** with no objections.

#### 8.1.3 [ODATA-647](https://tools.oasis-open.org/issues/browse/ODATA-647)

ODATA-647:
"Define 'Edit URL' of primitive property" [component: OData Protocol] is **New**

Discussion:

* Issue is opened

Note:
> For details cf. [8.1][ga_01] where the motion is documented.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-647:
"Define 'Edit URL' of primitive property" [component: OData Protocol] is **Proposed** with no objections.


#### 8.1.4 [ODATA-645](https://tools.oasis-open.org/issues/browse/ODATA-645)

ODATA-645:
"Default for PUT/PATCH is not to return data" [component: OData Protocol] is **New**

Discussion:

* Hubert mentions some side effects.
* Mike mentions should versus will
* Discussion ensues with Martin mentioning 201 error
* Hubert gives wiki scenario
* Martin recommends open but further discussion needed
* Issue is opened

**No further discussion**. **No objections**.

ODATA-645:
"Default for PUT/PATCH is not to return data" [component: OData Protocol] is **Open** with no objections.

#### 8.1.5 [ODATA-600](https://tools.oasis-open.org/issues/browse/ODATA-600)

ODATA-600:
"Ensure future compatibility by reference to draft-bray-i-json-n (The I-JSON Message Format)" [component: OData JSON Format] is **New**

Discussion:

* No change in status

**No further discussion**. **No objections**.

ODATA-600:
"Ensure future compatibility by reference to draft-bray-i-json-n (The I-JSON Message Format)" [component: OData JSON Format] is **New** with no objections.


#### 8.1.6 [ODATA-644](https://tools.oasis-open.org/issues/browse/ODATA-644)

ODATA-644:
"Example 18 should use 'Orders' instead of 'Items'" [component: OData JSON Format] is **New**

Discussion:

* All discuss the confusion on use of word 'items'
* Issue is opened

Note:
> For details cf. [8.1][ga_01] where the motion is documented.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-644:
"Example 18 should use 'Orders' instead of 'Items'" [component: OData JSON Format] is **Proposed** with no objections.


#### 8.1.7 [ODATA-638](https://tools.oasis-open.org/issues/browse/ODATA-638)

ODATA-638:
"Clarify Delta responses with Minimal Metadata" [component: OData Extension for JSON Data] is **New**

Discussion:

* All discuss metadata differences between client and/or server return.
* Martin mentions scenario with changed metadata
* Issue is opened
* Martin suggests that: "Each call beiing self contained and independent of other calls"
* All discuss the question on encoding of $format
* All agree on opening a new issue on delta changes

Note:
> For details cf. [8.1][ga_01] where the motion is documented.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-638:
"Clarify Delta responses with Minimal Metadata" [component: OData Extension for JSON Data] is **Proposed** with no objections.


#### 8.1.8 [ODATA-648](https://tools.oasis-open.org/issues/browse/ODATA-648)

ODATA-648:
"Ambiguity between prose and examples for atom:category element" [component: OData ATOM Format] is **New**

Discussion:

* Issue is opened

Note:
> For details cf. [8.1][ga_01] where the motion is documented.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-648:
"Ambiguity between prose and examples for atom:category element" [component: OData ATOM Format] is **Proposed** with no objections.

#### 8.1.9 [ODATA-637](https://tools.oasis-open.org/issues/browse/ODATA-637)

ODATA-637:
"ATOM and JSON formats do not define representation of operation results" [components: OData JSON Format, OData ATOM Format] is **New**

Discussion:

* Issue is opened

Note:
> For details cf. [8.1][ga_01] where the motion is documented.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-637:
"ATOM and JSON formats do not define representation of operation results" [components: OData JSON Format, OData ATOM Format] is **Proposed** with no objections.

##### 8.1.9.1 End fo Issue Processing [eoip]

Note:
>All issues scheduled for processing have been processed.

## 9 Next meeting

All agree, that next meeting will be on Apr 30, 0800-0900 PDT

Note: Duration will be only one hour.

## 10 AOB

No other business

Meeting adjourned at 1006 PDT.


## List of Open Action Items Before the Meeting [AI_REF]

**Retrieval time stamp**: `2014-04-24 11:22 +02:00`.

None.

**Note**: The actual action item processing is documented in section [4][AIH] and subsections thereof.

## Index of Issues Processed During the Meeting [IP_REF]

**Note**: The actual issue processing is documented in sections [8][IPH]. The below index has two main parts: First come the public comments (if any), second the JIRA issues. Each list of issues is sorted by ascending issue number. Noted are the ID, the summary and the reference to the relevant subsection where the issue progression has been documented:

Public Comments:

        None.

JIRA Issues:

* [ODATA-600](https://tools.oasis-open.org/issues/browse/ODATA-600) "Ensure future compatibility by reference to draft-bray-i-json-n (The I-JSON Message Format)" [8.1.5][odata-600]

* [ODATA-637](https://tools.oasis-open.org/issues/browse/ODATA-637) "Ambiguity between prose and examples for atom:category element" [8.1.9][odata-637]

* [ODATA-638](https://tools.oasis-open.org/issues/browse/ODATA-638) "Clarify Delta responses with Minimal Metadata" [8.1.7][odata-638]

* [ODATA-642](https://tools.oasis-open.org/issues/browse/ODATA-642) "$select wording clarification; specify, rather than restrict, set of properties" [8.1.1][odata-642]

* [ODATA-644](https://tools.oasis-open.org/issues/browse/ODATA-644) "Example 18 should use 'Orders' instead of 'Items'" [8.1.6][odata-644]

* [ODATA-645](https://tools.oasis-open.org/issues/browse/ODATA-645) "Default for PUT/PATCH is not to return data" [8.1.4][odata-645]

* [ODATA-646](https://tools.oasis-open.org/issues/browse/ODATA-646) "Clarify; returning content from a data modification should be same as GET" [8.1.2][odata-646]

* [ODATA-647](https://tools.oasis-open.org/issues/browse/ODATA-647) "Define 'Edit URL' of primitive property" [8.1.3][odata-647]

* [ODATA-648](https://tools.oasis-open.org/issues/browse/ODATA-648) "Ambiguity between prose and examples for atom:category element" [8.1.8][odata-648]

## Timeline Reference [TL_REF]

**Note**: Please cf. the current revision of the [TC timeline](https://www.oasis-open.org/committees/download.php/52831/TC%20Timeline%207.htm).

