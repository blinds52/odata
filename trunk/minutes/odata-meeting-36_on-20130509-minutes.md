#OData meeting #36, Thursday, 09 MAY 2013, 0800 - 1000 PT

**Note**: For explanations of conventions and other formal aspects common to OData TC meeting minutes which are used in this document please cf. "[Formal Aspects of Meeting Minutes](https://www.oasis-open.org/committees/download.php/48109/formal-aspects-meeting-minutes-v1.html)".

Meeting chaired by Ram Jeyaraman

## 1 Roll call

### 1.1 Members Present:

        Dale Moberg (Axway Software)
        Diane Downie (Citrix Systems)
        Edmond Bourne (BlackBerry)
        Jeffrey Turpin (Axway Software)
        John Willson (Individual)
        Ken Baclawski (Northeastern University)
        Martin Zurmuehl (SAP AG)
        Matthew Borges (SAP AG) a.k.a. Matt
        Michael Pizzo (Microsoft) a.k.a. Mike
        Nuno Linhares (SDL)
        Patrick Durusau (Individual)
        Ralf Handl (SAP AG)
        Ram Jeyaraman (Microsoft)
        Robert Richards (Mashery)
        Stefan Drees (Individual)
        Susan Malaika (IBM)
        Ted Jones (Red Hat)

Quorum achieved. Details cf. [normative attendance sheet for this meeting](https://www.oasis-open.org/apps/org/workgroup/odata/event.php?event_id=34196).

## 2 Approval of Agenda

Mike suggests to talk about ODATA-378 at the end of the planned processing of proposed issues on agenda.

Agenda approved as ammended.

## 3 Approval of Minutes from Previous Meeting(s)

### 3.1 Approval of [Minutes of 2013-05-02 Meeting#35](https://www.oasis-open.org/committees/download.php/49055/odata-meeting-35_on-20130502-minutes.html)


**Meeting minutes approved with no objections**.

##4 Review of [Action Items](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_items.php) (AI) and Progress [AIH]

Context:
> See the "[List of Open Action Items Before the Meeting][AI_REF]" section in the appendix.

###4.1 Action items due by 2013-05-09 (end of day)

None.

###4.2 Action items NOT due by 2013-05-09 (end of day) but MAY be ready for closure

None.

##5 Preparing towards Committee Specification Draft 02

###5.1 Timeline Impact CSD02

Context:
> In order to stick to the timeline [TL][TL_REF], we need to file any remaining technical issues ASAP, so we can process those issues (along with any public review comments) by mid-June, in time for approving CSD02 by end of June.

Discussion:

* Mike really enjoyed all the effort everyone put into the first public review but for a second he would like to finalize the documents a week or so before pushing these out to have some time to look over them.
* Stefan enjoyed the finalizing of Public Review 01 documents during the week in Walldorf but also thinks reaching that state a week before pushing out CSD02 would be better, to still have the remaining week for polishing. He thus seconds Mike's suggestion. He also hopes for more implementation triggered comments and possibly corrections to ensure version 4 is also practically the best OData ever.

###5.2 Issue Roadmap CSD02

Context:
> Are there significant technical issues you plan to file? If so, when do you expect to file them?

Discussion:

* Ralf does not plan to submit new issues for now, as he filed a few already.
* All seem to have put all known issues already into the system.
* Patrick noticed when reading the JSON and ATOM format documents, that from an editorial standpoint the things returned seem to be named differently.

##6 Fifth TC face-to-face meeting

###6.1 Daterange of Meeting

Context:
> At the recently concluded face-to-face meeting in Walldorf, Germany, we discussed the possibility of holding the next F2F meeting during the week of June 17th.

Discussion:

* Ram cites from the timeline, that on June 25th we are expected to hand off CSD02 input
* Mike suggests, that the week of the 10th is better in line with the hand-off (planned June 25th)
* Ralf prefers also 10th as it is closer to end of public review and gives more time before CSD02
* Stefan also suggests the 10th although he does not know if the travel expenses will be covered, but he sees this as a week of intense daily collaboration which should be as early as possible after the end of public review 01.
* Martin also prefers the early daterange to avoid any hastiness in final editing
* Ed also prefers the week of the 10th
* All agree to meet in the week of the 10th with the main meetings on June 13th and 14th

###6.2 Venue of Meeting

Context:
> Would the week of June 17 or June 10th work for you, if it were to be held in Redmond, WA?

Discussion:

* Ram and Mike suggest Redmond as venue
* Martin and Ralf also are OK with Redmond
* All agree to meet in Redmond, Washington

Tentative planned participation:

* In Person: Ed, John, Martin, Mike, Ralf, and Ram.
* Remote: Dale, Ken, Stefan, and Susan.
* Not known yet: Matt
* Not participating: Ted

##7 Documentation of changes between OData version 3 and version 4

Context:
> Recently there were some questions about what are the changes between OData v3 and v4. Let’s discuss the next steps towards identifying what those changes are and how to publish them.

Discussion:

* Ralf has been asked from colleagues if the TC plans to publish some change information as a non-normative TC document
* Mike mentions, that the request for change overview from version 3 to version 4 also came up on the odata.org mailing list and he already sent some short incomplete list of main changes and also checked with the document already started by Ralf. He also thinks it is good to provide such a note, but it should not eat up needed resources for the main work products.
* Stefan mentions, that a TC Note is a good format, as a) everyone expects that there is some message from the TC as what has been changed, and b) as version 3 is not an OASIS product we cannot really have a normative document claiming the differences and c) we can regulate the resources invested, as the draft of the note will be publicly visible well before approve date and we can decide on the level of details included.
* Patrick suggests to probably use JIRA to extract a list of changes from JIRA issues.
* Mike seconds this as a good starting point to merge Mike's Mail to the odata.org mailing list, Ralf's document starter and the export from JIRA.
* Stefan already added some info into Ralf's starter document
* All agree to continue this way

##8 Review of [Issues List](https://tools.oasis-open.org/issues/secure/IssueNavigator.jspa?reset=true&mode=hide&pid=10103&sorter/field=issuekey&sorter/order=ASC) (IL) and Progress [IPH]

**Notes**:

* Issues in this section (8) may have been progressed out of sequence, but have been noted here to better group by components impacted as a service for the reader.
* There is an "[Index of Issues Processed During the Meeting][IP_REF]" section in the appendix.

###8.1 Public Review Issues [pubreviss]

###8.1.1 [c201305e00000](https://lists.oasis-open.org/archives/odata-comment/201305/msg00000.html)

Context:
> We received the public Comment #20130500000 on 2013-05-08 with title "Specification of $count for 'Delta Responses'". To prepare processing a corresponding JIRA issue  [ODATA-379](https://tools.oasis-open.org/issues/browse/ODATA-379) has been created with summary "Ensure consistency and clear description in specification of $count for 'Delta Responses' (public comment c201305e00000)" [component: OData Protocol].

###8.1.1.1 [ODATA-379](https://tools.oasis-open.org/issues/browse/ODATA-379)

ODATA-379:
: "Ensure consistency and clear description in specification of $count for 'Delta Responses' (public comment c201305e00000)" [component: OData Protocol] is  **New**.

Discussion:

* Ralf states, that the comment notes that we count different between normal and delta responses
* Mike likes to think about it a bit more, before making a proposal. He sees the consistency argument to go either way, but does not yet see which way is the most usefull
* Martin adds, that the client needs a hint, when he will have to check for the delta
* Mike states, that we should clarify as to the documentation clarity question, that the count will include expanded entities.

**No further discussion**. **No objections**.

ODATA-379:
: "Ensure consistency and clear description in specification of $count for 'Delta Responses' (public comment c201305e00000)" [component: OData Protocol] is  **Open** with no objections.

###8.2 Issues in Proposed state (may be ripe for resolution)

####8.2.1 OData CSDL [cocsdl_1]

####8.2.1.1 [ODATA-373](https://tools.oasis-open.org/issues/browse/ODATA-373)

ODATA-373:
: "Add boolean expressions that can be used in &lt;edm:If&gt;" [component: OData CSDL] is **New**.

Discussion:

* Mike kindly asks the editors to consider keeping the complexity and volume of the specs minimal.

Stefan:
>I **move** to resolve ODATA-373 as proposed. **Ralf seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-373:
: "Add boolean expressions that can be used in &lt;edm:If&gt;" [component: OData CSDL] is **Resolved** with no objections.

####8.2.1.2 [ODATA-370](https://tools.oasis-open.org/issues/browse/ODATA-370)

ODATA-370:
: "Disallow Nullable facet for collection-valued properties" [component: OData CSDL] is **New**.

Stefan:
>I **move** to resolve ODATA-370 as proposed. **Ralf seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-370:
: "Disallow Nullable facet for collection-valued properties" [component: OData CSDL] is **Resolved** with no objections.

####8.2.1.3 [ODATA-364](https://tools.oasis-open.org/issues/browse/ODATA-364)

ODATA-364:
: "Explicitly state that the restriction that a property MUST NOT have the same name as its containing type only applies to directly declared properties" [component: OData CSDL] is **New**.

Discussion:

* Ralf states, that this restriction seems to be inherited from C#, but also that this might be nevertheless allowed in derived classe, thus to allow  it inside derived class, i.e. meber of a derived class may have same name as base class.
* Mike asks, if this also works in C++
* Matt will check
* All will wait for the outcone.

**No further discussion**. **No objections**.

ODATA-364:
: "Explicitly state that the restriction that a property MUST NOT have the same name as its containing type only applies to directly declared properties" [component: OData CSDL] is **Open** with no objections.

####8.2.2 OData Protocol [coprot_1]

####8.2.2.1 [ODATA-371](https://tools.oasis-open.org/issues/browse/ODATA-371)

ODATA-371:
: "Clearly describe behavior of PUT for structural and navigation properties" [component: OData Protocol] is **New**.

Discussion:

* Ralf summarizes the issue and current proposal
* Mike requests to put the semantics into the protocol document and the specifics into the format documents

Ralf:
>I **move** to resolve ODATA-371 as proposed. **Martin seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-371:
: "Clearly describe behavior of PUT for structural and navigation properties" [component: OData Protocol] is **Resolved** with no objections.

####8.2.2.2 [ODATA-369](https://tools.oasis-open.org/issues/browse/ODATA-369)

ODATA-369:
: "POST to navigation link with binding information leading to a different 'parent' is invalid" [component: OData Protocol] is **New**.

Discussion:

* Ralf summarizes the issue and current proposal

Mike:
>I **move** we resolve ODATA-369 as proposed. **Ralf seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-369:
: "POST to navigation link with binding information leading to a different 'parent' is invalid" [component: OData Protocol] is **Resolved** with no objections.

####8.2.2.3 [ODATA-367](https://tools.oasis-open.org/issues/browse/ODATA-367)

ODATA-367:
: "Explicitly state that server MAY expand results beyond what's requested with $expand" [component: OData Protocol] is **New**.

Discussion:

* Ralf summarizes the issue as stemming from colleagues review of CSD01 public review comments and current proposal

Mike:
>I **move** we resolve ODATA-367 as proposed. **Ralf seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-367:
: "Explicitly state that server MAY expand results beyond what's requested with $expand" [component: OData Protocol] is **Resolved** with no objections.

####8.2.2.4 [ODATA-365](https://tools.oasis-open.org/issues/browse/ODATA-365)

ODATA-365:
: "Rename edm:AssertType to edm:Cast and clarify behavior of edm:Cast and cast()" [component: OData Protocol] is **New**.

Discussion:

* Martin summarizes the issue and current proposal
* Mike wants to ensure, that the casting rules are only specified once
* Martin will remove the optional from the current proposal, rename isType expression and ensure while applying, that everything remains consistent.
* Ralf already updated the issue with the outcome of the discussion.

Martin:
>I **move** we resolve ODATA-365 as proposed. **Mike seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-365:
: "Rename edm:AssertType to edm:Cast and clarify behavior of edm:Cast and cast()" [component: OData Protocol] is **Resolved** with no objections.

####8.2.2.5 [ODATA-296](https://tools.oasis-open.org/issues/browse/ODATA-296)

ODATA-296:
: "Change tracking may require server-side state, but client cannot advise server to stop tracking in order to allow server to release resources" [component: OData Protocol] is **New**.

Discussion:

* Ralf states, that some steps towards a consensus proposal have been made, but not really finished.
* Ralf proposes to come back to this issue next week.

**No further discussion**. **No objections**.

ODATA-296:
: "Change tracking may require server-side state, but client cannot advise server to stop tracking in order to allow server to release resources" [component: OData Protocol] is **Open** with no objections.

####8.2.2.6 [ODATA-368](https://tools.oasis-open.org/issues/browse/ODATA-368)

ODATA-368:
: "Deep insert: if server responds with 201 Created it MUST respond with at least the expansion depth of the insert operation" [component: OData Protocol] is  **New**.

Discussion:

* Ralf summarizes the issue as often encountered scenario and current proposal

Ralf:
>I **move** to resolve ODATA-368 as proposed. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-368:
: "Deep insert: if server responds with 201 Created it MUST respond with at least the expansion depth of the insert operation" [component: OData Protocol] is  **Resolved** with no objections.

####8.2.2.7 [ODATA-366](https://tools.oasis-open.org/issues/browse/ODATA-366)

ODATA-366:
: "Clarify whether server-generated properties can be omitted in POST, even if they are not nullable" [component: OData Protocol] is **New**.

Discussion:

* Ralf summarizes the issue and current proposal and adds, that in the current documents this is already covered, but seemingly nor in sufficient detail neither in the right places.
* All discuss if the proposal should be ammended or after application further refined.
* Ralf will remove the optional from proposal and if the TC decides to change that a new issue might be opened.

Ralf:
>I **move** to resolve ODATA-366 as proposed. **Mike seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-366:
: "Clarify whether server-generated properties can be omitted in POST, even if they are not nullable" [component: OData Protocol] is **Resolved** with no objections.

####8.2.3 OData ATOM Format, OData JSON Format, OData Protocol [coatom_json_prot_1]

####8.2.3.1 [ODATA-351](https://tools.oasis-open.org/issues/browse/ODATA-351)

ODATA-351:
: "Define ID, ReadLink and EditLink in Part 1: Protocol, define representation in Atom and JSON" [components: OData JSON Format, OData ATOM Format, OData Protocol] is **New**.

Discussion:

* Ralf summarizes the issue and current proposal
* Mike thinks that there is one open questsion, if we need a per instance editable marker and suggests to use the read link and the not present edit link to signal the read-only-ness
* Ralf states, that then still the ID needs to be placed somewhere in the response
* Mike suggests to think about it the next days and thus move discussion on this issue to next week's meeting
* Ralf seconds on discussing this further offline

**No further discussion**. **No objections**.

ODATA-351:
: "Define ID, ReadLink and EditLink in Part 1: Protocol, define representation in Atom and JSON" [components: OData JSON Format, OData ATOM Format, OData Protocol] is **Open** with no objections.

####8.2.4 OData ABNF Construction Rules, OData URL Conventions [coabnf_urlc_1]

####8.2.4.1 [ODATA-375](https://tools.oasis-open.org/issues/browse/ODATA-375)

ODATA-375:
: "Allow querying collections of complex type instances similar to querying collections of entities" [components: OData URL Conventions, OData ABNF Construction Rules] is **New**.

Discussion:

* Ralf summarizes the issue and current proposal
* Mike thinks this extension is very natural but also wants to ensure we do not go any step further like nested operations etc.

Ralf:
>I **move** to resolve ODATA-375 as proposed. **Mike seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-375:
: "Allow querying collections of complex type instances similar to querying collections of entities" [components: OData URL Conventions, OData ABNF Construction Rules] is **Resolved** with no objections.

####8.2.5 OData JSON Format [cojson_1]

####8.2.5.1 [ODATA-376](https://tools.oasis-open.org/issues/browse/ODATA-376)

ODATA-376:
: "Navigation link representation for navigation properties of complex type instances" [component: OData JSON Format] is **New**.

Ralf:
>I **move** to resolve ODATA-376 as proposed. **Mike seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-376:
: "Navigation link representation for navigation properties of complex type instances" [component: OData JSON Format] is **Resolved** with no objections.

####8.2.6 OData JSON Format, OData ATOM Format [cojson_atom_1]

####8.2.6.1 [ODATA-378](https://tools.oasis-open.org/issues/browse/ODATA-378)

ODATA-378:
: "Support relative IRIs for ids in JSON" [components: OData JSON Format, OData ATOM Format] is **New**.

Discussion:

* Mike introduces the issue and curent proposal.

Mike:
>I **move** to accept ODATA 378 as proposed. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-378:
: "Support relative IRIs for ids in JSON" [components: OData JSON Format, OData ATOM Format] is **Resolved** with no objections.

###8.3 Issues in Applied state

####8.3.1 OData Protocol [coprot_2]

####8.3.1.1 [ODATA-301](https://tools.oasis-open.org/issues/browse/ODATA-301)

ODATA-301:
: "Guidance around data authorization model and secure authenticated access to an OData Service" [component: OData Protocol] is **Applied**.

Discussion:

* Martin introduces the issue and current proposal.
* Mike suggests a small modification to the server side with a sample wording as "SHOULD consider supporting basic authentication as specified in [[RFC2617]] over HTTPS for the highest level of interoperability with generic clients"
* Martin agrees.
* Stefan further suggests to insert a section in protocol (and similar in JSON and ATOM) named "Security Considerations" before the conformance section. With content starting like: "This section is meant to inform application developers, information providers, and users of the security limitations in Open Data version 4.0 as described by this document." And then refer to HTTP or (JSON or ATOM as applicable) will move that to a new issue.

Martin:
>I **move** to resolve ODATA-301 as proposed, server should *consider* implementing basic auth. **Mike seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-301:
: "Guidance around data authorization model and secure authenticated access to an OData Service" [component: OData Protocol] is **Resolved as noted in the motion** with no objections.

######8.3.1.1.1 End of Issue Processing [eoip]

Note:
>Time slot for issue processing gone. Skip all remaining agenda sub items of 8.


##9 Next Meeting

###9.1 Next TC meeting is conference call on May 16, 2013 during 0800-1000 PT

Agreed

##10 AOB

None.

### Meeting adjourned on 1002 PT

# Appendices

## List of Open Action Items Before the Meeting [AI_REF]

**Retrieval time stamp**: `2013-05-08 11:33 +02:00`.

AI#0018
: "Prepare Working Draft 01 (WD01) version of OData Extension for Temporal Data" [owner: Andrew Eisenberg] is **Ongoing**

AI#0019
: "Prepare Working Draft 01 (WD01) version of OData Extension for XML Data" [owner: Andrew Eisenberg] is **Ongoing**

AI#0020
: "Prepare Working Draft 01 (WD01) version of OData Extension for JSON Data" [owner: Susan Malaika] is **Ongoing**


**Note**: The actual action item processing is documented in section [4][AIH] and subsections thereof.

## Index of Issues Processed During the Meeting [IP_REF]

**Note**: The actual issue processing is documented in sections [8][IPH]. The below index has two main parts: First come the public comments (if any), second the JIRA issues. Each list of issues is sorted by ascending issue number. Noted are the ID, the summary and the reference to the relevant subsection where the issue progression has been documented:

Public Comments:

* [c201305e00000](https://lists.oasis-open.org/archives/odata-comment/201305/msg00000.html) "Specification of $count for 'Delta Responses'" [8.1.1][c201305e00000]

JIRA Issues:

* [ODATA-296](https://tools.oasis-open.org/issues/browse/ODATA-296) "Change tracking may require server-side state, but client cannot advise server to stop tracking in order to allow server to release resources" [8.2.2.5][odata-296]
* [ODATA-301](https://tools.oasis-open.org/issues/browse/ODATA-301) "Guidance around data authorization model and secure authenticated access to an OData Service" [8.3.1.1][odata-301]
* [ODATA-351](https://tools.oasis-open.org/issues/browse/ODATA-351) "Define ID, ReadLink and EditLink in Part 1: Protocol, define representation in Atom and JSON" [8.2.3.1][odata-351]
* [ODATA-364](https://tools.oasis-open.org/issues/browse/ODATA-364) "Explicitly state that the restriction that a property MUST NOT have the same name as its containing type only applies to directly declared properties" [8.2.1.3][odata-364]
* [ODATA-365](https://tools.oasis-open.org/issues/browse/ODATA-365) "Rename edm:AssertType to edm:Cast and clarify behavior of edm:Cast and cast()" [8.2.2.4][odata-365]
* [ODATA-366](https://tools.oasis-open.org/issues/browse/ODATA-366) "Clarify whether server-generated properties can be omitted in POST, even if they are not nullable" [8.2.2.7][odata-366]
* [ODATA-367](https://tools.oasis-open.org/issues/browse/ODATA-367) "Explicitly state that server MAY expand results beyond what's requested with $expand" [8.2.2.3][odata-367]
* [ODATA-368](https://tools.oasis-open.org/issues/browse/ODATA-368) "Deep insert: if server responds with 201 Created it MUST respond with at least the expansion depth of the insert operation" [8.2.2.6][odata-368]
* [ODATA-369](https://tools.oasis-open.org/issues/browse/ODATA-369) "POST to navigation link with binding information leading to a different 'parent' is invalid" [8.2.2.2][odata-369]
* [ODATA-370](https://tools.oasis-open.org/issues/browse/ODATA-370) "Disallow Nullable facet for collection-valued properties" [8.2.1.2][odata-370]
* [ODATA-371](https://tools.oasis-open.org/issues/browse/ODATA-371) "Clearly describe behavior of PUT for structural and navigation properties" [8.2.2.1][odata-371]
* [ODATA-373](https://tools.oasis-open.org/issues/browse/ODATA-373) "Add boolean expressions that can be used in <edm:If>" [8.2.1.1][odata-373]
* [ODATA-375](https://tools.oasis-open.org/issues/browse/ODATA-375) "Allow querying collections of complex type instances similar to querying collections of entities" [8.2.4.1][odata-375]
* [ODATA-376](https://tools.oasis-open.org/issues/browse/ODATA-376) "Navigation link representation for navigation properties of complex type instances" [8.2.5.1][odata-376]
* [ODATA-378](https://tools.oasis-open.org/issues/browse/ODATA-378) "Support relative IRIs for ids in JSON" [8.2.6.1][odata-378]
* [ODATA-379](https://tools.oasis-open.org/issues/browse/ODATA-379) "Ensure consistency and clear description in specification of $count for 'Delta Responses' (public comment c201305e00000)" [8.1.1.1][odata-379]

## Timeline Reference [TL_REF]

**Note**: Please cf. the current revision of the [TC timeline](https://www.oasis-open.org/committees/download.php/48609/TC%20Timeline%204.htm).
