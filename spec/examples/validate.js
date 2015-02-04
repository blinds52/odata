var fs = require('fs');

// files
var draft04 = JSON.parse(fs.readFileSync("json-schema-draft-04.json"));
var edm = JSON.parse(fs.readFileSync("../schemas/edm.json"));
var core = JSON.parse(fs.readFileSync("Org.OData.Core.V1.jsonschema"));

var csdl_16_1 = JSON.parse(fs.readFileSync("csdl-16.1.jsonschema"));
var csdl_16_2 = JSON.parse(fs.readFileSync("csdl-16.2.jsonschema"));
var exampleService = JSON.parse(fs.readFileSync("ExampleService.jsonschema"));
var miscellaneous = JSON.parse(fs.readFileSync("miscellaneous.jsonschema"));
var metadataService = JSON.parse(fs.readFileSync("MetadataService.jsonschema"));
var tm1 = JSON.parse(fs.readFileSync("TM1$metadata.jsonschema"));
//var merged_metadata = JSON.parse(fs.readFileSync("merged_metadata.jsonschema"));

var ZSchema = require("z-schema");

ZSchema.registerFormat("xsd:date", function(str) {
  return true;
});
ZSchema.registerFormat("xsd:dayTimeDuration", function(str) {
  return true;
});
ZSchema.registerFormat("xsd:double", function(str) {
  return true;
});
ZSchema.registerFormat("xsd:float", function(str) {
  return true;
});

// for stricter validation
// var validator = new ZSchema({ assumeAdditional : true });
var validator = new ZSchema();
validator.setRemoteReference(
    "http://docs.oasis-open.org/odata/odata-json-csdl/v4.0/edm.json", edm);
validator
    .setRemoteReference(
        "http://docs.oasis-open.org/odata/odata/v4.0/os/vocabularies/Org.OData.Core.V1.xml",
        core);

var failed = false;
function check(validator, text, input, schema) {
  var valid = validator.validate(input, schema);
  if (valid != true) {
    failed = true;
    console.log(text + " fails:");
    var errors = validator.getLastErrors();
    console.log(errors[0]);
  }
}

function checkSchema(text, schema) {
  check(validator, text + " vs. draft04", schema, draft04);
  check(validator, text + " vs. edm", schema, edm);
}

// TODO: extract tests into a JSON file, parse it, then run each test as an "it"

check(validator, "Check wiring", "string", {
  "type": "string"
});

check(validator, "edm.json", edm, draft04);

// validate schemas against draft04 and edm
checkSchema("CSDL-16.1", csdl_16_1);
checkSchema("CSDL-16.2", csdl_16_2);
checkSchema("ExampleService", exampleService);
checkSchema("miscellaneous", miscellaneous);
checkSchema("MetadataService", metadataService);
checkSchema("TM1", tm1);
//checkSchema("merged_metadata", merged_metadata);

// validate example category and product entities
validator.setRemoteReference("csdl-16.1.jsonschema", csdl_16_1);

var categorySchema = {
    "$schema": "http://json-schema.org/draft-04/schema#",
    "allOf": [
      {
        "$ref": "csdl-16.1.jsonschema#/definitions/ODataDemo.Category"
      }
    ]
};
var category = JSON.parse(fs.readFileSync("csdl-16.1-Category.json"));
check(validator, "Category entity", category, categorySchema);

var productSchema = {
    "$schema": "http://json-schema.org/draft-04/schema#",
    "allOf": [
      {
        "$ref": "csdl-16.1.jsonschema#/definitions/ODataDemo.Product"
      }
    ]
};
var product = JSON.parse(fs.readFileSync("csdl-16.1-Product.json"));
check(validator, "Product entity", product, productSchema);

// validate primitive types
validator.setRemoteReference("miscellaneous.jsonschema", miscellaneous);

var primitiveTypesSchema = {
    "$schema": "http://json-schema.org/draft-04/schema#",
    "allOf": [
      {
        "$ref": "miscellaneous.jsonschema#/definitions/Model1.PrimitiveTypes"
      }
    ]
};
var primitiveTypes = JSON.parse(fs
    .readFileSync("miscellaneous-PrimitiveTypes.json"));
check(validator, "Primitive types", primitiveTypes, primitiveTypesSchema);

check(validator, "another primitive types", {
  "NullValue": true
}, primitiveTypesSchema);

if (!failed) {
  console.log("validation: SUCCESS");
}