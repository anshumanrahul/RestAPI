package com.restAssured.RestAPI;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssured_StatusLineCheck {
	@Test
	public void StstusCheck() {
		// Specify the base URL to the RESTful web service 
		RestAssured.baseURI="https://demoqa.com/BookStore/v1/Books";
		
		// Get the RequestSpecification of the request to be sent to the server.
		RequestSpecification httprequest=RestAssured.given();
		Response response=httprequest.get("");
		
		String StatusLine=response.getStatusLine();
		
		Assert.assertEquals(StatusLine /*actual value*/, "HTTP/1.1 200 OK" 
			      /*expected value*/, "Correct status code returned");
		
		
	}

}
