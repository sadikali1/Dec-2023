package com.api;

import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Pets {

	private int id;
	
	@BeforeClass
	public void set() {
		RestAssured.baseURI = "https://petstore3.swagger.io/api/v3/";
	}
	
	@Test
	public void testAddPet() {
		
		String json = "{"
				+ "  \"id\": 10,"
				+ "  \"name\": \"doggie\","
				+ "  \"category\": {"
				+ "    \"id\": 1,"
				+ "    \"name\": \"Dogs\""
				+ "  },"
				+ "  \"photoUrls\": ["
				+ "    \"string\""
				+ "  ],"
				+ "  \"tags\": ["
				+ "    {"
				+ "      \"id\": 0,"
				+ "      \"name\": \"string\""
				+ "    }"
				+ "  ],"
				+ "  \"status\": \"available\""
				+ "}";
		
		Response response = RestAssured.given().body(json).header("Content-Type", "application/json")
				.header("Accept", "application/json").when().post("pet");
		
		System.out.println(response.asPrettyString());
		System.out.println(response.statusCode());
		id = response.path("id");
		System.out.println(id);
		response.then().statusCode(200).and().contentType("application/json");
		Assert.assertEquals(response.statusCode(), 200);
		
		response.then().body("status",  Matchers.equalTo("available")).body("category.name",  Matchers.equalTo("Dogs"))
		.and().body("tags[0].name",  Matchers.equalTo("string"));
		
	}
	
	@Test(dependsOnMethods = {"testAddPet"})
	public void testUpdatePet() {
		String json = "{"
				+ "  \"id\": "+id+","
				+ "  \"name\": \"doggie\","
				+ "  \"category\": {"
				+ "    \"id\": 1,"
				+ "    \"name\": \"Dogs\""
				+ "  },"
				+ "  \"photoUrls\": ["
				+ "    \"string\""
				+ "  ],"
				+ "  \"tags\": ["
				+ "    {"
				+ "      \"id\": 0,"
				+ "      \"name\": \"string\""
				+ "    }"
				+ "  ],"
				+ "  \"status\": \"available\""
				+ "}";
		
		Response response = RestAssured.given().body(json).header("Content-Type", "application/json")
				.header("Accept", "application/json").when().put("pet");
		
		System.out.println(response.asPrettyString());
		System.out.println(response.statusCode());
		
		response.then().statusCode(200).and().contentType("application/json");
		
		
		Assert.assertEquals(response.statusCode(), 200);
		
	}
	
	@Test(dependsOnMethods = {"testAddPet", "testUpdatePet"})
	public void getPetsById() {
		Response response = RestAssured.given().when().get("pet/"+id);
		System.out.println(response.statusCode());
		System.out.println(response.asPrettyString());
		response.then().statusCode(200).and().contentType("application/json");
	}
	
	@Test
	public void getPetsByStatus() {
		Response response = RestAssured.given().queryParam("status", "available").when().get("pet/findByStatus");
		System.out.println(response.statusCode());
		System.out.println(response.asPrettyString());
		response.then().statusCode(200).and().contentType("application/json");
	}
	
	@Test(dependsOnMethods = {"testAddPet", "testUpdatePet", "getPetsById"})
	public void testPetDelete() {
		Response response = RestAssured.given().when().delete("pet/"+id);
		System.out.println(response.statusCode());
		System.out.println(response.asPrettyString());
		response.then().statusCode(200);
	}
	
}


// Given
// When
// Then

// TestNg -- TDD 
// cucumber -- BDD

// Given I open application url
// And I am on login page
// When I enter user name and password
// And I click on login button
// Then I verify user login successfully
// And I verify home page
//
// 