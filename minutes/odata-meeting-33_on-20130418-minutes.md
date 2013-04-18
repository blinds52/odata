#OData meeting #33, Thursday, 18 Apr 2013, 0800 - 1000 PT

**Note**: For explanations of conventions and other formal aspects common to OData TC meeting minutes which are used in this document please cf. "[Formal Aspects of Meeting Minutes](https://www.oasis-open.org/committees/download.php/48109/formal-aspects-meeting-minutes-v1.html)".

Meeting chaired by Barbara Hartel and Ram Jeyaraman

Acting Chair: Ram Jeyaraman

## 1 Roll call

### 1.1 Members Present:

        Anila Kumar GVN (CA Technologies)        Barbara Hartel (SAP AG)        Dale Moberg (Axway Software)        Diane Downie (Citrix Systems)        Edmond Bourne (BlackBerry)        Erik de Voogd (SDL)        Gerald Krause (SAP AG)        Hubert Heijkers (IBM)        John Willson (Individual)        Ken Baclawski (Northeastern University)        Martin Zurmuehl (SAP AG)        Matthew Borges (SAP AG)        Michael Pizzo (Microsoft) a.k.a. Mike        Patrick Durusau (Individual)        Ralf Handl (SAP AG)        Ram Jeyaraman (Microsoft)        Robert Richards (Mashery)        Stan Mitranic (CA Technologies)        Stefan Drees (Individual)        Susan Malaika (IBM)        Ted Jones (Red Hat)

Quorum achieved. Details cf. [normative attendance sheet for this meeting](https://www.oasis-open.org/apps/org/workgroup/odata/event.php?event_id=34193).

## 2 Approval of Agenda

Agenda approved as published.

## 3 Approval of Minutes from Previous Meeting(s)

### 3.1 Approval of [Minutes of 2013-04-11 Meeting#32](https://www.oasis-open.org/committees/download.php/48829/odata-meeting-32_on-20130411-minutes.html)

**Meeting minutes approved with no objections**.

##4 Review of [Action Items](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_items.php) (AI) and Progress [AIH]

Context:
> See the "[List of Open Action Items Before the Meeting][AI_REF]" section in the appendix.

###4.1 Action items due by 2013-04-18 (end of day)

None.

###4.2 Action items NOT due by 2013-04-18 (end of day) but MAY be ready for closure

None.

##5 Issues whose resolutions may help with the specification review  [IPH]

**Notes**:

* Issues in this section (5) may have been progressed out of sequence, but have been noted here to better group by components impacted as a service for the reader.
* There is an "[Index of Issues Processed During the Meeting][IP_REF]" section in the appendix.

###5.1 [ODATA-329](https://tools.oasis-open.org/issues/browse/ODATA-329)

ODATA-329:
: "Approve Editoral Changes" [component: OData Protocol] is **New**.

Stefan: 
>I **move** to resolve ODATA-329 as proposed. **Mike seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-329:
: "Approve Editoral Changes" [component: OData Protocol] is **Resolved** with no objections.

###5.2 [ODATA-224](https://tools.oasis-open.org/issues/browse/ODATA-224)

ODATA-224:
: "Fill out Capabilities sections of an OData Service" [components: OData URL Conventions, OData ATOM Format, OData ABNF Construction Rules, OData CSDL, OData Batch Processing Format, OData Extension for JSON Data, OData Extension for Data Aggregation, OData Extension for XML Data, OData Extension for Temporal Data, OData Protocol, OData JSON Format] is **New**.

Stefan: 
>I **move** to resolve ODATA-224 as proposed. **Mike seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-224:
: "Fill out Capabilities sections of an OData Service" [components: OData URL Conventions, OData ATOM Format, OData ABNF Construction Rules, OData CSDL, OData Batch Processing Format, OData Extension for JSON Data, OData Extension for Data Aggregation, OData Extension for XML Data, OData Extension for Temporal Data, OData Protocol, OData JSON Format] is **Resolved** with no objections.

###5.3 [ODATA-324](https://tools.oasis-open.org/issues/browse/ODATA-324)

ODATA-324:
: "Support external metadata references in payload" [components: OData JSON Format, OData ATOM Format, OData Protocol] is **New**.

Martin: 
>I **move** to resolve ODATA-324 as proposed. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-324:
: "Support external metadata references in payload" [components: OData JSON Format, OData ATOM Format, OData Protocol] is **Resolved** with no objections.

###5.4 [ODATA-322](https://tools.oasis-open.org/issues/browse/ODATA-322)

ODATA-322:
: "Define how nested service documents are supported" [components: OData JSON Format, OData ATOM Format, OData Protocol] is **New**.

Martin: 
>I **move** to resolve ODATA-322 as proposed. **Ralf seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-322:
: "Define how nested service documents are supported" [components: OData JSON Format, OData ATOM Format, OData Protocol] is **Resolved** with no objections.

###5.5 [ODATA-348](https://tools.oasis-open.org/issues/browse/ODATA-348)

ODATA-348:
: "Require the use of &lt;edmx:Include&gt; to pull in specific namespaces from &lt;edmx:Reference&gt;" [component: OData CSDL] is **New**.

Martin: 
>I **move** to resolve ODATA-348 as proposed. **Ralf seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-348:
: "Require the use of &lt;edmx:Include&gt; to pull in specific namespaces from &lt;edmx:Reference&gt;" [component: OData CSDL] is **Resolved** with no objections.

###5.6 [ODATA-328](https://tools.oasis-open.org/issues/browse/ODATA-328)

ODATA-328:
: "Remove MinDataServiceVersion (OData-MinVersion)" [component: OData Protocol] is **New**.

Mike: 
>I **move** to resolve ODATA-328 as proposed. **Hubert seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-328:
: "Remove MinDataServiceVersion (OData-MinVersion)" [component: OData Protocol] is **Resolved** with no objections.

###5.7 [ODATA-327](https://tools.oasis-open.org/issues/browse/ODATA-327)

ODATA-327:
: "Service MUST only return async if return-async is specified" [component: OData Protocol] is **New**.

Mike: 
>I **move** to resolve ODATA-327 as proposed. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-327:
: "Service MUST only return async if return-async is specified" [component: OData Protocol] is **Resolved** with no objections.


###5.8 [ODATA-352](https://tools.oasis-open.org/issues/browse/ODATA-352)

ODATA-352:
: "Part II: Review results for OData JSON Format Version 4.0 " [component: OData JSON Format] is **New**.

Stefan: 
>I **move** to resolve ODATA-352 as proposed. **Mike seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-352:
: "Part II: Review results for OData JSON Format Version 4.0 " [component: OData JSON Format] is **Resolved** with no objections.

##6 Specification review

Note:
> A link to an online meeting (to collectively review documents) will be provided in the chat room during the meeting.

###6.1 Review OData JSON Format Version 4.0

Context:
> Latest revision in Kavi of [OData JSON Format Version 4.0](https://www.oasis-open.org/committees/download.php/48589/odata-json-format-v4.0-wd01-2013-03-19.doc) has been uploaded to skydrive folder for collaborative commenting/editing. The skydrive copies will move back to become the latests revisions in Kavi after the meeting.

Discussion (continued from meeting #32 mark at section 4.4.2):

* cf. section [5.8][odata-352]


###6.2 Review OData Version 4.0 Part 1: Protocol

Context:
> Latest revision in Kavi of [OData Core Part 1: Protocol, Version 4.0](https://www.oasis-open.org/committees/download.php/48762/odata-core-v4.0-wd01-part1-protocol-current-2013-4-5MP.docx) has been uploaded to skydrive folder for collaborative commenting/editing. The skydrive copies will move back to become the latests revisions in Kavi after the meeting.

Discussion:

* Walkthrough will be continued during face to face meeting.

##7 Next Meetings

###7.1 Next TC meeting will be the 4th F2F meeting in Walldorf, Germany during April 25-26, 2013
Context:
> [Event info for Fourth Face-to-Face Meeting OASIS OData Technical Committee](https://www.oasis-open.org/apps/org/workgroup/odata/event.php?event_id=35050).

##8 AOB

None.

### Meeting adjourned on 1001 PT

# Appendices

## List of Open Action Items Before the Meeting [AI_REF]

**Retrieval time stamp**: `2013-04-18 10:45 +02:00`.

AI#0018
: "Prepare Working Draft 01 (WD01) version of OData Extension for Temporal Data" [owner: Andrew Eisenberg] is **Ongoing**

AI#0019
: "Prepare Working Draft 01 (WD01) version of OData Extension for XML Data" [owner: Andrew Eisenberg] is **Ongoing**

AI#0020
: "Prepare Working Draft 01 (WD01) version of OData Extension for JSON Data" [owner: Susan Malaika] is **Ongoing**


**Note**: The actual action item processing is documented in section [4][AIH] and subsections thereof.

## Index of Issues Processed During the Meeting [IP_REF]

**Note**: The actual issue processing is documented in sections [5][IPH]. The below index has two main parts: First come the public comments (if any), second the JIRA issues. Each list of issues is sorted by ascending issue number. Noted are the ID, the summary and the reference to the relevant subsection where the issue progression has been documented:

Public Comments:

None.

JIRA Issues:

* [ODATA-224](https://tools.oasis-open.org/issues/browse/ODATA-224) "Fill out Capabilities sections of an OData Service" [5.2][odata-224]
* [ODATA-322](https://tools.oasis-open.org/issues/browse/ODATA-322) "Define how nested service documents are supported" [5.4][odata-322]
* [ODATA-324](https://tools.oasis-open.org/issues/browse/ODATA-324) "Support external metadata references in payload" [5.3][odata-324]
* [ODATA-327](https://tools.oasis-open.org/issues/browse/ODATA-327) "Service MUST only return async if return-async is specified" [5.7][odata-327]
* [ODATA-328](https://tools.oasis-open.org/issues/browse/ODATA-328) "Remove MinDataServiceVersion (OData-MinVersion)" [5.6][odata-328]
* [ODATA-329](https://tools.oasis-open.org/issues/browse/ODATA-329) "Approve Editoral Changes" [5.1][odata-329]
* [ODATA-348](https://tools.oasis-open.org/issues/browse/ODATA-348) "Require the use of &lt;edmx:Include&gt; to pull in specific namespaces from &lt;edmx:Reference&gt;" [5.5][odata-348]
* [ODATA-352](https://tools.oasis-open.org/issues/browse/ODATA-352) "Part II: Review results for OData JSON Format Version 4.0 " [5.8][odata-352]

## Timeline Reference [TL_REF]

**Note**: Please cf. the current revision of the [TC timeline](https://www.oasis-open.org/committees/download.php/48609/TC%20Timeline%204.htm).
