@echo off 
setlocal

@rem  This script uses the Apache Xalan 2.7.1 XSLT processor
@rem  For a description of Xalan command-line parameters see http://xalan.apache.org/xalan-j/commandline.html
@rem
@rem  Prerequisites
@rem  - Java SE 8 is installed and in the PATH - download from http://www.oracle.com/technetwork/java/javase/downloads/index.html 
@rem  - diff.exe is installed and in the PATH
@rem  - Eclipse is installed with Xalan (contained in Eclipse Web Tools Platform), and ECLIPSE_HOME environment variable is set
set CLASSPATH=%CLASSPATH%;%ECLIPSE_HOME%\plugins\org.apache.xml.serializer_2.7.1.v201005080400.jar;%ECLIPSE_HOME%\plugins\org.apache.xalan_2.7.1.v201005080400.jar
@rem  - YAJL's json_reformat from https://github.com/lloyd/yajl has been compiled and is in the PATH
@rem  - Node.js is installed - download from https://nodejs.org/
@rem  - ajv-cli is installed - npm install -g ajv-cli
@rem  - https://github.com/oasis-tcs/odata-vocabularies has been cloned and environment variable ODATA-VOCABULARIES set to its location
set ODATA-VOCABULARIES=c:\git\odata-vocabularies
@rem  - https://github.com/oasis-tcs/odata-openapi has been cloned and environment variable ODATA-OPENAPI set to its location
set ODATA-OPENAPI=c:\git\odata-openapi

set done=false
set here=%~dp1

if exist %1\ (
  set done=true
  cd %1
  for %%F in (*.xml) do (
    call :process %%F
  )
) else (
  for /F "eol=# tokens=1,2" %%F in (%~n0.txt) do (
    if /I [%~n1]==[%%~nF] (
      set done=true
      call :process %%F %%G
    ) else if [%1]==[] (
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
  
  if [%2]==[V2] (
    java.exe org.apache.xalan.xslt.Process -L -XSL %ODATA-OPENAPI%\tools\V2-to-V4-CSDL.xsl -IN %1 -OUT %~n1.V4.xml
    set INPUT=%~n1.V4.xml
  ) else (
    set INPUT=%1
  )
  
  java.exe org.apache.xalan.xslt.Process -L -XSL %ODATA-VOCABULARIES%\tools\V4-CSDL-normalize-Target.xsl -IN %INPUT% -OUT %~n1.normalized.xml
  java.exe org.apache.xalan.xslt.Process -L -XSL %ODATA-VOCABULARIES%\tools\V4-CSDL-to-JSON.xsl -IN %~n1.normalized.xml -OUT %~n1.tmp.json

  json_reformat.exe < %~n1.tmp.json > %~n1.json
  if not errorlevel 1 (
    del %~n1.normalized.xml %~n1.tmp.json
    if [%2]==[V2] del %~n1.V4.xml
    if exist %~n1-goal.json diff.exe --ignore-space-change --strip-trailing-cr %~n1-goal.json %~n1.json
    
    call ajv -s %here%\..\schemas\csdl.schema.json -d %~n1.json > nul
  )
exit /b