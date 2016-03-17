@echo off 
@rem XSLT command-line see https://xml.apache.org/xalan-j/commandline.html

@rem TODO: accept command line parameters, only pull those from transform.txt, all if no parameters are provided

setlocal

set CLASSPATH=%CLASSPATH%;C:\eclipse-Luna\plugins\org.apache.xml.serializer_2.7.1.v201005080400.jar;C:\eclipse-Luna\plugins\org.apache.xalan_2.7.1.v201005080400.jar

for /F "eol=# tokens=1,2,3,4" %%F in (transform.txt) do (
  echo %%~nF 
  
  java org.apache.xalan.xslt.Process -XSL V4-CSDL-to-openapi.xsl -PARAM scheme %%G -PARAM host %%H -PARAM basePath %%I -IN %%F -OUT %%~nF.jsontmp

  c:\git\yajl\build\yajl-2.1.1\bin\json_reformat.exe < %%~nF.jsontmp > %%~nF.openapi.json
  if not errorlevel 1 (
    del %%~nF.jsontmp
    if exist %%~nF.openapi-goal.json (
      c:\bin\diff.exe --ignore-space-change --strip-trailing-cr %%~nF.openapi-goal.json %%~nF.openapi.json
    ) else (
      c:\bin\diff.exe --ignore-space-change --strip-trailing-cr ..\vocabularies\%%~nF.json %%~nF.openapi.json
    )
  )
)

endlocal