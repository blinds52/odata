#OData meeting #70, Thursday,   03 Apr 2014, 0800 - 1000 PDT

**Note**: For explanations of conventions and other formal aspects common to OData TC meeting minutes which are used in this document please cf. "[Formal Aspects of Meeting Minutes](https://www.oasis-open.org/committees/download.php/48109/formal-aspects-meeting-minutes-v1.html)".

Meeting chaired by Ralf Handl

## 1 Roll call

### 1.1 Members Present:

        Edmond Bourne (BlackBerry)
        Gerald Krause (SAP AG)
        John Willson (Individual)
        Ken Baclawski (Northeastern University)
        Mark Biamonte (Progress Software)
        Martin Zurmuehl (SAP AG)
        Michael Pizzo (Microsoft) a.k.a. Mike
        Ralf Handl (SAP AG)
        Stefan Drees (Individual)
        Susan Malaika (IBM)
        Ted Jones (Red Hat)

Quorum achieved. Details cf. [normative attendance sheet for this meeting](https://www.oasis-open.org/apps/org/workgroup/odata/event.php?event_id=36535).

## 2 Approval of Agenda

Approved as published.

## 3 Approval of Minutes from Previous Meeting(s)

### 3.1 Approval of [Minutes of 2014-03-13 Meeting#69](https://www.oasis-open.org/apps/org/workgroup/odata/download.php/52654/odata-meeting-69_on-20140327-minutes.html)

**Meeting minutes approved as published (latest revision) with no objections**.

## 4 Review of [Action Items](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_items.php) (AI) and Progress [AIH]

Context:
> See the "[List of Open Action Items Before the Meeting][AI_REF]" section in the appendix.

###4.1 Action items due by 2014-04-03 (end of day)

None.

###4.2 Action items NOT due by 2014-04-03 (end of day) but MAY be ready for closure

None.


## 5 Review of [Issues List](https://tools.oasis-open.org/issues/secure/IssueNavigator.jspa?reset=true&mode=hide&pid=10103&sorter/field=issuekey&sorter/order=ASC) (IL) and Progress [IPH]

**Notes**:

* Issues in this section (6) may have been progressed out of sequence, but have been noted here to better group by components impacted or state before the meeting and as a service for the reader.
* There is an "[Index of Issues Processed During the Meeting][IP_REF]" section in the appendix.

### 5.1 Issues for V4.0_ERRATA01 in New or Open state

#### 5.1.1 OData ABNF Construction Rules

##### 5.1.1.1 [ODATA-633](https://tools.oasis-open.org/issues/browse/ODATA-633)

ODATA-633:
"Rule pct-encoded-unescaped unintentionally omits hex pairs starting with 7" [component: OData ABNF Construction Rules] is **New**

Discussion:

* Ralf summarizes the issue and proposal
* All agree with the proposal


Stefan:
>I **move** to resolve ODATA-633 as proposed. **Mike seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-633:
"Rule pct-encoded-unescaped unintentionally omits hex pairs starting with 7" [component: OData ABNF Construction Rules] is **Proposed** with no objections.

#### 5.1.2 OData CSDL

##### 5.1.2.1 [ODATA-606](https://tools.oasis-open.org/issues/browse/ODATA-606)

ODATA-606:
"Specify navigation property binding combined with containment" [component: OData CSDL] is **Open**

Discussion:

* Ralf summarizes and hints at a missing proposal thus suggests to skip it for now
* All agree

**No further discussion**. **No objections**.

ODATA-606:
"Specify navigation property binding combined with containment" [component: OData CSDL] is **Open**.


#### 5.1.3 OData JSON Format

##### 5.1.3.1 [ODATA-596](https://tools.oasis-open.org/issues/browse/ODATA-596)

ODATA-596:
"Discrepancy between order of elements for geo-positions between GeoJSON and GML may cause interoperability difficulties." [components: OData JSON Format, OData ATOM Format] is **New**

Discussion:

* Ralf suggests to put the issue solely on the ATOM component and OPEN and wait for the reporter to suggest how to continue.
* All agree

**No further discussion**. **No objections**.

ODATA-596:
"Discrepancy between order of elements for geo-positions between GeoJSON and GML may cause interoperability difficulties." [component: OData ATOM Format] is **Open** with no objections.


##### 5.1.3.2 [ODATA-587](https://tools.oasis-open.org/issues/browse/ODATA-587)

ODATA-587:
"Add example for complex value that is an empty object" [component: OData JSON Format] is **New**

Discussion:

* All discuss the issue and are in favour of a new example
* Mike suggests an example


Mike:
>I **move** to resolve ODATA-587 as proposed. **John seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-587:
"Add example for complex value that is an empty object" [component: OData JSON Format] is **Proposed** with no objections.

##### 5.1.3.3 [ODATA-592](https://tools.oasis-open.org/issues/browse/ODATA-592)

ODATA-592:
"JSON example 11: 'type':'Point' with uppercase P according to GeoJSON spec" [component: OData JSON Format] is **New**

Discussion:

* Trivial issue, thus no discussion


Stefan:
>I **move** to resolve ODATA-592 as proposed. **Martin seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-592:
"JSON example 11: 'type':'Point' with uppercase P according to GeoJSON spec" [component: OData JSON Format] is **Proposed** with no objections.

##### 5.1.3.4 [ODATA-594](https://tools.oasis-open.org/issues/browse/ODATA-594)

ODATA-594:
"Discrepancy between ATOM and JSON formats (GML, GeoJson) for Polygon information content" [component: OData JSON Format] is **New**

Discussion:

* Ralf summarizes the issue and proposal
* Stefan cites the Polygon definition from the referenced [GeoJSON](http://geojson.org/geojson-spec.html#polygon) spec:

        For type "Polygon", the "coordinates" member must be
        an array of LinearRing coordinate arrays.
        For Polygons with multiple rings, the first must be the exterior ring
        and any others must be interior rings or holes.

* Stefan cites an [example for a polygon with holes expressed in GeoJSON](http://geojson.org/geojson-spec.html#id4):

        { "type": "Polygon",
            "coordinates": [
                [ [100.0, 0.0], [101.0, 0.0], [101.0, 1.0], [100.0, 1.0], [100.0, 0.0] ],
                [ [100.2, 0.2], [100.8, 0.2], [100.8, 0.8], [100.2, 0.8], [100.2, 0.2] ]
            ]
        }

* All discuss the issue and if it would be good to also put this issue only on ATOM component.
* All want to have a format independent info model, so that whatever we formulate in one format we can express in the other format but that we are able to express a common core in OData
* Mike suggests to not only restrict this to ATOM, to not lose focus on shared infoset
* Stefan agrees
* John notes, that ODATA-594 has a related topic
* Mike summarizes the discussion, that we might need to write up how to provide a information model for geometries that is expressable in both formats host languages (GML and GeoJSON) and is thus translateable from one format into the other in a lossless manner (possibly restricting the infoset so to say) with implicit or explicit rules for interpreting possibly ambiguous representations to that common model.
* John thinks, that a concordance among the standards is needed


**No further discussion**. **No objections**.

ODATA-594:
"Discrepancy between ATOM and JSON formats (GML, GeoJson) for Polygon information content" [component: OData JSON Format] is **Open** with no objections.

*Update*:
>The issue has been closed by the reporter at 2014-APR-04 with comment: "This issue is a result of my misreading of the GeoJSON spec. There is therefore no change required." thus:

ODATA-594:
"Discrepancy between ATOM and JSON formats (GML, GeoJson) for Polygon information content" [component: OData JSON Format] is **Closed** with no action by reporter.

##### 5.1.3.5 [ODATA-597](https://tools.oasis-open.org/issues/browse/ODATA-597)

ODATA-597:
"Seeking clarification of naming for GeographyCollection with GeoJSON" [component: OData JSON Format] is **New**

Discussion:

* Mike suggests to not invent a new Type but provide metadata
* Ralf is in fear of invalidating the GeoJSON format by adding new types and seconds Mikes proposal
* Stefan does not think that this would invalidate as "Any number of additional elements are allowed -- interpretation and meaning of additional elements is beyond the scope of this specification." (cf. [2.1.1. Positions](http://geojson.org/geojson-spec.html#positions), second paragraph, last sentence) but is in favor of not inventing here.
* John mentions that in his experience often things you want to do with a geometry collection, you would not do with a geography collection and vice versa
* Mark is in favor of not inventing a new type
* Mike suggests thus, that we extend by adding an annotation that a geometryCollection in some case is representing geographies
* Stefan seconds that
* All suggest to solely annotate via $metadata/ and not through payload additions
* Mike updates proposal in issue during the meeting. The proposal now states that "We don't introduce new properties/annotations at this point; A geographyCollection is represented as a geometryCollection with "geometries" as the property name"

Stefan:
>I **move** we resolve ODATA-597 as proposed and ammended in the chat. **John seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-597:
"Seeking clarification of naming for GeographyCollection with GeoJSON" [component: OData JSON Format] is **Proposed** with no objections.

##### 5.1.3.6 [ODATA-598](https://tools.oasis-open.org/issues/browse/ODATA-598)

ODATA-598:
"Update JSON RFC reference" [component: OData JSON Format] is **New**

Discussion:

* Stefan summarizes the issue and proposal
* Susan explains why [RFC 7158](http://tools.ietf.org/html/rfc7158) "again" was so fast obsoleted (wrong pub date) by [RFC 7159](http://tools.ietf.org/html/rfc7159)
* Ralf also checked, that the updated [RFC 7159](http://tools.ietf.org/html/rfc7159) is in sync with OData.

Stefan:
>I **move** to resolve ODATA-598 as proposed. **Martin seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-598:
"Update JSON RFC reference" [component: OData JSON Format] is **Proposed** with no objections.

##### 5.1.3.7 [ODATA-599](https://tools.oasis-open.org/issues/browse/ODATA-599)

ODATA-599:
"Let's update the GeoJSON reference" [component: OData JSON Format] is **New**

Discussion:

* Stefan summarizes the issue and proposal
* All discuss what the specific proposal should be
* Stefan proposes to replace the existing "geojson.org" reference to GeoJSON with

        [GeoJSON] Howard Butler, Martin Daly, Alan Doyle, Sean Gillies, Tim Schaub and Stefan Drees,
                  "The GeoJSON Format" draft-butler-geojson-02, 15 March 2014
                  URL=http://www.ietf.org/id/draft-butler-geojson-02.txt

* Ralf suggests using http://tools.ietf.org/html/draft-butler-geojson-02 instead to optimize the display of updates etc.
* Stefan adds, that adding a link to the IETF draft helps future readers to spot eventual updates by the usual ietf navigation helpers while the current link might be of less help (possibly)
* Stefan updates the proposal in the issue
* All agree to the updatd proposal
* Mike adds, that this now addresses our (the TC members) concern we had, when originally deciding what to reference for GoeJSON

Stefan:
>I **move** to resolve ODATA-599 as proposed. **Mike seconds**.

Discussion of motion:

ODATA-599:
"Let's update the GeoJSON reference" [component: OData JSON Format] is **Proposed** with no objections.

##### 5.1.3.8 [ODATA-600](https://tools.oasis-open.org/issues/browse/ODATA-600)

ODATA-600:
"Ensure future compatibility by reference to draft-bray-i-json-n (The I-JSON Message Format)" [component: OData JSON Format] is **New**

Discussion:

* Stefan summarizes the issue
* All discuss if OData is I-JSON compatible (as we allow UTF encodings different from UTF-8)
* Ralf, Mike and Stefan suggest to read these [five pages of the draft](http://tools.ietf.org/html/draft-bray-i-json-01) and come back with a specific proposal next meeting
* All agree, that this issue will be discussed next meeting

**No further discussion**. **No objections**.

ODATA-600:
"Ensure future compatibility by reference to draft-bray-i-json-n (The I-JSON Message Format)" [component: OData JSON Format] is **Open** with no objections.

##### 5.1.3.9 [ODATA-607](https://tools.oasis-open.org/issues/browse/ODATA-607)

ODATA-607:
"Section 4.5.4: explicitly state that @odata.count can be applied to expanded to-many navigation properties" [component: OData JSON Format] is **New**

Discussion:

* All discuss the issue
* Stefan cites, the summary states: "Section 4.5.4: explicitly state that @odata.count can be applied to expanded to-many navigation properties with server-driven paging"
* Stefan continues, that description states: "We allow $count=true nested after $expand, resulting in @odata.count annotations in the inlined representation of to-many navigation properties. This can be deduced from other specification text but is not explicitly stated in the section on odata.count."
* All discuss if the summary matches the issues description and as it does not, Mike changes it
* Mike updates the description to "Section 4.5.4: explicitly state that @odata.count can be applied to expanded to-many navigation properties"
* Note the proposal is "see summary"
* Mike adds comment to issue

Mike:
>I **move** we resolve ODATA-607 as proposed, and that editors verify that @odata.nextlink is also explicitly allowed. **Martin seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-607:
"Section 4.5.4: explicitly state that @odata.count can be applied to expanded to-many navigation properties" [component: OData JSON Format] is **Proposed** with no objections.


#### 5.1.4 OData Protocol

##### 5.1.4.1 [ODATA-634](https://tools.oasis-open.org/issues/browse/ODATA-634)

ODATA-634:
"Specify the behaviour when a non-nullable property with no default value is omitted from a PUT" [component: OData Protocol] is **New**

Discussion:

* All agree to open the issue and with the proposal

Mike:
>I **move** we resolve ODATA-634 as proposed. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-634:
"Specify the behaviour when a non-nullable property with no default value is omitted from a PUT" [component: OData Protocol] is **Proposed** with no objections.


##### 5.1.4.2 [ODATA-635](https://tools.oasis-open.org/issues/browse/ODATA-635)

Note:
> We received the public Comment #20140300002 on 2014-03-27 with title "Non-updatable properties?". This lead to issue ODATA-635.

ODATA-635:
"Clarify if a PUT request is allowed to change the odata.type of the entity (public comment c201403e00002)" [component: OData Protocol] is **New**

Discussion:

* Mike summarizes the issue and the proposal
* All agree to open and agree with the proposal
* Stefan will follow up on this one to the original reporter


Stefan:
>I **move** to resolve ODATA-635 as proposed. **Martin seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-635:
"Clarify if a PUT request is allowed to change the odata.type of the entity (public comment c201403e00002)" [component: OData Protocol] is **Proposed** with no objections.

##### 5.1.4.3 [ODATA-632](https://tools.oasis-open.org/issues/browse/ODATA-632)

Note:
> This issue was discussed last week as part of ODATA-580 and we decided to close, but the formal motion did not include it.

ODATA-632:
"'Core.OptimisticConcurrencyControl' should be 'Core.OptimisticConcurrency'" [component: OData Protocol]  is **Open**

Discussion:

* Ralf Mike summarizes the issue and proposal
* All FIXME


Mike:
>I **move** to close ODATA-632 without action as it is covered by ODATA-580. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-632:
"'Core.OptimisticConcurrencyControl' should be 'Core.OptimisticConcurrency'" [component: OData Protocol]  is **Closed** with no objections.

#### 5.1.5 OData Protocol, OData CSDL

##### 5.1.5.1 [ODATA-636](https://tools.oasis-open.org/issues/browse/ODATA-636)

ODATA-636:
"Clarify that complex types and arrays can only be passed to functions through parameter aliases" [components: OData Protocol, OData CSDL] is **New**

Discussion:

* Mike summarizes the issue and proposal
* John is in support of this proposal


Mike:
>I **move** we resolve ODATA 636 as proposed. **John seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-636:
"Clarify that complex types and arrays can only be passed to functions through parameter aliases" [components: OData Protocol, OData CSDL] is **Proposed** with no objections.


## 6 Next Face-to-Face meeting Thursday May 15 and Friday May 16 in Redmond

## 6.1 Possibility of Microsoft hosting the F2F?

DIscussion:

* Mike does not expect problems, but has not booked the rooms yet.
* Mike further suggests to add ballots so we can plan based on the voted presence and kind of presence (remote or in person)
* All agree

Update:
> Ballot with question [Do you plan to attend this meeting?](https://www.oasis-open.org/committees/ballot.php?id=2592) has been opened. Description: "The OData Technical Committee plans to conduct its 6th face-to-face meeting during May 15-16, 2014 in Redmond, WA. Details: [https://www.oasis-open.org/committees/event.php?event_id=37713](https://www.oasis-open.org/committees/event.php?event_id=37713)". Note: The links given here, are the public accessible versions.


## 7 Next meeting

All agree, that next meeting will be on Apr 24, 0800-1000 PDT


## 8 AOB

No other business

Meeting adjourned at 0952 PDT.


## List of Open Action Items Before the Meeting [AI_REF]

**Retrieval time stamp**: `2014-04-03 12:34 +01:00`.

None.

**Note**: The actual action item processing is documented in section [4][AIH] and subsections thereof.

## Index of Issues Processed During the Meeting [IP_REF]

**Note**: The actual issue processing is documented in sections [5][IPH]. The below index has two main parts: First come the public comments (if any), second the JIRA issues. Each list of issues is sorted by ascending issue number. Noted are the ID, the summary and the reference to the relevant subsection where the issue progression has been documented:

Public Comments:

        WILL_FOLLOW in next revision

JIRA Issues:

        WILL_FOLLOW in next revision

## Timeline Reference [TL_REF]

**Note**: Please cf. the current revision of the [TC timeline](https://www.oasis-open.org/committees/download.php/50823/TC%20Timeline%206.htm).

