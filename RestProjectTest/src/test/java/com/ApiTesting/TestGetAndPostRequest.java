package com.ApiTesting;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;
public class TestGetAndPostRequest {
	
	//@Test
	public void testGet1() {
		//1ST VALIDATION BY ID
		baseURI="https://reqres.in/api";
		given().get("/unknown").then().statusCode(200).body("data[0].id", equalTo(1)).log().all();
		
		//2nd validation by name
		given().get("/unknown").then().statusCode(200).body("data[0].name", equalTo("cerulean")).log().all();
	}
	
	public void GetRequest2() {
		
		//3rd validation by group
		baseURI="https://reqres.in/api";
		given().get("/unknown").then().statusCode(200).body("data.firstname", hasItems("Lindsay","Tobias"));
		
	}
	@Test
	public void PostRequest() {
		Map<String, Object> map =new HashMap<String,Object>();
		JSONObject request =new JSONObject(map);
		
		request.put("name", "Monica");
		request.put("job","Trainer");
		
		System.out.println(request.toJSONString());
		baseURI="https://reqres.in/api";
		
		given().header("Content-Type","application/json").contentType(ContentType.JSON).accept(ContentType.JSON). 
		body(request.toJSONString()).post("/users").then().statusCode(201).log().all();
		
	}

}
