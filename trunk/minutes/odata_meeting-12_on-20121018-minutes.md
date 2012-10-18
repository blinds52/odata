Title:	Meeting minutes of OASIS OData TC's Conference Call #12
Date:	Thursday, 18 Oct 2012, 0800 - 0900 PT    
Author:	Stefan Drees <stefan@drees.name>  

# OData Conference Call #12, Thursday, 18 Oct 2012,  0800 - 0900 PT #

Meeting chaired by: Ram Jeyaraman

## 1. Roll call##
 
### 1.1 Members Present:###
 
        Andrew Eisenberg (IBM)        Barbara Hartel (SAP AG)        Colleen Evans (Microsoft)        Dale Moberg (Axway Software)        Diane Downie (Citrix Systems)        Diane Jordan (IBM)        Howard Abrams (CA Technologies)        Hubert Heijkers (IBM)        Jeffrey Turpin (Axway Software)        John Willson (Individual)        Ken Baclawski (Northeastern University)        Mark Biamonte (Progress Software)        Martin Zurmuehl (SAP AG)        Matthew Borges (SAP AG)        Michael Pizzo (Microsoft) a.k.a. Mike        Ralf Handl (SAP AG)        Ram Jeyaraman (Microsoft)        Stan Mitranic (CA Technologies)        Stefan Drees (Individual)        Susan Malaika (IBM)        Ted Jones (Red Hat)### 1.2 On Leave of Absence:###
 
        Robert Richards (Mashery)
Quorum achieved. Details cf. [normative attendance sheet for this meeting](https://www.oasis-open.org/apps/org/workgroup/odata/event.php?event_id=33457).


## 2. Approval of Agenda##

Agenda approved as published.


## 3. Approval of Minutes from Previous Meeting(s)##

### 3.1 Approval of [Minutes of 2012-10-11 Meeting#11](https://www.oasis-open.org/committees/download.php/47172/odata_meeting-11_on-20121011-minutes.html):###

**Meeting minutes approved with no objections**.


## 4. Review of [Action Items](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_items.php) (AI) and Progress##

>Context: The ownership of action items is noted `[owner: Given Family]` and as indicated by [AI-List-Tool](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_items.php) retrieved `2012-10-18 15:20 +02:00`.


AI#0003
: "Come up with examples / usecases (and proposals) for open types and document annotation for JSON extensions document" [owner: Susan Malaika] is **Ongoing** (Note: Due 2012-11-05)

AI#0005
: "Come up with a first milestine for the temporal extension" [owner: Andrew Eisenberg] is **Ongoing** (Note: Due 2012-11-09)

AI#0006
: "Come up with estimate for first milestone for XML data extension" [owner: Andrew Eisenberg] is **Ongoing** (Note: Due 2012-11-09)

AI#0007
: "Come up with estimate for first milestone for JSON data extension" [owner: Susan Malaika] is **Ongoing** (Note: Due 2012-11-09)

AI#0008
: "Recording of TC meetings" [owner: Hubert Heijkers] is **Ongoing** (Note: Due 2012-11-05)

AI#0017
: "Prepare Working Draft 01 (WD01) version of OData Extension for Data Aggregation" [owner: Ralf Handl] is **Ongoing** (Note: Due 2012-11-02)

AI#0018
: "Prepare Working Draft 01 (WD01) version of OData Extension for Temporal Data" [owner: Andrew Eisenberg] is **Ongoing**

AI#0019
: "Prepare Working Draft 01 (WD01) version of OData Extension for XML Data" [owner: Andrew Eisenberg] is **Ongoing**

AI#0020
: "Prepare Working Draft 01 (WD01) version of OData Extension for JSON Data" [owner: Susan Malaika] is **Ongoing**
  
AI#0026
: "Detail a proposal with regard to enumerations" [owner: Mike Pizzo] is **Ongoing** (Note: Due 2012-11-15)


###4.1 Action items due by 2012-10-18 (end of day)###

None. 


###4.2 Action items NOT due by 2012-10-18 but MAY be ready for closure###

None. 


##5 Timeline and next steps##

###5.1 Review of the projected Timeline [[TL_REF][TL_REF]]###

Context:
> Reminder – October 20th, 2012: TC completes end-to-end review of the core specifications and files any remaining issues. Are we on track?

Discussion:

* Ralf does not expect to find more issues, since he scanned all documents
* Mike has entered all issues he found (mostly editorial changes)


##6 Review of [Issues List](https://tools.oasis-open.org/issues/secure/IssueNavigator.jspa?reset=true&mode=hide&pid=10103&sorter/field=issuekey&sorter/order=ASC) (IL) and Progress##


###6.1 Issues in New and Proposed State###

####6.1.1 OData ABNF Construction Rules####

#####6.1.1.1 [ODATA-80](https://tools.oasis-open.org/issues/browse/ODATA-80)#####

ODATA-80
: "Add ABNF rules for requests and responses in JSON" [component: OData ABNF Construction Rules] is **new**. 

Discussion:

* Ralf summarizes
* Mike likes to see the rules, that shall be added
* Ram thus suggests to embellish the proposal with more details and probably defer until face to face


**No further discussion**. **No objections**. 

ODATA-80
: "Add ABNF rules for requests and responses in JSON" [component: OData ABNF Construction Rules] is **derfered** with no objections. 


####6.1.2 OData CSDL####

#####6.1.2.1 [ODATA-56](https://tools.oasis-open.org/issues/browse/ODATA-56)####

ODATA-56
: "metadata:IsDefaultEntityContainer is not defined" [component: OData CSDL] is **new**. 

Discussion:

* Ralf summarizes and suggests to directly close


Ralf: 
>I **move** directly close ODATA-56. **Andrew seconds**.


**No further discussion**. **No objections**. The **motion passes**.

ODATA-56
: "metadata:IsDefaultEntityContainer is not defined" [component: OData CSDL] is **closed** with no objections. 


#####6.1.2.2 [ODATA-61](https://tools.oasis-open.org/issues/browse/ODATA-61)#####

ODATA-61
: "Allow complex properties or components of complex properties as parts of a referential constraint" [component: OData CSDL] is **open**. 

Discussion:

* Ralf summarizes


Ralf: 
>I **move** resolve ODATA-61 as proposed. **Mike seconds**.


**No further discussion**. **No objections**. The **motion passes**.

ODATA-61
: "Allow complex properties or components of complex properties as parts of a referential constraint" [component: OData CSDL] is **proposed** with no objections. 


#####6.1.2.3 [ODATA-119](https://tools.oasis-open.org/issues/browse/ODATA-119)#####

ODATA-119
: "Allow definition of 'simple' types that fix values for facet attributes of primitive types" [component: OData CSDL] is **new**. 

Discussion:

* Ralf summarizes 
* Ram reminds, that there is a pending motion and asks for comments on pending motion
* Mike realized, that there is a lot more to do in this topic where he likes to see a further detailed proposal and subsequently discuss in upcoming face to face meeting
* Andrew agrees with Mike on this and adds, that there are mor clarifications needed i.e. We need to spell out the rules for comparability of the simple types with other atomic types, also allowed operations (+, -, etc.)

Mike: 
>I **move** continue to defer ODATA-119 until we have a concrete proposal. **Stefan seconds**.


**No further discussion**. **No objections**. The **motion passes**.

ODATA-119
: "Allow definition of 'simple' types that fix values for facet attributes of primitive types" [component: OData CSDL] is **defered** with no objections. 

#####6.1.2.4 [ODATA-125](https://tools.oasis-open.org/issues/browse/ODATA-125)#####

ODATA-125
: "XML schema for Edmx wrapper constructs edmx:Edmx and edmx:DataServices" [component: OData CSDL] is **new**. 

Discussion:

* Ralf summarizes


Ralf: 
>I **move** resolve ODATA-125 as proposed. **Mike seconds**.


**No further discussion**. **No objections**. The **motion passes**.

ODATA-125
: "XML schema for Edmx wrapper constructs edmx:Edmx and edmx:DataServices" [component: OData CSDL] is **proposed** with no objections. 


#####6.1.2.5 [ODATA-134](https://tools.oasis-open.org/issues/browse/ODATA-134)#####

ODATA-134
: "Multiplicity of FunctionImport ReturnType element" [component: OData CSDL] is **new**. 

Discussion:

* Ralf summarizes


Ralf: 
>I **move** resolve ODATA-134 as proposed. **Stefan seconds**.

Discussion of motion:

* Mike recaps the history of the conversion, that led to the current situation ODATA-134 now enhances


**No further discussion**. **No objections**. The **motion passes**.

ODATA-134
: "Multiplicity of FunctionImport ReturnType element" [component: OData CSDL] is **proposed** with no objections. 




####6.1.3 OData JSON Format####

#####6.1.3.1 [ODATA-93](https://tools.oasis-open.org/issues/browse/ODATA-93)#####

ODATA-93
: "3.4: add introductory paragraph" [component: OData JSON Format] is **new**. 

Discussion:

* Mark summarizes 


Mark: 
>I **move** resolve ODATA-93 as proposed. **Mike seconds**.


**No further discussion**. **No objections**. The **motion passes**.

ODATA-93
: "3.4: add introductory paragraph" [component: OData JSON Format] is **proposed** with no objections. 

Discussion:

* Ralf remarks, that before application of ODATA-93, the base document revision should be waited for as to not introduce additional work in syncing with these
* Mike agrees and suggests to keep an eye on syncing especially with the JSON format related documents

####6.1.4 OData Protocol####


#####6.1.4.1 [ODATA-103](https://tools.oasis-open.org/issues/browse/ODATA-103)#####

ODATA-103
: "5.4.1 Representing Actions Bound to Multiple Entities: specify treatment of action overloads" [component: OData Protocol] is **new**. 

Discussion:

* Mike summarizes


Mike: 
>I **move** resolve issue ODATA-103 as proposed. **Stefan seconds**.


**No further discussion**. **No objections**. The **motion passes**.

ODATA-103
: "5.4.1 Representing Actions Bound to Multiple Entities: specify treatment of action overloads" [component: OData Protocol] is **proposed** with no objections. 


#####6.1.4.2 [ODATA-130](https://tools.oasis-open.org/issues/browse/ODATA-130)#####

ODATA-130
: "Describe canonical $metadata and $batch URLs in URL conventions" [component: OData URL Conventions] is **new**. 

Discussion:

* Ralf summarizes
* Mike states, that he added text to the proposal.


Ralf: 
>I **move** resolve ODATA-130 as proposed. **Mike seconds**.


**No further discussion**. **No objections**. The **motion passes**.

ODATA-130
: "Describe canonical $metadata and $batch URLs in URL conventions" [component: OData URL Conventions] is **proposed** with no objections. 



##7 Next meeting##

###7.1 Proposed Thursday Oct 25, 2012 0800-0900 PT###

Agreed. 


##8 AOB##

* Mike encourages members to take the next couple of days to really go through all available base documents, so that we enter the face to face well prepared and may thus resolve a maximum of issues/questions there.

### Meeting adjourned on 0835 PT.###


# Appendices#
## Timeline Reference [TL_REF] ##
 
Here is a rough draft of a timeline for the OData core specifications:

* 2012-OCT-20
	* TC completes end-to-end review of the core specifications and files any remaining issues
* 2012-NOV-08 - 2012-NOV-09 2nd F2F meeting (Littleton, MA)
	*  Discuss proposals and resolve issues
* Committee Specification Draft 01
* 30-day public review
* Committee Specification Draft 02
* 15-day public review
* Committee Specification
* Candidate OASIS Standard
* 60-day public review
* OASIS Standard

The timeline for the OData extension specifications is TBD.
