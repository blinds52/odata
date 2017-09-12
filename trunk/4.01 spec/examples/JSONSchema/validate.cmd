@echo off

call ajv validate -s csdl-16.1-Category.jsonschema -d csdl-16.1-Category.json -r csdl-16.1.jsonschema -m edm.json --unknown-formats=int32 --unknown-formats=decimal

call ajv validate -s csdl-16.1-Product.jsonschema -d csdl-16.1-Product.json -r csdl-16.1.jsonschema -m edm.json --unknown-formats=int32 --unknown-formats=decimal

call ajv validate -s miscellaneous-PrimitiveTypes.jsonschema -d miscellaneous-PrimitiveTypes.json -r miscellaneous.jsonschema -m edm.json --unknown-formats=int32 --unknown-formats=decimal --unknown-formats=base64url --unknown-formats=double --unknown-formats=single --unknown-formats=duration --unknown-formats=int64