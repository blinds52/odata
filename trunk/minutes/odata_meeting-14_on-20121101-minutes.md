Title:	Meeting minutes of OASIS OData TC's Conference Call #14
Date:	Thursday, 01 Nov 2012, 0800 - 0900 PT    
Author:	Stefan Drees <stefan@drees.name>  

# OData Conference Call #14, Thursday, 01 Nov 2012,  0800 - 0900 PT #

Meeting chaired by: Ram Jeyaraman

## 1. Roll call##
 
### 1.1 Members Present:###
 
        Colleen Evans (Microsoft)        Dale Moberg (Axway Software)        Diane Downie (Citrix Systems)        Diane Jordan (IBM)        Gershon Janssen (Individual)        John Willson (Individual)        Ken Baclawski (Northeastern University)        Mark Biamonte (Progress Software)        Matthew Borges (SAP AG)        Michael Pizzo (Microsoft) a.k.a. Mike        Patrick Durusau (Individual)        Ralf Handl (SAP AG)        Ram Jeyaraman (Microsoft)        Robert Richards (Mashery)        Stan Mitranic (CA Technologies)        Stefan Drees (Individual)        Susan Malaika (IBM)        Ted Jones (Red Hat)
Quorum achieved. Details cf. [normative attendance sheet for this meeting](https://www.oasis-open.org/apps/org/workgroup/odata/event.php?event_id=33459).


## 2. Approval of Agenda##

Agenda approved as published.


## 3. Approval of Minutes from Previous Meeting(s)##

### 3.1 Approval of [Minutes of 2012-10-25 Meeting#12]( https://www.oasis-open.org/committees/download.php/47304/odata_meeting-13_on-20121025-minutes.html):###

**Meeting minutes approved with no objections**.


## 4. Review of [Action Items](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_items.php) (AI) and Progress##

>Context: The ownership of action items is noted `[owner: Given Family]` and as indicated by [AI-List-Tool](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_items.php) retrieved `2012-11-01 12:04 +02:00`.


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


###4.1 Action items due by 2012-11-01 (end of day)###

None.


###4.2 Action items NOT due by 2012-11-01 but MAY be ready for closure###

None.

##5 Next Meeting##

###5.1 Nov 8-9 F2F meeting in Littleton, MA, USA###

Context:
> [https://www.oasis-open.org/apps/org/workgroup/odata/event.php?event_id=33706](https://www.oasis-open.org/apps/org/workgroup/odata/event.php?event_id=33706)

###5.2 Any travel issues?###

Context:
> Any travel related isssues (resulting from the recent north american east coast storm)?

Discussion:

* None.


##6 Review of [Issues List](https://tools.oasis-open.org/issues/secure/IssueNavigator.jspa?reset=true&mode=hide&pid=10103&sorter/field=issuekey&sorter/order=ASC) (IL) and Progress##


###6.1 Applied Resolutions###

Context:
> The following issues in state proposed (from previous meetings) are now noted as applied in JIRA (as of 2012-11-01 12:05 CET):

ODATA-155
: "Allow functions to take properties as parameters when used in system query options" [components: OData ABNF Construction Rules, OData URL Conventions] is **proposed** with no objections. 

ODATA-132
: "Support /$count in $select, $filter and $orderby" [components: OData ABNF Construction Rules, OData ATOM Format, OData JSON Format, OData Protocol, OData URL Conventions] is **proposed**. 

ODATA-131
: "Canonical URL for media resources" [components: OData ABNF Construction Rules, OData Protocol, OData URL Conventions] is **proposed**. 

ODATA-128
: "Restrict scheme in OData URIs to http and https" [component: OData ABNF Construction Rules] is **proposed**. 

ODATA-130
: "Describe canonical $metadata and $batch URLs in URL conventions" [component: OData URL Conventions] is **proposed**. 


Discussion:

* Grouping all applied candidates in one motion?


Ralf: 
>I **move** to close ODATA-155, ODATA-132, ODATA-131, ODATA-130, and ODATA-128 as applied. **Hubert seconds**.

**No further discussion**. **No objections**. The **motion passes**.


ODATA-155
: "Allow functions to take properties as parameters when used in system query options" [components: OData ABNF Construction Rules, OData URL Conventions] is **applied** with no objections. 

ODATA-132
: "Support /$count in $select, $filter and $orderby" [components: OData ABNF Construction Rules, OData ATOM Format, OData JSON Format, OData Protocol, OData URL Conventions] is **applied** with no objections. 

ODATA-131
: "Canonical URL for media resources" [components: OData ABNF Construction Rules, OData Protocol, OData URL Conventions] is **applied** with no objections. 

ODATA-128
: "Restrict scheme in OData URIs to http and https" [component: OData ABNF Construction Rules] is **applied** with no objections. 

ODATA-130
: "Describe canonical $metadata and $batch URLs in URL conventions" [component: OData URL Conventions] is **applied** with no objections. 


###6.2 Issues in New and Proposed State###

####6.2.1 OData ABNF Construction Rules####

#####6.2.1.1 [ODATA-80](https://tools.oasis-open.org/issues/browse/ODATA-80)#####

ODATA-80
: "Add ABNF rules for action parameters in request bodies" [component: OData ABNF Construction Rules] is **new**. 


Ralf: 
>I **move** to resolve ODATA-80 as proposed. **Mike seconds**.


**No further discussion**. **No objections**. The **motion passes**.


ODATA-80
: "Add ABNF rules for action parameters in request bodies" [component: OData ABNF Construction Rules] is **proposed** with no objections. 


#####6.2.1.2 [ODATA-67](https://tools.oasis-open.org/issues/browse/ODATA-67)#####

ODATA-67
: "Describe representation of ReferenceTypes in requests" [component: OData ABNF Construction Rules] is **new**. 

Ralf: 
>I **move** to resolve ODATA-67 as proposed. **Mike seconds**.

**No further discussion**. **No objections**. The **motion passes**.


ODATA-67
: "Describe representation of ReferenceTypes in requests" [component: OData ABNF Construction Rules] is **proposed** with no objections. 


####6.2.2 OData ATOM Format####

#####6.2.2.1 [ODATA-149](https://tools.oasis-open.org/issues/browse/ODATA-149)#####

ODATA-149
: "Self-link for related and inlined feeds" [component: OData ATOM Format] is **new**. 

Discussion:

* Ralf summarizes the issue and the proposal

Ralf: 
>I **move** to resolve ODATA-149 as propose. **Mike seconds**.


**No further discussion**. **No objections**. The **motion passes**.


ODATA-149
: "Self-link for related and inlined feeds" [component: OData ATOM Format] is **proposed** with no objections. 

####6.2.3 OData CSDL####


#####6.2.3.1 [ODATA-62](https://tools.oasis-open.org/issues/browse/ODATA-62)#####

ODATA-62
: "Specify uniqueness of Association names within a Schema" [component: OData CSDL] is **new**. 

Discussion:

* Ralf summarizes the issue and proposal

Ralf: 
>I **move** to resolve ODATA-62 as proposed. **Stefan seconds**.


**No further discussion**. **No objections**. The **motion passes**.


ODATA-62
: "Specify uniqueness of Association names within a Schema" [component: OData CSDL] is **proposed** with no objections. 


####6.2.4 OData CSDL, OData Protocol, OData URL Conventions####

#####6.2.4.1 [ODATA-34](https://tools.oasis-open.org/issues/browse/ODATA-34)#####

ODATA-34
: "Control verbosity of $metadata response: include annotations or documentation" [components: OData CSDL, OData Protocol, OData URL Conventions] is **new**. 

Discussion:

* Ralf summarizes issue
* Mike presents proposal

Mike: 
>I **move** we resolve ODATA-34 as proposed. **John seconds**.


**No further discussion**. **No objections**. The **motion passes**.


ODATA-34
: "Control verbosity of $metadata response: include annotations or documentation" [components: OData CSDL, OData Protocol, OData URL Conventions] is **proposed** with no objections. 


####6.2.5 OData CSDL####

#####6.2.5.1 [ODATA-119](https://tools.oasis-open.org/issues/browse/ODATA-119)#####

ODATA-119
: "Allow definition of 'simple' types that fix values for facet attributes of primitive types" [component: OData CSDL] is **open**. 

Discussion:

* Mike summarizes issue and updated proposal


Mike: 
>I **move** we resolve ODATA-119 as proposed. **Ralf seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-119
: "Allow definition of 'simple' types that fix values for facet attributes of primitive types" [component: OData CSDL] is **proposed** with no objections. 


####6.2.6 OData Protocol####


#####6.2.6.1 [ODATA-151](https://tools.oasis-open.org/issues/browse/ODATA-151)#####

ODATA-151
: "8.2.5 If-None-Match: describe reaction to If-None-Match header in read requests" [component: OData Protocol] is **open**. 

Discussion:

* Ralf summarizes issue and proposal


Ralf: 
>I **move** to resolve ODATA-151 as proposed. **Stefan seconds**.

Discussion of motion:

* Mike would prefer to have a brief description

Mike: 
>I **move** that we direct the editors, in applying ODATA-151, to include a very brief description of the behavior of using If-None-Match with a GET request in lieu of simply referring to the HTTP specification. **Ralf seconds**.

**No further discussion**. **No objections**. The **amendment passes**.

**No further discussion**. **No objections**. The **amended motion passes**.

ODATA-151
: "8.2.5 If-None-Match: describe reaction to If-None-Match header in read requests" [component: OData Protocol] is **proposed as amended** with no objections. 


#####6.2.6.2 [ODATA-156](https://tools.oasis-open.org/issues/browse/ODATA-156)#####

ODATA-156
: "Describe behavior when accessing related entities" [component: OData Protocol] is **new**. 

Discussion:

* Ralf summarizes issue and proposal
* All discuss about the difference of referencing something over HTTP that does not exist versus something being empty
* Mike suggests to make proposal clearer after accepting it as proposed

Mike: 
>I **move** we accept ODATA-156 as proposed, with a deeper explanation of why 204 versus 404 is used. **Mark seconds**.


**No further discussion**. **No objections**. The **motion passes**.


ODATA-156
: "Describe behavior when accessing related entities" [component: OData Protocol] is **proposed as above** with no objections. 


#####6.2.6.3 [ODATA-110](https://tools.oasis-open.org/issues/browse/ODATA-110)#####

ODATA-110
: "Track Prefer Header in Http" [component: OData Protocol] is **new**. 

Discussion:

* Mike summarizes issue and proposal

Mike: 
>I **move** we resolve ODATA-110 as proposed. **Stefan seconds**.


**No further discussion**. **No objections**. The **motion passes**.


ODATA-110
: "Track Prefer Header in Http" [component: OData Protocol] is **proposed** with no objections. 

Note:
> Allocated time for issue processing over. All other planned items of issue processing skipped


##7 AOB##

None. 

### Meeting adjourned on 0900 PT.###


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
