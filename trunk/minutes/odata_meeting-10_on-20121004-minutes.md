Title:	Meeting minutes of OASIS OData TC's Conference Call #10
Date:	Thursday,  4 Oct 2012, 0800 - 0900 PT    
Author:	Stefan Drees <stefan@drees.name>  

# OData Conference Call #10, Thursday,   4 Oct 2012,  0800 - 0900 PT #

Meeting chaired by: Ram Jeyaraman and Barabara Hartel

Acting chair: Barabara Hartel

## 1. Roll call##
 
### 1.1 Members Present:###
 
        Andrew Eisenberg (IBM)        Barbara Hartel (SAP AG)        Christopher Woodruff (Perficient, Inc.)        Dale Moberg (Axway Software)        Diane Downie (Citrix Systems)        Diane Jordan (IBM)        Farrukh Najmi (Individual)        Gerald Krause (SAP AG)        Gershon Janssen (Individual)        Howard Abrams (CA Technologies)        Hubert Heijkers (IBM)        Jeffrey Turpin (Axway Software)        John Willson (Individual)        Ken Baclawski (Northeastern University)        Mark Biamonte (Progress Software)        Martin Zurmuehl (SAP AG)        Matthew Borges (SAP AG)        Michael Pizzo (Microsoft) a.k.a. Mike        Patrick Durusau (Individual)        Ralf Handl (SAP AG)        Ram Jeyaraman (Microsoft)        Robert Richards (Mashery)        Stan Mitranic (CA Technologies)        Stefan Drees (Individual)        Susan Malaika (IBM)        Ted Jones (Red Hat)
Quorum achieved. Details cf. [normative attendance sheet for this meeting](https://www.oasis-open.org/apps/org/workgroup/odata/event.php?event_id=33455).


## 2. Approval of Agenda##

Agenda approved as published.


## 3. Approval of Minutes from Previous Meeting(s)##

### 3.1 Approval of [Minutes of 2012-09-27 Meeting#9](https://www.oasis-open.org/committees/download.php/47020/odata_meeting-9_on-20120927_minutes.html):###

**Meeting minutes approved with no objections**.


## 4. Review of [Action Items](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_items.php) (AI) and Progress##

[AILT]: [Action Items](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_items.php)

>Context: The ownership of action items is noted `[owner: Given Family]` and as indicated by [AIL-Tool][AILT] retrieved `2012-10-04 11:20 +02:00`.


AI#0003
: "Come up with examples / usecases (and proposals) for open types and document annotation for JSON extensions document" [owner: Susan Malaika] is **Ongoing** (Note: Due 2012-11-05)

AI#0005
: "Come up with a first milestine for the temporal extension" [owner: Andrew Eisenberg] is **Ongoing** (Note: Due 2012-10-11)

AI#0006
: "Come up with estimate for first milestone for XML data extension" [owner: Andrew Eisenberg] is **Ongoing** (Note: Due 2012-10-11)

AI#0007
: "Come up with estimate for first milestone for JSON data extension" [owner: Susan Malaika] is **Ongoing** (Note: Due 2012-10-11)

AI#0008
: "Recording of TC meetings" [owner: Hubert Heijkers] is **Ongoing** (Note: Due 2012-11-05)

AI#0017
: "Prepare Working Draft 01 (WD01) version of OData Extension for Data Aggregation" [owner: Ralf Handl] is **Ongoing**

AI#0018
: "Prepare Working Draft 01 (WD01) version of OData Extension for Temporal Data" [owner: Andrew Eisenberg] is **Ongoing**

AI#0019
: "Prepare Working Draft 01 (WD01) version of OData Extension for XML Data" [owner: Andrew Eisenberg] is **Ongoing**

AI#0020
: "Prepare Working Draft 01 (WD01) version of OData Extension for JSON Data" [owner: Susan Malaika] is **Ongoing**
  
AI#0026
: "Detail a proposal with regard to enumerations" [owner: Mike Pizzo] is **Ongoing** (Note: Due 2012-11-15)

AI#0027
: "Merge [ODATA-BATCH] into [ODATA-CORE]" [owner: Mike Pizzo] with description "We agreed to refactor the documents, forming a core work product consisting of the OData Protocol version 1.0 specification, URL Conventions, and CSDL. The material from [ODATA-BATCH] was to be merged into [ODATA-CORE]. This work item is to track that change." is **Ongoing** (Note: Due 2012-10-10)

###4.1 Action items due by 2012-10-04 (end of day)###

None. 

###4.2 Action items NOT due by 2012-10-04 but MAY be ready for closure###

None. 


From here on acting chair: Ram Jeyaraman

##5. Next face to face meeting##

>Context: We will be meeting F2F during Nov 8-9, 2012 in Littleton, MA. Details are available at [https://www.oasis-open.org/apps/org/workgroup/odata/event.php?event_id=33706](https://www.oasis-open.org/apps/org/workgroup/odata/event.php?event_id=33706). To help with hosting the event, it would be useful to know how many will be attending in person.

Discussion:

* Ram asks for a short statement to estimate the number of participants planning to attend f2f in person or remote?

Answers (tentative) as extracted from chat trace and aggregated:

* Seven members in person: Andrew, Diane (Downie), Ken, Martin, Michael, Ralf and Ram 
2. Eleven members remotely: Christopher, Diane (Jordan), Farrukh, Gerald, Jeff, Mark, Patrick, Robert, Ted, Stan and Stefan
3. Three not sure yet: Dale, Gershon and John




##6 Review of [Issues List](https://tools.oasis-open.org/issues/secure/IssueNavigator.jspa?reset=true&mode=hide&pid=10103&sorter/field=issuekey&sorter/order=ASC) (IL) and Progress##


###6.1 Applied resolutions###

Mike: 
>I **move** we accept the applied resolutions to ODATA-166, ODATA-115, ODATA-114, ODATA-106, ODATA-101, ODATA-98, ODATA-97, ODATA-47, ODATA-46 and ODATA-45. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

####6.1.1 [ODATA-116](https://tools.oasis-open.org/issues/browse/ODATA-116)####

ODATA-116
: "ABNF rule for parameter alias" is **resolved as closed**. 


####6.1.2 [ODATA-115](https://tools.oasis-open.org/issues/browse/ODATA-115)####

ODATA-115
: "Inconsistent use of WSP in system query options" is **resolved as closed**. 

####6.1.3 [ODATA-114](https://tools.oasis-open.org/issues/browse/ODATA-114)####

ODATA-xx
: "Allow /$count path suffix also for collection properties" is **resolved as closed**. 

####6.1.4 [ODATA-106](https://tools.oasis-open.org/issues/browse/ODATA-106)####

ODATA-106
: "ValueTerms should support primitive types, complex types, and collections, but not entitytypes or collections of entitytypes" is **resolved as closed**. 

####6.1.5 [ODATA-101](https://tools.oasis-open.org/issues/browse/ODATA-101)####

ODATA-101
: "5.3 Representing a Property in a Response: the object wrapper should be named 'd'" is **resolved as closed**. 

####6.1.6 [ODATA-98](https://tools.oasis-open.org/issues/browse/ODATA-98)####

ODATA-98
: "3.8 Representing Annotations: avoid the undefined terms 'internally' and 'externally'" is **resolved as closed**. 

####6.1.7 [ODATA-78](https://tools.oasis-open.org/issues/browse/ODATA-78)####

ODATA-78
: "Allow $select to project parts of complex properties" is **resolved as closed**. 

####6.1.8 [ODATA-47](https://tools.oasis-open.org/issues/browse/ODATA-47)####

ODATA-47
: "Consistently format ABNF rules for human readability" is **resolved as closed**. 

####6.1.9 [ODATA-46](https://tools.oasis-open.org/issues/browse/ODATA-46)####

ODATA-46
: "Inconsistent use of leading and trailing slashes in URI path parts" is **resolved as closed**. 

####6.1.10 [ODATA-45](https://tools.oasis-open.org/issues/browse/ODATA-45)####

ODATA-45
: "Inconsistent use of WSP in many ABNF rules" is **resolved as closed**. 



###6.2 Issues in Open and Proposed State###

####6.2.1 ODATA-99: 3.9 Advertisement for a Function or Action: add example and refer to ABNF rules####
####6.2.1 [ODATA-99](https://tools.oasis-open.org/issues/browse/ODATA-99)####

ODATA-99
: "3.9 Advertisement for a Function or Action: add example and refer to ABNF rules" is **pending**. 

####6.2.2 [ODATA-66](https://tools.oasis-open.org/issues/browse/ODATA-66)####

Mike:
> Regarding ODATA-66, I **move** that we reject the change and not redundantly add enumeration types to the list of types supported by Collections in section 10.1 of [CSDL]. **Andrew seconds**.

Discussion of motion:

* Ralf summarizes, that the proposed change is sufficeintly clear for application.
* Mike explains, that there was the question, if enumerationTypes shall be handled inconsistently, since sometimes scalarTypes do not explcitiely list them and sometimes they do.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-66
: "10.1 Collection Types: enumeration types are missing from list of types usable with attribute notation" is **rejected**. 

####6.2.3 [ODATA-112](https://tools.oasis-open.org/issues/browse/ODATA-112) (motion pending)####

Discussion:

* Mike recaps, that he discussed with Andrew, and they both suggested to defer the motion until next f2f

**No further discussion**. **No objections**.

ODATA-112
: "DateTime[Offset]: allow 24:00[:00] in time part" is **motion pending until next f2f**. 


###6.3 Issues in New and Proposed state###


Note on moving issues to Proposed state:
> Ram suggests that issues be moved to Proposed state only when their proposals are fully defined, where the latter means, that the proposals have sufficient details in them such that the editors can apply the resolutions directly to the specification without requiring significant additional invention or interpretation. This is particularly important as we press forward and delve into deeper issues. During the TC meeting this week, as we process issues, let's review issues in Proposed state and back them out of Proposed if they don't fit this criteria.

####6.3.1 [ODATA-102](https://tools.oasis-open.org/issues/browse/ODATA-102)####

Discussion:

* Ralf states it is moved out of proposed, since there is no example for json payload.

**No further discussion**. **No objections**.

ODATA-102
: "5.4.1/2 Representing Actions/Functions Bound to Multiple Entities: add examples" is **new**. 

####6.3.2 ODATA-117: Case-sensitivity of system query options####
####6.3.2 [ODATA-117](https://tools.oasis-open.org/issues/browse/ODATA-117)####

Ralf:
> I **move** to resolve ODATA-117 as proposed. **Andrew seconds**.

Discussion of motion:

* Ralf explains that there currently is a mismatch between the spec and common systems implementing it w.r.t.case sensitivity
* Andrew mentions that there is some other issue refering to EDM primitives (ODATA-77)
* Ralf suggests to first handle ODATA-117, since ODATA-77 is only one of six list entries in ODATA-117
* Andrew states example: primitiveTypeName = ["edm."] ( "binary" / "boolean" / .
* Mike states, that the ABNF grammar per se makes defining case sensitive rules illegible since double-quoted character content is treated as case insensitive
* Ralf contributes example: primitiveTypeName = [ %x45.64.6d "." ] ; Edm.
* Ralf adds next line to ABNF example ( %x42.69.6e.61.72.79 ; Binary ...
* Ralf suggests to clarify, if we are all in favor of case sensitive, and then next to discuss, if all this has to be consistently defined as such in the ABNF
* Mike wants on the one hand a maximal readable ABNF, but on the other hand wants it to describe precisely what is valid and what not
* Ram suggests to defer
* Mike suggests, that the proposal is good, but implementation still needs discussion
* Mike thinks, that at one point in time the TC will review the application of ODATA-117 and this will be the point where the discussion may be finalized

**No further discussion**. **No objections**. The **motion passes**.

ODATA-117
: "Case-sensitivity of system query options" is **proposed**. 

Ralf suggests to jump to ODATA-77 since there is an overlap and the issue should receive the same "treatment" as ODATA-117

**No further discussion**. **No objections**.

####6.3.3 [ODATA-77](https://tools.oasis-open.org/issues/browse/ODATA-77)####

Mike:
> I **move** we approve ODATA-77 as proposed; that primitive type names are case-sensitive, initial caps. **Andrew seconds**.

Discussion of motion:

* Mike appreciates this as the right solution.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-77
: "Are Edm primitive type names case-insensitive?" is **proposed**. 

####6.3.4 [ODATA-118](https://tools.oasis-open.org/issues/browse/ODATA-118)####

Ralf:
> I **move** to resolve ODATA-118 as proposed. **Stefan seconds**.

Discussion of motion:

* Ralf summarizes, that in the schema definitions to be imported from the contribution references to Microsoft namespaces shall be migrated to oasis namespace.
* Mike mentions, that he very much favors the proposal.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-118
: "XSD references Microsoft namespaces edm/annotation and codegeneration" is **proposed**. 

####6.3.5 [ODATA-119](https://tools.oasis-open.org/issues/browse/ODATA-119)####

Mike:
> I **move** we accept ODATA-119 as proposed to add a <edm:SimpleType> element to [CSDL]. **Stefan seconds**.

Discussion of motion:

* Ralf summarizes, that OData has a lot of primitive types to explain aspects of facets as precision etc. an introduction of simple types which might be reused elsewhere would be advantageous.
* Mike states, that introduction of a SimpleType declares names and associates some attributes with it. name and baseType would be the attributes.
* Mike continues, that these SimpleTypes can then be replace matching primitiveTypes, since they can be used anywhere the latter are used currently.
* Andrew asks for an example?
* Ralf contributes example: <SimpleType Name="Char80" BaseType="Edm.String" MaxLength="80" FixedLength="true" /> 
<SimpleType Name="AmountInFInancialReportingCurrency" BaseType="Edm.Decimal" Precision="30" Scale="2" />
* Ralf explains example 1 is char(80) string, and 2nd is a decimal with precision 30 and scale 2
* Ralf states, that these names may be reused elsewhere in the model (makes it more readable and reduces the number of element "noise")
* Mike adds, we should specify, what happens if a SimpleType comes with unexpected attributes?
* Andrew asks, if the proposal is suggesting, that a comparison between Char80 and Edm.String should be prohibited?
* Mike states, that this comparison should be allowed
* Ram suggests to defer, although the issue seems to be close to resolution.

Andrew: 
> I **move** to defer. **Martin seconds**.

**No objections**. **Discussion defered**.

ODATA-119
: "Allow definition of 'simple' types that fix values for facet attributes of primitive types" is **pending**. 

####6.3.6 [ODATA-32](https://tools.oasis-open.org/issues/browse/ODATA-32)####

Discussion:

* Ralf summarizes, that it is asked to Allow adding filter expressions to expand clauses.
* Mike likes the direction that ODATA-32 suggests, thinks we can go much further, but will need more specific discussion and analysis like ODATA-36 (i.e. " Make $expand implicit if navigation properties are mentioned in $select or $aggregate")
* Ram thus suggests backing out ODATA-32 out of PROPOSED state
* Andrew asks to also describe the additions in a non-incremental way, so we do not lose simplicity over several simple additions.
* Mike seconds Andrews view point, and asks the members to keep an eye on impact of complexity in syntax and implementations of all additions
* Martin states, that in the case of ODATA-32 it does not make former usage complex, but offers those servers/clients willing to learn something "new" (like proposed) an advantage
* Ram suggests backing out and create a more concrete proposal

**No objections**. 

ODATA-32
: "Allow filtering of expanded to-many navigation properties" is **new**. 

Note:
> Time allocated for issue processing is through, thus skip to next item 7
 
 
##7 Timeline and next steps##

###7.1 Review of the projected Timeline [[TL_REF][TL_REF]]###

Barbara and Ram will monitor the progress and edit the timeline accordingly. 


##8 Next meeting##

###8.1 Proposed Thursday Oct 11, 2012 0800-0900 PT###

Agreed. 


##10 AOB##

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

