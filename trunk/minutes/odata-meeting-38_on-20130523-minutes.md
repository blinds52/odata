#OData meeting #38, Thursday, 23 MAY 2013, 0800 - 1000 PT

**Note**: For explanations of conventions and other formal aspects common to OData TC meeting minutes which are used in this document please cf. "[Formal Aspects of Meeting Minutes](https://www.oasis-open.org/committees/download.php/48109/formal-aspects-meeting-minutes-v1.html)".

Meeting chaired by Barbara Hartel and Ram Jeyaraman

Acting chair: Barbara Hartel 

## 1 Roll call

### 1.1 Members Present:

        Barbara Hartel (SAP AG)        Dale Moberg (Axway Software)        Edmond Bourne (BlackBerry)        Gerald Krause (SAP AG)        John Willson (Individual)        Ken Baclawski (Northeastern University)        Martin Zurmuehl (SAP AG)        Matthew Borges (SAP AG) a.k.a. Matt        Michael Pizzo (Microsoft) a.k.a Mike        Nuno Linhares (SDL)        Patrick Durusau (Individual)        Ralf Handl (SAP AG)        Ram Jeyaraman (Microsoft)        Robert Richards (Mashery)        Stefan Drees (Individual)        Susan Malaika (IBM)        Ted Jones (Red Hat)

Quorum achieved. Details cf. [normative attendance sheet for this meeting](https://www.oasis-open.org/apps/org/workgroup/odata/event.php?event_id=34198).

## 2 Approval of Agenda

Stefan asks to deal with the 3 comments from today
All are fine with that.
Agenda approved as published and amended.

## 3 Approval of Minutes from Previous Meeting(s)

### 3.1 Approval of [Minutes of 2013-05-16 Meeting#37](https://www.oasis-open.org/committees/download.php/49212/odata-meeting-37_on-20130516-minutes.html)


**Meeting minutes approved with no objections**.

##4 Review of [Action Items](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_items.php) (AI) and Progress [AIH]

Context:
> See the "[List of Open Action Items Before the Meeting][AI_REF]" section in the appendix.

###4.1 Action items due by 2013-05-23 (end of day)

None.

###4.2 Action items NOT due by 2013-05-23 (end of day) but MAY be ready for closure

None.

##5 Review of [Issues List](https://tools.oasis-open.org/issues/secure/IssueNavigator.jspa?reset=true&mode=hide&pid=10103&sorter/field=issuekey&sorter/order=ASC) (IL) and Progress [IPH]

**Notes**:

* Issues in this section (5) may have been progressed out of sequence, but have been noted here to better group by components impacted as a service for the reader.
* There is an "[Index of Issues Processed During the Meeting][IP_REF]" section in the appendix.

###5.1 Public Review Issues [pubreviss]

Discussion:

* Upon processing [ODATA-405][5.1.1.1] Mike notes, that the issues that are filled in from public comment may be far from being ready for resolution
* Stefan explains, that these proposals of public comment induced issues are just a starter that he prefills upon receipt of comment.
* Mike would like to not have these (external) issues with a filled in proposal
* Stefan kindly requests advice on how to distinguish these from those issues, where a proposal has already been prepared among the members?
* All discuss
* Stefan will follow Mike's suggestion to leave environment empty and as before fill in the proposal field with the first understood proposal from the external commenter
* All agree that this is good and look forward to Stefan continuing to map public comments to issues in that way.

####5.1.1 [c201305e00008](https://lists.oasis-open.org/archives/odata-comment/201305/msg00008.html)

Context:
> We received the public Comment #20130500008 on 2013-05-23 with title "Deep Updates". To prepare processing a corresponding JIRA issue  [ODATA-405](https://tools.oasis-open.org/issues/browse/ODATA-405) has been created with summary "Deep Updates (public comment c201305e00008)" [component: OData ATOM Format].

#####5.1.1.1 [ODATA-405](https://tools.oasis-open.org/issues/browse/ODATA-405)

ODATA-405:
: "Deep Updates (public comment c201305e00008)" [component: OData ATOM Format] is **New**.

Discussion:

* Mike states there is a proposal, but this need still a lot of work
* For general discussion on seeding issue mapping of public comments cf. section [5.1][pubreviss]

**No further discussion**. **No objections**.

ODATA-405:
: "Deep Updates (public comment c201305e00008)" [component: OData ATOM Format] is **Open** with no objections.

####5.1.2 [c201305e00009](https://lists.oasis-open.org/archives/odata-comment/201305/msg00008.html)

Context:
> We received the public Comment #20130500009 on 2013-05-23 with title "Attribute ContainsTarget". To prepare processing a corresponding JIRA issue  [ODATA-406](https://tools.oasis-open.org/issues/browse/ODATA-406) has been created with summary "Attribute ContainsTarget (public comment c201305e00009)" [component: OData CSDL].

#####5.1.2.1 [ODATA-406](https://tools.oasis-open.org/issues/browse/ODATA-406)

ODATA-406:
: "Attribute ContainsTarget (public comment c201305e00009)" [component: OData CSDL] is **New**.

Discussion:

* All discuss the issue.

**No further discussion**. **No objections**.

ODATA-406:
: "Attribute ContainsTarget (public comment c201305e00009)" [component: OData CSDL] is **Open** with no objections.

Mike: 
>I **move** we approve ODATA-406 as proposed. **Ralf seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-406:
: "Attribute ContainsTarget (public comment c201305e00009)" [component: OData CSDL] is **Resolved** with no objections.

####5.1.3 [c201305e00012](https://lists.oasis-open.org/archives/odata-comment/201305/msg00012.html)

Context:
> We received the public Comment #20130500012 on 2013-05-23 with title "Navigation Properties in Complex Types". To prepare processing a corresponding JIRA issue  [ODATA-407](https://tools.oasis-open.org/issues/browse/ODATA-407) has been created with summary "Navigation Properties in Complex Types (public comment c201305e00012)" [component: OData CSDL].

#####5.1.3.1 [ODATA-407](https://tools.oasis-open.org/issues/browse/ODATA-407)

ODATA-407:
: "Navigation Properties in Complex Types (public comment c201305e00012)" [component: OData CSDL] is **New**.

Discussion:

* Ralf explains that we already have some of the steps done.
* Ralf will update issue acordingly, will removed the Proposed state from JIRA and use the issue to fully track the topic


**No further discussion**. **No objections**.

ODATA-407:
: "Navigation Properties in Complex Types (public comment c201305e00012)" [component: OData CSDL] is **Open** with no objections.

Discussion (cont.):

* Ralf mentions, that the address example is already enriched, thus addressing partially the topic raised by the second part of the comment.
* Ralf thinks, these example models should live somewhere, but where? Inside SVN or inside work product for core or ...?
* Mike is a bit concerned about the growing number of work product components and the volume of this which in part seems to hint at a single entry point (like a primer) helping people where to start and what to read.
* Martin also thinks, the volume of components and words should not shock newcomers, but on the other hand he sees a lot of value for offering a rich set of examples
* Mike suggests we should exploit non-normative products to enrich

**No further discussion**. **No objections**.


###5.2 Issues in Proposed state (carried over from  May 16, 2013)

####5.2.1 [ODATA-391](https://tools.oasis-open.org/issues/browse/ODATA-391)

ODATA-391:
: "Add query function isdefined(PropertyPath) to determine whether an instance has a property of that name" [components: OData URL Conventions, OData Extension for Data Aggregation] is **Open**.

Discussion:

* Mike wants to constrain the scope
* Ralf updates the proposal accordingly (by removing a component)

Mike:
>I **move** we accept ODATA-391 as amended to apply only to the aggregation extension and not to open properties. **Martin seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-391:
: "Add query function isdefined(PropertyPath) to determine whether an instance has a property of that name" [components: OData URL Conventions, OData Extension for Data Aggregation] is **Resolved as noted in the motion** with no objections.

####5.2.2 [ODATA-394](https://tools.oasis-open.org/issues/browse/ODATA-394)

ODATA-394:
: "Introduce path segment /$all for search on service and entity container level" [components: OData URL Conventions, OData ABNF Construction Rules] is  **New**.

Discussion:

* Ralf shortly summarizes and motivates the issue
* All agree, that some details of the proposal will profit from further polishing

ODATA-394:
: "Introduce path segment /$all for search on service and entity container level" [components: OData URL Conventions, OData ABNF Construction Rules] is  **Open**.

Discussion:

* All agree, that the proposed $all already is fine as solution

Ralf:
>I **move** to resolve ODATA-394 as proposed. **Martin seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-394:
: "Introduce path segment /$all for search on service and entity container level" [components: OData URL Conventions, OData ABNF Construction Rules] is  **Resolved** with no objections.

####5.2.3 [ODATA-395](https://tools.oasis-open.org/issues/browse/ODATA-395)

ODATA-395:
: "Simplify rule for implicit values of enumeration members" [component: OData CSDL] is **New**.

Discussion:

* The proposal embraces all comments, but one, that liked to see a init only first value mimic, but that has been seen as not worth the effort, as it is a server side thing

Ralf:
>I **move** to resolve ODATA-395 as proposed. **Martin seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-395:
: "Simplify rule for implicit values of enumeration members" [component: OData CSDL] is **Resolved** with no objections.

###5.3 Editorial issues (carried over from  May 16, 2013)

####5.3.1 [ODATA-386](https://tools.oasis-open.org/issues/browse/ODATA-386)

ODATA-386:
: "odata-v4.0-csprd01-part1-protocol, 3 Data Model, appears to be an unnumbered list of definitions, with annotations defined in a separate subsection - suggest new format, etc." [component: OData Protocol] is **New**.

Discussion:

* Patrick shortly summarizes the issue.
* Mike states, that the section in focus shall only give a short background but not really explain the model with formally numbered subsections and suggests more detailed linkage to the CSDL component where the formal definition that is found there 
* Ralf likes the short section introducing all terms
* All agree, that the editors should propose a new wording to address the concern.

**No further discussion**. **No objections**. 

ODATA-386:
: "odata-v4.0-csprd01-part1-protocol, 3 Data Model, appears to be an unnumbered list of definitions, with annotations defined in a separate subsection - suggest new format, etc." [component: OData Protocol] is **Open** with no objections.

####5.3.2 [ODATA-385](https://tools.oasis-open.org/issues/browse/ODATA-385)

ODATA-385:
: "Overview wording suggestion" [component: OData Protocol] is **New**.

Discussion:

* Patrick shortly summarizes the issue.
* Mike states, that Hubert had a concern with the broader term data services
* Ralf shares this one but otherwise likes the proposal
* Mike updated the proposal in JIRA

Mike: 
>I **move** we accept ODATA-385 as amended in the proposal. **Martin seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-385:
: "Overview wording suggestion" [component: OData Protocol] is **Resolved as noted in the motion** with no objections.

####5.3.3 [ODATA-384](https://tools.oasis-open.org/issues/browse/ODATA-384)

ODATA-384:
: "Normative text needs to be typographically distinct from examples" [components: OData URL Conventions, OData Protocol] is **New**.

Discussion:

* Patrick shortly summarizes the issue.
* Ralf suggested to insert a subsection on typographical conventions inside section 1
* Ralf states, that we do not have as of now two separate fonts/appearances for normative vs. non-normative prose (whereas for code we have to distinguish normative code from example code).
* Mike suggests to indent the non-normative prose as indicator.
* Stefan seconds this but would be concerned, if still another typeface appearance would be invented
* All agree to try this out and discuss offline.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-384:
: "Normative text needs to be typographically distinct from examples" [components: OData URL Conventions, OData Protocol] is **Open** with no objections.

####5.3.4 [ODATA-383](https://tools.oasis-open.org/issues/browse/ODATA-383)

ODATA-383:
: "Number all examples in all documents" [components: OData CSDL, OData ATOM Format, OData Protocol, OData JSON Format, OData URL Conventions] is **New**.

Discussion:

* All note, that the issue summary has beend adapted, to better separate it from ODATA-384.
* Patrick shortly summarizes the issue.
* Mike is a bit concerned about the growing size of the documents, if even small examples should be decorated by an extra numbering line and questions the need for it
* Patrick is willing to go over the documents and check, if and how many sections have multiple examples per line or section, otherwise it would be sufficient to refer to an example by stating eg. the second example in section n.
* All agree to come back to this one next week.

**No further discussion**. **No objections**. 

ODATA-383:
: "Number all examples in all documents" [components: OData CSDL, OData ATOM Format, OData Protocol, OData JSON Format, OData URL Conventions] is **Open** with no objections.

Note:
> Patrick will deliver an evaluation if and where example reference ambiguities might arise to support reolution of this issue. 

####5.3.5 [ODATA-382](https://tools.oasis-open.org/issues/browse/ODATA-382)

ODATA-382:
: "Conformance clauses need to refer to sections defining aspects of conformance and do so uniformly" [components: OData JSON Format, OData ATOM Format, OData Protocol] is **New**.

Discussion:

* Patrick shortly summarizes the issue.
* Mike reminds all, how the TC started developing the conformance section (by naming the concepts) but as a reader it would be beneficial, to have section references with numbering and mentions it has already been applied editorially in the private revisions of the Editors.
* Mike also states, that as now all clauses have section links, the partially existing special term links that had been noted as irritating in their occurence or non-occurence in the issue description, have been removed.
* Stefan likes that only one "language" of referencing is used in the conformance clauses, i.e. section numbers only and not a mix of terms (content) and numbers (structure) links.
* Martin suggests to push the current private revisions of the Editors into Kavi, so that Patrick can check the application.
* Mike: Where a conformance clause contains child clauses and these refer to the same containing section, these by intention are currently not separately linked.
* All discuss and agree.

Patrick: 
>I **move** we resolve ODATA-382 as proposed. **Martin seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-382:
: "Conformance clauses need to refer to sections defining aspects of conformance and do so uniformly" [components: OData JSON Format, OData ATOM Format, OData Protocol] is **Resolved** with no objections.

####5.3.6 [ODATA-381](https://tools.oasis-open.org/issues/browse/ODATA-381)

ODATA-381:
: "Hanging paragraphs - all current csprd01 documents" [components: OData CSDL, OData ATOM Format, OData Extension for JSON Data] is **New**.

Discussion:

* Patrick shortly summarizes the issue.
* Stefan mentions his comment on the issue
* Mike thinks, that where there is ambiguity we can clear this up on a case by case basis
* Patrick also thinks this is an empirical question
* Stefan states, that the two examples from the issue are not ambigous, but that he did not scan the documents 
* Ralf kindly suggests, that maybe Patrick might help in scanning the current revisions for conflicting ambiguous refrences?
* To support this, Mike will sent fresh revisions to Patrick
* Patrick will do so.

**No further discussion**. **No objections**. 

ODATA-381:
: "Hanging paragraphs - all current csprd01 documents" [components: OData CSDL, OData ATOM Format, OData Extension for JSON Data] is **Open** with no objections.

Note:
> Patrick will deliver an evaluation if and where conflicting ambiguous refrences might arise to support reolution of this issue. 


###5.4 Issues in Proposed state (may need deeper discussion) (carried over from May 9, 2013)

####5.4.1 OData Protocol [coprot_1]

#####5.4.1.1 [ODATA-262](https://tools.oasis-open.org/issues/browse/ODATA-262)

ODATA-262:
: "Specify how OData services can be protected against cross-site request forgery (CSRF or XSRF)" [component: OData Protocol] is **Open**.

Discussion:

* All agree to defer and revisit the issue next week.

**No further discussion**. **No objections**. 

ODATA-262:
: "Specify how OData services can be protected against cross-site request forgery (CSRF or XSRF)" [component: OData Protocol] is **Open** with no objections.

####5.4.2 OData Protocol, OData URL Conventions [coprot_urlc_1]

#####5.4.2.1 [ODATA-314](https://tools.oasis-open.org/issues/browse/ODATA-314)

ODATA-314:
: "CLONE - Please clarify the meaning of filter functions applied to DateTimeOffset values" [components: OData URL Conventions, OData Protocol] is **Open**.

Discussion:

* Mike states, the issue not ready for resolution.
* All agree to defer and revisit the issue next week.

**No further discussion**. **No objections**. 

ODATA-314:
: "CLONE - Please clarify the meaning of filter functions applied to DateTimeOffset values" [components: OData URL Conventions, OData Protocol] is **Open** with no objections.

####5.4.3 OData CSDL, OData Protocol, OData URL Conventions [cocsdl_prot_urlc_1]

#####5.4.3.1 [ODATA-126](https://tools.oasis-open.org/issues/browse/ODATA-126)

ODATA-126:
: "Metadata as an OData service" [components: OData Protocol, OData CSDL, OData URL Conventions] is **Open**.

Ralf: 
>I **move** to resolve ODATA-126 as proposed. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-126:
: "Metadata as an OData service" [components: OData Protocol, OData CSDL, OData URL Conventions] is **Resolved** with no objections.


#####5.4.3.2 [ODATA-295](https://tools.oasis-open.org/issues/browse/ODATA-295)

ODATA-295:
: "Services should be able to 'advertise' what form of change tracking they support" [components: OData Protocol, OData CSDL] is **New**.

Discussion:

* Mike summarizes the issue
* Ram asks how this would look like
* Mike gives the following code:

        <Term Name="ChangeTracking" Type="Core.ChangeTrackingType" AppliesTo="EntitySet"> 
          <Annotation Term="Core.Description" String="Change tracking capabilities of this entity set"/> 
        </Term> 
        <ComplexType Name="ChangeTrackingType"> 
          <Property Name="Supported" Type="Edm.Boiolean" DefaultValue="true"> 
            <Annotation Term="Core.Description" String="This entity set supports the odata.track-changes preferenc"/> 
          </Property> 
          <Property Name="FilterableProperties" Type="Collection(Edm.PropertyPath)" Nullable="true"> 
            <Annotation Term="Core.Description" String="Change tracking supports filters on these properties"/> 
          </Property&gt; 
          <Property Name="ExpandableProperties" Type="Collection(Edm.NavigationPropertyPath)" Nullable="true"> 
            <Annotation Term="Core.Description" String="Change tracking supports these properties expanded"/> 
          </Property> 
        </ComplexType> 
 
Mike: 
>I **move** we accept ODATA-295 as proposed. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-295:
: "Services should be able to 'advertise' what form of change tracking they support" [components: OData Protocol, OData CSDL] is **Resolved** with no objections.

####5.4.4 OData JSON Format [cojosn_1]

#####5.4.4.1 [ODATA-316](https://tools.oasis-open.org/issues/browse/ODATA-316)

ODATA-316:
: "Allow omitting properties with null or default values from responses" [component: OData JSON Format] is **Open**.

Discusssion:

* Ralf will edit the issue to update with the discussion result
* All will come back to the issue next week.

ODATA-316:
: "Allow omitting properties with null or default values from responses" [component: OData JSON Format] is **Open** with no objections.

###5.5 Issues in Proposed State since May 16, 2013

####5.5.1 OData ABNF Construction Rules, OData Protocol, OData URL Conventions [coabnf_prot_urlc_1]

#####5.5.1.1 [ODATA-398](https://tools.oasis-open.org/issues/browse/ODATA-398)

ODATA-398:
: "Define canonical function as a path segment that allows retrieving an entity by its id" [components: OData Protocol, OData ABNF Construction Rules, OData URL Conventions] is **New**.

Mike: 
>I **move** we accept ODATA-398 as proposed. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-398:
: "Define canonical function as a path segment that allows retrieving an entity by its id" [components: OData Protocol, OData ABNF Construction Rules, OData URL Conventions] is **Resolved** with no objections.

#####5.5.1.2 [ODATA-400](https://tools.oasis-open.org/issues/browse/ODATA-400)

ODATA-400:
: "Allow JSON values also in common expressions, not only in parameter aliases" [components: OData URL Conventions, OData ABNF Construction Rules] is **New**.
Discussion:

* Ralf introduces the issue and gives examples. The first URL is without and the second is with the proposal being implemented:

        http://host/service/Orders?$filter=$it eq @ref&@ref={"odata.ref":"http://host/service/ZqV5t"}

        http://host/service/Orders?$filter=$it eq {"odata.ref":"http://host/service/ZqV5t"}

* Mike thinks this is a good addition.

Mike: 
>I **move** we accept ODATA-400 as proposed. **Martin seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-400:
: "Allow JSON values also in common expressions, not only in parameter aliases" [components: OData URL Conventions, OData ABNF Construction Rules] is **Resolved** with no objections.

#####5.5.1.3 [ODATA-401](https://tools.oasis-open.org/issues/browse/ODATA-401)

ODATA-401:
: "Replace 'substringof' canonical function with 'contains'" [components: OData Protocol, OData ABNF Construction Rules, OData URL Conventions] is **New**.

Discussion:

* Mike summarizes the issue.
* Stefan likes the proposal.

Stefan: 
>I **move** to resolve ODATA-401 as proposed. **Mike seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-401:
: "Replace 'substringof' canonical function with 'contains'" [components: OData Protocol, OData ABNF Construction Rules, OData URL Conventions] is **Resolved** with no objections.

####5.5.2 OData CSDL [co_csdl_1]

#####5.5.2.1 [ODATA-397](https://tools.oasis-open.org/issues/browse/ODATA-397)

ODATA-397:
: "Lazy loading of Annotations: Add optional Attribute 'TargetNamespace' to edmx:IncludeAnnotations element" [component: OData CSDL] is **New**.

Discussion:

* Martin motivates and introduces the issue.

Martin: 
>I **move** to resolve ODATA-397 as proposed. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-397:
: "Lazy loading of Annotations: Add optional Attribute 'TargetNamespace' to edmx:IncludeAnnotations element" [component: OData CSDL] is **Resolved** with no objections.

####5.5.3 OData Protocol [coprot_2]

#####5.5.3.1 [ODATA-374](https://tools.oasis-open.org/issues/browse/ODATA-374)

ODATA-374:
: "Returning heterogeneous types for a function call" [components: OData Protocol, OData CSDL] is **New**.

Discussion:

* Mike summarizes the issue.

Mike: 
>I **move** we resolve ODATA-374 with no action as proposed. **Martin seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-374:
: "Returning heterogeneous types for a function call" [components: OData Protocol, OData CSDL] is **Closed with no action as noted in the motion** with no objections.

#####5.5.3.2 [ODATA-399](https://tools.oasis-open.org/issues/browse/ODATA-399)

ODATA-399:
: "Describe expected life cycle management of next-links inside 11.2.4.7 Server-Driven Paging" [component: OData Protocol] is **New**.

Discussion:

* Stefan summarizes the issue
* Mike states, that he was initially concerned about introducing per-client state
* Mike suggests to separate the statements for next-links and other similar (opaque) links and thus suggests the alternate proposal:

        Insert inside the Protocol work product (as of CSD01 PR), in some appropriate place, the folllowing paragraph:
        OData services are hypermedia driven services that return URLs to the client. If a client  
        subsequently requests the resource and the URL has expired, then the server SHOULD send 
        HTTP 410 Gone as the response code in case where this is feasible, else the service MUST 
        respond with a HTTP 404 Not found.

* Martin, Ralf and Stefan all like Mike's proposal
* Mike has updated the issue accordingly

Stefan: 
>I **move** to resolve ODATA-399 as updated by Mike as proposed. **Martin seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-399:
: "Describe expected life cycle management of next-links inside 11.2.4.7 Server-Driven Paging" [component: OData Protocol] is **Resolved as noted in the motion** with no objections.

#####5.5.3.3 [ODATA-402](https://tools.oasis-open.org/issues/browse/ODATA-402)

ODATA-402:
: "Require services to support $expand on navigation properties" [components: OData URL Conventions, OData Protocol] is **New**.

Discussion:

* Mike summarizes the issue.
* Martin asks to state somewhere, what the preferred way of implementation should be, if we introduce this.
* Mike will reword the suggestion accordingly
* Martin likes the spirit of the idea, but thinks the guidance needs to be added
* Martin agrees, that the proposal together with the minutes are sufficient for resolving it now

Mike: 
>I **move** we resolve ODATA-402 as proposed. **Martin seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-402:
: "Require services to support $expand on navigation properties" [components: OData URL Conventions, OData Protocol] is **Resolved** with no objections.

#####5.5.3.4 [ODATA-404](https://tools.oasis-open.org/issues/browse/ODATA-404)

ODATA-404:
: "Make Capabilities vocabulary a part of OData 4.0" [component: Vocabularies] is **New**.

Stefan: 
>I **move** to resolve ODATA-404 as proposed. **Ralf seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-404:
: "Make Capabilities vocabulary a part of OData 4.0" [component: Vocabularies] is **Resolved** with no objections.

#####5.5.3.5 [ODATA-403](https://tools.oasis-open.org/issues/browse/ODATA-403)

ODATA-403:
: "Mechanism to advertise conformance level of OData services" [components: OData Batch Processing Format, OData ATOM Format, OData Protocol, OData JSON Format, Vocabularies] is **New**.

Discussion:

* Ram summarizes the issue.
* Mike gives an example how this is accomplished:

        <Term Name="ConformanceLevel" Type="Capabilities.ConformanceLevelType" AppliesTo="EntityContainer"/>
        <EnumType Name="ConformanceLevelType">
          <Member Name="Minimal"/>
          <Member Name="Intermediate"/>
          <Member Name="Advanced"/>
        </EnumType>

Ram: 
>I **move** to resolve ODATA-404 as proposed with the understanding that the editors will add a reference to the capabilities section from conformance section. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-403:
: "Mechanism to advertise conformance level of OData services" [components: OData Batch Processing Format, OData ATOM Format, OData Protocol, OData JSON Format, Vocabularies] is **Resolved as noted in the motion** with no objections.

###5.6 Issues in Applied state

####5.6.1 OData ATOM Format, OData JSON Format, OData Protocol [coatom_json_prot_1]

#####5.6.1.1 [ODATA-379](https://tools.oasis-open.org/issues/browse/ODATA-379)

ODATA-379:
: "Ensure consistency and clear description in specification of $count for 'Delta Responses' (public comment c201305e00000)" [components: OData JSON Format, OData ATOM Format, OData Protocol] is **Applied**.

Note:
> Not processed, but kept n the minutes as to document the status Applied to support the chairs in responding to the commenter.

**No discussion**. **No objections**. 

ODATA-379:
: "Ensure consistency and clear description in specification of $count for 'Delta Responses' (public comment c201305e00000)" [components: OData JSON Format, OData ATOM Format, OData Protocol] is **Applied** with no objections.

####5.6.2 OData CSDL [cocsdl_2]

#####5.6.2.1 [ODATA-387](https://tools.oasis-open.org/issues/browse/ODATA-387)

ODATA-387:
: "Replace (at least) the second example in Section 13 of the CSDL document (public comment c201305e00002)" [component: OData CSDL] is **Applied**.

Note:
> Not processed, but kept n the minutes as to document the status Applied to support the chairs in responding to the commenter.

**No discussion**. **No objections**. 

ODATA-387:
: "Replace (at least) the second example in Section 13 of the CSDL document (public comment c201305e00002)" [component: OData CSDL] is **Applied** with no objections.

######5.6.2.1.1 End of Issue Processing [eoip]

Note:
>Time slot for issue processing gone. Skip all remaining agenda sub items of 5.


##6 Next Meeting

###6.1 Next TC meeting is conference call on May 30, 2013 during 0800-1000 PT

Agreed

##7 AOB

None.

### Meeting adjourned on 1002 PT

# Appendices

## List of Open Action Items Before the Meeting [AI_REF]

**Retrieval time stamp**: `2013-05-23 11:15 +02:00`.

AI#0018
: "Prepare Working Draft 01 (WD01) version of OData Extension for Temporal Data" [owner: Hubert Heijkers] is **Ongoing**

AI#0019
: "Prepare Working Draft 01 (WD01) version of OData Extension for XML Data" [owner: Stefan Drees] is **Ongoing** (Note: Due 2013-06-14)

AI#0020
: "Prepare Working Draft 01 (WD01) version of OData Extension for JSON Data" [owner: Susan Malaika] is **Ongoing** (Note: Due 2013-06-14)


**Note**: The actual action item processing is documented in section [4][AIH] and subsections thereof.

## Index of Issues Processed During the Meeting [IP_REF]

**Note**: The actual issue processing is documented in sections [5][IPH]. The below index has two main parts: First come the public comments (if any), second the JIRA issues. Each list of issues is sorted by ascending issue number. Noted are the ID, the summary and the reference to the relevant subsection where the issue progression has been documented:

Public Comments:

* [c201305e00008](https://lists.oasis-open.org/archives/odata-comment/201305/msg00008.html) "Deep Updates" [5.1.1][c201305e00008]
* [c201305e00009](https://lists.oasis-open.org/archives/odata-comment/201305/msg00009.html) "Attribute ContainsTarget" [5.1.2][c201305e00009]
* [c201305e00012](https://lists.oasis-open.org/archives/odata-comment/201305/msg00012.html) "Navigation Properties in Complex Types" [5.1.3][c201305e00012]

JIRA Issues:

* [ODATA-126](https://tools.oasis-open.org/issues/browse/ODATA-126) "Metadata as an OData service" [5.4.3.1][odata-126]
* [ODATA-262](https://tools.oasis-open.org/issues/browse/ODATA-262) "Specify how OData services can be protected against cross-site request forgery (CSRF or XSRF)" [5.4.1.1][odata-262]
* [ODATA-295](https://tools.oasis-open.org/issues/browse/ODATA-295) "Services should be able to 'advertise' what form of change tracking they support" [5.4.3.2][odata-295]
* [ODATA-314](https://tools.oasis-open.org/issues/browse/ODATA-314) "CLONE - Please clarify the meaning of filter functions applied to DateTimeOffset values" [5.4.2.1][odata-314]
* [ODATA-316](https://tools.oasis-open.org/issues/browse/ODATA-316) "Allow omitting properties with null or default values from responses" [5.4.4.1][odata-316]
* [ODATA-374](https://tools.oasis-open.org/issues/browse/ODATA-374) "Returning heterogeneous types for a function call" [5.5.3.1][odata-374]
* [ODATA-379](https://tools.oasis-open.org/issues/browse/ODATA-379) "Ensure consistency and clear description in specification of $count for 'Delta Responses' (public comment c201305e00000)" [5.6.1.1][odata-379]
* [ODATA-381](https://tools.oasis-open.org/issues/browse/ODATA-381) "Hanging paragraphs - all current csprd01 documents" [5.3.6][odata-381]
* [ODATA-382](https://tools.oasis-open.org/issues/browse/ODATA-382) "Conformance clauses need to refer to sections defining aspects of conformance and do so uniformly" [5.3.5][odata-382]
* [ODATA-383](https://tools.oasis-open.org/issues/browse/ODATA-383) "Number all examples in all documents" [5.3.4][odata-383]
* [ODATA-384](https://tools.oasis-open.org/issues/browse/ODATA-384) "Normative text needs to be typographically distinct from examples" [5.3.3][odata-384]
* [ODATA-385](https://tools.oasis-open.org/issues/browse/ODATA-385) "Overview wording suggestion" [5.3.2][odata-385]
* [ODATA-386](https://tools.oasis-open.org/issues/browse/ODATA-386) "odata-v4.0-csprd01-part1-protocol, 3 Data Model, appears to be an unnumbered list of definitions, with annotations defined in a separate subsection - suggest new format, etc." [5.3.1][odata-386]
* [ODATA-387](https://tools.oasis-open.org/issues/browse/ODATA-387) "Replace (at least) the second example in Section 13 of the CSDL document (public comment c201305e00002)" [5.6.2.1][odata-387]
* [ODATA-391](https://tools.oasis-open.org/issues/browse/ODATA-391) "Add query function isdefined(PropertyPath) to determine whether an instance has a property of that name" [5.2.1][odata-391]
* [ODATA-394](https://tools.oasis-open.org/issues/browse/ODATA-394) "Introduce path segment /$all for search on service and entity container level" [5.2.2][odata-394]
* [ODATA-395](https://tools.oasis-open.org/issues/browse/ODATA-395) "Simplify rule for implicit values of enumeration members" [5.2.3][odata-395]
* [ODATA-397](https://tools.oasis-open.org/issues/browse/ODATA-397) "Lazy loading of Annotations: Add optional Attribute 'TargetNamespace' to edmx:IncludeAnnotations element" [5.5.2.1][odata-397]
* [ODATA-398](https://tools.oasis-open.org/issues/browse/ODATA-398) "Define canonical function as a path segment that allows retrieving an entity by its id" [5.5.1.1][odata-398]
* [ODATA-399](https://tools.oasis-open.org/issues/browse/ODATA-399) "Describe expected life cycle management of next-links inside 11.2.4.7 Server-Driven Paging" [5.5.3.2][odata-399]
* [ODATA-400](https://tools.oasis-open.org/issues/browse/ODATA-400) "Allow JSON values also in common expressions, not only in parameter aliases" [5.5.1.2][odata-400]
* [ODATA-401](https://tools.oasis-open.org/issues/browse/ODATA-401) "Replace 'substringof' canonical function with 'contains'" [5.5.1.3][odata-401]
* [ODATA-402](https://tools.oasis-open.org/issues/browse/ODATA-402) "Require services to support $expand on navigation properties" [5.5.3.3][odata-402]
* [ODATA-403](https://tools.oasis-open.org/issues/browse/ODATA-403) "Mechanism to advertise conformance level of OData services" [5.5.3.5][odata-403]
* [ODATA-404](https://tools.oasis-open.org/issues/browse/ODATA-404) "Make Capabilities vocabulary a part of OData 4.0" [5.5.3.4][odata-404]
* [ODATA-405](https://tools.oasis-open.org/issues/browse/ODATA-405) "Deep Updates (public comment c201305e00008)" [5.1.1.1][odata-405]
* [ODATA-406](https://tools.oasis-open.org/issues/browse/ODATA-406) "Attribute ContainsTarget (public comment c201305e00009)" [5.1.2.1][odata-406]
* [ODATA-407](https://tools.oasis-open.org/issues/browse/ODATA-407) "Navigation Properties in Complex Types (public comment c201305e00012)" [5.1.3.1][odata-407]

## Timeline Reference [TL_REF]

**Note**: Please cf. the current revision of the [TC timeline](https://www.oasis-open.org/committees/download.php/49178/TC%20Timeline%205.htm).

