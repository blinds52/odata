// Primitive test script for JSON Schemas generated from OData CSDL XML
//
// TODO: switch to unit test tool - mocha and chai?
// TODO: add negative test cases that expect an error

var fs = require('fs');
var util = require('util');
var ZSchema = require("z-schema");

// files
var draft04 = JSON.parse(fs.readFileSync("json-schema-draft-04.json"));
var edm = JSON.parse(fs.readFileSync("edm.json"));

var csdl_16_1 = JSON.parse(fs.readFileSync("csdl-16.1.jsonschema"));
var csdl_16_2 = JSON.parse(fs.readFileSync("csdl-16.2.jsonschema"));
var exampleService = JSON.parse(fs.readFileSync("ExampleService.jsonschema"));
var miscellaneous = JSON.parse(fs.readFileSync("miscellaneous.jsonschema"));
var miscellaneous2 = JSON.parse(fs.readFileSync("miscellaneous2.jsonschema"));
var core = JSON.parse(fs.readFileSync("Org.OData.Core.V1.jsonschema"));

// OData-specific formats - dummy implementation
ZSchema.registerFormat("base64url", function (str) { return true; });
ZSchema.registerFormat("uuid", function (str) { return true; });
ZSchema.registerFormat("date-time", function (str) { return true; });
ZSchema.registerFormat("date", function (str) { return true; });
ZSchema.registerFormat("time", function (str) { return true; });
ZSchema.registerFormat("duration", function (str) { return true; });
ZSchema.registerFormat("decimal", function (str) { return true; });
ZSchema.registerFormat("double", function (str) { return true; });
ZSchema.registerFormat("single", function (str) { return true; });
ZSchema.registerFormat("int64", function (str) { return true; });
ZSchema.registerFormat("int32", function (str) { return true; });
ZSchema.registerFormat("int16", function (str) { return true; });
ZSchema.registerFormat("int8", function (str) { return true; });
ZSchema.registerFormat("uint8", function (str) { return true; });

// set up validator
var failed = false;

function check(validator, text, input, schema) {
	var valid = validator.validate(input, schema);
	if (valid != true) {
		failed = true;
		console.log("-- " + text + " fails:");
		var errors = validator.getLastErrors();
		// console.log(util.inspect(errors, {showHidden: false, depth: null}));
		console.log(errors[0]);
	}
}

function checkSchema(text, schema) {
	validator.options.noExtraKeywords = false;
	validator.options.assumeAdditional = false;
	check(validator, text + " vs. draft04", schema, draft04);
	//validator.options.noExtraKeywords = true;
	//validator.options.assumeAdditional = ["$ref","__$compiled","__$schemaResolved","__$refResolved"];
	check(validator, text + " vs. edm", schema, edm);
}

var validator = new ZSchema({
	//noExtraKeywords : true
	//assumeAdditional : ["$ref","__$compiled"]
});

check(validator, "Check wiring", "string", {
	"type": "string"
});

check(validator, "edm.json", edm, draft04);

// register remote schemas
validator.setRemoteReference("http://json-schema.org/draft-04/schema", draft04);
validator.setRemoteReference("http://docs.oasis-open.org/odata/ns/edm.json", edm);
validator.setRemoteReference("http://vocabs.odata.org/core/v1", core);
validator.setRemoteReference("miscellaneous.jsonschema", miscellaneous);

// validate schemas against draft04 and edm
checkSchema("CSDL-16.1", csdl_16_1);
checkSchema("CSDL-16.2", csdl_16_2);
checkSchema("ExampleService", exampleService);
checkSchema("miscellaneous", miscellaneous);
checkSchema("miscellaneous2", miscellaneous2);

// validate example category and product entities
validator.setRemoteReference("csdl-16.1.jsonschema", csdl_16_1);

var categorySchema = {
	"$schema": "http://json-schema.org/draft-04/schema#",
	"allOf": [{
		"$ref": "csdl-16.1.jsonschema#/definitions/ODataDemo.Category"
	}]
};
var category = JSON.parse(fs.readFileSync("csdl-16.1-Category.json"));
check(validator, "Category entity", category, categorySchema);

var productSchema = {
	"$schema": "http://json-schema.org/draft-04/schema#",
	"allOf": [{
		"$ref": "csdl-16.1.jsonschema#/definitions/ODataDemo.Product"
	}]
};
var product = JSON.parse(fs.readFileSync("csdl-16.1-Product.json"));
check(validator, "Product entity", product, productSchema);

// validate primitive types
validator.setRemoteReference("miscellaneous.jsonschema", miscellaneous);

var primitiveTypesSchema = {
	"$schema": "http://json-schema.org/draft-04/schema#",
	"allOf": [{
		"$ref": "miscellaneous.jsonschema#/definitions/Model1.NullablePrimitiveTypes"
	}]
};
var primitiveTypes = JSON.parse(fs
	.readFileSync("miscellaneous-PrimitiveTypes.json"));
check(validator, "Primitive types", primitiveTypes, primitiveTypesSchema);

check(validator, "more primitive types", {
	"NullValue": true
}, primitiveTypesSchema);

// validate error response
var errorSchema = {
	"$schema": "http://json-schema.org/draft-04/schema#",
	"allOf": [{
		"$ref": "http://docs.oasis-open.org/odata/ns/edm.json#/definitions/odata.error"
	}]
};

var errorResponse = {
	"error": {
		"code": "501",
		"message": "Unsupported functionality",
		"target": "query",
		"details": [{
			"code": "301",
			"target": "$search",
			"message": "$search query option not supported",
		}],
		"innererror": {
			"trace": [],
			"context": {}
		}
	}
};
check(validator, "Error response", errorResponse, errorSchema);

if (!failed) {
	console.log("validation: SUCCESS");
}