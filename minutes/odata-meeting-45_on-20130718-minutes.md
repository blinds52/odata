#OData meeting #45, Monday, 18 Jul 2013, 0800 - 1000 PT

**Note**: For explanations of conventions and other formal aspects common to OData TC meeting minutes which are used in this document please cf. "[Formal Aspects of Meeting Minutes](https://www.oasis-open.org/committees/download.php/48109/formal-aspects-meeting-minutes-v1.html)".

Meeting chaired by Barbara Hartel

## 1 Roll call

### 1.1 Members Present:

        Barbara Hartel (SAP AG)
        Dale Moberg (Axway Software)
        Erik de Voogd (SDL)
        Hubert Heijkers (IBM)
        John Willson (Individual)
        Ken Baclawski (Northeastern University)
        Martin Zurmuehl (SAP AG)
        Matthew Borges (SAP AG) a.k.a. Matt
        Michael Pizzo (Microsoft) a.k.a. Mike
        Nuno Linhares (SDL)
        Patrick Durusau (Individual)
        Ralf Handl (SAP AG)
        Stan Mitranic (CA Technologies)
        Stefan Drees (Individual)
        Susan Malaika (IBM)
        Ted Jones (Red Hat)

Quorum achieved. Details cf. [normative attendance sheet for this meeting](https://www.oasis-open.org/apps/org/workgroup/odata/event.php?event_id=34206).

## 2 Approval of Agenda

Approved (including the added agenda item 5 under which the received comment [c201307e00000](https://lists.oasis-open.org/archives/odata-comment/201307/msg00000.html) is discussed).

## 3 Approval of Minutes from Previous Meeting(s)

### 3.1 Approval of [Minutes of 2013-07-11 Meeting#44](https://www.oasis-open.org/committees/download.php/49956/odata-meeting-44_on-20130711-minutes.html)

**Meeting minutes approved with no objections**.

## 4 Review of [Action Items](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_items.php) (AI) and Progress [AIH]

Context:
> See the "[List of Open Action Items Before the Meeting][AI_REF]" section in the appendix.

###4.1 Action items due by 2013-07-18 (end of day)

None.

###4.2 Action items NOT due by 2013-07-18 (end of day) but MAY be ready for closure

None.


##5 Discuss public comment(s) / Review of Resulting Issues [IPH]

**Notes**:

* Issues in this section (5) may have been progressed out of sequence, but have been noted here to better group by components impacted or state before the meeting and as a service for the reader.
* There is an "[Index of Issues Processed During the Meeting][IP_REF]" section in the appendix.

###5.1 [c201307e00000](https://lists.oasis-open.org/archives/odata-comment/201307/msg00000.html)

Context:
> Public comment "Are Edm.Stream properties supported in complex types?"

Discussion:

* Ralf summarizes: "An entity or complex type instance MAY have one or more stream properties (for example, a photo property of an employee entity). Properties that represent streams have a type of Edm.Stream.
OData uses the atom:link element to represent a stream property.""

####5.1.1 [ODATA-465](https://tools.oasis-open.org/issues/browse/ODATA-465)

ODATA-465:
: "Explicitly mention that complex type instances can have stream properties (public comment c201307e00000)" [components: OData JSON Format, OData ATOM Format] is **New**.

Ralf:
>I **move** to resolve ODATA-465 as proposed. **Martin seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-465:
: "Explicitly mention that complex type instances can have stream properties (public comment c201307e00000)" [components: OData JSON Format, OData ATOM Format] is **Resolved** with no objections.

##6 Review non-material changes to CSPRD02

###6.1 Part 1: Protocol

Chapter 10: Replaced "contained navigation property" with "containment navigation property"
This is a typo; the correct term is "containment navigation property".

All: This editorial change is non-material.

Section 13.1.3, item 11: Changed the $batch system query option to batch requests
This was a copy&paste error: $batch is a resource name, not a query option, and the referenced section 11.7 is correctly named Batch Requests.

All: This editorial change is non-material.

###6.2 Part 2: URL Conventions

Section 5.1.1.10, changed to bullet list and added period at end of fifth item
The list item numbers get lost in the HTML version of the document, and numbering doesn't add value, so the list format was changed to a bullet list.
Correcting the formatting and the typo does not add or remove a feature, so it is a non-material change.

All: Agree that the changes are non-material

###6.3 Part 3: CSDL

Section 3.5.1: Changed include to edmx:IncludeAnnotions and namespace with TermNamespace
Using the element and attribute names instead of similar sounding prose phrases is more precise.
Correcting these formulations does not add or remove a feature, so it is a non-material change.

Section 14.5.12: Changed annotations to terms
Fourth paragraph, last sentence: the sentence talks about terms, not annotations.
Correcting the text does not add or remove a feature, so it is a non-material change.

All: Agree that these changes in sections 3.5.1 and 14.5.12 are non-material

###6.4 Atom Format

Section 9.1: Added or complex type instance
Part 3, sections 9 and 4.4 state that complex types can have stream properties. This was not explicitly stated in the format specification.
Making the description more explicit does not add or remove a feature, so it is a non-material change.

All: Agree that the changes are non-material

###6.5 JSON Format

Section 4.1: Changed Requests and responses in JSON to Requests and responses with a JSON message body
The old text led to confusion for GET requests and 204 responses that do not have a message body and consequently no Content-Type header.
Rephrasing the sentence does not add or remove a feature, so it is a non-material change.

Chapter 5: Changed odata.value to value
This was a typo; all top-level collections are represented as a name-value pair with name "value".
Correcting the typo does not add or remove a feature, so it is a non-material change.

Chapter 9: Added or complex type instance and changed entity to representation
Part 3, sections 9 and 4.4 state that complex types can have stream properties. This was not explicitly stated in the format specification.
Making the description more explicit does not add or remove a feature, so it is a non-material change.

Note: add that example was correct

All: Agree that the changes are non-material

###6.6 EDMX Schema MetadataService.edmx

ComplexType LabeledElementReference: Changed SimpleIdentifier to QualifiedName
This was a typo; LabeledElementReference refers to a named element in scope, and as per CSDL section 3.3 this is consistently done with a QualifiedName.
Correcting this typo does not add or remove a feature, so it is a non-material change.

All: Agree that the changes are non-material

###6.7 abnf-construction-rules.txt

Split rule contextFragment into rules context and contextFragment
Separating the alternatives after the # sign simplifies future extensibility. This does not change the lexical patterns accepted by the grammar.
Splitting the rule does not add or remove a feature, so it is a non-material change.

Corrected rule contextFragment
The grammar did not allow key predicates after navigation segments, which are explicitly required in Part 1, chapter 10.
Correcting the rule does not add or remove a feature, so it is a non-material change.

All: Agree that the changes in abnf-construction-rules.txt are non-material

###6.8 odata-abnf-testcases.xml

Added test case for corrected rule contextFragment
Adding a test case does not add or remove a feature, so it is a non-material change.

Added test case for corrected rule contextFragment
Adding a test case does not add or remove a feature, so it is a non-material change.

All: Agree that the changes in odata-abnf-testcases-rules.xml are non-material

###6.9 Changes to Non-Normative Examples

####6.9.1 Atom Format [atomformat_examples]

Section 6, Example 5: Added xmlns:data
The namespace prefix was used and not declared in the example.

Section 7.1, Example 8: Changed Double to Single
This was a copy&paste error.

Section 8.4, Example 22: Added ellipsis to indicate omitted namespace declarations
This makes the intentional incompleteness of the example more explicit.

Chapter 10, Example 26: Added ellipsis to indicate omitted namespace declarations
This makes the intentional incompleteness of the example more explicit.

Section 18.2.1, Example 44: Added ellipsis to indicate omitted namespace declarations
This makes the intentional incompleteness of the example more explicit.

All: Agree that the changes are non-material

####6.9.2 JSON Format [jsonformat_examples]

Several Examples: Replaced curly double quotes with straight double quotes
In several examples the double quotes delimiting names and values were typographic curly quotes instead of the syntactically correct straight double quotes (").

Section 7.1, Example 11: Removed erroneous double quotes
Two numeric values were quoted in the example, but are specified to be unquoted in the preceding normative text.

All: Agree that the changes are non-material

##7 Review changes in Data Aggregation

Discussion:

* Ralf: Introduce one-parameter overload for groupby() to get the distinct combinations of grouping properties. This reads nicer than groupby((...),aggregate())
* All: TODO: check Core specs on whether $select sections explicitly talk about dynamic properties

## 8 Next Meetings

### 8.1 Meeting on 2013-07-25 by Call during 0800-0900 PT

Agreed.

## 9 AOB

None.

Meeting adjourned on 0935 PT

## List of Open Action Items Before the Meeting [AI_REF]

**Retrieval time stamp**: `2013-07-18 12:12 +02:00`.

AI#0018
: "Prepare Working Draft 01 (WD01) version of OData Extension for Temporal Data" [owner: Hubert Heijkers] is **Ongoing** (Note: Due 2013-07-31)

AI#0019
: "Prepare Working Draft 01 (WD01) version of OData Extension for XML Data" [owner: Stefan Drees] is **Ongoing** (Note: Due 2013-07-31)

AI#0020
: "Prepare Working Draft 01 (WD01) version of OData Extension for JSON Data" [owner: Susan Malaika] is **Ongoing** (Note: Due 2013-07-31)


**Note**: The actual action item processing is documented in section [4][AIH] and subsections thereof.

## Index of Issues Processed During the Meeting [IP_REF]

**Note**: The actual issue processing is documented in sections [5][IPH]. The below index has two main parts: First come the public comments (if any), second the JIRA issues. Each list of issues is sorted by ascending issue number. Noted are the ID, the summary and the reference to the relevant subsection where the issue progression has been documented:

Public Comments:

* [c201307e00000](https://lists.oasis-open.org/archives/odata-comment/201307/msg00000.html) "Are Edm.Stream properties supported in complex types?" [5.1][c201307e00000]

JIRA Issues:

* [ODATA-465](https://tools.oasis-open.org/issues/browse/ODATA-465) "Explicitly mention that complex type instances can have stream properties (public comment c201307e00000)" [5.1.1][odata-465]

## Timeline Reference [TL_REF]

**Note**: Please cf. the current revision of the [TC timeline](https://www.oasis-open.org/committees/download.php/49178/TC%20Timeline%205.htm).


