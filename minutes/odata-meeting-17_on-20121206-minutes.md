Title:	Meeting minutes of OASIS OData TC's Conference Call #17
Date:	Thursday, 06 Dec 2012, 0800 - 0900 PT    
Author:	Stefan Drees <stefan@drees.name>  

# OData Conference Call #17, Thursday, 06 Dec 2012,  0800 - 0900 PT #

Meeting chaired by Barabara Hartel and Ram Jeyaraman

Acting chair: Ram Jeyaraman

## 1. Roll call##
 
### 1.1 Members Present:###
 
        Andrew Eisenberg (IBM)        Anila Kumar GVN (CA Technologies)        Barbara Hartel (SAP AG)        Colleen Evans (Microsoft)        Dale Moberg (Axway Software)        Diane Downie (Citrix Systems)        Diane Jordan (IBM)        Gerald Krause (SAP AG)        Hubert Heijkers (IBM)        John Willson (Individual)        Ken Baclawski (Northeastern University)        Martin Zurmuehl (SAP AG)        Matthew Borges (SAP AG)        Michael Pizzo (Microsoft) a.k.a. Mike        Ralf Handl (SAP AG)        Ram Jeyaraman (Microsoft)        Robert Richards (Mashery)        Stan Mitranic (CA Technologies)        Stefan Drees (Individual)        Susan Malaika (IBM)        Ted Jones (Red Hat)
Quorum achieved. Details cf. [normative attendance sheet for this meeting](https://www.oasis-open.org/apps/org/workgroup/odata/event.php?event_id=33464).


## 2. Approval of Agenda##

The "OData link to RDF" topic Ken brought up on the odata mailing list will be discussed as suggested by Ken and during five minutes after issue processing (item 5).

Agenda otherwise approved as published.


## 3. Approval of Minutes from Previous Meeting(s)##

### 3.1 Approval of [Minutes of 2012-11-29 Meeting#16](https://www.oasis-open.org/committees/download.php/47594/odata-meeting-16_on-20121129-minutes.html):###

**Meeting minutes approved with no objections**.


## 4. Review of [Action Items](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_items.php) (AI) and Progress##

>Context: The ownership of action items is noted `[owner: Given Family]` and as indicated by [AI-List-Tool](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_items.php) retrieved `2012-12-06 14:50 +01:00`.


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


###4.1 Action items due by 2012-12-06 (end of day)###

None. 

###4.2 Action items NOT due by 2012-12-06 but MAY be ready for closure###

None. 



##5 Review of [Issues List](https://tools.oasis-open.org/issues/secure/IssueNavigator.jspa?reset=true&mode=hide&pid=10103&sorter/field=issuekey&sorter/order=ASC) (IL) and Progress##


###5.1 Applied Resolutions###

No groupings.

####5.1.1 OData ABNF Construction Rules####


#####5.1.1.1 [ODATA-80](https://tools.oasis-open.org/issues/browse/ODATA-80)#####

ODATA-80
: "Add ABNF rules for action parameters in request bodies" [component: OData ABNF Construction Rules] is **Proposed**.


Ralf:
>I **move** to accept ODATA-80 as applied. **Mike seconds**.


**No further discussion**. **No objections**. The **motion passes**.


ODATA-80
: "Add ABNF rules for action parameters in request bodies" [component: OData ABNF Construction Rules] is **Applied** with no objections.

#####5.1.1.2 [ODATA-67](https://tools.oasis-open.org/issues/browse/ODATA-67)#####

ODATA-67
: "Describe representation of ReferenceTypes in requests" [component: OData ABNF Construction Rules] is **Proposed**.

Ralf:
>I **move** to accept ODATA-67 as applied. **Martin seconds**.

**No further discussion**. **No objections**. The **motion passes**.


ODATA-67
: "Describe representation of ReferenceTypes in requests" [component: OData ABNF Construction Rules] is **Applied** with no objections.


####5.1.2 OData Atom Format####


#####5.1.2.1 [ODATA-149](https://tools.oasis-open.org/issues/browse/ODATA-149)#####

ODATA-149
: "Self-link for related and inlined feeds" [component: OData ATOM Format] is **Proposed**.

Martin:
>I **move** to accept ODATA-149 as applied. **Mike seconds**.

**No further discussion**. **No objections**. The **motion passes**.


ODATA-149
: "Self-link for related and inlined feeds" [component: OData ATOM Format] is **Applied** with no objections.


#####5.1.2.2 [ODATA-136](https://tools.oasis-open.org/issues/browse/ODATA-136)#####

ODATA-136
: "Correct definition of Edm.Time in [ATOM]" [component: OData ATOM Format] is **Proposed**.

Discussion:

* Martin states we should reactivate the issue and move it back into resolved since some place to be updated is still missing 
* Mike also sees this as the way to go to ensure it is applied consistently
* All agree


**No further discussion**. **No objections**. 


ODATA-136
: "Correct definition of Edm.Time in [ATOM]" [component: OData ATOM Format] is **Resolved** with no objections.


#####5.1.2.3 [ODATA-135](https://tools.oasis-open.org/issues/browse/ODATA-135)#####

ODATA-135
: "Instance Annotations in Atom should use metadata:Annotation element" [component: OData ATOM Format] is **Proposed**.

Martin:
>I **move** to accept ODATA-135 as applied. **Mike seconds**.

**No further discussion**. **No objections**. The **motion passes**.


ODATA-135
: "Instance Annotations in Atom should use metadata:Annotation element" [component: OData ATOM Format] is **Applied** with no objections.


####5.1.3 OData Atom Format, OData CSDL####

#####5.1.3.1 [ODATA-133](https://tools.oasis-open.org/issues/browse/ODATA-133)#####

ODATA-133
: "Attributes defined on odata elements should be in empty namespace" [components: OData ATOM Format, OData CSDL] is **Proposed**.
Martin:
>I **move** to accept ODATA-133 as applied. **Stefan seconds**.


**No further discussion**. **No objections**. The **motion passes**.


ODATA-133
: "Attributes defined on odata elements should be in empty namespace" [components: OData ATOM Format, OData CSDL] is **Applied** with no objections.


####5.1.4 OData CSDL####


#####5.1.4.1 [ODATA-191](https://tools.oasis-open.org/issues/browse/ODATA-191)#####

ODATA-191
: "Create subsections for attributes consistently as appropriate throughout [CSDL] document" [component: OData CSDL] is **Proposed**.

Ralf:
>I **move** to close ODATA-191 as applied. **Martin seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-191
: "Create subsections for attributes consistently as appropriate throughout [CSDL] document" [component: OData CSDL] is **Applied** with no objections.


#####5.1.4.2 [ODATA-185](https://tools.oasis-open.org/issues/browse/ODATA-185)#####

ODATA-185
: "Nullable attribute should be required to be false for collection valued navigation properties." [component: OData CSDL] is **Proposed**.

Discussion:
* Mike suggests to send this issue back to open state
* All agree

**No further discussion**. **No objections**.

ODATA-185
: "Nullable attribute should be required to be false for collection valued navigation properties." [component: OData CSDL] is **Open** with no objections.


#####5.1.4.3 [ODATA-184](https://tools.oasis-open.org/issues/browse/ODATA-184)#####

ODATA-184
: "Relationships in CSDL examples should include Partner attribute" [component: OData CSDL] is **Proposed**.

Ralf:
>I **move** to close ODATA-184 as applied. **Hubert seconds**.

**No further discussion**. **No objections**. The **motion passes**.


ODATA-184
: "Relationships in CSDL examples should include Partner attribute" [component: OData CSDL] is **Applied** with no objections.

#####5.1.4.4 [ODATA-138](https://tools.oasis-open.org/issues/browse/ODATA-138)#####

ODATA-138
: "Remove sections 12 Model Functions and 10.4 Row Types including the subsections" [component: OData CSDL] is **Proposed**.

Discussion:
* Mike suggests to send this issue back into open state

**No further discussion**. **No objections**. 

ODATA-138
: "Remove sections 12 Model Functions and 10.4 Row Types including the subsections" [component: OData CSDL] is **Open** with no objections.


####5.1.5 OData URL Conventions####


#####5.1.5.1 [ODATA-174](https://tools.oasis-open.org/issues/browse/ODATA-174)#####

ODATA-174
: "Core Part 2: 1 Introduction, 1.1 Terminology, 1.2 Normative References and 3 ServiceRootURL somehow mixed up in view 'final version'" [component: OData URL Conventions] is **Proposed**.
Stefan:
>I **move** to close ODATA-174 as applied. **Ralf seconds**.

**No further discussion**. **No objections**. The **motion passes**.


ODATA-174
: "Core Part 2: 1 Introduction, 1.1 Terminology, 1.2 Normative References and 3 ServiceRootURL somehow mixed up in view 'final version'" [component: OData URL Conventions] is **Applied** with no objections.


#####5.1.5.2 [ODATA-26](https://tools.oasis-open.org/issues/browse/ODATA-26)#####

ODATA-26
: "Feedback to document revision" [component: OData URL Conventions] is **Proposed**.

Discussion:

* Stefan suggests to close as applied if the editors did apply the list of proposals
* Ralf states that the editors indeed did so

Stefan:
>I **move** to close ODATA-26 as applied. **Ralf seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-26
: "Feedback to document revision" [component: OData URL Conventions] is **Applied** with no objections.


###5.2 Issues in Open and Proposed State###

####5.2.1 OData CSDL####

#####5.2.1.1 [ODATA-112](https://tools.oasis-open.org/issues/browse/ODATA-112) (Motion pending)#####

ODATA-112
: "DateTime[Offset]: allow 24:00[:00] in time part" [component: OData CSDL] is **Open**.

Discussion:

* All see two options to follow: **1) disallow** or **2) allow** the usage of 2400 et al.
* Mike states, that there will be no perfect solution in this regard.
* Andrew also sees this that way.
* John states, that we should go with other standards such as the ISO.
* Mike responds, that some standards disallow usage of 2400, while ISO allows it, so in any case, the TC has to **select** which standard to follow
* Ralf suggests, that we better exclude the 2400, since sending a 2400 might return a 23:59:59.999 which would be inconsistent
* Hubert asks, what if server returned next day 0000? That would be consistent, since it is the same point in time.
* Mike states, that when the client tries to store 2400 on a server and then reads it back, the datetimes would not compare as equal (lexically)
* Mike and Ralf both assume, the safest thing to ensure smooth round tripping, will be to **not allow 2400**
* Huber further explains his standpoint
* Mike understands, that Hubert might prefer putting the burden on the client (thus option 2)
* Hubert explains, that even though that is a correct conclusion from the discussion, he is actually in favour of putting the burden on the server.
* Ram suggests to continue the discussion after the meeting
* Mike states, that this discussion had some time, but no new arguments have come up the last weeks
* Stefan recaps, that the pending motion was to **not accept** ODATA-112 as of [meeting#09 2012-09-27](https://www.oasis-open.org/committees/download.php/47020/odata_meeting-9_on-20120927_minutes.html), during [meetong#10 2012-10-04](https://www.oasis-open.org/committees/download.php/47126/odata_meeting-10_on-20121004-minutes.html) it was postponed to the f2f in November and there (and until today) it has not been further discussed and suggests to recap the pending motion (hereby stated and renewed below)

Mike:
>I **move** we resolve ODATA-112 using Option 1, not allowing 24:00 in the time portion of DateTimeOffset. **Stefan seconds**.

**One objection by Andrew**

Discussion:
* Andrew states, that if he is the only one objecting, the motion may pass 
* Ram asks if other than Andrew anyone has an opinion against the motion ?

**No further objections**. The **motion passes**.


ODATA-112
: "DateTime[Offset]: allow 24:00[:00] in time part" [component: OData CSDL] is **resolved as put in the motion** with no objections.


Note:
>Time slot for issue processing gone. Skip all remaining agenda sub items of 5.

##6 Possible connections between OData and RDF##

###6.1 Suggestions received by Ken through odata-list###

Context:
> The (relevant) latest messages from the odata-list during December 2012 w.r.t. OData and RDF are those with the numbers [26](https://lists.oasis-open.org/archives/odata/201212/msg00026.html) and [28](https://lists.oasis-open.org/archives/odata/201212/msg00028.html): 

Summary:

* Ken met with Ivan Herman and Eric Prud'hommeaux at the W3C exploring possible connections between OData and RDF.  Ivan is the Semantic Web Activity Lead at the W3C.  They suggested that Ken starts a W3C Community. See [http://www.w3.org/community/about/#cg](http://www.w3.org/community/about/#cg) for what this means.  One might also look at [http://www.w3.org/community/about/agreements/cla/](http://www.w3.org/community/about/agreements/cla/) for the IPR issues that this involves. 
* Ken also agrees with the idea (offered by Ram) that setting up an external group is **beyond** the purview of this TC, while selecting a member to act as liaison with another group is **within** the purview.  It was the W3C that suggested that Ken creates a W3C Community as a means for having a liaison between OData and the W3C (or more precisely, with the W3C Semantic Web Activity).  
* Ken would just like to know how the TC feels about having such a liaison.

Discussion:

* Ram welcomes the idea, when this other group is interested in, to establish a liaison
* Stefan is also in favour of liaison (as agreed in Ken's mail (number [26](https://lists.oasis-open.org/archives/odata/201212/msg00026.html))
* Susan asks for specific use cases
* John wants to use OData {collection} as an RDF tuple so would support liaison.
* Susan asks, if John may describe a little more about your example?
* Ken suggests to move this to the mailing list
* Susan agrees.


##7 Timeline and next steps##

###7.1 Review of the projected Timeline [[TL_REF][TL_REF]]###
 Let's assess progress on the planned activities during November and December 2012. And also briefly discuss the planned activities during Jan and Feb 2013. See timeline [[TL_REF][TL_REF]] for more details.


##8 Next Meetings##

###8.1 Dec 13 Conference Call 08-09am PT###

Agreed. 

###8.2 TC meetings on Dec 20, Dec 27 and Jan 03 ?###

Discussion:

* Ram suggests moving discussion to mailing list
* All agree

###8.3 Next F2F meeting confirmed during Jan 30-31 in Z&uuml;rich, Switzerland###


Skipped during meeting, will be further prepared by email


##9 AOB##

None. 

### Meeting adjourned on 0901 PT.###


# Appendices#
## Timeline Reference [TL_REF] ##
  
Here is a rough draft of a timeline for the OData core work products:

* November 2012
    + Leading up to Nov 29
        - `Editors to incorporate all issue resolutions and produce new revisions of core Work Products`
        - Review and file issues on core Work Products resulting from new proposals
        - Review and file issues on core Work Products resulting from extension Work Products
    + Nov 29 TC meeting
        - Continue to make progress on issues
* December 2012
    + Continue to make progress on issues
    + `December 19, 2012`
        - `*File all known issues on core Work Products resulting from new proposals*`
* January 2013
    + `January 17, 2012`
        - `*File all known issues on core Work Products resulting from extension Work Products*`
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
    + `February 21, 2013`
        - `Approve Committee Specification Draft 01 (CSD01) of core Work Products and agree to start 30-day public review`
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
