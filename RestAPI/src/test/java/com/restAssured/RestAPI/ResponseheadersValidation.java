package com.restAssured.RestAPI;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ResponseheadersValidation {
	
	@Test
 public void Responseheaders()
 {
	// Specify the base URL to the RESTful web service 
	 RestAssured.baseURI="https://demoqa.com/BookStore/v1/Books";
	 
	// Get the RequestSpecification of the request to be sent to the server.
	 
	 RequestSpecification httprequest=RestAssured.given();
	 
	 Response response=httprequest.get("");
	 
	// Get all the headers and then iterate over allHeaders to print each header 
	 
	 Headers allheaders=response.headers();
	 
	// Iterate over all the Headers
	 
	 for(Header header: allheaders)
	 {
		 System.out.println("Key" +header.getName() + " Value" + header.getValue());
	 }
	 
	 
	 
 }

}
