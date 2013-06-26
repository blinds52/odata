#OData meeting #43, Monday, 24 Jun 2013, 1230 - 1330 PT

**Note**: For explanations of conventions and other formal aspects common to OData TC meeting minutes which are used in this document please cf. "[Formal Aspects of Meeting Minutes](https://www.oasis-open.org/committees/download.php/48109/formal-aspects-meeting-minutes-v1.html)".

Meeting chaired by Barbara Hartel

## 1 Roll call

### 1.1 Members Present:

        Barbara Hartel (SAP AG)        Gerald Krause (SAP AG)        Hubert Heijkers (IBM)        John Willson (Individual)        Ken Baclawski (Northeastern University)        Martin Zurmuehl (SAP AG)        Matthew Borges (SAP AG) a.k.a. Matt        Michael Pizzo (Microsoft) a.k.a. Mike        Patrick Durusau (Individual)        Ralf Handl (SAP AG)        Stefan Drees (Individual)        Susan Malaika (IBM)        Ted Jones (Red Hat)

Quorum achieved. Details cf. [normative attendance sheet for this meeting](https://www.oasis-open.org/apps/org/workgroup/odata/event.php?event_id=35672).

## 2 Approval of Agenda

Discussion:

* Barbara asks the editors, if they think the documents are ripe for progression to CSD02 and if there are any further issues needed to process before approval.
* Mike reports that the editors finished applying all issues from face to face, sent in the resulting documents, received good feedback and subsequently applied the proposed changes also.
* Mike also emphasizes two changes to the documents that were not purely editorial, so he entered JIRA issues for those and would like to process these issues ODATA-463 and ODATA-464 at first in the issue processing section.
* All agree.
* Mike finally states, that the editors also would like to highlight another change, that is editorial in nature, but the editors concluded, they would like all members to take notice of it.
* All agree.
* Mike amends that the editors are confident, that the TC may decide upon submittal of the documents to CSD02 processing and if there is no consensus reached on the three above mentioned changes, these can easily be rolled back.

Agenda approved as ammended.

## 3 Approval of Minutes from Previous Meeting(s)

### 3.1 Approval of [Minutes of 2013-06-20 Meeting#42](https://www.oasis-open.org/committees/download.php/49649/odata-meeting-42_on-20130620-minutes.html)

**Meeting minutes approved with no objections**.

## 4 Review of [Issues List](https://tools.oasis-open.org/issues/secure/IssueNavigator.jspa?reset=true&mode=hide&pid=10103&sorter/field=issuekey&sorter/order=ASC) (IL) and Progress [IPH]

**Notes**:

* Issues in this section (4) may have been progressed out of sequence, but have been noted here to better group by components impacted or state before the meeting and as a service for the reader.
* There is an "[Index of Issues Processed During the Meeting][IP_REF]" section in the appendix.

### 4.1 [ODATA-463](https://tools.oasis-open.org/issues/browse/ODATA-463)

ODATA-463:
: "Deleted-entry, link, and deleted-link should include {entity-set} in context URL" [components: OData ATOM Format, OData ABNF Construction Rules, OData Protocol, OData JSON Format] is **New**.

Hubert: 
>I **move** to resolve ODATA-463 as proposed. **Mike seconds.**

**No further discussion**. **No objections**. The **motion passes**.

ODATA-463:
: "Deleted-entry, link, and deleted-link should include {entity-set} in context URL" [components: OData ATOM Format, OData ABNF Construction Rules, OData Protocol, OData JSON Format] is **Resolved**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[4.4][GM1]])

ODATA-463:
: "Deleted-entry, link, and deleted-link should include {entity-set} in context URL" [components: OData ATOM Format, OData ABNF Construction Rules, OData Protocol, OData JSON Format] is **Closed** with no objections.

### 4.2 [ODATA-464](https://tools.oasis-open.org/issues/browse/ODATA-464)

ODATA-464:
: "Disallows $format for delta and next links" [component: OData Protocol] is **New**.

Discussion:

* Hubert asks how to handle JSON vs. ATOM as client
* Stefan suggests to allow the server to somehow encode the format of the starting request that lead to the delta or next link as default into these nav links
* Mike also sees this, and suggests that servers note, to let headers take preference and probably not encode the info as $format into the nav links
* Matt thinks we should leave it open.
* Stefan suggests to resolve ODATA-464 as proposed with the addition, that "the service MAY indicate the preference from the request chain encoded in the delta or next link, to be used if the client sends no Prefer-Header".
* Hubert asks, why we do want to disallow the client appending $format to next and delta links
* Mike states that besides consistency, the $format in these cases was just nice for demos in browsers, where one cannot set headers easily
Mike states the current text in the document as: "OData clients MUST treat the URL of the next link as opaque, and MUST NOT append system query options to the URL of a next link. The Accept header MAY be used to specify the desired response format."
* Stefan sees only problems, when services do not store the preference of the client, whe the client does not use prefer headers but only $format to indicate format preference in the initial request.
* Mike suggests a possible alternate wording: "OData clients MUST treat the URL of the next link as opaque, and MUST NOT append system query options to the URL of a next link. By default, the format for each page SHOULD be the same as the initial request. The Accept header MAY be used to specify the desired response format."
* Mike states a scenario, where the service has no idea what to serve and further explains, that to receive a delta link, a client must have sent a matching request header in the first place

Stefan: 
> I **move** to resolve ODATA-464 as proposed. **Martin seconds.**

ODATA-464:
: "Disallows $format for delta and next links" [component: OData Protocol] is **Resolved**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[4.4][GM1]])

ODATA-464:
: "Disallows $format for delta and next links" [component: OData Protocol] is **Closed** with no objections.

### 4.3 Usage of Parentheses with Functions vs. Actions

Discussion:

* Martin notes, that the empty parens in the URL were always misleading, as one could falsely derive from them being empty, that there were no arguments given, but these of course were transmitted in the body of the request
* Mike states the current wording in protocol for binding an action: "To invoke an action bound to a resource, the client issues a POST request to an action URL. An action URL may be obtained from a previously returned entity representation or constructed by appending the namespace (or alias) qualified action name, followed by open and close parenthesis '()'"
* All discuss about the state of consistency of this aspect and comparing normative prose, ABNF and display in examples.
* Mike suggests an alternate wording to be consistent with ABNF: "To invoke an action bound to a resource, the client issues a POST request to an action URL. An action URL may be obtained from a previously returned entity representation or constructed by appending the namespace (or alias) qualified action name to a URL that identifies a resource whose type is the same as, or derives from, the type of the binding parameter of the action. "
* Stefan seconds the removal of mentioning parens in URLs for actions


Stefan:
> I **move** that the editors apply the alternate wording "To invoke an action bound to a resource, the client issues a POST request to an action URL. An action URL may be obtained from a previously returned entity representation or constructed by appending the namespace (or alias) qualified action name to a URL that identifies a resource whose type is the same as, or derives from, the type of the binding parameter of the action. " consistent with ABNF and examples in the prose document. **Martin seconds.**

**No further discussion**. **No objections**. The **motion passes**.

### 4.4 Issues in Applied state [GM1]

Stefan:
>I **move** to close ODATA-377, ODATA-386, ODATA-441, ODATA-445, ODATA-453, ODATA-454, ODATA-455, ODATA-456, ODATA-457, ODATA-458, ODATA-459, ODATA-460, ODATA-463 and ODATA-464 as applied. **Martin seconds**.

**No further discussion**. **No objections**. The **motion passes**.

####4.4.1 [ODATA-377](https://tools.oasis-open.org/issues/browse/ODATA-377)

ODATA-377:
: "Fix broken links in CSD01 documents " [components: OData CSDL, OData ATOM Format, OData Protocol, OData JSON Format, OData URL Conventions] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[4.4][GM1]])

ODATA-377:
: "Fix broken links in CSD01 documents " [components: OData CSDL, OData ATOM Format, OData Protocol, OData JSON Format, OData URL Conventions] is **Closed** with no objections.

####4.4.2 [ODATA-386](https://tools.oasis-open.org/issues/browse/ODATA-386)

ODATA-386:
: "odata-v4.0-csprd01-part1-protocol, 3 Data Model, appears to be an unnumbered list of definitions, with annotations defined in a separate subsection - suggest new format, etc." [component: OData Protocol] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[4.4][GM1]])

ODATA-386:
: "odata-v4.0-csprd01-part1-protocol, 3 Data Model, appears to be an unnumbered list of definitions, with annotations defined in a separate subsection - suggest new format, etc." [component: OData Protocol] is **Closed** with no objections.

####4.4.3 [ODATA-441](https://tools.oasis-open.org/issues/browse/ODATA-441)

ODATA-441:
: "Specify canonical form of entity-id" [components: OData URL Conventions, OData Protocol] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[4.4][GM1]])

ODATA-441:
: "Specify canonical form of entity-id" [components: OData URL Conventions, OData Protocol] is **Closed** with no objections.

####4.4.4 [ODATA-445](https://tools.oasis-open.org/issues/browse/ODATA-445)

ODATA-445:
: "odata.type relative to odata.type in surrounding entities" [components: OData JSON Format, OData ATOM Format] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[4.4][GM1]])

ODATA-445:
: "odata.type relative to odata.type in surrounding entities" [components: OData JSON Format, OData ATOM Format] is **Closed** with no objections.

####4.4.5 [ODATA-453](https://tools.oasis-open.org/issues/browse/ODATA-453)

ODATA-453:
: "deal with KEY function" [components: OData URL Conventions, OData ABNF Construction Rules] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[4.4][GM1]])

ODATA-453:
: "deal with KEY function" [components: OData URL Conventions, OData ABNF Construction Rules] is **Closed** with no objections.

####4.4.6 [ODATA-454](https://tools.oasis-open.org/issues/browse/ODATA-454)

ODATA-454:
: "Need a way to specify a property is unavailable" [components: OData JSON Format, OData ATOM Format, Vocabularies] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[4.4][GM1]])

ODATA-454:
: "Need a way to specify a property is unavailable" [components: OData JSON Format, OData ATOM Format, Vocabularies] is **Closed** with no objections.

####4.4.7 [ODATA-455](https://tools.oasis-open.org/issues/browse/ODATA-455)

ODATA-455:
: "Make EntityContainer a Singleton in MetadataService" [component: OData CSDL] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[4.4][GM1]])

ODATA-455:
: "Make EntityContainer a Singleton in MetadataService" [component: OData CSDL] is **Closed** with no objections.

####4.4.8 [ODATA-456](https://tools.oasis-open.org/issues/browse/ODATA-456)

ODATA-456:
: "Don't require client to specify odata.trackchanges preference on each page" [component: OData Protocol] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[4.4][GM1]])

ODATA-456:
: "Don't require client to specify odata.trackchanges preference on each page" [component: OData Protocol] is **Closed** with no objections.

####4.4.9 [ODATA-457](https://tools.oasis-open.org/issues/browse/ODATA-457)

ODATA-457:
: "Require hash (#) on odata.type" [components: OData ATOM Format, OData ABNF Construction Rules, OData Extension for JSON Data] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[4.4][GM1]])

ODATA-457:
: "Require hash (#) on odata.type" [components: OData ATOM Format, OData ABNF Construction Rules, OData Extension for JSON Data] is **Closed** with no objections.

####4.4.10 [ODATA-458](https://tools.oasis-open.org/issues/browse/ODATA-458)

ODATA-458:
: "odata.isolation should be a header rather than an expectation" [component: OData Protocol] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[4.4][GM1]])

ODATA-458:
: "odata.isolation should be a header rather than an expectation" [component: OData Protocol] is **Closed** with no objections.

####4.4.11 [ODATA-459](https://tools.oasis-open.org/issues/browse/ODATA-459)

ODATA-459:
: "State consequences of using IRIs that are not URLs" [component: OData Protocol] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[4.4][GM1]])

ODATA-459:
: "State consequences of using IRIs that are not URLs" [component: OData Protocol] is **Closed** with no objections.

####4.4.12 [ODATA-460](https://tools.oasis-open.org/issues/browse/ODATA-460)

ODATA-460:
: "Add terms to capability vocabulary" [components: Vocabularies, OData Protocol] is **Applied**.

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[4.4][GM1]])

ODATA-460:
: "Add terms to capability vocabulary" [components: Vocabularies, OData Protocol] is **Closed** with no objections.

## 5 Approve CSD002

### 5.1 OASIS Open Data Protocol (OData) version 4.0 multi-part Work Product

Stefan:
> I **move** to approve the latest Working Draft of the OASIS Open Data Protocol (OData) version 4.0 multi-part Work Product including associated files, all contained in [https://www.oasis-open.org/committees/download.php/49675/odata-v4.0-wd02-final-2013-06-24.zip](https://www.oasis-open.org/committees/download.php/49675/odata-v4.0-wd02-final-2013-06-24.zip) Committee Specification Draft 02, and start a 15-day public review. **Hubert seconds.**

**No further discussion**. **No objections**. The **motion passes**.

### 5.2 OASIS OData Atom Format version 4.0 Work Product

Stefan:
> I **move** to approve the latest Working Draft of the OASIS OData Atom Format version 4.0 Work Product including associated files, all contained in [https://www.oasis-open.org/committees/download.php/49673/odata-atom-format-v4.0-wd02-final-2013-06-24.zip](https://www.oasis-open.org/committees/download.php/49673/odata-atom-format-v4.0-wd02-final-2013-06-24.zip), as Committee Specification Draft 02, and start a 15-day public review. **Mike seconds.**

**No further discussion**. **No objections**. The **motion passes**.

### 5.3 OASIS OData JSON Format version 4.0 Work Product

Stefan:
> I **move** to approve the latest Working Draft of the OASIS OData JSON Format version 4.0 Work Product including associated files, all contained in [https://www.oasis-open.org/committees/download.php/49674/odata-json-format-v4.0-wd02-final-2013-06-24.zip](https://www.oasis-open.org/committees/download.php/49674/odata-json-format-v4.0-wd02-final-2013-06-24.zip), as Committee Specification Draft 02, and start a 15-day public review. **Mike seconds.**

**No further discussion**. **No objections**. The **motion passes**.

## 6 Next Meetings

### 6.1 Meeting on 2013-07-11 by Call during 0800-1000 PT

Note:
> Meeting 2013-06-27 skipped due to missing agenda items, meeting 2013-07-04 skipped due to public holiday in the US. The meeting on 2013-.07-11 is planned with two hours duration, so we may process any issues triggered by public comments from the CSD02 public review period.


## 7 AOB

None.

Meeting adjourned on 1332 PT


## Index of Issues Processed During the Meeting [IP_REF]

**Note**: The actual issue processing is documented in sections [4][IPH]. The below index has two main parts: First come the public comments (if any), second the JIRA issues. Each list of issues is sorted by ascending issue number. Noted are the ID, the summary and the reference to the relevant subsection where the issue progression has been documented:

Public Comments:

None.

JIRA Issues:

* [ODATA-377](https://tools.oasis-open.org/issues/browse/ODATA-377) "Fix broken links in CSD01 documents " [4.4.1][odata-377]
* [ODATA-386](https://tools.oasis-open.org/issues/browse/ODATA-386) "odata-v4.0-csprd01-part1-protocol, 3 Data Model, appears to be an unnumbered list of definitions, with annotations defined in a separate subsection - suggest new format, etc." [4.4.2][odata-386]
* [ODATA-441](https://tools.oasis-open.org/issues/browse/ODATA-441) "Specify canonical form of entity-id" [4.4.3][odata-441]
* [ODATA-445](https://tools.oasis-open.org/issues/browse/ODATA-445) "odata.type relative to odata.type in surrounding entities" [4.4.4][odata-445]
* [ODATA-453](https://tools.oasis-open.org/issues/browse/ODATA-453) "deal with KEY function" [4.4.5][odata-453]
* [ODATA-454](https://tools.oasis-open.org/issues/browse/ODATA-454) "Need a way to specify a property is unavailable" [4.4.6][odata-454]
* [ODATA-455](https://tools.oasis-open.org/issues/browse/ODATA-455) "Make EntityContainer a Singleton in MetadataService" [4.4.7][odata-455]
* [ODATA-456](https://tools.oasis-open.org/issues/browse/ODATA-456) "Don't require client to specify odata.trackchanges preference on each page" [4.4.8][odata-456]
* [ODATA-457](https://tools.oasis-open.org/issues/browse/ODATA-457) "Require hash (#) on odata.type" [4.4.9][odata-457]
* [ODATA-458](https://tools.oasis-open.org/issues/browse/ODATA-458) "odata.isolation should be a header rather than an expectation" [4.4.10][odata-458]
* [ODATA-459](https://tools.oasis-open.org/issues/browse/ODATA-459) "State consequences of using IRIs that are not URLs" [4.4.11][odata-459]
* [ODATA-460](https://tools.oasis-open.org/issues/browse/ODATA-460) "Add terms to capability vocabulary" [4.4.12][odata-460]
* [ODATA-463](https://tools.oasis-open.org/issues/browse/ODATA-463) "Deleted-entry, link, and deleted-link should include {entity-set} in context URL" [4.1][odata-463]
* [ODATA-464](https://tools.oasis-open.org/issues/browse/ODATA-464) "Disallows $format for delta and next links" [4.2][odata-464]

## Timeline Reference [TL_REF]

**Note**: Please cf. the current revision of the [TC timeline](https://www.oasis-open.org/committees/download.php/49178/TC%20Timeline%205.htm).


