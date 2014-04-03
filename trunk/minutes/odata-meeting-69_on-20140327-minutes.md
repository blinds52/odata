#OData meeting #69, Thursday,  27 Mar 2014, 0800 - 1000 PDT

**Note**: For explanations of conventions and other formal aspects common to OData TC meeting minutes which are used in this document please cf. "[Formal Aspects of Meeting Minutes](https://www.oasis-open.org/committees/download.php/48109/formal-aspects-meeting-minutes-v1.html)".

Meeting chaired by Ralf Handl

## 1 Roll call

### 1.1 Members Present:

        Diane Downie (Citrix Systems)
        Edmond Bourne (BlackBerry)
        Gerald Krause (SAP AG)
        Hubert Heijkers (IBM)
        John Willson (Individual)
        Ken Baclawski (Northeastern University)
        Mark Biamonte (Progress Software)
        Martin Zurmuehl (SAP AG)
        Matthew Borges (SAP AG) a.k.a. Matt
        Michael Pizzo (Microsoft) a.k.a. Mike
        Ralf Handl (SAP AG)
        Ron Dagostino (State Street Corp)
        Stefan Drees (Individual)
        Susan Malaika (IBM)
        Ted Jones (Red Hat)

Quorum achieved. Details cf. [normative attendance sheet for this meeting](https://www.oasis-open.org/apps/org/workgroup/odata/event.php?event_id=36534).

## 2 Approval of Agenda

Approved with the addition of adding an item to plan the next face to face before the issue processing.

## 3 Approval of Minutes from Previous Meeting(s)

### 3.1 Approval of [Minutes of 2014-03-13 Meeting#68](https://www.oasis-open.org/committees/download.php/52522/odata-meeting-68_on-20140313-minutes.html)

**Meeting minutes approved as published with no objections**.

## 4 Review of [Action Items](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_items.php) (AI) and Progress [AIH]

Context:
> See the "[List of Open Action Items Before the Meeting][AI_REF]" section in the appendix.

###4.1 Action items due by 2014-03-27 (end of day)

None.

###4.2 Action items NOT due by 2014-03-27 (end of day) but MAY be ready for closure

None.


## 6 Review of [Issues List](https://tools.oasis-open.org/issues/secure/IssueNavigator.jspa?reset=true&mode=hide&pid=10103&sorter/field=issuekey&sorter/order=ASC) (IL) and Progress [IPH]

**Notes**:

* Issues in this section (6) may have been progressed out of sequence, but have been noted here to better group by components impacted or state before the meeting and as a service for the reader.
* There is an "[Index of Issues Processed During the Meeting][IP_REF]" section in the appendix.

### 6.1 Issues for V4.0_ERRATA01 in New or Open state

#### 6.1.1 OData ABNF Construction Rules [ga_01]

Hubert:
>I **move** to resolve ODATA-565, ODATA-569, ODATA-590, and ODATA-604 as proposed. **Mike seconds**.

**No further discussion**. **No objections**. The **motion passes**.

##### 6.1.1.1 [ODATA-565](https://tools.oasis-open.org/issues/browse/ODATA-565)

ODATA-565:
: "2: Clarify interpretation of path segments and query option values with respect to percent-encoded punctuation" [components: OData URL Conventions, OData ABNF Construction Rules] is **New**.

Discussion:

* Ralf summarizes the issue
* All agree, the easiest enhancement would be to be more specific in the prose

Note:
> For details cf. [6.1.1][ga_01] where the motion is documented.

ODATA-565:
: "2: Clarify interpretation of path segments and query option values with respect to percent-encoded punctuation" [components: OData URL Conventions, OData ABNF Construction Rules] is **Proposed** with no objections.


##### 6.1.1.2 [ODATA-569](https://tools.oasis-open.org/issues/browse/ODATA-569)

ODATA-569:
: "Allow type-cast segment after function/action call in path expressions" [component: OData ABNF Construction Rules] is **New**.

Discussion:

* Ralf summarizes the issue

Note:
> For details cf. [6.1.1][ga_01] where the motion is documented.

ODATA-569:
: "Allow type-cast segment after function/action call in path expressions" [component: OData ABNF Construction Rules] is **OutState** with no objections.

##### 6.1.1.3 [ODATA-590](https://tools.oasis-open.org/issues/browse/ODATA-590)

ODATA-590:
: "Leading zeroes in values for $level" [component: OData ABNF Construction Rules] is **New**.

Discussion:

* Ralf summarizes the issue

Note:
> For details cf. [6.1.1][ga_01] where the motion is documented.

ODATA-590:
: "Leading zeroes in values for $level" [component: OData ABNF Construction Rules] is **Proposed** with no objections.

##### 6.1.1.4 [ODATA-604](https://tools.oasis-open.org/issues/browse/ODATA-604)

ODATA-604:
: "Add type cast segment for complex types in rules for $select and $expand" [component: OData ABNF Construction Rules] is **New**.

Discussion:

* Ralf summarizes the issue

Note:
> For details cf. [6.1.1][ga_01] where the motion is documented.

ODATA-604:
: "Add type cast segment for complex types in rules for $select and $expand" [component: OData ABNF Construction Rules] is **Proposed** with no objections.


#### 6.1.2 OData CSDL [ga_02]

Stefan:
>I **move** to resolve ODATA-559, ODATA-566, ODATA-570, ODATA-603, ODATA-605, ODATA-620, ODATA-621, and ODATA-625 as proposed. **Hubert seconds**.

**No further discussion**. **No objections**. The **motion passes**.

##### 6.1.2.1 [ODATA-559](https://tools.oasis-open.org/issues/browse/ODATA-559)

ODATA-559:
: "Clarify that Derived types inherit HasStream property" [component: OData CSDL] is **New**

Discussion:

* Mike summarizes the issue

Note:
> For details cf. [6.1.2][ga_02] where the motion is documented.

ODATA-559:
: "Clarify that Derived types inherit HasStream property" [component: OData CSDL] is **Proposed** with no objections.

##### 6.1.2.2 [ODATA-566](https://tools.oasis-open.org/issues/browse/ODATA-566)

ODATA-566:
: "6.2.4 Attribute Scale: clarify allowed range of Scale values" [component: OData CSDL] is **New**

Discussion:

* Ralf summarizes the issue

Note:
> For details cf. [6.1.2][ga_02] where the motion is documented.

ODATA-566:
: "6.2.4 Attribute Scale: clarify allowed range of Scale values" [component: OData CSDL] is **Proposed** with no objections.

##### 6.1.2.3 [ODATA-570](https://tools.oasis-open.org/issues/browse/ODATA-570)

ODATA-570:
: "Clearify behavior of edm:UrlRef expression" [component: OData CSDL] is **New**

Discussion:

* Mike summarizes the issue
* All agree to modify the proposed resolution during the meeting to document the consensus
* Mike has edited the issue in JIRA:
        (A): Follow the format specific rules for relative URLs
        (B) and (C): Relative URLs follow the rules for XML.
            First using xml:base,
            then the location of the document for relative urls.

Note:
> For details cf. [6.1.2][ga_02] where the motion is documented.

ODATA-570:
: "Clearify behavior of edm:UrlRef expression" [component: OData CSDL] is **Proposed** with no objections.

##### 6.1.2.4 [ODATA-603](https://tools.oasis-open.org/issues/browse/ODATA-603)

ODATA-603:
: "Primitive type Edm.Stream: use as type of collection, input parameter, return type, or underlying type of type definition" [component: OData CSDL] is **New**

Discussion:

* Mike summarizes the issue
* All discuss the issue
* Mike enters the changed proposal part into the issue:
        Proposal: Edm.Stream can be used in typedefinition,
            return type, binding parameter,
            but not as non-binding parameter or in a collection.

Note:
> For details cf. [6.1.2][ga_02] where the motion is documented.

ODATA-603:
: "Primitive type Edm.Stream: use as type of collection, input parameter, return type, or underlying type of type definition" [component: OData CSDL] is **Proposed** with no objections.

##### 6.1.2.5 [ODATA-605](https://tools.oasis-open.org/issues/browse/ODATA-605)

ODATA-605:
: "Annotation target path syntax insufficient to annotate contained entity sets" [component: OData CSDL] is **New**

Discussion:

* Ralf summarizes the issue and the proposed resolution
* All agree with the proposal and like to have more examples including Singletons

Note:
> For details cf. [6.1.2][ga_02] where the motion is documented.

ODATA-605:
: "Annotation target path syntax insufficient to annotate contained entity sets" [component: OData CSDL] is **Proposed** with no objections.

##### 6.1.2.6 [ODATA-606](https://tools.oasis-open.org/issues/browse/ODATA-606)

ODATA-606:
: "Specify navigation property binding combined with containment" [component: OData CSDL] is **New**

Discussion:

* Ralf summarizes the issue and emphasizes, that there is no proposal, thus we need to not fix or to first find a proposal
* All agree to open the issue and find a proposal

ODATA-606:
: "Specify navigation property binding combined with containment" [component: OData CSDL] is **Open** with no objections.

##### 6.1.2.7 [ODATA-620](https://tools.oasis-open.org/issues/browse/ODATA-620)

ODATA-620:
: "Replace 'scalar type' with 'primitive type' and 'scalar property' with 'structural property'" [component: OData CSDL] is **New**

Discussion:

* Ralf summarizes the issue

Note:
> For details cf. [6.1.2][ga_02] where the motion is documented.

ODATA-620:
: "Replace 'scalar type' with 'primitive type' and 'scalar property' with 'structural property'" [component: OData CSDL] is **Proposed** with no objections.

##### 6.1.2.8 [ODATA-621](https://tools.oasis-open.org/issues/browse/ODATA-621)

ODATA-621:
: "Clarify: Specifying an unbound function with overloads in a function import should import all overloads of that function to the entity container" [component: OData CSDL] is **New**

Discussion:

* Mike summarizes the issue

Note:
> For details cf. [6.1.2][ga_02] where the motion is documented.

ODATA-621:
: "Clarify: Specifying an unbound function with overloads in a function import should import all overloads of that function to the entity container" [component: OData CSDL] is **Proposed** with no objections.

##### 6.1.2.9 [ODATA-625](https://tools.oasis-open.org/issues/browse/ODATA-625)

ODATA-625:
: "Add example for UrlRef in attribute notation" [component: OData CSDL] is **New**

Discussion:

* Ralf summarizes the issue and proposal

Note:
> For details cf. [6.1.2][ga_02] where the motion is documented.

ODATA-625:
: "Add example for UrlRef in attribute notation" [component: OData CSDL] is **Proposed** with no objections.


#### 6.1.3 OData Protocol [ga_03]

Hubert:
>I **move** to resolve ODATA-578, ODATA-580, ODATA-591, ODATA-609, ODATA-610, ODATA-612, ODATA-623, and ODATA-624 as proposed. **Martin seconds**.

**No further discussion**. **No objections**. The **motion passes**.

##### 6.1.3.1 [ODATA-578](https://tools.oasis-open.org/issues/browse/ODATA-578)

ODATA-578:
: "Contains example has order of arguments backwards" [component: OData Protocol] is **New**

Discussion:

* Mike summarizes the issue
* All agree on the proposal

Note:
> For details cf. [6.1.3][ga_03] where the motion is documented.

ODATA-578:
: "Contains example has order of arguments backwards" [component: OData Protocol] is **Proposed** with no objections.


##### 6.1.3.2 [ODATA-580](https://tools.oasis-open.org/issues/browse/ODATA-580)

ODATA-580:
: "8.2.4 If-Match should refer to term Core.OptimisticConcurrency" [component: OData Protocol] is **New**

Discussion:

* All agree on the proposal

Note:
> For details cf. [6.1.3][ga_03] where the motion is documented.

ODATA-580:
: "8.2.4 If-Match should refer to term Core.OptimisticConcurrency" [component: OData Protocol] is **Proposed** with no objections.


##### 6.1.3.3 [ODATA-591](https://tools.oasis-open.org/issues/browse/ODATA-591)

ODATA-591:
: "Part1, examples 36-40: replace 'associated' with 'related'" [component: OData Protocol] is **New**

Discussion:

* Mike summarizes the issue
* All agree on the proposal

Note:
> For details cf. [6.1.3][ga_03] where the motion is documented.

ODATA-591:
: "Part1, examples 36-40: replace 'associated' with 'related'" [component: OData Protocol] is **Proposed** with no objections.


##### 6.1.3.4 [ODATA-609](https://tools.oasis-open.org/issues/browse/ODATA-609)

ODATA-609:
: "Section 11.4.4 Upsert: key values in URL win over key values in request body" [component: OData Protocol] is **New**

Discussion:

* All agree on the proposal

Note:
> For details cf. [6.1.3][ga_03] where the motion is documented.

ODATA-609:
: "Section 11.4.4 Upsert: key values in URL win over key values in request body" [component: OData Protocol] is **Proposed** with no objections.


##### 6.1.3.5 [ODATA-610](https://tools.oasis-open.org/issues/browse/ODATA-610)

ODATA-610:
: "11.4.4: Upsert and server-generated keys" [component: OData Protocol] is **New**

Discussion:

* Mike summarizes the issue
* The proposals are: Either explicitly state that the behavior is service-specific, or state the desired generic behavior, e.g. disallow this combination altogether.
* Mike prefers to disallow this combination altogether
* Mike updates the issue accordingly
* Updated proposal for OData-610 now reads: Disallow upserts for entity types with server-generated keys.
* All agree to disallow (as documented in the issue)

Note:
> For details cf. [6.1.3][ga_03] where the motion is documented.

ODATA-610:
: "11.4.4: Upsert and server-generated keys" [component: OData Protocol] is **Proposed** with no objections.


##### 6.1.3.6 [ODATA-612](https://tools.oasis-open.org/issues/browse/ODATA-612)

ODATA-612:
: "Consistently use 'edit link' and 'edit URL'" [components: OData Protocol, OData JSON Format] is **New**

Discussion:

* Mike summarizes the issue
* All agree on the proposal

Note:
> For details cf. [6.1.3][ga_03] where the motion is documented.

ODATA-612:
: "Consistently use 'edit link' and 'edit URL'" [components: OData Protocol, OData JSON Format] is **Proposed** with no objections.


##### 6.1.3.7 [ODATA-623](https://tools.oasis-open.org/issues/browse/ODATA-623)

ODATA-623:
: "11.4.3: be more specific on updating key properties" [component: OData Protocol] is **New**

Discussion:

* Mike summarizes the issue
* All agree on the proposal

Note:
> For details cf. [6.1.3][ga_03] where the motion is documented.

ODATA-623:
: "11.4.3: be more specific on updating key properties" [component: OData Protocol] is **Proposed** with no objections.


##### 6.1.3.8 [ODATA-624](https://tools.oasis-open.org/issues/browse/ODATA-624)

ODATA-624:
: "Clarify that (clients and) services may include additional format parameters in Content-Type header." [component: OData Protocol] is **New**

Discussion:

* All discuss ODATA-624
* All agree the proposal is fine as is, but add the server must anwser with NotAcceptable if format is not handled
* Mike adds to issue proposal: "Services must return with not acceptable if the request contains an unknown or unsupported format parameter."
* All agree on the updated proposal

Note:
> For details cf. [6.1.3][ga_03] where the motion is documented.

ODATA-624:
: "Clarify that (clients and) services may include additional format parameters in Content-Type header." [component: OData Protocol] is **Proposed** with no objections.


##### 6.1.3.9 [ODATA-632](https://tools.oasis-open.org/issues/browse/ODATA-632)

ODATA-632:
: "'Core.OptimisticConcurrencyControl' should be 'Core.OptimisticConcurrency'" [component: OData Protocol] is **New**

Discussion:

* All agree on the proposal but decide the issue should be closed as identical to ODATA-580.

ODATA-632:
: "'Core.OptimisticConcurrencyControl' should be 'Core.OptimisticConcurrency'" [component: OData Protocol] is **Closed as identical to ODATA-580** with no objections.



#### 6.1.4 OData URL Conventions [ga_04]

Stefan:
>I **move** to resolve ODATA-562, ODATA-564, ODATA-602, ODATA-608, and ODATA-611 as proposed. **Hubert seconds**.

**No further discussion**. **No objections**. The **motion passes**.

##### 6.1.4.1 [ODATA-562](https://tools.oasis-open.org/issues/browse/ODATA-562)

ODATA-562:
: "5.1.1.4.29: cast function is optional for first four rules" [component: OData URL Conventions] is **New**

Discussion:

* Ralf summarizes the issue and proposal
* Ralf cites: "The cast function follows these rules:
The null value can be cast to any type.
Primitive types are cast to Edm.String or a type definition based on it by using the literal representation used in payloads, and WKT (well-known text) format for Geo types, see rules fullCollectionLiteral, fullLineStringLiteral, fullMultiPointLiteral, fullMultiLineStringLiteral, fullMultiPolygonLiteral, fullPointLiteral, and fullPolygonLiteral in [OData-ABNF]. The cast fails if the target type specifies an insufficient MaxLength.
Numeric primitive types are cast to each other with appropriate rounding. The cast fails if the integer part doesn't fit into target type.
Edm.DateTimeOffset, Edm.Duration, and Edm.TimeOfDay values can be cast to the same type with a different precision with appropriate rounding.
Collections are cast item by item.
Services MAY support structural casting of entities and complex type instances to a derived type, or arbitrary structured type, by assigning values of identically named properties and casting them recursively. The cast fails if one of the property-value casts fails or the target type contains non-nullable properties that have not been assigned a value.
The cast function is optional for primitive values (first three rules)."

* All agree on the proposal

Note:
> For details cf. [6.1.4][ga_04] where the motion is documented.

ODATA-562:
: "5.1.1.4.29: cast function is optional for first four rules" [component: OData URL Conventions] is **Proposed** with no objections.

##### 6.1.4.2 [ODATA-564](https://tools.oasis-open.org/issues/browse/ODATA-564)

ODATA-564:
: "5.1.1.4.28: define 'assignable'" [component: OData URL Conventions] is **New**

Discussion:

* Ralf summarizes the issue and proposal
* All discuss a more explicit listing
* Ralf summarizes: "Assignable means:
    * structured type instances can be assigned to their type or a direct or indirect base type
    * primitive types to same primitive type
    * Byte to Int16, Int32 and Int64
    * SByte to Int16, Int32 and Int64
    * Int16 to Int32 and Int64
    * Int32 to Int64
    * Single to Double"
* All think, that the above clarifies, what assignable means in the context of OData
* The issue is updated
* All agree on the (updated) proposal

Note:
> For details cf. [6.1.4][ga_04] where the motion is documented.

ODATA-564:
: "5.1.1.4.28: define 'assignable'" [component: OData URL Conventions] is **Proposed** with no objections.

##### 6.1.4.3 [ODATA-602](https://tools.oasis-open.org/issues/browse/ODATA-602)

ODATA-602:
: "Explicitly state what's allowed after /$all" [component: OData URL Conventions] is **New**

Discussion:

* Ralf summarizes the issue and proposal

Note:
> For details cf. [6.1.4][ga_04] where the motion is documented.

ODATA-602:
: "Explicitly state what's allowed after /$all" [component: OData URL Conventions] is **Proposed** with no objections.

##### 6.1.4.4 [ODATA-608](https://tools.oasis-open.org/issues/browse/ODATA-608)

ODATA-608:
: "Explicitly state that the path segment /$count can be combined with $search and $filter, and that the calculated count is identical to $count=true" [component: OData URL Conventions] is **New**

Discussion:

* Ralf summarizes the issue and proposal
* All agree to that clarification

Note:
> For details cf. [6.1.4][ga_04] where the motion is documented.

ODATA-608:
: "Explicitly state that the path segment /$count can be combined with $search and $filter, and that the calculated count is identical to $count=true" [component: OData URL Conventions] is **Proposed** with no objections.

##### 6.1.4.5 [ODATA-611](https://tools.oasis-open.org/issues/browse/ODATA-611)

ODATA-611:
: "Explicitly state that the service root URL ends with a forward-slash" [component: OData URL Conventions] is **New**

Discussion:

* Ralf summarizes the issue and proposal
* Ralf names a public sample service root URL: [http://services.odata.org/V4/Northwind/Northwind.svc/](http://services.odata.org/V4/Northwind/Northwind.svc/) instead of [http://services.odata.org/V4/Northwind/Northwind.svc](http://services.odata.org/V4/Northwind/Northwind.svc)
* All agree to that clarification and further assume, that as service to clients, servers will rewrite/redirect if given a URL missing a final forward-slash as usual (cf. sample above)

Note:
> For details cf. [6.1.4][ga_04] where the motion is documented.

ODATA-611:
: "Explicitly state that the service root URL ends with a forward-slash" [component: OData URL Conventions] is **Proposed** with no objections.


## 7 Next meeting

All agree, that next meeting will be on Apr 03, 0800-1000 PDT


## 8 AOB

No other business

Meeting adjourned at 0942 PDT.


## List of Open Action Items Before the Meeting [AI_REF]

**Retrieval time stamp**: `2014-03-27 13:13 +01:00`.

None.

**Note**: The actual action item processing is documented in section [4][AIH] and subsections thereof.

## Index of Issues Processed During the Meeting [IP_REF]

**Note**: The actual issue processing is documented in sections [6][IPH]. The below index has two main parts: First come the public comments (if any), second the JIRA issues. Each list of issues is sorted by ascending issue number. Noted are the ID, the summary and the reference to the relevant subsection where the issue progression has been documented:

Public Comments:

None.

JIRA Issues:

* [ODATA-559](https://tools.oasis-open.org/issues/browse/ODATA-559) "Clarify that Derived types inherit HasStream property" [6.1.2.1][odata-559]
* [ODATA-562](https://tools.oasis-open.org/issues/browse/ODATA-562) "5.1.1.4.29: cast function is optional for first four rules" [6.1.3.1][odata-562]
* [ODATA-564](https://tools.oasis-open.org/issues/browse/ODATA-564) "5.1.1.4.28: define 'assignable'" [6.1.3.2][odata-564]
* [ODATA-565](https://tools.oasis-open.org/issues/browse/ODATA-565) "2: Clarify interpretation of path segments and query option values with respect to percent-encoded punctuation" [6.1.1.1][odata-565]
* [ODATA-566](https://tools.oasis-open.org/issues/browse/ODATA-566) "6.2.4 Attribute Scale: clarify allowed range of Scale values" [6.1.2.2][odata-566]
* [ODATA-569](https://tools.oasis-open.org/issues/browse/ODATA-569) "Allow type-cast segment after function/action call in path expressions" [6.1.1.2][odata-569]
* [ODATA-570](https://tools.oasis-open.org/issues/browse/ODATA-570) "Clearify behavior of edm:UrlRef expression" [6.1.2.3][odata-570]
* [ODATA-590](https://tools.oasis-open.org/issues/browse/ODATA-590) "Leading zeroes in values for $level" [6.1.1.3][odata-590]
* [ODATA-602](https://tools.oasis-open.org/issues/browse/ODATA-602) "Explicitly state what's allowed after /$all" [6.1.3.3][odata-602]
* [ODATA-603](https://tools.oasis-open.org/issues/browse/ODATA-603) "Primitive type Edm.Stream: use as type of collection, input parameter, return type, or underlying type of type definition" [6.1.2.4][odata-603]
* [ODATA-604](https://tools.oasis-open.org/issues/browse/ODATA-604) "Add type cast segment for complex types in rules for $select and $expand" [6.1.1.4][odata-604]
* [ODATA-605](https://tools.oasis-open.org/issues/browse/ODATA-605) "Annotation target path syntax insufficient to annotate contained entity sets" [6.1.2.5][odata-605]
* [ODATA-606](https://tools.oasis-open.org/issues/browse/ODATA-606) "Specify navigation property binding combined with containment" [6.1.2.6][odata-606]
* [ODATA-608](https://tools.oasis-open.org/issues/browse/ODATA-608) "Explicitly state that the path segment /$count can be combined with $search and $filter, and that the calculated count is identical to $count=true" [6.1.3.4][odata-608]
* [ODATA-611](https://tools.oasis-open.org/issues/browse/ODATA-611) "Explicitly state that the service root URL ends with a forward-slash" [6.1.3.5][odata-611]
* [ODATA-620](https://tools.oasis-open.org/issues/browse/ODATA-620) "Replace 'scalar type' with 'primitive type' and 'scalar property' with 'structural property'" [6.1.2.7][odata-620]
* [ODATA-621](https://tools.oasis-open.org/issues/browse/ODATA-621) "Clarify: Specifying an unbound function with overloads in a function import should import all overloads of that function to the entity container" [6.1.2.8][odata-621]
* [ODATA-625](https://tools.oasis-open.org/issues/browse/ODATA-625) "Add example for UrlRef in attribute notation" [6.1.2.9][odata-625]

## Timeline Reference [TL_REF]

**Note**: Please cf. the current revision of the [TC timeline](https://www.oasis-open.org/committees/download.php/50823/TC%20Timeline%206.htm).

