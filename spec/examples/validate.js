var fs = require('fs');

var draft04 = JSON.parse(fs.readFileSync("json-schema-draft-04.json"));
var edm = JSON.parse(fs.readFileSync("../schemas/edm.json"));
var core = JSON.parse(fs.readFileSync("Org.OData.Core.V1.json"));

var ZSchema = require("z-schema");

ZSchema.registerFormat("xsd:date", function (str) {
  return true;
});
ZSchema.registerFormat("xsd:dayTimeDuration", function (str) {
  return true;
});
ZSchema.registerFormat("xsd:double", function (str) {
  return true;
});
ZSchema.registerFormat("xsd:float", function (str) {
  return true;
});

/* for stricter validation
var validator = new ZSchema({
assumeAdditional : true
});
 */
var validator = new ZSchema();
validator.setRemoteReference("http://docs.oasis-open.org/odata/odata-json-csdl/v4.0/edm.json", edm);
validator.setRemoteReference("http://docs.oasis-open.org/odata/odata/v4.0/os/vocabularies/Org.OData.Core.V1.xml", core);

function check(validator, text, input, schema) {
  var valid = validator.validate(input, schema);
  if (valid != true) {
    console.log(text + " fails:");
    var errors = validator.getLastErrors();
    console.log(errors[0]);
  }
}

// TODO: extract tests into a JSON file, parse it, then run each test as an "it"

check(validator, "Check wiring", "string", {
  "type" : "string"
});

check(validator, "edm.json", edm, draft04);

var miscellaneous = JSON.parse(fs.readFileSync("miscellaneous.json"));
check(validator, "miscellaneous.json", miscellaneous, edm);

// TODO: add the other example metadata documents

// TODO: add the other example payloads
// validate payloads
var csdl_16_1 = JSON.parse(fs.readFileSync("csdl-16.1.json"));
validator.setRemoteReference("csdl-16.1.json", csdl_16_1);

var categorySchema = {
  "$schema" : "http://json-schema.org/draft-04/schema#",
  "allOf" : [{
      "$ref" : "csdl-16.1.json#/definitions/ODataDemo.Category"
    }
  ]
};
var category = JSON.parse(fs.readFileSync("csdl-16.1-Category.json"));
check(validator, "Category entity", category, categorySchema);

var productSchema = {
  "$schema" : "http://json-schema.org/draft-04/schema#",
  "allOf" : [{
      "$ref" : "csdl-16.1.json#/definitions/ODataDemo.Product"
    }
  ]
};
var product = JSON.parse(fs.readFileSync("csdl-16.1-Product.json"));
check(validator, "Product entity", product, productSchema);

validator.setRemoteReference("miscellaneous.json", miscellaneous);

var primitiveTypesSchema = {
  "$schema" : "http://json-schema.org/draft-04/schema#",
  "allOf" : [{
      "$ref" : "miscellaneous.json#/definitions/Model1.PrimitiveTypes"
    }
  ]
};
var primitiveTypes = JSON.parse(fs.readFileSync("miscellaneous-PrimitiveTypes.json"));
check(validator, "Primitive types", primitiveTypes, primitiveTypesSchema);

check(validator, "Wrong primitive types", {
  "NullValue" : true
}, primitiveTypesSchema);
