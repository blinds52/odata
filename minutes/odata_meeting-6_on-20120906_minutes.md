Title:	Meeting minutes of OASIS OData TC's Conference Call #6
Date:	Thursday, 06 Sep 2012, 0800 - 0900 PT    
Author:	Stefan Drees <stefan@drees.name>  

# OData Conference Call #6, Thursday,  06 Sep 2012,  0800 - 0900 PT #

Meeting chaired by: Ram Jeyaraman

## 1. Roll call##
 
### 1.1 Members Present:###
 
        Andrew Eisenberg (IBM)        Anila Kumar GVN (CA Technologies)        Barbara Hartel (SAP AG)        Christopher Woodruff (Perficient, Inc.)        Colleen Evans (Microsoft)        Dale Moberg (Axway Software)        Diane Jordan (IBM)        Erik de Voogd (SDL)        Farrukh Najmi (Individual)        Gerald Krause (SAP AG)        Howard Abrams (CA Technologies)        Hubert Heijkers (IBM)        Jeffrey Turpin (Axway Software)        John Willson (Individual)        John Wilmes (Individual)        Ken Baclawski (Northeastern University)        Mark Biamonte (Progress Software)        Martin Zurmuehl (SAP AG)        Matthew Borges (SAP AG)        Michael Pizzo (Microsoft)        Pablo Castro (Microsoft)        Patrick Durusau (Individual)        Ralf Handl (SAP AG)        Ram Jeyaraman (Microsoft)        Robert Richards (Mashery)        Stan Mitranic (CA Technologies)        Stefan Drees (Individual)        Susan Malaika (IBM)        Ted Jones (Red Hat)
### 1.2 On Leave of Absence:###

No member is on leave of absence.

Quorum achieved. Details cf. [normative attendance sheet for this meeting](https://www.oasis-open.org/apps/org/workgroup/odata/event.php?event_id=33451).


## 2. Approval of Agenda##

Agenda approved as published.


## 3. Approval of Minutes from Previous Meeting(s)##

### 3.1 Approval of [Minutes of 2012-08-30 Meeting#5](https://www.oasis-open.org/committees/download.php/46804/odata_meeting-5_on-20120830_minutes.html):###

**Meeting minutes approved with no objections**.


## 4. Review of [Action Items](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_items.php) (AI) and Progress##

[AILT]: [Action Items](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_items.php)

>Context: The ownership of action items is noted `[owner: Given Family]` and as indicated by [AIL-Tool][AILT] retrieved `2012-08-22 07:35 +02:00`.


AI#0003
: "Come up with examples / usecases (and proposals) for open types and document annotation for JSON extensions document" [owner: Susan Malaika] is **Ongoing** 

AI#0004
: "Come up with estimate for first milestone for data aggregation extension" [owner: Ralf Handl] is **Ongoing** 

AI#0005
: "Come up with a first milestine for the temporal extension" [owner: Andrew Eisenberg] is **Ongoing** 

AI#0006
: "Come up with estimate for first milestone for XML data extension" [owner: Andrew Eisenberg] is **Ongoing** 

AI#0007
: "Come up with estimate for first milestone for JSON data extension" [owner: Susan Malaika] is **Ongoing** 

AI#0008
: "Recording of TC meetings" [owner: Hubert Heijkers] is **Ongoing** 

AI#0017
: "Prepare Working Draft 01 (WD01) version of OData Extension for Data Aggregation" [owner: Ralf Handl] is **Ongoing** 

AI#0018
: "Prepare Working Draft 01 (WD01) version of OData Extension for Temporal Data" [owner: Andrew Eisenberg] is **Ongoing** 

AI#0019
: "Prepare Working Draft 01 (WD01) version of OData Extension for XML Data" [owner: Andrew Eisenberg] is **Ongoing** 

AI#0020
: "Prepare Working Draft 01 (WD01) version of OData Extension for JSON Data" [owner: Susan Malaika] is **Ongoing** 

AI#0022
: "Investigate with the TC administration how to manage the isolated ABNF Grammar artifact in the standardizing process" [owner: Ram Jeyaraman] is **Ongoing** 

###4.1 Action items due by 2012-09-06 (end of day)###

None.

###4.2 Action items NOT due by 2012-09-06 but MAY be ready for closure###

####4.2.1 [AI#0022](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_item.php?action_item_id=3512)####

AI#0022
: "Investigate with the TC administration how to manage the isolated ABNF Grammar artifact in the standardizing process" [owner: Ram Jeyaraman] is **Closed** as __completed__ with no objections. 

Mike (Michael): 
>I **move** we break the XSD section of the CSDL specification into a separate, text-formatted XML document. **Martin seconds**.

Discussion of motion:

* Mike asks, which concrete name should be used.
* Ralf suggests to place it in SVN inside a schema subfolder.
* Ram suggests to discuss that on the mailinglist

** New Action**:
> Mike will take an action to come back with info on outcome of that discussion.

**No further discussion**. **No objections**. The **motion passes**.


##5 Bunching up issues##

Context:
> Given the large number of issues, we could consider bunching up issues for approvals, if and where possible. For example, the bunch of issues that have previously been resolved by the TC and currently in the Applied state could potentially be approved via a single motion to Closed, assuming everyone has reviewed the application of the resolutions and are fine with it. If anyone has any concern over the application of the approved resolution for any of the issues in that bunch, we can peel off those issues and process them via separate motions. This optimization could free up some time which we could use for discussing issues. Let’s discuss this and see if it makes sense to do it this way.

Discussion:

* Mike suggests that the grouping only be applied to issues that the TC has proposed and accepted resolutions for.
* Ralf agrees to discuss initially all issues separately
* Andrew suggests to not make a motion for gorupings in the future
* Colleen also suggests to not formalize, but keep the option of grouping open. In each case this may be considered, if the group prefers.

Otherwise there is consensus, that where possible issues may be grouped in motions.

**No further discussion**. **No objections**. 

##6 Review of [Issues List](https://tools.oasis-open.org/issues/secure/IssueNavigator.jspa?reset=true&mode=hide&pid=10103&sorter/field=issuekey&sorter/order=ASC) (IL) and Progress##


###6.1 Applied resolutions from 2012-08-30###
 
Stefan: 
>I **move** that the ODATA-Issues with numbers 27, 50, 55, 59, 63 and 64 are approved 
as closed. **Andrew seconds**.

Discussion of motion:

* Mike explains, that in section 5.1, we should add Documentation to the list of zero or more child elements. We don't consistently list allowable children for other elements, but since we enumerate them here we should be comprehensive.

** New Action**:
> Mike will take an action to do this (as described in the discussion statement).

**No further discussion**. **No objections**. The **motion passes**.


####6.1.1 [ODATA-27](https://tools.oasis-open.org/issues/browse/ODATA-27)####

ODATA-27
: "Rules for primitive literals binary, datetimebody, decimal, double, single, string" [component: OData ABNF Construction Rules] is **accepted as applied and closed** with no objections. 

####6.1.2 [ODATA-50](https://tools.oasis-open.org/issues/browse/ODATA-50)####

ODATA-50
: "Inheritance for ComplexType: BaseType and Abstract attributes missing" [component: OData CSDL] is **accepted as applied and closed** with no objections. 

####6.1.3 [ODATA-55](https://tools.oasis-open.org/issues/browse/ODATA-55)####

ODATA-55
: "Allow Documentation for Schema, EnumType, and Member" [component: OData CSDL] is **accepted as applied and closed** with no objections. 

####6.1.4 [ODATA-59](https://tools.oasis-open.org/issues/browse/ODATA-59)####

ODATA-59
: "Literal value 'Max' for MaxLength attribute is missing" [component: OData CSDL] is **accepted as applied and closed** with no objections. 

####6.1.5 [ODATA-63](https://tools.oasis-open.org/issues/browse/ODATA-63)####

ODATA-63
: "5.2.2 The edm:Alias Attribute should be optional" [component: OData CSDL] is **accepted as applied and closed** with no objections. 

####6.1.6 [ODATA-64](https://tools.oasis-open.org/issues/browse/ODATA-64)####

ODATA-64
: "Uniqueness of names of EntityContainer child elements" [component: OData CSDL] is **accepted as applied and closed** with no objections. 


###6.2 Trivial issues directly moved to Applied state###


####6.2.1 [ODATA-44](https://tools.oasis-open.org/issues/browse/ODATA-44)####

ODATA-44
: "Section 20: refer to rules in OData ABNF Construction Rules that define the necessary literals, add ABNF rules if necessary" [components: OData ABNF Construction Rules, OData CSDL] is **accepted as applied and closed** with no objections. 

Mike: 
>I **move** we accept the changes for ODATA-44 as applied. **Chris seconds**.

**No discussion**. **No objections**. The **motion passes**.

####6.2.2 [ODATA-70](https://tools.oasis-open.org/issues/browse/ODATA-70)####

ODATA-70
: "Correct definition of Edm.Time" [components: OData ATOM Format, OData CSDL] is **accepted as applied and closed** with no objections. 

Mike: 
>I **move** we accept the application of ODATA-70 in order to get the spec in a stable state and repurpose ODATA-107 to track the issue of Edm.Time and Edm.Duration. **Andrew seconds**.

Discussion of motion:

* Andrew asks, what the actual change in the document has been.
* Mike explains, that when Edm.Time was introduced it was intended to be xs:duration. ODATA-70 gets the documentation in a consistent state by consistently applying xs:duration for Edm.Time. 

**No further discussion**. **No objections**. The **motion passes**.

###6.3 Issues in Open and Proposed state###

####6.3.1 [ODATA-48](https://tools.oasis-open.org/issues/browse/ODATA-48)####

ODATA-48
: "Consistent typographical conventions for OData specifications" [components: OData ABNF Construction Rules, OData ATOM Format, OData Batch Processing Format, OData CSDL, OData Extension for Data Aggregation, OData Extension for JSON Data, OData Extension for Temporal Data, OData Extension for XML Data, OData JSON Format, OData Protocol, OData URL Conventions] is **accepted as proposed** with no objections. 

Ralf: 
>I **move** to resolve ODATA-48 as proposed. **Mike seconds**.

**No discussion**. **No objections**. The **motion passes**.



###6.4 Issues New and Proposed state###

####6.4.1 [ODATA-2](https://tools.oasis-open.org/issues/browse/ODATA-2)####

ODATA-2
: "Rules for error message inconsistent to Atom document" [component: OData JSON Format] is **accepted as proposed** with no objections. 

Ralf: 
>I **move** to resolve ODATA-4 as proposed. **Mike seconds**.

**No discussion**. **No objections**. The **motion passes**.


####6.4.2 [ODATA-4](https://tools.oasis-open.org/issues/browse/ODATA-4)####

ODATA-4
: "Allow DefaultValue facet for FunctionImport Parameter" [component: OData CSDL] is **accepted as proposed** with no objections. 

Ralf: 
>I **move** to resolve ODATA-4 as proposed. **Chris seconds**.

**No discussion**. **No objections**. The **motion passes**.



####6.4.3 [ODATA-5](https://tools.oasis-open.org/issues/browse/ODATA-5)####

ODATA-5
: "Allow Collection(ComplexType) and Collection(PrimitiveType) for Type attribute of ValueTerm" [component: OData CSDL] is **accepted as proposed** with no objections. 

Ralf: 
>I **move** to resolve ODATA-5 as proposed. **Mike seconds**.

**No discussion**. **No objections**. The **motion passes**.



####6.4.4 [ODATA-17](https://tools.oasis-open.org/issues/browse/ODATA-17)####

ODATA-17
: "Define which DataServiceVersion this specification defines: 3.0 or 4.0" [component: OData Protocol] is **accepted as proposed** with no objections. 

Ralf: 
>I **move** to resolve ODATA-17 as proposed. **Hubert seconds**.

Discussion of motion:

* Mike asks how to handle earlier versions. Describe them from retrospective or simply reserve/spare those?
* Andrew warns, that describing earlier OData versions is a lengthy and error-prone process. 
* Ram suggests to defer discussion, if consistent application is a point to think through before deciding
* Mike clarifies, that he is in favour to accept the proposed resolution, but wants to ensure, we as a group think it through/apply consistently
* Andrew suggests, that references to previous versions be non-normative
* Mark informs, that there are references to previous version in the JSON format document.

**No further discussion**. **No objections**. The **motion passes**.

** New Action**:
> Mike will take an action on completing the proposal with regard to consistency


####6.4.5 [ODATA-19](https://tools.oasis-open.org/issues/browse/ODATA-19)####

ODATA-19
: "New / alternative XML namespaces with OASIS naming convention" [component: OData CSDL] is **accepted as proposed** with no objections. 

Ralf: 
>I **move** to resolve ODATA-19 as proposed. **Stefan seconds**.

Discussion of motion:

* Mike agrees with oasis prefix in namespace, but asks if this will be an alternate namespace or "the only one"
* Ralf suggests only the oasis prefix starting with version 4
* Farrukh also thinks, that 4.0 should only use OASIS namespaces

Mike:
> I **move** to amend the motion that the OASIS specification define that, for DataServiceVersion 4.0 payloads, the OASIS prefix is used. Any reference to the previous OData namespace would be non-normative. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion will be amended**.

Ralf:
> I **move** that the new CSDL namespace is "http://docs.oasis-open.org/odata/ns/csdl/4.0". **Stefan seconds**.

**No further discussion**. **No objections**. The **motion will be amended**.


**No further discussion**. **No objections**. The **amended motion passes**.

Mike updated the proposal for JIRA ODATA-19 as follows: 
>The OASIS specifications will use namespaces following the OASIS conventions (http://docs.oasis-open.org/specGuidelines/ndr/namingDirectives.html#xml-namespaces). The new CSDL namespace will be: http://docs.oasis-open.org/odata/ns/csdl/4.0


####6.4.6 [ODATA-65](https://tools.oasis-open.org/issues/browse/ODATA-65)####

ODATA-65
: "Remove the edm:Mode attribute" [component: OData CSDL] is **opened and discussion deferred to next meeting** with no objections. 

Ralf: 
>I **move** to resolve ODATA-65 as proposed. **Stefan seconds**.

Discussion of motion:

* Mike explains, that currently when returning the edm:Mode attribute the only allowed value is "in". If we remove the attribute, we lose the possiblity to accomodate future uses where the value might be "in" or "out" as example. He thus suggests to defer to next meeting.

Chris: 
>I **move** to defer to next meeting. **Michael seconds**.


**No further discussion**. **No objections**. The **motion passes**.

End time scheduled for processing issues has now passed. All other processing deferred to next meeting.



##7 Extend TC meeting to 90 minutes?##

Context:
> Given the large number of issues and the need for more discussion time, should we consider extending the weekly TC meeting duration to 90 minutes?

Discussion:

* Dale: Yes.
* Ram asks if anyone has a problem, when we extend meeting time to 90 minutes?
* Chris is available for either starting earlier or ending later
* Mike could run later, or start 15 minutes earlier. Starting 30 minutes earlier is possible but difficult.

Stefan:
> I **move** to extend meeting time to 90 minutes by starting 15 minutes earlier.

Ram suggests move discussion to mailing list. 

**Agreed**

 
##8 Timeline and next steps##

###8.1 Have all known issues on core specification been filed?###

Discussion:

* Ram asks if there is anyone, who knows of an issue, that not has been filed yet?

**None**.


###8.2 Review of the Timeline [[TL_REF][TL_REF]] and discussion of immediate next steps.###

Ram suggests, that the chairs will prepare an updated timeline draft until next meeting.

**Agreed**.

##9 Next meeting##

###9.1 Proposed Thursday Sep 13, 2012 0800-0900 PT###

**Agreed**.


##10 AOB##

Discussion on next f2f meeting:

* Hubert asks, what the status of f2f planning is, since the agenda item is not present.
* Ram explains, that instead of discussing that same unchanged status again like in the last meetings, the chairs decided, they better try to first pull in a volunteer for hosting the Nov. 5th - 9th timeslot and then second come back to discuss further.

### Meeting adjourned on 0900 PT.###


# Appendices#
## Timeline Reference [TL_REF] ##
 
Timeline (based on the F2F discussions and information we currently have)

* Aug 31
	* All the core specs (seven in total) imported to OASIS specification template.
	* All known issues on core specs have been filed
* Sept 15
	* Based on the outstanding issues, the TC will determine a reasonable timeline for the core specs.

