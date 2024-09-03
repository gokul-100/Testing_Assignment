package com.ApiTesting;
import static io.restassured.RestAssured.*;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
public class JSONSchemaValidator {
	
	public void testGet1() {
		baseURI="http://localhost:8888/";
		given().get("teacher").then().assertThat().body(matchesJsonSchemaInClasspath("db.json")).statusCode(200);
	}
}
