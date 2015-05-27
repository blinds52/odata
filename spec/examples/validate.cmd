@echo off
set FILES=csdl-16.1.jsonschema csdl-16.2.jsonschema ExampleService.jsonschema miscellaneous.jsonschema MetadataService.jsonschema TM1$metadata.jsonschema TripPin.jsonschema Org.OData.Core.V1.jsonschema 
@rem Org.OData.Capabilities.V1.jsonschema Org.OData.Measures.V1.jsonschema

@rem check syntax of all schemas
java -jar c:\Java\json-schema-validator-2.2.5-lib.jar --syntax ../schemas/edm.json %FILES%
@rem validate metadata documents against edm schema
java -jar c:\Java\json-schema-validator-2.2.5-lib.jar ../schemas/edm.json %FILES%

@rem validate example responses against metadata document as schema
pushd ..\schemas

java -jar c:\Java\json-schema-validator-2.2.5-lib.jar --fakeroot http://docs.oasis-open.org/odata/odata-json-csdl/v4.0/ ../examples/csdl-16.1-Category.jsonschema ../examples/csdl-16.1-Category.json
java -jar c:\Java\json-schema-validator-2.2.5-lib.jar --fakeroot http://docs.oasis-open.org/odata/odata-json-csdl/v4.0/ ../examples/csdl-16.1-Product.jsonschema ../examples/csdl-16.1-Product.json
java -jar c:\Java\json-schema-validator-2.2.5-lib.jar --fakeroot http://docs.oasis-open.org/odata/odata-json-csdl/v4.0/ ../examples/miscellaneous-PrimitiveTypes.jsonschema ../examples/miscellaneous-PrimitiveTypes.json

popd

echo --- BEGIN node validate.js
node validate.js
echo --- END node validate.js