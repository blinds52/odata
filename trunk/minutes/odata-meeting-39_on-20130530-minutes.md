#OData meeting #39, Thursday, 30 MAY 2013, 0800 - 1000 PT

**Note**: For explanations of conventions and other formal aspects common to OData TC meeting minutes which are used in this document please cf. "[Formal Aspects of Meeting Minutes](https://www.oasis-open.org/committees/download.php/48109/formal-aspects-meeting-minutes-v1.html)".

Meeting chaired by Ram Jeyaraman

## 1 Roll call

### 1.1 Members Present:

        Dale Moberg (Axway Software)        Diane Downie (Citrix Systems)        Edmond Bourne (BlackBerry) a.k.a. Ed        Hubert Heijkers (IBM)        Jeffrey Turpin (Axway Software)        Ken Baclawski (Northeastern University)        Martin Zurmuehl (SAP AG)        Matthew Borges (SAP AG) a.k.a. Matt        Michael Pizzo (Microsoft) a.k.a. Mike        Nuno Linhares (SDL)        Ralf Handl (SAP AG)        Ram Jeyaraman (Microsoft)        Stan Mitranic (CA Technologies)        Stefan Drees (Individual)        Susan Malaika (IBM)        Ted Jones (Red Hat)

Quorum achieved. Details cf. [normative attendance sheet for this meeting](https://www.oasis-open.org/apps/org/workgroup/odata/event.php?event_id=34199).

## 2 Approval of Agenda

Agenda approved as published.

## 3 Approval of Minutes from Previous Meeting(s)

### 3.1 Approval of [Minutes of 2013-05-23 Meeting#38](https://www.oasis-open.org/committees/download.php/49325/odata-meeting-38_on-20130523-minutes.html)


**Meeting minutes approved with no objections**.

##4 Review of [Action Items](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_items.php) (AI) and Progress [AIH]

Context:
> See the "[List of Open Action Items Before the Meeting][AI_REF]" section in the appendix.

###4.1 Action items due by 2013-05-30 (end of day)

None.

###4.2 Action items NOT due by 2013-05-30 (end of day) but MAY be ready for closure

None.

##5 Preparing towards Committee Specification Draft 02

###5.1 State of pending issues

Reminder:
> as discussed earlier, please file significant technical issues by June 2nd.

Discussion:

* Ram reminds all on key goal of CSD02 to reach closure on all main issues
* Ram asks if anyone knows of issues wich are not filed yet
* No one knows of issues, that not have been filed yet

**No further discussion**. **No objections**.

##6 Review of [Issues List](https://tools.oasis-open.org/issues/secure/IssueNavigator.jspa?reset=true&mode=hide&pid=10103&sorter/field=issuekey&sorter/order=ASC) (IL) and Progress [IPH]

**Notes**:

* Issues in this section (6) may have been progressed out of sequence, but have been noted here to better group by components impacted as a service for the reader.
* There is an "[Index of Issues Processed During the Meeting][IP_REF]" section in the appendix.


###6.1 Issues in Proposed state (may need deeper discussion) (carried over from May 9, 2013)

####6.1.1 OData Protocol [coprot_1]

#####6.1.1.1 [ODATA-262](https://tools.oasis-open.org/issues/browse/ODATA-262)

ODATA-262:
: "Specify how OData services can be protected against cross-site request forgery (CSRF or XSRF)" [component: OData Protocol] is **Open**.

Discussion:

* Mike summarizes the issue and suggests to add this as a best practice recommendation to the spec, as he is not aware of a normative reference we could simply point to.
* Mike continues explaining, that if the spec recomends this, we would need to give guidance to clients on how a service might expect interaction
* Ed asks, why we should be concerned
* Mike explains, that we need to instruct the library creators, what headers are to be expected in read and write
* Ed wonders, if sending such a header with every request might become a volume problem over the air
* Stefan responds, that CSRF attacks are to be defended on a per request basis due to the nature of the attack category.
* Ralf amends, that only PATCH, PUT, POST and DELETE requests (data modification) need provide this token
* Mike adds, that the only occurence in GET requests is how the client requests the token from the server
* Mike suggests in the light of the ongoing discussion to push back that topic to the face to face, so the members collect further info before deciding on this one
* All agree.
* Ted points to [www.owasp.org's Cross-Site_Request_Forgery General Recommendation: Synchronizer Token Pattern](https://www.owasp.org/index.php/Cross-Site_Request_Forgery_%28CSRF%29_Prevention_Cheat_Sheet#General_Recommendation:_Synchronizer_Token_Pattern)
* Ralf suggests to maybe refactor these recommendations into the second non-normative Note of the TC
* All think this is a good idea.
* Ralf puts the link to other documentation which might be used as reference into the issue: [SAP's NetWeaver Gateway Cross-Site Request Forgery Protection](http://help.sap.com/saphelp_gateway20sp05/helpdata/en/e6/cae27d5e8d4996add4067280c8714e/frameset.htm) 

**No further discussion**. **No objections**. 

ODATA-262:
: "Specify how OData services can be protected against cross-site request forgery (CSRF or XSRF)" [component: OData Protocol] is **Open** with no objections.

####6.1.2 OData Protocol, OData URL Conventions [coprot_urlc_1]

#####6.1.2.1 [ODATA-314](https://tools.oasis-open.org/issues/browse/ODATA-314)

ODATA-314:
: "CLONE - Please clarify the meaning of filter functions applied to DateTimeOffset values" [components: OData URL Conventions, OData Protocol] is **Open**.

Discussion:

* Mike states, that we still need some time to discuss this
* Ralf reminds, that we need to document the discussions in that regard, as there already is a third proposal for that issues resolution.
* All shortly discuss the distinct proposals and why they were not chosen until now. Although alternative C might become the suggested resolution
 
**No further discussion**. **No objections**. 

ODATA-314:
: "CLONE - Please clarify the meaning of filter functions applied to DateTimeOffset values" [components: OData URL Conventions, OData Protocol] is **Open** with no objections.

####6.1.3 OData JSON Format [cojson_1]

#####6.1.3.1 [ODATA-316](https://tools.oasis-open.org/issues/browse/ODATA-316)

ODATA-316:
: "Services MUST NOT omit structural properties from responses unless asked to do so via $select" [component: OData JSON Format] is **Open**.

Discussion:

* Mike shortly summarizes the issue and its state of discussion but thinks the issue is not ready for resolution.
* All agree.

**No further discussion**. **No objections**. 

ODATA-316:
: "Services MUST NOT omit structural properties from responses unless asked to do so via $select" [component: OData JSON Format] is **Open** with no objections.

###6.2 Issues in Proposed state since May 23, 2013

####6.2.1 Vocabularies [covoca_1]

#####6.2.1.1 [ODATA-410](https://tools.oasis-open.org/issues/browse/ODATA-410)

ODATA-410:
: "Consider moving terms OptimisticConcurrencyControl and AcceptableMediaTypes from Core to Capabilities" [component: Vocabularies] is **New**.

Discussion:

* Ralf summarizes the issue and why it is proposed to be closed without action.

Stefan: 
>I **move** to close ODATA-410 as proposed. **Ralf seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-410:
: "Consider moving terms OptimisticConcurrencyControl and AcceptableMediaTypes from Core to Capabilities" [component: Vocabularies] is **Closed** with no objections.

####6.2.2 OData CSDL [cocsdl_1]

#####6.2.2.1 [ODATA-411](https://tools.oasis-open.org/issues/browse/ODATA-411)

ODATA-411:
: "Reconsider placement and semantics of OnDelete element" [component: OData CSDL] is **New**.

Discussion:

* Ralf summarizes the issue and its history.

Hubert: 
>I **move** to resolve OData-411 as proposed. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-411:
: "Reconsider placement and semantics of OnDelete element" [component: OData CSDL] is **Resolved** with no objections.

#####6.2.2.2 [ODATA-418](https://tools.oasis-open.org/issues/browse/ODATA-418)

ODATA-418:
: "EntitySet attribute or NavigationPropertyBinding child elements for Named Entities (edm:Entity)" [component: OData CSDL] is **New**.

Discussion:

* Ralf summarizes the issue that resulted from an internal review.
* All discuss scenarios of singletons, types, entitysets and entities not living in any set.
* Mike updates the proposal in JIRA to sync with the discussion as: "Allow edm:NavigationPropertyBinding child elements in the edm:Entity to express into which entity sets its navigation properties will lead. Allow a NavigationPropertyBinding to indicate a named entity as well as an entity set."

Ralf: 
>I **move** to resolve ODATA-418 as proposed. **Hubert seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-418:
: "EntitySet attribute or NavigationPropertyBinding child elements for Named Entities (edm:Entity)" [component: OData CSDL] is **Resolved** with no objections.

#####6.2.2.3 [ODATA-287](https://tools.oasis-open.org/issues/browse/ODATA-287)

ODATA-287:
: "Consider adding a primitive type that corresponds with JSR 310 (JDK 1.8 time API) ZonedDateTime" [component: OData CSDL] is **New**.

Discussion:

* Ralf summarizes the issue reported by Evan and that the proposal is to defer this to a later version i.e. version 5.0

Mik: 
>I **move** to resolve ODATA-287 as proposed by deferring to v5.0. **Ralf seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-287:
: "Consider adding a primitive type that corresponds with JSR 310 (JDK 1.8 time API) ZonedDateTime" [component: OData CSDL] is **Deferred as noted in the motion** with no objections.

#####6.2.2.4 [ODATA-220](https://tools.oasis-open.org/issues/browse/ODATA-220)

ODATA-220:
: "Please consider the restoration of DateTime (without offset)" [component: OData CSDL] is **New**.

Discussion:

* Ralf summarizes the issue reported by Evan and that similarly to ODATA-287 the proposal is to defer this to a later version i.e. version 5.0.

Mike: 
>I **move** we resolve ODATA-220 as proposed by deferring to version 5.0. **Ed seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-220:
: "Please consider the restoration of DateTime (without offset)" [component: OData CSDL] is **Deferred as noted in the motion** with no objections.

####6.2.3 OData ATOM Format, OData JSON Format, OData Protocol [coatom_json_prot_1]

#####6.2.3.1 [ODATA-412](https://tools.oasis-open.org/issues/browse/ODATA-412)

ODATA-412:
: "Consistent representation of empty values" [components: OData JSON Format, OData ATOM Format, OData Protocol] is **New**.

Discussion:

* Ralf summarizes the issue and it's proposal

Mike: 
>I **move** we resolve ODATA-412 as proposed. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-412:
: "Consistent representation of empty values" [components: OData JSON Format, OData ATOM Format, OData Protocol] is **Resolved** with no objections.

#####6.2.3.2 [ODATA-422](https://tools.oasis-open.org/issues/browse/ODATA-422)

ODATA-422:
: "Add metadata URL to representations of entity references, define format for collections of references" [components: OData JSON Format, OData ATOM Format, OData Protocol] is **New**.

Discussion:

* Ralf summarizes the issue and the proposal.
* Mike emphasizes, that this is not only a clean up but also a technical change.
* Mike mentions ODATA-421 "Remove odata.kind from JSON and add metadata URL templates for link, deletedLink, and deletedEntity" as related
* Mike suggests, to after motion on ODATA-422 process ODATA-421
* All agree

Stefan: 
>I **move** to resolve ODATA-422 as proposed. **Ralf seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-422:
: "Add metadata URL to representations of entity references, define format for collections of references" [components: OData JSON Format, OData ATOM Format, OData Protocol] is **Resolved** with no objections.

####6.2.4 OData ABNF Construction Rules, OData Protocol, OData URL Conventions [coabnf_prot_urlc_1]

#####6.2.4.1 [ODATA-414](https://tools.oasis-open.org/issues/browse/ODATA-414)

ODATA-414:
: "Fix syntax for deleting links to support containment" [components: OData Protocol, OData ABNF Construction Rules, OData URL Conventions] is **New**.

Discussion:

* Mike summarizes and motivates the issue.
* Hubert asks on details of the containment part of the proposal
* Discussion centers around "DELETE ~Products(5)/OrderedIn/$ref?$id=Orders(1)/Lines(5)"
* Mike states, that when applying the editors only need to make a small change to make it more explicit what to refer to

**No further discussion**. **No objections**.

Mike: 
>I **move** we accept ODATA-414 as proposed. **Hubert seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-414:
: "Fix syntax for deleting links to support containment" [components: OData Protocol, OData ABNF Construction Rules, OData URL Conventions] is **Resolved** with no objections.

####6.2.5 OData Protocol [coprot_2]

#####6.2.5.1 [ODATA-420](https://tools.oasis-open.org/issues/browse/ODATA-420)

ODATA-420:
: "Response codes 404 and 405: MUST instead of SHOULD" [component: OData Protocol] is **New**.

Discussion:

* Ralf summarizes the issue.
* Mike commented, that we use SHOULD instead of MUST in error situations, as otherwise the service might be incapable of being compliant, as only returning one error is possible.
* Stefan mentions, that also an OData application might not be able to enforce any sequence hierarchy in error handling esp. with HTTP 404 and 405 as a separation of concerns might simply forbid policy changes on the server by a single application
* Mike suggests to completely stay away from SHOULD and MUST in these areas (and other related ones)
* Both Ralf and Stefan are fine with that
* Mike rewords the proposal accordingly in JIRA as: "rewrite descriptions so as not to make a conformance statement"
* Mike also mentions, that we also in other places we use SHOULD, MUST, MAY more often then we should.

Stefan: 
>I **move** we resolve ODATA-420 as proposed. **Mike seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-420:
: "Response codes 404 and 405: MUST instead of SHOULD" [component: OData Protocol] is **Resolved** with no objections.

####6.2.6 OData ATOM Format, OData JSON Format, OData URL Conventions [coatom_json_urlc_1]

#####6.2.6.1 [ODATA-417](https://tools.oasis-open.org/issues/browse/ODATA-417)

ODATA-417:
: "Define content negotiation and default format for paths ending in /$value, /$count, /$metadata and /$batch" [components: OData JSON Format, OData ATOM Format, OData URL Conventions] is **New**.

Discussion:

* Ralf summarizes and motivates the issue.
* Hubert and Ralf clarify, that this only became an isue, as there are multiple representations of GML or GeoJSON allowed.

Ralf: 
>I **move** to resolve ODATA-417 as proposed, also reserving application/atom+xml for $metadata. **Hubert seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-417:
: "Define content negotiation and default format for paths ending in /$value, /$count, /$metadata and /$batch" [components: OData JSON Format, OData ATOM Format, OData URL Conventions] is **Resolved as noted in the motion** with no objections.

####6.2.7 OData JSON Format, OData Protocol [cojson_prot_1]

#####6.2.7.1 [ODATA-421](https://tools.oasis-open.org/issues/browse/ODATA-421)

ODATA-421:
: "Remove odata.kind from JSON and add metadata URL templates for link, deletedLink, and deletedEntity" [components: OData Protocol, OData JSON Format] is **New**.

Discussion:

* Mike summarizes the issue and it's relation to ODATA-422.

Mike: 
>I **move** we accept ODATA-421 as proposed. **Ralf seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-421:
: "Remove odata.kind from JSON and add metadata URL templates for link, deletedLink, and deletedEntity" [components: OData Protocol, OData JSON Format] is **Resolved** with no objections.

####6.2.8 OData CSDL, OData URL Conventions [cocsdl_urlc_1]

#####6.2.8.1 [ODATA-413](https://tools.oasis-open.org/issues/browse/ODATA-413)

ODATA-413:
: "Replace conformance clauses in URL and CSDL with references to Protocol" [components: OData URL Conventions, OData CSDL] is **New**.

Discussion:

* Ram reports, that the TC admin is fine with the suggestion to concentrate all conformance clauses in part 1 protocol instead of distributing it over protocol, csdl and url conventions
* Mike has a preference of keeping the conformance section inside the CSDL but he could live with refactoring
* Mike mentions code generators based on CSDL alone as in Microsoft Visual Studio, that only should have to look at CSDL document to claim conformance
* All discuss, if conformance in CSDL should point back to protocol or only contain clauses pointing inside its own document
* Ralf mentions, that we already have to reword the conformance clauses and doubts if anyone could write an application without understanding the protocol
* Discussion on separation of concerns continues
* All agree to draft a revised proposal

**No further discussion**. **No objections**. 

ODATA-413:
: "Replace conformance clauses in URL and CSDL with references to Protocol" [components: OData URL Conventions, OData CSDL] is **Open** with no objections.

###6.3 Issues in Applied state

Discussion:

* Ram asks how the members like to proceed
* Stefan suggests to close the issues [ODATA-401](https://tools.oasis-open.org/issues/browse/ODATA-401), [ODATA-400](https://tools.oasis-open.org/issues/browse/ODATA-400), [ODATA-398](https://tools.oasis-open.org/issues/browse/ODATA-398), [ODATA-394](https://tools.oasis-open.org/issues/browse/ODATA-394), [ODATA-228](https://tools.oasis-open.org/issues/browse/ODATA-228), [ODATA-393](https://tools.oasis-open.org/issues/browse/ODATA-393), [ODATA-375](https://tools.oasis-open.org/issues/browse/ODATA-375), [ODATA-165](https://tools.oasis-open.org/issues/browse/ODATA-165), [ODATA-407](https://tools.oasis-open.org/issues/browse/ODATA-407), [ODATA-389](https://tools.oasis-open.org/issues/browse/ODATA-389), [ODATA-388](https://tools.oasis-open.org/issues/browse/ODATA-388), [ODATA-384](https://tools.oasis-open.org/issues/browse/ODATA-384), [ODATA-383](https://tools.oasis-open.org/issues/browse/ODATA-383), [ODATA-380](https://tools.oasis-open.org/issues/browse/ODATA-380), [ODATA-379](https://tools.oasis-open.org/issues/browse/ODATA-379), [ODATA-378](https://tools.oasis-open.org/issues/browse/ODATA-378), [ODATA-351](https://tools.oasis-open.org/issues/browse/ODATA-351), [ODATA-346](https://tools.oasis-open.org/issues/browse/ODATA-346), [ODATA-153](https://tools.oasis-open.org/issues/browse/ODATA-153), [ODATA-102](https://tools.oasis-open.org/issues/browse/ODATA-102), [ODATA-406](https://tools.oasis-open.org/issues/browse/ODATA-406), [ODATA-397](https://tools.oasis-open.org/issues/browse/ODATA-397), [ODATA-396](https://tools.oasis-open.org/issues/browse/ODATA-396), [ODATA-395](https://tools.oasis-open.org/issues/browse/ODATA-395), [ODATA-387](https://tools.oasis-open.org/issues/browse/ODATA-387), [ODATA-373](https://tools.oasis-open.org/issues/browse/ODATA-373), [ODATA-370](https://tools.oasis-open.org/issues/browse/ODATA-370), [ODATA-365](https://tools.oasis-open.org/issues/browse/ODATA-365), [ODATA-364](https://tools.oasis-open.org/issues/browse/ODATA-364), [ODATA-390](https://tools.oasis-open.org/issues/browse/ODATA-390), [ODATA-376](https://tools.oasis-open.org/issues/browse/ODATA-376), [ODATA-152](https://tools.oasis-open.org/issues/browse/ODATA-152), [ODATA-409](https://tools.oasis-open.org/issues/browse/ODATA-409), [ODATA-408](https://tools.oasis-open.org/issues/browse/ODATA-408), [ODATA-403](https://tools.oasis-open.org/issues/browse/ODATA-403), [ODATA-402](https://tools.oasis-open.org/issues/browse/ODATA-402), [ODATA-399](https://tools.oasis-open.org/issues/browse/ODATA-399), [ODATA-385](https://tools.oasis-open.org/issues/browse/ODATA-385), [ODATA-371](https://tools.oasis-open.org/issues/browse/ODATA-371), [ODATA-369](https://tools.oasis-open.org/issues/browse/ODATA-369), [ODATA-368](https://tools.oasis-open.org/issues/browse/ODATA-368), [ODATA-367](https://tools.oasis-open.org/issues/browse/ODATA-367), [ODATA-366](https://tools.oasis-open.org/issues/browse/ODATA-366), [ODATA-295](https://tools.oasis-open.org/issues/browse/ODATA-295), [ODATA-290](https://tools.oasis-open.org/issues/browse/ODATA-290), [ODATA-392](https://tools.oasis-open.org/issues/browse/ODATA-392), [ODATA-375](https://tools.oasis-open.org/issues/browse/ODATA-375), and [ODATA-404](https://tools.oasis-open.org/issues/browse/ODATA-404) in a grouping motion as they have been visible for some time now
* Mike suggests to further collect applied issues for a grouping motion during the face to face meeting, as he assumes, that the other members maybe had not the time to follow the pace of changes as demonstrated by the editors in applying
* Ram will send an email to the list that names the issues, so that all will be prepared to approve in a single motion during face to face meeting
* All agree.

##7 Next Meeting

###7.1 Next TC meeting is conference call on Jun 06, 2013 during 0800-1000 PT

Agreed

###7.2 Next TC meeting is face to face meeting on Jun 13, 2013 and Jun 14, 2013

Discussion:

* Mike notes, that everyone participating in person shall notify him, so as every preparation is possible
* Matt got approval today, so will be able to attend in person
* Regrets from Nuno

##8 AOB

None.

### Meeting adjourned on 0949 PT

# Appendices

## List of Open Action Items Before the Meeting [AI_REF]

**Retrieval time stamp**: `2013-05-30 15:00 +02:00`.

AI#0018
: "Prepare Working Draft 01 (WD01) version of OData Extension for Temporal Data" [owner: Hubert Heijkers] is **Ongoing**

AI#0019
: "Prepare Working Draft 01 (WD01) version of OData Extension for XML Data" [owner: Stefan Drees] is **Ongoing** (Note: Due 2013-06-14)

AI#0020
: "Prepare Working Draft 01 (WD01) version of OData Extension for JSON Data" [owner: Susan Malaika] is **Ongoing** (Note: Due 2013-06-14)


**Note**: The actual action item processing is documented in section [4][AIH] and subsections thereof.

## Index of Issues Processed During the Meeting [IP_REF]

**Note**: The actual issue processing is documented in sections [6][IPH]. The below index has two main parts: First come the public comments (if any), second the JIRA issues. Each list of issues is sorted by ascending issue number. Noted are the ID, the summary and the reference to the relevant subsection where the issue progression has been documented:

Public Comments:

None.

JIRA Issues:

* [ODATA-220](https://tools.oasis-open.org/issues/browse/ODATA-220) "Please consider the restoration of DateTime (without offset)" [6.2.2.4][odata-220]
* [ODATA-262](https://tools.oasis-open.org/issues/browse/ODATA-262) "Specify how OData services can be protected against cross-site request forgery (CSRF or XSRF)" [6.1.1.1][odata-262]
* [ODATA-287](https://tools.oasis-open.org/issues/browse/ODATA-287) "Consider adding a primitive type that corresponds with JSR 310 (JDK 1.8 time API) ZonedDateTime" [6.2.2.3][odata-287]
* [ODATA-314](https://tools.oasis-open.org/issues/browse/ODATA-314) "CLONE - Please clarify the meaning of filter functions applied to DateTimeOffset values" [6.1.2.1][odata-314]
* [ODATA-316](https://tools.oasis-open.org/issues/browse/ODATA-316) "Services MUST NOT omit structural properties from responses unless asked to do so via $select" [6.1.3.1][odata-316]
* [ODATA-410](https://tools.oasis-open.org/issues/browse/ODATA-410) "Consider moving terms OptimisticConcurrencyControl and AcceptableMediaTypes from Core to Capabilities" [6.2.1.1][odata-410]
* [ODATA-411](https://tools.oasis-open.org/issues/browse/ODATA-411) "Reconsider placement and semantics of OnDelete element" [6.2.2.1][odata-411]
* [ODATA-412](https://tools.oasis-open.org/issues/browse/ODATA-412) "Consistent representation of empty values" [6.2.3.1][odata-412]
* [ODATA-413](https://tools.oasis-open.org/issues/browse/ODATA-413) "Replace conformance clauses in URL and CSDL with references to Protocol" [6.2.8.1][odata-413]
* [ODATA-414](https://tools.oasis-open.org/issues/browse/ODATA-414) "Fix syntax for deleting links to support containment" [6.2.4.1][odata-414]
* [ODATA-417](https://tools.oasis-open.org/issues/browse/ODATA-417) "Define content negotiation and default format for paths ending in /$value, /$count, /$metadata and /$batch" [6.2.6.1][odata-417]
* [ODATA-418](https://tools.oasis-open.org/issues/browse/ODATA-418) "EntitySet attribute or NavigationPropertyBinding child elements for Named Entities (edm:Entity)" [6.2.2.2][odata-418]
* [ODATA-420](https://tools.oasis-open.org/issues/browse/ODATA-420) "Response codes 404 and 405: MUST instead of SHOULD" [6.2.5.1][odata-420]
* [ODATA-421](https://tools.oasis-open.org/issues/browse/ODATA-421) "Remove odata.kind from JSON and add metadata URL templates for link, deletedLink, and deletedEntity" [6.2.7.1][odata-421]
* [ODATA-422](https://tools.oasis-open.org/issues/browse/ODATA-422) "Add metadata URL to representations of entity references, define format for collections of references" [6.2.3.2][odata-422]

## Timeline Reference [TL_REF]

**Note**: Please cf. the current revision of the [TC timeline](https://www.oasis-open.org/committees/download.php/49178/TC%20Timeline%205.htm).

