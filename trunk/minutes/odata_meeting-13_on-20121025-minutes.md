Title:	Meeting minutes of OASIS OData TC's Conference Call #13
Date:	Thursday, 25 Oct 2012, 0800 - 0900 PT    
Author:	Stefan Drees <stefan@drees.name>  

# OData Conference Call #13, Thursday, 25 Oct 2012,  0800 - 0900 PT #

Meeting chaired by: Barbara Hartel

## 1. Roll call##
 
### 1.1 Members Present:###
 
        Andrew Eisenberg (IBM)        Barbara Hartel (SAP AG)        Dale Moberg (Axway Software)        Diane Downie (Citrix Systems)        Diane Jordan (IBM)        Farrukh Najmi (Individual)        Gerald Krause (SAP AG)        Gershon Janssen (Individual)        Hubert Heijkers (IBM)        Jeffrey Turpin (Axway Software)        John Willson (Individual)        Ken Baclawski (Northeastern University)        Martin Zurmuehl (SAP AG)        Matthew Borges (SAP AG)        Michael Pizzo (Microsoft) a.k.a. Mike        Patrick Durusau (Individual)        Ralf Handl (SAP AG)        Ram Jeyaraman (Microsoft)        Stan Mitranic (CA Technologies)        Stefan Drees (Individual)        Susan Malaika (IBM)        Ted Jones (Red Hat)### 1.2 On Leave of Absence:###
 
        Robert Richards (Mashery)
Quorum achieved. Details cf. [normative attendance sheet for this meeting](https://www.oasis-open.org/apps/org/workgroup/odata/event.php?event_id=33458).


## 2. Approval of Agenda##

Agenda approved as published.


## 3. Approval of Minutes from Previous Meeting(s)##

### 3.1 Approval of [Minutes of 2012-10-18 Meeting#12](https://www.oasis-open.org/committees/download.php/47230/odata_meeting-12_on-20121018-minutes.html):###

**Meeting minutes approved with no objections**.


## 4. Review of [Action Items](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_items.php) (AI) and Progress##

>Context: The ownership of action items is noted `[owner: Given Family]` and as indicated by [AI-List-Tool](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_items.php) retrieved `2012-10-25 10:25 +02:00`.


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


###4.1 Action items due by 2012-10-25 (end of day)###

None. 


###4.2 Action items NOT due by 2012-10-25 but MAY be ready for closure###

None. 


##5 Timeline and next steps##

###5.1 Review of the projected Timeline [[TL_REF][TL_REF]]###

Context:
> Reminder – October 20th, 2012: TC completes end-to-end review of the core specifications and files any remaining issues. Any comments? Is the review completed?

Discussion:

* Mike states, that esp. Ralf and Martin did a lot of review work and he did some.


##6 Review of [Issues List](https://tools.oasis-open.org/issues/secure/IssueNavigator.jspa?reset=true&mode=hide&pid=10103&sorter/field=issuekey&sorter/order=ASC) (IL) and Progress##


###6.1 Applied Resolutions###

Discussion:

* Mike suggests to process these issues one by one, since he has comments on some of these.

**No further discussion**. **No objections**.


####6.1.1 OData ABNF Construction Rules####

####6.1.1.1 [ODATA-137](https://tools.oasis-open.org/issues/browse/ODATA-137)####

ODATA-137
: "Normalize percent-encoded values in URIs before applying ABNF rules" [component: OData ABNF Construction Rules] is **proposed**. 


Ralf: 
>I **move** to close ODATA-137. **Mike seconds**.


**No further discussion**. **No objections**. The **motion passes**.


ODATA-137
: "Normalize percent-encoded values in URIs before applying ABNF rules" [component: OData ABNF Construction Rules] is **applied** with no objections. 

####6.1.1.2 [ODATA-128](https://tools.oasis-open.org/issues/browse/ODATA-128)####

ODATA-128
: "Restrict scheme in OData URIs to http and https" [component: OData ABNF Construction Rules] is **proposed**. 

Discussion:

* Mike suggests a modification

**No further discussion**. **No objections**. 

ODATA-128
: "Restrict scheme in OData URIs to http and https" [component: OData ABNF Construction Rules] is **proposed** with no objections. 

####6.1.2 OData CSDL####

#####6.1.2.1 [ODATA-125](https://tools.oasis-open.org/issues/browse/ODATA-125)#####

ODATA-125
: "XML schema for Edmx wrapper constructs edmx:Edmx and edmx:DataServices" [component: OData CSDL] is **proposed**. 


Mike: 
>I **move** close OData-125 as applied. **Andrew seconds**.


**No further discussion**. **No objections**. The **motion passes**.

ODATA-125
: "XML schema for Edmx wrapper constructs edmx:Edmx and edmx:DataServices" [component: OData CSDL] is **applied** with no objections. 

####6.1.3 OData Protocol####

####6.1.3.1 [ODATA-131](https://tools.oasis-open.org/issues/browse/ODATA-131)####

ODATA-131
: "Canonical URL for media resources" [components: OData ABNF Construction Rules, OData Protocol, OData URL Conventions] is **proposed**. 

Discussion:

* Mike states he suggested modification as comment "An OData service MAY respond with 301 Moved Permanently or 307 Temporary Redirect to redirect from the canonical URL to the actual URL."


ODATA-131
: "Canonical URL for media resources" [components: OData ABNF Construction Rules, OData Protocol, OData URL Conventions] is **proposed** with no objections. 

####6.1.4 OData URL Conventions####

####6.1.4.2 [ODATA-141](https://tools.oasis-open.org/issues/browse/ODATA-141)####

ODATA-141
: "Update non-normative ABNF snippets in prose document to match normative ABNF" [component: OData URL Conventions] is **proposed**. 


Ralf: 
>I **move** to close ODATA-141. **Mike seconds**.

**No further discussion**. **No objections**. The **motion passes**.


ODATA-141
: "Update non-normative ABNF snippets in prose document to match normative ABNF" [component: OData URL Conventions] is **applied** with no objections. 

#####6.1.4.2 [ODATA-130](https://tools.oasis-open.org/issues/browse/ODATA-130)#####

ODATA-130
: "Describe canonical $metadata and $batch URLs in URL conventions" [component: OData URL Conventions] is **proposed**. 

Discussion:

* Mike states his comment "[MS-CSDL] should link to the normative reference for the spec."


ODATA-130
: "Describe canonical $metadata and $batch URLs in URL conventions" [component: OData URL Conventions] is **proposed** with no objections. 


###6.2 Issues in New and Proposed State###
####6.2.1 OData ABNF Construction Rules####

#####6.2.1.1 [ODATA-155](https://tools.oasis-open.org/issues/browse/ODATA-155)#####

ODATA-155
: "Allow functions to take properties as parameters when used in system query options" [components: OData ABNF Construction Rules, OData URL Conventions] is **new**. 

Discussion:

* Ralf summarizes
* Mike states, that he thinks the proposed solution is correct and it was a bug in the ABNF of the contributed spec; the proposed resolution was the originally intended behavior.


Ralf: 
>I **move** to resolve ODATA-155 as proposed. **John seconds**.

**No further discussion**. **No objections**. The **motion passes**.


ODATA-155
: "Allow functions to take properties as parameters when used in system query options" [components: OData ABNF Construction Rules, OData URL Conventions] is **proposed** with no objections. 

####6.2.2 OData ATOM Format####

#####6.2.2.1 [ODATA-149](https://tools.oasis-open.org/issues/browse/ODATA-149)#####

ODATA-149
: "Self-link for related and inlined feeds" [component: OData ATOM Format] is **new**. 

Discussion:

* Ralf summarizes
* Mike recaps his comment he added to the issue, that first he likes the proposal but second wants to ensure, that we do not madate what this link is, but what it represents.
* Ralf will adapt the wording to be discussed next week.


**No further discussion**. **No objections**. 


ODATA-149
: "Self-link for related and inlined feeds" [component: OData ATOM Format] is **new** with no objections. 

####6.2.3 OData CSDL####

#####6.2.3.1 [ODATA-138](https://tools.oasis-open.org/issues/browse/ODATA-138)#####

ODATA-138
: "Remove section 12 Model Functions" [component: OData CSDL] is **new**. 

Discussion:

* Ralf summarizes and adds he also wants to remove attributes only used by these functions


Mike: 
>I **move** we resolve OData-138 as proposed. **Ralf seconds**.


**No further discussion**. **No objections**. The **motion passes**.


ODATA-138
: "Remove section 12 Model Functions" [component: OData CSDL] is **proposed** with no objections. 

#####6.2.3.2 [ODATA-154](https://tools.oasis-open.org/issues/browse/ODATA-154)#####

ODATA-154
: "Specify whether <Record> constructs must provide a <PropertyValue> child element for each declared property of the record type" [component: OData CSDL] is **new**. 

Discussion:

* Ralf summarizes
* John states that, this may require a lot of data handling
* Ralf adds, that there might be some more detail needed to describe inheritance more specificly


Ralf: 
>I **move** to resolve ODATA-154 as proposed, with the discussed additional explanation for complex type inheritance. **Mike seconds**.

**No further discussion**. **No objections**. The **motion passes**.


ODATA-154
: "Specify whether <Record> constructs must provide a <PropertyValue> child element for each declared property of the record type" [component: OData CSDL] is **proposed with the aforementioned additiona explanation** with no objections. 

####6.2.4 OData JSON Format####

#####6.2.4.1 [ODATA-91](https://tools.oasis-open.org/issues/browse/ODATA-91)#####

ODATA-91
: "2.1: explicitly state which format the server will return in response to each given set of headers" [component: OData JSON Format] is **new**. 

Discussion:

* Ralf summarizes and states to better wait until a new JSON document revision is ready
* Mike aknowledges this.

**No further discussion**. **No objections**. 

ODATA-91
: "2.1: explicitly state which format the server will return in response to each given set of headers" [component: OData JSON Format] is **new** with no objections. 

####6.2.5 OData Protocol####

#####6.2.5.1 [ODATA-132](https://tools.oasis-open.org/issues/browse/ODATA-132)#####

ODATA-132
: "Support /$count in $select, $filter and $orderby" [components: OData ABNF Construction Rules, OData ATOM Format, OData JSON Format, OData Protocol, OData URL Conventions] is **new**. 

Discussion:

* Ralf summarizes
* Mike likes the idea of using $orderby etc. but asks as in his comment If we support $count in $select we need to specify how the count is returned. For example, for ATOM, is it returned as a property, a new property, an instance annotation, or using the <m:count> element. Adding it as a property has issues with the result no longer matching the type defined in metadata (which would not have count defined). Similarly for JSON, is it returned as a property, in a __metadata property, as __count, or through an instance annotation?
* Mikes second paragraph in comment: This should also be considered in conjunction with incoming aggregation proposal, as $count is a type of aggregation on the collection, and it's unclear without understanding the broader proposal whether $count should be handled differently from other aggregations. 
* Ralf thinks that these terms are to be distinguished (as brought out in preparation of the data aggregation paper)
* Mike likes the idea, but is not sure, if he likes the proposed syntax
* Ralf suggests alternate syntax handling
* Mike is ok with moving forward with supporting /$count et al.
* Hubert asks on details of interpretation when adding specific info combined with /$count

Mike: 
>I **move** we resolve odata-132 as proposed for $filter and $orderby only, and defer handling of returning the count. **Martin seconds**.

**No further discussion**. **No objections**. The **motion passes**.


ODATA-132
: "Support /$count in $select, $filter and $orderby" [components: OData ABNF Construction Rules, OData ATOM Format, OData JSON Format, OData Protocol, OData URL Conventions] is **proposed as specified in the motion** with no objections. 

#####6.2.5.2 [ODATA-36](https://tools.oasis-open.org/issues/browse/ODATA-36)#####

ODATA-36
: "Make $expand implicit if navigation properties are mentioned in $select or $aggregate" [components: OData Protocol, OData URL Conventions] is **new**. 

Discussion:

* Ralf states it needs further discussion, thus defer it to next week

**No further discussion**. **No objections**. 


ODATA-36
: "Make $expand implicit if navigation properties are mentioned in $select or $aggregate" [components: OData Protocol, OData URL Conventions] is **new** with no objections. 

#####6.2.5.3 [ODATA-129](https://tools.oasis-open.org/issues/browse/ODATA-129)#####

ODATA-129
: "Explicitly mention dynamic navigation properties in [Core]" [component: OData Protocol] is **new**. 

Discussion:

* Mike summarizes and states we do not have to vote on it now

**No further discussion**. **No objections**. 

ODATA-129
: "Explicitly mention dynamic navigation properties in [Core]" [component: OData Protocol] is **open but needs further discussion** with no objections. 

#####6.2.5.4 [ODATA-143](https://tools.oasis-open.org/issues/browse/ODATA-143)#####

ODATA-143
: "Define processing order for system query options" [component: OData Protocol] is **new**. 

Discussion:

* Ralf summarizes and also aknowledges the comment by mike on this issue
* Ralf will extract $skiptoken from this issues proposal but will file a new one accounting for skiptoken

Ralf: 
>I **move** to resolve ODATA-143 as proposed, minus $skiptoken. **Mike seconds**.


**No further discussion**. **No objections**. The **motion passes**.


ODATA-143
: "Define processing order for system query options" [component: OData Protocol] is **proposed as moved without $skiptoken** with no objections. 

#####6.2.5.5 [ODATA-145](https://tools.oasis-open.org/issues/browse/ODATA-145)#####

ODATA-145
: "Section 8.2 Define X-HTTP-Method request header" [component: OData Protocol] is **new**. 

Discussion:

* Ralf summarizes
* Mike commented on it (cf. issue)
* Hubert asks for confirmation, that any server may do, but not all are required to.
* Ralf confirms
* Mike explains the historic development to motivate the removal as mandatory request header
* Hubert notes, that shifting this to the batch, adds overhead to this
* Mike states, that this is not specific to OData but to many HTTP based protocols

Mike: 
>I **move** remove reference to X-HTTP-Method from the OData specification. The use cases for it are diminished, and clients can use $batch if/where required. **Hubert seconds**.


**No further discussion**. **No objections**. The **motion passes**.


ODATA-145
: "Section 8.2 Define X-HTTP-Method request header" [component: OData Protocol] is **proposed as proposed in motion** with no objections. 

#####6.2.5.6 [ODATA-148](https://tools.oasis-open.org/issues/browse/ODATA-148)#####

ODATA-148
: "10.3.5: Allow PUT for changing to-one or to-zero-or-one relationships between entities" [component: OData Protocol] is **new**. 

Discussion:

* Ralf summarizes
* Mike asks if the URI or the entity is returned
* Ralf states it is the URI
* Mike is fine with this behaviour 

Ralf: 
>I **move** to resolve ODATA-148 as proposed. **Mike seconds**.

**No further discussion**. **No objections**. The **motion passes**.


ODATA-148
: "10.3.5: Allow PUT for changing to-one or to-zero-or-one relationships between entities" [component: OData Protocol] is **proposed** with no objections. 

#####6.2.5.7 [ODATA-150](https://tools.oasis-open.org/issues/browse/ODATA-150)#####

ODATA-150
: "Add section 9.2.2 describing behavior if HTTP method is not allowed (HTTP 405)" [component: OData Protocol] is **new**. 

Discussion:

* Ralf summarizes


Stefan: 
>I **move** to resolve ODATA-150 as proposed. **Hubert seconds**.


**No further discussion**. **No objections**. The **motion passes**.


ODATA-150
: "Add section 9.2.2 describing behavior if HTTP method is not allowed (HTTP 405)" [component: OData Protocol] is **proposed** with no objections. 

#####6.2.5.8 [ODATA-151](https://tools.oasis-open.org/issues/browse/ODATA-151)#####

ODATA-151
: "8.2.5 If-None-Match: describe reaction to If-None-Match header in read requests" [component: OData Protocol] is **new**. 

Discussion:

* Ralf summarizes
* Hubert asks, the producer MAY but is not obliged to (no MUST)
* Ralf explains, that this is handled by the http spec and OData only rephrases this for odata but not for the get request
* Mike asks, what behaviour we want for OData in this regard?
* All agree to defer discusssion.

**No further discussion**. **No objections**. 


ODATA-151
: "8.2.5 If-None-Match: describe reaction to If-None-Match header in read requests" [component: OData Protocol] is **open** with no objections. 

####6.2.6 OData URL Conventions####

#####6.2.6.1 [ODATA-144](https://tools.oasis-open.org/issues/browse/ODATA-144)#####

ODATA-144
: "'Scoping' syntax for $select and $aggregate" [component: OData URL Conventions] is **new**. 

Skipped since alocated issue processing time is over


##7 Next meeting##

###7.1 Proposed Thursday Nov 01, 2012 0800-0900 PT###

(Holiday in parts of Germany.) Agreed. 


##8 AOB##

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
