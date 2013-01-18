#OData Conference Call #21, Thursday, 17 Jan 2013,  0800 - 0900 PT

**Note**: For explanations of conventions and other formal aspects common to OData TC meeting minutes which are used in this document please cf. "[Formal Aspects of Meeting Minutes](https://www.oasis-open.org/committees/download.php/47885/formal-aspects-meeting-minutes-v1.html)". 

Meeting chaired by Barbara Hartel

## 1. Roll call
 
### 1.1 Members Present:
 
        Andrew Eisenberg (IBM)        Barbara Hartel (SAP AG)        Colleen Evans (Microsoft)        Dale Moberg (Axway Software)        Diane Downie (Citrix Systems)        Gerald Krause (SAP AG)        Hubert Heijkers (IBM)        John Willson (Individual)        Ken Baclawski (Northeastern University)        Martin Zurmuehl (SAP AG)        Matthew Borges (SAP AG) a.k.a. Matt        Michael Pizzo (Microsoft) a.k.a. Mike        Patrick Durusau (Individual)        Ralf Handl (SAP AG)        Ram Jeyaraman (Microsoft)        Robert Richards (Mashery)        Stan Mitranic (CA Technologies)        Stefan Drees (Individual)        Susan Malaika (IBM)        Ted Jones (Red Hat)
Quorum achieved. Details cf. [normative attendance sheet for this meeting](https://www.oasis-open.org/apps/org/workgroup/odata/event.php?event_id=34180).

## 2. Approval of Agenda

Agenda approved as published. 

## 3. Approval of Minutes from Previous Meeting(s)

### 3.1 Approval of [Minutes of 2012-13-10 Meeting#20](https://www.oasis-open.org/committees/download.php/47887/odata-meeting-20_on-20130110-minutes.html):

**Meeting minutes approved with no objections**. 

### 3.2 Approval of [Errata for Minutes of 2012-11-08/09 Meeting#15 F2F](https://www.oasis-open.org/committees/download.php/47877/odata-meeting-15_on-20121108_9-F2F-minutes-errata.html):

**Errata for Meeting minutes approved with no objections**. 

### 3.3 Approval of [Formal Aspects of Meeting Minutes V1](https://www.oasis-open.org/committees/download.php/47885/formal-aspects-meeting-minutes-v1.html):

**Formal Aspects of Meeting minutes approved with no objections**. 

## 4. Review of [Action Items](https://www.oasis-open.org/apps/org/workgroup/odata/members/action_items.php) (AI) and Progress

###List of ongoing actions before the meeting

**Retrieval time stamp**: `2013-01-15 16:00 +01:00`.

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
  
###4.1 Action items due by 2013-01-17 (end of day)

None.

###4.2 Action items NOT due by 2013-01-17 but MAY be ready for closure

None. 

##5 Review of [Issues List](https://tools.oasis-open.org/issues/secure/IssueNavigator.jspa?reset=true&mode=hide&pid=10103&sorter/field=issuekey&sorter/order=ASC) (IL) and Progress

###5.1 Issues in Applied state

####5.1.1 OData ABNF Construction Rules

#####5.1.1.1 [ODATA-190](https://tools.oasis-open.org/issues/browse/ODATA-190)

ODATA-190
: "Remove primitive type Edm.Float as a synonym for Edm.Single" [component: ODATA ABNF Construction Rulles] is **Applied**. 

Discussion:

* Hubert: Also applied to JSON document?
* Ralf: Will check after the meeting and if not, will do so.

Ralf: 
>I **move** to close ODATA-190 as applied. **Hubert seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-190
: "Remove primitive type Edm.Float as a synonym for Edm.Single" [component: ODATA ABNF Construction Rulles] is **Closed** with no objections. 

####5.1.2 OData CSDL

#####5.1.2.1 [ODATA-15](https://tools.oasis-open.org/issues/browse/ODATA-15)

ODATA-15
: "precision for functions that have Edm.DateTime or Edm.DateTimeOffset parameters" [component: OData CSDL] is **Applied**. 

Ralf: 
>I **move** to close ODATA-15 as applied. **Andrew seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-15
: "precision for functions that have Edm.DateTime or Edm.DateTimeOffset parameters" [component: OData CSDL] is **Closed** with no objections. 

#####5.1.2.2 [ODATA-175](https://tools.oasis-open.org/issues/browse/ODATA-175)

ODATA-175
: "Define IsAlwaysBindable attribute for FunctionImport element" [component: OData CSDL] is **Applied**. 

Ralf: 
>I **move** to close ODATA-175 as applied. **Hubert seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-175
: "Define IsAlwaysBindable attribute for FunctionImport element" [component: OData CSDL] is **Closed** with no objections.

#####5.1.2.3 [ODATA-186](https://tools.oasis-open.org/issues/browse/ODATA-186)

ODATA-186
: "Multiple navigationpropertybindings for the same navigation property should be prohibited" [component: OData CSDL] is **Applied**. 

Ralf: 
>I **move** to close ODATA-186 as applied. **Hubert seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-186
: "Multiple navigationpropertybindings for the same navigation property should be prohibited" [component: OData CSDL] is **Closed** with no objections.

#####5.1.2.4 [ODATA-196](https://tools.oasis-open.org/issues/browse/ODATA-196)

ODATA-196
: "Remove sections 15.2.6 FunctionReference and 15.2.12 ParameterReference" [component: OData CSDL] is **Applied**. 

Ralf: 
>I **move** to close ODATA-196 as applied. **Hubert seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-196
: "Remove sections 15.2.6 FunctionReference and 15.2.12 ParameterReference" [component: OData CSDL] is **Closed** with no objections.

###5.2 Issues in Proposed state (carried over from Nov 29, 2012 TC meeting)

####5.2.1 OData Protocol

#####5.2.1.1 [ODATA-166](https://tools.oasis-open.org/issues/browse/ODATA-166)

ODATA-166
: "Inconsistent lifted operators for $filter" [component: OData Protocol] is **New**. 

Discussion:

* Mike explains his reasoning behind the proposed compromise for handling comparisons to NULLs  as to simplify requests
* Matt understands the proposal as an overloading of the equal operator and is not in favor of this. He also adds, that i the given examples extra comparisons are nevertheles necessary, thus challenging the simplification claim of the proposal.
* Matt thinks (maybe because of his SQL/database background) that A = B or B is NULL looks much clearer.
* Andrew: So, $filter=haircolor eq eyecolor is undefined when both properties are null?
* Ralf responds, that it's currently false, as OData uses two-valued logic
* Andrew does not believe that we say that comparison of nulls is either true or false
* Matt states another sample b1 and b1 -&gt; false, b1 or b1 -&gt; false, not ( b1 or b1 ) -&gt; true so not b1 should be true
* Ken: Is there an explicitly stated mapping of database logical expressions to OData?
* Matt: But the v2 and v3 spec say that not b1 will be null
* Stefan: If interfacing the database world to a programming world there has to be a defined interface from two valued to three valued logic, as in the latter a null literal is allways equal to another null literal.
* Barabara asks if this discussion should be moved to the next Face to Face in Z&uuml;rich
* All agree and Matt and Mike will restart discussion in Z&uuml;rich
* Barbara asks to open ODATA-166

**No further discussion**. **No objections**. 

ODATA-166
: "Inconsistent lifted operators for $filter" [component: OData Protocol] is **Open** with no objections. 

#####5.2.1.2 [ODATA-187](https://tools.oasis-open.org/issues/browse/ODATA-187)

ODATA-187
: "Need to remove references to associations and associationsets from protocol doc" [component: OData Protocol] is **New**. 

Mike: 
>I **move** we accept OData-187 as proposed. **Ralf seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-187
: "Need to remove references to associations and associationsets from protocol doc" [component: OData Protocol] is **Resolved** with no objections. 

###5.3 Issues in Proposed state (carried over from Dec 13, 2012 TC meeting)

####5.3.1 OData ABNF Construction Rules

#####5.3.1.1 [ODATA-172](https://tools.oasis-open.org/issues/browse/ODATA-172)

ODATA-172
: "EntitySet may be qualified with namespace or alias and EntityContainer" [component: OData ABNF Construction Rules] is **Open**. 

Mike: 
>I **move** we accept the proposal for ODATA-172 as proposed. **Ralf seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-172
: "EntitySet may be qualified with namespace or alias and EntityContainer" [component: OData ABNF Construction Rules] is **Resolved** with no objections. 

###5.4 Issues in Proposed state (carried over from Jan 10, 2013 TC meeting)

####5.4.1 OData CSDL

#####5.4.1.1 [ODATA-54](https://tools.oasis-open.org/issues/browse/ODATA-54)

ODATA-54
: "EnumType/@UnderlyingType: allow Edm.String as underlying type for short code lists that are not numeric" [component: OData CSDL] is **New**. 

Discussion:

* Barbara asks for Opening this issue
* All agree. Issue is Open.

Mike: 
>I **move** we close ODATA-54 with no further action, given the serialization of enumerations as member names as described in the enumeration proposal. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-54
: "EnumType/@UnderlyingType: allow Edm.String as underlying type for short code lists that are not numeric" [component: OData CSDL] is **Closed as noted in the motion** with no objections. 

#####5.4.1.2 [ODATA-60](https://tools.oasis-open.org/issues/browse/ODATA-60)

ODATA-60
: "Allow complex properties or components of complex properties as key parts" [component: OData CSDL] is **Open**. 

Ralf: 
>I **move** to resolve ODATA-60 as proposed. **Stefan seconds**.

**No further discussion**. **No objections**. The **motion passes**.

ODATA-60
: "Allow complex properties or components of complex properties as key parts" [component: OData CSDL] is **Resolved** with no objections. 

**Note**:
>Time slot for issue processing gone. Skip all remaining agenda sub items of 5.

##6 Third F2F meeting Jan 30 - 31, 2013

###6.1 Any questions

**Context**: 
>We will be meeting F2F during Jan 30-31, 2013 in Z&uuml;rich, Switzerland. Details are available at [https://www.oasis-open.org/committees/event.php?event_id=34020](https://www.oasis-open.org/committees/event.php?event_id=34020) for the first and [http://www.oasis-open.org/committees/event.php?event_id=34021](http://www.oasis-open.org/committees/event.php?event_id=34021) for the second day.

Discussion:

None. 


##7 Next Meeting

###7.1 2013-JAN-24 Conference Call 08-09am PT

Agreed. 


##8 AOB##

None. 

### Meeting adjourned on 0900 PT.


# Appendices
## Timeline Reference [TL_REF]
  
Here is a rough draft of a timeline for the OData core work products:

* December 2012
    + December 19, 2012
        - File all known issues on core Work Products resulting from new proposals
* January 2013
    + January 17, 2012
        - File all known issues on core Work Products resulting from extension Work Products
    + Continue to resolve issues
    + 3rd F2F meeting January 30-31, 2013 (Z&uuml;rich, Switzerland) (details: [https://www.oasis-open.org/apps/org/workgroup/odata/event.php?event_id=34020](https://www.oasis-open.org/apps/org/workgroup/odata/event.php?event_id=34020))
        - Resolve all key issues on core Work Products
        - TC agrees to a high bar for accepting new issues on core Work Products
    + Continue to resolve issues
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
    + Address public review comments on core Work Products
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
    + *File all known issues on core Work Products resulting from extension Work Products*
* February and March 2013
    + Resolve issues on extension Work Products
* April 2-4, 2013 4th TC F2F meeting
    + Resolve issues and make progress on extension Work Products
* May 2013
    + Approve Committee Specification Draft 01 of extension Work Products (depending on progress)