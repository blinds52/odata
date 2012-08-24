Title:	Meeting minutes of OASIS OData TC's Conference Call #3
Date:	Thursday, 16 Aug 2012, 0800 - 0900 PT    
Author:	Stefan Drees <stefan@drees.name>  

#OData Conference Call #3, Thursday,  16 Aug 2012,  0800 - 0900 PT #

## 1. Roll call##
 
### 1.1 Members Present:###
 
        Andrew Eisenberg (IBM)        Anil Kumar (CA Technologies)        Christopher Woodruff (Perficient, Inc.)        Dale Moberg (Axway Software)        Diane Jordan (IBM)        Farrukh Najmi (Wellfleet Software Corporation)        Gerald Krause (SAP AG)        Giovanni Bartolomeo (Individual)        Howard Abrams (CA Technologies)        John Willson (Individual)        John Wilmes (Individual)        Ken Baclawski (Northeastern University)        Mark Biamonte (Progress Software)        Martin Zurmuehl (SAP AG)        Matthew Borges (SAP AG)        Michael Pizzo (Microsoft)        Pablo Castro (Microsoft)        Patrick Durusau (Individual)        Ralf Handl (SAP AG)        Ram Jeyaraman (Microsoft)        Robert Richards (Mashery)        Sanjay Patil (SAP AG)        Shishir Pardikar (Citrix Systems)        Stan Mitranic (CA Technologies)        Stefan Drees (Individual)        Susan Malaika (IBM)        Ted Jones (Red Hat)

### 1.2 On Leave of Absense:###
        Barbara Hartel (SAP AG)        Colleen Evans (Microsoft)        Hubert Heijkers (IBM)

Quorum achieved. Details cf. [normative attendance sheet for this meeting](https://www.oasis-open.org/apps/org/workgroup/odata/event.php?event_id=33448).


## 2. Approval of Agenda##

Agenda approved as published.


## 3. Appointment of Secretary##

### 3.1 Nominations###

[Stefan Drees (Individual)](https://lists.oasis-open.org/archives/odata/201208/msg00076.html ):

**No other nominations**. **No objections**, Stefan Drees is now accepted as secretary of the TC.


## 4. Approval of Minutes from Previous Meeting(s)##

### 4.1 Approval of [Minutes of 2012-08-09 Meeting#2](https://www.oasis-open.org/committees/document.php?document_id=46659&wg_abbrev=odata):###

Meeting minutes approved with no objections.


## 5. Review of [Action Items](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_items.php) (AI) and Progress##

AI#0002
: "Start electronic ballot to find out which dates work best for next f2f" is **Closed** as __completed__ with no objections

AI#0003
: "Come up with examples / usecases (and proposals) for open types and document annotation for JSON extensions document" is **Ongoing**

AI#0004
: "Come up with estimate for first milestone for data aggregation extension" is **Ongoing**

AI#0005
: "Come up with a first milestine for the temporal extension" is **Ongoing**

AI#0006
: "Come up with estimate for first milestone for XML data extension" is **Ongoing**

AI#0007
: "Come up with estimate for first milestone for JSON data extension" is **Ongoing**

AI#0008
: "Recording of TC meetings" is **Ongoing**

AI#0009
: "Best practices document for issue handling" is **Ongoing**

AI#0010
: "Prepare Working Draft 01 (WD01) version of OData protocol specification" is **Ongoing**

AI#0011
: "Prepare Working Draft 01 (WD01) version of OData CSDL specification" is **Ongoing**

AI#0012
: "Prepare Working Draft 01 (WD01) version of OData OData ABNF Construction Rules specification" is **Ongoing**

AI#0013
: "Prepare Working Draft 01 (WD01) version of OData URL Conventions" is **Ongoing**

AI#0014
: "Prepare Working Draft 01 (WD01) version of OData Batch Processing Format" is **Ongoing**

AI#0015
: "Prepare Working Draft 01 (WD01) version of OData Atom Format" is **Ongoing**

AI#0016
: "Prepare Working Draft 01 (WD01) version of OData JSON Format" is **Ongoing**

AI#0017
: "Prepare Working Draft 01 (WD01) version of OData Extension for Data Aggregation" is **Ongoing**

AI#0018
: "Prepare Working Draft 01 (WD01) version of OData Extension for Temporal Data" is **Ongoing**

AI#0019
: "Prepare Working Draft 01 (WD01) version of OData Extension for XML Data" is **Ongoing**

AI#0020
: "Prepare Working Draft 01 (WD01) version of OData Extension for JSON Data" is **Ongoing**

AI#0021
: "Chairs to discuss with and provide tools to editors to help with specification versioning" is **Ongoing**

Ram suggests, that if action items shall be closed in future meetings, this should be prepared and announced by email well before the meeting.

## 6. [Press Release](https://www.oasis-open.org/apps/org/workgroup/odata/email/archives/201208/msg00024.html) (PR) to announce OASIS OData TC##

### 6.1. Note: ###

Last date for providing quotes (by Sponsor-level members) is Aug 17.

Discussion to ensure that all supporters also show their support by contributing the respective quotes to the press release.

Michael informs, that the process for providing quote is to reply to Carol's email (referenced in the Agenda email) with the quote (75 words or less), company, and attribution by EOD Friday, August 17th.

## 7. Review of [Issues List](https://tools.oasis-open.org/issues/secure/IssueNavigator.jspa?sorter/field=issuekey&sorter/order=ASC) (IL) and Progress##

ODATA-1
: "ABNF rule for GUID"	 

ODATA-2
: "Rules for error message inconsistent to Atom document"	

ODATA-3
: "Use CQL standard for query instead of odata-specific filter query protocol"	 

ODATA-4
: "Allow DefaultValue facet for FunctionImport Parameter"	 

ODATA-5
: "Allow Collection(ComplexType) and Collection(PrimitiveType) for Type attribute of ValueTerm"	 

ODATA-6
: "Use Content-Type: application/json in responses to requests with MaxDataServiceVersion: 2.0"

ODATA-7
: "Minor editorial changes to contribution during import into OASIS template"	

ODATA-8
: "Referenced RFC4646 (has inconsistency in entry) and should be replaced by RFC5646, since the latter obsoleted the former since September 2009"

ODATA-9
: "allow expressions in the $select query option"

ODATA-10
: "operator that returns the content of a Stream as either a String or Binary value"	 

ODATA-11
: "date/time values without explicit time zones need further investigation"
 
ODATA-12
: "create a data type for property names"

ODATA-13
: "A function that returns the current date and time is needed"

ODATA-14
: "add Edm.Date to the OData primitive data types"

ODATA-15
: "precision for functions that have Edm.DateTime or Edm.DateTimeOffset parameters"

ODATA-16
: "allow functions to apply to entity sets of any entity type"
 
ODATA-17
: "Define which DataServiceVersion this specification defines: 3.0 or 4.0."

Ram asks if there is any reason to not accept all open issues in new state as open. Although some have no proposed resolution, it should not hinder the group to accept them.

Michael opposes to accept them all at once, but fears, that meeting time does not allow for visiting them one by one. He thus suggests to revisit these in the telco next week.

Postpone accepted by the group.

###7.1. Review Lifecycle and [Best Practices](https://www.oasis-open.org/committees/download.php/46690/Best%20Practices%20for%20Issue%20Handling%20v4.docx) for Issues###

Ralf suggested [Best Practices for Issue Handling Version 4](https://www.oasis-open.org/committees/download.php/46690/Best%20Practices%20for%20Issue%20Handling%20v4.docx) before the meeting.

Discussion centers primarily around:

New: ... 2. Issue SHOULD contain a concrete proposal on how to solve the issue. 3. New issues are discussed in TC meetings and either opened (accepted by the TC) or closed (not accepted by TC) by the editors.


Ralf (in answering a question from Michael with regard to the 2. statement under New) ensures, that the requirements wording as  "SHOULD" has been selected on purpose, to enable submitters to file issues, even when they themselves do not have an initial solution directly at hand.

Diane suggests rewording the 3. statement under New along the lines of
> New issues are discussed in TC meetings and either opened (accepted by the TC) or closed (not accepted by TC). Based on TC decision they will be opened or closed by the editors.

Diane: 
>I **move** to change the document accordingly. **Michael seconds**.

**No further discussion**. **No objections**. The **motion passes**.

New (third statement changed to)
: ... 3. New issues are discussed in TC meetings and either opened (accepted by the TC) or closed (not accepted by TC) by the editors

[*Update*: Ralf has updated document accordingly short after the meeting [Version 5](https://www.oasis-open.org/committees/download.php/46694/Best%20Practices%20for%20Issue%20Handling%20v5.docx).]

Farrukh suggests that the state of "Accepted" instead of "Open" would be better. The reason is that JIRA already has a meaning for an issue to be "OPEN"

Ram:
>Is there any objection to adopt the lifecycle of issues document?

**No objections**. The document is adopted.

###7.2. Issues ripe for resolution? ###

####7.2.1 [ODATA-7](https://tools.oasis-open.org/issues/browse/ODATA-7)####

ODATA-7
: "Minor editorial changes to contribution during import into OASIS template"	is **Closed** as __completed__ with no objections. (**Michael moved**, **Martin seconded**.)

**No objections**. **Motion passed**.

####7.2.2 [ODATA-8](https://tools.oasis-open.org/issues/browse/ODATA-8)####

ODATA-8
: "Referenced RFC4646 (has inconsistency in entry) and should be replaced by RFC5646, since the latter obsoleted the former since September 2009" is **Closed** as __completed__ with no objections. (**Stefan moved**, **Chris seconded**.)

**No objections**. **Motion passed**.

###7.3. Discussion on the [question raised by Giovanni](https://lists.oasis-open.org/archives/odata/201208/msg00012.html)###

Giovanni:
> I think that both the OData TC and W3C RDB2RDF are trying to address the same issue. RDB2RDF is an attempt to raise the level of abstraction from relational data to RDF (a model based on graphs), similarly OData does but using an entity relationship model. What they have in common is that they use HTTP and URI refs to access information and put it on the Web, the former using a RDF model and the latter using an ER model.

Pablo comments on Giovanni's question:
> Most applications of OData at the moment do not build their service interface directly on top of a database, but mostly onto some additional (federating) business logic like catalogs. He recommends to understand OData **not** as exposing databases, but exposing a more abstract business logic.

Michael:
> He sees it mostly like Pablo, and adds that 1. the vocabulary used is well separated from concrete storage models. So we expose a model, not a database. 2. ODatas data model is an entity relationship model. It is an abstract model, well separated from the more physical aspects of the realization of the server side storag. Might be a relational store, a web server, a triplet store and so on.

Ashok Malhotra (Oracle):
> The W3C Proposed Recommendations are at: [R2RML: RDB to RDF Mapping Language](http://www.w3.org/TR/2012/PR-r2rml-20120814/) and [A Direct Mapping of Relational Data to RDF](http://www.w3.org/TR/2012/PR-rdb-direct-mapping-20120814/)

Giovanni:
> States that his personal view is that app developers would benefit from having a  uniform way to access this information and the way the URI is built is an important aspect of the matter.

Chair calls in since allocated time is over. Suggests to continue and perhaps talk in next meeting again on this issue raised by Giovanni.
  
 Accepted by group.
 
###7.4. Discussion on [parsing OData ABNF from Ken](https://lists.oasis-open.org/archives/odata/201208/msg00074.html) ###

Context
: "ABNF grammar statements from the core (file "OData ABNF.markdown" inside the [ODataV3Core.zip](https://www.oasis-open.org/committees/download.php/46557/ODataV3Core.zip) archive bundle)".

Ken:
> He mentions he found 65 issues with the ABNF grammar and that he did not want to file each individually, thus sent a [message](https://lists.oasis-open.org/archives/odata/201208/msg00074.html) to mailing list. 

Michael
> Welcomes the feedback and embraces the idea of collecting the modifications induced by Ken to bundle these with the contribution from Microsoft and then submit the combined document as WD01

Ram summarizes that Ken shall open an issue outlining the ABNF-Problem and Michael and the other members will come back to it and so on.

Michael thanks Ken for submitting his work on the correctness of the grammar and wants to know how to process with the document, when not all 65 issues embedded in the issue to be submitted by Ken will be resolved at once.

Document strategy in this context will be further discussed at a later time.

##8. Next face to face meeting##

###8.1 [Electronic ballot](https://www.oasis-open.org/apps/org/workgroup/odata/ballot.php?id=2278)###

Please cast your preferences on proposed dates via the [electronic ballot](https://www.oasis-open.org/apps/org/workgroup/odata/ballot.php?id=2278) no later than Aug 20th. Also it need to be decided if the face to face should be 2 days or 3 days.


###8.2 Host for the upcoming face to face meeting### 

Andrew asks: Any volunteers? 

No one yet. In the next meeting it will be asked again for a volunteer to host the meeting.

###8.3 Venue of the upcoming face to face meeting###
    
Postponed to remain in time of the meeting.

 
## 9. Timeline and next steps##

###9.1. Review of the Timeline [[TL_REF][TL_REF]] and discussion of immediate next steps.###

Postponed to remain in time of the meeting.

## 10. Next meeting##

###10.1 Proposed Thursday Aug 23, 2012 0800-0900 PT###

Agreed.


## 11. AOB##

None.

### Meeting adjourned on 0900 PT.###


# Appendices#
## Timeline Reference [TL_REF] ##
 
Timeline (based on the F2F discussions and information we currently have)

* Aug 31
	* All the core specs (seven in total) imported to OASIS specification template.
	* All known issues on core specs have been filed
* Sept 15
	* Based on the outstanding issues, the TC will determine a reasonable timeline for the core specs.


