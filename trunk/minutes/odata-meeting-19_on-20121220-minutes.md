Title:	Meeting minutes of OASIS OData TC's Conference Call #19
Date:	Thursday, 20 Dec 2012, 0800 - 0900 PT    
Author:	Stefan Drees <stefan@drees.name>  

# OData Conference Call #19, Thursday, 20 Dec 2012,  0800 - 0900 PT #

Meeting chaired by Ram Jeyaraman

## 1. Roll call##
 
### 1.1 Members Present:###
 
        Andrew Eisenberg (IBM)        Anila Kumar GVN (CA Technologies)        Barbara Hartel (SAP AG)        Colleen Evans (Microsoft)        Dale Moberg (Axway Software)        Gerald Krause (SAP AG)        Jeffrey Turpin (Axway Software)        John Willson (Individual)        Ken Baclawski (Northeastern University)        Martin Zurmuehl (SAP AG)        Matthew Borges (SAP AG)        Michael Pizzo (Microsoft) a.k.a. Mike        Ralf Handl (SAP AG)        Ram Jeyaraman (Microsoft)        Robert Richards (Mashery)        Stan Mitranic (CA Technologies)        Stefan Drees (Individual)        Susan Malaika (IBM)        Ted Jones (Red Hat)

Quorum achieved. Details cf. [normative attendance sheet for this meeting](https://www.oasis-open.org/apps/org/workgroup/odata/event.php?event_id=33466).

## 2. Approval of Agenda##

Agenda approved as published.

## 3. Approval of Minutes from Previous Meeting(s)##

### 3.1 Approval of [Minutes of 2012-12-13 Meeting#18]( https://www.oasis-open.org/committees/download.php/47722/odata-meeting-18_on-20121213-minutes.html):###

**Meeting minutes approved with no objections**.

## 4. Review of [Action Items](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_items.php) (AI) and Progress##

>Context: The ownership of action items is noted `[owner: Given Family]` and as indicated by [AI-List-Tool](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_items.php) retrieved `2012-12-20 13:00 +01:00`.

AI#0005
: "Come up with a first milestine for the temporal extension" [owner: Andrew Eisenberg] is **Ongoing** (Note: Due 2013-01-10)

AI#0006
: "Come up with estimate for first milestone for XML data extension" [owner: Andrew Eisenberg] is **Ongoing** (Note: Due 2013-01-10)

AI#0007
: "Come up with estimate for first milestone for JSON data extension" [owner: Susan Malaika] is **Ongoing** (Note: Due 2013-01-10)

AI#0018
: "Prepare Working Draft 01 (WD01) version of OData Extension for Temporal Data" [owner: Andrew Eisenberg] is **Ongoing**

AI#0019
: "Prepare Working Draft 01 (WD01) version of OData Extension for XML Data" [owner: Andrew Eisenberg] is **Ongoing**

AI#0020
: "Prepare Working Draft 01 (WD01) version of OData Extension for JSON Data" [owner: Susan Malaika] is **Ongoing**
  

###4.1 Action items due by 2012-12-20 (end of day)###

None.

###4.2 Action items NOT due by 2012-12-20 but MAY be ready for closure###

None. 

##5 Review of [Issues List](https://tools.oasis-open.org/issues/secure/IssueNavigator.jspa?reset=true&mode=hide&pid=10103&sorter/field=issuekey&sorter/order=ASC) (IL) and Progress##

###5.1 Issues in Applied state###

####5.1.1 OData CSDL####

#####5.1.1.1 [ODATA-123](https://tools.oasis-open.org/issues/browse/ODATA-123)#####

ODATA-123
: "Referential constraint: prose text does not properly reflect case of optional principal" [component: OData CSDL] is **Proposed**.

Ralf:
>I **move** to close ODATA-123. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-123
: "Referential constraint: prose text does not properly reflect case of optional principal" [component: OData CSDL] is **Closed** with no objections.

###5.2 Issues in Proposed State (carried over from 2012-NOV-29 meeting)###

####5.2.1 OData CSDL####

#####5.2.1.1 [ODATA-15](https://tools.oasis-open.org/issues/browse/ODATA-15)#####

ODATA-15
: "precision for functions that have Edm.DateTime or Edm.DateTimeOffset parameters" [component: OData CSDL] is **New**.

Discussion:

* Mike states, we addressed this issue by: 1) Adding a function, now, to return the current datetime (original issue)  and 2) verifying that it is possible to define a custom function without specifyinig a precision (just as for the built-in functions). So he believes this issue can be closed.
* Andrew responds that he believes that it is addressed with: section 6.2.4 The Precision Attribute
A temporal or decimal edmroperty MAY define a value for the Precision attribute. (Perhaps that needs to be expanded to function signatures). In summary he believes some editorial work may be needed here.

Mike:
>I **move** we resolve ODATA-15 by providing direction to the editors to ensure that the precision attribute is optional when defining custom functions. **Andrew seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-15
: "precision for functions that have Edm.DateTime or Edm.DateTimeOffset parameters" [component: OData CSDL] is **Proposed as moved** with no objections.

#####5.2.1.2 [ODATA-121](https://tools.oasis-open.org/issues/browse/ODATA-121)#####

ODATA-121
: "Please clarify whether agents handling DateTimeOffset must preserve the UTC offset" [component: OData CSDL] is **New**.

Mike:
>I **move** we resolve ODATA-121 by recommending that servers SHOULD preserve the offset value (to allow for implementations that have no way to persist the offset value and must normalize to UTC). **Martin seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-121
: "Please clarify whether agents handling DateTimeOffset must preserve the UTC offset" [component: OData CSDL] is **Proposed** with no objections.

#####5.2.1.3 [ODATA-11](https://tools.oasis-open.org/issues/browse/ODATA-11)#####

ODATA-11
: "date/time values without explicit time zones need further investigation" [component: OData CSDL] is **New**.

Discussion:

* Andrew states, that xs:dateTimeStamp, derived from xs:dateTime, requires timezone.

Mike:
>I **move** we resolve ODATA-11 as proposed. **Andrew seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-11
: "date/time values without explicit time zones need further investigation" [component: OData CSDL] is **Proposed** with no objections.

#####5.2.1.4 [ODATA-14](https://tools.oasis-open.org/issues/browse/ODATA-14)#####

ODATA-14
: "add Edm.Date to the OData primitive data types" [component: OData CSDL] is **New**.

Andrew:
>I **move** to accept proposal in ODATA-14. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-14
: "add Edm.Date to the OData primitive data types" [component: OData CSDL] is **Proposed** with no objections.

#####5.2.1.5 [ODATA-173](https://tools.oasis-open.org/issues/browse/ODATA-173)#####

ODATA-173
: "Remove OnDelete element" [component: OData CSDL] is **New**.

Discussion:

* Mike thinks, in the upcoming delta scenarios the element might become useful, which was in the past (where synchronous usage dominated) not the case. He thinks it helps the client in a disconnected scenario.
* Mike asks if there is a difference (eg. in SQL) between None and Restrict. He suggestst to find out about the correct default and then come back to the issue
* All agree.

**No further discussion**. **No objections**. 

ODATA-173
: "Remove OnDelete element" [component: OData CSDL] is is **Open** with no objections.

#####5.2.1.6 [ODATA-175](https://tools.oasis-open.org/issues/browse/ODATA-175)#####

ODATA-175
: "Define IsAlwaysBindable attribute for FunctionImport element" [component: OData CSDL] is **New**.

Discussion:

* Mike asks, if this could become an Annotation instead of an Attribute build into the data model.
* Ralf responds, that we then will need to define a vocabulary and publish the place where we do this.
* Mike and Ralf both think this will be necessary anyway.
* Mike suggests to go ahead, and that he will create a new JIRA issue to further form the concrete solution or move it to the final place in the specification.
* All agree.

Ralf:
>I **move** to resolve ODATA-175 as proposed. **Marin seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-175
: "Define IsAlwaysBindable attribute for FunctionImport element" [component: OData CSDL] is **Proposed** with no objections.

####5.2.2 OData Protocol####

#####5.2.2.1 [ODATA-157](https://tools.oasis-open.org/issues/browse/ODATA-157)#####

ODATA-157
: "Specify how client correlates requests within a changeset with responses" [component: OData Protocol] is **New**.

Mike:
>I **move** we resolve ODATA-157 by requiring clients specify a Content-Id for each statement within a changeset, and allow services to return individual statements within a changeset in any order, and that they MUST include the content-id for the client to correlate requests with responses. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-157
: "Specify how client correlates requests within a changeset with responses" [component: OData Protocol] is **Proposed as moved** with no objections.

#####5.2.2.2 [ODATA-111](https://tools.oasis-open.org/issues/browse/ODATA-111)#####

ODATA-111
: "Define supported numeric promotions" [component: OData Protocol] is **New**.

Discussion:

* Andrew asks if this only applies to numierc operators or all parameters from functions ?
* Mike expects this also to apply to filter expressions and all function parameters which are expected to have a numeric type.
* Mike clarifies that we don't support promotions between string and numeric
* Mike updated proposal in JIRA embracing the discussion (area of application).

Mike:
>I **move** we accept ODATA-111 as proposed, with the clarifications that it applies to function parameters and comparisons w/in a filter expression, and that we explicitly clarify that we don't support implicit conversions between string and numeric types. **Andrew seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-111
: "Define supported numeric promotions" [component: OData Protocol] is **Proposed** with no objections.

#####5.2.2.3 [ODATA-177](https://tools.oasis-open.org/issues/browse/ODATA-177)#####

ODATA-177
: "Allow entities to be members of multiple entity sets" [component: OData Protocol] is **New**.

Discussion:

* Mike summarizes his concerns (as noted in his comments in the issue).
* Martin also thinks, that it is not natural to say an entity can not be a member in more than one entityset, thus seconding Ralfs point of view.
* Mike suggest to clearly describe how to model what in a database would be a view, which does not imply where the entity lives (physically).
* Andrew asks, where the difference between the primary and the virtual instance of an entity would be.
* Mike responds, that he does not distnguish into primary and virtual.
* Andrew understands this as a collection of entities versus an entityset.
* Mike summarizes, that view shall be modelled as navigational properties, thus there is no need to change our definition of the entityset.
* Ralf sees the remaining issue of this approach, that only entitysets may be directly advertised.
* Ram reminds all to wrap up the discussion to accomodate for the elapsed time

**No further discussion**. **No objections**.

ODATA-177
: "Allow entities to be members of multiple entity sets" [component: OData Protocol] is **Open** with no objections.

Note:
>Time slot for issue processing gone. Skip all remaining agenda sub items of 5.

##6 Next Meetings##

###6.1 2012-JAN-10 Conference Call 08-09am PT###

Agreed. 

##7 AOB##

 * Mike kindly asks all members to please read the updated proposal [Delta Protocol Proposal 1.1](https://www.oasis-open.org/committees/download.php/47755/OData%20Delta%20Query%20Protocol%20Design%202012-12-19.docx) he uploaded yesterday and give feedback through the mailing list.
 
None. 

### Meeting adjourned on 0901 PT.###

# Appendices#
## Timeline Reference [TL_REF] ##
  
Here is a rough draft of a timeline for the OData core work products:

* December 2012
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
