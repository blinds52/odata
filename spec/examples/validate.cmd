@echo off
set FILES=csdl-16.1.json csdl-16.2.json ExampleService.json miscellaneous.json MetadataService.json TM1$metadata.json merged_metadata.json Org.OData.Core.V1.json Org.OData.Capabilities.V1.json Org.OData.Measures.V1.json

@rem check syntax of all schemas
java -jar c:\Java\json-schema-validator-2.2.5-lib.jar --syntax ../schemas/edm.json %FILES%
@rem validate metadata documents against edm schema
java -jar c:\Java\json-schema-validator-2.2.5-lib.jar ../schemas/edm.json %FILES%

@rem validate example responses against metadata document as schema
pushd ..\schemas

java -jar c:\Java\json-schema-validator-2.2.5-lib.jar --fakeroot http://docs.oasis-open.org/odata/odata-json-csdl/v4.0/ ../examples/csdl-16.1-Category.schema.json ../examples/csdl-16.1-Category.json
java -jar c:\Java\json-schema-validator-2.2.5-lib.jar --fakeroot http://docs.oasis-open.org/odata/odata-json-csdl/v4.0/ ../examples/csdl-16.1-Product.schema.json ../examples/csdl-16.1-Product.json
java -jar c:\Java\json-schema-validator-2.2.5-lib.jar --fakeroot http://docs.oasis-open.org/odata/odata-json-csdl/v4.0/ ../examples/miscellaneous-PrimitiveTypes.schema.json ../examples/miscellaneous-PrimitiveTypes.json

popd

echo --- BEGIN node validate.js
node validate.js
echo --- END node validate.js