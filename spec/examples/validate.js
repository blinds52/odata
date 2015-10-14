// Primitive test script for OData JSON CSDL
//
// TODO: switch to unit test tool - mocha and chai
// TODO: add negative test cases that expect an error

var fs = require('fs');
var util = require('util');

// files
var draft04 = JSON.parse(fs.readFileSync("json-schema-draft-04.json"));
var edm = JSON.parse(fs.readFileSync("../schemas/edm.json"));
var capabilities = JSON.parse(fs
		.readFileSync("../vocabularies/Org.OData.Capabilities.V1.json"));
var core = JSON
		.parse(fs.readFileSync("../vocabularies/Org.OData.Core.V1.json"));
var measures = JSON.parse(fs
		.readFileSync("../vocabularies/Org.OData.Measures.V1.json"));
var validation = {};

var csdl_16_1 = JSON.parse(fs.readFileSync("csdl-16.1.jsonschema"));
var csdl_16_2 = JSON.parse(fs.readFileSync("csdl-16.2.jsonschema"));
var exampleService = JSON.parse(fs.readFileSync("ExampleService.jsonschema"));
var miscellaneous = JSON.parse(fs.readFileSync("miscellaneous.jsonschema"));
var metadataService = JSON.parse(fs.readFileSync("MetadataService.jsonschema"));
var tm1 = JSON.parse(fs.readFileSync("TM1$metadata.jsonschema"));
// var merged_metadata =
// JSON.parse(fs.readFileSync("merged_metadata.jsonschema"));

var ZSchema = require("z-schema");

ZSchema.registerFormat("base64url", function(str) {
	return true;
});
ZSchema.registerFormat("uuid", function(str) {
	return true;
});
ZSchema.registerFormat("date-time", function(str) {
	return true;
});
ZSchema.registerFormat("date", function(str) {
	return true;
});
ZSchema.registerFormat("time", function(str) {
	return true;
});
ZSchema.registerFormat("duration", function(str) {
	return true;
});
ZSchema.registerFormat("decimal", function(str) {
	return true;
});
ZSchema.registerFormat("double", function(str) {
	return true;
});
ZSchema.registerFormat("single", function(str) {
	return true;
});
ZSchema.registerFormat("int64", function(str) {
	return true;
});
ZSchema.registerFormat("int32", function(str) {
	return true;
});
ZSchema.registerFormat("int16", function(str) {
	return true;
});
ZSchema.registerFormat("int8", function(str) {
	return true;
});
ZSchema.registerFormat("uint8", function(str) {
	return true;
});

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
	check(validator, text + " vs. draft04", schema, draft04);
	check(validator, text + " vs. edm", schema, edm);
}

var validator = new ZSchema();

check(validator, "Check wiring", "string", {
	"type" : "string"
});

check(validator, "edm.json", edm, draft04);

// register remote schemas
validator.setRemoteReference("http://json-schema.org/draft-04/schema", draft04);
validator.setRemoteReference(
		"http://docs.oasis-open.org/odata/odata-json-csdl/v4.0/edm.json", edm);
validator
		.setRemoteReference(
				"https://tools.oasis-open.org/version-control/browse/wsvn/odata/trunk/spec/vocabularies/Org.OData.Capabilities.V1.json",
				capabilities);
validator
		.setRemoteReference(
				"https://tools.oasis-open.org/version-control/browse/wsvn/odata/trunk/spec/vocabularies/Org.OData.Core.V1.json",
				core);
validator
		.setRemoteReference(
				"https://tools.oasis-open.org/version-control/browse/wsvn/odata/trunk/spec/vocabularies/Org.OData.Measures.V1.json",
				measures);
validator
		.setRemoteReference(
				"https://tools.oasis-open.org/version-control/browse/wsvn/odata/trunk/spec/vocabularies/Org.OData.Validation.V1.json",
				measures);
validator.setRemoteReference("http://vocabs.odata.org/capabilities/v1",
		capabilities);
validator.setRemoteReference("http://tinyurl.com/Org-OData-Measures-V1",
		measures);
validator.setRemoteReference("http://vocabs.odata.org/display/v1", {});

// validate schemas against draft04 and edm
checkSchema("CSDL-16.1", csdl_16_1);
checkSchema("CSDL-16.2", csdl_16_2);
checkSchema("ExampleService", exampleService);
checkSchema("miscellaneous", miscellaneous);
checkSchema("MetadataService", metadataService);
checkSchema("TM1", tm1);
// checkSchema("merged_metadata", merged_metadata);
checkSchema("Capabilities", capabilities);
checkSchema("Core", core);
checkSchema("Measures", measures);

// validate example category and product entities
validator.setRemoteReference("csdl-16.1.jsonschema", csdl_16_1);

var categorySchema = {
	"$schema" : "http://json-schema.org/draft-04/schema#",
	"allOf" : [ {
		"$ref" : "csdl-16.1.jsonschema#/definitions/ODataDemo.Category"
	} ]
};
var category = JSON.parse(fs.readFileSync("csdl-16.1-Category.json"));
check(validator, "Category entity", category, categorySchema);

var productSchema = {
	"$schema" : "http://json-schema.org/draft-04/schema#",
	"allOf" : [ {
		"$ref" : "csdl-16.1.jsonschema#/definitions/ODataDemo.Product"
	} ]
};
var product = JSON.parse(fs.readFileSync("csdl-16.1-Product.json"));
check(validator, "Product entity", product, productSchema);

// validate primitive types
validator.setRemoteReference("miscellaneous.jsonschema", miscellaneous);

var primitiveTypesSchema = {
	"$schema" : "http://json-schema.org/draft-04/schema#",
	"allOf" : [ {
		"$ref" : "miscellaneous.jsonschema#/definitions/Model1.NullablePrimitiveTypes"
	} ]
};
var primitiveTypes = JSON.parse(fs
		.readFileSync("miscellaneous-PrimitiveTypes.json"));
check(validator, "Primitive types", primitiveTypes, primitiveTypesSchema);

check(validator, "more primitive types", {
	"NullValue" : true
}, primitiveTypesSchema);

// error responses
var errorSchema = {
	"$schema" : "http://json-schema.org/draft-04/schema#",
	"allOf" : [ {
		"$ref" : "http://docs.oasis-open.org/odata/odata-json-csdl/v4.0/edm.json#/definitions/odata.error"
	} ]
};

var errorResponse = {
	"error" : {
		"code" : "501",
		"message" : "Unsupported functionality",
		"target" : "query",
		"details" : [ {
			"code" : "301",
			"target" : "$search",
			"message" : "$search query option not supported",
		} ],
		"innererror" : {
			"trace" : [],
			"context" : {}
		}
	}
};
check(validator, "Error response", errorResponse, errorSchema);

if (!failed) {
	console.log("validation: SUCCESS");
}
