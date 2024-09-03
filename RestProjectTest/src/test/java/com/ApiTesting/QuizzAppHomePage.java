package com.ApiTesting;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class QuizzAppHomePage {
 
	//@Test
	public void GetHompagetest() {
		Response response =	get("http://localhost:8888/teacher");
		System.out.println(response.getStatusCode());
		System.out.println(response.getTime());
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("Content-type"));
		
		int statuscode = response.getStatusCode();
		Assert.assertEquals(statuscode, 200);
	}
	@Test
	public void GetApiTest2() {
		
		baseURI="http://localhost:8888";
		given().get("/teacher").then().statusCode(200).body("find {it.id = 1}.id", equalTo(1)).log().all();
		//given().get("/teacher").then().statusCode(200).body("teacher[1].teacher_email", equalTo("Kishore@gmail.com"));
		
		
	}
	@Test
	public void PostRequest() {
		Map<String, Object> map =new HashMap<String,Object>();
		JSONObject request =new JSONObject(map);
		
		request.put("teacher_name", "Monica");
		request.put("teacher_password","monica");
		request.put("teacher_email","monica@gmail.com");
		request.put("teacher_gender","Female");
		
		System.out.println(request.toJSONString());
		baseURI="http://localhost:8888";
		
		given().header("Content-Type","application/json").contentType(ContentType.JSON).accept(ContentType.JSON). 
		body(request.toJSONString()).post("/teacher").then().statusCode(200).log().all();
		
	}
	@Test
	public void PutRequest() {
		JSONObject request =new JSONObject();
		
		request.put("teacher_name", "kamalesh");
		request.put("teacher_password","kamalesh");
		request.put("teacher_email","monica@gmail.com");
		request.put("teacher_gender","male");
		
		System.out.println(request.toJSONString());
		baseURI="http://localhost:8888";
		
		given().header("Content-Type","application/json").contentType(ContentType.JSON).accept(ContentType.JSON). 
		body(request.toJSONString()).put("/teacher/5386").then().statusCode(200).log().all();
		
	}
	
	@Test
	public void DeleteRequest(){
		baseURI="http://localhost:8888";
		when().delete("/teacher/5386").then().statusCode(200).log().all();
	}


}
