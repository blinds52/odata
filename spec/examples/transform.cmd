@echo off 
REM XSLT command-line see https://xml.apache.org/xalan-j/commandline.html

setlocal

set CLASSPATH=%CLASSPATH%;C:\eclipse-Luna\plugins\org.apache.xml.serializer_2.7.1.v201005080400.jar;C:\eclipse-Luna\plugins\org.apache.xalan_2.7.1.v201005080400.jar

for /F "eol=# tokens=1,2,3,4" %%F in (transform.txt) do (
  echo %%~nF 
  
  java org.apache.xalan.xslt.Process -XSL V4-CSDL-to-Swagger.xsl -PARAM scheme %%G -PARAM host %%H -PARAM basePath %%I -IN %%F -OUT %%~nF.jsontmp

  c:\git\yajl\build\yajl-2.1.1\bin\json_reformat.exe < %%~nF.jsontmp > %%~nF.swagger.json
  if not errorlevel 1 (
    del %%~nF.jsontmp
    if exist %%~nF.swagger-goal.json (
      c:\bin\diff.exe --ignore-space-change --strip-trailing-cr %%~nF.swagger-goal.json %%~nF.swagger.json
    ) else (
      c:\bin\diff.exe --ignore-space-change --strip-trailing-cr ..\vocabularies\%%~nF.json %%~nF.swagger.json
    )
  )
)

endlocal