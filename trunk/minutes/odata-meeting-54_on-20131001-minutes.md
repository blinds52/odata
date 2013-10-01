#OData meeting #54, Tuesday, 01 Oct 2013, 0800 - 0900 PT

**Note**: For explanations of conventions and other formal aspects common to OData TC meeting minutes which are used in this document please cf. "[Formal Aspects of Meeting Minutes](https://www.oasis-open.org/committees/download.php/48109/formal-aspects-meeting-minutes-v1.html)".

Meeting chaired by Ram Jeyaraman

## 1 Roll call

### 1.1 Members Present:

        Barbara Hartel (SAP AG)
        Gerald Krause (SAP AG)
        Hubert Heijkers (IBM)
        John Willson (Individual)
        Ken Baclawski (Northeastern University)
        Martin Zurmuehl (SAP AG)
        Matthew Borges (SAP AG) a.k.a. Matt
        Mike Pizzo (Microsoft) a.k.a. Mike
        Ralf Handl (SAP AG)
        Ram Jeyaraman (Microsoft)
        Ron Dagostino (State Street Corp)
        Stan Mitranic (CA Technologies)
        Stefan Drees (Individual)
        Susan Malaika (IBM)

Quorum achieved. Details cf. [normative attendance sheet for this meeting](https://www.oasis-open.org/apps/org/workgroup/odata/event.php?event_id=36052).

## 2 Approval of Agenda

Approved.

## 3 Approval of Minutes from Previous Meeting(s)

### 3.1 Approval of [Minutes of 2013-09-26 Meeting#53](https://www.oasis-open.org/committees/download.php/50840/odata-meeting-53_on-20130926-minutes.html)

**Meeting minutes approved with no objections**.

## 4 Review of [Action Items](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_items.php) (AI) and Progress [AIH]

Context:
> See the "[List of Open Action Items Before the Meeting][AI_REF]" section in the appendix.

###4.1 Action items due by 2013-10-01 (end of day)

None.

###4.2 Action items NOT due by 2013-10-01 (end of day) but MAY be ready for closure

None.

##5 Review of [Issues List](https://tools.oasis-open.org/issues/secure/IssueNavigator.jspa?reset=true&mode=hide&pid=10103&sorter/field=issuekey&sorter/order=ASC) (IL) and Progress [IPH]

**Notes**:

* Issues in this section (5) may have been progressed out of sequence, but have been noted here to better group by components impacted or state before the meeting and as a service for the reader.
* There is an "[Index of Issues Processed During the Meeting][IP_REF]" section in the appendix.

###5.1 Issues for v4.0_CS02 in New or Open state

####5.1.1 OData Protocol [coprot]

#####5.1.1.1 [ODATA-490](https://tools.oasis-open.org/issues/browse/ODATA-490)

ODATA-490:
: "Clarify Referential Constraints have UpdateRule=Cascade semantics" [component: OData Protocol] is **Open**.

Discussion:

* Mike summarizes the issue.
* All discuss the proposal
* Mike updates the proposal in JIRA to embed the result of the discussion, namely added clarification "8: For purposes of PUT, the default value for dependent properites is the value of the principle property."

Hubert:
>I **move** to resolve OData-490 as proposed. **Matt seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-490:
: "Clarify Referential Constraints have UpdateRule=Cascade semantics" [component: OData Protocol] is **Resolved as updated during the meeting** with no objections.

####5.1.2 Vocabularies [covoca]

#####5.1.2.1 [ODATA-531](https://tools.oasis-open.org/issues/browse/ODATA-531)

ODATA-531:
: "Simplify OptimisticConcurrency in Core vocabulary" [component: Vocabularies] is **New**.

Discussion:

* Mike summarizes the issue.
* Ralf explains that '&lt;Annotation Term="Core.OptimisticConcurrency" /&gt;'' will be sufficient as a tagging term.
* Martin requests to spell out in the core spec what is meant with the term, when using it without collection.
* Ralf additionally offers '&lt;Annotation Term="Core.OptimisticConcurrency"&gt;&lt;Collection/&gt;&lt;/Annotation&gt;'
* Mike argues, that we should try to avoid aloowing two ways expressing the same thing.
* THe proposal is being updated.

Mike:
>I **move** to resolve OData-531 as proposed. **Ralf seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-531:
: "Simplify OptimisticConcurrency in Core vocabulary" [component: Vocabularies] is **Resolved** with no objections.


#####5.1.2.2 [ODATA-534](https://tools.oasis-open.org/issues/browse/ODATA-534)

ODATA-534:
: "Tag type definition in Core should have default boolean value = true" [component: Vocabularies] is **Open**.

Discussion:

* Mike summarizes the issue and suggests to close the issue with no action.

Mike:
>I **move** to close OData-534 with no action. **Ralf seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-534:
: "Tag type definition in Core should have default boolean value = true" [component: Vocabularies] is **Closed** with no objections.


####5.1.3 OData ATOM Format, OData CSDL, OData JSON Format, OData Protocol [coatom_csdl_prot]


#####5.1.3.1 [ODATA-527](https://tools.oasis-open.org/issues/browse/ODATA-527)

ODATA-527:
: "Relative URLs in OData and the ability to put OData services behind an HTTP proxy" [components: OData CSDL, OData ATOM Format, OData Protocol, OData JSON Format] is **Open**.

Discussion:

* Mike suggests to defer, discuss offline and prepare for next meeting.
* All agree.

**No further discussion**. **No objections**.

ODATA-527:
: "Relative URLs in OData and the ability to put OData services behind an HTTP proxy" [components: OData CSDL, OData ATOM Format, OData Protocol, OData JSON Format] is **Open** with no objections.

####5.1.4 OData Protocol [coprot_2]

#####5.1.4.1 [ODATA-523](https://tools.oasis-open.org/issues/browse/ODATA-523)

ODATA-523:
: "How do clients construct links from the context url for complex types?" [component: OData Protocol] is **Open**.

Discussion:

* Mike suggests to defer, discuss offline and prepare for next meeting.
* All agree.

**No further discussion**. **No objections**.

ODATA-523:
: "How do clients construct links from the context url for complex types?" [component: OData Protocol] is **Open** with no objections.


####5.1.5 OData CSDL [cocsdl]

#####5.1.5.1 [ODATA-513](https://tools.oasis-open.org/issues/browse/ODATA-513)

ODATA-513:
: "Special handling of derived types in the dynamic expression edm:Record. Why?" [component: OData CSDL] is **Open**.

Discussion:

* Mike suggests to defer, discuss offline and prepare for next meeting.
* All agree.

**No further discussion**. **No objections**.

ODATA-513:
: "Special handling of derived types in the dynamic expression edm:Record. Why?" [component: OData CSDL] is **Open** with no objections.


#####5.1.5.2 [ODATA-535](https://tools.oasis-open.org/issues/browse/ODATA-535)

ODATA-535:
: "Define specialization for terms" [component: OData CSDL] is **Open**.

Discussion:

* Mike suggests to defer, discuss offline and prepare for next meeting.
* All agree.

**No further discussion**. **No objections**.

ODATA-535:
: "Define specialization for terms" [component: OData CSDL] is **Open** with no objections.


####5.1.6 Any other issues for v4.0_CS02 [co_any]

#####5.1.6.1 [ODATA-538](https://tools.oasis-open.org/issues/browse/ODATA-538)
ODATA-538:
: "Clarify treatment of odata.type with derived types and odata.context for delta responses for odata.metadata=none" [component: OData JSON Format] is **New**.

Discussion:

* Ralf summarizes the issue.
* Mike suggests to modify the proposal (by removing the of odata.type)
* Ralf reminds, that this would not help Evan (the reporter) as the aim is to minimize the volume by getting rid of the context URL

**No further discussion**. **No objections**.

ODATA-538:
: "Clarify treatment of odata.type with derived types and odata.context for delta responses for odata.metadata=none" [component: OData JSON Format] is **Open** with no objections.

#####5.1.6.2 [ODATA-539](https://tools.oasis-open.org/issues/browse/ODATA-539)
ODATA-539:
: "Delta response encoding is unnecessarily verbose and change type is missing when odata.metadata=none" [components: OData JSON Format, OData ATOM Format, OData Protocol] is **New**.

Discussion:

* Ralf summarizes the issue and suggests to open and defer.
* All agree.

**No further discussion**. **No objections**.

ODATA-539:
: "Delta response encoding is unnecessarily verbose and change type is missing when odata.metadata=none" [components: OData JSON Format, OData ATOM Format, OData Protocol] is **Open** with no objections.

#####5.1.6.1 [ODATA-536](https://tools.oasis-open.org/issues/browse/ODATA-536)
ODATA-536:
: "Treatment of circular references when using $levels" [components: OData URL Conventions, OData Protocol] is **New**.

Discussion:

* Mike summarizes the issue on behalf of Hubert.
* All discuss the issue.
* Mike updates the proposal.

Ralf:
>I **move** to resolve OData-xxx as proposed. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-536:
: "Treatment of circular references when using $levels" [components: OData URL Conventions, OData Protocol] is **Resolved** with no objections.


###5.2 v4.0_CS02 issues in Applied state [ga_01]

Discussion:

* Ralf highlights the changes during application of ODATA-466: Edm.Binary should be base64-encoded (as with OData V3), not base16-encoded (as per current ABNF)

Mike:
>I **move** we accept the changes to ODATA-466 as applied by allowing the padding characters and disallowing white space within encoded values. **John seconds**.

**No further discussion**. **No objections**. The **motion passes**.

Additional Discussion:

* Mike kindly asks Martin to review changes Mike made in some issues.
* Ralf states, that he actually performed the changes and thinks they are all ok.
* All discuss ODATA-537 and conclude to come back to it on thursday with the direction to make appending $ref required and get rid of association links (which are then redundant)
* Martin adds, that an implementer might map to $ref URLs by redirection as a minimal work around
* Mike suggests to also change ODATA-532 and conclude to come back to it on thursday with an updated proposal.

Stefan:
>I **move** to close ODATA-540, ODATA-533, ODATA-530, ODATA-528, ODATA-526, ODATA-525, ODATA-524, ODATA-522, ODATA-521, ODATA-520, ODATA-519, ODATA-518, ODATA-517, ODATA-515, ODATA-514, ODATA-512, ODATA-508, ODATA-507, ODATA-505, ODATA-503, ODATA-502, ODATA-501, ODATA-500, ODATA-498, ODATA-497, ODATA-496, ODATA-493, ODATA-492, ODATA-491, ODATA-487, ODATA-483, ODATA-481, ODATA-478, ODATA-477, ODATA-476, ODATA-475, ODATA-474, ODATA-473, ODATA-472, ODATA-471, ODATA-470, ODATA-468, and DATA-466 as applied. **Mike seconds**.

**No further discussion**. **No objections**. The **motion passes**.

####5.2.1 [ODATA-540](https://tools.oasis-open.org/issues/browse/ODATA-540)

ODATA-540:
: "Explicitly state that the Context URL locates (a specific portion of) the metadata document" [component: OData Protocol] is **Applied**.

Note:
> For details cf. [5.2][ga_01] where the motion is documented.

ODATA-540:
: "Explicitly state that the Context URL locates (a specific portion of) the metadata document" [component: OData Protocol] is **Closed** with no objections.

####5.2.2 [ODATA-537](https://tools.oasis-open.org/issues/browse/ODATA-537)

ODATA-537:
: "Ordering of navigationLink and associationLink annotations in JSON" [component: OData JSON Format] is **Applied**.

Note:
> For details cf. [5.2][ga_01] where the discussion is documented.

ODATA-537:
: "Ordering of navigationLink and associationLink annotations in JSON" [component: OData JSON Format] is **Resolved** with no objections.


####5.2.3 [ODATA-533](https://tools.oasis-open.org/issues/browse/ODATA-533)

ODATA-533:
: "Restrict key property aliases to key properties nested in complex properties" [component: OData CSDL] is **Applied**.

Note:
> For details cf. [5.2][ga_01] where the motion is documented.

ODATA-533:
: "Restrict key property aliases to key properties nested in complex properties" [component: OData CSDL] is **Closed** with no objections.

####5.2.4 [ODATA-532](https://tools.oasis-open.org/issues/browse/ODATA-532)

ODATA-532:
: "Clarify whether collections can contain null values" [components: OData CSDL, OData ATOM Format, OData Protocol, OData JSON Format] is **Applied**.

Note:
> For details cf. [5.2][ga_01] where the discussion is documented.

ODATA-532:
: "Clarify whether collections can contain null values" [components: OData CSDL, OData ATOM Format, OData Protocol, OData JSON Format] is **Resolved** with no objections.

####5.2.5 [ODATA-530](https://tools.oasis-open.org/issues/browse/ODATA-530)

ODATA-530:
: "Navigable capability term should apply to entityset, not navigationproperty directly" [component: Vocabularies] is **Applied**.

Note:
> For details cf. [5.2][ga_01] where the motion is documented.

ODATA-530:
: "Navigable capability term should apply to entityset, not navigationproperty directly" [component: Vocabularies] is **Closed** with no objections.

####5.2.6 [ODATA-528](https://tools.oasis-open.org/issues/browse/ODATA-528)

ODATA-528:
: "$entity should require cast segment in order to apply $select/$expand" [components: OData Protocol, OData ABNF Construction Rules] is **Applied**.

Note:
> For details cf. [5.2][ga_01] where the motion is documented.

ODATA-528:
: "$entity should require cast segment in order to apply $select/$expand" [components: OData Protocol, OData ABNF Construction Rules] is **Closed** with no objections.

####5.2.7 [ODATA-526](https://tools.oasis-open.org/issues/browse/ODATA-526)

ODATA-526:
: "Allow specifying support for cross-joins" [component: Vocabularies] is **Applied**.

Note:
> For details cf. [5.2][ga_01] where the motion is documented.

ODATA-526:
: "Allow specifying support for cross-joins" [component: Vocabularies] is **Closed** with no objections.

####5.2.8 [ODATA-525](https://tools.oasis-open.org/issues/browse/ODATA-525)

ODATA-525:
: "Remove Org.OData.Atom vocabulary" [components: Vocabularies, OData ATOM Format] is **Applied**.

Note:
> For details cf. [5.2][ga_01] where the motion is documented.

ODATA-525:
: "Remove Org.OData.Atom vocabulary" [components: Vocabularies, OData ATOM Format] is **Closed** with no objections.

####5.2.9 [ODATA-524](https://tools.oasis-open.org/issues/browse/ODATA-524)

ODATA-524:
: "properties in [propertyList] of context URL may be qualified with type" [components: OData Protocol, OData ABNF Construction Rules] is **Applied**.

Note:
> For details cf. [5.2][ga_01] where the motion is documented.

ODATA-524:
: "properties in [propertyList] of context URL may be qualified with type" [components: OData Protocol, OData ABNF Construction Rules] is **Closed** with no objections.

####5.2.10 [ODATA-522](https://tools.oasis-open.org/issues/browse/ODATA-522)

ODATA-522:
: "Clarify that the has operator returns null if either operand is null." [component: OData URL Conventions] is **Applied**.

Note:
> For details cf. [5.2][ga_01] where the motion is documented.

ODATA-522:
: "Clarify that the has operator returns null if either operand is null." [component: OData URL Conventions] is **Closed** with no objections.

####5.2.11 [ODATA-521](https://tools.oasis-open.org/issues/browse/ODATA-521)

ODATA-521:
: "Remove typed null literals" [components: OData Protocol, OData ABNF Construction Rules] is **Applied**.

Note:
> For details cf. [5.2][ga_01] where the motion is documented.

ODATA-521:
: "Remove typed null literals" [components: OData Protocol, OData ABNF Construction Rules] is **Closed** with no objections.

####5.2.12 [ODATA-520](https://tools.oasis-open.org/issues/browse/ODATA-520)

ODATA-520:
: "Instance annotations should be prefixed with '@'" [component: OData JSON Format] is **Applied**.

Note:
> For details cf. [5.2][ga_01] where the motion is documented.

ODATA-520:
: "Instance annotations should be prefixed with '@'" [component: OData JSON Format] is **Closed** with no objections.

####5.2.13 [ODATA-519](https://tools.oasis-open.org/issues/browse/ODATA-519)

ODATA-519:
: "Define server-driven paging for collection-valued resources" [components: OData JSON Format, OData ATOM Format, OData Protocol] is **Applied**.

Note:
> For details cf. [5.2][ga_01] where the motion is documented.

ODATA-519:
: "Define server-driven paging for collection-valued resources" [components: OData JSON Format, OData ATOM Format, OData Protocol] is **Closed** with no objections.

####5.2.14 [ODATA-518](https://tools.oasis-open.org/issues/browse/ODATA-518)

ODATA-518:
: "Use NavProp@&lt;annotation-name&gt; to reference annotations applied to a NavProp" [component: OData CSDL] is **Applied**.

Note:
> For details cf. [5.2][ga_01] where the motion is documented.

ODATA-518:
: "Use NavProp@&lt;annotation-name&gt; to reference annotations applied to a NavProp" [component: OData CSDL] is **Closed** with no objections.

####5.2.15 [ODATA-517](https://tools.oasis-open.org/issues/browse/ODATA-517)

ODATA-517:
: "Allow NavigationPropertyPath and PropertyPath expressions to end in annotations of appropriate type" [component: OData CSDL] is **Applied**.

Note:
> For details cf. [5.2][ga_01] where the motion is documented.

ODATA-517:
: "Allow NavigationPropertyPath and PropertyPath expressions to end in annotations of appropriate type" [component: OData CSDL] is **Closed** with no objections.

####5.2.16 [ODATA-515](https://tools.oasis-open.org/issues/browse/ODATA-515)

ODATA-515:
: "Section 5.1.1.9 Operator Precedence: operators use wrong capitalization in precedence table" [component: OData URL Conventions] is **Applied**.

Note:
> For details cf. [5.2][ga_01] where the motion is documented.

ODATA-515:
: "Section 5.1.1.9 Operator Precedence: operators use wrong capitalization in precedence table" [component: OData URL Conventions] is **Closed** with no objections.

####5.2.17 [ODATA-514](https://tools.oasis-open.org/issues/browse/ODATA-514)

ODATA-514:
: "Example 44: compare Price to a number instead of a string" [component: OData URL Conventions] is **Applied**.

Note:
> For details cf. [5.2][ga_01] where the motion is documented.

ODATA-514:
: "Example 44: compare Price to a number instead of a string" [component: OData URL Conventions] is **Closed** with no objections.

####5.2.18 [ODATA-512](https://tools.oasis-open.org/issues/browse/ODATA-512)

ODATA-512:
: "14.5.14: add example for specifying a value for a navigation property in a &lt;Record&gt; expression" [component: OData CSDL] is **Applied**.

Note:
> For details cf. [5.2][ga_01] where the motion is documented.

ODATA-512:
: "14.5.14: add example for specifying a value for a navigation property in a &lt;Record&gt; expression" [component: OData CSDL] is **Closed** with no objections.

####5.2.19 [ODATA-508](https://tools.oasis-open.org/issues/browse/ODATA-508)

ODATA-508:
: "Delete leftover 'respectively' from 6th paragraph of [JSON] Section 5, Service Document" [component: OData JSON Format] is **Applied**.

Note:
> For details cf. [5.2][ga_01] where the motion is documented.

ODATA-508:
: "Delete leftover 'respectively' from 6th paragraph of [JSON] Section 5, Service Document" [component: OData JSON Format] is **Closed** with no objections.

####5.2.20 [ODATA-507](https://tools.oasis-open.org/issues/browse/ODATA-507)

ODATA-507:
: "Editorial; text appears twice in section 11.2.6 of [Protocol]" [component: OData Protocol] is **Applied**.

Note:
> For details cf. [5.2][ga_01] where the motion is documented.

ODATA-507:
: "Editorial; text appears twice in section 11.2.6 of [Protocol]" [component: OData Protocol] is **Closed** with no objections.

####5.2.21 [ODATA-505](https://tools.oasis-open.org/issues/browse/ODATA-505)

ODATA-505:
: "Remove ReturnType attribute from Action and Function element" [component: OData CSDL] is **Applied**.

Note:
> For details cf. [5.2][ga_01] where the motion is documented.

ODATA-505:
: "Remove ReturnType attribute from Action and Function element" [component: OData CSDL] is **Closed** with no objections.

####5.2.22 [ODATA-503](https://tools.oasis-open.org/issues/browse/ODATA-503)

ODATA-503:
: "Error in ABNF grammar: Edm prefix required for built-in primitive types" [component: OData ABNF Construction Rules] is **Applied**.

Note:
> For details cf. [5.2][ga_01] where the motion is documented.

ODATA-503:
: "Error in ABNF grammar: Edm prefix required for built-in primitive types" [component: OData ABNF Construction Rules] is **Closed** with no objections.

####5.2.23 [ODATA-502](https://tools.oasis-open.org/issues/browse/ODATA-502)

ODATA-502:
: "Fix use of hash (#) for category term attribute in Atom" [components: OData Protocol, OData ATOM Format] is **Applied**.

Note:
> For details cf. [5.2][ga_01] where the motion is documented.

ODATA-502:
: "Fix use of hash (#) for category term attribute in Atom" [components: OData Protocol, OData ATOM Format] is **Closed** with no objections.

####5.2.24 [ODATA-501](https://tools.oasis-open.org/issues/browse/ODATA-501)

ODATA-501:
: "has operator is missing from the operator precedence table" [component: OData URL Conventions] is **Applied**.

Note:
> For details cf. [5.2][ga_01] where the motion is documented.

ODATA-501:
: "has operator is missing from the operator precedence table" [component: OData URL Conventions] is **Closed** with no objections.

####5.2.25 [ODATA-500](https://tools.oasis-open.org/issues/browse/ODATA-500)

ODATA-500:
: "Require function/action overloads to differ by ordered set of parameter types" [component: OData CSDL] is **Applied**.

Note:
> For details cf. [5.2][ga_01] where the motion is documented.

ODATA-500:
: "Require function/action overloads to differ by ordered set of parameter types" [component: OData CSDL] is **Closed** with no objections.

####5.2.26 [ODATA-498](https://tools.oasis-open.org/issues/browse/ODATA-498)

ODATA-498:
: "Error with m:type in Example 31 of Atom" [component: OData ATOM Format] is **Applied**.

Note:
> For details cf. [5.2][ga_01] where the motion is documented.

ODATA-498:
: "Error with m:type in Example 31 of Atom" [component: OData ATOM Format] is **Closed** with no objections.

####5.2.27 [ODATA-497](https://tools.oasis-open.org/issues/browse/ODATA-497)

ODATA-497:
: "Remove type prefix and single quotes for URL literals of types Date, DateTimeOffset, Guid, and TimeOfDay" [components: OData URL Conventions, OData ABNF Construction Rules] is **Applied**.

Note:
> For details cf. [5.2][ga_01] where the motion is documented.

ODATA-497:
: "Remove type prefix and single quotes for URL literals of types Date, DateTimeOffset, Guid, and TimeOfDay" [components: OData URL Conventions, OData ABNF Construction Rules] is **Closed** with no objections.

####5.2.28 [ODATA-496](https://tools.oasis-open.org/issues/browse/ODATA-496)

ODATA-496:
: "Adapt outdated action/function overload resolution rules in Part 1 to current rules in Part 3" [component: OData Protocol] is **Applied**.

Note:
> For details cf. [5.2][ga_01] where the motion is documented.

ODATA-496:
: "Adapt outdated action/function overload resolution rules in Part 1 to current rules in Part 3" [component: OData Protocol] is **Closed** with no objections.

####5.2.29 [ODATA-493](https://tools.oasis-open.org/issues/browse/ODATA-493)

ODATA-493:
: "Capabilities vocabulary: add term for SearchRestrictions" [component: Vocabularies] is **Applied**.

Note:
> For details cf. [5.2][ga_01] where the motion is documented.

ODATA-493:
: "Capabilities vocabulary: add term for SearchRestrictions" [component: Vocabularies] is **Closed** with no objections.

####5.2.30 [ODATA-492](https://tools.oasis-open.org/issues/browse/ODATA-492)

ODATA-492:
: "Add example for „has' operator to section 5.1.1.1.10" [component: OData URL Conventions] is **Applied**.

Note:
> For details cf. [5.2][ga_01] where the motion is documented.

ODATA-492:
: "Add example for „has' operator to section 5.1.1.1.10" [component: OData URL Conventions] is **Closed** with no objections.

####5.2.31 [ODATA-491](https://tools.oasis-open.org/issues/browse/ODATA-491)

ODATA-491:
: "Language-dependency of key property values" [components: OData Protocol, OData CSDL] is **Applied**.

Note:
> For details cf. [5.2][ga_01] where the motion is documented.

ODATA-491:
: "Language-dependency of key property values" [components: OData Protocol, OData CSDL] is **Closed** with no objections.

####5.2.32 [ODATA-487](https://tools.oasis-open.org/issues/browse/ODATA-487)

ODATA-487:
: "Clarify where relative URLs follow the rules in section 4.3 and where they follow different rules" [component: OData JSON Format] is **Applied**.

Note:
> For details cf. [5.2][ga_01] where the motion is documented.

ODATA-487:
: "Clarify where relative URLs follow the rules in section 4.3 and where they follow different rules" [component: OData JSON Format] is **Closed** with no objections.

####5.2.33 [ODATA-483](https://tools.oasis-open.org/issues/browse/ODATA-483)

ODATA-483:
: "Include all section levels in table of contents, provide anchors for all document sections" [components: OData CSDL, OData ATOM Format, OData Extension for JSON Data, OData Extension for Data Aggregation, OData JSON Format, OData Extension for Temporal Data, OData URL Conventions, OData Protocol] is **Applied**.

Note:
> For details cf. [5.2][ga_01] where the motion is documented.

ODATA-483:
: "Include all section levels in table of contents, provide anchors for all document sections" [components: OData CSDL, OData ATOM Format, OData Extension for JSON Data, OData Extension for Data Aggregation, OData JSON Format, OData Extension for Temporal Data, OData URL Conventions, OData Protocol] is **Closed** with no objections.

####5.2.34 [ODATA-481](https://tools.oasis-open.org/issues/browse/ODATA-481)

ODATA-481:
: "Annotation/Navigation/Path expressions: allow paths to continue after multi-valued navigation to e.g. drill into complex properties" [component: OData CSDL] is **Applied**.

Note:
> For details cf. [5.2][ga_01] where the motion is documented.

ODATA-481:
: "Annotation/Navigation/Path expressions: allow paths to continue after multi-valued navigation to e.g. drill into complex properties" [component: OData CSDL] is **Closed** with no objections.

####5.2.35 [ODATA-478](https://tools.oasis-open.org/issues/browse/ODATA-478)

ODATA-478:
: "Clarify format for values of Content-ID header in $batch parts" [component: OData Protocol] is **Applied**.

Note:
> For details cf. [5.2][ga_01] where the motion is documented.

ODATA-478:
: "Clarify format for values of Content-ID header in $batch parts" [component: OData Protocol] is **Closed** with no objections.

####5.2.36 [ODATA-477](https://tools.oasis-open.org/issues/browse/ODATA-477)

ODATA-477:
: "Clarify that dynamic properties can be used in all system query options" [component: OData URL Conventions] is **Applied**.

Note:
> For details cf. [5.2][ga_01] where the motion is documented.

ODATA-477:
: "Clarify that dynamic properties can be used in all system query options" [component: OData URL Conventions] is **Closed** with no objections.

####5.2.37 [ODATA-476](https://tools.oasis-open.org/issues/browse/ODATA-476)

ODATA-476:
: "Clarify that type-cast segments are required for properties of derived types in system query options" [component: OData URL Conventions] is **Applied**.

Note:
> For details cf. [5.2][ga_01] where the motion is documented.

ODATA-476:
: "Clarify that type-cast segments are required for properties of derived types in system query options" [component: OData URL Conventions] is **Closed** with no objections.

####5.2.38 [ODATA-475](https://tools.oasis-open.org/issues/browse/ODATA-475)

ODATA-475:
: "Document that the value '%' is used for annotating percentages with Measures.Unit" [component: Vocabularies] is **Applied**.

Note:
> For details cf. [5.2][ga_01] where the motion is documented.

ODATA-475:
: "Document that the value '%' is used for annotating percentages with Measures.Unit" [component: Vocabularies] is **Closed** with no objections.

####5.2.39 [ODATA-474](https://tools.oasis-open.org/issues/browse/ODATA-474)

ODATA-474:
: "Add example for POST/PUT/PATCH/DELETE on function result" [component: OData Protocol] is **Applied**.

Note:
> For details cf. [5.2][ga_01] where the motion is documented.

ODATA-474:
: "Add example for POST/PUT/PATCH/DELETE on function result" [component: OData Protocol] is **Closed** with no objections.

####5.2.40 [ODATA-473](https://tools.oasis-open.org/issues/browse/ODATA-473)

ODATA-473:
: "Harmonize description of function overload advertisement in Atom and JSON" [components: OData JSON Format, OData ATOM Format] is **Applied**.

Note:
> For details cf. [5.2][ga_01] where the motion is documented.

ODATA-473:
: "Harmonize description of function overload advertisement in Atom and JSON" [components: OData JSON Format, OData ATOM Format] is **Closed** with no objections.

####5.2.41 [ODATA-472](https://tools.oasis-open.org/issues/browse/ODATA-472)

ODATA-472:
: "Explicitly state how dynamic properties are represented if they are not defined on an entity" [components: OData JSON Format, OData ATOM Format, OData Protocol] is **Applied**.

Note:
> For details cf. [5.2][ga_01] where the motion is documented.

ODATA-472:
: "Explicitly state how dynamic properties are represented if they are not defined on an entity" [components: OData JSON Format, OData ATOM Format, OData Protocol] is **Closed** with no objections.

####5.2.42 [ODATA-471](https://tools.oasis-open.org/issues/browse/ODATA-471)

ODATA-471:
: "Property names must also be a valid XML Names (NCName)" [component: OData CSDL] is **Applied**.

Note:
> For details cf. [5.2][ga_01] where the motion is documented.

ODATA-471:
: "Property names must also be a valid XML Names (NCName)" [component: OData CSDL] is **Closed** with no objections.

####5.2.43 [ODATA-470](https://tools.oasis-open.org/issues/browse/ODATA-470)

ODATA-470:
: "Clarify behavior of /$value requests to properties of type Edm.Binary or Edm.Geo*" [component: OData Protocol] is **Applied**.

Note:
> For details cf. [5.2][ga_01] where the motion is documented.

ODATA-470:
: "Clarify behavior of /$value requests to properties of type Edm.Binary or Edm.Geo*" [component: OData Protocol] is **Closed** with no objections.

####5.2.44 [ODATA-468](https://tools.oasis-open.org/issues/browse/ODATA-468)

ODATA-468:
: "Define explicit concepts in ABNF for referenced sets of rules" [components: OData CSDL, OData ABNF Construction Rules] is **Applied**.

Note:
> For details cf. [5.2][ga_01] where the motion is documented.

ODATA-468:
: "Define explicit concepts in ABNF for referenced sets of rules" [components: OData CSDL, OData ABNF Construction Rules] is **Closed** with no objections.

####5.2.45 [ODATA-466](https://tools.oasis-open.org/issues/browse/ODATA-466)

ODATA-466:
: "Edm.Binary should be base64-encoded (as with OData V3), not base16-encoded (as per current ABNF)" [components: OData ATOM Format, OData ABNF Construction Rules, OData JSON Format, OData CSDL, OData URL Conventions] is **Applied**.

Note:
> For details cf. [5.2][ga_01] where the motion is documented.

ODATA-466:
: "Edm.Binary should be base64-encoded (as with OData V3), not base16-encoded (as per current ABNF)" [components: OData ATOM Format, OData ABNF Construction Rules, OData JSON Format, OData CSDL, OData URL Conventions] is **Closed** with no objections.


######5.2.45.1 End of Issue Processing [eoip]

Note:
>Time slot for issue processing gone. Skip all remaining agenda sub items of 5.

##6 Review revised [TC timeline][TL_REF] and immediate next steps

###6.1 Oct 3rd, 2013:

Approve CSD03?

###6.2 Oct 10-24, 2013:

3rd public review?

##7 Next meetings

###7.1 October 3, 2013 during 8-10am PT

Agreed.

##8 AOB

None.

Meeting adjourned on 0944 PT

## List of Open Action Items Before the Meeting [AI_REF]

**Retrieval time stamp**: `2013-10-01 16:55 +02:00`.

None.

**Note**: The actual action item processing is documented in section [4][AIH] and subsections thereof.

## Index of Issues Processed During the Meeting [IP_REF]

**Note**: The actual issue processing is documented in sections [5][IPH]. The below index has two main parts: First come the public comments (if any), second the JIRA issues. Each list of issues is sorted by ascending issue number. Noted are the ID, the summary and the reference to the relevant subsection where the issue progression has been documented:

Public Comments:

None.

JIRA Issues:

* [ODATA-466](https://tools.oasis-open.org/issues/browse/ODATA-466) "Edm.Binary should be base64-encoded (as with OData V3), not base16-encoded (as per current ABNF)" [5.2.45][odata-466]
* [ODATA-468](https://tools.oasis-open.org/issues/browse/ODATA-468) "Define explicit concepts in ABNF for referenced sets of rules" [5.2.44][odata-468]
* [ODATA-470](https://tools.oasis-open.org/issues/browse/ODATA-470) "Clarify behavior of /$value requests to properties of type Edm.Binary or Edm.Geo*" [5.2.43][odata-470]
* [ODATA-471](https://tools.oasis-open.org/issues/browse/ODATA-471) "Property names must also be a valid XML Names (NCName)" [5.2.42][odata-471]
* [ODATA-472](https://tools.oasis-open.org/issues/browse/ODATA-472) "Explicitly state how dynamic properties are represented if they are not defined on an entity" [5.2.41][odata-472]
* [ODATA-473](https://tools.oasis-open.org/issues/browse/ODATA-473) "Harmonize description of function overload advertisement in Atom and JSON" [5.2.40][odata-473]
* [ODATA-474](https://tools.oasis-open.org/issues/browse/ODATA-474) "Add example for POST/PUT/PATCH/DELETE on function result" [5.2.39][odata-474]
* [ODATA-475](https://tools.oasis-open.org/issues/browse/ODATA-475) "Document that the value '%' is used for annotating percentages with Measures.Unit" [5.2.38][odata-475]
* [ODATA-476](https://tools.oasis-open.org/issues/browse/ODATA-476) "Clarify that type-cast segments are required for properties of derived types in system query options" [5.2.37][odata-476]
* [ODATA-477](https://tools.oasis-open.org/issues/browse/ODATA-477) "Clarify that dynamic properties can be used in all system query options" [5.2.36][odata-477]
* [ODATA-478](https://tools.oasis-open.org/issues/browse/ODATA-478) "Clarify format for values of Content-ID header in $batch parts" [5.2.35][odata-478]
* [ODATA-481](https://tools.oasis-open.org/issues/browse/ODATA-481) "Annotation/Navigation/Path expressions: allow paths to continue after multi-valued navigation to e.g. drill into complex properties" [5.2.34][odata-481]
* [ODATA-483](https://tools.oasis-open.org/issues/browse/ODATA-483) "Include all section levels in table of contents, provide anchors for all document sections" [5.2.33][odata-483]
* [ODATA-487](https://tools.oasis-open.org/issues/browse/ODATA-487) "Clarify where relative URLs follow the rules in section 4.3 and where they follow different rules" [5.2.32][odata-487]
* [ODATA-490](https://tools.oasis-open.org/issues/browse/ODATA-490) "Clarify Referential Constraints have UpdateRule=Cascade semantics" [5.1.1.1][odata-490]
* [ODATA-491](https://tools.oasis-open.org/issues/browse/ODATA-491) "Language-dependency of key property values" [5.2.31][odata-491]
* [ODATA-492](https://tools.oasis-open.org/issues/browse/ODATA-492) "Add example for „has' operator to section 5.1.1.1.10" [5.2.30][odata-492]
* [ODATA-493](https://tools.oasis-open.org/issues/browse/ODATA-493) "Capabilities vocabulary: add term for SearchRestrictions" [5.2.29][odata-493]
* [ODATA-496](https://tools.oasis-open.org/issues/browse/ODATA-496) "Adapt outdated action/function overload resolution rules in Part 1 to current rules in Part 3" [5.2.28][odata-496]
* [ODATA-497](https://tools.oasis-open.org/issues/browse/ODATA-497) "Remove type prefix and single quotes for URL literals of types Date, DateTimeOffset, Guid, and TimeOfDay" [5.2.27][odata-497]
* [ODATA-498](https://tools.oasis-open.org/issues/browse/ODATA-498) "Error with m:type in Example 31 of Atom" [5.2.26][odata-498]
* [ODATA-500](https://tools.oasis-open.org/issues/browse/ODATA-500) "Require function/action overloads to differ by ordered set of parameter types" [5.2.25][odata-500]
* [ODATA-501](https://tools.oasis-open.org/issues/browse/ODATA-501) "has operator is missing from the operator precedence table" [5.2.24][odata-501]
* [ODATA-502](https://tools.oasis-open.org/issues/browse/ODATA-502) "Fix use of hash (#) for category term attribute in Atom" [5.2.23][odata-502]
* [ODATA-503](https://tools.oasis-open.org/issues/browse/ODATA-503) "Error in ABNF grammar: Edm prefix required for built-in primitive types" [5.2.22][odata-503]
* [ODATA-505](https://tools.oasis-open.org/issues/browse/ODATA-505) "Remove ReturnType attribute from Action and Function element" [5.2.21][odata-505]
* [ODATA-507](https://tools.oasis-open.org/issues/browse/ODATA-507) "Editorial; text appears twice in section 11.2.6 of [Protocol]" [5.2.20][odata-507]
* [ODATA-508](https://tools.oasis-open.org/issues/browse/ODATA-508) "Delete leftover 'respectively' from 6th paragraph of [JSON] Section 5, Service Document" [5.2.19][odata-508]
* [ODATA-512](https://tools.oasis-open.org/issues/browse/ODATA-512) "14.5.14: add example for specifying a value for a navigation property in a &lt;Record&gt; expression" [5.2.18][odata-512]
* [ODATA-513](https://tools.oasis-open.org/issues/browse/ODATA-513) "Special handling of derived types in the dynamic expression edm:Record. Why?" [5.1.5.1][odata-513]
* [ODATA-514](https://tools.oasis-open.org/issues/browse/ODATA-514) "Example 44: compare Price to a number instead of a string" [5.2.17][odata-514]
* [ODATA-515](https://tools.oasis-open.org/issues/browse/ODATA-515) "Section 5.1.1.9 Operator Precedence: operators use wrong capitalization in precedence table" [5.2.16][odata-515]
* [ODATA-517](https://tools.oasis-open.org/issues/browse/ODATA-517) "Allow NavigationPropertyPath and PropertyPath expressions to end in annotations of appropriate type" [5.2.15][odata-517]
* [ODATA-518](https://tools.oasis-open.org/issues/browse/ODATA-518) "Use NavProp@&lt;annotation-name&gt; to reference annotations applied to a NavProp" [5.2.14][odata-518]
* [ODATA-519](https://tools.oasis-open.org/issues/browse/ODATA-519) "Define server-driven paging for collection-valued resources" [5.2.13][odata-519]
* [ODATA-520](https://tools.oasis-open.org/issues/browse/ODATA-520) "Instance annotations should be prefixed with '@'" [5.2.12][odata-520]
* [ODATA-521](https://tools.oasis-open.org/issues/browse/ODATA-521) "Remove typed null literals" [5.2.11][odata-521]
* [ODATA-522](https://tools.oasis-open.org/issues/browse/ODATA-522) "Clarify that the has operator returns null if either operand is null." [5.2.10][odata-522]
* [ODATA-523](https://tools.oasis-open.org/issues/browse/ODATA-523) "How do clients construct links from the context url for complex types?" [5.1.4.1][odata-523]
* [ODATA-524](https://tools.oasis-open.org/issues/browse/ODATA-524) "properties in [propertyList] of context URL may be qualified with type" [5.2.9][odata-524]
* [ODATA-525](https://tools.oasis-open.org/issues/browse/ODATA-525) "Remove Org.OData.Atom vocabulary" [5.2.8][odata-525]
* [ODATA-526](https://tools.oasis-open.org/issues/browse/ODATA-526) "Allow specifying support for cross-joins" [5.2.7][odata-526]
* [ODATA-527](https://tools.oasis-open.org/issues/browse/ODATA-527) "Relative URLs in OData and the ability to put OData services behind an HTTP proxy" [5.1.3.1][odata-527]
* [ODATA-528](https://tools.oasis-open.org/issues/browse/ODATA-528) "$entity should require cast segment in order to apply $select/$expand" [5.2.6][odata-528]
* [ODATA-530](https://tools.oasis-open.org/issues/browse/ODATA-530) "Navigable capability term should apply to entityset, not navigationproperty directly" [5.2.5][odata-530]
* [ODATA-531](https://tools.oasis-open.org/issues/browse/ODATA-531) "Simplify OptimisticConcurrency in Core vocabulary" [5.1.2.1][odata-531]
* [ODATA-532](https://tools.oasis-open.org/issues/browse/ODATA-532) "Clarify whether collections can contain null values" [5.2.4][odata-532]
* [ODATA-533](https://tools.oasis-open.org/issues/browse/ODATA-533) "Restrict key property aliases to key properties nested in complex properties" [5.2.3][odata-533]
* [ODATA-534](https://tools.oasis-open.org/issues/browse/ODATA-534) "Tag type definition in Core should have default boolean value = true" [5.1.2.2][odata-534]
* [ODATA-535](https://tools.oasis-open.org/issues/browse/ODATA-535) "Define specialization for terms" [5.1.5.2][odata-535]
* [ODATA-537](https://tools.oasis-open.org/issues/browse/ODATA-537) "Ordering of navigationLink and associationLink annotations in JSON" [5.2.2][odata-537]
* [ODATA-540](https://tools.oasis-open.org/issues/browse/ODATA-540) "Explicitly state that the Context URL locates (a specific portion of) the metadata document" [5.2.1][odata-540]

## Timeline Reference [TL_REF]

**Note**: Please cf. the current revision of the [TC timeline](https://www.oasis-open.org/committees/download.php/50823/TC%20Timeline%206.htm).


