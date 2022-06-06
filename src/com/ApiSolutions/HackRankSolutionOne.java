package com.ApiSolutions;

import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class HackRankSolutionOne {
	
public static void fetchResponse(String city){
	
	RestAssured.baseURI = "https://jsonmock.hackerrank.com/";
	
	Response resp = RestAssured.given().queryParam("page", "1")
			.queryParam("city",city)
			.when().get("api/food_outlets")
			.then().extract().response();
	
	String respone = resp.asString(); 
	
	JsonPath js = new JsonPath(respone);
	
	int dataSize = js.getInt("data.size()"); 
	
	for( int i = 0; i< dataSize ;i++) {
		
		float avgRating = js.getFloat("data["+i+"].user_rating.average_rating"); 
		if(avgRating > 4.4)
			System.out.println(js.getString("data["+i+"].user_rating.average_rating"));
	}
	
	
	
}
	public static void main(String[] args) {
		System.out.println("In Main Method");
		fetchResponse("Houston");
		System.out.println("Ending Rest API call ");
		
	}

}
