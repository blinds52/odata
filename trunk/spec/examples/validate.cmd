@echo off 
set FILES=csdl-16.1.swagger.json Northwind.swagger.json ExampleService.swagger.json Example.swagger.json TM1.swagger.json TripPin.swagger.json
set ANNOS=csdl-16.2.swagger.json
set VOCABS=Core Measures
rem Capabilities Aggregation

@rem check syntax of edm schema
java -jar c:\Java\json-schema-validator-2.2.5-lib.jar --syntax ../schemas/edm.json

@rem validate metadata documents against swagger schema
java -jar c:\Java\json-schema-validator-2.2.5-lib.jar swagger.schema.json %FILES%

@rem validate annotation files against edm schema
java -jar c:\Java\json-schema-validator-2.2.5-lib.jar ../schemas/edm.json %ANNOS%

@rem validate vocabularies against edm schema
for %%V in (%VOCABS%) do (
  java -jar c:\Java\json-schema-validator-2.2.5-lib.jar ../schemas/edm.json Org.OData.%%V.V1.swagger.json
)