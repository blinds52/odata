#OData meeting in Z&uuml;rich, Switzerland #23 F2F, Wednesday, 30 Jan 2013, 0900 - 1800 CET and Thursday, 31 Jan 2013, 0900 - 1800 CET


**Note**: For explanations of conventions and other formal aspects common to OData TC meeting minutes which are used in this document please cf. "[Formal Aspects of Meeting Minutes](https://www.oasis-open.org/committees/download.php/48109/formal-aspects-meeting-minutes-v1.html)". 

#Day One

Meeting chaired by Barbara Hartel and Ram Jeyaraman 

Acting Chair: Barbara Hartel 

## 1 Roll call
 
### 1.1 Members Present: 

        Andrew Eisenberg (IBM)        Barbara Hartel (SAP AG)        Dale Moberg (Axway Software)        Diane Downie (Citrix Systems)        Erik de Voogd (SDL)        Gerald Krause (SAP AG)        Graham Moore (BrightstarDB Ltd.)        Hubert Heijkers (IBM)        John Willson (Individual)        Martin Zurmuehl (SAP AG)        Matthew Borges (SAP AG) a.k.a. Matt        Michael Pizzo (Microsoft) a.k.a. Mike        Nuno Linhares (SDL)        Ralf Handl (SAP AG)        Ram Jeyaraman (Microsoft)        Robert Richards (Mashery)        Stefan Drees (Individual)        Susan Malaika (IBM)        Ted Jones (Red Hat) 

Quorum achieved. Details cf. [normative attendance sheet for this meeting](https://www.oasis-open.org/apps/org/workgroup/odata/event.php?event_id=34020).

## 2 Approval of Minutes from Previous Meeting(s)

### 2.1 Approval of [Minutes of 2013-01-24 Meeting#22](https://www.oasis-open.org/committees/download.php/48005/odata-meeting-22_on-20130124-minutes.html):

**Meeting minutes approved with no objections**. 

## 3 Approval of Agenda

Review and make necessary adjustments to the [draft agenda](https://lists.oasis-open.org/archives/odata/201301/msg00161.html) based on progress made on issues and proposals.

Discussion:

* All discuss final plan based on results of yesterdays discussions and state of work

Agenda for Day One approved as published with the above amendements. 

##4 Review of [Action Items](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_items.php) (AI) and Progress [AIH]

Context:
> See the "[List of Open Action Items Before the Meeting][AI_REF]" section in the appendix.


###4.1 Action items due by 2013-01-31 (end of day)

####4.1.1 [AI#0005](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_item.php?action_item_id=3462)

AI#0005
: "Come up with a first milestine for the temporal extension" [owner: Andrew Eisenberg] is **Ongoing** (Note: Due 2013-01-31)

Discussion:

* Nothing to report. 
* Due date will be shifted to end of next face-to-face, now assumed as 2013-04-26.

AI#0005
: "Come up with a first milestine for the temporal extension" [owner: Andrew Eisenberg] is **Ongoing** (Note: Due 2013-04-26)

####4.1.2 [AI#0006](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_item.php?action_item_id=3463)

AI#0006
: "Come up with estimate for first milestone for XML data extension" [owner: Andrew Eisenberg] is **Ongoing** (Note: Due 2013-01-31)

Discussion:

* There is a proposal. Status evaluation postponed to after the presentation.
* Due date will be shifted to end of next face-to-face, now assumed as 2013-04-26.

AI#0006
: "Come up with estimate for first milestone for XML data extension" [owner: Andrew Eisenberg] is **Ongoing** (Note: Due 2013-04-26)

####4.1.3 [AI#0007](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_item.php?action_item_id=3464)

AI#0007
: "Come up with estimate for first milestone for JSON data extension" [owner: Susan Malaika] is **Ongoing** (Note: Due 2013-01-31)

Discussion:

* There is a proposal. Status evaluation postponed to after the presentation.
* Due date will be shifted to end of next face-to-face, now assumed as 2013-04-26.

AI#0007
: "Come up with estimate for first milestone for JSON data extension" [owner: Susan Malaika] is **Ongoing** (Note: Due 2013-04-26)

## 5 OData JSON Format Work Product

### 5.1 Review and accept the latest draft. 

Context:
> Mike has provided the latest draft for review on Jan 25, 2013: [OData JSON Format Version 1.0 Working Draft 01](https://www.oasis-open.org/committees/download.php/48030/odata-json-format-v1.0-wd01-2013-01-25.doc) 

Discussion:

* Ralf walks all through the proposal.
* A live demo URL is "[Northwind.v3](http://services.odata.org/V3/Northwind/Northwind.svc/Products)" shown is the "[Northwind.v3 JSON Format View](http://services.odata.org/V3/Northwind/Northwind.svc/Products?$format=json)"
* Hubert will open a ticket with regard to uploading large chunks of data and payload ordering
* Stefan and Hubert discuss, if in 4.18 Representing Errors in a Response the message should better be noted as "message": "message_value" instead of "message" : { "lang": "lang-code", "value: "message-value"}
* All agree, that Stefan will open an issue on this in JIRA.
* Mike proposes to accept the paper as base document and notes, that the addressed issues are already noted in the document.

**Update**: Issue [ODATA-221](https://tools.oasis-open.org/issues/browse/ODATA-221) has been created with summary "Flatten the message elemtn in the JSON Error Represention (Section 4.18 Representing Errors in a Response)" [component: OData JSON Format].

Hubert: 
>I **move** to accept the new JSON format document as presented. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

##6 Progress Issues (Day One)[IPH_D1]

**Notes**:

* Issues in this section (6) have partly been progressed out of sequence, but have been noted here to better group by components impacted as a service for the reader.
* There is an "[Index of Issues Processed During the Meeting][IP_REF]" section in the appendix.

###6.1 OData JSON Format [GM1]

Ralf: 
>I **move** to accept ODATA-90 and ODATA-91 as applied. **Hubert seconds**.

**No further discussion**. **No objections**. The **motion passes**.

####6.1.1 [ODATA-91](https://tools.oasis-open.org/issues/browse/ODATA-91)

ODATA-91
: "2.1: explicitly state which format the server will return in response to each given set of headers" [component: OData JSON Format] is **Applied**. 

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[6.1][GM1]])

ODATA-91
: "2.1: explicitly state which format the server will return in response to each given set of headers" [component: OData JSON Format] is **Closed as noted in the motion in section 6.1** with no objections. 

####6.1.2 [ODATA-90](https://tools.oasis-open.org/issues/browse/ODATA-90)

ODATA-90
: "Section 2.1: define suffix ';odata=xxx' for application/json and the possible values for xxx" [component: OData JSON Format] is **Applied**. 

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[6.1][GM1]])

ODATA-90
: "Section 2.1: define suffix ';odata=xxx' for application/json and the possible values for xxx" [component: OData JSON Format] is **Closed as noted in the motion in section 6.1** with no objections. 

####6.1.3 [ODATA-93](https://tools.oasis-open.org/issues/browse/ODATA-93)

ODATA-93
: "3.4: add introductory paragraph" [component: OData JSON Format] is **Applied**. 

Ralf: 
>I **move** to close ODATA-93 as applied. **Hubert seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-93
: "3.4: add introductory paragraph" [component: OData JSON Format] is **Closed** with no objections. 

####6.1.4 [ODATA-99](https://tools.oasis-open.org/issues/browse/ODATA-99)

ODATA-99
: "3.9 Advertisement for a Function or Action: add example and refer to ABNF rules" [component: OData JSON Format] is **Applied**. 

Ralf: 
>I **move** to close ODATA-99 as applied. **Hubert seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-99
: "3.9 Advertisement for a Function or Action: add example and refer to ABNF rules" [component: OData JSON Format] is **Closed** with no objections. 

####6.1.5 [ODATA-105](https://tools.oasis-open.org/issues/browse/ODATA-105)

ODATA-105
: "Support instance annotations on errors in JSON" [component: OData JSON Format] is **Applied**.

Ralf: 
>I **move** to close ODATA-105 as applied. **Hubert seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-105
: "Support instance annotations on errors in JSON" [component: OData JSON Format] is **Closed** with no objections. 

####6.1.6 [ODATA-100](https://tools.oasis-open.org/issues/browse/ODATA-100)

ODATA-100
: "5.1 Response Body: explain security reasons leading to the object wrapper" [component: OData JSON Format] is **Applied**. 

Stefan: 
>I **move** to close ODATA-100 since we always use objects. **Hubert seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-100
: "5.1 Response Body: explain security reasons leading to the object wrapper" [component: OData JSON Format] is **Closed** with no objections. 

###6.2 OData JSON Format, OData Atom Format

####6.2.1 [ODATA-169](https://tools.oasis-open.org/issues/browse/ODATA-169)

ODATA-169
: "Representation of named entities in the service document" [components: OData JSON Format, OData ATOM Format] is **Applied** with no objections. 

Ralf: 
>I **move** to close ODATA-169 as applied. **Hubert seconds**.

Discussion of motion:

* Mike states, that it also needs to be applied to ATOM, so the issue should be not considered fully applied.

Mike: 
>I **move** to amend motion to leave the issue in the resolved state and note that it's been applied in json but needs to be applied in atom. **Hubert seconds**.

**No further discussion**. **No objections**. The **amendment passes**.

**No further discussion**. **No objections**. The **motion passes as amended**.

ODATA-169
: "Representation of named entities in the service document" [components: OData JSON Format, OData ATOM Format] is **Resolved as noted in the motion** with no objections. 

###6.3 OData ABNF Construction Rules, OData ATOM Format, OData JSON Format, OData Protocol

####6.3.1 [ODATA-96](https://tools.oasis-open.org/issues/browse/ODATA-96)

ODATA-96
: "Need to define semantics, serialization format, etc. for Enums" [components: OData ABNF Construction Rules, OData ATOM Format, OData JSON Format, OData Protocol] is **Resolved**. 

Discussion:

* Ralf states, that ODATA-96 will remain in the resolved state, until other formats/work products also have been updated

ODATA-96
: "Need to define semantics, serialization format, etc. for Enums" [components: OData ABNF Construction Rules, OData ATOM Format, OData JSON Format, OData Protocol] is **Resolved** with no objections. 

###6.4 OData ABNF Construction Rules, OData Protocol, OData URL Conventions

####6.4.1 [ODATA-139](https://tools.oasis-open.org/issues/browse/ODATA-139)

ODATA-139
: "New system query option $search for free-text search within an entity set" [components: OData ABNF Construction Rules, OData Protocol, OData URL Conventions] is **New**. 

Discussion

* All discuss on the scope of the new operator and if it will meet the expectations of the clients
* Matt asks, why the operators (AND, OR, NOT) are all capitalized, whereas in $filter they are all lower case?  Is that going to be a point of confusion?
* Ralf and Stefan explain, that most full-text search engines are case insensitive (when matching), so the upper casing of the operators is common usage and a useful natural way of expressing that. 
* Ralf amends, that his defining use case was the casual web user
* All agree, that the error response should hint at what failed and what is to be expected
* A JIRA issue will be opened to update the conformance section (Mike)
* Another issue will be created on how to define a search match function (Andrew)

Ralf: 
>I **move** to resolve ODATA-139 as proposed. **Hubert seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-139
: "New system query option $search for free-text search within an entity set" [components: OData ABNF Construction Rules, OData Protocol, OData URL Conventions] is **Resolved** with no objections. 

**Update**: Issue [ODATA-222](https://tools.oasis-open.org/issues/browse/ODATA-222) has been created with summary "free-text search within a property" [component: OData URL Conventions].

**Update**: Issue [ODATA-223](https://tools.oasis-open.org/issues/browse/ODATA-223) has been created with summary "Specify Service behavior for not implemented functionality" [components: OData ATOM Format, OData Batch Processing Format, OData CSDL, OData Extension for Data Aggregation, OData Extension for JSON Data, OData Extension for Temporal Data, OData Extension for XML Data, OData JSON Format, OData Protocol, OData URL Conventions].

####6.4.2 [ODATA-3](https://tools.oasis-open.org/issues/browse/ODATA-3)

ODATA-3
: "Use CQL standard for query instead of odata-specific filter query protocol" [component: OData Protocol] is **New**. 

Discussion:

* Ralf proposes to close this issue since we have resolved ODATA-139 as proposed, which addresses free-text search (conformance level 0).

Ralf: 
>I **move** to close ODATA-3 without action. **Mike seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-3
: "Use CQL standard for query instead of odata-specific filter query protocol" [component: OData Protocol] is **Closed** with no objections. 

###6.5 Issues belonging to Annotations and References

Context:
> Ralf has provided a discussion paper for review on Jan 25, 2013: [CSDL References (2013-01-25)](https://www.oasis-open.org/committees/download.php/48026/CSDL%20References%202013-01-25.doc), which describes an interpretation of the CSDL elements Reference, Using, AnnotationsReference, and the @Extends attribute of the element that allows a number of new use cases, including cross-service navigation, annoting services not owned by the annotation author, and reuse of types and annotations across services.   

Discussion:

* Ralf walks through the Annotation related issue context, showing the relations to $metadata and vocabularies and continues with implementations of references between services.
* John asks, if the concept of concordances has been included, which Ralf answers with no.
* Mike asks, if anything in the document is not already covered in the subsequently mentioned JIRA issues.
* Ralfs responds, that the FunctionImport and another topic are not yet covered.
* Mike will open an issue w.r.t. FunctionImport
* The document has been changed/adapted to the state of discussion/modelling during the meeting. This updated version will be distributed after the meeting.
* All agree, that there is intent to build up common vocabularies describing the annotations possible, for eg. helping with capabilities navigation.
* All agree to go through the issues in the order listed into the document

**Update**: Issue [ODATA-224](https://tools.oasis-open.org/issues/browse/ODATA-224) has been created with summary "Fill out Capabilities sections of an OData Service" [component: OData Protocol].

**Update**: Issue [ODATA-225](https://tools.oasis-open.org/issues/browse/ODATA-225) has been created with summary "Define Functions in Schema; reference in Container using FunctionImport." [component: OData CSDL].

**Update**: Issue [ODATA-226](https://tools.oasis-open.org/issues/browse/ODATA-226) has been created with summary "Clarify that the root of the Path attribute of a &lt;PropertyValue&gt; element is rooted at the containing entity" [component: OData CSDL].

**Update**: The updated version of the presented discussion paper "[CSDL References](https://www.oasis-open.org/committees/download.php/48103/CSDL%20References%202013-01-30.doc)" has been uploaded.

####6.5.1 OData CSDL

#####6.5.1.1 [ODATA-195](https://tools.oasis-open.org/issues/browse/ODATA-195)

ODATA-195
: "Simplify entity set qualification rules for NavigationPropertyBinding" [component: OData CSDL] is **Open**. 

Ralf: 
>I **move** to resolve ODATA-195 as proposed. **Mike seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-195
: "Simplify entity set qualification rules for NavigationPropertyBinding" [component: OData CSDL] is **Resolved** with no objections. 

#####6.5.1.2 [ODATA-193](https://tools.oasis-open.org/issues/browse/ODATA-193)

ODATA-193
: "Allow function imports to return entities from a different service" [component: OData CSDL] is **Open**. 

Ralf: 
>I **move** to resolve ODATA-193 as resolved. **Hubert seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-193
: "Allow function imports to return entities from a different service" [component: OData CSDL] is **Resolved** with no objections. 

#####6.5.1.3 [ODATA-182](https://tools.oasis-open.org/issues/browse/ODATA-182)

ODATA-182
: "Define the term 'model'" [component: OData CSDL] is **New**. 

Ralf: 
>I **move** to resolve ODATA-182 as propsed. **Hubert seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-182
: "Define the term 'model'" [component: OData CSDL] is **Resolved** with no objections. 


####6.5.1.4 [ODATA-181](https://tools.oasis-open.org/issues/browse/ODATA-181)

ODATA-181
: "Referencing/reusing a model element from a different schema does not require to 'include'" [component: OData CSDL] is **Open**. 

Ralf: 
>I **move** to resolve ODATA-181 by defining the meaning of Reference and Using as proposed in the updated document "CSDL References" presented today. **Stefan seconds**.

ODATA-181
: "Referencing/reusing a model element from a different schema does not require to 'include'" [component: OData CSDL] is **Resolved as noted in the motion** with no objections. 

#####6.5.1.5 [ODATA-180](https://tools.oasis-open.org/issues/browse/ODATA-180)

ODATA-180
: "Remove Extends attribute from EntityContainer element" [component: OData CSDL] is **Open**. 

Ralf: 
>I **move** to resolve ODATA-180 by clarifying the meaning of "Extends" as described in "CSDL References" presented today. **Hubert seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-180
: "Remove Extends attribute from EntityContainer element" [component: OData CSDL] is **Resolved as noted in the motion** with no objections. 

#####6.5.1.6 [ODATA-205](https://tools.oasis-open.org/issues/browse/ODATA-205)

ODATA-205
: "Merge TypeAnnotation and ValueAnnotation into Annotation" [component: OData CSDL] is **New**. 

Discussion:

* Andrew and Mike discuss the current usage of ValueAnnotation/TypeAnnotation related to the proposed scenario with only Annotations.
* All discuss where the specification of annotations like eg. sameAs or similarTo are best placed inside an OData core vocabulary or outside (placed in third party vocabularies). In any case it should be ensured, that clients in every case may interact subsequently based on these concepts regardless of the place of definition.
* All agree, that the proposal is good.
* Mike will open a JIRA issue to open a core vocabulary.

Ralf: 
>I **move** to resolve ODATA-205 as proposed. **Martin seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-205
: "Merge TypeAnnotation and ValueAnnotation into Annotation" [component: OData CSDL] is **Resolved** with no objections. 

**Update**: The vocabulary drafts for Core, Atom and Measures have been published in SVN (revision 168) in folder [svn:/odata/trunc/spec/vocabularies/](https://tools.oasis-open.org/version-control/svn/odata/trunk/spec/vocabularies/) after the meeting. 

#####6.5.1.7 [ODATA-213](https://tools.oasis-open.org/issues/browse/ODATA-213)

ODATA-213
: "Allow all dynamic expressions of the appropriate type within edm:Collection expressions" [component: OData CSDL] is **New**. 

Ralf: 
>I **move** to resolve ODATA-213 as propsed. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-213
: "Allow all dynamic expressions of the appropriate type within edm:Collection expressions" [component: OData CSDL] is **Resolved** with no objections. 

#####6.5.1.8 [ODATA-225](https://tools.oasis-open.org/issues/browse/ODATA-225)

ODATA-225
: "Define Functions in Schema; reference in Container using FunctionImport." [component: OData CSDL] is **New**. 

Ralf: 
>I **move** to resolve ODATA-225 as propsed. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-225
: "Define Functions in Schema; reference in Container using FunctionImport." [component: OData CSDL] is **Resolved** with no objections. 

#####6.5.1.9 [ODATA-226](https://tools.oasis-open.org/issues/browse/ODATA-226)

ODATA-226
: "Clarify that the root of the Path attribute of a &lt;PropertyValue&gt; element is rooted at the containing entity" [component: OData CSDL] is **New**. 

Ralf: 
>I **move** to resolve ODATA-226 as propsed. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-226
: "Clarify that the root of the Path attribute of a &lt;PropertyValue&gt; element is rooted at the containing entity" [component: OData CSDL] is **Resolved** with no objections. 

#####6.5.1.10 [ODATA-109](https://tools.oasis-open.org/issues/browse/ODATA-109)

ODATA-109
: "Define rules for specifying annotations within annotations" [component: OData CSDL] is **New**. 

Ralf: 
>I **move** to resolve ODATA-109 as proposed. **Mike seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-109
: "Define rules for specifying annotations within annotations" [component: OData CSDL] is **Resolved** with no objections. 

#####6.5.1.11 [ODATA-108](https://tools.oasis-open.org/issues/browse/ODATA-108)

ODATA-108
: "Define rules for the target of an annotation that supports implicit casting of relationships" [component: OData CSDL] is **New**. 

Discussion:

* All discuss the usecases of sets of phone numbers, of communicating classifications of these numbers and of addressabilty of specialized phone numbers.
* Mike suggests to process this issue and open new issues for derived use cases.

Ralf: 
>I **move** to resolve ODATA-108 as proposed. **Hubert seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-108
: "Define rules for the target of an annotation that supports implicit casting of relationships" [component: OData CSDL] is **Resolved** with no objections. 

#####6.5.1.12 [ODATA-16](https://tools.oasis-open.org/issues/browse/ODATA-16)

ODATA-16
: "Define an Edm.AnyType to allow functions to apply to entity sets of any entity type" [component: OData CSDL] is **New**. 

Discussion:

* All discuss, if a KeylessType should  be introduced into the model (as a super type)
* Ralf suggests to accept the proposal of ODATA-16 and work on a super type based on a new issue

Ralf: 
>I **move** to resolve ODATA-16 as proposed. **Hubert seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-16
: "Define an Edm.AnyType to allow functions to apply to entity sets of any entity type" [component: OData CSDL] is **Resolved** with no objections. 

#####6.5.1.13 [ODATA-198](https://tools.oasis-open.org/issues/browse/ODATA-198)

ODATA-198
: "Allow Type='Any' and Type='Collection(Any)' for NavigationProperty elements" [component: OData CSDL] is **New**. 

Ralf: 
>I **move** to close ODATA-198 without further action because it is covered by ODATA-16. **Mike seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-198
: "Allow Type='Any' and Type='Collection(Any)' for NavigationProperty elements" [component: OData CSDL] is **Closed** with no objections. 

#####6.5.1.14 [ODATA-12](https://tools.oasis-open.org/issues/browse/ODATA-12)

ODATA-12
: "create a data type for property names" [component: OData CSDL] is **New**. 

Discussion:

* Ralf explains, that the motivation for this change is to ease clients working with vocabularies by allowing a new attribute in Annotation and PropertyValue with the same syntax as the Path attribute.
* All agree, to refine the proposal after the meeting and probably revisit on the second day.
* On the second day Ralf proposes the resolution based on the updated proposal 

Ralf: 
>I **move** to resolve ODATA-12 as proposed. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-12
: "create a data type for property names" [component: OData CSDL] is **Resolved** with no objections. 

**Update**: Issue [ODATA-227](https://tools.oasis-open.org/issues/browse/ODATA-227) has been created with summary "Support of symbolic names in annotations" [component: OData CSDL].

#####6.5.1.15 [ODATA-197](https://tools.oasis-open.org/issues/browse/ODATA-197)

ODATA-197
: "Define standard functions for edm:Apply element" [component: OData CSDL] is **New**. 

Discussion:

* Mike suggests to remove the get part from the proposal (for now).
* Ralf adapts the proposal based on the discussion

Mike: 
>I **move** we define the concat function as defined in ODATA-197. **Ralf seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-197
: "Define standard functions for edm:Apply element" [component: OData CSDL] is **Resolved** with no objections. 

####6.5.2 OData ABNF Construction Rules, OData URL Conventions

#####6.5.2.1 [ODATA-172](https://tools.oasis-open.org/issues/browse/ODATA-172)

ODATA-172
: "EntitySet may be qualified with namespace or alias and EntityContainer" [component: OData CSDL] is **Applied**. 

Ralf: 
>I **move** to close ODATA-172 as applied. **Hubert seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-172
: "EntitySet may be qualified with namespace or alias and EntityContainer" [component: OData CSDL] is **Closed** with no objections. 

####6.5.3 OData Protocol, OData URL Conventions

#####6.5.3.1 [ODATA-33](https://tools.oasis-open.org/issues/browse/ODATA-33)

ODATA-33
: "Allow $filter and $select to refer to annotations as if they were properties" [component: OData CSDL] is **New**. 

Ralf: 
>I **move** to close ODATA-33 without action. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-33
: "Allow $filter and $select to refer to annotations as if they were properties" [component: OData CSDL] is **Closed** with no objections. 

####6.5.4 OData Protocol

#####6.5.4.1 [ODATA-25](https://tools.oasis-open.org/issues/browse/ODATA-25)

ODATA-25
: "Support Obtaining Changes (Deltas) from a result." [component: OData CSDL] is **New**. 

Mike: 
>I **move** we resolve OData-25 as proposed in the attached document "[OData Delta Queries](https://www.oasis-open.org/committees/download.php/47996/OData%20Delta%20Query%20Protocol%20Design%202013-1-23.docx)". **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-25
: "Support Obtaining Changes (Deltas) from a result." [component: OData CSDL] is **Resolved as noted in the motion** with no objections. 

##7 OData Delta Queries and Flattened Result Set

###7.1 Review design of Delta Queries

Context:
> Mike has provided the latest draft for review on Jan 24, 2013: "[OData Delta Queries](https://www.oasis-open.org/committees/download.php/47996/OData%20Delta%20Query%20Protocol%20Design%202013-1-23.docx)"

Discussion:

* Mike recaps where the current design is rooted and focuses in his walkthrough of the document on the new areas, not already known from the discusions of the previous Face to Face meeting.
* All agree the proposal is good
* Mike suggests to accordingly accept the issue ODATA-25 as Resolved

**Note**:
> Issue state has been progressed by motion (cf. section [[6.5.4.1][odata-25]]) accordingly.

###7.2 Review design of Flattened Result Set

Context:
> Mike has provided the latest draft for review on 2013-01-26 "[Flattened Results in OData](https://www.oasis-open.org/committees/download.php/48031/Flattened%20Results%20in%20OData%202013-1-25.docx)"

Discussion:

* Mike walks through the proposal
* All discuss if the server may in some cases only return ids instead of entries it delivered already before in the response.
* Mike mentions the other open question (minor) w.r.t. representation of flattened results in ATOM format, where he chose to indicate the set as an attribute to the id element. It might become a set element, but he just picked this alternative.
* All agree.
* Mike suggests to give all members time to go over the document so that maybe tomorrow a motion may lead to acceptance of the proposal.
* Gerald asks about why the ids invented for flattening are named entryID and not entityID, which starts a discussion on finding a better name.
* All finally agree on "entityRef" as the name, better describing these references sent in place of Entities for occurences 2 to N, so the information is not confused with a key

**Update**: The document has been split as a result of the discussion. The current revision of the separated part "[Entity References in OData](https://www.oasis-open.org/committees/download.php/48083/Entity%20References%202013-1-31.docx)" has been uploaded by Mike during meeting day two. 

**Note**: For progress documentation of the relevant issue ODATA-199 cf. section [11.6.1][odata-199].


##8 OData Extension for XML Data

###8.1 Discuss proposal 

Context:
> Andrew has provided a discussion paper/proposal for review on Jan 29, 2013: "[OData Extension for XML Data](https://www.oasis-open.org/committees/download.php/48044/20130130%20OData%20Extension%20for%20XML%20Data.pdf)"  

Discussion:

* Andrew walks through the presentation
* Mike likes the proposal, as it shows how extensibility works
* Andrew will track the work accomplished during the meeting, that allows better formulation of the examples, removal of dummy container etc. and subsequently will provide a draft.


##9 AOB

None. 

### Wednesday's Meeting adjourned on 1802 CET

#Day Two

Meeting day chaired by Barabara Hartel and Ram Jeyaraman

Acting chair: Ram Jeyaraman

Meeting Details cf. [event page for this meeting day](https://www.oasis-open.org/apps/org/workgroup/odata/event.php?event_id=34021).

##10 Approval of Agenda for Day Two

Discussion:

* Some modifications agreed which changed the ordering.

Agenda for Day Two approved as published with the above amendements.

##11 Process Issues (Day Two)[IPH_D2]

**Notes**:

* Issues in this section (11) have partly been progressed out of sequence, but have been noted here to better group by components impacted as a service for the reader.
* There is an "[Index of Issues Processed During the Meeting][IP_REF]" section in the appendix.

###11.1 Public Comments

####11.1.1 [c201301e00001](https://lists.oasis-open.org/archives/odata-comment/201301/msg00001.html)

Context:
> We received the public Comment #20130100001 on 2013-01-30 with title "Query String parsing in URIs"

Discussion:

* All discuss the comment.
* A JIRA issue for a minor improvement will be created to account for the identified issue and track its resolution.

**Update**: Issue [ODATA-232](https://tools.oasis-open.org/issues/browse/ODATA-232) has been created with summary "Enhance description of normalization procedures (public comment c201301e00001)" [component: OData ABNF Construction Rules].

####11.1.2 [ODATA-232](https://tools.oasis-open.org/issues/browse/ODATA-232)

ODATA-232
: "Enhance description of normalization procedures (public comment c201301e00001)" [component: OData ABNF Construction Rules] is **New**. 

ODATA-232
: "Enhance description of normalization procedures (public comment c201301e00001)" [component: OData ABNF Construction Rules] is **Open** with no objections.


###11.2 OData ABNF Construction Rules, OData CSDL, OData Protocol

####11.2.1 [ODATA-230](https://tools.oasis-open.org/issues/browse/ODATA-230)

ODATA-230
: "Support use of parameter aliases in $filter and $orderby" [components: OData ABNF Construction Rules, OData CSDL, OData Protocol] is **New**. 

Mike: 
>I **move** we resolve OData-230 as proposed by making @param a valid common expression that can be used throughout the URL syntax and the parameter value must be a primitive value, complex value, or collection value. **Hubert seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-230
: "Support use of parameter aliases in $filter and $orderby" [components: OData ABNF Construction Rules, OData CSDL, OData Protocol] is **Resolved** with no objections. 

###11.3 OData CSDL [odatacsdl_11.3]

####11.3.1 [ODATA-231](https://tools.oasis-open.org/issues/browse/ODATA-231)

ODATA-231
: "Define how to specify enumeration values in annotations" [component: OData CSDL] is **New**. 

Mike: 
>I **move** we resolve ODATA-231 as proposed by adding an "EnumMember" attribute to the &lt;PropertyValue&gt; element and an &lt;EnumMember&gt; child element for PropertyValue. **Hubert seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-231
: "Define how to specify enumeration values in annotations" [component: OData CSDL] is **Resolved** with no objections. 

####11.3.2 [ODATA-229](https://tools.oasis-open.org/issues/browse/ODATA-229)

ODATA-229
: "Allow annotations to target all model elements" [component: OData CSDL] is **New**. 

Discussion:

* Ralf listed (inside the issue's proposal) all CSDL elements that should be allowed as annotation targets 
* All add Documentation to the list 

Ralf: 
>I **move** to resolve ODATA-229 as proposed. **Hubert seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-229
: "Allow annotations to target all model elements" [component: OData CSDL] is **Resolved** with no objections. 

###11.4 OData Protocol [odataprotocol_11.4]

####11.4.1 [ODATA-31](https://tools.oasis-open.org/issues/browse/ODATA-31)

ODATA-31
: "Section 9.1.3: Describe call choreography for 202 Accepted (Async responses)" [component: OData Protocol] is **New**. 

Cf. section [14.1][asyncd] for discussion details including a link to the slides presented (format PPT).

Stefan: 
>I **move** to resolve ODATA-31 as proposed. **Hubert seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-31
: "Section 9.1.3: Describe call choreography for 202 Accepted (Async responses)" [component: OData Protocol] is **Resolved** with no objections. 

####11.4.2 [ODATA-233](https://tools.oasis-open.org/issues/browse/ODATA-233)

ODATA-233
: "Change $batch response code from 202 Accepted to 200 OK" [component: OData Protocol] is **New**. 

Discussion:

* Martin summarizes the issues description and proposal

Stefan: 
>I **move** to resolve ODATA-233 as proposed. **Hubert seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-233
: "Change $batch response code from 202 Accepted to 200 OK" [component: OData Protocol] is **Resolved** with no objections.

###11.5 OData CSDL, OData Protocol, OData URL Conventions

####11.5.1 [ODATA-126](https://tools.oasis-open.org/issues/browse/ODATA-126)

Context:
> Ralf has provided a [draft of the ER model](http://tools.oasis-open.org/version-control/browse/wsvn/odata/trunk/spec/examples/MetadataService/EntityDesignerDiagram.png?rev=159) in format PNG - added to the issue's proposal in November and after the Face to Face meeting) for a such a potential metadata service. The current svn-revision 169 has been slightly modified on 2013-01-25.

ODATA-126
: "Metadata as an OData service" [components: OData CSDL, OData Protocol, OData URL Conventions] is **New**. 

Discussion:

* Ralf presented the current state of the model and updated it during the meeting
* This version will be checked into SVN after the meeting, so people can complete it and then the issue may be moved to Resolved state

ODATA-126
: "Metadata as an OData service" [components: OData CSDL, OData Protocol, OData URL Conventions] is **Open** with no objections. 

###11.6 OData ATOM Format, OData JSON Format

####11.6.1 [ODATA-199](https://tools.oasis-open.org/issues/browse/ODATA-199)

ODATA-199
: "$expand should be allowed to return only ids for already seen objects" [components: OData ATOM Format, OData JSON Format] is **New**. 

Discussion:

* Mike explained the issue and how it relates to other issues/proposals

Mike: 
>I **move** we resolve ODATA-199 as proposed, with a preference of odata.allow-references. **Hubert seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-199
: "$expand should be allowed to return only ids for already seen objects" [components: OData ATOM Format, OData JSON Format] is **Resolved as noted in the motion** with no objections. 

**Update**: Mike uploaded the related current revision of: [Entity References in OData](https://www.oasis-open.org/committees/download.php/48083/Entity%20References%202013-1-31.docx)

###11.7 OData Extension for Data Aggregation

####11.7.1 [ODATA-164](https://tools.oasis-open.org/issues/browse/ODATA-164)

ODATA-164
: "Consider syntax and rules around client specifying custom aggregation functions for rollups" [component: OData Extension for Data Aggregation] is **New**. 

ODATA-164
: "Consider syntax and rules around client specifying custom aggregation functions for rollups" [component: OData Extension for Data Aggregation] is **Open** with no objections. 


##12 OData Extension for Temporal Data

###12.1 Discuss proposal [discussproposal_12.1]

Context:
> Latest revision from 2012-07-27 "[OData Extension for Temporal Data](https://www.oasis-open.org/committees/download.php/46565/20120727%20OData%20Extension%20for%20Temploral%20Data.pdf)"

Discussion:

* Andrew walks through the slides from 2012-07-27
* All discuss issues possibly leading to a proposal for the temporal extension.

##13 Timeline review [[TL_REF]]

Discussion of our progress so far and the next steps.

* All discuss impact of open issues, feature blocks and availabilities on further progression of core work products
* Ram reminds everyone, that now it is a good time to start thinking about implementations, since at least three statements of use are required to progress the core work products to OASIS Standard.
* All think, the next Face to face will have special importance for progression to CS01
* First candidates for venue and date range are: 
    + venue (which will be evaluated):
        - Amsterdam (SDL)
        - Walldorf (SAP)
        - Redmond (MS)
    + and time slot (weeks):
        - April 15-19
        - April 22-26
 
Suggestions for classification of issues, w.r.t. core progression:
 
* Class A: Purely editorial corrections
* Class B: Something is broken: Major/minor technical flaws or interoperability problems
* Class C: Nothing is broken but need this for a "real good" reason: Major/minor technical changes
* Class D: Nothing is broken but nice to have: Major/minor technical improvements
  
Wrap-Up:

* The plan is to stop all issues not in classes A, B or C from having any impact on the first core version 4.0
* Also planned is to not have i.e. avoid the need for a second woring draft (WD2).
* Ram and Stefan will clarify which version targets will be introduced into JIRA to implement the proposal to NOT look at class D issues submitted and opened by the TC after 2013-02-07 w.r.t. target version 4.0
* Current plan is to alias WD1 (current) onto 4.0 as V4.0_WD01 and add 4.1 and 5.0 as additional fix version targets (eg. as V4.1_WD01 and V5.0_WD01).

**Update**: A new action item has been created: [AI#0028](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_item.php?action_item_id=3559)
: "Introduce fix target versions 4.0, minor and next major into JIRA" [owner: Ram Jeyaraman] whith due date 2013-02-07.

##14 Async discussion

###14.1 Discuss proposal [asyncd]

Context:
> For background information cf. section 11.2 "[Async](https://www.oasis-open.org/committees/download.php/47432/odata-meeting-15_on-20121108_9-F2F-minutes.html#async)" in the minutes of previous F2F meeting in Boston.
 
Discussion:

* Martin walks through the proposal "[Choreography for Asynchrones Requests](https://www.oasis-open.org/committees/download.php/48081/AsyncODataProposal.ppt)"
* Base is the (current) RFC draft "[Prefer Header for HTTP, draft-snell-http-prefer-18](http://www.rfc-editor.org/internet-drafts/draft-snell-http-prefer-18.txt)", J Snell, 2013-01-07 (Expires: 2013-07-11).

**Update**: Issue [ODATA-233](https://tools.oasis-open.org/issues/browse/ODATA-233) has been created with summary "Change $batch response code from 202 Accepted to 200 OK" [component: OData Protocol].


##15 OData Extension for Data Aggregation Work Product

###15.1 Review and accept the latest draft. [reviewandacceptthelatestdraft_15.1] 

Context:
> OData Extension for Data Aggregation Version 1.0 Working Draft 01

Discussion:

* Ralf presents the proposal on the suggested syntax worked out during this week and shows motivating and illustrating use cases.
* The editors will provide a published version of the document after the meeting.

##16 Core Vocabulary

Context:
> In SVN there is a first draft of the [core vocabulary](https://tools.oasis-open.org/version-control/browse/wsvn/odata/trunk/spec/examples/Org.OData.Core.V1.xml)

Discussion:

* Ralf walks through the draft and applies outcome of discussion directly duringthe meeting
* As the core vocabulary is currently in the examples folder, it will be moved into a place that fits better
* It has been discussed, where the ownership of the vocabulary should be placed
* Mike suggestst to fix issues and then propose the document accordingly
* All agree

**Update**: The vocabulary drafts for [Core](https://tools.oasis-open.org/version-control/svn/odata/trunk/spec/vocabularies/Org.OData.Core.V1.xml), [Atom](https://tools.oasis-open.org/version-control/svn/odata/trunk/spec/vocabularies/Org.OData.Atom.V1.xml) and [Measures](https://tools.oasis-open.org/version-control/svn/odata/trunk/spec/vocabularies/Org.OData.Measures.V1.xml) have been published in SVN (revision 168) in folder [svn:/odata/trunc/spec/vocabularies/](https://tools.oasis-open.org/version-control/svn/odata/trunk/spec/vocabularies/) after the meeting. 

**Update**: Ralf has suggested a new corresponding JIRA component label "Vocabularies" to associate issues with these work products after the meeting. 


##17 Next Meeting

**Note**: Due to resource issues the members agree to meet again by call on 2013-02-07.

##18 AOB [aob_18]

None. 
 
### Face to Face Meeting adjourned on 1705 CET

# Appendices

## List of Open Action Items Before the Meeting [AI_REF]

**Retrieval time stamp**: `2013-01-29 21:05 +01:00`.

AI#0005
: "Come up with a first milestine for the temporal extension" [owner: Andrew Eisenberg] is **Ongoing** (Note: Due 2013-01-31)

AI#0006
: "Come up with estimate for first milestone for XML data extension" [owner: Andrew Eisenberg] is **Ongoing** (Note: Due 2013-01-31)

AI#0007
: "Come up with estimate for first milestone for JSON data extension" [owner: Susan Malaika] is **Ongoing** (Note: Due 2013-01-31)

AI#0018
: "Prepare Working Draft 01 (WD01) version of OData Extension for Temporal Data" [owner: Andrew Eisenberg] is **Ongoing**

AI#0019
: "Prepare Working Draft 01 (WD01) version of OData Extension for XML Data" [owner: Andrew Eisenberg] is **Ongoing**

AI#0020
: "Prepare Working Draft 01 (WD01) version of OData Extension for JSON Data" [owner: Susan Malaika] is **Ongoing**

**Note**: The actual action item processing is documented in section [4][AIH] and subsections thereof.

## Index of Issues Processed During the Meeting [IP_REF]

**Note**: The actual issue processing is documented in sections [6][IPH_D1] (for Day One) or [11][IPH_D2] (for Day Two). The below index has two main parts: First come the public comments, second the JIRA issues. Each list of issues is sorted by ascending issue number. Noted are the ID, the summary and the reference to the relevant subsection where the issue progression has been documented:

Public Comments:

* [c201301e00001](https://lists.oasis-open.org/archives/odata-comment/201301/msg00001.html) "Query String parsing in URIs" cf. section [11.1.1][c201301e00001].

JIRA Issues:

* [ODATA-3](https://tools.oasis-open.org/issues/browse/ODATA-3) "Use CQL standard for query instead of odata-specific filter query protocol" cf. section [6.4.2][odata-3].
* [ODATA-12](https://tools.oasis-open.org/issues/browse/ODATA-12) "create a data type for property names" cf. section [6.5.1.14][odata-12].
* [ODATA-16](https://tools.oasis-open.org/issues/browse/ODATA-16) "Define an Edm.AnyType to allow functions to apply to entity sets of any entity type" cf. section [6.5.1.12][odata-16].
* [ODATA-25](https://tools.oasis-open.org/issues/browse/ODATA-25) "Support Obtaining Changes (Deltas) from a result." cf. section [6.5.4.1][odata-25].
* [ODATA-31](https://tools.oasis-open.org/issues/browse/ODATA-31) "Section 9.1.3: Describe call choreography for 202 Accepted (Async responses)" cf. section [11.4.1][odata-31].
* [ODATA-33](https://tools.oasis-open.org/issues/browse/ODATA-33) "Allow $filter and $select to refer to annotations as if they were properties" cf. section [6.5.3.1][odata-33].
* [ODATA-90](https://tools.oasis-open.org/issues/browse/ODATA-90) "Section 2.1: define suffix ';odata=xxx' for application/json and the possible values for xxx" cf. section [6.1.2][odata-90].
* [ODATA-91](https://tools.oasis-open.org/issues/browse/ODATA-91) "2.1: explicitly state which format the server will return in response to each given set of headers" cf. section [6.1.1][odata-91].
* [ODATA-93](https://tools.oasis-open.org/issues/browse/ODATA-93) "3.4: add introductory paragraph" cf. section [6.1.3][odata-93].
* [ODATA-96](https://tools.oasis-open.org/issues/browse/ODATA-96) "Need to define semantics, serialization format, etc. for Enums" cf. section [6.3.1][odata-96].
* [ODATA-99](https://tools.oasis-open.org/issues/browse/ODATA-99) "3.9 Advertisement for a Function or Action: add example and refer to ABNF rules" cf. section [6.1.4][odata-99].
* [ODATA-100](https://tools.oasis-open.org/issues/browse/ODATA-100) "5.1 Response Body: explain security reasons leading to the object wrapper" cf. section [6.1.6][odata-100].
* [ODATA-105](https://tools.oasis-open.org/issues/browse/ODATA-105) "Support instance annotations on errors in JSON" cf. section [6.1.5][odata-105].
* [ODATA-108](https://tools.oasis-open.org/issues/browse/ODATA-108) "Define rules for the target of an annotation that supports implicit casting of relationships" cf. section [6.5.1.11][odata-108].
* [ODATA-109](https://tools.oasis-open.org/issues/browse/ODATA-109) "Define rules for specifying annotations within annotations" cf. section [6.5.1.10][odata-109].
* [ODATA-126](https://tools.oasis-open.org/issues/browse/ODATA-126) "Metadata as an OData service" cf. section [11.5.1][odata-126].
* [ODATA-139](https://tools.oasis-open.org/issues/browse/ODATA-139) "New system query option $search for free-text search within an entity set" cf. section [6.4.1][odata-139].
* [ODATA-164](https://tools.oasis-open.org/issues/browse/ODATA-164) "Consider syntax and rules around client specifying custom aggregation functions for rollups" cf. section [11.7.1][odata-164].
* [ODATA-169](https://tools.oasis-open.org/issues/browse/ODATA-169) "Representation of named entities in the service document" cf. section [6.2.1][odata-169].
* [ODATA-172](https://tools.oasis-open.org/issues/browse/ODATA-172) "EntitySet may be qualified with namespace or alias and EntityContainer" cf. section [6.5.2.1][odata-172].
* [ODATA-180](https://tools.oasis-open.org/issues/browse/ODATA-180) "Remove Extends attribute from EntityContainer element" cf. section [6.5.1.5][odata-180].
* [ODATA-181](https://tools.oasis-open.org/issues/browse/ODATA-181) "Referencing/reusing a model element from a different schema does not require to 'include'" cf. section [6.5.1.4][odata-181].
* [ODATA-182](https://tools.oasis-open.org/issues/browse/ODATA-182) "Define the term 'model'" cf. section [6.5.1.3][odata-182].
* [ODATA-193](https://tools.oasis-open.org/issues/browse/ODATA-193) "Allow function imports to return entities from a different service" cf. section [6.5.1.2][odata-193].
* [ODATA-195](https://tools.oasis-open.org/issues/browse/ODATA-195) "Simplify entity set qualification rules for NavigationPropertyBinding" cf. section [6.5.1.1][odata-195].
* [ODATA-197](https://tools.oasis-open.org/issues/browse/ODATA-197) "Define standard functions for edm:Apply element" cf. section [6.5.1.15][odata-197].
* [ODATA-198](https://tools.oasis-open.org/issues/browse/ODATA-198) "Allow Type='Any' and Type='Collection(Any)' for NavigationProperty elements" cf. section [6.5.1.13][odata-198].
* [ODATA-199](https://tools.oasis-open.org/issues/browse/ODATA-199) "$expand should be allowed to return only ids for already seen objects" cf. section [11.6.1][odata-199].
* [ODATA-205](https://tools.oasis-open.org/issues/browse/ODATA-205) "Merge TypeAnnotation and ValueAnnotation into Annotation" cf. section [6.5.1.6][odata-205].
* [ODATA-213](https://tools.oasis-open.org/issues/browse/ODATA-213) "Allow all dynamic expressions of the appropriate type within edm:Collection expressions" cf. section [6.5.1.7][odata-213].
* [ODATA-225](https://tools.oasis-open.org/issues/browse/ODATA-225) "Define Functions in Schema; reference in Container using FunctionImport." cf. section [6.5.1.8][odata-225].
* [ODATA-226](https://tools.oasis-open.org/issues/browse/ODATA-226) "Clarify that the root of the Path attribute of a &lt;PropertyValue&gt; element is rooted at the containing entity" cf. section [6.5.1.9][odata-226].
* [ODATA-229](https://tools.oasis-open.org/issues/browse/ODATA-229) "Allow annotations to target all model elements" cf. section [11.3.2][odata-229].
* [ODATA-230](https://tools.oasis-open.org/issues/browse/ODATA-230) "Support use of parameter aliases in $filter and $orderby" cf. section [11.2.1][odata-230].
* [ODATA-231](https://tools.oasis-open.org/issues/browse/ODATA-231) "Define how to specify enumeration values in annotations" cf. section [11.3.1][odata-231].
* [ODATA-232](https://tools.oasis-open.org/issues/browse/ODATA-232) "Enhance description of normalization procedures (public comment c201301e00001)" cf. section [11.1.2][odata-232].
* [ODATA-233](https://tools.oasis-open.org/issues/browse/ODATA-233) "Change $batch response code from 202 Accepted to 200 OK" cf. section [11.4.2][odata-233].

## Timeline Reference [TL_REF]
  
Draft timeline for OData core Work Products:

* December 2012
    + December 19, 2012
        - File all known issues on core Work Products resulting from new proposals
* January 2013
    + January 17, 2012
        - File all known issues on core Work Products resulting from extension Work Products
    + 3rd F2F meeting January 30-31, 2013 (Z&uuml;rich, Switzerland) (details: [https://www.oasis-open.org/apps/org/workgroup/odata/event.php?event_id=34020](https://www.oasis-open.org/apps/org/workgroup/odata/event.php?event_id=34020))
        - Resolve all key issues on core Work Products
        - TC agrees to a high bar for accepting new issues on core Work Products
* February 2013
    + February 7, 2013
        - Resolve all remaining issues on Core Work Products
        - Agree to advance core Work Products to Committee Specification Draft 01 (CSD01)
    + February 14, 2013
        - Editors to prepare Committee Specification Draft 01 (CSD01) of core Work Products containing resolutions to all issues
    + February 21, 2013
        - Approve Committee Specification Draft 01 (CSD01) of core Work Products and agree to start 30-day public review
* March 2013
    + March 1 through March 30
        - 30-day public review of core Work Products
        - Address public review comments on core Work Products
* April 2013
    + 4th F2F meeting (April 2-4, 2013)
        - Address public review comments on core Work Products
        - NOTE: If there are no public review comments on CSD01 AND no further substantive changes (requested by the TC) to the core Work Products, we can jump ahead to approving Committee Specification (CS)
    + April 18, 2013
        - Address all public review comments on core Work Products
        - Agree to advance core Work Products to Committee Specification Draft 02 (CSD02)
    + Leading up to April 25, 2013
        - Editors to prepare Committee Specification Draft 02 (CSD02) of core Work Products containing resolutions to all issues
    + April 25, 2013
        - Approve Committee Specification Draft 02 (CSD02) of core Work Products and agree to start 15-day public review
* May 2013
    + May 1 through 15, 2013
        - 15-day public review
    + May 23
        - Assuming there are no changes to core Work Products resulting from the preceding public review, approve Committee Specification (CS)
        - NOTE: If there are substantive changes to the core Work Products resulting from the preceding public review, we will need to extend the timeline and produce CSD03 and so on.
* Early June 2013
    + Approve Candidate OASIS Standard (COS)
* Mid-June and mid-August 2013
    + 60-day public review
* August 2013
    + OASIS Standard (OS)
 
Draft timeline for extension Work Products:

* November 29, 2012
    + Review and file issues on core Work Products resulting from extension Work Products
* January 17, 2013
    + File all known issues on core Work Products resulting from extension Work Products
* February and March 2013
    + Resolve issues on extension Work Products
* April 2-4, 2013 4th TC F2F meeting
    + Resolve issues and make progress on extension Work Products
* May 2013
    + Approve Committee Specification Draft 01 of extension Work Products (depending on progress)