#OData meeting #47, Monday, 01 Aug 2013, 0800 - 0900 PT

**Note**: For explanations of conventions and other formal aspects common to OData TC meeting minutes which are used in this document please cf. "[Formal Aspects of Meeting Minutes](https://www.oasis-open.org/committees/download.php/48109/formal-aspects-meeting-minutes-v1.html)".

Meeting chaired by Barbara Hartel

## 1 Roll call

### 1.1 Members Present:

        Barbara Hartel (SAP AG)
        Dale Moberg (Axway Software)
        Diane Downie (Citrix Systems)
        Gerald Krause (SAP AG)
        Hubert Heijkers (IBM)
        John Willson (Individual)
        Ken Baclawski (Northeastern University)
        Martin Zurmuehl (SAP AG)
        Michael Pizzo (Microsoft) a.k.a. Mike
        Nuno Linhares (SDL)
        Patrick Durusau (Individual)
        Ralf Handl (SAP AG)
        Stan Mitranic (CA Technologies)
        Stefan Drees (Individual)
        Susan Malaika (IBM)

Quorum achieved. Details cf. [normative attendance sheet for this meeting](https://www.oasis-open.org/apps/org/workgroup/odata/event.php?event_id=34208).

## 2 Approval of Agenda

Approved.

## 3 Approval of Minutes from Previous Meeting(s)

### 3.1 Approval of [Minutes of 2013-07-25 Meeting#46](https://www.oasis-open.org/committees/download.php/50091/odata-meeting-46_on-20130725-minutes.html)

**Meeting minutes approved with no objections**.

## 4 Review of [Action Items](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_items.php) (AI) and Progress [AIH]

Context:
> See the "[List of Open Action Items Before the Meeting][AI_REF]" section in the appendix.

###4.1 Action items due by 2013-07-31 (end of day)

####4.1.1 [AI#0018](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_item.php?action_item_id=3483)

AI#0018
: "Prepare Working Draft 01 (WD01) version of OData Extension for Temporal Data" [owner: Hubert Heijkers] is **Ongoing** (Note: Due 2013-07-31)

Discussion:

* Ralf is working on it and preparing a document from the notes of the latest discussions and requests to shift to 5th of September
* Stefan did not really advance AI0019 as planned and requests postponing also to 5th of September
* Susan also requests postponing AI0020 to 5th of September to ensure this is aligned with the one from Stefan
* All agree to postpone

AI#0018
: "Prepare Working Draft 01 (WD01) version of OData Extension for Temporal Data" [owner: Hubert Heijkers] is **Ongoing** (Note: Due 2013-09-05)

####4.1.2 [AI#0019](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_item.php?action_item_id=3484)

AI#0019
: "Prepare Working Draft 01 (WD01) version of OData Extension for XML Data" [owner: Stefan Drees] is **Ongoing** (Note: Due 2013-09-05)

Note:
> Set as due date for AI#0018 the end of July as with AI0019 and AI0020. For details cf. [4.1.1][ai0018] where the discussion is documented.

AI#0019
: "Prepare Working Draft 01 (WD01) version of OData Extension for XML Data" [owner: Stefan Drees] is **Ongoing** (Note: Due 2013-09-05)

####4.1.3 [AI#0020](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_item.php?action_item_id=3485)

AI#0020
: "Prepare Working Draft 01 (WD01) version of OData Extension for JSON Data" [owner: Susan Malaika] is **Ongoing**

Note:
> Set as due date for AI#0018 the end of July as with AI0019 and AI0020. For details cf. [4.1.1][ai0018] where the discussion is documented.

AI#0020
: "Prepare Working Draft 01 (WD01) version of OData Extension for JSON Data" [owner: Susan Malaika] is **Ongoing** (Note: Due 2013-09-05)


###4.2 Action items NOT due by 2013-07-31 (end of day) but MAY be ready for closure

None.


##5 Review of [Issues List](https://tools.oasis-open.org/issues/secure/IssueNavigator.jspa?reset=true&mode=hide&pid=10103&sorter/field=issuekey&sorter/order=ASC) (IL) and Progress [IPH]

**Notes**:

* Issues in this section (5) may have been progressed out of sequence, but have been noted here to better group by components impacted or state before the meeting and as a service for the reader.
* There is an "[Index of Issues Processed During the Meeting][IP_REF]" section in the appendix.

###5.1 [ODATA-466](https://tools.oasis-open.org/issues/browse/ODATA-466)

ODATA-466:
: "Please clarify whether Edm.Binary is really intended to be base16-encoded in accordance with ABNF, or if it should be base64-encoded as with OData V3" [components: OData ATOM Format, OData ABNF Construction Rules, OData JSON Format] is **New**.

Discussion:

* Mike summarizes the issue
* Hubert states, that the size of messages may grow
* Mike estimates, that this will be a rarely realized use case, where the messages might grow unreasonably large

Hubert:
>I **move** to close ODATA-466 with no further action. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-466:
: "Please clarify whether Edm.Binary is really intended to be base16-encoded in accordance with ABNF, or if it should be base64-encoded as with OData V3" [components: OData ATOM Format, OData ABNF Construction Rules, OData JSON Format] is **Closed** with no objections.

##6 Review of Non-Material Changes to CSPRD02 [https://www.oasis-open.org/apps/org/workgroup/odata/download.php/50120/latest]

###6.1 Accept all changes as non-material

Stefan:
>I **move** we confirm that all changes to the CSD02 version of OASIS Open Data Protocol (OData) version 4.0 multi-part Work Product WD03 including associated files contained in [https://www.oasis-open.org/committees/download.php/50144/odata-v4.0-wd03-final-2013-08-01b.zip](https://www.oasis-open.org/committees/download.php/50144/odata-v4.0-wd03-final-2013-08-01b.zip), OASIS OData Atom Format version 4.0 Work Product  WD03 including associated files contained in [https://www.oasis-open.org/committees/download.php/50121/odata-atom-format-v4.0-wd03-final-2013-07-30.zip](https://www.oasis-open.org/committees/download.php/50121/odata-atom-format-v4.0-wd03-final-2013-07-30.zip), and OASIS OData JSON Format version 4.0 Work Product WD03 including associated files contained in [https://www.oasis-open.org/committees/download.php/50122/odata-json-format-v4.0-wd03-final-2013-07-30.zip](https://www.oasis-open.org/committees/download.php/50122/odata-json-format-v4.0-wd03-final-2013-07-30.zip) including associated files as described in [CSD02 Summary of Non-Material Changes](https://www.oasis-open.org/committees/download.php/50120/CSD02%20Summary%20of%20Non-Material%20Changes%202013-07-30.docx) are all Non-Material. **Hubert seconds**.

**No further discussion**. **No objections**. The **motion passes**.


##7 Decide on to advance the OData Committee Specification Drafts for Core, Atom and JSON to Committee Specifications. Request a Special Majority Vote to approve a Committee Specification

###7.1 OASIS Open Data Protocol (OData) version 4.0 multi-part Work Product WD03

Hubert:
>I **move** to approve the Chair requesting that TC Administration hold a Special Majority Vote to approve  the OASIS Open Data Protocol (OData) version 4.0 multi-part Work Product WD03 including associated files contained in [https://www.oasis-open.org/committees/download.php/50144/odata-v4.0-wd03-final-2013-08-01b.zip](https://www.oasis-open.org/committees/download.php/50144/odata-v4.0-wd03-final-2013-08-01b.zip)  as a Committee Specification. I further move that the TC affirm that changes have been made since the last public review, that the changes made are documented in [CSD02 Summary of Non-Material Changes](https://www.oasis-open.org/committees/download.php/50120/CSD02%20Summary%20of%20Non-Material%20Changes%202013-07-30.docx) and that the TC judges these changes to be Non-Material in accordance with the definition in the OASIS TC Process (http://www.oasis-open.org/policies-guidelines/tc-process#dNonmaterialChange). **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

###7.2 OASIS OData Atom Format version 4.0 Work Product  WD03

Martin:
>I **move** to approve the Chair requesting that TC Administration hold a Special Majority Vote to approve  the OASIS OData Atom Format version 4.0 Work Product  WD03 including associated files contained in [https://www.oasis-open.org/committees/download.php/50121/odata-atom-format-v4.0-wd03-final-2013-07-30.zip](https://www.oasis-open.org/committees/download.php/50121/odata-atom-format-v4.0-wd03-final-2013-07-30.zip)  as a Committee Specification. I further move that the TC affirm that changes have been made since the last public review, that the changes made are documented in [CSD02 Summary of Non-Material Changes](https://www.oasis-open.org/committees/download.php/50120/CSD02%20Summary%20of%20Non-Material%20Changes%202013-07-30.docx) and that the TC judges these changes to be Non-Material in accordance with the definition in the OASIS TC Process (http://www.oasis-open.org/policies-guidelines/tc-process#dNonmaterialChange). **Hubert seconds**

**No further discussion**. **No objections**. The **motion passes**.

###7.3 OASIS OData JSON Format version 4.0  Work Product  WD03

Ralf:
> I **move** to approve the Chair requesting that TC Administration hold a Special Majority Vote to approve  the OASIS OData JSON Format version 4.0  Work Product  WD03 including associated files contained in [https://www.oasis-open.org/committees/download.php/50122/odata-json-format-v4.0-wd03-final-2013-07-30.zip](https://www.oasis-open.org/committees/download.php/50122/odata-json-format-v4.0-wd03-final-2013-07-30.zip)  as a Committee Specification. I further move that the TC affirm that changes have been made since the last public review, that the changes made are documented in [CSD02 Summary of Non-Material Changes](https://www.oasis-open.org/committees/download.php/50120/CSD02%20Summary%20of%20Non-Material%20Changes%202013-07-30.docx) and that the TC judges these changes to be Non-Material in accordance with the definition in the OASIS TC Process (http://www.oasis-open.org/policies-guidelines/tc-process#dNonmaterialChange). **Mike seconds**

**No further discussion**. **No objections**. The **motion passes**.


## 8 Next Meetings

### 8.1 Meeting on 2013-08-08 by Call during 0800-0900 PT

Agreed.

## 9 AOB

None.

Meeting adjourned on 0832 PT

## List of Open Action Items Before the Meeting [AI_REF]

**Retrieval time stamp**: `2013-08-01 14:14 +02:00`.

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

None.

JIRA Issues:

* [ODATA-466](https://tools.oasis-open.org/issues/browse/ODATA-466) "Please clarify whether Edm.Binary is really intended to be base16-encoded in accordance with ABNF, or if it should be base64-encoded as with OData V3" [5.1][odata-466]

## Timeline Reference [TL_REF]

**Note**: Please cf. the current revision of the [TC timeline](https://www.oasis-open.org/committees/download.php/49178/TC%20Timeline%205.htm).


