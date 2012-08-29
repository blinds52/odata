Thanks a lot for providing this first draft, Mike! 

As already practiced with the other document revision issues, I prefer to put my complete feedback of the first iteration into one comment, so that you may consider it as a whole and we do not drown in a flood of minor issues on a phrase level of the documents. 

If there is interest in or objection against specific feedback items, I will be happy to invest the extra work and pull these into dedicated JIRA issues. 

Comments are structured by bracketing the location range in the document revision [OData URL Conventions Version 1.0 Working Draft 01](https://www.oasis-open.org/committees/download.php/46751/odata-url-conventions-v1.0-wd01-2012-08-22.doc) and then detailing this in globally enumerated feedback items (currently A-E). 


Review iteration is paused.

#2 URL Components#

##Feedback A)##

The second of the two examples after:

`The following are two example URLs broken down into their component parts:`

does not show the alignment between the sample url and the illustrative range bracketing and labeling.

This **SHOULD** be rearranged.

Benefit is `readability`

##Feedback B)##

Since the subsequent chapters 3,4 and 5 are covering the three main components of a URL as introduced in this chapter (2), a guiding sentence should be amendend after the example in the line of:

`Mandated and suggested content of these three significant URL components used by an OData service are covered in sequence in the three following chapters.`

Benefit is `clarity and readability`.

#3	Service Root URL#

##Feedback C)##

Consider splitting and rewriting the only paragraph of this section:

`The service root URL identifies the root of an OData service. The resource identified by this URL MUST be an AtomPub Service Document (as specified in [RFC5023]) and follow the OData conventions for AtomPub Service Documents (or an alternate representation of an Atom Service Document if a different format is requested). [OData-JSON] specifies such an alternate JSON-based representation of a service document. The service document is required to be returned from the root of an OData service to provide clients with a simple mechanism to enumerate all of the collections of resources available for the data service.`

as:

`The service root URL identifies the root of an OData service. This URL MUST point to an AtomPub Service Document (as specified in [RFC5023]).` 

`Per default this service document MUST follow the OData conventions for AtomPub Service Documents. If a different format has been explicitely requested, a corresponding alternate representation of an Atom Service Document MUST be delivered. [OData-JSON] specifies such an alternate JSON-based representation of a service document.` 

`Regardless of format, the service document is required to be returned from the root of an OData service to provide clients with a generic and simple mechanism to enumerate all collections of resources offered by the data service.`

Benefit is `clarity and readability`.
 

#4	Resource Path#

##Feedback D)##

Please consider splitting and rewriting the first of the two paragraphs:
`The resource path construction rules defined in this section are optional. OData services are encouraged to follow the URL path construction rules (in addition to the required query string rules) as such consistency promotes a rich ecosystem of reusable client components and libraries.`
as:

`The rules for resource path construction as defined in this section are optional. OData services MAY follow some or all of the subsequently described URL path construction rules and are indeed encouraged to do so, as such a service cross consistency promotes a rich ecosystem of reusable client components and libraries.` 

**Note**`: The query string rules as described in the next chapter are required and MUST be followed by any OData service.`
Benefit is `clarity and readability`.
##Feedback E)##

Please consider splitting and rewriting the second of the two paragraphs:
`The resource path section of a URL identifies the resource to be interacted with (such as Customers, a single Customer, Orders related to Customers in London, and so forth). The resource path enables any aspect of the data model (collections of entities, a single entity, properties, Links, service operations, and so on) exposed by an OData service to be addressed.`
along the lines of:

`Any aspect of any resource exposed by an OData service MUST be addressable by a corresponding resource path URL component to enable interaction of the client with that resource aspect.`

`To illustrate the context, some examples for resources might be: Customers, a single Customer, Orders related to Customers in London, and so forth. Examples of addressable aspects of these resources as exposed by the data model might be: collections of entities, a single entity, properties, Links, service operations, and so on.`
Benefit is `clarity and readability`.

#Session paused#