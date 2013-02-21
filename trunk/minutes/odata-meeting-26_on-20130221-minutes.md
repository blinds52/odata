#OData meeting #26, Thursday, 21 Feb 2013, 0800 - 1000 PT

**Note**: For explanations of conventions and other formal aspects common to OData TC meeting minutes which are used in this document please cf. "[Formal Aspects of Meeting Minutes](https://www.oasis-open.org/committees/download.php/48109/formal-aspects-meeting-minutes-v1.html)". 

Meeting chaired by Barbara Hartel and Ram Jeyaraman

Acting Chair: Barbara Hartel

## 1 Roll call
 
### 1.1 Members Present: 

        Andrew Eisenberg (IBM)        Anila Kumar GVN (CA Technologies)        Barbara Hartel (SAP AG)        Dale Moberg (Axway Software)        Diane Downie (Citrix Systems)        Erik de Voogd (SDL)        Gerald Krause (SAP AG)        John Willson (Individual)        Ken Baclawski (Northeastern University)        Martin Zurmuehl (SAP AG)        Matthew Borges (SAP AG) a.k.a. Matt        Michael Pizzo (Microsoft) a.k.a. Mike        Nuno Linhares (SDL)        Patrick Durusau (Individual)        Ralf Handl (SAP AG)        Ram Jeyaraman (Microsoft)        Robert Richards (Mashery)        Stan Mitranic (CA Technologies)        Stefan Drees (Individual)        Susan Malaika (IBM)        Ted Jones (Red Hat)

Quorum achieved. Details cf. [normative attendance sheet for this meeting](https://www.oasis-open.org/apps/org/workgroup/odata/event.php?event_id=34185).

## 2 Approval of Agenda

Mike suggests to cover also ODATA-129 inside Applied section after ODATA-110.

Agenda approved as published and ammended by Mike.

## 3 Approval of Minutes from Previous Meeting(s)

### 3.1 Approval of [Minutes of 2013-02-14 Meeting#25](https://www.oasis-open.org/committees/download.php/48291/odata-meeting-25_on-20130214-minutes.html)

**Meeting minutes approved with no objections**.

##4 Review of [Action Items](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_items.php) (AI) and Progress [AIH]

Context:
> See the "[List of Open Action Items Before the Meeting][AI_REF]" section in the appendix.
  
###4.1 Action items due by 2013-02-21 (end of day)

####4.1.1 [AI#0028](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_item.php?action_item_id=3559)

AI#0028
: "Introduce fix target versions 4.0, minor and next major into JIRA" [owner: Ram Jeyaraman] is **Ongoing** (Note: Due 2013-02-21)

Discussion:

* Ram shortly summarizes the changes embedded in JIRA
* Especially he removed the version info from the component labels, since this is found in the version relevant fields as added to JIRA by Stefan.
* All agree to close the action item AI#0028

**No further discussion**. **No objections**. 


AI#0028
: "Introduce fix target versions 4.0, minor and next major into JIRA" [owner: Ram Jeyaraman] is **Closed** (Note: Due 2013-02-21)

###4.2 Action items NOT due by 2013-02-21 (end of day) but MAY be ready for closure

None.

##5 Review of [Issues List](https://tools.oasis-open.org/issues/secure/IssueNavigator.jspa?reset=true&mode=hide&pid=10103&sorter/field=issuekey&sorter/order=ASC) (IL) and Progress [IPH]

**Notes**:

* Issues in this section (5) may have been progressed out of sequence, but have been noted here to better group by components impacted as a service for the reader.
* There is an "[Index of Issues Processed During the Meeting][IP_REF]" section in the appendix.

###5.1 Issues in Proposed state (carried over from Feb 7, 2013 TC meeting)

####5.1.1 OData Protocol [coprotocol1]

#####5.1.1.1 [ODATA-253](https://tools.oasis-open.org/issues/browse/ODATA-253)

ODATA-253
: "Clients should be prepared to handle unadvertised properties" [component: OData Protocol] is **New**. 

Ralf: 
>I **move** to resolve ODATA-253 as proposed. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-253
: "Clients should be prepared to handle unadvertised properties" [component: OData Protocol] is **Resolved** with no objections. 

#####5.1.1.2 [ODATA-247](https://tools.oasis-open.org/issues/browse/ODATA-247)

ODATA-247
: "More clearly define extensibility of Formats" [components: OData Extension for JSON Data, OData ATOM Format, OData Protocol] is **New**. 

Ralf: 
>I **move** to resolve ODATA-247 as proposed. **Mike seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-247
: "More clearly define extensibility of Formats" [components: OData Extension for JSON Data, OData ATOM Format, OData Protocol] is **Resolved** with no objections. 

#####5.1.1.3 [ODATA-255](https://tools.oasis-open.org/issues/browse/ODATA-255)

ODATA-255
: "Consider adding support for requesting flattened results" [components: OData Extension for JSON Data, OData ATOM Format, OData Protocol]  is **New**. 

Discussion:

* Mike suggests moving the resolutions target version to version 4.1 or later ie. maybe version 5.0.

Stefan: 
>I **move** to change the JIRA fixVersion field of ODATA-255 to v5.0_WD01. **Mike seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-255
: "Consider adding support for requesting flattened results" [components: OData Extension for JSON Data, OData ATOM Format, OData Protocol]  is **Deferred to V5.0 as noted in the motion** with no objections. 

#####5.1.1.4 [ODATA-243](https://tools.oasis-open.org/issues/browse/ODATA-243)

ODATA-243
: "Add client preferences for server-driven paging" [component: OData Protocol] is **New**. 

Mike: 
>I **move** we accept ODATA-243 as proposed, calling the option odata.maxpagesize and allowing the value to be changed between requests (given that the server is always free to ignore). **Martin seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-243
: "Add client preferences for server-driven paging" [component: OData Protocol] is **Resolved as noted in the motion** with no objections. 

#####5.1.1.5 [ODATA-261](https://tools.oasis-open.org/issues/browse/ODATA-261)

ODATA-261
: "Improve section 10.2.3.8 The $format System Query Option" [component: OData Protocol] is **New**. 

Ralf: 
>I **move** to resolve ODATA-261 as proposed. **Mike seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-261
: "Improve section 10.2.3.8 The $format System Query Option" [component: OData Protocol] is **Resolved** with no objections. 

####5.1.2 OData CSDL [cocsdl1]

#####5.1.2.1 [ODATA-269](https://tools.oasis-open.org/issues/browse/ODATA-269)

ODATA-269
: "Separate Functions and Actions" [components: OData Protocol, OData CSDL] is **New**. 

Stefan: 
>I **move** to resolve ODATA-269 as proposed.. **Ralf seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-269
: "Separate Functions and Actions" [components: OData Protocol, OData CSDL] is **Resolved** with no objections. 

#####5.1.2.2 [ODATA-237](https://tools.oasis-open.org/issues/browse/ODATA-237)

ODATA-237
: "Require type usage to always specify a qualified name for types other than the built-in primitive types" [component: OData CSDL] is **New**. 

Mike: 
>I **move** we approve ODATA-237 as proposed.. **Ralf seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-237
: "Require type usage to always specify a qualified name for types other than the built-in primitive types" [component: OData CSDL] is **Resolved** with no objections. 

#####5.1.2.3 [ODATA-273](https://tools.oasis-open.org/issues/browse/ODATA-273)

ODATA-273
: "Clarify whether derived types MUST introduce new properties" [component: OData CSDL] is **New**. 

Mike: 
>I **move** we approve ODATA-273 with the clarification that additional properties not be required. **Andrew seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-273
: "Clarify whether derived types MUST introduce new properties" [component: OData CSDL] is **Resolved as noted in the motion** with no objections. 

#####5.1.2.4 [ODATA-268](https://tools.oasis-open.org/issues/browse/ODATA-268)

ODATA-268
: "Use http://docs.oasis-open.org/odata/ns/edm as the EDM namespace URL" [component: OData CSDL] is **New**. 

Stefan: 
>I **move** to approve ODATA-268 as proposed. **Mike seconds**.

**No further discussion**. **No objections**. The **motion passes**.
 
ODATA-268
: "Use http://docs.oasis-open.org/odata/ns/edm as the EDM namespace URL" [component: OData CSDL] is **Resolved** with no objections. 

#####5.1.2.5 [ODATA-272](https://tools.oasis-open.org/issues/browse/ODATA-272)

ODATA-272
: "FixedLength facet is Boolean" [component: OData CSDL] is **New**. 

Stefan: 
>I **move** to approve ODATA-272 as proposed. **Martin seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-272
: "FixedLength facet is Boolean" [component: OData CSDL] is **Resolved** with no objections. 

#####5.1.2.6 [ODATA-258](https://tools.oasis-open.org/issues/browse/ODATA-258)

ODATA-258
: "Advertise function imports in service document" [components: OData JSON Format, OData ATOM Format] is **New**. 

Ralf: 
>I **move** to resolve ODATA-258 as proposed with the addition of also advertising children of non-default entity containers, using workspaces in AtomPub and qualified names in JSON. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-258
: "Advertise function imports in service document" [components: OData JSON Format, OData ATOM Format] is **Resolved as noted in the motion** with no objections. 

#####5.1.2.7 [ODATA-76](https://tools.oasis-open.org/issues/browse/ODATA-76)

ODATA-76
: "Edm.Decimal is a floating-point type" [component: OData CSDL] is **Open**. 

Ralf: 
>I **move** to resolve ODATA-76 as proposed. **Andrew seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-76
: "Edm.Decimal is a floating-point type" [component: OData CSDL] is **Resolved** with no objections. 

####5.1.3 OData URL Conventions [courlc1]

#####5.1.3.1 [ODATA-215](https://tools.oasis-open.org/issues/browse/ODATA-215)

ODATA-215
: "Remove hour(), minute() and second() query functions and add corresponding overloads to the hours(), minutes(), and seconds() functions" [components: OData URL Conventions, OData ABNF Construction Rules] is **New**. 

Discussion:

* Andrew suggests that duration have just total_seconds()

Mike: 
>I **move** we resolve OData-215 as follows: A) Remove the days() hours() minutes() and seconds() function for duration. B) Add a total_seconds() function for duration, which is decimal. C) Change the existing second() function to return a decimal. **Andrew seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-215
: "Remove hour(), minute() and second() query functions and add corresponding overloads to the hours(), minutes(), and seconds() functions" [components: OData URL Conventions, OData ABNF Construction Rules] is **Resolved as noted in the motion** with no objections. 

#####5.1.3.2 [ODATA-122](https://tools.oasis-open.org/issues/browse/ODATA-122)

ODATA-122
: "Please clarify the meaning of filter functions applied to DateTimeOffset values" [component: OData CSDL] is **New**. 

Mike: 
>I **move** we resolve ODATA-122 as proposed. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-122
: "Please clarify the meaning of filter functions applied to DateTimeOffset values" [component: OData CSDL] is **Resolved** with no objections. 

####5.1.4 OData JSON [cojson1]

#####5.1.4.1 [ODATA-259](https://tools.oasis-open.org/issues/browse/ODATA-259)

ODATA-259
: "Add Annotation Groups to JSON format" [component: OData JSON Format] is **New**. 

Mike: 
>I **move** we defer ODATA-259 to ODATA version 5.0. **Ralf seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-259
: "Add Annotation Groups to JSON format" [component: OData JSON Format] is **Deferred as noted in the motion** with no objections. 

#####5.1.4.2 [ODATA-249](https://tools.oasis-open.org/issues/browse/ODATA-249)

ODATA-249
: "'Kind' property should be optional for EntitySets in JSON Service Documents" [component: OData JSON Format] is **New**. 

Mike: 
>I **move** we resolve ODATA-249 as proposed. **Ralf seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-249
: "'Kind' property should be optional for EntitySets in JSON Service Documents" [component: OData JSON Format] is **Resolved** with no objections. 

####5.1.5 OData ATOM [coatom1]

#####5.1.5.1 [ODATA-250](https://tools.oasis-open.org/issues/browse/ODATA-250)

ODATA-250
: "For instance annotations in Atom, 'Annotation' element, 'Type', 'Term' and 'Target' attributes should be lower case" [component: OData ATOM Format] is **New**. 

Mike: 
>I **move** we resolve ODATA-250 as proposed. **Ralf seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-250
: "For instance annotations in Atom, 'Annotation' element, 'Type', 'Term' and 'Target' attributes should be lower case" [component: OData ATOM Format] is **Resolved** with no objections. 

#####5.1.5.2 [ODATA-251](https://tools.oasis-open.org/issues/browse/ODATA-251)

ODATA-251
: "Clarify, within [ATOM], that complex types can be annotated" [component: OData ATOM Format] is **New**. 

Mike: 
>I **move** we resolve ODATA-251 as proposed. **Ralf seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-251
: "Clarify, within [ATOM], that complex types can be annotated" [component: OData ATOM Format] is **Resolved** with no objections. 

#####5.1.5.3 [ODATA-252](https://tools.oasis-open.org/issues/browse/ODATA-252)

ODATA-252
: "Clarify ordering of instance annotations in [ATOM] and [JSON]" [components: OData JSON Format, OData ATOM Format] is **New**. 

Mike: 
>I **move** we resolve ODATA-252 as proposed. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-252
: "Clarify ordering of instance annotations in [ATOM] and [JSON]" [components: OData JSON Format, OData ATOM Format] is **Resolved** with no objections. 

#####5.1.5.4 [ODATA-254](https://tools.oasis-open.org/issues/browse/ODATA-254)

ODATA-254
: "Selection of individual properties in [ATOM] should not include property name" [component: OData ATOM Format] is **New**. 

Mike: 
>I **move** we resolve ODATA-254 as proposed. **Ralf seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-254
: "Selection of individual properties in [ATOM] should not include property name" [component: OData ATOM Format] is **Resolved** with no objections. 

####5.1.6 OData ABNF Construction Rules, OData URL Conventions [coabnf_urlc1]

#####5.1.6.1 [ODATA-222](https://tools.oasis-open.org/issues/browse/ODATA-222)

ODATA-222
: "free-text search within a property" [components: OData URL Conventions, OData ABNF Construction Rules] is **New**. 

Discussion:

* Mike suggests that the proposal be changed into the search expression (second parameter of the search() function) must be enclosed in quotes so as to not irritate parsers.

Mike: 
>I **move** we resolve ODATA-222 as proposed, with the clarification that the second argument is a string expression. **Andrew seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-222
: "free-text search within a property" [components: OData URL Conventions, OData ABNF Construction Rules] is **Resolved as noted in the motion** with no objections. 

####5.1.7 OData ABNF Construction Rules, OData Protocol, OData URL Conventions [coabnf_protocol_urlc1]

#####5.1.7.1 [ODATA-228](https://tools.oasis-open.org/issues/browse/ODATA-228)

ODATA-228
: "Specify $search for free-text search within a OData Service and specify $search for free-text search within an entityContainer" [components: OData Protocol, OData ABNF Construction Rules, OData URL Conventions] is **New**. 

Ralf: 
>I **move** to resolve ODATA-228 as proposed with the addition of including the metadata:set attribute on the atom:id element in ATOM and the odata.set annotation in JSON. **Mike seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-228
: "Specify $search for free-text search within a OData Service and specify $search for free-text search within an entityContainer" [components: OData Protocol, OData ABNF Construction Rules, OData URL Conventions] is **Resolved as noted in the motion** with no objections. 

###5.2 Editorial issues in Proposed state, planned to be processed in a group without detailed discussion. [GM1]

**Note**:
>Please have a look at and speak up if you want a discussion on specific issues
 
Stefan:
> I **move** we resolve ODATA-146, ODATA-147, ODATA-152, ODATA-153, ODATA-178 and ODATA-179 as proposed. **Mike** seconds.

**No further discussion**. **No objections**. The **motion passes**.

 
####5.2.1 OData ATOM Format [coatom2]

#####5.2.1.1 [ODATA-146](https://tools.oasis-open.org/issues/browse/ODATA-146)

ODATA-146
: "Add example for inlining expanded entities" [component: OData ATOM Format] is **New**. 

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[5.2][GM1]])

ODATA-146
: "Add example for inlining expanded entities" [component: OData ATOM Format] is **Resolved** with no objections. 

#####5.2.1.2 [ODATA-147](https://tools.oasis-open.org/issues/browse/ODATA-147)

ODATA-147
: "Add example for $inlinecount representation" [component: OData ATOM Format] is **New**. 

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[5.2][GM1]])

ODATA-147
: "Add example for $inlinecount representation" [component: OData ATOM Format] is **Resolved** with no objections. 

#####5.2.1.3 [ODATA-153](https://tools.oasis-open.org/issues/browse/ODATA-153)

ODATA-153
: "Atom: Add examples for all request and response types using a consistent sample OData service" [component: OData ATOM Format] is **New**. 

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[5.2][GM1]])

ODATA-153
: "Atom: Add examples for all request and response types using a consistent sample OData service" [component: OData ATOM Format] is **Resolved** with no objections. 

#####5.2.1.4 [ODATA-178](https://tools.oasis-open.org/issues/browse/ODATA-178)

ODATA-178
: "Enhance abstract, distinguish its content from 1st paragraph of introduction and edit the payload object listing in 2nd para of 1 Introduction" [component: OData ATOM Format] is **New**. 

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[5.2][GM1]])

ODATA-178
: "Enhance abstract, distinguish its content from 1st paragraph of introduction and edit the payload object listing in 2nd para of 1 Introduction" [component: OData ATOM Format] is **Resolved** with no objections. 

#####5.2.1.5 [ODATA-179](https://tools.oasis-open.org/issues/browse/ODATA-179)

ODATA-179
: "Adapt OData inter document references to new work product structuring of core" [component: OData ATOM Format] is **New**. 

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[5.2][GM1]])

ODATA-179
: "Adapt OData inter document references to new work product structuring of core" [component: OData ATOM Format] is **Resolved** with no objections. 

####5.2.2 OData JSON Format [cojson2]

#####5.2.2.1 [ODATA-152](https://tools.oasis-open.org/issues/browse/ODATA-152)

ODATA-152
: "JSON: Add examples for all request and response types using a consistent sample OData service" [component: OData JSON Format] is **New**. 

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[5.2][GM1]])

ODATA-152
: "JSON: Add examples for all request and response types using a consistent sample OData service" [component: OData JSON Format] is **Resolved** with no objections. 

###5.3 Editorial issues in Proposed state to be discussed in the meeting 

####5.3.1 [ODATA-214](https://tools.oasis-open.org/issues/browse/ODATA-214) 

ODATA-214
: "Find consensus on 'Additional artifacts'-section of multi component Work Products (and implement accordingly) " [components: OData CSDL, OData ABNF Construction Rules, OData Protocol, OData JSON Format, OData URL Conventions] is **New**. 

Discussion:

* Mike prefers the alternate proposal B as described in the issue, since it allows eg. readers of the JSON part to notice, that there is also an ATOM part.

Stefan: 
>I **move** we resolve ODATA-214 as proposed following the alternate proposal B. **XMemberB seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-214
: "Find consensus on 'Additional artifacts'-section of multi component Work Products (and implement accordingly) " [components: OData CSDL, OData ABNF Construction Rules, OData Protocol, OData JSON Format, OData URL Conventions] is **Resolved as noted in the motion** with no objections. 

###5.4 Issues in Applied state [GM2]

Ralf: 
>I **move** to close ODATA-96, ODATA-225, ODATA-230, ODATA-221, ODATA-212, ODATA-202 and ODATA-162 as applied. **Mike seconds**.

**No further discussion**. **No objections**. The **motion passes**.

####5.4.1 OData ABNF Construction Rules, OData ATOM Format, OData CSDL, OData JSON, Format OData Protocol

#####5.4.1.1 [ODATA-96](https://tools.oasis-open.org/issues/browse/ODATA-96)

ODATA-96
: "Need to define semantics, serialization format, etc. for Enums" [components: OData ATOM Format, OData ABNF Construction Rules, OData JSON Format, OData CSDL, OData Protocol] is **Applied**. 

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[5.4][GM2]])

ODATA-96
: "Need to define semantics, serialization format, etc. for Enums" [components: OData ATOM Format, OData ABNF Construction Rules, OData JSON Format, OData CSDL, OData Protocol] is **Closed** with no objections. 

####5.4.2 OData ABNF Construction Rules, OData CSDL [coabnf_csdl1]

#####5.4.2.1 [ODATA-225](https://tools.oasis-open.org/issues/browse/ODATA-225)

ODATA-225
: "Define Functions in Schema; reference in Container using FunctionImport." [components: OData CSDL, OData ABNF Construction Rules] is **Applied**. 

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[5.4][GM2]])

ODATA-225
: "Define Functions in Schema; reference in Container using FunctionImport." [components: OData CSDL, OData ABNF Construction Rules] is **Closed** with no objections. 

####5.4.3 OData ABNF Construction Rules, OData URL Conventions

#####5.4.3.1 [ODATA-230](https://tools.oasis-open.org/issues/browse/ODATA-230)

ODATA-230
: "Support use of parameter aliases in $filter and $orderby" [components: OData URL Conventions, OData ABNF Construction Rules] is **Applied**. 

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[5.4][GM2]])

ODATA-230
: "Support use of parameter aliases in $filter and $orderby" [components: OData URL Conventions, OData ABNF Construction Rules] is **Closed** with no objections. 

####5.4.4 OData ATOM Format, OData JSON Format [coatom_json1]

#####5.4.4.1 [ODATA-221](https://tools.oasis-open.org/issues/browse/ODATA-221)

ODATA-221
: "Flatten the message element in the JSON Error Represention (Section 4.18 Representing Errors in a Response)" [components: OData JSON Format, OData ATOM Format] is **Applied**. 

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[5.4][GM2]])

ODATA-221
: "Flatten the message element in the JSON Error Represention (Section 4.18 Representing Errors in a Response)" [components: OData JSON Format, OData ATOM Format] is **Closed** with no objections. 

####5.4.5 OData ATOM Format, OData JSON Format, OData Protocol [coatom_json_protocol1]

#####5.4.5.1 [ODATA-212](https://tools.oasis-open.org/issues/browse/ODATA-212)

ODATA-212
: "Define request body format for Actions in Atom and JSON format specifications" [components: OData JSON Format, OData ATOM Format, OData Protocol] is **Applied**. 

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[5.4][GM2]])

ODATA-212
: "Define request body format for Actions in Atom and JSON format specifications" [components: OData JSON Format, OData ATOM Format, OData Protocol] is **Closed** with no objections. 

####5.4.6 OData ATOM Format [coatom3]

#####5.4.6.1 [ODATA-202](https://tools.oasis-open.org/issues/browse/ODATA-202)

ODATA-202
: "Custom Mapping to Atom Elements not defined" [component: OData ATOM Format] is **Applied**. 

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[5.4][GM2]])

ODATA-202
: "Custom Mapping to Atom Elements not defined" [component: OData ATOM Format] is **Closed** with no objections. 

#####5.4.6.2 [ODATA-162](https://tools.oasis-open.org/issues/browse/ODATA-162)

ODATA-162
: "Define OASIS XML namespaces for data: and metadata: in Atom payloads" [component: OData ATOM Format] is **Applied**. 

**Note**:
> Issue state has been progressed by grouping motion (cf. section [[5.4][GM2]])

ODATA-162
: "Define OASIS XML namespaces for data: and metadata: in Atom payloads" [component: OData ATOM Format] is **Closed** with no objections. 


######5.4.6.2.1 End of Issue Processing [eoip]

Note:
>Time slot for issue processing gone. Skip all remaining agenda sub items of 5.

 
##6 Next Face to Face Meeting

###6.1 Walldorf, Germany on 2013-04-25 and 2013-04-26


Discussion:

* Ralf already booked rooms for three days of preparation and two days of meeting
* Stefan may arrive monday at noon to support the preparations
* Ralf looks forward to have an additional member to also take notes during the preparations

Short poll of participation estimates:
* 6 In person: Gerald, Hubert (as guessed by Susan), Martin, Mike, Ralf, Ram
* 3 Remotely: Nuno, Susan, Ted
* 1 Uncertain: Andrew
* 1 Not participate: Barbara
* 1 Not yet decided: Matt

##7 Next Meeting

###7.1 Next weekly TC meeting will be 2013-02-28 during 8-10am PT.

Agreed.

##8 AOB

None.
 
### Meeting adjourned on 0957 PT

# Appendices

## List of Open Action Items Before the Meeting [AI_REF]

**Retrieval time stamp**: `2013-02-21 08:35 +01:00`.

AI#0018
: "Prepare Working Draft 01 (WD01) version of OData Extension for Temporal Data" [owner: Andrew Eisenberg] is **Ongoing**

AI#0019
: "Prepare Working Draft 01 (WD01) version of OData Extension for XML Data" [owner: Andrew Eisenberg] is **Ongoing**

AI#0020
: "Prepare Working Draft 01 (WD01) version of OData Extension for JSON Data" [owner: Susan Malaika] is **Ongoing**

AI#0028
: "Introduce fix target versions 4.0, minor and next major into JIRA" [owner: Ram Jeyaraman] is **Ongoing** (Note: Due 2013-02-21)


**Note**: The actual action item processing is documented in section [4][AIH] and subsections thereof.

## Index of Issues Processed During the Meeting [IP_REF]

**Note**: The actual issue processing is documented in sections [5][IPH]. The below index has two main parts: First come the public comments (if any), second the JIRA issues. Each list of issues is sorted by ascending issue number. Noted are the ID, the summary and the reference to the relevant subsection where the issue progression has been documented:

Public Comments:

None.

JIRA Issues:

* [ODATA-76](https://tools.oasis-open.org/issues/browse/ODATA-76) "Edm.Decimal is a floating-point type" [5.1.2.7][odata-76]
* [ODATA-96](https://tools.oasis-open.org/issues/browse/ODATA-96) "Need to define semantics, serialization format, etc. for Enums" [5.4.1.1][odata-96]
* [ODATA-122](https://tools.oasis-open.org/issues/browse/ODATA-122) "Please clarify the meaning of filter functions applied to DateTimeOffset values" [5.1.3.2][odata-122]
* [ODATA-146](https://tools.oasis-open.org/issues/browse/ODATA-146) "Add example for inlining expanded entities" [5.2.1.1][odata-146]
* [ODATA-147](https://tools.oasis-open.org/issues/browse/ODATA-147) "Add example for $inlinecount representation" [5.2.1.2][odata-147]
* [ODATA-152](https://tools.oasis-open.org/issues/browse/ODATA-152) "JSON: Add examples for all request and response types using a consistent sample OData service" [5.2.2.1][odata-152]
* [ODATA-153](https://tools.oasis-open.org/issues/browse/ODATA-153) "Atom: Add examples for all request and response types using a consistent sample OData service" [5.2.1.3][odata-153]
* [ODATA-162](https://tools.oasis-open.org/issues/browse/ODATA-162) "Define OASIS XML namespaces for data: and metadata: in Atom payloads" [5.4.6.2][odata-162]
* [ODATA-178](https://tools.oasis-open.org/issues/browse/ODATA-178) "Enhance abstract, distinguish its content from 1st paragraph of introduction and edit the payload object listing in 2nd para of 1 Introduction" [5.2.1.4][odata-178]
* [ODATA-179](https://tools.oasis-open.org/issues/browse/ODATA-179) "Adapt OData inter document references to new work product structuring of core" [5.2.1.5][odata-179]
* [ODATA-202](https://tools.oasis-open.org/issues/browse/ODATA-202) "Custom Mapping to Atom Elements not defined" [5.4.6.1][odata-202]
* [ODATA-212](https://tools.oasis-open.org/issues/browse/ODATA-212) "Define request body format for Actions in Atom and JSON format specifications" [5.4.5.1][odata-212]
* [ODATA-214](https://tools.oasis-open.org/issues/browse/ODATA-214) "Find consensus on 'Additional artifacts'-section of multi component Work Products (and implement accordingly) " [5.3.1][odata-214]
* [ODATA-215](https://tools.oasis-open.org/issues/browse/ODATA-215) "Remove hour(), minute() and second() query functions and add corresponding overloads to the hours(), minutes(), and seconds() functions" [5.1.3.1][odata-215]
* [ODATA-221](https://tools.oasis-open.org/issues/browse/ODATA-221) "Flatten the message element in the JSON Error Represention (Section 4.18 Representing Errors in a Response)" [5.4.4.1][odata-221]
* [ODATA-222](https://tools.oasis-open.org/issues/browse/ODATA-222) "free-text search within a property" [5.1.6.1][odata-222]
* [ODATA-225](https://tools.oasis-open.org/issues/browse/ODATA-225) "Define Functions in Schema; reference in Container using FunctionImport." [5.4.2.1][odata-225]
* [ODATA-228](https://tools.oasis-open.org/issues/browse/ODATA-228) "Specify $search for free-text search within a OData Service and specify $search for free-text search within an entityContainer" [5.1.7.1][odata-228]
* [ODATA-230](https://tools.oasis-open.org/issues/browse/ODATA-230) "Support use of parameter aliases in $filter and $orderby" [5.4.3.1][odata-230]
* [ODATA-237](https://tools.oasis-open.org/issues/browse/ODATA-237) "Require type usage to always specify a qualified name for types other than the built-in primitive types" [5.1.2.2][odata-237]
* [ODATA-243](https://tools.oasis-open.org/issues/browse/ODATA-243) "Add client preferences for server-driven paging" [5.1.1.4][odata-243]
* [ODATA-247](https://tools.oasis-open.org/issues/browse/ODATA-247) "More clearly define extensibility of Formats" [5.1.1.2][odata-247]
* [ODATA-249](https://tools.oasis-open.org/issues/browse/ODATA-249) "'Kind' property should be optional for EntitySets in JSON Service Documents" [5.1.4.2][odata-249]
* [ODATA-250](https://tools.oasis-open.org/issues/browse/ODATA-250) "For instance annotations in Atom, 'Annotation' element, 'Type', 'Term' and 'Target' attributes should be lower case" [5.1.5.1][odata-250]
* [ODATA-251](https://tools.oasis-open.org/issues/browse/ODATA-251) "Clarify, within [ATOM], that complex types can be annotated" [5.1.5.2][odata-251]
* [ODATA-252](https://tools.oasis-open.org/issues/browse/ODATA-252) "Clarify ordering of instance annotations in [ATOM] and [JSON]" [5.1.5.3][odata-252]
* [ODATA-253](https://tools.oasis-open.org/issues/browse/ODATA-253) "Clients should be prepared to handle unadvertised properties" [5.1.1.1][odata-253]
* [ODATA-254](https://tools.oasis-open.org/issues/browse/ODATA-254) "Selection of individual properties in [ATOM] should not include property name" [5.1.5.4][odata-254]
* [ODATA-255](https://tools.oasis-open.org/issues/browse/ODATA-255) "Consider adding support for requesting flattened results" [5.1.1.3][odata-255]
* [ODATA-258](https://tools.oasis-open.org/issues/browse/ODATA-258) "Advertise function imports in service document" [5.1.2.6][odata-258]
* [ODATA-259](https://tools.oasis-open.org/issues/browse/ODATA-259) "Add Annotation Groups to JSON format" [5.1.4.1][odata-259]
* [ODATA-261](https://tools.oasis-open.org/issues/browse/ODATA-261) "Improve section 10.2.3.8 The $format System Query Option" [5.1.1.5][odata-261]
* [ODATA-268](https://tools.oasis-open.org/issues/browse/ODATA-268) "Use http://docs.oasis-open.org/odata/ns/edm/4.0 as the EDM namespace URL" [5.1.2.4][odata-268]
* [ODATA-269](https://tools.oasis-open.org/issues/browse/ODATA-269) "Separate Functions and Actions" [5.1.2.1][odata-269]
* [ODATA-272](https://tools.oasis-open.org/issues/browse/ODATA-272) "FixedLength facet is Boolean" [5.1.2.5][odata-272]
* [ODATA-273](https://tools.oasis-open.org/issues/browse/ODATA-273) "Clarify whether derived types MUST introduce new properties" [5.1.2.3][odata-273]

## Timeline Reference [TL_REF]
  
**Note**: Please cf. the current revision of the [TC timeline](https://www.oasis-open.org/committees/download.php/48148/TC%20Timeline%203.htm).
