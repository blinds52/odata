Thanks a lot for the interesting read, Martin!

As already practiced with the JSON Format document revision issue, I prefer to put my complete feedback of the first iteration into one comment, so that you may consider it as a whole and we do not drown in a flood of minor issues on a phrase level of the documents.

If there is interest in or objection against specific feedback items, I will be happy to invest the extra work and pull these into dedicated JIRA issues.

Comments are structured by bracketing the location range in the document revision [OData ATOM Format Version 1.0 Working Draft 01](https://www.oasis-open.org/committees/download.php/46705/odata-atom-format-v1.0-wd01-2012-08-17-MZ.doc) and then detailing this in globally enumerated feedback items (currently A-Y).

Review iteration is now complete.

#1 Introduction#

##Feedback A)##

1st para, second phrase:

This document describes the OData Atom Format returned from an OData Service when requesting the application/atom+xml mime type.

**SHOULD** be replaced with eg:

This document describes the OData Atom Format `of the payload` returned from an OData Service when requesting the application/atom+xml mime type.

Benefit `is a more precise description and introduces the term payload used in the following para.`


##Feedback B)##

2nd para, 13th list item:

* an error

**SHOULD** be replace with eg:

* an error` document`

Benefit `is a more precise description of the concrete form which is described by that item`. If it is an OData type, than this should be noted accordinglye.

#1.2 Normative References#

##Feedback C)##

The `sequence of the references` **SHOULD** be realized as an `alphabetic ordering on the reflabels` (inside the square brackets). 

Benefit: `Since already a left-rooted naming convention of the reflabels is implemented, there is no reason to not sort these entries alphabetically.` Note: Otherwise a reader might expect grouping by topic or chronological ordering, which is not the case here.

##Feedback D)##

The refentries with respect to IETF RFCs **MAY** be changed to consistently bear sub entries with a space between the string "IETF RFC" and the number of the RFC like in the refentry with label **[RFC2119]**.
Eg. for **[RFC5023]** write `IETF RFC 5023` instead of  `IETF RFC5023`.

Benefit is `consistency and readability`.

##Feedback E)##

Missing reference to RFC 3629. In document section "3 Primitive Types in Atom" inside the field "Literal Form" of the ""Primitive Type" **Edm.String** it reads:

any UTF-8 character Note: See definition of UTF8-char in **[RFC3629]** 
but this reference is missing in the references section, thus I propose to insert a refentry like:

[RFC3629]	F. Yergeau “UTF-8, a transformation format of ISO 10646”, IETF RFC 3629, November 2003. http://www.ietf.org/rfc/rfc3629.txt

Benefit should be `consistency`.

##Feedback F)##

Missing reference to xxx. In document section "3 Primitive Types in Atom" inside the field "Literal Form" of the ""Primitive Type" **Edm.Time** it reads:

Defined by the lexical representation for time at `http://www.w3.org/TR/xmlschema-2`

and for **Edm.DateTimeOffset** it reads:

Defined by the lexical representation for datetime (including timezone offset) at `http://www.w3.org/TR/xmlschema-2`

I propose to replace the URL inside these two entries by a local reflabel along the lines of **[XML-XSD-P2]** linked to a new refentry created before as eg:

**[XML-XSD-P2]** P. V. Biron, A. Malhotra "XML Schema Part 2: Datatypes Second Edition", World Wide Web Consortium, W3C Recommendation, 28 October 2004. http://www.w3.org/TR/xmlschema-2/

into the references section and rewrite the table entries in the referring section accordingly.

Benfit should be `consistency`.

#4.1.3 OData Data Namespace#

##Feedback G)##

The first paragraph reads 

Elements that describe the actual data values for an entity are qualified with the OData Data Namespace: “`http://schemas.microsoft.com/ado/2007/08/dataservices`”

This URL **SHOULD** be changed to the final oasis based namespacing URL starting with `http://docs.oasis-open.org/odata/ns/` and as noted in [Issue OData-19](https://tools.oasis-open.org/issues/browse/ODATA-19), when the resolution of OData-19 is settled.

Benefit is `consistency`.

#4.1.4 OData Metadata Namespace#

##Feedback G)##
The first paragraph reads 

Attributes and elements that represent metadata (such as type, null usage, and entry-level etags) are defined within the OData Metadata Namespace: “`http://schemas.microsoft.com/ado/2007/08/dataservices/metadata`”. Custom elements or attributes MUST NOT use this namespace.

This URL **SHOULD** be changed to the final oasis based namespacing URL starting with `http://docs.oasis-open.org/odata/ns/` and as noted in [Issue OData-19](https://tools.oasis-open.org/issues/browse/ODATA-19), when the resolution of OData-19 is settled.

Benefit is `consistency`.

#5.1 Entity Instances#

##Feedback H)##

Inside the example the two occurences of namespace-like links (in the values of the rel attribute of the link elements) **SHOULD** be updated in alignment with the resolution of [Issue OData-19](https://tools.oasis-open.org/issues/browse/ODATA-19).

Also the value of the attribute should IMO be guarded by quotes, i.e. instead of 

<link rel=http://schemas.microsoft.com/ado/2007/08/dataservices/related/Category type="it **SHOULD** read (using the old namespace as sample):
<link rel=`"`http://schemas.microsoft.com/ado/2007/08/dataservices/related/Category`"` type="All other occurences of namespaces **should** be changed accordingly.Benefit is `consistency` and syntactic correctness of examples.
##Feedback I)##

The sample code is not valid standalone as is. 

IMO this is ok, as long as we have a place in the document instructing the reader, how to construct a validating piece of XML from it.

In the case of this sample, the reader has to amend the element `<entry>` as `<entry xmlns:data="foo" xmlns:metadata="bar">` and (fix an error described in **Feedback J**).

Benefit is a `useful compromise between readability and usability`

##Feedback J)##
The sample code contains (I presume for historical reasons) the term `<data:ID m:type="Edm.Int32">` which **SHOULD** be corrected with regard to the correct namespace prefix `metadata` i.e. `<data:ID metadata:type="Edm.Int32">`.

Benefit is `consistency` and syntactic correctness of examples.

#5.1.1.1 The metadata:etag Attribute#

##Feedback K)##

The last sentence of the only paragraph in this subsection reads 

For details on how `ETags` are used, see to [OData-Core].Which is the usual CamelCase notation of synthetic words and is perfectly consistent with the RFC 2616 where it says in section 
"14.19 ETag
The ETag response-header field provides the current value of the entity tag for the requested variant.[…]"
In other places of the OData-Atom document like eg. "4.1.4 OData Metadata Namespace" 1st para 1st sentence it says:
"Attributes and elements that represent metadata (such as type, null usage, and entry-level `etags`) […]
I hereby propose to consistently write the terms either as syntethic term in the form `ETag` or as native language term `entity-tag` (or the like, I am not a hyphenation expert neither in German nor in English ;-).

Benefit is `consistency`.

#5.1.4.1 The rel attribute of a Link Representing a Stream Property#

##Feedback L)##

Please consider **rewriting** the first two paragraphs to emphasize the distinguishing element (`read`versus `write`) instead of provoking the appearance of a doubled text.

So instead of the current:

`The rel attribute for an atom:link element that can be used to retrieve a stream property is made up of the name of the OData Data Namespace, followed by the string “/mediaresource/”, followed by the name of the stream property on the entity.` `The rel attribute for an atom:link element that can be used to write a stream property is made up of the name of the OData Data Namespace, followed by the string “/edit-media/”, followed by the name of the stream property on the entity.`please consider **writing instead** something like:

`To enable retrieval of a stream property, the rel attribute for an atom:link element is made up of the name of the OData Data Namespace, followed by the string “/mediaresource/”, followed by the name of the stream property on the entity.` `To enable writing [to] a stream property, the rel attribute for an atom:link element is made up of the name of the OData Data Namespace, followed by the string “/edit-media/”, followed by the name of the stream property on the entity.`
Note: I assume the usual shorthand that the `attribute` means the `value of the attribute` is ok, but I am not sure, if it is meant to write `a stream`or `to a stream`.
Also _optionally_ ensure in subsequent "final revisions" that the third paragraph mandating the use of absolute URLs as values of the rel-attribute of the atom:link elements is `not on a separate page`, since distributing such a small paragraph on two pages weakens readability.

Benefits are `clearness`and `readability`.


#5.1.11.1 Entity Property as a data:[propertyName] Element#

##Feedback O)##

The sample reads 

<data:Rating `m`:type="Edm.Int32">4</data:Rating> 

it should maybe changed to 

<data:Rating `metadata`:type="Edm.Int32">4</data:Rating> 

Benefit is `metadata` is already introduced as namespace handle.

#5.2.2 The atom:id Element within an atom:feed#

##Feedback P)##

As in some other places the RFC2119-Terms are not formatted to stand out by all uppercase:

The only paragraph in this section:

The atom:id element defines a durable, opaque, globally unique identifier for the feed. Its content `must` be an IRI as defined in [RFC3987]. The consumer of the feed `must not` assume this IRI can be de-referenced, nor assume any semantics from its structure.

should be changed to:

The atom:id element defines a durable, opaque, globally unique identifier for the feed. Its content `MUST` be an IRI as defined in [RFC3987]. The consumer of the feed `MUST NOT` assume this IRI can be de-referenced, nor assume any semantics from its structure.

Benefit is `readability`

#5.2.3 Count as a metadata:count Element#

##Feedback Q)##

The only paragraph in that section:

The atom:feed element `may` contain an `m`:count element to specify the total count of rows in the result. This `may` be greater than the number of rows in the feed if server side paging has been applied, in which case the feed will include a next results link.

should be changed to (with the exception of the term **will**):

The atom:feed element `MAY` contain an `metadata`:count element to specify the total count of rows in the result. This `MAY` be greater than the number of rows in the feed if server side paging has been applied, in which case the feed **will** include a next results link.

Benefits are `readability and clarity`

Note: Please investigate if the usage of the term **will** is correctly representing the requirement. 
As I understand it is more probable, that a `MUST` better describes the requirements level, since it is a description of the server response, isn’t it?

#5.2.4 Self-Links as atom:link Elements#

##Feedback R)##

Second paragraph, suggest to replace `may` with `MAY`.

Benefit `readability`


#5.2.5 Additional Results as an atom:link element #

##Feedback S)##

The first paragraph:

The atom:feed element `may` contain a “next link” to indicate the presence of additional entries that belong to the feed. Such a link is represented as an atom:link with a rel attribute of "next" and an href attribute containing a URL that can be used to retrieve the next set of results. 

should be replaced by:

The atom:feed element `MAY` contain a “next link” to indicate the presence of additional entries that belong to the feed. Such a link is represented as an atom:link with a rel attribute of "next" and an href attribute containing a URL that can be used to retrieve the next set of results. 

Benefit is `readability`

Note: It may be beneficial to rewrite that paragraph to be able to state a tougher requirement along the lines of:

The atom:feed element `MAY` contain a “next link”`.
In the case, that additional entries belong to the feed the atom:feed element MUST contain a “next link” to indicate the presence of these entries.` Such a link is represented as an atom:link with a rel attribute of "next" and an href attribute containing a URL that can be used to retrieve the next set of results. 

##Feedback T)##

Please cosider changing the last paragraph:

The contents of the href `should` be treated as an opaque URL that can be used to fetch the next set of results.

into:

The contents of the href `SHOULD` be treated as an opaque URL that can be used to fetch the next set of results.

Benefit is `readability`

#6.1.1 The metadata:metadata Attribute for an Action#

##Feedback U)##

The second paragraph:

This function import name `must` be unique within the entity container. 

might be changed into:

This function import name `MUST` be unique within the entity container. 

Benefit is `readability`


#7	Functions#

##Feedback V)##

First paragraph:

Zero or more functions `may` be associated with a feed or entry.

might be changed into:

Zero or more functions `MAY` be associated with a feed or entry.

Benefit is `readability`

#8	Annotations#

##Feedback W)##

Please consider first paragraph:

In OData version **3.0**, annotations `may be` appear as a child to any of the following elements: <atom:feed>, <atom:entry>, <metadata:properties>, <metadata:function>, <metadata:action>, <metadata:error>, or <atom:link> where rel indicates a navigation link or named stream. 

to be changed into:

In OData version **3.0**, annotations `MAY` appear as a child to any of the following elements: <atom:feed>, <atom:entry>, <metadata:properties>, <metadata:function>, <metadata:action>, <metadata:error>, or <atom:link> where rel indicates a navigation link or named stream. 

Benefit is `consistency and readability`.

Note: The literal version specifier **3.0** in the mentioned paragraph should be checked in the light of the relevant JIRA-Issue ODATA–17 (and its resolution). Probably a condition like **3.0 and later** 
is correct and future proof?

#11	Collections of Primitive or Complex Scalar Values#

##Feedback X)##

First paragraph, second sentence:

A collection is a single root element containing zero or more `<metadata:element> elements` whose content is an individual primitive or complex property as defined above.

has yellow background color marking `<metadata:element> elements`.

Note: his should be removed or a comment/change indicated by the yellow marking be applied.

2nd Note (with regard to property classification):
The link to linktext `primitive`in above sentence points to `simple`properties. Maybe stay with the simple labelling instead of introducing duality.

#13.2  Link as a data:uri Element#

##Feedback Y)##

Second paragraph:

The content of the data:uri element is the `Canonical URL` for the related entity.

has the words `Canonical URL` marked with yellow background.

Better remove or specify the thought behind the coloring.


#Misc. Places#

##Feedback M)##

The wording of the relation between attributes (or their values) and the respective elements in describing paragraphs is varying as (`on`|`of`|`for`). I know that kind of prose is always tedious writing (and reading) but maybe we **should** try bo be consistent with the selection of this (relating) word.

Benefit is `consistency` (and not to vary just to vary).

##Feedback N)##

Note/Question: Like with the streams, there is (at least in my OData freshman's head) unclear if it really meant that a client may write `to` a BLOB associated with an entity, or if she may `write the BLOB` associated with an entity. 
I tend to suggest the latter, or are incremental updates like positional appends possible vuia OData?


 

#Session completed#