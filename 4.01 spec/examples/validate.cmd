@echo off 
setlocal

@rem  Prerequisites
@rem  - Node.js is installed - download from https://nodejs.org/
@rem  - ajv-cli is installed - npm install -g ajv-cli

set done=false
set here=%~dp0

if [%1]==[] (
  set done=true
  for /F "eol=# tokens=1,2" %%F in (transform.txt) do (
		call :process %%F %%G
  )
) else if exist %1\ (
  set done=true
  cd %1
  for %%F in (*.xml) do (
    call :process %%F
  )
) else (
  for /F "eol=# tokens=1,2" %%F in (transform.txt) do (
    if /I [%~n1]==[%%~nF] (
      set done=true
      call :process %%F %%G
    )
  )
)

if %done%==false echo Don't know how to %~n0 %1

endlocal
exit /b


:process
  echo %~n1

  call ajv -s %here%\..\schemas\csdl.schema.json -d %~n1.json > nul

exit /b