@echo off 

setlocal

set FILES=csdl-16.1.openapi.json csdl-16.2.openapi.json Northwind.openapi.json ExampleService.openapi.json People.openapi.json Products.openapi.json Example.openapi.json TM1.openapi.json TripPin.openapi.json
set VOCABS=Org.OData.Core.V1.openapi.json Org.OData.Measures.V1.openapi.json Org.OData.Capabilities.V1.openapi.json Org.OData.Aggregation.V1.openapi.json

echo.
echo = OpenAPI validation =
call z-schema --pedanticCheck openapi.schema.json %FILES% %VOCABS%
java -jar c:\Java\json-schema-validator-2.2.6-lib.jar openapi.schema.json %FILES% %VOCABS%


echo.
echo = EDM validation =
rem java -jar c:\Java\json-schema-validator-2.2.5-lib.jar ../schemas/edm.json %FILES%
call z-schema --ignoreUnknownFormats --pedanticCheck ../schemas/edm.json %FILES% %VOCABS%
java -jar c:\Java\json-schema-validator-2.2.6-lib.jar ../schemas/edm.json %FILES% %VOCABS%

endlocal