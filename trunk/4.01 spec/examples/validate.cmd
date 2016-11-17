@echo off 
setlocal

rem JSON Schema Validators used
rem - https://github.com/zaggino/z-schema -> npm install z-schema
rem - https://github.com/daveclayton/json-schema-validator -> download jar from https://bintray.com/fge/maven/json-schema-validator/view

rem echo csdl.schema.json
rem java -jar c:\Java\json-schema-validator-2.2.6-lib.jar --syntax ../schemas/csdl.schema.json %FILES%


for /F "eol=# tokens=1" %%F in (transform.txt) do (
	if /I [%~n1] == [%%~nF] (
	  set done=true
		call :process %%F
	) else if [%1]==[] (
	  set done=true
		call :process %%F
	)
)

if %done%==false echo Don't know how to %~n0 %1

endlocal
exit /b


:process
  echo %~n1

  rem java -jar c:\Java\json-schema-validator-2.2.6-lib.jar ../schemas/csdl.schema.json %~n1.json

  call z-schema --ignoreUnknownFormats --pedanticCheck ../schemas/csdl.schema.json %~n1.json > c:\temp\z-schema.log
  if %ERRORLEVEL% == 1 (
    type c:\temp\z-schema.log
  )
  del c:\temp\z-schema.log

exit /b