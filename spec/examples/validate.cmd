@echo off
set FILES=csdl-16.1.json csdl-16.2.json ExampleService.json miscellaneous.json MetadataService.json TM1$metadata.json merged_metadata.json

@rem check syntax of all schemas
java -jar c:\Java\json-schema-validator-2.2.5-lib.jar --syntax edm.json %FILES%
@rem validate metadata documents against edm schema
java -jar c:\Java\json-schema-validator-2.2.5-lib.jar edm.json %FILES%

@rem validate example responses against metadata document as schema
java -jar c:\Java\json-schema-validator-2.2.5-lib.jar --fakeroot http://docs.oasis-open.org/odata/odata-json-csdl/v4.0/ csdl-16.1-Category.schema.json csdl-16.1-Category.json
java -jar c:\Java\json-schema-validator-2.2.5-lib.jar --fakeroot http://docs.oasis-open.org/odata/odata-json-csdl/v4.0/ csdl-16.1-Product.schema.json csdl-16.1-Product.json
java -jar c:\Java\json-schema-validator-2.2.5-lib.jar --fakeroot http://docs.oasis-open.org/odata/odata-json-csdl/v4.0/ miscellaneous-PrimitiveTypes.schema.json miscellaneous-PrimitiveTypes.json