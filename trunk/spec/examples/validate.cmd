@echo off 
set FILES=csdl-16.1.openapi.json csdl-16.2.openapi.json Northwind.openapi.json ExampleService.openapi.json People.openapi.json Products.openapi.json Example.openapi.json TM1.openapi.json TripPin.openapi.json
set VOCABS=Core Measures Capabilities Aggregation

@rem check syntax of edm schema
java -jar c:\Java\json-schema-validator-2.2.5-lib.jar --syntax ../schemas/edm.json

@rem validate CSDL documents against openapi schema
echo.
echo = OpenAPI validation =
java -jar c:\Java\json-schema-validator-2.2.5-lib.jar openapi.schema.json %FILES%

for %%V in (%VOCABS%) do (
  java -jar c:\Java\json-schema-validator-2.2.5-lib.jar openapi.schema.json Org.OData.%%V.V1.openapi.json
)

@rem validate CSDL documents against edm schema
echo.
echo = EDM validation =
java -jar c:\Java\json-schema-validator-2.2.5-lib.jar ../schemas/edm.json %FILES%

for %%V in (%VOCABS%) do (
  java -jar c:\Java\json-schema-validator-2.2.5-lib.jar ../schemas/edm.json Org.OData.%%V.V1.openapi.json
)