Title:	Meeting minutes of OASIS OData TC's two day meeting in Littleton, MA, USA #15 (F2F)
Date:	Thursday, 08 Nov 2012, 0900 - 1800 EST and Friday, 09 Nov 2012, 0900 - 1800 EST   
Author:	Stefan Drees <stefan@drees.name>  

# OData meeting in Littleton, MA, USA #15 F2F, Thursday, 08 Nov 2012,  0900 - 1800 EST and Friday, 09 Nov 2012, 0900 - 1800 EST#

#Day One#

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

##6 Agenda for tomorrow##

09:00 EST Review and approve agenda for day 2

09:10 EST Review action items

09:30 EST Discuss new proposals: New JSON Format

10:30 EST Break

10:45 EST Discuss new proposals:  Relationship Simplification

12:30 EST Lunch

01:30 EST Async

02:00 EST Simple Type

02:30 EST Enums,

03:00 EST Break

03:15 EST Scoping and URL Issues 32/36/38/73

03:45 EST Review TC timeline and next steps 

04:30 EST AOBand wrap up 

06:00 EST End

Susan on action item iii.#0003: Come up with examples / usecases (and proposals) for open types and document annotation for JSON extensions document

##7 AOB##

None. 

### Thursdays' Meeting adjourned on 1800 EST.###

#Day Two#

Meeting day chaired by Barabara Hartel and Ram Jeyaraman

Acting chair: Ram Jeyaraman

Meeting Details cf. [event page for this meeting day](https://www.oasis-open.org/apps/org/workgroup/odata/event.php?event_id=33707).

##8 Approval of Agenda for Day Two##

At the end of day one meeting of the two days event #15 it has been proposed to proceed today as follows (estimated start times in 24 hour format):

09:00 EST Review and approve agenda for day 2

09:10 EST Review action items

09:30 EST Discuss new proposals: New JSON Format

10:30 EST Break

10:45 EST Discuss new proposals:  Relationship Simplification

12:30 EST Lunch

13:30 EST Async

14:00 EST Simple Type

14:30 EST Enums

15:00 EST Break

15:15 EST Scoping and URL Issues 32/36/38/73

15:45 EST Review TC timeline and next steps 

16:30 EST AOBand wrap up 

18:00 EST End

Discussion:

* Mike will start with New JSON Format.


Otherwise agenda approved as published.

##9 Discuss new proposals Part B##


###9.1 New JSON Format##


###9.1.1 [Working Draft](https://www.oasis-open.org/committees/download.php/47421/Json%20Overview%202012-11-08.docx)##

Mike presents the current working draft in a screen shared session.

Discussion:

Context is page 7 section "Property":

* Hubert states: In the JSON format we should look into the requirements on ordering of the properties in responses. There are JSON libraries out there that back their objects with maps and once these objects get serialized the properties might not appear on the stream in the order they were put in the map. It would be more efficient if one new if an order was guaranteed, for streaming purposes, but we might need to be able to deal with cases were they wouldn't?

Context is how NULL values are represented in the response as well as the reason for needing to do that to differentiate with values of a property that might be called 'value' in a complex type that by themselves might be null again. The base reason there is because we no longer have the value property in every response (as we used to have the "d" property):

* Hubert states: As discussed, I think treatment of NULL needs another review/discussion in how they are presented related to not having the value property for complex types/entities.

Ram asks if there is general agreement on the work in progress as being on the right track or if there are major concerns?

All think that yes.

_(short ten minutes break)_


##10. Review of [Action Items](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_items.php) (AI) and Progress##

###10.1 Action items due by 2012-11-09 (end of day)###


####10.1.1 [AI#0005](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_item.php?action_item_id=3462)####

Discussion:

* Andrew has no update on this yet.

AI#0005
: "Come up with a first milestine for the temporal extension" [owner: Andrew Eisenberg] is **Ongoing** (Note: Due 2012-11-09)

####10.1.2 [AI#0006](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_item.php?action_item_id=3463)####

Discussion:

* Andrew has no update on this yet.

AI#0006
: "Come up with estimate for first milestone for XML data extension" [owner: Andrew Eisenberg] is **Ongoing** (Note: Due 2012-11-09)

####10.1.3 [AI#0007](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_item.php?action_item_id=3464)####

Discussion:

* Andrew has no update on this yet.

AI#0007
: "Come up with estimate for first milestone for JSON data extension" [owner: Susan Malaika] is **Ongoing** (Note: Due 2012-11-09)

####10.1.4 [AI#0003](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_item.php?action_item_id=3460)####

Discussion:

* Susan has no update on this yet. Will need two weeks more time

AI#0003
: "Come up with examples / usecases (and proposals) for open types and document annotation for JSON extensions document" [owner: Susan Malaika] is **Ongoing** (Note: Due 2012-11-19)

##11 Discuss new proposals Part C##


###11.1 Association Simplification###


###11.1.1 [Presentation](https://www.oasis-open.org/committees/download.php/46576/Association%20Simplification.pptx)###

Mike presents the slides from first face to face meeting.

Discussion:

* John states: RDF can be subsumed with OData Collections (as long as you use an assumed order in your coding of data,data,op tuple)
* Ram asks if there is general agreement on the work in progress as being on the right track or if there are major concerns?
* All think that yes.

Proposed is to adapt a future version of the OData CSDL to these simplified associations.


_(One hour lunch break)_


###11.2 Async###

###11.2.1 Presentation###

Martin presents the topic from scratch. Mike produces some live text for persistent storage.

Discussion:

Context is HTTP header "Prefer: respond-async, wait=10":

* Stefan asks, if this proposed header is based on https://tools.ietf.org/html/draft-snell-http-prefer-16
* Martin acknowledges this, but that there is a newer slightly changed version i.e. https://tools.ietf.org/html/draft-snell-http-prefer-17 available.
* Allowed values for wait (delta-seconds) are 1*DIGIT


References: 

Header: [draft-snell-http-prefer-17](https://tools.ietf.org/html/draft-snell-http-prefer-17) J. Snell 'Prefer Header for HTTP', Internet-Draft, 2012-11-05, Expires: May 9, 2013 

delta-seconds (for wait): [draft-ietf-httpbis-p2-semantics-21](https://tools.ietf.org/html/draft-ietf-httpbis-p2-semantics-21) R. Fielding and  J. Reschke (Eds.) 'Hypertext Transfer Protocol (HTTP/1.1): Semantics and Content', Internet-Draft, 2012-10-04, Expires: April 7, 2013 

cancel fails/succeeds: [draft-nottingham-http-problem-01](http://tools.ietf.org/html/draft-nottingham-http-problem-01) M. Nottingham 'Indicating Details of Problems to Machines in HTTP', Internet-Draft, 2012-09-13, Expires: March 17, 2013 


For opinions on if Retry-After header is allowed in a HTTP 202 response see mail thread in W3C's public ietf-http-wg mailing list [202 Accepted, Location, and Retry-After](http://lists.w3.org/Archives/Public/ietf-http-wg/2011OctDec/0076.html)  and follow all responses, esp. branches like: [Filling out 202 Accepted](http://lists.w3.org/Archives/Public/ietf-http-wg/2011JulSep/0343.html).


Further discussion on procedures/steps:

---
Use version -17 of the RFC draft.  http://tools.ietf.org/html/draft-snell-http-prefer-17 The prefer tokens have been renamed from "return-asynch" ... now it's "respond-async"


(a) 

**Question**: For use response is there any preference? returning 202 accepted? use link header for monitor URL? Is this reasonable?

**Answer**: Yes ; `Link: <http://.../monitor> (http://.../monitor%3E); rel="monitor"` then `GET http://.../monitor` can also return `202 Accepted `if the processing is not yet complete until it's done.. at which time it returns the final response

(b) 

**Question**: When polling the monitor ... return `200` or `204` ...... using a link header to determine the eventual location of final outcome?

**Answer**: Yes, that would work great. There is a `Retry-After` response header I believe that you can use to specify how often to poll

(c)  

**Question**: What rel do we use in the link header to access the final outcome?

**Answer**: You can use "canonical" or possibly "self". "via" is OK but a bit weird. "via" is more for a forwarding intermediary as in referencing the original source of information "I got this information via so-n-so" 

(d) 

**Question**: Is the  best way to tell the async operation has completed by the presence of the link header? 

**Answer**: HTTP status code. If client does a `GET` on `http://.../monitor` and the process is not yet complete, Return a `202` with the Link header pointing back to the same monitor. If the process is complete, consider doing a redirect to the final location like `302 Found`, with the `Location` header giving the final location.

**Follow-up-question**: Does that allow for redirect of monitor?

**Answer**: Someone would need to understand how to handle `202`, since `202` is a success response, you can, for instance, return html that includes an auto-refresh statement. So if the client is a browser, it will autorefresh to check status, then will automatically redirect to the final location when complete. Using `202 Accepted` when `GET`ting the monitor url will avoid accidentally sending clients into a redirect loop so we are talking monitor redirect. The flow would look like...

Request_0:

`POST /foo`

Response_0:

`202 Accepted`

`Link: <http://.../monitor> (http://.../monitor%3E); rel="monitor"`

Request_1:

`GET http://.../monitor`

Response_1:

`202 Accepted`

`Retry-After: 10`

`Link: <http://.../monitor> (http://.../monitor%3E); rel="monitor"`

Request_2:

`GET http://.../monitor`

Response_2:

`202 Accepted`

`Retry-After: 10`

`Link: <http://.../monitor> (http://.../monitor%3E); rel="monitor"`

Request_3:

`GET http://.../monitor`

Response_3:

`302 Found`

`Location: http://.../foodone`

The first two `GET`'s return `202 Accepted`. The client see's that and just tries again after 10 seconds. The third attempt results in a `302 Redirect`. `303` could work too. Either `303` or `302`.

(e) 

**Question**: Have you considered canceling async operations? would `DELETE` monitor be appropriate for that?

**Answer**: Yes, that would work great so long as the monitor URL is specific to that one async operations e.g. `DELETE http://.../monitor/123` where `123` is like a process ID... doing a `GET` on the monitor url can return a status resource too.. along with the `202 Accepted`.

(f) 

**Question**: What status code should be used when a request (async or otherwised) has been canceled?

**Answer**: `200 OK` or `204 No Content`
 
**Follow-up question**: That's from the `DELETE` request - what about from the cancel request?

**Answer**: `DELETE /monitor/123` would cancel that process... response would be `200` or `204`

(g) 

**Question**: What happens when a regular http request is canceled out of band -  what code is returned? e.g., an admin killed the server thread that was executing the request generated from the browser HTTP request 

**Answer**: I would expect just to get a `404` back. When I try to `GET` the monitor ... it would say `404` and possibly include some html that gives a detailed explanation

(h) 

**Question**: Can a delete to the monitor return a `202`?

**Answer**: Sure. why not? If the process cannot be deleted right away, then the cancelation could be async also

(i) 

**Question**: Consider two cases
 (1) If the cancel fails - what happens (2) if the cancel fails - what happens
 (2) if the cancel succeeds what happens

**Answer**: For (1).. imagine a flow like...

Request_1:

`DELETE /monitor/123`

Response_1:

`202 Accepted`

`Link: <http://.../delete/monitor> (http://.../delete/monitor%3E); rel="monitor"`

Request_2:

`GET http://.../delete/monitor`

Response_2:

`302 Found`

`Location: http://.../delete/status`

Request_3:

`GET http://.../delete/status`

Response_3:

`4xx Failed`

`Content-Type: application/json`

`{"status": "process could not be canceled"}`

basically, the monitor would complete as expected, returning a `302` to the final status URL doing a `GET` on that URL would return something like a `4xx` that indicates that the original request failed and could contain a resource that describes why it failed

For (2) ... when I do `GET http://.../delete/status`, it would return `204 No Content` to indicate success


**Follow-up question**: for (1)  would I do a `GET` on `monitor/123` to monitor the original operation?

**Answer**: Yes - if you cancel is asynchronous, you have to assume that the original monitor is still active and valid until the process is successfully canceled or completed. Once the cancelation is complete, doing a `GET` on the original monitor url would return a `404`
If cancelation does not complete, doing a GET on the original monitor url would continue acting as if cancelation was never requested
I've been wanting to write all this up in detail. haven't had the chance... I probably should go ahead and do it.

(j) 

**Question**: How do you distinguish `404 cancel` and `404 not found` on original monitor?

**Answer**: Strictly speaking you wouldn't really need to... the end result is the same in either case... nothing to monitor anymore.. but if you needed that level of detail, a resource could be included in the response that describes what happened something like this: http://tools.ietf.org/html/draft-nottingham-http-problem-01 could be used to describe the specific circumstances of the `404`



In conclusion the next steps are further fleshing out a proposal.

Update:
> Mike will edit the discussion document for readability and upload it into kavi.

_(short ten minutes break)_

##12 Review TC timeline and next steps [[TL_REF][TL_REF]]##

Context:
> [List](https://www.oasis-open.org/apps/org/workgroup/odata/download.php/47392/TC%20timeline%202.htm) and [Diagram](https://www.oasis-open.org/apps/org/workgroup/odata/download.php/47393/TC%20timeline%20(rev%203).pdf)

Discussion:

* Ram introduces the timeline
* Ram asks on discussion on where we are?
* Susan asks if the durations are fixed (for the reviews)
* Ram explains, that these are based on the OASIS process.
* Mike thinks it is possible to produce a Draft 01 (CSD01) in the mid of Feburary
* Ram suggests to start thinking about interoperability testing today, so that there will be enough working implementations which would also foster the final stages of achieving approval as OASIS Standards (for this final step, some statement of uses are mandatory. Partial implementations also qualify)
* Mike explains the current status of the specs under the core umbrella as of now. 
* Hubert asks for the date of the fourth face to face meeting?
* Mike reads from the timeline, that April 2013 might be a good month for a fourth face to face meeting


##13 Scoping and URL Issues 32/73/36/144/38##

Discussion:

* Mike and Ralf suggest processing the issues in sequence 32, 73, 36, 144 and 38.
* All agree.

###13.1 [ODATA-32](https://tools.oasis-open.org/issues/browse/ODATA-32)###

ODATA-32
: "Allow filtering of expanded to-many navigation properties" [components: OData Protocol, OData URL Conventions] is **Open**. 

Discussion:

* Is documented in comment entered by Mike from 2012-11-09 on JIRA issue
* Matt asks: Can you return a $skiptoken for expanded items?
* Mike responds, that if and where a $skiptoken is used, is entirely opaque


Hubert: 
>I **move** to resolve OData issue 32 as proposed. **Mike seconds**.


**No further discussion**. **No objections**. The **motion passes**.


ODATA-32
: "Allow filtering of expanded to-many navigation properties" [components: OData Protocol, OData URL Conventions] is **proposed** with no objections. 


###13.2 [ODATA-73](https://tools.oasis-open.org/issues/browse/ODATA-73)###

ODATA-73
: "Retrieve the count of related entities together with the base entity" [component: OData URL Conventions] is **New**. 


Mike: 
>I **move** we close ODATA-73 as resolved by ODATA-32. **Martin seconds**.


**No further discussion**. **No objections**. The **motion passes**.


ODATA-73
: "Retrieve the count of related entities together with the base entity" [component: OData URL Conventions] is **closed** with no objections. 


###13.3 [ODATA-36](https://tools.oasis-open.org/issues/browse/ODATA-36)###

ODATA-36
: "Make $expand implicit if navigation properties are mentioned in $select or $aggregate" [components: OData Protocol, OData URL Conventions] is **New**. 

Ralf: 
>I **move** to close ODATA-36. **Martin seconds**.


**No further discussion**. **No objections**. The **motion passes**.


ODATA-36
: "Make $expand implicit if navigation properties are mentioned in $select or $aggregate" [components: OData Protocol, OData URL Conventions] is **closed** with no objections. 


###13.4 [ODATA-144](https://tools.oasis-open.org/issues/browse/ODATA-144)###

ODATA-144
: ""'Scoping' syntax for $select and $aggregate"" [component: OData URL Conventions] is **New**. 

Discussion:
* New comment created during meeting (2012-11-09) by Mike in updating the proposal saying that the issue (as before the meeting) is no longer relevant

Hubert: 
>I **move** to resolve ODATA-144 as proposed. **Ralf seconds**.


**No further discussion**. **No objections**. The **motion passes**.


ODATA-144
: ""'Scoping' syntax for $select and $aggregate"" [component: OData URL Conventions] is **closed** with no objections. 

###13.5 [ODATA-38](https://tools.oasis-open.org/issues/browse/ODATA-38)###

ODATA-38
: "Recursive $expand and $select" [components: OData Protocol, OData URL Conventions] is **New**. 

Discussion:

* Proposal edited during meeting (2012-11-09) by Mike that reflects the group authored text.

Stefan: 
>I **move** to resolve ODATA-38 as proposed. **Mike seconds**.


**No further discussion**. **No objections**. The **motion passes**.


ODATA-38
: "Recursive $expand and $select" [components: OData Protocol, OData URL Conventions] is **proposed** with no objections. 


##14 Next meeting (phone call/conference)##

Next phone call/conference will be on 2012-11-29, since it has been decided to not have a TC meeting in the week after the face-to-face and the week thereafter skipped due to holidays.

##15 AOB##

None. 

### Meeting adjourned on 17:46 EST.###


# Appendices#
## Timeline Reference [TL_REF] ##
 
Goal: 
> Deliver core Work Products as close as possible to the timeline mentioned in the TC charter and extension Work Products soon after.
 
Note: 
> The purpose of this timeline exercise is to create a map of the future milestones (based on current knowledge) and lay out a probable path for traversing the various future milestones. As with all things, there are unknowns that may stretch the timeline. For example, what if there are many public comments? What if it takes more time for the TC to address existing and as yet unknown issues? Those unknowns may stretch the timeline in terms of having to produce multiple Committee Specification Drafts until we address all the issues and feel confident to advance the Work Products to Committee Specification.
 
Draft timeline for core Work Products:

* November 2012
    + 2nd F2F meeting Nov 8-9, 2012 (Littleton, MA)
        - Discuss new proposals
        - Aim to resolve many of the key issues on core Work Products such as enums and relationship simplification
    + Leading up to Nov 29
        - Editors to incorporate all issue resolutions and produce new revisions of core Work Products
        - Review and file issues on core Work Products resulting from new proposals
        - Review and file issues on core Work Products resulting from extension Work Products
    + Nov 15th TC meeting [Cancelled? – since it is the week after the F2F]
    + Nov 22nd TC meeting [Cancelled? – since it is the Thanksgiving holidays in the US]
    + Nov 29 TC meeting
        - Continue to make progress on issues
* December 2012
    + Continue to make progress on issues
    + December 19, 2012
        - *File all known issues on core Work Products resulting from new proposals*
* January 2013
    + January 17, 2012
        - *File all known issues on core Work Products resulting from extension Work Products*
    + Continue to resolve issues
    + 3rd F2F meeting January 29-31, 2013 (tentative) (details TBD)
        - Resolve all key issues on core Work Products
        - *TC agrees to a high bar for accepting new issues on core Work Products*
    + Continue to resolve issues
* February 2013
    + February 7, 2013
        - Resolve *all remaining issues* on Core Work Products
        - Agree to advance core Work Products to Committee Specification Draft 01 (CSD01)
    + February 14, 2013
        - Editors to prepare Committee Specification Draft 01 (CSD01) of core Work Products containing resolutions to all issues
    + February 21, 2013
        - Approve Committee Specification Draft 01 (CSD01) of core Work Products and agree to start 30-day public review
* March 2013
    + March 1 through March 30
        - 30-day public review of core Work Products
    + Address public review comments on core Work Products
* April 2013
    + 4th F2F meeting (April 2-4, 2013)
        - Address public review comments on core Work Products
        - NOTE: If there are no public review comments on CSD01 AND no further substantive changes (requested by the TC) to the core Work Products, we can jump ahead to *approving Committee Specification (CS)*
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
        - Assuming there are no changes to core Work Products resulting from the preceding public review, *approve Committee Specification (CS)*
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
    + *File all known issues on core Work Products resulting from extension Work Products*
* February and March 2013
    + Resolve issues on extension Work Products
* April 2-4, 2013 4th TC F2F meeting
    + Resolve issues and make progress on extension Work Products
* May 2013
    + Approve Committee Specification Draft 01 of extension Work Products (depending on progress)
 



