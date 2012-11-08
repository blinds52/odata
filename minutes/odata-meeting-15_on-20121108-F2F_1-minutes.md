Title:	Meeting minutes of OASIS OData TC's F2F meeting in Littleton, MA, USA #15 (F2F_1)
Date:	Thursday, 08 Nov 2012, 0900 - 1800 EST    
Author:	Stefan Drees <stefan@drees.name>  

# OData F2F meeting in Littleton, MA, USA #15 F2F_1, Thursday, 08 Nov 2012,  0900 - 1800 EST #

Meeting chaired by Barabara Hartel and Ram Jeyaraman

Acting chair: Barabara Hartel

## 1. Roll call##
 
### 1.1 Members Present:###
 
        Andrew Eisenberg (IBM)        Anila Kumar GVN (CA Technologies)        Barbara Hartel (SAP AG)        Colleen Evans (Microsoft)        Dale Moberg (Axway Software)        Diane Downie (Citrix Systems)        Gerald Krause (SAP AG)        Hubert Heijkers (IBM)        Jeffrey Turpin (Axway Software)        John Willson (Individual)        Ken Baclawski (Northeastern University)        Martin Zurmuehl (SAP AG)        Matthew Borges (SAP AG)        Michael Pizzo (Microsoft) a.k.a. Mike        Ralf Handl (SAP AG)        Ram Jeyaraman (Microsoft)        Robert Richards (Mashery)        Stefan Drees (Individual)        Susan Malaika (IBM)        Ted Jones (Red Hat)
Quorum achieved. Details cf. [normative attendance sheet for this meeting](https://www.oasis-open.org/apps/org/workgroup/odata/event.php?event_id=33706).


## 2. Approval of Agenda##

Review and make necessary adjustments to the [draft agenda](https://www.oasis-open.org/apps/org/workgroup/odata/email/archives/201211/msg00030.html) based on progress made on issues and proposals.

Discussion:

Mike Pizzo is writing the following proposal topics on the white board

1. Aggregation
2. Delta queries
3. New JSON
4. Relationship simplification
5. Data Time issues
6. Enums
7. Issues in JIRA

Mike is suggestion that 3. New JSON format be discussed tomorrow. The proposal will be uploaded today.

Here is a proposed order for discussion today:

1. [Aggregation](https://www.oasis-open.org/committees/document.php?document_id=47405&wg_abbrev=odata)
2. [Delta queries](https://www.oasis-open.org/committees/download.php/47402/OData%20Delta%20Query%20Protocol%20Design%202012-11-7.docx)
3. Data Time issues
4. Other JIRA issues in Proposed state

Items 1. and 2. above planned for discussion before lunch break. 3. and 4. are planned for after lunch break.

Otherwise agenda approved as published.


## 3. Approval of Minutes from Previous Meeting(s)##

### 3.1 Approval of [Minutes of 2012-11-01 Meeting#14](https://www.oasis-open.org/committees/download.php/47355/odata_meeting-14_on-20121101-minutes.html):###

**Meeting minutes approved with no objections**.


## 4. Review of [Action Items](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_items.php) (AI) and Progress##

>Context: The ownership of action items is noted `[owner: Given Family]` and as indicated by [AI-List-Tool](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_items.php) retrieved `2012-11-08 14:15 +02:00`.


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
: "Prepare Working Draft 01 (WD01) version of OData Extension for Data Aggregation" [owner: Ralf Handl] is **Ongoing** (Note: Due 2012-11-02) {already closed by owner on 2012-11-02}

AI#0018
: "Prepare Working Draft 01 (WD01) version of OData Extension for Temporal Data" [owner: Andrew Eisenberg] is **Ongoing**

AI#0019
: "Prepare Working Draft 01 (WD01) version of OData Extension for XML Data" [owner: Andrew Eisenberg] is **Ongoing**

AI#0020
: "Prepare Working Draft 01 (WD01) version of OData Extension for JSON Data" [owner: Susan Malaika] is **Ongoing**
  
AI#0026
: "Detail a proposal with regard to enumerations" [owner: Mike Pizzo] is **Ongoing** (Note: Due 2012-11-15)


###4.1 Action items due by 2012-11-08 (end of day)###

####4.1.1 [AI#0017](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_item.php?action_item_id=3482)####

AI#0017
: "Prepare Working Draft 01 (WD01) version of OData Extension for Data Aggregation" [owner: Ralf Handl] is **closed** (Note: Due 2012-11-02) 


####4.1.2 [AI#0008](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_item.php?action_item_id=3465)####

AI#0008
: "Recording of TC meetings" [owner: Hubert Heijkers] is **closed** (Note: Due 2012-11-05)

####4.1.3 [AI#0003](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_item.php?action_item_id=3460)####

Discussion:

* Susan will still need a few days
* Susan also plans to do a white board discussion for about 15 minutes today relating to the action item.

AI#0003
: "Come up with examples / usecases (and proposals) for open types and document annotation for JSON extensions document" [owner: Susan Malaika] is **Ongoing** (Note: Due 2012-11-05)


###4.2 Action items NOT due by 2012-11-08 but MAY be ready for closure###

None. 


##5 Discuss new proposals Part A##


###5.1 Aggregation##

###5.1.1 Presentation##

* Ralf presents the (uploaded via chat room) [slides](https://www.oasis-open.org/committees/document.php?document_id=47404&wg_abbrev=odata).

Discussion:

* All: Decision to switch from colon ':' to semicolon ';' as "command separator"
* Stefan: [RFC1738](http://www.ietf.org/rfc/rfc1738.txt) Section 2.2 says: "Many URL schemes reserve certain characters for a special meaning: their appearance in the scheme-specific part of the URL has a designated semantics. If the character corresponding to an octet is reserved in a scheme, the octet must be encoded.  The characters ";", "/", "?", ":", "@", "=" and "&" are the characters which may be reserved for special meaning within a scheme. No other characters may be reserved within a scheme."
* Hubert explains slide 12 esp. how the data in the two displayed tables (layout) relate to each other.

In presenting slide 13, Ralf lists the open topics w.r.t Aggregation:

* Links for 'drilling into' aggregated entities
* Hierarchies: parent-child, ragged, ...
* Hierarchy functions: descendants(), siblings()
* Expressions in $aggregate: 
  + sum(Revenue) - sum(Costs) as Profit
* References to annotations for units, currencies, texts

####5.1.2 [Working Draft](https://www.oasis-open.org/committees/document.php?document_id=47405&wg_abbrev=odata)####

Now through a shared screen session the new revision of the working draft [OData Extension for Data Aggregation](https://www.oasis-open.org/committees/document.php?document_id=47405&wg_abbrev=odata) from 2012-11-07 is discussed.

Discussion:

Context "3.1 $aggregate":

* Ralf: **To do**: $groupby NavProp only includes the NavProp with a deferred representation.

Context 3.1.2.2.2 Aliasing:

* All: **Decision**: Entity types need not be open to allow aliasing
* All: **Rationale**: The client asked for the aliased properties, so it shouldn't be surprised
* Mike: We discussed the returning of additional properties added, for example, through aliased custom aggregation. These added properties are similar to dynamic properties that may be returned from an open type, but we do not want to require that a type be open in order to allow the addition of custom aggregations - defining a type as open tells the client there may be additional properties in the payload and implies that the client can persist dynamic properties as part of instances of that entity type. We do not need to tell the client there may be additional properties -- they are the one that asked for the additional properties, and we don't want to require that the service support persisting dynamic properties in order to support adding custom aggregation.
* Mike: **Action**: We need to make sure the protocol is clear that (libraries) should be prepared to handle additional (dynamic) properties in the payload not defined in the type, either because the type is marked as open or because the client has requested additional properties in the response.

_(A short break)_

Discussion (continued):

Context "3.1.2.2.5 The Standard Aggregation Function distinctCount":

* Stefan: Why is it called `distinctCount` and not `countDistinct`
* Mike: Explains from SQL point of view `countDistinct` is better matching the intended `count distinct`at least in this case.
* Hubert: States it should be more correct to name the term that way
* All: **Decision**: Use `countDistinct` instead of `distinctCount` as it is better English.

Context "3.2 $rollup":

* Ralf: **Request for Input from members**: ￼How does $rollup work together with $top, $skip, and $inlinecount? Will it only take the finest level of ￼granularity into account and add subtotals for a group when a group boundary is part of that chunk? Assumption: client-driven paging is for “painting a screen”. For cross-tab reports this depends on the page layout (axis arrangement) chosen by the client, so we could forbid $top, $skip and $inlinecount in conjunction with $rollup and force the client to add filters to the request, e.g. Country eq ‘USA’. The client can get the list of values for constructing these filters with a “distinct” request up-front.


Context "3.4 Processing Sequence":

* Ralf: **Action**: Define how rollup rows are ordered and where they are placed in the response (interspersed or at the end). Interspersed and ordered with the base result entities seems to be least surprising and most consistent.
* Ralf: **Proposal**: Ordering of rollup rows within detail rows is up to the service if no $orderby is given, otherwise at the position determined by $orderby. Servers may support $top and $skip. If so, they treat rollup rows and detail rows identically. So $rollup is done after $filter and before $inlinecount.
* Anila: What is the behavior of $skip and $top after $skiptoken (as defined in the order of evaluation)?
* All: Discussion of use cases and detaileld consequences of usage in event of $skiptoken
* Mike: Sees this as the difference between client vs. server driven paging. 
* Mike opened a JIRA issue: [Clarify, in OData Protocol, that $skip and $top are not allowed to be appended to a next link](http://tools.oasis-open.org/issues/browse/ODATA-163) since it does not seem useful, and in fact seems a bad idea, for the client to attempt to apply $skip and $top to a next link.

Further on (More examples):

* Susan: Asks on meaning of the three $rollup variants.
* Hubert explains.
* Stefan: Besides $rollup=(...) unfiltered will we see also unexpanded, unskipped ... ?
* Stefan explains, that if more commands would be un'...'ed, this would be hard for client parsers to keep mappings which un'...'ed belongs to which '...'
* Hubert: Explaines, that unfiltered remains a singleton.


Further on (Now enter $rollup"):

* Topic: Samples like `... $rollup=(Customer/Country-sum-Customer/Name), (Time/Year-average-Time/Month)`
* Hubert explains the need for inserting the wanted aggregation between all pairs in a $rollup if default aggregation has been overwridden.
* Mike asks for a clear rule, otherwise leave this server dependent and suggests opening a JIRA issue on this but start with one variant for now. 
* All: **Decision**: For the base analytics document, we will not propose custom aggregations for rollups, and leave it up to the service to define what aggregation is meaningful for the rollups. We will open a separate JIRA ticket to consider proposal of specific syntax and rules around specifying custom aggregation functions for rollups.
* Mike opened the JIRA issue: [Consider syntax and rules around client specifying custom aggregation functions for rollups](http://tools.oasis-open.org/issues/browse/ODATA-164) saying: `For the base analytics document, we did not propose custom aggregations for rollups, and left it up to the service to define what aggregation is meaningful for the rollups. This issue is to consider proposal of specific syntax and rules around specifying custom aggregation functions for rollups.`.

_(One hour lunch break)_

Context "3.5 Cross-Joins":

* Hubert: Suggests an example to discuss options.
* Ralf: **Todo**: Have to check the ABNF if this is already allowed.
* All: **Decision**: Treat the entity container as an entity set without introducing a virtual set $x
* Hubert will provide examples for his thoughts on this.

Context "4.1 Aggregatable Properties":

* Stefan asks why not element names like `PropertyAggregatable`, `PropertyGroupable` and the likeare used, which seem more natural, when reading the document and its structure as annotating properties, which should then come first. (Currently proposed names are `AggregatableProperty` and `GroupableProperty`).
* Ralf: It is modeled to mimic the english naming of being an `aggregatable property`.
* Mike suggests to delete the '*' proposal unless someone requests to add this as shorthand.
* All: Agreed, part deleted from working draft.

Context "4.3 Hierarchies":

* Ralf: Suggests to discuss this shortcut as it is similar to the '*' pattern discussed in section 4.1 but sees this (in section 4.3) as a more common case.
* All: An optional property named HierarchyGroup has been added to the ComplexType Hierarchy

Context "4.4 Functions and Actions on Aggregated Entities":

* Ralf will add an example for this

Barbara asks if there is general agreement on the work in progress or if there are major concerns?

All: Agree that this is a work in progress and that there are no major concerns.

Updates: 

* Ralf [updated slides presented](https://www.oasis-open.org/committees/download.php/47409/OData-TC%20F2F%202012-11-09%20Data%20Aggregation.pptx) and uloaded them to kavi.

###5.2 Delta queries###

####5.2.1 [Presentation](https://www.oasis-open.org/committees/document.php?document_id=46575&wg_abbrev=odata)####

Mike first shows some slides in this regard from the first face to face, then switches to document for details

Discussion:

Context is slide 7 "Deltas and Query Options":

* Matt asks why $count can't be used to tell the client how many changes there are.
* Hubert responds that one would simply use $inlinecount for this purpose and further explains, that $count is part of the resources path. You are not supposed to construct the delta link yourself short of adding the query options discussed right now.
* Matt argues, that using $inlinecount already means you are getting some changes.  $count is simply a question of how many changes there are.
* Hubert explains that this is correct but $count is not a query option, but you could get the $inlinecount while specifying $top=0. That would presumably giving you just the inline count I'd imagine
* Mike updates the slide 7 accordingly, now saying, that 
    + Query options that are not applicable to deltas
        - $orderby (thus removed $count, $value)
    + Note: can't use $count and $value because they are query segments.

_(short fifteen minutes break)_

In closing Mike lists the open issues:

* How do we treat $expand in a delta query?
* Is deleted reason optional? Is it hard to determine in some cases? What does the client do if not known?
* Does a server always return a delta link if it can? Might it be expensive to generate?


####5.2.2 [OData Delta Query Protocol Design](https://www.oasis-open.org/committees/download.php/47402/OData%20Delta%20Query%20Protocol%20Design%202012-11-7.docx)####


Discussion:

Context is page 2 (section "Query Operators in Initial Query"):

* Matt suggests, that $count and $value should be moved out of the query operators section into a query segment section

Context is page 3 (section "Query Operators in Delta Queries" third paragraph starting with The client can compose …):

* The ending sentence: "Similarly, it is valid to compose /$count on to the path of a delta query in order to determine just the number of changes that have occurred since an initial request." will be moved to URL conventions

Context is page 7 in live edited document (Atom format response sample):

* Stefan suggests to change the samples to the valid: standalone="yes" in the xml declarations (instead of this standalone="true").
* Mike notes, that this is from an existing service … 
* All: Will be corrected and checked in other xml delarations of code samples.

Context is still page 7 in live edited document (Focus on request part of relationship request sample):

* Hubert mentions, that in the relationship sample, using /$relations, scoping is done with NAVPROP( ... ) whereas the proposal for this uses NAVPROP/( ... ) typically (mind the forward slash) and suggests to discuss this as part of the scoping issue later
* Hubert also asks if $relations could be the last part of the resource, in this example GET ~/Customers/$relations, implying that we get a result in which all 'relations' with the customer entity would be returned perhaps?
* Mike will think further about using $expand in a delta query (as discussed today)

Barbara asks if there is general agreement on the work in progress or if there are major concerns?

All: Agree that this is a work in progress and that there are no major concerns but main use case shall be named to check the scenarios.

Noted question also: How do we process results from separate queries?

It has been noted, that $inlinecount on delta result includes tombstone

Diane: $expand will cause multiple delta queries to be returned to process the set and relation changes.  presumably the consumer would process run those deltas in batch.  How would the consumer process those multiple set of changes in order when you have 3 distinct sets of changes.

_(Proposed to start tomorrow's meeting with JSON Format)_

_(Rest of agenda draft will be uploaded sometime after the meeting)_

##6 AOB##

None. 

### Meeting adjourned on 1800 EST.###


