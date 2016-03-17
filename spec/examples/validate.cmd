@echo off 
set FILES=csdl-16.1.openapi.json Northwind.openapi.json ExampleService.openapi.json People.openapi.json Products.openapi.json Example.openapi.json TM1.openapi.json TripPin.openapi.json
set ANNOS=csdl-16.2.openapi.json
set VOCABS=Core Measures Capabilities Aggregation

@rem check syntax of edm schema
java -jar c:\Java\json-schema-validator-2.2.5-lib.jar --syntax ../schemas/edm.json

@rem validate metadata documents against openapi schema
java -jar c:\Java\json-schema-validator-2.2.5-lib.jar openapi.schema.json %FILES%

@rem validate annotation files against edm schema
java -jar c:\Java\json-schema-validator-2.2.5-lib.jar ../schemas/edm.json %ANNOS%

@rem validate vocabularies against edm schema
for %%V in (%VOCABS%) do (
  java -jar c:\Java\json-schema-validator-2.2.5-lib.jar ../schemas/edm.json Org.OData.%%V.V1.openapi.json
)