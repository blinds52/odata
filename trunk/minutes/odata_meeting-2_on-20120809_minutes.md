Title:	Meeting minutes of OASIS OData TC's Conference Call #2
Date:	Thursday, 09 Aug 2012, 0800 - 0900 PT    
Author:	Stefan Drees <stefan@drees.name>  

# OData Conference Call #2, Thursday,  09 Aug 2012,  0800 - 0900 PT 


## 1. Roll call
 
### 1.1 Members Present:
 
        Andrew Eisenberg (IBM)        Anil Kumar (CA Technologies)        Dale Moberg (Axway Software)        Diane Jordan (IBM)        Farrukh Najmi (Wellfleet Software Corporation)        Giovanni Bartolomeo (Individual)        John Willson (Individual)        Ken Baclawski (Northeastern University)        Mark Biamonte (Progress Software)        Matthew Borges (SAP AG)        Michael Pizzo (Microsoft)        Pablo Castro (Microsoft)        Ralf Handl (SAP AG)        Ram Jeyaraman (Microsoft)        Robert Richards (Mashery)        Stan Mitranic (CA Technologies)        Stefan Drees (Individual)        Susan Malaika (IBM)


### 1.2 On Leave of Absense:
        Barbara Hartel (SAP AG)        Colleen Evans (Microsoft)        Hubert Heijkers (IBM)        Martin Zurmuehl (SAP AG)        Sanjay Patil (SAP AG)

Quorum achieved. Details cf. [normative attendance sheet for this meeting](https://www.oasis-open.org/apps/org/workgroup/odata/event.php?event_id=33447).


## 2. Approval of Agenda

Agenda approved as published.


## 3. Approval of Minutes from Previous Meeting(s)

### 3.1 Approval of [Minutes from July 26-27, 2012 F2F Meeting](https://www.oasis-open.org/apps/org/workgroup/odata/download.php/46644/Minutes%20of%20TC%20F2F20meeting%20July%2026-27%2C%202012.htm):

Meeting minutes approved with no objections.


## 4. Review of [Action Items](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_items.php) (AI) and Progress

AI#0000
: "Provide OASIS spec templates to editors" is **Closed** as __completed__ with no objections

AI#0001
: "Ensure that Jira is set up" **Closed** as __completed__ with no objections

AI#0002
: "Start electronic ballot to find out which dates work best for next f2f" the proposed weeks are CW42 Oct 15-19 and CW45 Nov 5-9. Status: **Ongoing**.

AI#0003
: "Come up with examples / usecases (and proposals) for open types and document annotation for JSON extensions document" is **Ongoing**

AI#0004
: "Come up with estimate for first milestone for data aggregation extension" will post in next week (**Ongoing**)

AI#0005
: "Come up with a first milestine for the temporal extension" is **Ongoing**

AI#0006
: "Come up with estimate for first milestone for XML data extension" is **Ongoing**

AI#0007
: "Come up with estimate for first milestone for JSON data extension" is **Ongoing**

AI#0008
: "Recording of TC meetings" is **Ongoing**

AI#0009
: "Best practices document for issue handling" is **Ongoing** (since only entered yesterday).


## 5. [Press Release](https://www.oasis-open.org/apps/org/workgroup/odata/email/archives/201208/msg00024.html) (PR) to announce OASIS OData TC

### 5.1. Note: 

Last date for providing quotes (by Sponsor-level members) is Aug 17.

###5.2. Any questions?

None. Next week this item will be revisited.


## 6. Specification editing questions

###6.1. What must working draft 01 contain?

Ram considers Working Draft 01 (WD01) as starting point. **No further questions** on this.

Of the 11 documents planned, only one (OData JSON Format) is already created as WD01 in Kavi.

Michael: 
>**Motion**: I propose action items be created for each of the documents, assigned to the editors, for creating initial working drafts. **Ralf seconds**.

**No discussion** of this motion requested. **No objections**. The **motion passes**.

Ram volunteers to create an action for each of the outstanding documents.

Andrew  suggests, to expect not the same from the extension docs in their first drafts (WD01), since these upto now only exist as white papers

###6.2. When do we upgrade working draft numbers?

Ram explains that the step, when the editors should increment a WD number, should be expertly decidable by the editors.

Discussion about handling of WD-numbers and document revisions in the interplay of Kavi and JIRA.

Ralf adds, that each WD-increment adds extra work for the editors (revision history etc.)

Ralf: 
>I **move** to use sub-increments of the official WD-numbers for interim versions. I suggest to suffix the WD with the publishing date, e.g. WD01-2012-08-09. **Michael seconds**.

Discussion of motion:

* Ram asks, if Ralf expects that issues may be filed against WD01-2012-08-09 ? What Ralf confirms and illustrates: Add Kavi links to Jira, eg. [WD01-2012-08-08](https://www.oasis-open.org/apps/org/workgroup/odata/download.php/46641/odata-json-format-v1.0-wd01-2012-08-08-RHA.doc).
* Ram further asks, that it is meant to file the issue against eg. WD01 (plain!) and only inside the ticket produce a precise link to the fully specified revision of the document. What Ralf again confirms.
* Farrukh does not think it will be good to manage sub-version in JIRA It will become very unwieldy. He votes for only keeing WD0<N> in JIRA

**No further discussion**. **No objections**. The **motion passes**.

No remaining questions in this topic.

###6.3. Any support structures editors needs for collaborative editing of in-flight documents between working drafts?

Ram asks if anything else needed and informs that the chairs will continue to support in that regard.

Farrukh: 
> Change tracking is something I have a proposal on: Use source control not Kavi for versioning. Farrukh will send the proposal for source control system usage in alignment with oasis policies via email to the TC mailing list.
[*Update*: Announced [Message](https://www.oasis-open.org/apps/org/workgroup/odata/email/archives/201208/msg00083.html) has been sent.]

Michael: 
>**Motion**: Changes are tracked using each full working draft as a base. Each working full draft has changes from previous accepted. **Stefan seconds**.

Ralf: 
>**Amend**: WD(n+1) contains change tracking wrt WD(n), then accept all changes when starting on intermediate WD(n+1)-01.  **Michael seconds this as a friendly amendment**.

**No discussion**. **No objections**. The **amendment passes**.

Michael asks, if a naming format/convention is wanted to distinguish between a document with changes from previous WD and a revision with only changes from the same WD

Michael: 
>I propose that each Working Draft (WD01, WD02, etc.) have no change tracking. Each interim document contains change tracking from the previous base, and that the last interim document contain all changes reflected in the next WD, such that the only difference between a WD(n) and the last interim document applied to WD(n-1) is that changes have been accepted. **Stefan seconds**.

**No discussion**. **No objections**. **Ammendment accepted**.

Back to main motion. **No further questions**. **No objections**. The **motion passed**.

Ram suggests to exchange further details on the mailing list, so that during meetings this precious shared time is better used.

**Action** on the chairs to "Discuss/provide tools"


## 7. Process issues

###7.1. Discussion on the [question raised by Giovanni](https://lists.oasis-open.org/archives/odata/201208/msg00012.html)

Giovanni summarizes his input to the TC: W3C has recently developed a candidate rec ["Direct Mapping"](http://www.w3.org/TR/rdb-direct-mapping/) for mapping DB entries into URI references. OData does this as well (core specs), so it would be good to look into W3C rec in order to avoid having two different standards addressing the same issue in different ways different. Ref: [W3C RDB2RDF WG](http://www.w3.org/2001/sw/rdb2rdf/)

Ram suggests shifting discussion on this question to the mailinglist and next meeting since only three minutes meeting time left

###7.2. [Issues List](https://tools.oasis-open.org/issues/secure/IssueNavigator.jspa?reset=true&mode=hide&pid=10103) (IL)

Since short in meeting time Ram proposes to talk about the list of issues next time. **Agreed**.

## 8. Timeline and next steps

###8.1. Review of the Timeline [[TL_REF][TL_REF]] and discussion of immediate next steps.

Also skipped due to time lapsing.

## 9. Next meeting

###9.1 Proposed Thursday Aug 16, 2012 0800-0900 PT

Agreed.


## 10. AOB

None.

### Meeting adjourned on 0901 PT.


# Appendices
## Timeline Reference [TL_REF] 
 
Timeline (based on the F2F discussions and information we currently have)

* Aug 31
	* All the core specs (seven in total) imported to OASIS specification template.
	* All known issues on core specs have been filed
* Sept 15
	* Based on the outstanding issues, the TC will determine a reasonable timeline for the core specs.

