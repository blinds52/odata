Title:	Meeting minutes of OASIS OData TC's Conference Call #18
Date:	Thursday, 13 Dec 2012, 0800 - 0900 PT    
Author:	Stefan Drees <stefan@drees.name>  

# OData Conference Call #18, Thursday, 13 Dec 2012,  0800 - 0900 PT #

Meeting chaired by Barabara Hartel

## 1. Roll call##
 
### 1.1 Members Present:###
 
        Andrew Eisenberg (IBM)        Anila Kumar GVN (CA Technologies)        Barbara Hartel (SAP AG)        Colleen Evans (Microsoft)        Diane Downie (Citrix Systems)        Diane Jordan (IBM)        Erik de Voogd (SDL)        Gerald Krause (SAP AG)        Hubert Heijkers (IBM)        Jeffrey Turpin (Axway Software)        John Willson (Individual)        Ken Baclawski (Northeastern University)        Martin Zurmuehl (SAP AG)        Matthew Borges (SAP AG)        Michael Pizzo (Microsoft) a.k.a. Mike        Nuno Linhares (SDL)        Patrick Durusau (Individual)        Ralf Handl (SAP AG)        Ram Jeyaraman (Microsoft)        Robert Richards (Mashery)        Stan Mitranic (CA Technologies)        Stefan Drees (Individual)        Susan Malaika (IBM)        Ted Jones (Red Hat)
Quorum achieved. Details cf. [normative attendance sheet for this meeting](https://www.oasis-open.org/apps/org/workgroup/odata/event.php?event_id=33465).


## 2. Approval of Agenda##

Agenda approved as published.


## 3. Approval of Minutes from Previous Meeting(s)##

### 3.1 Approval of [Minutes of 2012-12-06 Meeting#17](https://www.oasis-open.org/committees/download.php/47651/odata-meeting-17_on-20121206-minutes.html):###

**Meeting minutes approved with no objections**.


## 4. Review of [Action Items](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_items.php) (AI) and Progress##

>Context: The ownership of action items is noted `[owner: Given Family]` and as indicated by [AI-List-Tool](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_items.php) retrieved `2012-12-10 20:07 +01:00`.


AI#0005
: "Come up with a first milestine for the temporal extension" [owner: Andrew Eisenberg] is **Ongoing** (Note: Due 2012-12-13)

AI#0006
: "Come up with estimate for first milestone for XML data extension" [owner: Andrew Eisenberg] is **Ongoing** (Note: Due 2012-12-13)

AI#0007
: "Come up with estimate for first milestone for JSON data extension" [owner: Susan Malaika] is **Ongoing** (Note: Due 2012-12-13)

AI#0018
: "Prepare Working Draft 01 (WD01) version of OData Extension for Temporal Data" [owner: Andrew Eisenberg] is **Ongoing**

AI#0019
: "Prepare Working Draft 01 (WD01) version of OData Extension for XML Data" [owner: Andrew Eisenberg] is **Ongoing**

AI#0020
: "Prepare Working Draft 01 (WD01) version of OData Extension for JSON Data" [owner: Susan Malaika] is **Ongoing**
  
AI#0026
: "Detail a proposal with regard to enumerations" [owner: Mike Pizzo] is **Ongoing** (Note: Due 2012-12-13)


###4.1 Action items due by 2012-12-13 (end of day)###

Discussion:

* Andrew needs more time w.r.t. AI#0005 and AI#0006
* Barbara suggests to defer AI#0005 and AI#0006 to first meeting of new year
* All agree

####4.1.1 [AI#0005](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_item.php?action_item_id=3462)####

AI#0005
: "Come up with a first milestine for the temporal extension" [owner: Andrew Eisenberg] is **Ongoing** (Note: Due 2013-01-10)

####4.1.2 [AI#0006](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_item.php?action_item_id=3463)####

AI#0006
: "Come up with estimate for first milestone for XML data extension" [owner: Andrew Eisenberg] is **Ongoing** (Note: Due 2013-01-10)

####4.1.3 [AI#0007](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_item.php?action_item_id=3464)####

Discussion:
* Susan also suggests to defer to first meeting of new year
* All agree

AI#0007
: "Come up with estimate for first milestone for JSON data extension" [owner: Susan Malaika] is **Ongoing** (Note: Due 2013-01-10)

####4.1.4 [AI#0026](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_item.php?action_item_id=3522)####

Discussion:

* Mike completed the item and sent out the proposal to be detailed yesterday
* Barbara asks all members to give feedback based upon Mikes document "[Supporting Enumeration Types in OData](https://www.oasis-open.org/committees/download.php/47712/Supporting%20Enumeration%20Types%20in%20OData.docx)"

AI#0026
: "Detail a proposal with regard to enumerations" [owner: Mike Pizzo] is **Closed** (Note: Due 2012-12-13)



###4.2 Action items NOT due by 2012-12-13 but MAY be ready for closure###

None.


##5 Next Meetings##

###5.1 Dec 20 Conference Call 08-09am PT###

Discussion:

* Barabara proposes to have the meeting

Agreed (although some will be on vacation)


###5.2 TC meetings on Dec 27 and Jan 03 ?###

Discussion:

* All agree to not have the meeting on Dec 27
* All agree to not have the meeting on Jan 03
* Thus next meeting would be Jan 10

Agreed. 

###5.3 Next F2F meeting confirmed during Jan 30-31 in Z&uuml;rich, Switzerland###

Nothing new.



##6 Review of [Issues List](https://tools.oasis-open.org/issues/secure/IssueNavigator.jspa?reset=true&mode=hide&pid=10103&sorter/field=issuekey&sorter/order=ASC) (IL) and Progress##


###6.1 Issues in Applied state###

####6.1.1 OData ABNF Construction Rules####


#####6.1.1.1 [ODATA-112](https://tools.oasis-open.org/issues/browse/ODATA-112)#####

ODATA-112
: "DateTime[Offset]: allow 24:00[:00] in time part" [component: OData ABNF Construction Rules] is **Proposed**.


Discussion:

* Ralf removed that value from the rules as aligned with the resolution from last meeting


Mike:
>I **move** we close ODATA-112 as applied. **Martin seconds**.

**No further discussion**. **No objections**. The **motion passes**.


ODATA-112
: "DateTime[Offset]: allow 24:00[:00] in time part" [component: OData ABNF Construction Rules] is **Closed** with no objections.


####6.1.2 OData CSDL####


#####6.1.2.1 [ODATA-138](https://tools.oasis-open.org/issues/browse/ODATA-138)#####

ODATA-138
: "Remove sections 12 Model Functions and 10.4 Row Types including the subsections" [component: OData CSDL] is **Proposed**.


Discussion:

* Ralf is optimistic he really erased all occurences


Ralf:
>I **move** to close ODATA-138 as applied. **Mike seconds**.


**No further discussion**. **No objections**. The **motion passes**.


ODATA-138
: "Remove sections 12 Model Functions and 10.4 Row Types including the subsections" [component: OData CSDL] is **Closed** with no objections.


#####6.1.2.2 [ODATA-185](https://tools.oasis-open.org/issues/browse/ODATA-185)#####

ODATA-185
: "Nullable attribute should be required to be false for collection valued navigation properties." [component: OData CSDL] is **Proposed**.

Discussion:

* Ralf applied the proposed solution
* Mike states that there still might be some ambiguity left where a paragraph seems to contradict the information given in the surrounding paragraphs and suggests to further clarify this detail to not irritate readers new to the subject
* Ralf asks for the precise location as he only spots two paragraphs in his current revision [odata-core-v1.0-wd01-part3-csdl-2012-12-07-RH.doc](https://www.oasis-open.org/committees/download.php/47654/odata-core-v1.0-wd01-part3-csdl-2012-12-07-RH.doc).
* Mike proposes to close this issue and place the responsibility of applying these minor editorial changes with no change in meaingn without explicitely asking the group


Stefan:
>I **move** to close ODATA-185 as applied. **Mike seconds**.


**No further discussion**. **No objections**. The **motion passes**.


ODATA-185
: "Nullable attribute should be required to be false for collection valued navigation properties." [component: OData CSDL] is **Closed** with no objections.



###6.2 Issues in Open and Proposed State###

None.


###6.3 Issues in New and Proposed State (carried over from 2012-NOV-29 meeting)###


####6.3.1 OData ABNF Construction Rules####

#####6.3.1.1 [ODATA-139](https://tools.oasis-open.org/issues/browse/ODATA-139)#####

ODATA-139
: "New system query option $search for free-text search within an entity set" [components: OData ABNF Construction Rules, OData Protocol, OData URL Conventions] is **New**.

Discussion:

* Ralf likes to defer, since Mike made a changing comment
* Andrew also suggests he will attach additional comments to the issue


#####6.3.1.2 [ODATA-172](https://tools.oasis-open.org/issues/browse/ODATA-172)#####

ODATA-172
: "EntitySet may be qualified with namespace or alias and EntityContainer" [components: OData ABNF Construction Rules, OData URL Conventions] is **New**.

Discussion:

* Mike proposes to defer some connected issues (similar to ODATA-172) and first solve the issues conceptually in one place and then come back to the single issues. In detail, he states that there are several issues all related to how models refer to one another. He would like to see a proposal that resolves issues ODATA-172, ODATA-180, ODATA-181, ODATA-193 as a whole.
* Ralf will take care of collecting this info and distribute it as a document
* Ralf mentions, that ODATA-195 also belongs to this list
* Barbara suggests to then open all of them and that all members may comment on these to support the construction of the requested proposal as a whole
* All agree to open ODATA-172, ODATA-180, ODATA-181, ODATA-193 and ODATA-195 to foster discussion on the proposal to be documented as a whole by Ralf supported by the other members.


**No further discussion**. **No objections**. 

ODATA-172
: "EntitySet may be qualified with namespace or alias and EntityContainer" [components: OData ABNF Construction Rules, OData URL Conventions] is **Open**.

ODATA-180
: "Remove Extends attribute from EntityContainer element" [component: OData CSDL] is **Open**. 

ODATA-181
: "Referencing/reusing a model element from a different schema does not require to 'include' this schema via a Using element" [component: OData CSDL] is **Open**. 

ODATA-193
: "Allow function imports to return entities from a different service" [component: OData CSDL] is **Open**. 

ODATA-195
: "Simplify entity set qualification rules for NavigationPropertyBinding" [component: OData CSDL] is **Open**. 

Note:
>State of issues ODATA-180, ODATA-181, ODATA-193 and ODATA-195 before meeting was also **New**.
 
####6.3.2 OData ATOM Format and/or OData JSON Format####

#####6.3.2.1 [ODATA-158](https://tools.oasis-open.org/issues/browse/ODATA-158)#####

ODATA-158
: "OData ATOM format should require <category> element" [component: OData ATOM Format] is **New**.

Ralf:
>I **move** to resolve ODATA-158 as proposed. **Mike seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-158
: "OData ATOM format should require <category> element" [component: OData ATOM Format] is **Proposed**.

#####6.3.2.2 [ODATA-162](https://tools.oasis-open.org/issues/browse/ODATA-162)#####

ODATA-162
: "Define OASIS XML namespaces for data: and metadata: in Atom payloads" [component: OData ATOM Format] is **New**.

Discussion:

* Mike states, that the proposed format for the namespaces are: http://docs.oasis-open.org/odata/ns/data/4.0 and http://docs.oasis-open.org/odata/ns/metadata/4.0
* Stefan reminds of the [OASIS naming directives](http://docs.oasis-open.org/specGuidelines/ndr/namingDirectives-v1.3.html#xml-namespaces) where it suggests http://docs.oasis-open.org/[tc-shortname]/ns/xxxx and some rules for the xxxx placeholder. It also states there: "TCs must define a [namespace versioning](http://www.w3.org/TR/webarch/#versioning-xmlns) policy for any XML namespace declared in a specification, and must communicate the text expressing such policy to the TC Administrator for incorporation into the appropriate namespace document." This refers to http://www.w3.org/TR/webarch/#versioning-xmlns where in turn it says in section 4.2.1. Versioning: "There is typically a (long) transition period during which multiple versions of a format, protocol, or agent are simultaneously in use. Good practice: Version information. A data format specification SHOULD provide for version information."
* Ralf summarizes, that we first make all similar like proposed in issue, and afterwards possibly to come up with a new issue
* All agree.
* Ralf will subsequently open a new issue that aims at seeding to define a namespace versioning policy for all XML namespaces in the purview of the OData TC


Mike:
>I **move** we resolve ODATA-162 as proposed. **Ralf seconds**.


**No further discussion**. **No objections**. The **motion passes**.

ODATA-162
: "Define OASIS XML namespaces for data: and metadata: in Atom payloads" [component: OData ATOM Format] is **Proposed**.

Update:
> Issue [ODATA-204](http://tools.oasis-open.org/issues/browse/ODATA-204) "Define namespace versioning policy for XML namespaces" has been created short after the meeting.

#####6.3.2.3 [ODATA-169](https://tools.oasis-open.org/issues/browse/ODATA-169)#####

ODATA-169
: "Representation of named entities in the service document" [components: OData ATOM Format, OData JSON Format] is **New**.

Discussion:

* Mike does like the proposal in general terms and in the ATOM format proposed, but differs on the JSON format proposal
* Ralf states an example of how Mikes proposal for JSON format might look like: 

`{
  "odata.metadata": "http://host/service/$metadata",
"value": [
    { 
      "name": "Orders",
      "kind": "EntitySet"
      "url": "Orders"
    },
    {
      "name": "OrderDetails",
      "kind": "EntitySet"
      "url": "OrderDetails"
    },
    {
      "name": "Contoso",
      "kind": "Entity"
      "url": "Contoso"
    }
  ]
} `

* Mike agrees

Mike:
>I **move** we resolve ODATA-169 as proposed for ATOM, and with a JSON representation that uses a single array with a new "kind" property that is either "EntitySet" or "Entity", as per comments in the issue and Ralf's example above. **Stefan seconds**.


**No further discussion**. **No objections**. The **motion passes**.

ODATA-169
: "Representation of named entities in the service document" [components: OData ATOM Format, OData JSON Format] is **Proposed as amended by Mike in the motion text**.


####6.3.3 OData CSDL####


#####6.3.3.1 [ODATA-104](https://tools.oasis-open.org/issues/browse/ODATA-104)#####

ODATA-104
: "Consider supporting nullable complex typed properties" [component: OData CSDL] is **New**.

Discussion:

* Mike suggests to think about all places, where these rules SHOULD be displayed
* Ralf proposes to clarify this as comments in ABNF

Mike:
>I **move** resolve ODATA-104 by adding the necessary clarification to URL Conventions and [Core], as appropriate, to clarify that we have null propogation rather than null reference exception semantics. **Ralf seconds**.


**No further discussion**. **No objections**. The **motion passes**.

ODATA-104
: "Consider supporting nullable complex typed properties" [component: OData CSDL] is **Proposed**.


#####6.3.3.2 [ODATA-123](https://tools.oasis-open.org/issues/browse/ODATA-123)#####

ODATA-123
: "Referential constraint: prose text does not properly reflect case of optional principal" [component: OData CSDL] is **New**.

Discussion:

* Ralf summarizes he made rephrasings and asks, if this reflects the intent of the issues proposal


Ralf:
>I **move** to resolve ODATA-123 as proposed. **Stefan seconds**.


**No further discussion**. **No objections**. The **motion passes**.

ODATA-123
: "Referential constraint: prose text does not properly reflect case of optional principal" [component: OData CSDL] is **Proposed**.

Note:
>Time slot for issue processing gone. Skipped all remaining agenda sub items of 6 (not having been processed already in the collecting action under section 6.3.1.2).


##7 AOB##

None. 

### Meeting adjourned on 0900 PT.###


# Appendices#
## Timeline Reference [TL_REF] ##
  
Here is a rough draft of a timeline for the OData core work products:

* November 2012
    + Leading up to Nov 29
        - Editors to incorporate all issue resolutions and produce new revisions of core Work Products
        - Review and file issues on core Work Products resulting from new proposals
        - Review and file issues on core Work Products resulting from extension Work Products
    + Nov 29 TC meeting
        - Continue to make progress on issues
* December 2012
    + Continue to make progress on issues
    + December 19, 2012
        - *File all known issues on core Work Products resulting from new proposals*
* January 2013
    + January 17, 2012
        - *File all known issues on core Work Products resulting from extension Work Products*
    + Continue to resolve issues
    + 3rd F2F meeting January 30-31, 2013 (Z&uuml;rich, Switzerland) (details TBD)
        - Resolve all key issues on core Work Products
        - *TC agrees to a high bar for accepting new issues on core Work Products*
    + Continue to resolve issues
* February 2013
    + February 7, 2013
        - Resolve *all remaining issues* on Core Work Products
        - Agree to advance core Work Products to Committee Specification Draft 01 (CSD01)
    + February 14, 2013
        - Editors to prepare Committee Specification Draft 01 (CSD01) of core Work Products containing resolutions to all issues
    + February 21, 2013
        - Approve Committee Specification Draft 01 (CSD01) of core Work Products and agree to start 30-day public review
* March 2013
    + March 1 through March 30
        - 30-day public review of core Work Products
    + Address public review comments on core Work Products
* April 2013
    + 4th F2F meeting (April 2-4, 2013)
        - Address public review comments on core Work Products
        - NOTE: If there are no public review comments on CSD01 AND no further substantive changes (requested by the TC) to the core Work Products, we can jump ahead to *approving Committee Specification (CS)*
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
        - Assuming there are no changes to core Work Products resulting from the preceding public review, *approve Committee Specification (CS)*
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
    + *File all known issues on core Work Products resulting from extension Work Products*
* February and March 2013
    + Resolve issues on extension Work Products
* April 2-4, 2013 4th TC F2F meeting
    + Resolve issues and make progress on extension Work Products
* May 2013
    + Approve Committee Specification Draft 01 of extension Work Products (depending on progress)
