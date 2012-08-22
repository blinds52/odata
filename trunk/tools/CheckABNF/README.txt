This ABNF checker uses Java APG 1.0 from http://www.coasttocoastresearch.com/apg/docs/docjava.
Open the Java APG project in your workspace to use CheckABNF.

The project uses a custom build step to generate src/OData/OData.java from the linked file odata-abnf-current.abnf. 
Point the linked file to where it resides in your file system. 

It executes all test cases in the linked file odata-abnf-testcases.xml.
Point the linked file to where it resides in your file system. 

Each test case has a name, a start rule for the parser, and an input string to parse
It may specify the position at which the parser is expected to fail:

     <TestCases xmlns="http://docs.oasis-open.org/odata/ns/testcases">
       <TestCase Name="URI with path and trailing slash" 
                 Rule="ABSOLUTE_URI">
         <Input>http://My.Org:8080/MyService/</Input>
       </TestCase>
       <TestCase Name="URI without schema separator" 
                 Rule="ABSOLUTE_URI" 
                 FailAt="4">
         <Input>http//My.Org/</Input>
       </TestCase> 
       ...
    </TestCases>
    
Test cases without a FailAt attribute succeed if the complete input is successfully parserd.
Test cases with a FailAt attribute succeed if the parser fails at the specified position.
Test cases fail otherwise. In that case a parser trace is included in the console output. 

The schema for TestCases.xml is TestCases.xsd. Add it to

     Window -> Preferences -> XML -> XML Catalog -> User Specified Entries
     
as
 - Location: CheckABNF/TestCases.xsd
 - Key type: Namespace name
 - Key:      http://docs.oasis-open.org/odata/ns/testcases