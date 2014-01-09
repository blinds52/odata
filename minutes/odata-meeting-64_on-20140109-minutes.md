#OData meeting #64, Thursday,  09 Jan 2014, 0700 - 0900 PT

**Note**: For explanations of conventions and other formal aspects common to OData TC meeting minutes which are used in this document please cf. "[Formal Aspects of Meeting Minutes](https://www.oasis-open.org/committees/download.php/48109/formal-aspects-meeting-minutes-v1.html)".

Meeting chaired by Ram Jeyaraman

## 1 Roll call

### 1.1 Members Present:

        Diane Downie (Citrix Systems)
        Edmond Bourne (BlackBerry)
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
        Stefan Drees (Individual)
        Susan Malaika (IBM)
        Ted Jones (Red Hat)

Quorum achieved. Details cf. [normative attendance sheet for this meeting](https://www.oasis-open.org/apps/org/workgroup/odata/event.php?event_id=36523).

## 2 Approval of Agenda

Approved.

## 3 Approval of Minutes from Previous Meeting(s)

### 3.1 Approval of [Minutes of 2013-12-19 Meeting#63](https://www.oasis-open.org/committees/download.php/51823/odata-meeting-63_on-20131219-minutes.html)

**Meeting minutes approved as published with no objections**.

## 4 Review of [Action Items](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_items.php) (AI) and Progress [AIH]

Context:
> See the "[List of Open Action Items Before the Meeting][AI_REF]" section in the appendix.

###4.1 Action items due by 2014-01-09 (end of day)

None.

###4.2 Action items NOT due by 2014-01-09 (end of day) but MAY be ready for closure

None.

## 5 OData Extension for Data Aggregation

Let's discuss any remaining changes before we advance to Committee Specification Draft 02.

### 5.1 Review of [Issues List](https://tools.oasis-open.org/issues/secure/IssueNavigator.jspa?reset=true&mode=hide&pid=10103&sorter/field=issuekey&sorter/order=ASC) (IL) and Progress [IPH]

**Notes**:

* Issues in this section (5.1) may have been progressed out of sequence, but have been noted here to better group by components impacted or state before the meeting and as a service for the reader.
* There is an "[Index of Issues Processed During the Meeting][IP_REF]" section in the appendix.

#### 5.1.1 CS02 issues

##### 5.1.1.1 [ODATA-575](https://tools.oasis-open.org/issues/browse/ODATA-575)

ODATA-575:
: "Rationalize vocabulary and other editorial changes" [component: OData Extension for Data Aggregation] is **Applied**.

Discussion:

* Ralf summarizes the application of the resolution

Stefan:
>I **move** to close ODATA-575 as applied. **Mike seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-575:
: "Rationalize vocabulary and other editorial changes" [component: OData Extension for Data Aggregation] is **Closed** with no objections.

##### 5.1.1.2 [ODATA-577](https://tools.oasis-open.org/issues/browse/ODATA-577)

ODATA-577:
: "Do we need a way to distinguish between properties that are omitted due to being aggregated away versus those that don't apply (i.e., in a concatenated result)?" [component: OData Extension for Data Aggregation] is **New**.

Discussion:

* Ralf summarizes the issue and the proposal to not add (as indicated in the issue)

Mike:
>I **move** we close ODATA-577 with no action. **Ralf seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-577:
: "Do we need a way to distinguish between properties that are omitted due to being aggregated away versus those that don't apply (i.e., in a concatenated result)?" [component: OData Extension for Data Aggregation] is **Closed** with no objections.

##### 5.1.1.3 [ODATA-576](https://tools.oasis-open.org/issues/browse/ODATA-576)

ODATA-576:
: "Aggregation: Can we find a better way to represent nested expands?" [component: OData Extension for Data Aggregation] is **New**.

Discussion:

* Ralf summarizes the issue and reminds, that these changes have already been applied in ODATA-575.

Stefan:
>I **move** to resolve ODATA-576 as proposed. **Ralf seconds**.

**No further discussion**. **No objections**. The **motion passes**.

Stefan:
>I **move** to close ODATA-576 as applied. **MemberY seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-576:
: "Aggregation: Can we find a better way to represent nested expands?" [component: OData Extension for Data Aggregation] is **Closed** with no objections.

##### 5.1.1.4 [ODATA-581](https://tools.oasis-open.org/issues/browse/ODATA-581)

ODATA-581:
: "Remove parameterless aggregate() transformation" [component: OData Extension for Data Aggregation] is **New**.

Discussion:

* Mike summarizes the issue and reminds, that these changes have already been applied to the currend revision.

Ralf:
>I **move** to resolve ODATA-581 as proposed. **Mike seconds**.

**No further discussion**. **No objections**. The **motion passes**.

Ralf:
>I **move** to close ODATA-581 as applied. **Martin seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-581:
: "Remove parameterless aggregate() transformation" [component: OData Extension for Data Aggregation] is **Closed** with no objections.

##### 5.1.1.5 [ODATA-582](https://tools.oasis-open.org/issues/browse/ODATA-582)

ODATA-582:
: "Simplify custom aggregate term" [component: OData Extension for Data Aggregation] is **New**.

Discussion:

* Mike summarizes the issue and reminds, that these changes have already been applied to the currend revision.

Mike:
>I **move** we resolved ODATA-582 as proposed. **Martin seconds**.

**No further discussion**. **No objections**. The **motion passes**.

Ralf:
>I **move** to close ODATA-582 as applied. **Martin seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-582:
: "Simplify custom aggregate term" [component: OData Extension for Data Aggregation] is **Closed** with no objections.

##### 5.1.1.6 [ODATA-583](https://tools.oasis-open.org/issues/browse/ODATA-583)

ODATA-583:
: "Clarify intentions around implied ordering of input set to aggregation transformations" [component: OData Extension for Data Aggregation] is **New**.

Discussion:

* Mike summarizes the issue and reminds, that these changes have already been applied to the currend revision.

Martin:
>I **move** we resolved ODATA-583 as proposed. **Mike seconds**.

**No further discussion**. **No objections**. The **motion passes**.

Ralf:
>I **move** to close ODATA-583 as applied. **Martin seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-583:
: "Clarify intentions around implied ordering of input set to aggregation transformations" [component: OData Extension for Data Aggregation] is **Closed** with no objections.

##### 5.1.1.7 [ODATA-584](https://tools.oasis-open.org/issues/browse/ODATA-584)

ODATA-584:
: "Change the name of the 'AllPropertiesSupported' property of the 'ApplySupported' term to something more meaningful" [component: OData Extension for Data Aggregation] is **New**.

Discussion:

* Mike summarizes the issue and reminds, that these changes have already been applied to the currend revision.
* All discuss an example and Ralf updates the example during the meeting
* Example before was:

        <EntityContainer Name="SalesData">
            <Annotation Term="Aggregation.ApplySupported">
                <Record>
                    <PropertyValue Property="PropertyRestrictions"/>
                </Record>
            </Annotation>
            <EntitySet Name="Sales" EntityType="SalesModel.Sales" />
            <EntitySet Name="Currencies" EntityType="SalesModel.Currency" />
        </EntityContainer>

* Example now is:

        <EntityContainer Name="SalesData">
            <Annotation Term="Aggregation.ApplySupported">
                <Record>
                    <PropertyValue Property="PropertyRestrictions" Bool="true" />
                </Record>
            </Annotation>
            <EntitySet Name="Sales" EntityType="SalesModel.Sales" />
            <EntitySet Name="Currencies" EntityType="SalesModel.Currency" />
        </EntityContainer>

Ralf:
>I **move** to resolve ODATA-583 as proposed. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

Stefan:
>I **move** to close ODATA-584 as applied during the meeting. **Ralf seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-584:
: "Change the name of the 'AllPropertiesSupported' property of the 'ApplySupported' term to something more meaningful" [component: OData Extension for Data Aggregation] is **Closed** with no objections.

######5.1.1.7.1 End of Issue Processing [eoip]

Note:
>All issues scheduled for processing have been processed.

### 5.2 Approval of CSD02 and start 15-day public review

MemberX:
>I **move** that the TC approve OData Extension for Data Aggregation Version 4.0 Working Draft 02 and all associated artifacts packaged together in [https://www.oasis-open.org/committees/download.php/51902/odata-data-aggregation-ext-v4.0-wd02-2014-01-09-b.zip](https://www.oasis-open.org/committees/download.php/51902/odata-data-aggregation-ext-v4.0-wd02-2014-01-09-b.zip) as Committee Specification Draft 02 and designate Microsoft Word version of the specification as authoritative. Further, I **move** that the TC approve submitting OData Extension for Data Aggregation Version 4.0 Committee Specification Draft 02 for 15 days of public review. **Diane seconds**.

**No further discussion**. **No objections**. The **motion passes**.

### 5.3 Timeline of OData Extension for Data Aggregation

#### 5.3.1 Dec 19:

finalize changes

#### 5.3.2 Dec 19 – Jan 8:

Review specification

#### 5.3.3 Jan 9:

Approve latest Working Draft as Committee Specification Draft 02 and request TC admin to start 15-day public review


#### 5.3.4 Jan 16 – 31:

15-day public review

#### 5.3.5 Feb 13:

Possibility of approving Committee Specification 01


## 6 General Timeline and next steps

### 6.1 Dec 2013 through Jan 27, 2014

#### 6.1.1 60-day public review

### 6.2 Feb 2014

#### 6.2.1 OASIS membership wide approval ballot (14 days)

#### 6.2.2 OASIS Standard approved


## 7. Next meetings

### 7.1 January 16, 2014 during 8-10am PT?

Discussion:

* Mike suggests that next things open are in the temporal extension which will not be ready by next week and thus thinks entering a bi-weekly schedule would be sufficient.
* Ralf thinks temporal would be worth a review on 2014-JAN-30
* All suggest to meet again 2014-JAN-30 and start walk through temporal extension.

Note:
>Next meeting will be on 2014-JAN-30.

Agreed.

Note also:
>If some urgent comments or other events enforce an earlier meeting, the chairs will invite accordingly.

Agreed.

## 8 AOB

None.

Meeting adjourned at 0857 PT.


## List of Open Action Items Before the Meeting [AI_REF]

**Retrieval time stamp**: `2014-01-09 15:33 +01:00`.

None.

**Note**: The actual action item processing is documented in section [4][AIH] and subsections thereof.

## Index of Issues Processed During the Meeting [IP_REF]

**Note**: The actual issue processing is documented in sections [5.1][IPH]. The below index has two main parts: First come the public comments (if any), second the JIRA issues. Each list of issues is sorted by ascending issue number. Noted are the ID, the summary and the reference to the relevant subsection where the issue progression has been documented:

Public Comments:

None.

JIRA Issues:

* [ODATA-575](https://tools.oasis-open.org/issues/browse/ODATA-575) "Rationalize Aggregatable Properties, Dynamic Aggregates, and floating aggregates" [5.1.1.1][odata-575]
* [ODATA-576](https://tools.oasis-open.org/issues/browse/ODATA-576) "Aggregation: Can we find a better way to represent nested expands?" [5.1.1.3][odata-576]
* [ODATA-577](https://tools.oasis-open.org/issues/browse/ODATA-577) "Do we need a way to distinguish between properties that are omitted due to being aggregated away versus those that don't apply (i.e., in a concatenated result)?" [5.1.1.2][odata-577]

* [ODATA-581](https://tools.oasis-open.org/issues/browse/ODATA-581) "Remove parameterless aggregate() transformation" [5.1.1.4][odata-581]
* [ODATA-582](https://tools.oasis-open.org/issues/browse/ODATA-582) "Simplify custom aggregate term" [5.1.1.5][odata-582]
* [ODATA-583](https://tools.oasis-open.org/issues/browse/ODATA-583) "Clarify intentions around implied ordering of input set to aggregation transformations" [5.1.1.6][odata-583]
* [ODATA-584](https://tools.oasis-open.org/issues/browse/ODATA-584) "Change the name of the 'AllPropertiesSupported' property of the 'ApplySupported' term to something more meaningful" [5.1.1.7][odata-584]

## Timeline Reference [TL_REF]

**Note**: Please cf. the current revision of the [TC timeline](https://www.oasis-open.org/committees/download.php/50823/TC%20Timeline%206.htm).

