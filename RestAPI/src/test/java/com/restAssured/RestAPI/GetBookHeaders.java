package com.restAssured.RestAPI;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetBookHeaders {
	
	@Test
	public void GetBookHeader()
	{
		// Specify the base URL to the RESTful web service 
		 RestAssured.baseURI="https://demoqa.com/BookStore/v1/Books";
		 
		// Get the RequestSpecification of the request to be sent to the server.
		 
		 RequestSpecification httprequest=RestAssured.given();
		 
		 Response response=httprequest.get("");
		 
		// Access header with a given name.
		 String contenttype=response.header("Content-Type");
		 System.out.println("Content-Type value: " + contenttype);
		 
		// Access header with a given name. 
		 
		 String Server=response.header("Server");
		 System.out.println("Server value: " + Server);
		 
		// Access header with a given name. Header = Content-Encoding 
		 String acceptLanguage = response.header("Content-Encoding"); 
		 System.out.println("Content-Encoding: " + acceptLanguage); 
		 
	}

}
