#OData Conference Call #22, Thursday, 24 Jan 2013,  0800 - 0900 PT

**Note**: For explanations of conventions and other formal aspects common to OData TC meeting minutes which are used in this document please cf. "[Formal Aspects of Meeting Minutes](https://www.oasis-open.org/committees/download.php/47885/formal-aspects-meeting-minutes-v1.html)". 

Meeting chaired by Ram Jeyaraman

## 1. Roll call
 
### 1.1 Members Present:
 
        Andrew Eisenberg (IBM)        Barbara Hartel (SAP AG)        Colleen Evans (Microsoft)        Dale Moberg (Axway Software)        Diane Downie (Citrix Systems)        Gerald Krause (SAP AG)        Hubert Heijkers (IBM)        John Willson (Individual)        Ken Baclawski (Northeastern University)        Matthew Borges (SAP AG)        Michael Pizzo (Microsoft) a.k.a. Mike        Nuno Linhares (SDL)        Patrick Durusau (Individual)        Ralf Handl (SAP AG)        Ram Jeyaraman (Microsoft)        Robert Richards (Mashery)        Stan Mitranic (CA Technologies)        Stefan Drees (Individual)        Susan Malaika (IBM)
Quorum achieved. Details cf. [normative attendance sheet for this meeting](https://www.oasis-open.org/apps/org/workgroup/odata/event.php?event_id=34181).

## 2. Approval of Agenda

Agenda approved as published. 

## 3. Approval of Minutes from Previous Meeting(s)

### 3.1 Approval of [Minutes of 2013-01-17 Meeting#21](https://www.oasis-open.org/committees/download.php/47933/odata-meeting-21_on-20130117-minutes.html):

**Meeting minutes approved with no objections**. 


## 4. Review of [Action Items](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_items.php) (AI) and Progress

###List of ongoing actions before the meeting

**Retrieval time stamp**: `2013-01-24 14:15 +01:00`.

AI#0005
: "Come up with a first milestine for the temporal extension" [owner: Andrew Eisenberg] is **Ongoing** (Note: Due 2013-01-31)

AI#0006
: "Come up with estimate for first milestone for XML data extension" [owner: Andrew Eisenberg] is **Ongoing** (Note: Due 2013-01-31)

AI#0007
: "Come up with estimate for first milestone for JSON data extension" [owner: Susan Malaika] is **Ongoing** (Note: Due 2013-01-31)

AI#0018
: "Prepare Working Draft 01 (WD01) version of OData Extension for Temporal Data" [owner: Andrew Eisenberg] is **Ongoing**

AI#0019
: "Prepare Working Draft 01 (WD01) version of OData Extension for XML Data" [owner: Andrew Eisenberg] is **Ongoing**

AI#0020
: "Prepare Working Draft 01 (WD01) version of OData Extension for JSON Data" [owner: Susan Malaika] is **Ongoing**
  

###4.1 Action items due by 2013-01-24 (end of day)

None.

###4.2 Action items NOT due by 2013-01-24 but MAY be ready for closure

None. 

##5 Review of [Issues List](https://tools.oasis-open.org/issues/secure/IssueNavigator.jspa?reset=true&mode=hide&pid=10103&sorter/field=issuekey&sorter/order=ASC) (IL) and Progress


###5.1 Issues in Applied state

####5.1.1 OData URL Conventions

#####5.1.1.1 [ODATA-183](https://tools.oasis-open.org/issues/browse/ODATA-183)

ODATA-183
: "The same navigation property should not be specified in multiple $expands" [component: OData URL Conventions] is **Applied**. 

Ralf: 
>I **move** to close ODATA-183 as applied. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-183
: "The same navigation property should not be specified in multiple $expands" [component: OData URL Conventions] is **Closed** with no objections. 

#####5.1.1.2 [ODATA-84](https://tools.oasis-open.org/issues/browse/ODATA-84)

ODATA-84
: "Define which system query options should be supported per URL pattern" [component: OData URL Conventions] is **Applied**. 

Ralf: 
>I **move** to close ODATA-84 as applied. **Andrew seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-84
: "Define which system query options should be supported per URL pattern" [component: OData URL Conventions] is **Closed** with no objections. 

#####5.1.1.3 [ODATA-71](https://tools.oasis-open.org/issues/browse/ODATA-71)

ODATA-71
: "Improve addition and subtraction Arithmetic Operators to handle time-related data types" [component: OData URL Conventions] is **Applied**. 

Ralf: 
>I **move** to close ODATA-71 as applied. **Andrew seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-71
: "Improve addition and subtraction Arithmetic Operators to handle time-related data types" [component: OData URL Conventions] is **Closed** with no objections. 

#####5.1.1.4 [ODATA-13](https://tools.oasis-open.org/issues/browse/ODATA-13)

ODATA-13
: "A function that returns the current date and time is needed" [component: OData URL Conventions] is **Applied**. 

Ralf: 
>I **move** to close ODATA-13 as applied. **Andrew seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-13
: "A function that returns the current date and time is needed" [component: OData URL Conventions] is **Closed** with no objections. 

####5.1.2 OData ATOM Format

Discussion:

* Mike asks for discussing ODATA-107 before ODATA-136 (as advertised in the agenda) in this context and Ralf seconds this.
* All agree

#####5.1.2.1 [ODATA-107](https://tools.oasis-open.org/issues/browse/ODATA-107)

ODATA-107
: "Should OData support a 'clock time' (xs:time) datatype?" [component: OData ABNF Construction Rules] is **Proposed**.

Discussion:

* Mike explains the evolution behind the issues and the proposal
* Andrew is fine with the proposal and seeks confirmation, that the planned Edm.Duration is aligned with W3C's xs:dayTimeDuration which Mike confirms.
* John suggests a notion of affectedTime, like eg. Edm.effDay or Edm.effTime
* Ralf asks, that if we do not plan to really add additional duration types, to then use Duration.
* Andrew lists the W3C XSD duration types: xs:duration, xs:dayTimeDuration and xs:yearMonthDuration
* Mike suggests, that the most probable future candidate for another duration type, that would be a yearMonthDuration and so would like to simply name Edm.dayTimeDuration into Edm.Duration as proposed

Mike: 
>I **move** we accept the proposed resolution for ODATA-107 as follows: 1) We define a new Edm.Duration type which is formatted as xs:dayTimeDuration (Ralf already applied this by adding Edm.DayTimeDuration; we would just rename this to the (simpler) "Edm.Duration"). 2) We remove Edm.Time from the OASIS specification and mark it in the URL grammar as reserved for compatibility with previous implementations (existing implementations can use it as a synonym for the new Edm.Duration). 
3) We add a new Edm.TimeOfDay which is xs:time without explicit time zone offset and without the 24:00:00 value. **Hubert seconds**.

Discussion:

* Andrew asks, if a timezone is included?

**No further discussion**. **No objections**. The **motion passes**.

ODATA-107
: "Should OData support a 'clock time' (xs:time) datatype?" [component: OData ABNF Construction Rules] is **Resolved as noted in the motion** with no objections.

#####5.1.2.2 [ODATA-136](https://tools.oasis-open.org/issues/browse/ODATA-136)

ODATA-136
: "Correct definition of Edm.Time in ATOM" [component: OData ATOM Format] is **Applied**. 

Mike: 
>I **move** we close ODATA-136 as it is now superceded by the approved ODATA-107. **Martin seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-136
: "Correct definition of Edm.Time in ATOM" [component: OData ATOM Format] is **Closed as noted in the motion** with no objections. 

####5.1.3 OData CSDL, OData URL Conventions

#####5.1.3.1 [ODATA-14](https://tools.oasis-open.org/issues/browse/ODATA-14)

ODATA-14
: "add Edm.Date to the OData primitive data types" [components: OData CSDL, OData URL Conventions] is **Applied**. 

Ralf: 
>I **move** to close ODATA-14 as applied. **Andrew seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-14
: "add Edm.Date to the OData primitive data types" [components: OData CSDL, OData URL Conventions] is **Closed** with no objections. 

#####5.1.3.2 [ODATA-11](https://tools.oasis-open.org/issues/browse/ODATA-11)

ODATA-11
: "date/time values without explicit time zones need further investigation" [components: OData CSDL, OData URL Conventions] is **Applied**. 

Discussion:

* Mike noted some missed occurences
* Ralf suggests to send the issue back into state **Resolved** until the application is fully completed.

ODATA-11
: "date/time values without explicit time zones need further investigation" [components: OData CSDL, OData URL Conventions] is **Resolved** with no objections. 

###5.2 Editorial issues

####5.2.1 OData Delta Queries [GM1]

Discussion:

* Stefan explains, that these six issues have been the result of one reading/feedback session and since then all have been applied by the editor(Mike) to the current revision of the document "[OData Delta Query Protocol Design](https://www.oasis-open.org/committees/download.php/47996/OData%20Delta%20Query%20Protocol%20Design%202013-1-23.docx)". The successful application has been acknowleged by the reporter (Stefan) inside JIRA through comments. 

Stefan: 
>I **move** to open the issues ODATA-206, ODATA-207, ODATA-208, ODATA-209, ODATA-210 and ODATA-211 as group and at once resolve the proposed resolutions as applied, thus promoting the status to Closed for every issue in that group. **Mike seconds**. 

**No further discussion**. **No objections**. The **motion passes**. 

#####5.2.1.1 [ODATA-206](https://tools.oasis-open.org/issues/browse/ODATA-206)

ODATA-206
: "Rephrasing of section Delta Links in ODQP proposal page 1/2" [component: OData Delta Queries] is **New**. 

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[5.2.1][GM1]])

ODATA-206
: "Rephrasing of section Delta Links in ODQP proposal page 1/2" [component: OData Delta Queries] is **Closed as noted in the motion in section 5.2.1** with no objections. 

#####5.2.1.2 [ODATA-207](https://tools.oasis-open.org/issues/browse/ODATA-207)

ODATA-207
: "Rephrasing of section Requesting Delta Links in ODQP proposal page 2" [component: OData Delta Queries] is **New**. 

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[5.2.1][GM1]])

ODATA-207
: "Rephrasing of section Requesting Delta Links in ODQP proposal page 2" [component: OData Delta Queries] is **Closed as noted in the motion in section 5.2.1** with no objections. 

#####5.2.1.3 [ODATA-208](https://tools.oasis-open.org/issues/browse/ODATA-208) 

ODATA-208
: "Enhancement of 'flat heterogeneous' structure definition and reference thereof in section Delta Responses inside ODQP proposal pages 3/4 (and later)" [component: OData Delta Queries] is **New**. 

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[5.2.1][GM1]])

ODATA-208
: "Enhancement of 'flat heterogeneous' structure definition and reference thereof in section Delta Responses inside ODQP proposal pages 3/4 (and later)" [component: OData Delta Queries] is **Closed as noted in the motion in section 5.2.1** with no objections. 

#####5.2.1.4 [ODATA-209](https://tools.oasis-open.org/issues/browse/ODATA-209) 

ODATA-209
: "Replace the term store by service and reduce number of triggerpoints in diagrams in section Client Interaction inside ODQP proposal pages 5/6" [component: OData Delta Queries] is **New**. 

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[5.2.1][GM1]])

ODATA-209
: "Replace the term store by service and reduce number of triggerpoints in diagrams in section Client Interaction inside ODQP proposal pages 5/6" [component: OData Delta Queries] is **Closed as noted in the motion in section 5.2.1** with no objections. 

#####5.2.1.5 [ODATA-210](https://tools.oasis-open.org/issues/browse/ODATA-210)

ODATA-210
: "Declare OData object/concept name for tombstone before its usage in Result Maintenance and ATOM format describing sections inside ODQP proposal pages 6 and later" [component: OData Delta Queries] is **New**. 

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[5.2.1][GM1]])

ODATA-210
: "Declare OData object/concept name for tombstone before its usage in Result Maintenance and ATOM format describing sections inside ODQP proposal pages 6 and later" [component: OData Delta Queries] is **Closed as noted in the motion in section 5.2.1** with no objections. 

#####5.2.1.6 [ODATA-211](https://tools.oasis-open.org/issues/browse/ODATA-211)

ODATA-211
: "Correct the sample inside section 'JSON DeltaQuery Result Example' inside ODQP proposal pages 9/10" [component: OData Delta Queries] is **New**. 

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[5.2.1][GM1]])

ODATA-211
: "Correct the sample inside section 'JSON DeltaQuery Result Example' inside ODQP proposal pages 9/10" [component: OData Delta Queries] is **Closed as noted in the motion in section 5.2.1** with no objections. 

###5.3 Issues in Proposed state (carried over from Jan 10, 2013 TC meeting)

####5.3.1 OData CSDL

#####5.3.1.1 [ODATA-194](https://tools.oasis-open.org/issues/browse/ODATA-194)

ODATA-194
: "Inside section 4.1.1 The Version Attribute, the version defined by this spec should be 4.0 and not 1.0 for the EDMX wrapper" [component: OData CSDL] is **New**. 

Mike: 
>I **move** we resolve ODATA-194 as proposed. **Ralf seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-194
: "Inside section 4.1.1 The Version Attribute, the version defined by this spec should be 4.0 and not 1.0 for the EDMX wrapper" [component: OData CSDL] is **Resolved** with no objections. 

####5.3.2 OData ABNF Construction Rules

#####5.3.2.1 [ODATA-96](https://tools.oasis-open.org/issues/browse/ODATA-96)

ODATA-96
: "Need to define semantics, serialization format, etc. for Enums" [component: OData ABNF Construction Rules] is **New**. 

Discussion:

* Mike has uploaded a relevant proposal [Supporting Enumeration Types in OData](https://www.oasis-open.org/committees/download.php/47997/Supporting%20Enumeration%20Types%20in%20OData.docx) and quickly goes through that document highlighting the main points

Mike: 
>I **move** we accept the proposal for ODATA-96 as described. **Martin seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-96
: "Need to define semantics, serialization format, etc. for Enums" [component: OData ABNF Construction Rules] is **Resolved** with no objections. 

####5.3.3 OData URL Conventions

#####5.3.3.1 [ODATA-142](https://tools.oasis-open.org/issues/browse/ODATA-142)

ODATA-142
: "Define URL functions geo.distance, geo.length, geo.intersects, and gettotaloffsetminutes" [component: OData URL Conventions] is **New**. 

Ralf: 
>I **move** to resolve ODATA-142 as proposed. **Mike seconds**.

Discussion of the motion:

* John reminds of discusions on the odata.org forums circling around precision and asks: How will the spec handle this?
* Mike suggests to handle this consistent with other type promotion issues in odata 

**No further discussion**. **No objections**. The **motion passes**. 

ODATA-142
: "Define URL functions geo.distance, geo.length, geo.intersects, and gettotaloffsetminutes" [component: OData URL Conventions] is **Resolved** with no objections. 

#####5.3.3.2 [ODATA-203](https://tools.oasis-open.org/issues/browse/ODATA-203)

ODATA-203
: "Specify Operator Precedence more clearly" [component: OData URL Conventions] is **New**. 

Ralf: 
>I **move** ODATA-203 as proposed. **Martin seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-203
: "Specify Operator Precedence more clearly" [component: OData URL Conventions] is **Resolved** with no objections. 

**Note**:
>Time slot for issue processing gone. Skip all remaining agenda sub items of 5.

##6 Next Meeting

###6.1 2013-JAN-30 and 2013-JAN-31 Third F2F meeting 09am - 06pm CET

**Context**: 
>We will be meeting F2F during Jan 30-31, 2013 in Z&uuml;rich, Switzerland. Details are available at [https://www.oasis-open.org/committees/event.php?event_id=34020](https://www.oasis-open.org/committees/event.php?event_id=34020) for the first and [http://www.oasis-open.org/committees/event.php?event_id=34021](http://www.oasis-open.org/committees/event.php?event_id=34021) for the second day.

Discussion:

* Mike asks that members please take some time to read the document (out by friday) on the new JSON format and also the base document on the analytics (also out by friday) so we can discuss it in Z&uuml;rich on the first day of the face to face meeting.
* All agree.



##7 AOB##

None. 

### Meeting adjourned on 0900 PT.


# Appendices
## Timeline Reference [TL_REF]
  
Draft timeline for OData core Work Products:

* December 2012
    + December 19, 2012
        - File all known issues on core Work Products resulting from new proposals
* January 2013
    + January 17, 2012
        - File all known issues on core Work Products resulting from extension Work Products
    + 3rd F2F meeting January 30-31, 2013 (Z&uuml;rich, Switzerland) (details: [https://www.oasis-open.org/apps/org/workgroup/odata/event.php?event_id=34020](https://www.oasis-open.org/apps/org/workgroup/odata/event.php?event_id=34020))
        - Resolve all key issues on core Work Products
        - TC agrees to a high bar for accepting new issues on core Work Products
* February 2013
    + February 7, 2013
        - Resolve all remaining issues on Core Work Products
        - Agree to advance core Work Products to Committee Specification Draft 01 (CSD01)
    + February 14, 2013
        - Editors to prepare Committee Specification Draft 01 (CSD01) of core Work Products containing resolutions to all issues
    + February 21, 2013
        - Approve Committee Specification Draft 01 (CSD01) of core Work Products and agree to start 30-day public review
* March 2013
    + March 1 through March 30
        - 30-day public review of core Work Products
        - Address public review comments on core Work Products
* April 2013
    + 4th F2F meeting (April 2-4, 2013)
        - Address public review comments on core Work Products
        - NOTE: If there are no public review comments on CSD01 AND no further substantive changes (requested by the TC) to the core Work Products, we can jump ahead to approving Committee Specification (CS)
    + April 18, 2013
        - Address all public review comments on core Work Products
        - Agree to advance core Work Products to Committee Specification Draft 02 (CSD02)
    + Leading up to April 25, 2013
        - Editors to prepare Committee Specification Draft 02 (CSD02) of core Work Products containing resolutions to all issues
    + April 25, 2013
        - Approve Committee Specification Draft 02 (CSD02) of core Work Products and agree to start 15-day public review
* May 2013
    + May 1 through 15, 2013
        - 15-day public review
    + May 23
        - Assuming there are no changes to core Work Products resulting from the preceding public review, approve Committee Specification (CS)
        - NOTE: If there are substantive changes to the core Work Products resulting from the preceding public review, we will need to extend the timeline and produce CSD03 and so on.
* Early June 2013
    + Approve Candidate OASIS Standard (COS)
* Mid-June and mid-August 2013
    + 60-day public review
* August 2013
    + OASIS Standard (OS)
 
Draft timeline for extension Work Products:

* November 29, 2012
    + Review and file issues on core Work Products resulting from extension Work Products
* January 17, 2013
    + File all known issues on core Work Products resulting from extension Work Products
* February and March 2013
    + Resolve issues on extension Work Products
* April 2-4, 2013 4th TC F2F meeting
    + Resolve issues and make progress on extension Work Products
* May 2013
    + Approve Committee Specification Draft 01 of extension Work Products (depending on progress)