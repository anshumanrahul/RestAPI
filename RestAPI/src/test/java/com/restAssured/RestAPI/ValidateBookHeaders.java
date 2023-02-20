package com.restAssured.RestAPI;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ValidateBookHeaders {
	
	@Test
	public void ValidateBookHeader()
	{
		// Specify the base URL to the RESTful web service 
		 RestAssured.baseURI="https://demoqa.com/BookStore/v1/Books";
		 
		// Get the RequestSpecification of the request to be sent to the server.
		 
		 RequestSpecification httprequest=RestAssured.given();
		 
		 Response response=httprequest.get("");
		 
		// Access header with a given name.
		 String contenttype=response.header("Content-Type");
		 Assert.assertEquals(contenttype /* actual value */, "application/json; charset=utf-8" /* expected value */); 
		 
		// Access header with a given name. 
		 
		 String Server=response.header("Server");
		 Assert.assertEquals(Server /* actual value */, "nginx/1.17.10 (Ubuntu)" /* expected value */);
		 
	 
		 
	}

}
