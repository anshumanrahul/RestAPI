package com.restAssured.RestAPI;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssured_StatusCodeValidation {
	
	@Test
	public void CheckStatusCode(){
		// Specify the base URL to the RESTful web service 
		
		RestAssured.baseURI="https://demoqa.com/BookStore/v1/Books";
		
		// Get the RequestSpecification of the request to be sent to the server.
		
		RequestSpecification httprequest=RestAssured.given();
		
		Response response=httprequest.request(Method.GET,"");
		 // Get the status code of the request. 
        //If request is successful, status code will be 200
       int statusCode = response.getStatusCode();
		
		Assert.assertEquals(statusCode /*actual value*/, 200 /*expected value*/, 
	            "Correct status code returned");
		
		
	}

}
