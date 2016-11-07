@echo off 
setlocal

@rem XSLT command-line see https://xml.apache.org/xalan-j/commandline.html

set CLASSPATH=%CLASSPATH%;C:\eclipse-Luna\plugins\org.apache.xml.serializer_2.7.1.v201005080400.jar;C:\eclipse-Luna\plugins\org.apache.xalan_2.7.1.v201005080400.jar
set done=false

for /F "eol=# tokens=1,2,3,4" %%F in (%~n0.txt) do (
	if /I [%1] == [%%~nF] (
	    set done=true
		call :process %%F %%G %%H %%I
	) else if [%1]==[] (
	    set done=true
		call :process %%F %%G %%H %%I
	)
)

if %done%==false echo Don't know how to %~n0 %1

endlocal
exit /b


:process

  echo %~n1

  @rem -PARAM extensions YES -PARAM odata-schema http://localhost/schemas/edm.json
  java.exe org.apache.xalan.xslt.Process -XSL V4-CSDL-to-openapi.xsl -PARAM scheme %2 -PARAM host %3 -PARAM basePath %4 -PARAM diagram YES -IN %1 -OUT %~n1.jsontmp

  c:\git\yajl\build\yajl-2.1.1\bin\json_reformat.exe < %~n1.jsontmp > %~n1.openapi.json
  if not errorlevel 1 (
    del %~n1.jsontmp
    if exist %~n1.openapi-goal.json (
      c:\bin\diff.exe --ignore-space-change --strip-trailing-cr %~n1.openapi-goal.json %~n1.openapi.json
    ) else (
      c:\bin\diff.exe --ignore-space-change --strip-trailing-cr ..\vocabularies\%~n1.json %~n1.openapi.json
    )
  )
exit /b