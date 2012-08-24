First of all, thank you Ralf for providing the initial working draft for the OData Common Schema Definition Language (CSDL) Specification.

As already practiced with the JSON and Atom Format document revision issue, I prefer to put my complete feedback of the first iteration into one comment, so that you may consider it as a whole and we do not drown in a flood of minor issues on a phrase level of the documents.

If there is interest in or objection against specific feedback items, I will be happy to invest the extra work and pull these into dedicated JIRA issues.

Comments are structured by bracketing the location range in the document revision [OData CSDL Version 1.0 Working Draft 01](https://www.oasis-open.org/committees/download.php/46707/odata-csdl-v1.0-wd01-2012-08-17-RH.doc) and then detailing this in globally enumerated feedback items (currently A-E).

Note: I paused reviewing around page 18 i.e. at "4.3 The edmx:Reference Element"

#Abstract#

##Feedback A)##
The last sentence of the abstract reads:

CSDL is based on standards defined in `[XML-1.1]` and `[XML-Schema]`.

Since this is an abstract that should be considered as standalone essence from main document, it **MAY** be better for the reader, to read explicit document titles instead of being forced to jump to the relevant reflables explanations/targets.

Thus I propose to change the abstract from this:

`OData services are described by an Entity Data Model (EDM). Common Schema Definition Language (CSDL) defines an XML-based representation of the entity model exposed by an OData service. CSDL is based on standards defined in [XML-1.1] and [XML-Schema].`

into something like the following (but please be aware, that I am **not** a native English speaker):

`An Entity Data Model (EDM) describes OData services. The Common Schema Definition Language (CSDL) defines a representation of the entity model exposed by an OData service. CSDL is articulated in the W3C Extensible Markup Language (XML) and based upon the W3C XML Schema Definition Language (XSD).`

Benefit is that the `abstract is fully understandable in itself`.


#1 Introduction#

##Feedback B)##

General remark (also relevant for eg. Atom Format document): I do not know, if a reader after having read the abstract loves to start with an introduction that exactly reproduces the abstract. 
I think we **MAY** do better, by giving the first paragraph of an introduction more space to evolve. Here is a good place, to further detail versions that are required of the supplementing standards (like eg. 1.1 instead of 1.0 for XML and XSD) and the like.

Proposal: Rewrite the first paragraph in that spirit from the current (not reusing the proposed resolution from **Feedback A**):

`OData services are described by an Entity Data Model (EDM). Common Schema Definition Language (CSDL) defines an XML-based representation of the entity model exposed by an OData service. CSDL is based on standards defined in [XML-1.1] and [XML-Schema].`

into maybe:

`OData services are described in terms of an Entity Data Model (EDM). Many representations of such models are possible. The Common Schema Definition Language (CSDL) defines one representation of the entity model exposed by an OData service. CSDL is articulated in the ""Extensible Markup Language (XML) 1.1 (Second Edition)" [XML-1.1] with further building blocks from the ""W3C XML Schema Definition Language (XSD) 1.1" as described in [XML-Schema-1,XML-Schema-2].`

Benefit is `giving the reader something new in addition to the abstract`. Note: I would split the existing XML-Schema reflabel into the two as described above, since it links to real document targets and not a meta page.

##Feedback C)##
The second (and last) paragraph of the introduction reads:

An OData service SHOULD provide a CSDL description of its entity model when a client requests a description of the entity model by sending a GET request to <serviceRoot>/$metadata. `$metadata` MUST wrap the CSDL document in `an EDMX wrapper`.

I think this forward reference `EDMX wrapper` brings two problems with it by not following:

1. An introduction should use general terms preparing the uninitiated leaving out details for later sections
2. The target of an index reference should directly deliver the place of explanation.
 
To explain the 2. problem in this case: The concrete innerdocument link goes to something (as defined in the fieldfunction as `3 Entity Model` ()i.e. "{HYPERLINK  \l "_3_Entity_Model" }") but it actually results in "4	Entity Model Wrapper Constructs" which is ok, if understood and actually meant.

I thus propose to replace the last sentence

`$metadata MUST wrap the CSDL document in an EDMX wrapper`

 with these two:
 
 `The CSDL document inside the response to the $metadata request MUST be placed under a single root element of the Entity Data Model Namespace. This Namespace and its elements are defined in the following sections.`

Benefit is `Readability` and `Guidance`.


#1.2 Normative References#

##Feedback D)##

As already indicated in **Feedback B** I hereby suggest to replace the meta reference 

`[XML-Schema]	Gao, S. et al., “W3C XM Schema Definition Language (XSD) 1.1”, W3C Recommendation, 5 April 2012. http://www.w3.org/standards/techs/xmlschema#w3c_all.`

with to references, that actually yield final document link targets eg:

`[XML-Schema-1]	Gao, S. et al., “W3C XML Schema Definition Language (XSD) 1.1 Part 1: Structures”, W3C Recommendation, 5 April 2012. http://www.w3.org/TR/xmlschema11-1/`

`[XML-Schema-2]	Peterson, D. et al., “W3C XML Schema Definition Language (XSD) 1.1 Part 2: Datatypes”, W3C Recommendation, 5 April 2012. http://www.w3.org/TR/xmlschema11-2/`

Benefit is as already stated. Note: Usage of reflables has to be updated accordingly. It should be easy to write 
`[XML-Schema-1,XML-Schema-2]`everywhere instead of `[XML-Schema]` where really both aspects are referenced. If a place in the document in fact only references eg. `[XML-Schema-2]` we now MAY make this explicit

I also suggest alphabetic ordering on the reflables, thus placing `[OData-Core]` after `[OData-ABNF]`.


# Skipped in this session #

#4.3 The edmx:Reference Element#

##Feedback E)##

The sample code is not valid as a document per se. 

IMO this is ok, as long as we have a place in the document instructing the reader, how to construct a validating piece of XML from it.

Additionally in the case of this `example [that] demonstrates usage of the reference element to reference entity models that contain entity types and complex types that are used as vocabulary terms` the reader has to replace `true`with `yes`,  since as it stands, it is invalid (as XML) since the standalone document declaration must be either `yes` or `no`.

So I propose, to change the example from:

`<?xml version="1.0" encoding="UTF-8" standalone="true"?>
<edmx:Edmx xmlns:edmx="http://schemas.microsoft.com/ado/2007/06/edmx" 
           Version="1.0">
 <edmx:Reference Url="http://vocabs.odata.org/capabilities/v1.0" />
 <edmx:Reference Url="http://vocabs.odata.org/display/v1.0" />
 <edmx:DataServices ...>
</edmx:Edmx>`

to the _lovely_ compromise (still invalid, but ok):

`<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<edmx:Edmx xmlns:edmx="http://schemas.microsoft.com/ado/2007/06/edmx" 
           Version="1.0">
 <edmx:Reference Url="http://vocabs.odata.org/capabilities/v1.0" />
 <edmx:Reference Url="http://vocabs.odata.org/display/v1.0" />
 <edmx:DataServices ...>
</edmx:Edmx>`


Benefit: `consistency` and syntactic correctness of examples. Note: Simply replacing the `...` with eg. `<edmx:DataServices/>` by the _explorative_ reader would yield a valid document to her.


#End of session#