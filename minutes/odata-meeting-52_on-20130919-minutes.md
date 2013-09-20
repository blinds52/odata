#OData meeting #52, Monday, 19 Sep 2013, 0800 - 0900 PT

**Note**: For explanations of conventions and other formal aspects common to OData TC meeting minutes which are used in this document please cf. "[Formal Aspects of Meeting Minutes](https://www.oasis-open.org/committees/download.php/48109/formal-aspects-meeting-minutes-v1.html)".

Meeting chaired by Ram Jeyaraman

## 1 Roll call

### 1.1 Members Present:

        Barbara Hartel (SAP AG)
        Dale Moberg (Axway Software)
        Diane Downie (Citrix Systems)
        Edmond Bourne (BlackBerry)
        Gerald Krause (SAP AG)
        Hubert Heijkers (IBM)
        John Willson (Individual)
        Ken Baclawski (Northeastern University)
        Martin Zurmuehl (SAP AG)
        Michael Pizzo (Microsoft) a.k.a. Mike
        Ralf Handl (SAP AG)
        Ram Jeyaraman (Microsoft)
        Ron Dagostino (State Street Corp)
        Stan Mitranic (CA Technologies)
        Stefan Drees (Individual)
        Susan Malaika (IBM)
        Ted Jones (Red Hat)

Quorum achieved. Details cf. [normative attendance sheet for this meeting](https://www.oasis-open.org/apps/org/workgroup/odata/event.php?event_id=34215).

## 2 Approval of Agenda

Approved.

## 3 Approval of Minutes from Previous Meeting(s)

### 3.1 Approval of [Minutes of 2013-09-12 Meeting#51](https://www.oasis-open.org/committees/download.php/50703/odata-meeting-51_on-20130912-minutes.html)

**Meeting minutes approved with no objections**.

## 4 Review of [Action Items](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_items.php) (AI) and Progress [AIH]

Context:
> See the "[List of Open Action Items Before the Meeting][AI_REF]" section in the appendix.

###4.1 Action items due by 2013-09-19 (end of day)

None.

###4.2 Action items NOT due by 2013-09-19 (end of day) but MAY be ready for closure

None.

##5 OData Extension for Data Aggregation

###5.1 Currently in first public review ending 19th September 2013.

No public comments yet.

Discussion:

* Mike states, that fomr the side of Microsoft no pending substantial comments are known

##6 Should we produce a revised Committee Specification to address key errata and technical issues?

Context:
> Proposal from Mike via E-Mail with subject [Proposal for OData Committee Spec Draft #2](https://lists.oasis-open.org/archives/odata/201309/msg00102.html) has been seconded by Hubert, Ralf and Stefan. Chet Ensign gave feedback on the analysis, stating this is correct and additionally hinted at the fact, that all statements of use (SoU) should target the correct CSD number. So when a CS02 comes to life, all relevant SoU should reference that CS02.

Discussion:

* Mike summarizes the proposal
* Ram asks which issues should be incorporated in that enhanced CSD02
* All agree, that the inclusion criterion is clearly fixing errors and not putting in features.
* Stefan suggests (and is willing to move) that we stop processing known editorial issues as errata and instead direct the editors to prepare new/clean versions of all five specifications (and any related components within the three work products) so they can remove most known defects from the current drafts, prepare even better drafts and the committee may use that as CS02.
* Ram asks for a cut-off date for issues to keep the timeline as true as possible.
* Mike expects that at the end of next weeks meeting (which should reserve two hours time instead of only one) all these issues to be included will be identified.

Stefan:
>I **move** that we stop processing known editorial issues as errata and instead direct the editors to prepare new/clean versions of all five specifications (and any related components within the three work products) so they can remove most known defects from the current drafts, prepare even better drafts and the committee may use that as CS02. **Martin seconds**.

**No further discussion**. **No objections**. The **motion passes**.

Discussion:

* Mike requests to also include possibly normative changes.
* Stefan thinks, that could we move this now or in the next meeting, when the plans are on the table.
* All agree to do this now and thus Stefan will do so.

Stefan:
>I **move** that we stop processing known editorial issues as errata and instead direct the editors to prepare new/clean versions of all five specifications (and any related components within the three work products) so they can remove most known defects from the current drafts, prepare even better drafts and the committee may use that as CS02 (also including possibly normative changes also including possibly normative changes which will be decided in the next 2 hour long meeting 2013-09-26). **Hubert seconds**.

Discussion of motion:

* John is all for it, but wants to ensure, that Ralf - as editor - is also in favor of the proposal
* Ralf really likes the proposal

**No further discussion**. **No objections**. The **motion passes**.

##7 Review of [Issues List](https://tools.oasis-open.org/issues/secure/IssueNavigator.jspa?reset=true&mode=hide&pid=10103&sorter/field=issuekey&sorter/order=ASC) (IL) and Progress [IPH]

**Notes**:

* Issues in this section (7) may have been progressed out of sequence, but have been noted here to better group by components impacted or state before the meeting and as a service for the reader.
* There is an "[Index of Issues Processed During the Meeting][IP_REF]" section in the appendix.

###7.1 Issues for v4.0_Errata1

####7.1.1 OData CSDL, OData Protocol [cocsdl_prot]

#####7.1.1.1 [ODATA-491](https://tools.oasis-open.org/issues/browse/ODATA-491)

ODATA-491:
: "Language-dependency of key property values" [components: OData Protocol, OData CSDL] is **Open**.

Discussion:

* All think this requires discussion.

ODATA-491:
: "Language-dependency of key property values" [components: OData Protocol, OData CSDL] is **Open** with no objections.

####7.1.2 OData ATOM Format, OData JSON Format [coatom_json]

#####7.1.2.1 [ODATA-473](https://tools.oasis-open.org/issues/browse/ODATA-473)

ODATA-473:
: "Harmonize description of function overload advertisement in Atom and JSON" [components: OData JSON Format, OData ATOM Format] is **New**.

Discussion:

* All think this is purely editorial.

ODATA-473:
: "Harmonize description of function overload advertisement in Atom and JSON" [components: OData JSON Format, OData ATOM Format] is **New** with no objections.

####7.1.3 OData ATOM Format, OData JSON Format, OData Protocol [coatom_json_prot]

#####7.1.3.1 [ODATA-472](https://tools.oasis-open.org/issues/browse/ODATA-472)

ODATA-472:
: "Explicitly state how dynamic properties are represented if they are not defined on an entity" [components: OData JSON Format, OData ATOM Format, OData Protocol] is **New**.

Discussion:

* Mike summarizes the issue as not purely editorial

ODATA-472:
: "Explicitly state how dynamic properties are represented if they are not defined on an entity" [components: OData JSON Format, OData ATOM Format, OData Protocol] is **New** with no objections.

####7.1.4 OData ATOM Format, OData CSDL [coatom_csdl]

#####7.1.4.1 [ODATA-471](https://tools.oasis-open.org/issues/browse/ODATA-471)

ODATA-471:
: "Property names must also be a valid XML Names (NCName)" [components: OData CSDL, OData ATOM Format] is **New**.

Discussion:

* Mike summarizes the issue as purely editorial.

ODATA-471:
: "Property names must also be a valid XML Names (NCName)" [components: OData CSDL, OData ATOM Format] is **New** with no objections.

####7.1.5 OData URL Conventions [courlc]

#####7.1.5.1 [ODATA-515](https://tools.oasis-open.org/issues/browse/ODATA-515)

ODATA-515:
: "Section 5.1.1.9 Operator Precedence: operators use wrong capitalization in precedence table" [component: OData URL Conventions] is **New**.

Discussion:

* Mike summarizes the issue as editorial

ODATA-515:
: "Section 5.1.1.9 Operator Precedence: operators use wrong capitalization in precedence table" [component: OData URL Conventions] is **New** with no objections.

#####7.1.5.2 [ODATA-514](https://tools.oasis-open.org/issues/browse/ODATA-514)

ODATA-514:
: "Example 44: compare Price to a number instead of a string" [component: OData URL Conventions] is **New**.

Discussion:

* Ralf summarizes the issue as editorial

ODATA-514:
: "Example 44: compare Price to a number instead of a string" [component: OData URL Conventions] is **New** with no objections.

#####7.1.5.3 [ODATA-492](https://tools.oasis-open.org/issues/browse/ODATA-492)

ODATA-492:
: "Add example for 'has' operator to section 5.1.1.1.10" [component: OData URL Conventions] is **Open**.

Discussion:

* Ralf summarizes the issue as editorial

ODATA-492:
: "Add example for 'has' operator to section 5.1.1.1.10" [component: OData URL Conventions] is **Open** with no objections.


#####7.1.5.4 [ODATA-477](https://tools.oasis-open.org/issues/browse/ODATA-477)

ODATA-477:
: "Clarify that dynamic properties can be used in all system query options" [component: OData URL Conventions] is **New**.

Discussion:

* Mike summarizes the issue as editorial

ODATA-477:
: "Clarify that dynamic properties can be used in all system query options" [component: OData URL Conventions] is **New** with no objections.

#####7.1.5.5 [ODATA-476](https://tools.oasis-open.org/issues/browse/ODATA-476)

ODATA-476:
: "Clarify that type-cast segments are NOT required for properties of derived types in system query options" [component: OData URL Conventions] is **New**.

Discussion:

* Mike summarizes the issue as not editorial

ODATA-476:
: "Clarify that type-cast segments are NOT required for properties of derived types in system query options" [component: OData URL Conventions] is **New** with no objections.

#####7.1.5.6 [ODATA-493](https://tools.oasis-open.org/issues/browse/ODATA-493)

ODATA-493:
: "Capabilities vocabulary: add term for SearchRestrictions" [component: Vocabularies] is **Open**.

Discussion:

* Ralf summarizes the issue as mostly editorial

ODATA-493:
: "Capabilities vocabulary: add term for SearchRestrictions" [component: Vocabularies] is **Open** with no objections.

#####7.1.5.7 [ODATA-475](https://tools.oasis-open.org/issues/browse/ODATA-475)

ODATA-475:
: "Document that the value '%' is used for annotating percentages with Measures.Unit" [component: Vocabularies] is **New**.

Discussion:

* Ralf summarizes the issue as editorial

ODATA-475:
: "Document that the value '%' is used for annotating percentages with Measures.Unit" [component: Vocabularies] is **New** with no objections.

####7.1.6 OData CSDL [cocsdl]

#####7.1.6.1 [ODATA-513](https://tools.oasis-open.org/issues/browse/ODATA-513)

ODATA-513:
: "Special handling of derived types in the dynamic expression edm:Record. Why?" [component: OData CSDL] is **New**.

Discussion:

* Ralf summarizes the issue as to be discussed between Mike and Ralf before application

ODATA-513:
: "Special handling of derived types in the dynamic expression edm:Record. Why?" [component: OData CSDL] is **New** with no objections.


#####7.1.6.2 [ODATA-512](https://tools.oasis-open.org/issues/browse/ODATA-512)

ODATA-512:
: "14.5.14: add example for specifying a value for a navigation property in a &lt;Record&gt; expression" [component: OData CSDL] is **New**.

Discussion:

* Ralf summarizes the issue as purely editorial

ODATA-512:
: "14.5.14: add example for specifying a value for a navigation property in a &lt;Record&gt; expression" [component: OData CSDL] is **New** with no objections.

####7.1.7 OData JSON Format [cojson]

#####7.1.7.1 [ODATA-508](https://tools.oasis-open.org/issues/browse/ODATA-508)

ODATA-508:
: "Delete leftover 'respectively' from 6th paragraph of [JSON] Section 5, Service Document" [component: OData JSON Format] is **New**.

Discussion:

* All consider the issue as purely editorial.

ODATA-508:
: "Delete leftover 'respectively' from 6th paragraph of [JSON] Section 5, Service Document" [component: OData JSON Format] is **New** with no objections.

#####7.1.7.2 [ODATA-487](https://tools.oasis-open.org/issues/browse/ODATA-487)

ODATA-487:
: "Clarify where relative URLs follow the rules in section 4.3 and where they follow different rules" [component: OData JSON Format] is **Open**.

Discussion:

* All consider the issue as purely editorial (but no proposal yet).

ODATA-487:
: "Clarify where relative URLs follow the rules in section 4.3 and where they follow different rules" [component: OData JSON Format] is **Open** with no objections.

####7.1.8 OData Protocol [coprot]

#####7.1.8.1 [ODATA-507](https://tools.oasis-open.org/issues/browse/ODATA-507)

ODATA-507:
: "Editorial; text appears twice in section 11.2.6 of [Protocol]" [component: OData Protocol] is **New**.

Discussion:

* All consider the issue as purely editorial.

ODATA-507:
: "Editorial; text appears twice in section 11.2.6 of [Protocol]" [component: OData Protocol] is **New** with no objections.

#####7.1.8.2 [ODATA-490](https://tools.oasis-open.org/issues/browse/ODATA-490)

ODATA-490:
: "Clarify Referential Constraints have UpdateRule=Cascade semantics" [component: OData Protocol] is **Open**.

Discussion:

* Ralf summarizes that this issue needs discussion.

ODATA-490:
: "Clarify Referential Constraints have UpdateRule=Cascade semantics" [component: OData Protocol] is **Open** with no objections.

#####7.1.8.3 [ODATA-478](https://tools.oasis-open.org/issues/browse/ODATA-478)

ODATA-478:
: "Clarify format for values of Content-ID header in $batch parts" [component: OData Protocol] is **New**.

Discussion:

* Ralf summarizes that this issue needs a little discussion.

ODATA-478:
: "Clarify format for values of Content-ID header in $batch parts" [component: OData Protocol] is **New** with no objections.


#####7.1.8.4 [ODATA-474](https://tools.oasis-open.org/issues/browse/ODATA-474)

ODATA-474:
: "Add example for POST/PUT/PATCH/DELETE on function result" [component: OData Protocol] is **New**.

Discussion:

* Ralf summarizes the issue as purely editorial.

ODATA-474:
: "Add example for POST/PUT/PATCH/DELETE on function result" [component: OData Protocol] is **New** with no objections.

#####7.1.8.5 [ODATA-470](https://tools.oasis-open.org/issues/browse/ODATA-470)

ODATA-470:
: "Clarify behavior of /$value requests to properties of type Edm.Binary or Edm.Geo*" [component: OData Protocol] is **New**.

Discussion:

* Mike summarizes the issue as purely editorial.

ODATA-470:
: "Clarify behavior of /$value requests to properties of type Edm.Binary or Edm.Geo*" [component: OData Protocol] is **New** with no objections.

####7.1.9 OData ABNF Construction Rules [coabnf]

#####7.1.9.1 [ODATA-503](https://tools.oasis-open.org/issues/browse/ODATA-503)

ODATA-503:
: "Error in ABNF grammer: Edm prefix required for built-in primitive types" [component: OData ABNF Construction Rules] is **New**.

Discussion:

* Ralf summarizes the issue as purely editorial.

ODATA-503:
: "Error in ABNF grammer: Edm prefix required for built-in primitive types" [component: OData ABNF Construction Rules] is **New** with no objections.

####7.1.10 OData ATOM Format, OData Protocol [coatom_prot]

#####7.1.10.1 [ODATA-502](https://tools.oasis-open.org/issues/browse/ODATA-502)

ODATA-502:
: Fix use of hash (#) for category term attribute in Atom" [components: OData Protocol, OData ATOM Format] is **New**.

Discussion:

* Ralf summarizes the issue as purely editorial.

ODATA-502:
: Fix use of hash (#) for category term attribute in Atom" [components: OData Protocol, OData ATOM Format] is **New** with no objections.

###7.2 v4.0_Errata1 issues in Applied state [ga_01]

Stefan
>I **move** to close ODATA-511, ODATA-510, ODATA-509, ODATA-506, ODATA-504, ODATA-499, ODATA-495, ODATA-489, ODATA-488, ODATA-486, ODATA-485, ODATA-484, and ODATA-469 as applied. **Mike** seconds.

**No further discussion**. **No objections**. The **motion passes**.

####7.2.1 OData ABNF Construction Rules [coabnf_2]

Note:
> For details on processing of issues in below subsections cf. [7.2][ga_01] where the motion is documented.

#####7.2.1.1 [ODATA-506](https://tools.oasis-open.org/issues/browse/ODATA-506)

ODATA-506:
: "Rule day does not allow the values 10 and 20" [component: OData ABNF Construction Rules] is **Applied**.

Note:
> For details cf. [7.2][ga_01] where the motion is documented.

ODATA-506:
: "Rule day does not allow the values 10 and 20" [component: OData ABNF Construction Rules] is **Closed** with no objections.

#####7.2.1.2 [ODATA-504](https://tools.oasis-open.org/issues/browse/ODATA-504)

ODATA-504:
: "Comment in line 456 should refer to rule lambdaVariableExpr" [component: OData ABNF Construction Rules] is **Applied**.

Note:
> For details cf. [7.2][ga_01] where the motion is documented.

ODATA-504:
: "Comment in line 456 should refer to rule lambdaVariableExpr" [component: OData ABNF Construction Rules] is **Closed** with no objections.

####7.2.2 OData CSDL [cocsdl_2]

Note:
> For details on processing of issues in below subsections cf. [7.2][ga_01] where the motion is documented.

#####7.2.2.1 [ODATA-511](https://tools.oasis-open.org/issues/browse/ODATA-511)

ODATA-511:
: "13.6 and 13.6.2: 'bound' should hyperlink to section 12.2.3 instead of 12.1.3" [component: OData CSDL] is **Applied**.

Note:
> For details cf. [7.2][ga_01] where the motion is documented.

ODATA-511:
: "13.6 and 13.6.2: 'bound' should hyperlink to section 12.2.3 instead of 12.1.3" [component: OData CSDL] is **Closed** with no objections.

#####7.2.2.2 [ODATA-510](https://tools.oasis-open.org/issues/browse/ODATA-510)

ODATA-510:
: "Example 78: replace IsBindable with IsBound" [component: OData CSDL] is **Applied**.

Note:
> For details cf. [7.2][ga_01] where the motion is documented.

ODATA-510:
: "Example 78: replace IsBindable with IsBound" [component: OData CSDL] is **Closed** with no objections.

#####7.2.2.3 [ODATA-509](https://tools.oasis-open.org/issues/browse/ODATA-509)

ODATA-509:
: "14.1: Superfluous period at end of second sentence" [component: OData CSDL] is **Applied**.

Note:
> For details cf. [7.2][ga_01] where the motion is documented.

ODATA-509:
: "14.1: Superfluous period at end of second sentence" [component: OData CSDL] is **Closed** with no objections.

#####7.2.2.4 [ODATA-499](https://tools.oasis-open.org/issues/browse/ODATA-499)

ODATA-499:
: "7.1.3 Nullable should refer to NavigationProperty, not Property" [component: OData CSDL] is **Applied**.

Note:
> For details cf. [7.2][ga_01] where the motion is documented.

ODATA-499:
: "7.1.3 Nullable should refer to NavigationProperty, not Property" [component: OData CSDL] is **Closed** with no objections.

#####7.2.2.5 [ODATA-495](https://tools.oasis-open.org/issues/browse/ODATA-495)

ODATA-495:
: "Clarify that Edm.Double and Edm.Single are 64-bit and 32-bit IEEE754 floating-point numbers" [component: OData CSDL] is **Applied**.

Note:
> For details cf. [7.2][ga_01] where the motion is documented.

ODATA-495:
: "Clarify that Edm.Double and Edm.Single are 64-bit and 32-bit IEEE754 floating-point numbers" [component: OData CSDL] is **Closed** with no objections.

#####7.2.2.6 [ODATA-489](https://tools.oasis-open.org/issues/browse/ODATA-489)

ODATA-489:
: "Clarify wording for OnDelete" [component: OData CSDL] is **Applied**.

Note:
> For details cf. [7.2][ga_01] where the motion is documented.

ODATA-489:
: "Clarify wording for OnDelete" [component: OData CSDL] is **Closed** with no objections.

#####7.2.2.7 [ODATA-488](https://tools.oasis-open.org/issues/browse/ODATA-488)
7.       ODATA-488: Restrict values of edm:Bool in edm.xsd to lower-case "true" and "false"

ODATA-488:
: "Restrict values of edm:Bool in edm.xsd to lower-case 'true' and 'false' " [component: OData CSDL] is **Applied**.

Note:
> For details cf. [7.2][ga_01] where the motion is documented.

ODATA-488:
: "Restrict values of edm:Bool in edm.xsd to lower-case 'true' and 'false' " [component: OData CSDL] is **Closed** with no objections.

#####7.2.2.8 [ODATA-486](https://tools.oasis-open.org/issues/browse/ODATA-486)

ODATA-486:
: "Missing &lt;Record&gt; wrapper in three examples" [component: OData CSDL] is **Applied**.

Note:
> For details cf. [7.2][ga_01] where the motion is documented.

ODATA-486:
: "Missing &lt;Record&gt; wrapper in three examples" [component: OData CSDL] is **Closed** with no objections.

#####7.2.2.9 [ODATA-485](https://tools.oasis-open.org/issues/browse/ODATA-485)

ODATA-485:
: "Add example for UrlRef expression that contains a literal string that is a URL" [component: OData CSDL] is **Applied**.

Note:
> For details cf. [7.2][ga_01] where the motion is documented.

ODATA-485:
: "Add example for UrlRef expression that contains a literal string that is a URL" [component: OData CSDL] is **Closed** with no objections.

#####7.2.2.10 [ODATA-484](https://tools.oasis-open.org/issues/browse/ODATA-484)

ODATA-484:
: "Remove reference to 'fixed-length or variable-length' primitive values" [component: OData CSDL] is **Applied**.

Note:
> For details cf. [7.2][ga_01] where the motion is documented.

ODATA-484:
: "Remove reference to 'fixed-length or variable-length' primitive values" [component: OData CSDL] is **Closed** with no objections.

#####7.2.2.11 [ODATA-469](https://tools.oasis-open.org/issues/browse/ODATA-469)

ODATA-469:
: "Type of Extends attribute in edm.xsd must be TQualifiedName instead of TSimpleIdentifier" [component: OData CSDL] is **Applied**.

Note:
> For details cf. [7.2][ga_01] where the motion is documented.

ODATA-469:
: "Type of Extends attribute in edm.xsd must be TQualifiedName instead of TSimpleIdentifier" [component: OData CSDL] is **Closed** with no objections.

##8 Next meeting
###8.1 September 26, 2013 during 8-10am PT

Agreed. All will try to allocate two hours time for this meeting.

##9 AOB

###9.1 Heading levels and table of content

Discussion:

* Ralf suggests to include all levels of sections inside the table of contents, so that people can also reference sections with levels 4 and higher directly
* Mike supports this in general
* All agree to discuss this in next meeting

Meeting adjourned on 0901 PT

## List of Open Action Items Before the Meeting [AI_REF]

**Retrieval time stamp**: `2013-09-19 15:26 +02:00`.

None.

**Note**: The actual action item processing is documented in section [4][AIH] and subsections thereof.

## Index of Issues Processed During the Meeting [IP_REF]

**Note**: The actual issue processing is documented in sections [7][IPH]. The below index has two main parts: First come the public comments (if any), second the JIRA issues. Each list of issues is sorted by ascending issue number. Noted are the ID, the summary and the reference to the relevant subsection where the issue progression has been documented:

Public Comments:

None.

JIRA Issues:


* [ODATA-469](https://tools.oasis-open.org/issues/browse/ODATA-469) "Type of Extends attribute in edm.xsd must be TQualifiedName instead of TSimpleIdentifier" [7.2.2.11][odata-469]
* [ODATA-470](https://tools.oasis-open.org/issues/browse/ODATA-470) "Clarify behavior of /$value requests to properties of type Edm.Binary or Edm.Geo*" [7.1.8.5][odata-470]
* [ODATA-471](https://tools.oasis-open.org/issues/browse/ODATA-471) "Property names must also be a valid XML Names (NCName)" [7.1.4.1][odata-471]
* [ODATA-472](https://tools.oasis-open.org/issues/browse/ODATA-472) "Explicitly state how dynamic properties are represented if they are not defined on an entity" [7.1.3.1][odata-472]
* [ODATA-473](https://tools.oasis-open.org/issues/browse/ODATA-473) "Harmonize description of function overload advertisement in Atom and JSON" [7.1.2.1][odata-473]
* [ODATA-474](https://tools.oasis-open.org/issues/browse/ODATA-474) "Add example for POST/PUT/PATCH/DELETE on function result" [7.1.8.4][odata-474]
* [ODATA-475](https://tools.oasis-open.org/issues/browse/ODATA-475) "Document that the value '%' is used for annotating percentages with Measures.Unit" [7.1.5.7][odata-475]
* [ODATA-476](https://tools.oasis-open.org/issues/browse/ODATA-476) "Clarify that type-cast segments are NOT required for properties of derived types in system query options" [7.1.5.5][odata-476]
* [ODATA-477](https://tools.oasis-open.org/issues/browse/ODATA-477) "Clarify that dynamic properties can be used in all system query options" [7.1.5.4][odata-477]
* [ODATA-478](https://tools.oasis-open.org/issues/browse/ODATA-478) "Clarify format for values of Content-ID header in $batch parts" [7.1.8.3][odata-478]
* [ODATA-484](https://tools.oasis-open.org/issues/browse/ODATA-484) "Remove reference to 'fixed-length or variable-length' primitive values" [7.2.2.10][odata-484]
* [ODATA-485](https://tools.oasis-open.org/issues/browse/ODATA-485) "Add example for UrlRef expression that contains a literal string that is a URL" [7.2.2.9][odata-485]
* [ODATA-486](https://tools.oasis-open.org/issues/browse/ODATA-486) "Missing &lt;Record&gt; wrapper in three examples" [7.2.2.8][odata-486]
* [ODATA-487](https://tools.oasis-open.org/issues/browse/ODATA-487) "Clarify where relative URLs follow the rules in section 4.3 and where they follow different rules" [7.1.7.2][odata-487]
* [ODATA-488](https://tools.oasis-open.org/issues/browse/ODATA-488) "Restrict values of edm:Bool in edm.xsd to lower-case 'true' and 'false' " [7.2.2.7][odata-488]
* [ODATA-489](https://tools.oasis-open.org/issues/browse/ODATA-489) "Clarify wording for OnDelete" [7.2.2.6][odata-489]
* [ODATA-490](https://tools.oasis-open.org/issues/browse/ODATA-490) "Clarify Referential Constraints have UpdateRule=Cascade semantics" [7.1.8.2][odata-490]
* [ODATA-491](https://tools.oasis-open.org/issues/browse/ODATA-491) "Language-dependency of key property values" [7.1.1.1][odata-491]
* [ODATA-492](https://tools.oasis-open.org/issues/browse/ODATA-492) "Add example for „has' operator to section 5.1.1.1.10" [7.1.5.3][odata-492]
* [ODATA-493](https://tools.oasis-open.org/issues/browse/ODATA-493) "Capabilities vocabulary: add term for SearchRestrictions" [7.1.5.6][odata-493]
* [ODATA-495](https://tools.oasis-open.org/issues/browse/ODATA-495) "Clarify that Edm.Double and Edm.Single are 64-bit and 32-bit IEEE754 floating-point numbers" [7.2.2.5][odata-495]
* [ODATA-499](https://tools.oasis-open.org/issues/browse/ODATA-499) "7.1.3 Nullable should refer to NavigationProperty, not Property" [7.2.2.4][odata-499]
* [ODATA-502](https://tools.oasis-open.org/issues/browse/ODATA-502) "Fix use of hash (#) for category term attribute in Atom" [7.1.10.1][odata-502]
* [ODATA-503](https://tools.oasis-open.org/issues/browse/ODATA-503) "Error in ABNF grammer: Edm prefix required for built-in primitive types" [7.1.9.1][odata-503]
* [ODATA-504](https://tools.oasis-open.org/issues/browse/ODATA-504) "Comment in line 456 should refer to rule lambdaVariableExpr" [7.2.1.2][odata-504]
* [ODATA-506](https://tools.oasis-open.org/issues/browse/ODATA-506) "Rule day does not allow the values 10 and 20" [7.2.1.1][odata-506]
* [ODATA-507](https://tools.oasis-open.org/issues/browse/ODATA-507) "Editorial; text appears twice in section 11.2.6 of [Protocol]" [7.1.8.1][odata-507]
* [ODATA-508](https://tools.oasis-open.org/issues/browse/ODATA-508) "Delete leftover 'respectively' from 6th paragraph of [JSON] Section 5, Service Document" [7.1.7.1][odata-508]
* [ODATA-509](https://tools.oasis-open.org/issues/browse/ODATA-509) "14.1: Superfluous period at end of second sentence" [7.2.2.3][odata-509]
* [ODATA-510](https://tools.oasis-open.org/issues/browse/ODATA-510) "Example 78: replace IsBindable with IsBound" [7.2.2.2][odata-510]
* [ODATA-511](https://tools.oasis-open.org/issues/browse/ODATA-511) "13.6 and 13.6.2: 'bound' should hyperlink to section 12.2.3 instead of 12.1.3" [7.2.2.1][odata-511]
* [ODATA-512](https://tools.oasis-open.org/issues/browse/ODATA-512) "14.5.14: add example for specifying a value for a navigation property in a &lt;Record&gt; expression" [7.1.6.2][odata-512]
* [ODATA-513](https://tools.oasis-open.org/issues/browse/ODATA-513) "Special handling of derived types in the dynamic expression edm:Record. Why?" [7.1.6.1][odata-513]
* [ODATA-514](https://tools.oasis-open.org/issues/browse/ODATA-514) "Example 44: compare Price to a number instead of a string" [7.1.5.2][odata-514]
* [ODATA-515](https://tools.oasis-open.org/issues/browse/ODATA-515) "Section 5.1.1.9 Operator Precedence: operators use wrong capitalization in precedence table" [7.1.5.1][odata-515]

## Timeline Reference [TL_REF]

**Note**: Please cf. the current revision of the [TC timeline](https://www.oasis-open.org/committees/download.php/49178/TC%20Timeline%205.htm).


