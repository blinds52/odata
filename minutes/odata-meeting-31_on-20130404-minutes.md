#OData meeting #31, Thursday, 04 Apr 2013, 0800 - 1000 PT

**Note**: For explanations of conventions and other formal aspects common to OData TC meeting minutes which are used in this document please cf. "[Formal Aspects of Meeting Minutes](https://www.oasis-open.org/committees/download.php/48109/formal-aspects-meeting-minutes-v1.html)".

Meeting chaired by Ram Jeyaraman

## 1 Roll call

### 1.1 Members Present:

        Dale Moberg (Axway Software)        Diane Downie (Citrix Systems)        Erik de Voogd (SDL)        Hubert Heijkers (IBM)        Jeffrey Turpin (Axway Software)        John Willson (Individual)        Ken Baclawski (Northeastern University)        Martin Zurmuehl (SAP AG)        Matthew Borges (SAP AG)        Michael Pizzo (Microsoft) a.k.a. Mike        Ralf Handl (SAP AG)        Ram Jeyaraman (Microsoft)        Ramanjaneyulu Malisetti (CA Technologies)        Robert Richards (Mashery)        Stan Mitranic (CA Technologies)        Stefan Drees (Individual)        Susan Malaika (IBM)        Ted Jones (Red Hat)

Quorum achieved. Details cf. [normative attendance sheet for this meeting](https://www.oasis-open.org/apps/org/workgroup/odata/event.php?event_id=34191).

## 2 Approval of Agenda

Agenda approved as published.

## 3 Approval of Minutes from Previous Meeting(s)

### 3.1 Approval of [Minutes of 2013-03-21 Meeting#30](https://www.oasis-open.org/committees/download.php/48728/odata-meeting-30_on-20130321-minutes.html)

**Meeting minutes approved with no objections**.

##4 Review of [Action Items](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_items.php) (AI) and Progress [AIH]

Context:
> See the "[List of Open Action Items Before the Meeting][AI_REF]" section in the appendix.

###4.1 Action items due by 2013-04-04 (end of day)

None.

###4.2 Action items NOT due by 2013-04-04 (end of day) but MAY be ready for closure

None.

##5 Review progress and next steps towards public review [RPH]

###5.1 Progress related to Timeline and 3 Week Plan

Let's review where we are (in terms of progress against timeline) and discuss/determine what we need to do in the next 3 weeks leading up to the public review starting on May 1st. See [timeline][TL_REF] for reference.

Discussion:

* All agree that public review is important feedback that should be enabled by cleaning up our documents the following three weeks through holistic concentrated reviews and feedback and then start public review phase as planned around start of May.
* Mike suggests, that each week a round of weekly to be reviewed documents will be uploaded on a new skydrive, so that all have access to comment. Start will be by end of tomorrow (PT).
* The character of these intermediate editable documents on the shared drive is similar to a shared scratch pad. The initial uploaded revision and the resulting one of each work product are to be stored accessible as usual on OASIS systems through the means of SVN and/or Kavi as applicable to the document formats. The shared medium access mediates otherwise conflicting writes.

##6 Review of [Issues List](https://tools.oasis-open.org/issues/secure/IssueNavigator.jspa?reset=true&mode=hide&pid=10103&sorter/field=issuekey&sorter/order=ASC) (IL) and Progress [IPH]

**Notes**:

* Issues in this section (6) may have been progressed out of sequence, but have been noted here to better group by components impacted as a service for the reader.
* There is an "[Index of Issues Processed During the Meeting][IP_REF]" section in the appendix.

###6.1 Issues in Proposed state (carried over from March 14, 2013)

####6.1.1 OData CSDL [cocsdl_1]

#####6.1.1.1 [ODATA-271](https://tools.oasis-open.org/issues/browse/ODATA-271)

ODATA-271:
: "Support IsAlwaysBindable through annotation, rather than attribute of function/action" [component: OData CSDL] is **Open**.

Discussion:

* Mike updated proposal to "Remove the IsAlwaysBindable attribute. Do not add annotation. JSON may always omit bindable functions and actions for odata.metadata=minimal/none unless explicitly requested in Select."

Mike: 
>I **move** to resolve ODATA-271 as proposed.. **Hubert seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-271:
: "Support IsAlwaysBindable through annotation, rather than attribute of function/action" [component: OData CSDL] is **Resolved** with no objections.

###6.2 Issues in Proposed state (since March 21, 2013 TC meeting)

####6.2.1 OData ABNF Construction Rules, OData Protocol, OData URL Conventions [coabnf_prot_urlc_1]

#####6.2.1.1 [ODATA-263](https://tools.oasis-open.org/issues/browse/ODATA-263)

ODATA-263:
: Define whether $select=* returns only data properties or also navigation properties" [components: OData Protocol, OData ABNF Construction Rules, OData URL Conventions] is **Open**.

Mike: 
>I **move** to accept ODATA-263 as proposed. **Ralf seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-263:
: Define whether $select=* returns only data properties or also navigation properties" [components: OData Protocol, OData ABNF Construction Rules, OData URL Conventions] is **Resolved** with no objections.

####6.2.2 OData ATOM Format, OData CSDL, OData JSON Format, OData Protocol [coatom_csdl_json_prot_1]

#####6.2.2.1 [ODATA-315](https://tools.oasis-open.org/issues/browse/ODATA-315)

ODATA-315:
: "Entities that may be queryable can be omitted from service document, but then their 'url' cannot be specified." [components: OData CSDL, OData ATOM Format, OData Protocol, OData JSON Format] is **New**.

Discussion:

* Ralf changed proposal to "JSON: add "title" name-value pair, optional, may contain "atom:title" if different from entity set name. ATOM: add metadata:name attribute for correlation with $metadata: app:collection, metadata:function-import and metadata:entity. metadata:name optional if identical with title". Will be updated in JIRA accordingly.


Martin: 
>I **move** to accept ODATA-315 as proposed including the mentioned additions. **Ralf seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-315:
: "Entities that may be queryable can be omitted from service document, but then their 'url' cannot be specified." [components: OData CSDL, OData ATOM Format, OData Protocol, OData JSON Format] is **Resolved as noted in the motion** with no objections.

####6.2.3 OData ATOM Format, OData JSON Format [coatom_json_1]

#####6.2.3.1 [ODATA-319](https://tools.oasis-open.org/issues/browse/ODATA-319)

ODATA-319:
: "Allow services to include metadata links and metadata ETags into responses" [components: OData JSON Format, OData ATOM Format] is **New**.

Ralf: 
>I **move** to resolve ODATA-319 as proposed with the addition that ATOM uses the same format for $metadata fragment as JSON. **Martin seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-319:
: "Allow services to include metadata links and metadata ETags into responses" [components: OData JSON Format, OData ATOM Format] is **Resolved as noted in the motion** with no objections.

####6.2.4 OData Batch Processing Format [cobatc_1]

#####6.2.4.1 [ODATA-317](https://tools.oasis-open.org/issues/browse/ODATA-317)

ODATA-317:
: "Allow multiple reads in the same transaction" [component: OData Batch Processing Format] is **New**.

**No further discussion**. **No objections**. 

ODATA-317:
: "Allow multiple reads in the same transaction" [component: OData Batch Processing Format] is **Open** with no objections.

####6.2.5 OData Protocol, OData URL Conventions [coprot_urlc_1]

#####6.2.5.1 [ODATA-314](https://tools.oasis-open.org/issues/browse/ODATA-314)

ODATA-314:
: "CLONE - Please clarify the meaning of filter functions applied to DateTimeOffset values" [components: OData URL Conventions, OData Protocol] is **New**.

Discussion:

* Mike changes proposal to "Services that don't persist offset values must normalize literals expressed in $filter according to the same rules used when persisting values."
* All decide to think more about this issue.

**No further discussion**. **No objections**.

ODATA-314:
: "CLONE - Please clarify the meaning of filter functions applied to DateTimeOffset values" [components: OData URL Conventions, OData Protocol] is **Open** with no objections.

####6.2.6 OData CSDL [cocsdl_2]

#####6.2.6.1 [ODATA-318](https://tools.oasis-open.org/issues/browse/ODATA-318)

ODATA-318:
: "Explicitly state which calendar Date and DateTimeOffset use" [component: OData CSDL] is **New**.

Ralf: 
>I **move** to resolve ODATA-318 as proposed. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-318:
: "Explicitly state which calendar Date and DateTimeOffset use" [component: OData CSDL] is **Resolved** with no objections.

#####6.2.6.2 [ODATA-312](https://tools.oasis-open.org/issues/browse/ODATA-312)

ODATA-312:
: "ATOM and JSON formats for Service Document appear to omit information for action imports" [component: OData CSDL] is **New**.

Stefan: 
>I **move** we resolve ODATA-312 as proposed, to spell out that actions are not advertised in service document because they are not things that a hypermedia-driven client would explore with GET. **Ralf seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-312:
: "ATOM and JSON formats for Service Document appear to omit information for action imports" [component: OData CSDL] is **Resolved as noted in the motion** with no objections.

#####6.2.6.3 [ODATA-320](https://tools.oasis-open.org/issues/browse/ODATA-320)

ODATA-320:
: "Should use '/@' to reference applied annotations" [component: OData CSDL] is **New**.

Discussion:

* Ralf explains his comment on the issue.
* All agree to further explore the issue offline.

**No further discussion**. **No objections**. 

ODATA-320:
: "Should use '/@' to reference applied annotations" [component: OData CSDL] is **Open** with no objections.

####6.2.7 OData JSON Format [cojson_1]

#####6.2.7.1 [ODATA-308](https://tools.oasis-open.org/issues/browse/ODATA-308)

ODATA-308:
: "Clarify whether format parameters odata.metadata and odata.streaming may be ignored by services" [component: OData JSON Format] is **New**.

Discussion:

* Mike suggests rewording of the proposal as "Format parameters are required to be satisfied. service returns 406 if not satisfied. Note that services may always return more metadata than specified, not less."

Mike: 
>I **move** we resolve ODATA-308 as follows: format parameters are required to be satisfied. service returns 406 if not satisfied. Note that services may always return more metadata than specified, not less. **Hubert seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-308:
: "Clarify whether format parameters odata.metadata and odata.streaming may be ignored by services" [component: OData JSON Format] is **Resolved as noted in the motion** with no objections.

#####6.2.7.2 [ODATA-316](https://tools.oasis-open.org/issues/browse/ODATA-316)

ODATA-316:
: "Allow omitting properties with null or default values from responses" [component: OData JSON Format] is **New**.

Discussion:

* Mike and Ralf suggest opening the issue, but work offline on it and jump to next issue during the meeting.


ODATA-316:
: "Allow omitting properties with null or default values from responses" [component: OData JSON Format] is **Open** with no objections.

#####6.2.7.3 [ODATA-307](https://tools.oasis-open.org/issues/browse/ODATA-307)

ODATA-307:
: "Return odata.etag in collections also for odata=minimalmetadata" [component: OData JSON Format] is **New**.

Mike: 
>I **move** we accept ODATA-307 as proposed. **Hubert seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-307:
: "Return odata.etag in collections also for odata=minimalmetadata" [component: OData JSON Format] is **Resolved** with no objections.

####6.2.8 OData Protocol, OData URL Conventions [coprot_urlc_2]

#####6.2.8.1 [ODATA-313](https://tools.oasis-open.org/issues/browse/ODATA-313)

ODATA-313:
: "Problem with 'Function Overload Resolution' due to null values having ambiguous type" [components: OData URL Conventions, OData Protocol] is **New**.

Mike: 
>I **move** we accept ODATA-313 as proposed, with the additional restriction on overloads within the type families. **Martin seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-313:
: "Problem with 'Function Overload Resolution' due to null values having ambiguous type" [components: OData URL Conventions, OData Protocol] is **Resolved as noted in the motion** with no objections.

####6.2.9 OData Protocol [coprot_1]

#####6.2.9.1 [ODATA-306](https://tools.oasis-open.org/issues/browse/ODATA-306)

ODATA-306:
: "Batch Request processing: Define server behavior, if one or more request(s) didn't succeed" [component: OData Protocol] is **New**.

Mike: 
>I **move** we accept ODATA-306 as proposed, calling the preference odata.continue-on-failure. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-306:
: "Batch Request processing: Define server behavior, if one or more request(s) didn't succeed" [component: OData Protocol] is **Resolved as noted in the motion** with no objections.

#####6.2.9.2 [ODATA-298](https://tools.oasis-open.org/issues/browse/ODATA-298)

ODATA-298:
: "Clarify Requesting Changes to entity sets that include Stream properties" [component: OData Protocol] is **New**.

Discussion:

* Mike suggests to open but come back next time.

**No further discussion**. **No objections**. 

ODATA-298:
: "Clarify Requesting Changes to entity sets that include Stream properties" [component: OData Protocol] is **Open** with no objections.

#####6.2.9.3 [ODATA-321](https://tools.oasis-open.org/issues/browse/ODATA-321)

ODATA-321:
: "Use consistent naming for headers" [component: OData Protocol] is **New**.

Stefan: 
>I **move** to resolve ODATA-321 as proposed. **Martin seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-321:
: "Use consistent naming for headers" [component: OData Protocol] is **Resolved** with no objections.

#####6.2.9.4 [ODATA-326](https://tools.oasis-open.org/issues/browse/ODATA-326)

ODATA-326:
: "include-annotations should allow inclusion (or exclusion) of specific terms" [component: OData Protocol] is **New**.

Discussion:

* All agree to open it and further detail the proposal and terms.

**No further discussion**. **No objections**. 

ODATA-326:
: "include-annotations should allow inclusion (or exclusion) of specific terms" [component: OData Protocol] is **Open** with no objections.

####6.2.10 OData ATOM Format, OData JSON Format, OData Protocol [coatom_json_prot_1]

#####6.2.10.1 [ODATA-325](https://tools.oasis-open.org/issues/browse/ODATA-325)

ODATA-325:
: "Clarify what aliases can be used in instance annotations" [components: OData JSON Format, OData ATOM Format, OData Protocol] is **New**.

Discussion:

* Mike shortly summarizes the issue and suggestst to open it.

Ralf: 
>I **move** to resolve ODATA-325 as proposed. **Martin seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-325:
: "Clarify what aliases can be used in instance annotations" [components: OData JSON Format, OData ATOM Format, OData Protocol] is **Resolved** with no objections.

######6.2.10.1.1 End of Issue Processing [eoip]

Note:
>Time slot for issue processing gone. Skip all remaining agenda sub items of 6.

##7 Next Meetings

###7.1 Next TC meeting will be 2013-04-11 during 8-10am PT.

Agreed.

##8 AOB

None.

### Meeting adjourned on 1001 PT

# Appendices

## List of Open Action Items Before the Meeting [AI_REF]

**Retrieval time stamp**: `2013-04-04 15:55 +01:00`.

AI#0018
: "Prepare Working Draft 01 (WD01) version of OData Extension for Temporal Data" [owner: Andrew Eisenberg] is **Ongoing**

AI#0019
: "Prepare Working Draft 01 (WD01) version of OData Extension for XML Data" [owner: Andrew Eisenberg] is **Ongoing**

AI#0020
: "Prepare Working Draft 01 (WD01) version of OData Extension for JSON Data" [owner: Susan Malaika] is **Ongoing**


**Note**: The actual action item processing is documented in section [4][AIH] and subsections thereof.

## Index of Issues Processed During the Meeting [IP_REF]

**Note**: The actual issue processing is documented in sections [6][IPH]. The below index has two main parts: First come the public comments (if any), second the JIRA issues. Each list of issues is sorted by ascending issue number. Noted are the ID, the summary and the reference to the relevant subsection where the issue progression has been documented:

Public Comments:

None.

JIRA Issues:

* [ODATA-263](https://tools.oasis-open.org/issues/browse/ODATA-263) "Define whether $select=* returns only data properties or also navigation properties" [6.2.1.1][odata-263]
* [ODATA-271](https://tools.oasis-open.org/issues/browse/ODATA-271) "Support IsAlwaysBindable through annotation, rather than attribute of function/action" [6.1.1.1][odata-271]
* [ODATA-298](https://tools.oasis-open.org/issues/browse/ODATA-298) "Clarify Requesting Changes to entity sets that include Stream properties" [6.2.9.2][odata-298]
* [ODATA-306](https://tools.oasis-open.org/issues/browse/ODATA-306) "Batch Request processing: Define server behavior, if one or more request(s) didn't succeed" [6.2.9.1][odata-306]
* [ODATA-307](https://tools.oasis-open.org/issues/browse/ODATA-307) "Return odata.etag in collections also for odata=minimalmetadata" [6.2.7.3][odata-307]
* [ODATA-308](https://tools.oasis-open.org/issues/browse/ODATA-308) "Clarify whether format parameters odata.metadata and odata.streaming may be ignored by services" [6.2.7.1][odata-308]
* [ODATA-312](https://tools.oasis-open.org/issues/browse/ODATA-312) "ATOM and JSON formats for Service Document appear to omit information for action imports" [6.2.6.2][odata-312]
* [ODATA-313](https://tools.oasis-open.org/issues/browse/ODATA-313) "Problem with 'Function Overload Resolution' due to null values having ambiguous type" [6.2.8.1][odata-313]
* [ODATA-314](https://tools.oasis-open.org/issues/browse/ODATA-314) "CLONE - Please clarify the meaning of filter functions applied to DateTimeOffset values" [6.2.5.1][odata-314]
* [ODATA-315](https://tools.oasis-open.org/issues/browse/ODATA-315) "Entities that may be queryable can be omitted from service document, but then their 'url' cannot be specified." [6.2.2.1][odata-315]
* [ODATA-316](https://tools.oasis-open.org/issues/browse/ODATA-316) "Allow omitting properties with null or default values from responses" [6.2.7.2][odata-316]
* [ODATA-317](https://tools.oasis-open.org/issues/browse/ODATA-317) "Allow multiple reads in the same transaction" [6.2.4.1][odata-317]
* [ODATA-318](https://tools.oasis-open.org/issues/browse/ODATA-318) "Explicitly state which calendar Date and DateTimeOffset use" [6.2.6.1][odata-318]
* [ODATA-319](https://tools.oasis-open.org/issues/browse/ODATA-319) "Allow services to include metadata links and metadata ETags into responses" [6.2.3.1][odata-319]
* [ODATA-320](https://tools.oasis-open.org/issues/browse/ODATA-320) "Should use '/@' to reference applied annotations" [6.2.6.3][odata-320]
* [ODATA-321](https://tools.oasis-open.org/issues/browse/ODATA-321) "Use consistent naming for headers" [6.2.9.3][odata-321]
* [ODATA-325](https://tools.oasis-open.org/issues/browse/ODATA-325) "Clarify what aliases can be used in instance annotations" [6.2.10.1][odata-325]
* [ODATA-326](https://tools.oasis-open.org/issues/browse/ODATA-326) "include-annotations should allow inclusion (or exclusion) of specific terms" [6.2.9.4][odata-326]

## Timeline Reference [TL_REF]

**Note**: Please cf. the current revision of the [TC timeline](https://www.oasis-open.org/committees/download.php/48609/TC%20Timeline%204.htm).
