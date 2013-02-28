#OData meeting #27, Thursday, 28 Feb 2013, 0800 - 1000 PT

**Note**: For explanations of conventions and other formal aspects common to OData TC meeting minutes which are used in this document please cf. "[Formal Aspects of Meeting Minutes](https://www.oasis-open.org/committees/download.php/48109/formal-aspects-meeting-minutes-v1.html)". 

Meeting chaired by Barbara Hartel

## 1 Roll call
 
### 1.1 Members Present: 

        Andrew Eisenberg (IBM)        Anila Kumar GVN (CA Technologies)        Barbara Hartel (SAP AG)        Dale Moberg (Axway Software)        Gerald Krause (SAP AG)        Hubert Heijkers (IBM)        Jeffrey Turpin (Axway Software)        John Willson (Individual)        Ken Baclawski (Northeastern University)        Martin Zurmuehl (SAP AG)        Michael Pizzo (Microsoft) a.k.a. Mike        Ralf Handl (SAP AG)        Robert Richards (Mashery)        Stan Mitranic (CA Technologies)        Stefan Drees (Individual)        Susan Malaika (IBM)        Ted Jones (Red Hat)

Quorum achieved. Details cf. [normative attendance sheet for this meeting](https://www.oasis-open.org/apps/org/workgroup/odata/event.php?event_id=34186).

## 2 Approval of Agenda

Agenda approved as published.

## 3 Approval of Minutes from Previous Meeting(s)

### 3.1 Approval of [Minutes of 2013-02-21 Meeting#26](https://www.oasis-open.org/committees/download.php/48346/odata-meeting-26_on-20130221-minutes.html)

**Meeting minutes approved with no objections**.

##4 Review of [Action Items](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_items.php) (AI) and Progress [AIH]

Context:
> See the "[List of Open Action Items Before the Meeting][AI_REF]" section in the appendix.
  
###4.1 Action items due by 2013-02-28 (end of day)

None.

###4.2 Action items NOT due by 2013-02-28 (end of day) but MAY be ready for closure

None.

##5 Review of [Issues List](https://tools.oasis-open.org/issues/secure/IssueNavigator.jspa?reset=true&mode=hide&pid=10103&sorter/field=issuekey&sorter/order=ASC) (IL) and Progress [IPH]

**Notes**:

* Issues in this section (5) may have been progressed out of sequence, but have been noted here to better group by components impacted as a service for the reader.
* There is an "[Index of Issues Processed During the Meeting][IP_REF]" section in the appendix.

###5.1 Issues in Proposed state (carried over from Feb 21, 2013 TC meeting)

####5.1.1 OData ABNF Construction Rules, OData URL Conventions [coabnf_urlc1]

#####5.1.1.1 [ODATA-263](https://tools.oasis-open.org/issues/browse/ODATA-263)

ODATA-263:
: "Remove $select=*" [components: OData URL Conventions, OData ABNF Construction Rules] is **New**. 

Discussion:

* Ralf suggested it, Mike likes to discuss it.
* Mike states, that $select=* seems to be the only way to return only the properties of the type, but not navigation properties or actions/functions. 
* Mike would be okay saying that select=* returned properties and navigation properties, but excluded actions/functions, or we could define a different way to exclude actions/functions. 
* Ralf mentions existing inconsistencies in the current revisions of our work products w.r.t. if it returns what and what not.
* Ralf suggests to start on a proposal paper detailing use cases and impact of proposal as in other topics
* Mike seconds this.

**No further discussion**. **No objections**. 

ODATA-263:
: "Remove $select=*" [components: OData URL Conventions, OData ABNF Construction Rules] is **Open** with no objections. 

####5.1.2 OData ATOM Format, OData JSON Format [coatom_json1]

#####5.1.2.1 [ODATA-68](https://tools.oasis-open.org/issues/browse/ODATA-68)

ODATA-68:
: "Describe representation of ReferenceTypes in responses" [components: OData JSON Format, OData ATOM Format] is **New**. 

Discussion:

* Ralf states, that there is no need for Key and ReferenceTypes and suggests to remove the Key stuff
* Mike would prefer to get rid of Key and ReferenceTypes altogether
* All agree on further working out a proposal

**No further discussion**. **No objections**. 

ODATA-68:
: "Describe representation of ReferenceTypes in responses" [components: OData JSON Format, OData ATOM Format] is **Open** with no objections. 

#####5.1.2.2 [ODATA-265](https://tools.oasis-open.org/issues/browse/ODATA-265)

ODATA-265:
: "Allow omitting key properties from PUT and PATCH request bodies and from nested entities in deep-insert requests" [components: OData JSON Format, OData ATOM Format] is **New**. 

Ralf: 
>I **move** to resolve ODATA-265 as proposed. **Mike seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-265:
: "Allow omitting key properties from PUT and PATCH request bodies and from nested entities in deep-insert requests" [components: OData JSON Format, OData ATOM Format] is **Resolved** with no objections. 

####5.1.3 OData ATOM Format [coatom1]

#####5.1.3.1 [ODATA-200](https://tools.oasis-open.org/issues/browse/ODATA-200)

ODATA-200:
: "Remove metadata:type attribute from example in section 5.1" [component: OData ATOM Format] is **New**. 

Mike: 
>I **move** to propose we resolve ODATA-200 by clarifying that absence of metadata:type for primitive values is equivalent to metadata:type=string. **Ralf seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-200:
: "Remove metadata:type attribute from example in section 5.1" [component: OData ATOM Format] is **Resolved as noted in the motion** with no objections. 

####5.1.4 OData CSDL [cocsdl1]

#####5.1.4.1 [ODATA-43](https://tools.oasis-open.org/issues/browse/ODATA-43)

ODATA-43:
: "No indicator for optimistic concurrency control on EntityType or EntitySet level" [component: OData CSDL] is **New**. 

Ralf: 
>I **move** to resolve ODATA-43 as proposed with the change to use a new Behavior vocabulary and also remove the ConcurrencyMode facet attribute. **Martin seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-43:
: "No indicator for optimistic concurrency control on EntityType or EntitySet level" [component: OData CSDL] is **Resolved as noted in the motion** with no objections. 

#####5.1.4.2 [ODATA-173](https://tools.oasis-open.org/issues/browse/ODATA-173)

ODATA-173:
: "Define Action values for OnDelete element" [component: OData CSDL] is **Open**. 

Ralf: 
>I **move** to resolve ODATA-173 as proposed. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-173:
: "Define Action values for OnDelete element" [component: OData CSDL] is  **Resolved** with no objections. 

#####5.1.4.3 [ODATA-201](https://tools.oasis-open.org/issues/browse/ODATA-201)

ODATA-201:
: "Allow specifying a list of acceptable media types for media entities and named resource properties" [component: OData CSDL] is **New**. 

Discussion:

* Mike commented in JIRA, that he would think this in core, rather than capabilities, or in a separate "extended_metadata" vocabulary.
* Andrew remarks, that there are issues with the proposal eg. with NamedResourceProperty
* Ralf mentions, that he will replace the comma separated list value in attribute AppliesTo with a space separated list, since this seems to be a schema convention often chosen.
* All discuss a modified proposal which will be put in core.

Ralf: 
>I **move** to resolve ODATA-201 as proposed with the following changes: A) Put the term in the Core vocabulary, B) Let it apply to EntityType and Property and C) Add Core.MediaType term of type String that applies to binary properties. **Martin seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-201:
: "Allow specifying a list of acceptable media types for media entities and named resource properties" [component: OData CSDL] is **Resolved as noted in the motion** with no objections. 

#####5.1.4.4 [ODATA-234](https://tools.oasis-open.org/issues/browse/ODATA-234)

ODATA-234:
: "Merge Reference and AnnotationReference element" [component: OData CSDL] is **Open**. 

Discussion:

* Mike sees it as a step in the right direction, but still looks a bit convoluted.
* Mike is in support of this, but would like to have it further cleand up by adding a new JIRA issue later and let this pass right now.

Ralf: 
>I **move** to resolve ODATA-234 as proposed. **Mike seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-234:
: "Merge Reference and AnnotationReference element" [component: OData CSDL] is **Resolved** with no objections. 

#####5.1.4.5 [ODATA-236](https://tools.oasis-open.org/issues/browse/ODATA-236)

ODATA-236:
: "Define maximum length of namespace names and simple identifiers" [component: OData CSDL] is **New**. 

Discussion:

* Andrew cites: 3) The sum of the number of &lt;SQL language identifier start&gt;s and the number of &lt;SQL language identifier part&gt;s in an &lt;SQL language identifier&gt; shall not be greater than 128.
* Mike suggests aligning it with ANSI SQL guaranteed maximum length for identifiers as 128 for simple identifiers in OData.
* Mike is fine with 511 character length for namespaces

Mike: 
>I **move** we define a max identifier length of 128 and a max namespace name of 511 characters. **Martin seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-236:
: "Define maximum length of namespace names and simple identifiers" [component: OData CSDL] is **Resolved as noted in the motion** with no objections. 

#####5.1.4.6 [ODATA-242](https://tools.oasis-open.org/issues/browse/ODATA-242)

ODATA-242:
: "Allow Path expressions also for annotations targeting an entity container" [component: OData CSDL] is **New**. 

Ralf: 
>I **move** to resolve ODATA-242 as proposed. **Hubert seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-242:
: "Allow Path expressions also for annotations targeting an entity container" [component: OData CSDL] is **Resolved** with no objections. 

#####5.1.4.7 [ODATA-257](https://tools.oasis-open.org/issues/browse/ODATA-257)

ODATA-257:
: "Define standard client-side function for filling URL templates (RFC6570)" [component: OData CSDL] is **New**. 

Discussion:

* Ralf explains, these will be documented in the CSDL work product.
* Mike asks, if we want to embed the documentation of more dynamic constructs in a separate place (a registry eg.) instead of a quasi-static pace like the CSDL. 
* Martin states, that there is a related issue namely ODATA-278
* Mike added the following to the proposal in the JIRA ticket: We also need to make sure we reserve odata. for names of apply functions.

Ralf: 
>I **move** to resolve ODATA-257 as proposed. **Martin seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-257:
: "Define standard client-side function for filling URL templates (RFC6570)" [component: OData CSDL] is **Resolved** with no objections. 

#####5.1.4.8 [ODATA-278](https://tools.oasis-open.org/issues/browse/ODATA-278)

ODATA-278:
: "Introduce vocabulary expression edm:Url" [component: OData CSDL] is **New**. 

Martin: 
>I **move** to resolve ODATA-278 as proposed. **Hubert seconds**.

Discussion of the motion:

* Mike suggests to also check URL construction w.r.t security concerns but sees impact of these more on the URL template


**No further discussion**. **No objections**. The **motion passes**.

ODATA-278:
: "Introduce vocabulary expression edm:Url" [component: OData CSDL] is **Resolved** with no objections. 

####5.1.5 OData Protocol [coprot1]

#####5.1.5.1 [ODATA-262](https://tools.oasis-open.org/issues/browse/ODATA-262)

ODATA-262:
: "Specify how OData services can be protected against cross-site request forgery (CSRF or XSRF)" [component: OData Protocol] is **New**. 

Discussion:

* Ralf mentions, that the proposal is aligned with an existing product
* Mike asks, if we can separate a bit the OData specific from possible third-party definitions (like the usage of the proposed header and the mentioned values).
* All agree, that headers like X-CSRF-Token are vendor specific extensions
* All discuss the implication of the fact, that in batch requests, the X-CSRF-Token may not be set in the header
* Mike suggests to further check with security experts after we now discussed it in the group
* Susan will ask the IBM OASIS representative, if there are already some precedence issues to which we can refer to for further processing.
* Mike also suggests to include our "HTTP" contacts like our member James Snell and others and thus asks, to defer the issue for some weeks, to have some time to discuss this. 

**No further discussion**. **No objections**. 

ODATA-262:
: "Specify how OData services can be protected against cross-site request forgery (CSRF or XSRF)" [component: OData Protocol] is **Open** with no objections. 

######5.1.5.1.1 End of Issue Processing [eoip]

Note:
>Time slot for issue processing gone. Skip all remaining agenda sub items of 5.


##6 Next Meeting

###6.1 Next weekly TC meeting will be 2013-03-07 during 8-10am PT.

Agreed.

##7 AOB

None. 
 
### Meeting adjourned on 1000 PT

# Appendices

## List of Open Action Items Before the Meeting [AI_REF]

**Retrieval time stamp**: `2013-02-28 09:55 +01:00`.

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

* [ODATA-43](https://tools.oasis-open.org/issues/browse/ODATA-43) "No indicator for optimistic concurrency control on EntityType or EntitySet level" [5.1.4.1][odata-43]
* [ODATA-68](https://tools.oasis-open.org/issues/browse/ODATA-68) "Describe representation of ReferenceTypes in responses" [5.1.2.1][odata-68]
* [ODATA-173](https://tools.oasis-open.org/issues/browse/ODATA-173) "Define Action values for OnDelete element" [5.1.4.2][odata-173]
* [ODATA-200](https://tools.oasis-open.org/issues/browse/ODATA-200) "Remove metadata:type attribute from example in section 5.1" [5.1.3.1][odata-200]
* [ODATA-201](https://tools.oasis-open.org/issues/browse/ODATA-201) "Allow specifying a list of acceptable media types for media entities and named resource properties" [5.1.4.3][odata-201]
* [ODATA-234](https://tools.oasis-open.org/issues/browse/ODATA-234) "Merge Reference and AnnotationReference element" [5.1.4.4][odata-234]
* [ODATA-236](https://tools.oasis-open.org/issues/browse/ODATA-236) "Define maximum length of namespace names and simple identifiers" [5.1.4.5][odata-236]
* [ODATA-242](https://tools.oasis-open.org/issues/browse/ODATA-242) "Allow Path expressions also for annotations targeting an entity container" [5.1.4.6][odata-242]
* [ODATA-257](https://tools.oasis-open.org/issues/browse/ODATA-257) "Define standard client-side function for filling URL templates (RFC6570)" [5.1.4.7][odata-257]
* [ODATA-262](https://tools.oasis-open.org/issues/browse/ODATA-262) "Specify how OData services can be protected against cross-site request forgery (CSRF or XSRF)" [5.1.5.1][odata-262]
* [ODATA-263](https://tools.oasis-open.org/issues/browse/ODATA-263) "Remove $select=*" [5.1.1.1][odata-263]
* [ODATA-265](https://tools.oasis-open.org/issues/browse/ODATA-265) "Allow omitting key properties from PUT and PATCH request bodies and from nested entities in deep-insert requests" [5.1.2.2][odata-265]
* [ODATA-278](https://tools.oasis-open.org/issues/browse/ODATA-278) "Introduce vocabulary expression edm:Url" [5.1.4.8][odata-278]

## Timeline Reference [TL_REF]
  
**Note**: Please cf. the current revision of the [TC timeline](https://www.oasis-open.org/committees/download.php/48148/TC%20Timeline%203.htm).
