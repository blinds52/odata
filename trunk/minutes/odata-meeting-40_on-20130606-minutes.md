#OData meeting #40, Thursday, 06 JUN 2013, 0800 - 1000 PT

**Note**: For explanations of conventions and other formal aspects common to OData TC meeting minutes which are used in this document please cf. "[Formal Aspects of Meeting Minutes](https://www.oasis-open.org/committees/download.php/48109/formal-aspects-meeting-minutes-v1.html)".

Meeting chaired by Barbara Hartel and Ram Jeyaraman

Acting chair: Barbara Hartel

## 1 Roll call

### 1.1 Members Present:

        Barbara Hartel (SAP AG)        Dale Moberg (Axway Software)        Diane Downie (Citrix Systems)        Edmond Bourne (BlackBerry)        Gerald Krause (SAP AG)        Hubert Heijkers (IBM)        Ken Baclawski (Northeastern University)        Matthew Borges (SAP AG) a.k.a. Matt        Michael Pizzo (Microsoft) a.k.a. Mike        Patrick Durusau (Individual)        Ralf Handl (SAP AG)        Ram Jeyaraman (Microsoft)        Robert Richards (Mashery)        Stefan Drees (Individual)        Susan Malaika (IBM)        Ted Jones (Red Hat)

Quorum achieved. Details cf. [normative attendance sheet for this meeting](https://www.oasis-open.org/apps/org/workgroup/odata/event.php?event_id=34200).

## 2 Approval of Agenda

Ralf suggests adding ODATA-419 to processing of proposed issues.

Agenda approved as ammended.

## 3 Approval of Minutes from Previous Meeting(s)

### 3.1 Approval of [Minutes of 2013-05-30 Meeting#39](https://www.oasis-open.org/committees/download.php/49375/odata-meeting-39_on-20130530-minutes.html)


**Meeting minutes approved with no objections**.

##4 Review of [Action Items](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_items.php) (AI) and Progress [AIH]

Context:
> See the "[List of Open Action Items Before the Meeting][AI_REF]" section in the appendix.

###4.1 Action items due by 2013-06-06 (end of day)

None.

###4.2 Action items NOT due by 2013-06-06 (end of day) but MAY be ready for closure

None.

##5 Review of [Issues List](https://tools.oasis-open.org/issues/secure/IssueNavigator.jspa?reset=true&mode=hide&pid=10103&sorter/field=issuekey&sorter/order=ASC) (IL) and Progress [IPH]

**Notes**:

* Issues in this section (5) may have been progressed out of sequence, but have been noted here to better group by components impacted as a service for the reader.
* There is an "[Index of Issues Processed During the Meeting][IP_REF]" section in the appendix.

###5.1 Issues in Proposed state (may need deeper discussion) (carried over from May 9, 2013)

####5.1.1 OData Part 1: Protocol [coprot_1]

#####5.1.1.1 [ODATA-262](https://tools.oasis-open.org/issues/browse/ODATA-262)

ODATA-262:
: "Specify how OData services can be protected against cross-site request forgery (CSRF or XSRF)" [component: OData Protocol] is **Open**.

Discussion:

* Ralf reminds that we discussed to resolve that issue by moving these ideas into the non-normative TC note.
* Ram states, that we will probably move more helpful descriptions of standard practices into the non-normative work product
* Stefan has already registered a work product with title "Securing Open Data" as a non-normative TC note.
* Mike thinks we do not introduce specific security issues and already describe the implications of using HTTP, JSON and ATOM in the securtiy considerations section
* Ram received feedback, that maybe we need more explicit security explanations 
* Ralf likes that
* Ram will assemble a proposal on where to add what to the documents.
* All agree, that for this topic a separate issue on a new component should be submitted
* Component name for this new issue will be "Securing Open Data" has been created during the meeting.

Stefan:
>I **move** to resolve ODATA-262 as proposed by adding it to the TC Note "Securing Open Data". **Ralf seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-262:
: "Specify how OData services can be protected against cross-site request forgery (CSRF or XSRF)" [component: OData Protocol] is **Resolved** with no objections.


#####5.1.1.2 [ODATA-314](https://tools.oasis-open.org/issues/browse/ODATA-314)

ODATA-314:
: "Please clarify the meaning of filter functions applied to DateTimeOffset values" [components: OData URL Conventions, OData Protocol] is **Open**.

Discussion:

* Mike introduces the issue reported by Evan.

Mike:
>I **move** we resolve ODATA-314 as proposed. **Ralf seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-314:
: "Please clarify the meaning of filter functions applied to DateTimeOffset values" [components: OData URL Conventions, OData Protocol] is **Resolved** with no objections.

####5.1.2 OData JSON Format [cojson_1]

#####5.1.2.1 [ODATA-316](https://tools.oasis-open.org/issues/browse/ODATA-316)

ODATA-316:
: "Services select a default set of properties in absence of $select" [component: OData JSON Format] is **Open**.

Discussion:

* Mike summarizes the issue, where the proposal evolved several times into its current shape
* Hubert asks, if the metadata URL will remain unchanged under application of the proposal
* Mike assures this

Mike:
>I **move** we resolve ODATA-316 as proposed. **Hubert seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-316:
: "Services select a default set of properties in absence of $select" [component: OData JSON Format] is **Resolved** with no objections.

###5.2 Issues in Proposed state carried over from May 23, 2013

####5.2.1 OData Part 3: CSDL [cocsdl_1]

#####5.2.1.1 [ODATA-413](https://tools.oasis-open.org/issues/browse/ODATA-413)

ODATA-413:
: "Replace conformance clauses in URL and CSDL with references to Protocol" [components: OData URL Conventions, OData CSDL] is **Open**.

Discussion:

* Patrick summarizes the issue
* Ram reminds everyone that the discussion of last week on this issue, showed, that there are valid use cases for tools needing part 3 but not part 1 to conform to and fully function.
* Mike agrees, that the URL Conventions work product should just reference back to the protocol work product when it comes to conformance but not the CSDL document.
* Patrick asks, how the different levels of conformance are to be interpreted. As choose which one to follow?
* Mike responds, that these are to pick what to expose, but not what to obey.
* Patrick mentions, as example, that you cannot expose EntitySet without also doing so conforming with CSDL
* Patrick summarizes, that Part 2 should rely on part 1 for conformance but part 3 can stand on its own.
* Mike and Patrick will continue to find the right wording offline.
* Patrick further summarizes 1) Clarify that the specification we are referring to is this document representing part 3 of the work product and 2) in the conformance for the client, change "custom annotations defined by the service" to simply "custom annotations".

Patrick:
>I **move** to resolve ODATA-413 as discussed. **Mike seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-413:
: "Replace conformance clauses in URL and CSDL with references to Protocol" [components: OData URL Conventions, OData CSDL] is **Resolved** with no objections.

###5.3 Issues in Proposed state since  May 30, 2013

####5.3.1 OData Part 1: Protocol [coprot_2]

#####5.3.1.1 [ODATA-419](https://tools.oasis-open.org/issues/browse/ODATA-419)

ODATA-419:
: "Specify ETag handling more precisely" [component: OData Protocol] is **New**.

Discussion:

* Ralf summarizes the issue.

Stefan: 
>I **move** to resolve ODATA-419 as proposed. **Ralf seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-419:
: "Specify ETag handling more precisely" [component: OData Protocol] is **Resolved** with no objections.


####5.3.2 OData Part 3: CSDL [cocsdl_2]

#####5.3.2.1 [ODATA-415](https://tools.oasis-open.org/issues/browse/ODATA-415)

ODATA-415:
: "Use of 'MUST,' 'MAY,' 'SHOULD,' etc in Part 3 CSDL definitions" [component: OData CSDL] is **New**.

Discussion:

* Patrick summarizes the issue.
* Ralf explains, that the proposal is his take on the examples given in the description of the issue to project the effort required for applying it to the full document so we can decide.
* Mike states, that by and large the uses of RFC style words (MAY, SHOULD, MUST etc.) seemed to be correct.
* Mike continues, that the incoherence presumed, might just be due to the fact, that sometimes the intent to state formal facts, and sometimes not, thus on purpose.
* Patrick likes the new style proposed by Ralf
* Stefan states, that the readability and attention span targeted by the prose should match. If mixing MUST-MAY-SHOULD style in one part with simple english language is-might-can or whatever is dangerous if this implies, that the latter portions might pass unnoticed by the readers.
* Ralf received internal feedback, that the new style (as compared to initial draft fro August 2012) is received very positive
* Ralf adds, that we still fix errors in the XSD by way of having uppercase MUSTs (etc.) conflicting with optional attributes in XSD, so it is good to have prose normative and clear.
* Patrick notes, that all text is normative if not otherwise stated.
* Patrick suggests to go through the document to check for the occurences of "RFC" terms before Monday
* Stefan likes that but gently reminds, that the documents should better start in a stable form into the upcoming hot week of the face to face meeting.
* All agree.
* Patrick to file more examples for OData-415

**No further discussion**. **No objections**. 

ODATA-415:
: "Use of 'MUST,' 'MAY,' 'SHOULD,' etc in Part 3 CSDL definitions" [component: OData CSDL] is **Open** with no objections.

#####5.3.2.2 [ODATA-423](https://tools.oasis-open.org/issues/browse/ODATA-423)

ODATA-423:
: "Rename edm:Entity to edm:SingletonEntity and its Type attribute to EntityType" [components: OData CSDL, OData ATOM Format, OData Protocol, OData JSON Format, OData URL Conventions] is **New**.

Discussion:

* Mike likes this proposal and sees this as a great enhancement.

Martin:
>I **move** to resolve ODATA-423 as proposed. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-423:
: "Rename edm:Entity to edm:SingletonEntity and its Type attribute to EntityType" [components: OData CSDL, OData ATOM Format, OData Protocol, OData JSON Format, OData URL Conventions] is **Resolved** with no objections.

####5.3.3 OData Atom Format [coatom_1]

#####5.3.3.1 [ODATA-424](https://tools.oasis-open.org/issues/browse/ODATA-424)

ODATA-424:
: "Allow MicroXML as first class format (parallel to JSON and probably remove ATOM or remap the latter to MicroXML in future versions)" [components: OData ATOM Format, OData ABNF Construction Rules, OData Extension for JSON Data, OData CSDL, OData JSON Format, OData Extension for XML Data, OData URL Conventions, OData Protocol, Vocabularies] is **New**.

Discussion:

* Stefan summarizes the issue.

Stefan:
>I **move** to defer ODATA-424. **Mike seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-424:
: "Allow MicroXML as first class format (parallel to JSON and probably remove ATOM or remap the latter to MicroXML in future versions)" [components: OData ATOM Format, OData ABNF Construction Rules, OData Extension for JSON Data, OData CSDL, OData JSON Format, OData Extension for XML Data, OData URL Conventions, OData Protocol, Vocabularies] is **Deferred** with no objections.

###5.4 Issues deferred to next version [ipub_deferred]

####5.4.1 [ODATA-405](https://tools.oasis-open.org/issues/browse/ODATA-405)

ODATA-405:
: "Deep Updates (public comment c201305e00008)" [component: OData ATOM Format] is **Open**.

Discussion:

* Ralf summarizes the issue and motivates the proposal to defer.
* Mike agrees with this.

Ralf:
>I **move** to defer ODATA-405 to the next version of the spec. **Hubert seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-405:
: "Deep Updates (public comment c201305e00008)" [component: OData ATOM Format] is **Deferred** with no objections.

###5.5 Issues in Applied state

###5.5.1 Issues related to public comments (please review this changes that we can possibly close the issues) [ipub_applied]

####5.5.1.1 [ODATA-379](https://tools.oasis-open.org/issues/browse/ODATA-379)

ODATA-379:
: "Ensure consistency and clear description in specification of $count for 'Delta Responses' (public comment c201305e00000)" [components: OData JSON Format, OData ATOM Format, OData Protocol] is **Applied**.

Stefan:
>I **move** to close ODATA-379 as applied. **Martin seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-379:
: "Ensure consistency and clear description in specification of $count for 'Delta Responses' (public comment c201305e00000)" [components: OData JSON Format, OData ATOM Format, OData Protocol] is **Closed** with no objections.

####5.5.1.2 [ODATA-387](https://tools.oasis-open.org/issues/browse/ODATA-387)

ODATA-387:
: "Replace (at least) the second example in Section 13 of the CSDL document (public comment c201305e00002)" [component: OData CSDL] is **Applied**.

Stefan:
>I **move** to close ODATA-387 as applied. **Patrick seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-387:
: "Replace (at least) the second example in Section 13 of the CSDL document (public comment c201305e00002)" [component: OData CSDL] is **Closed** with no objections.


###5.6 Additional Issues in Proposed state

Discussion:

* As we are early in time Mike proposes to continue issue processing with the following issues that have proposals and see if we have consensus to process: ODATA-425, ODATA-426, ODATA-381, and if time allows ODATA-291.
* All agree

####5.6.1 [ODATA-425](https://tools.oasis-open.org/issues/browse/ODATA-425)

ODATA-425:
: "Clarify rules around parameter overloads and return types" [component: OData CSDL] is **New**.

Discussion:

* Mike summarizes the issue.
* All discuss the proposal which receives updates in JIRA based on the discussion.
* Ralf reminds everyone, that we removed ordering expectations elsewhere and does not want to introduce them here
* Mike reworded second part of the proposal as follows: "Specify that the opaque URL advertised for functions/actions in the payload must accept parameters passed as aliases with the same name as the parameters defined in the metadata, preceded with an @ sign"
* All agree

Mike: 
>I **move** we resolve ODATA-425 as proposed. **Ralf seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-425:
: "Clarify rules around parameter overloads and return types" [component: OData CSDL] is **Resolved** with no objections.

####5.6.2 [ODATA-426](https://tools.oasis-open.org/issues/browse/ODATA-426)

ODATA-426:
: "Metadata URL for nested objects can be relative to metadata URL of enclosing object" [component: OData JSON Format] is **New**.

Discussion:

* Ralf summarizes the issue.
* Mike updtes the proposal in JIRA to reflect the discussion.
 
Hubert: 
>I **move** to resolve ODATA-426 as proposed. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-426:
: "Metadata URL for nested objects can be relative to metadata URL of enclosing object" [component: OData JSON Format] is **Resolved** with no objections.

####5.6.3 [ODATA-381](https://tools.oasis-open.org/issues/browse/ODATA-381)

ODATA-381:
: "Hanging paragraphs - all current csprd01 documents" [components: OData CSDL, OData ATOM Format, OData Protocol, OData JSON Format, OData URL Conventions] is **Open**.

Discussion:

* Mike summarizes the issue
* Mike recaps the discussion history of the latest meeting and also reports on his analysis of potential problematic references where he found in total 3 parts, where we really meant including subsections and he thus suggests to change the conformance statements in these 3 cases to more explicitely point to the referenced material.
* Mike proposes thus, to keep the top level text placed in sections that contain subsections but to repair the referring parts.

Stefan: 
>I **move** to resolve ODATA-381 as proposed. **Patrick seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-381:
: "Hanging paragraphs - all current csprd01 documents" [components: OData CSDL, OData ATOM Format, OData Protocol, OData JSON Format, OData URL Conventions] is **Resolved** with no objections.

##6 Next Meeting

###6.1 Next TC meeting is face to face meeting from Thursday, 13 June 2013, 09:00am to Friday, 14 June 2013, 06:00pm PDT in Redmond, Washington, USA

Agreed

##7 AOB

None.

### Meeting adjourned on 0958 PT

# Appendices

## List of Open Action Items Before the Meeting [AI_REF]

**Retrieval time stamp**: `2013-06-06 16:10 +02:00`.

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

None.

JIRA Issues:

* [ODATA-262](https://tools.oasis-open.org/issues/browse/ODATA-262) "Specify how OData services can be protected against cross-site request forgery (CSRF or XSRF)" [5.1.1.1][odata-262]
* [ODATA-314](https://tools.oasis-open.org/issues/browse/ODATA-314) "Please clarify the meaning of filter functions applied to DateTimeOffset values" [5.1.1.2][odata-314]
* [ODATA-316](https://tools.oasis-open.org/issues/browse/ODATA-316) "Services select a default set of properties in absence of $select" [5.1.2.1][odata-316]
* [ODATA-379](https://tools.oasis-open.org/issues/browse/ODATA-379) "Ensure consistency and clear description in specification of $count for 'Delta Responses' (public comment c201305e00000)" [5.5.1.1][odata-379]
* [ODATA-381](https://tools.oasis-open.org/issues/browse/ODATA-381) "Hanging paragraphs - all current csprd01 documents" [5.6.3][odata-381]
* [ODATA-387](https://tools.oasis-open.org/issues/browse/ODATA-387) "Replace (at least) the second example in Section 13 of the CSDL document (public comment c201305e00002)" [5.5.1.1][odata-387]
* [ODATA-405](https://tools.oasis-open.org/issues/browse/ODATA-405) "Deep Updates (public comment c201305e00008)" [5.4.1][odata-405]
* [ODATA-413](https://tools.oasis-open.org/issues/browse/ODATA-413) "Replace conformance clauses in URL and CSDL with references to Protocol" [5.2.1.1][odata-413]
* [ODATA-415](https://tools.oasis-open.org/issues/browse/ODATA-415) "Use of 'MUST,' 'MAY,' 'SHOULD,' etc in Part 3 CSDL definitions" [5.3.2.1][odata-415]
* [ODATA-419](https://tools.oasis-open.org/issues/browse/ODATA-419) "Specify ETag handling more precisely" [5.3.1.1][odata-419]
* [ODATA-423](https://tools.oasis-open.org/issues/browse/ODATA-423) "Rename edm:Entity to edm:SingletonEntity and its Type attribute to EntityType" [5.3.2.2][odata-423]
* [ODATA-424](https://tools.oasis-open.org/issues/browse/ODATA-424) "Allow MicroXML as first class format (parallel to JSON and probably remove ATOM or remap the latter to MicroXML in future versions)" [5.3.3.1][odata-424]
* [ODATA-425](https://tools.oasis-open.org/issues/browse/ODATA-425) "Clarify rules around parameter overloads and return types" [5.6.1][odata-425]
* [ODATA-426](https://tools.oasis-open.org/issues/browse/ODATA-426) "Metadata URL for nested objects can be relative to metadata URL of enclosing object" [5.6.2][odata-426]

## Timeline Reference [TL_REF]

**Note**: Please cf. the current revision of the [TC timeline](https://www.oasis-open.org/committees/download.php/49178/TC%20Timeline%205.htm).

