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
public class PutPatchandDelete {
	
	@Test
	
	public void PutRequest() {
       JSONObject request =new JSONObject();
		
		request.put("name", "Monica");
		request.put("job","Trainer");
		
		System.out.println(request.toJSONString());
		baseURI="https://reqres.in/api";
		
		given().header("Content-Type","application/json").contentType(ContentType.JSON).accept(ContentType.JSON). 
		body(request.toJSONString()).put("/users/2").then().statusCode(200).log().all();
		
	}
	@Test
	public void PATCHRequest() {
		 JSONObject request =new JSONObject();
			
			request.put("name", "Monica");
			request.put("job","Trainer");
			
			System.out.println(request.toJSONString());
			baseURI="https://reqres.in";
			
			given().header("Content-Type","application/json").contentType(ContentType.JSON).accept(ContentType.JSON). 
			body(request.toJSONString()).patch("/api/users/2").then().statusCode(200).log().all();
		
	}
	
	@Test
	public void DeleteRequest(){
		baseURI="https://reqres.in";
		when().delete("/api/users/2").then().statusCode(204).log().all();
	}

}
