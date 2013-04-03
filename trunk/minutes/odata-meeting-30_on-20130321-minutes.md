#OData meeting #30, Thursday, 21 Mar 2013, 0800 - 1000 PT

**Note**: For explanations of conventions and other formal aspects common to OData TC meeting minutes which are used in this document please cf. "[Formal Aspects of Meeting Minutes](https://www.oasis-open.org/committees/download.php/48109/formal-aspects-meeting-minutes-v1.html)". 

Meeting chaired by Barbara Hartel and Ram Jeyaraman 

Acting Chair: Barbara Hartel 

## 1 Roll call
 
### 1.1 Members Present: 

        Andrew Eisenberg (IBM)        Anila Kumar GVN (CA Technologies)        Barbara Hartel (SAP AG)        Dale Moberg (Axway Software)        Diane Downie (Citrix Systems)        Gerald Krause (SAP AG)        Jeffrey Turpin (Axway Software)        John Willson (Individual)        Ken Baclawski (Northeastern University)        Martin Zurmuehl (SAP AG)        Michael Pizzo (Microsoft) a.k.a. Mike        Patrick Durusau (Individual)        Ralf Handl (SAP AG)        Ram Jeyaraman (Microsoft)        Robert Richards (Mashery)        Stan Mitranic (CA Technologies)        Stefan Drees (Individual)        Susan Malaika (IBM)        Ted Jones (Red Hat)

Quorum achieved. Details cf. [normative attendance sheet for this meeting](https://www.oasis-open.org/apps/org/workgroup/odata/event.php?event_id=34189).

## 2 Approval of Agenda

Agenda approved as published. 

## 3 Approval of Minutes from Previous Meeting(s)

### 3.1 Approval of [Minutes of 2013-03-14 Meeting#29](https://www.oasis-open.org/committees/download.php/48554/odata-meeting-29_on-20130314-minutes.html)

**Meeting minutes approved with no objections**. 

##4 Review of [Action Items](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_items.php) (AI) and Progress [AIH]

Context:
> See the "[List of Open Action Items Before the Meeting][AI_REF]" section in the appendix.
  
###4.1 Action items due by 2013-03-21 (end of day)

None.

###4.2 Action items NOT due by 2013-03-21 (end of day) but MAY be ready for closure

None.

##5 Review of [Issues List](https://tools.oasis-open.org/issues/secure/IssueNavigator.jspa?reset=true&mode=hide&pid=10103&sorter/field=issuekey&sorter/order=ASC) (IL) and Progress [IPH]

**Notes**:

* Issues in this section (5) may have been progressed out of sequence, but have been noted here to better group by components impacted as a service for the reader.
* There is an "[Index of Issues Processed During the Meeting][IP_REF]" section in the appendix.

###5.1 Issues in Proposed state (carried over from Feb 21, 2013 TC meeting)

####5.1.1 OData JSON Format, OData Protocol [cojson_prot1]

#####5.1.1.1 [ODATA-283](https://tools.oasis-open.org/issues/browse/ODATA-283)

ODATA-283:
: "Accept-Charset HTTP Request Header and charset content-type parameter" [components: OData Protocol, OData JSON Format] is **Open**.

Discussion:

* Mike and Ralf state, that HTTP is somehow inconsistent with the usage here and that some clients might not be able to handle some parts
* Mike amends the proposal during the meeting discussion inside JIRA, thus updates the proposal

Mike: 
>I **move** we resolve ODATA-283 by saying that the Accept-Charset header has priority, and the service MUST NOT return a charset=format parameter unless specified in the request. **Ralf seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-283:
: "Accept-Charset HTTP Request Header and charset content-type parameter" [components: OData Protocol, OData JSON Format] is **Resolved as noted in the motion** with no objections.

###5.2 Issues in Proposed state (since March 14, 2013)

####5.2.1 OData CSDL [cocsdl1]

#####5.2.1.1 [ODATA-239](https://tools.oasis-open.org/issues/browse/ODATA-239)

ODATA-239:
: "Allowing expressions to be passed as parameters to (super) functions" [component: OData CSDL] is **New**.

Discussion:

* All think, the issues proposal needs polishing but should be opened, to support further discussing it offline.

**No further discussion**. **No objections**. 

ODATA-239:
: "Allowing expressions to be passed as parameters to (super) functions" [component: OData CSDL] is **Open** with no objections.

#####5.2.1.2 [ODATA-266](https://tools.oasis-open.org/issues/browse/ODATA-266)

ODATA-266:
: "Strengthen the requirements for the URL Attribute in edmx:Reference and edmx:AnnotationReference" [component: OData CSDL] is **New**.

Discussion:

* All discuss about the place where to document the levels of requirements.
* All think, the issues proposal needs changes but should be opened, to support further discussing it.

**No further discussion**. **No objections**. 

Martin: 
>I **move** as proposal to change in subchapter 4.4.1 and 4.3.1 of the csdl part 3 specification the sentence "The URL may be backed by a CSDL document describing the referenced model" to "The URL SHOULD be backed by a CSDL document describing the referenced model". If it's NOT backed, it should be well known. **Mike seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-266:
: "Strengthen the requirements for the URL Attribute in edmx:Reference and edmx:AnnotationReference" [component: OData CSDL] is **Resolved as noted in the motion** with no objections.

#####5.2.1.3 [ODATA-271](https://tools.oasis-open.org/issues/browse/ODATA-271)

ODATA-271:
: "Support IsAlwaysBindable through annotation, rather than attribute of function/action" [component: OData CSDL] is **New**.

Discussion:

* Mike shortly summarizes the issue and the discussion
* All agree to take the discussion further offline, thus open the issue.

**No further discussion**. **No objections**.

ODATA-271:
: "Support IsAlwaysBindable through annotation, rather than attribute of function/action" [component: OData CSDL] is **Open** with no objections.

#####5.2.1.4 [ODATA-299](https://tools.oasis-open.org/issues/browse/ODATA-299)

ODATA-299:
: "Should Duration be renamed DayTimeDuration in anticipation that we may wish to add YearMonthDuration at a later point?" [component: OData CSDL] is **New**.

Stefan: 
>I **move** to close ODATA-299 without action. **Martin seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-299:
: "Should Duration be renamed DayTimeDuration in anticipation that we may wish to add YearMonthDuration at a later point?" [component: OData CSDL] is **Closed as noted in the motion** with no objections.

#####5.2.1.5 [ODATA-303](https://tools.oasis-open.org/issues/browse/ODATA-303)

ODATA-303:
: "Support abstract entity types without key properties" [component: OData CSDL] is **New**.

Discussion:

* Martin asks for a more precise description on when a key may be defined and if it might be added properties at some later point in time
* Mike amends the proposal during the meeting discussion inside JIRA, thus updates the proposal
* Mike added to the proposal in JIRA: "Note: the key must only be defined once. If a base type defines a key the derived type must not define the key".

Martin: 
>I **move** to resolve ODATA-303 as proposed with the additions discussed. **Mike seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-303:
: "Support abstract entity types without key properties" [component: OData CSDL] is **Resolved as noted in the motion** with no objections.

#####5.2.1.6 [ODATA-304](https://tools.oasis-open.org/issues/browse/ODATA-304)

ODATA-304:
: "Add TargetKey attribute to &lt;PropertyRef&gt; within a &lt;ReferentialConstraint&gt;" [component: OData CSDL] is **New**.

Discussion:

* Mike shortly summarizes the issue and gives a sample for the suggested new format:

        <NavigationProperty Name="Category" Type="Self.Category" Nullable="false"> 
          <ReferentialConstraint Property="CategoryID" RelatedProperty="Id"/> 
          <OnDelete Action="Cascade" /> 
        </NavigationProperty>

* All discuss to find the optimal name for the referenced property    
* Mike amends the JIRA ticket during discussion accordingly. The proposal (informative) now states: 'Make the ReferentialConstraint a direct child of the NavigationProperty element, with attributes "Property" and "ReferencedProperty".'   

Martin: 
>I **move** to resolve 304 as proposed. **Mike seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-304:
: "Add TargetKey attribute to &lt;PropertyRef&gt; within a &lt;ReferentialConstraint&gt;" [component: OData CSDL] is **Resolved** with no objections.

#####5.2.1.7 [ODATA-305](https://tools.oasis-open.org/issues/browse/ODATA-305)

ODATA-305:
: "Annotations: introduce path segment to address the count of a collection" [component: OData CSDL] is **New**.

Martin: 
>I **move** to resolve 305 as proposed. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-305:
: "Annotations: introduce path segment to address the count of a collection" [component: OData CSDL] is **Resolved** with no objections.

####5.2.2 OData Protocol OData URL Conventions [coprot_urlc1]

#####5.2.2.1 [ODATA-9](https://tools.oasis-open.org/issues/browse/ODATA-9)

ODATA-9:
: "allow expressions in the $select query option" [components: OData URL Conventions, OData Protocol] is **New**.

Mike: 
>I **move** we defer ODATA-9 to be considered in version 5.0. **Martin seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-9:
: "allow expressions in the $select query option" [components: OData URL Conventions, OData Protocol] is **Deferred as noted in the motion** with no objections.

#####5.2.2.2 [ODATA-10](https://tools.oasis-open.org/issues/browse/ODATA-10)

ODATA-10:
: "operator that returns the content of a Stream as either a String or Binary value" [components: OData URL Conventions, OData Protocol] is **New**.

Stefan: 
>I **move** we defer ODATA-10 to be considered in version 5.0. **Mike seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-10:
: "operator that returns the content of a Stream as either a String or Binary value" [components: OData URL Conventions, OData Protocol] is **Deferred as noted in the motion** with no objections.

####5.2.3 OData Protocol [coprot1]

#####5.2.3.1 [ODATA-262](https://tools.oasis-open.org/issues/browse/ODATA-262)

ODATA-262:
: "Specify how OData services can be protected against cross-site request forgery (CSRF or XSRF)" [component: OData Protocol] is **Open**.

Discussion:

* All agree to still defer the discussion.

ODATA-262:
: "Specify how OData services can be protected against cross-site request forgery (CSRF or XSRF)" [component: OData Protocol] is **Open** with no objections.

#####5.2.3.2 [ODATA-297](https://tools.oasis-open.org/issues/browse/ODATA-297)

ODATA-297:
: "State explicitly if Content-Length is required, and if so, for which request types it is required" [component: OData Protocol] is **New**.

Discussion:

* Martin states, that this might be a required header for batches.
* All agree to defer further discussion until this has been fully investigated.

**No further discussion**. **No objections**. 

ODATA-297:
: "State explicitly if Content-Length is required, and if so, for which request types it is required" [component: OData Protocol] is **Open** with no objections.

#####5.2.3.3 [ODATA-301](https://tools.oasis-open.org/issues/browse/ODATA-301)

ODATA-301:
: "Guidance around data authorization model and secure authenticated access to an OData Service" [component: OData Protocol] is **New**.

Discussion:

* Stefan does not oppose the proposal, but asks why basic authentication is required for interoperabilty adn if there are use cases (since interoperability might push more insecure solutions).
* Ralf explains, that this is due to every browser can handle basic auth, thus the motivation is more to be interoperable with the majoreity of (browser) clients

Ralf: 
>I **move** to resolve ODATA-301 as proposed. **Martin seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-301:
: "Guidance around data authorization model and secure authenticated access to an OData Service" [component: OData Protocol] is **Resolved** with no objections.

#####5.2.3.4 [ODATA-165](https://tools.oasis-open.org/issues/browse/ODATA-165)

ODATA-165:
: "Support Cross-joins" [component: OData Protocol] is **Open**.

Discussion:

* Stefan shortly summarizes the proposal (which in JIRA is noted inside his comment)
* Ralf likes it, as long it is not required, since - as noted in his JIRA comment this capability requires a powerful query processor.
* Mike agrees and further suggests to resolve ODATA-165 as proposed, supporting the ability to root queries at the entity container, but that these not be required functionality for V4.
* All agree, that the current proposal sufficiently implements this. 
* Stefan copies the discussed proposed solution from his comment into the JIRA field during the discussion

Stefan: 
>I **move** to resolve ODATA-165 as proposed. **Martin seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-165:
: "Support Cross-joins" [component: OData Protocol] is **Resolved** with no objections.

###5.3 Introduction to conformance levels.

Context:
> Uploaded current revision of [Conformance Levels](https://www.oasis-open.org/committees/download.php/48595/OData%20Service%20Conformance%20Levels.docx).

Discussion:

* Mike presents the uploaded document
* John asks, what is the relation to security level of conformance as per OData-262 "Specify how OData services can be protected against cross-site request forgery (CSRF or XSRF)"?
* Mike kindly requests feedback on the document, so that the conformance levels suggested in it for per protocol and per format conformance may be further developed
* Mike also asks, if three levels of conformance seem ok?
* Mike would like to start iterating over the document over the next week, so we are in time for applying the accepted results to all work products before going into public review. So in two weeks he would like to present a proposal with members comments included.
* All promise to give timely feedback.

###5.4 Issues in Applied state (since March 7, 2013) 

####5.4.1 OData Protocol [GM1]

Stefan: 
>I **move** to close ODATA-282 and ODATA-243 as applied. **Mike seconds**.

**No further discussion**. **No objections**. The **motion passes**.

#####5.4.1.1 [ODATA-282](https://tools.oasis-open.org/issues/browse/ODATA-282)

ODATA-282:
: "Support individual data modification statements within a batch without wrapping in a changeset" [component: OData Protocol] is **Applied**.

Note:
> Issue state has been progressed by grouping motion (cf. section [[5.4.1][GM1]])

ODATA-282:
: "Support individual data modification statements within a batch without wrapping in a changeset" [component: OData Protocol] is **Closed** with no objections.

#####5.4.1.2 [ODATA-243](https://tools.oasis-open.org/issues/browse/ODATA-243)

ODATA-243:
: "Add client preferences for server-driven paging" [component: OData Protocol] is **Applied**.

Note:
> Issue state has been progressed by grouping motion (cf. section [[5.4.1][GM1]])

ODATA-243:
: "Add client preferences for server-driven paging" [component: OData Protocol] is **Closed** with no objections.

######5.4.1.2.1 End of Issue Processing [eoip]

Note:
>Time slot for issue processing gone. Skip all remaining agenda sub items of 6.
 
##6 Next Meetings

###6.1 No TC meeting on 2013-03-28

Please use the time for the document review.

###6.2 Next TC meeting will be 2013-04-04 during 8-10am PT.

Agreed. 

##7 AOB

None. 
 
### Meeting adjourned on 1000 PT

# Appendices

## List of Open Action Items Before the Meeting [AI_REF]

**Retrieval time stamp**: `2013-03-21 15:15 +01:00`.

AI#0018
: "Prepare Working Draft 01 (WD01) version of OData Extension for Temporal Data" [owner: Andrew Eisenberg] is **Ongoing**

AI#0019
: "Prepare Working Draft 01 (WD01) version of OData Extension for XML Data" [owner: Andrew Eisenberg] is **Ongoing**

AI#0020
: "Prepare Working Draft 01 (WD01) version of OData Extension for JSON Data" [owner: Susan Malaika] is **Ongoing**


**Note**: The actual action item processing is documented in section [4][AIH] and subsections thereof.

## Index of Issues Processed During the Meeting [IP_REF]

**Note**: The actual issue processing is documented in sections [5][IPH]. The below index has two main parts: First come the public comments (if any), second the JIRA issues. Each list of issues is sorted by ascending issue number. Noted are the ID, the summary and the reference to the relevant subsection where the issue progression has been documented:

Public Comments:

None.

JIRA Issues:

* [ODATA-9](https://tools.oasis-open.org/issues/browse/ODATA-9) "allow expressions in the $select query option" [5.2.2.1][odata-9]
* [ODATA-10](https://tools.oasis-open.org/issues/browse/ODATA-10) "operator that returns the content of a Stream as either a String or Binary value" [5.2.2.2][odata-10]
* [ODATA-165](https://tools.oasis-open.org/issues/browse/ODATA-165) "Support Cross-joins" [5.2.3.4][odata-165]
* [ODATA-239](https://tools.oasis-open.org/issues/browse/ODATA-239) "Allowing expressions to be passed as parameters to (super) functions" [5.2.1.1][odata-239]
* [ODATA-243](https://tools.oasis-open.org/issues/browse/ODATA-243) "Add client preferences for server-driven paging" [5.4.1.2][odata-243]
* [ODATA-262](https://tools.oasis-open.org/issues/browse/ODATA-262) "Specify how OData services can be protected against cross-site request forgery (CSRF or XSRF)" [5.2.3.1][odata-262]
* [ODATA-266](https://tools.oasis-open.org/issues/browse/ODATA-266) "Strengthen the requirements for the URL Attribute in edmx:Reference and edmx:AnnotationReference" [5.2.1.2][odata-266]
* [ODATA-271](https://tools.oasis-open.org/issues/browse/ODATA-271) "Support IsAlwaysBindable through annotation, rather than attribute of function/action" [5.2.1.3][odata-271]
* [ODATA-282](https://tools.oasis-open.org/issues/browse/ODATA-282) "Support individual data modification statements within a batch without wrapping in a changeset" [5.4.1.1][odata-282]
* [ODATA-283](https://tools.oasis-open.org/issues/browse/ODATA-283) "Accept-Charset HTTP Request Header and charset content-type parameter" [5.1.1.1][odata-283]
* [ODATA-297](https://tools.oasis-open.org/issues/browse/ODATA-297) "State explicitly if Content-Length is required, and if so, for which request types it is required" [5.2.3.2][odata-297]
* [ODATA-299](https://tools.oasis-open.org/issues/browse/ODATA-299) "Should Duration be renamed DayTimeDuration in anticipation that we may wish to add YearMonthDuration at a later point?" [5.2.1.4][odata-299]
* [ODATA-301](https://tools.oasis-open.org/issues/browse/ODATA-301) "Guidance around data authorization model and secure authenticated access to an OData Service" [5.2.3.3][odata-301]
* [ODATA-303](https://tools.oasis-open.org/issues/browse/ODATA-303) "Support abstract entity types without key properties" [5.2.1.5][odata-303]
* [ODATA-304](https://tools.oasis-open.org/issues/browse/ODATA-304) "Add TargetKey attribute to &lt;PropertyRef&gt; within a &lt;ReferentialConstraint&gt;" [5.2.1.6][odata-304]
* [ODATA-305](https://tools.oasis-open.org/issues/browse/ODATA-305) "Annotations: introduce path segment to address the count of a collection" [5.2.1.7][odata-305]

## Timeline Reference [TL_REF]
  
**Note**: Please cf. the current revision of the [TC timeline](https://www.oasis-open.org/committees/download.php/48609/TC%20Timeline%204.htm).
