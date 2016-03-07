@echo off 

set FILES=csdl-16.1.swagger.json Example.swagger.json Northwind.swagger.json TripPin.swagger.json TM1.swagger.json
REM csdl-16.2 ExampleService.jsonschema miscellaneous.jsonschema miscellaneous2.jsonschema MetadataService.jsonschema 
REM ../vocabularies/Org.OData.Capabilities.V1.json ../vocabularies/Org.OData.Core.V1.json ../vocabularies/Org.OData.Measures.V1.json

REM TODO:
REM - make sure jetty is running

for %%F in (%FILES%) do (
  echo %%F 
  
  c:\bin\curl.exe -s localhost:8002/debug?url=http://localhost/examples/%%F | c:\git\yajl\build\yajl-2.1.1\bin\json_reformat.exe

)