#OData meeting #50, Monday,  5 Sep 2013, 0800 - 0900 PT

**Note**: For explanations of conventions and other formal aspects common to OData TC meeting minutes which are used in this document please cf. "[Formal Aspects of Meeting Minutes](https://www.oasis-open.org/committees/download.php/48109/formal-aspects-meeting-minutes-v1.html)".

Meeting chaired by Ram Jeyaraman

## 1 Roll call

### 1.1 Members Present:

        Barbara Hartel (SAP AG)
        Dale Moberg (Axway Software)
        Diane Downie (Citrix Systems)
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
        Stefan Drees (Individual)
        Susan Malaika (IBM)
        Ted Jones (Red Hat)

Quorum achieved. Details cf. [normative attendance sheet for this meeting](https://www.oasis-open.org/apps/org/workgroup/odata/event.php?event_id=34213).

## 2 Approval of Agenda

Approved.

## 3 Approval of Minutes from Previous Meeting(s)

### 3.1 Approval of [Minutes of 2013-08-15 Meeting#49](https://www.oasis-open.org/committees/download.php/50296/odata-meeting-49_on-20130815-minutes.html)

**Meeting minutes approved with no objections**.

## 4 Review of [Action Items](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_items.php) (AI) and Progress [AIH]

Context:
> See the "[List of Open Action Items Before the Meeting][AI_REF]" section in the appendix.

###4.1 Action items due by 2013-09-05 (end of day)

####4.1.1 [AI#0018](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_item.php?action_item_id=3483)

AI#0018
: "Prepare Working Draft 01 (WD01) version of OData Extension for Temporal Data" [owner: Hubert Heijkers] is **Ongoing** (Note: Due 2013-07-31)

Discussion:

* All decide to close AI#0018.

AI#0018
: "Prepare Working Draft 01 (WD01) version of OData Extension for Temporal Data" [owner: Hubert Heijkers] is **Closed** (Note: Due 2013-09-05)

####4.1.2 [AI#0019](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_item.php?action_item_id=3484)

AI#0019
: "Prepare Working Draft 01 (WD01) version of OData Extension for XML Data" [owner: Stefan Drees] is **Closed** (Note: Due 2013-09-05)

Discussion:

* Some vocabulary file has been submitted.
* Question is who wants to contribute together with Stefan.
* Mike suggests to probably open an issue targeting version 4.1 or 5.0 to follow up on the progress and collect some people supporting it
* Ken signals interest to support it!
* Ram requests more details on the expected time frame.
* Ken suggests some months as time frame.
* Stefan welcomes Ken supporting and also the time frame.
* Stefan seconds tracking through a JIRA ticket as proposed by Mike
* ALl decide to close AI0019
* All discuss if the initial push for including this Xml extension in v4.0 is somehow relaxed, so we can concentrate pushing it into v4.1
* All agree, that Stefan shall set up an issue to track the xml progress towards v4.1
* Susan suggests as discussed above that the same applies to AI0020 and a JIRA issue will take over the tracking and the work product now targets v4.1 instead of v4.0.

AI#0019
: "Prepare Working Draft 01 (WD01) version of OData Extension for XML Data" [owner: Stefan Drees] is **StatusOutgoing** (Note: Due 2013-09-05)

####4.1.3 [AI#0020](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_item.php?action_item_id=3485)

AI#0020
: "Prepare Working Draft 01 (WD01) version of OData Extension for JSON Data" [owner: Susan Malaika] is **Ongoing** (Note: Due 2013-09-05)

Note:
> For details cf. [4.1.2][ai0019] where the discussion is documented.

AI#0020
: "Prepare Working Draft 01 (WD01) version of OData Extension for JSON Data" [owner: Susan Malaika] is **Closed** (Note: Due 2013-09-05)

####4.1.4 [AI#0029](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_item.php?action_item_id=3638)

AI#0029
: "Prepare Securing Open Data" [owner: Ralf Handl] is **Ongoing** (Note: Due 2013-09-05)

Discussion:

* John summarizes the current state of the document and the planned directions for going further with the document.
* John suggests to further refine the document and enrich it with distinct examples
* Ram asks if the goal still is, to publish this document as a committee note.
* John assures that this is indeed the goal
* Ram thanks the authors for putting up the document
* All suppose, that this document wil ripen over the next months
* Ram suggests to close the action item, as the document will grow regardless of the action item and we did not do ths for other comparable documents either
* All agree

AI#0029
: "Prepare Securing Open Data" [owner: Ralf Handl] is **Closed** (Note: Due 2013-09-05)

###4.2 Action items NOT due by 2013-09-05 (end of day) but MAY be ready for closure

None.

##5 Advancing to Candidate OASIS Standard

###5.1 Statements of Use

Context:
> We need at least **three** Statements of Use before we can advance OData v4.0 to Candidate OASIS Standard. Let's discuss who can provide these Statements of Use and when we can expect them.

Discussion has been collected in following subsection.

###5.2 [Timeline][TL_REF] and Statements of Use

Context:
> In order to produce v4.0 OASIS Standard by end of this year, we need these Statements of Use no later than September 15.

Discussion:

* Mike states, that Microsoft is in the process of updating the version 3 toolchain
* Mike further details the excemptions from compliance with highest level for the upcoming client product
* All are positive about the progress reported
* Hubert states details on another candidate implementation at IBM that might fulfill the statement of use conditions
* Mike clarifies that a statement of use targets an implementation and not necessarily a product including release dates
* Hubert further indicates some details on the levels of detail for the conformance targeted with respect to version 4.
* Stefan emphasizes two points from Mike: Impementations not necesarily products are needed (thus no release dates needed) and a service implementation ov Open Data v4 needs only deal witht eg. the data types it offers, so if no Geo type for instance offered in the model, then no need to deal with those to be conforming.
* John seconds this view and adds, that he will issue a statement of use for the service, but needs still some OK now requested for about a week.
* Mike asks for some additional details on the publicly reachable service that acts as a candidate for the OData v4 statement of use pool.
* John and Mike will continue to discuss these details through private mail
* Ram summarizes, that we look forward to three statements of use to be ready before the 15th of September and asks if there are further statements of us available
* Ken reports about student projects currently building version 4.0 projects but unfortunately these will not meet the targets in our timeline
* Ken also states  [another service currently implementing ODatav3](http://kenb.ccs.neu.edu:7968) but maybe upgradeable to v4 but unsure about the timeline. This endpoint gives OData access to Wikipedia, among other sites, which are some of the most popular websites, but it is not v4 compliant or even complete for its version.
* Barbara states, that SAP is looking into what to report as statement but fears, that 15th of September might be too early
* Ralf adds further implementation projects inside SAP, but also mentions possibly being able to issue a statement of use in October
* All discuss the scenarios (in short) in relation to minimal conformance levels as specified
* Ram summarizes the discussion and kindly suggests, to possibly issue incremental statements of use instead of waiting until full conformance is reached
* Ted states that Red Had definitely intends to implement it but the timeline is not yet decided
* All discuss, how to count statements of use, if these share common libraries and where to draw the line between base libraries (unspecific to OData) and those specific to OData
* Martin states, that a library has been developed at SAP to generate the vocabularies needed fully compliant to version 4.0 and asks, if there might be a client project out there, that could evaluate as an interop like test, that these files are valid.
* Ralf adds on that, that in his group parts of CSDL have been implemented compliantly and thus this would be also a candidate for a statement of use
* All are positive about meeting the conditions of progressing to standard


##6 Publishing What's New in OData Version 4.0 Committee Note

###6.1 Status Update

Context:
> Ticket has been submitted to the TC admin; it is in the queue for publication soon.

Discussion:

* Ram shortly summarizes that this might be completed in the next weeks

Discussion on another but related topic (publications, packages and versions):

* Ralf kindly asks, if it would be better to only provide one document as Errata work product for all core parts and related artefacts (where the relation would be matched on a chapter per workproduct level).
* All agree to maintain the addressing on a per chapter level instead of dispersing  per artifact.

##7 OData Extension for Data Aggregation

###7.1 Status of Public Review

Context:
> Currently in first public review ending 19th September 2013. No public comments yet.

Discussion:

* Ram summarizes the current state
* Mike states that there will be some feedback from Microsoft but of course through JIRA tickets
* Stefan states, that it is indeed intended to enter comments from companies with members in the committee directly into JIRA instead of adding the additional overhead of handling public comments

## 8 Next Meetings

### 8.1 Meeting on 2013-09-12 by Call during 0800-0900 PT

Agreed.

## 9 AOB

None.

Meeting adjourned on 0901 PT

## List of Open Action Items Before the Meeting [AI_REF]

**Retrieval time stamp**: `2013-09-05 15:51 +02:00`.

AI#0018
: "Prepare Working Draft 01 (WD01) version of OData Extension for Temporal Data" [owner: Hubert Heijkers] is **Ongoing** (Note: Due 2013-09-05)

AI#0019
: "Prepare Working Draft 01 (WD01) version of OData Extension for XML Data" [owner: Stefan Drees] is **Ongoing** (Note: Due 2013-09-05)

AI#0020
: "Prepare Working Draft 01 (WD01) version of OData Extension for JSON Data" [owner: Susan Malaika] is **Ongoing** (Note: Due 2013-09-05)

AI#0029
: "Prepare Securing Open Data" [owner: Ralf Handl] is **Ongoing** (Note: Due 2013-09-05)

**Note**: The actual action item processing is documented in section [4][AIH] and subsections thereof.

## Index of Issues Processed During the Meeting [IP_REF]

**Note**: Due to elapsed time no issue processing took place during the meeting.


## Timeline Reference [TL_REF]

**Note**: Please cf. the current revision of the [TC timeline](https://www.oasis-open.org/committees/download.php/49178/TC%20Timeline%205.htm).


