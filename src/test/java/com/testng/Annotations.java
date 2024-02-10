package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

	@BeforeSuite
	public void sBefore() {
		System.out.println("Before Suite");
	}
	
	@AfterSuite
	public void sAfter() {
		System.out.println("After Suite");
	}
	
	@BeforeTest
	public void tBefore() {
		System.out.println("Before Test");
	}
	
	@AfterTest
	public void tAfter() {
		System.out.println("After Test");
	}
	
	@BeforeClass
	public void beforeC() {
		System.out.println("Before class");
	}
	
	@AfterClass
	public void afterC() {
		System.out.println("After class");
	}
	
	@BeforeMethod
	public void bMethod() {
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void aMethod() {
		System.out.println("After Method");
	}
	
	@Test
	public void test1() {
		System.out.println("Test 1");
	}
	
	@Test
	public void test2() {
		System.out.println("Test 2");
	}
}

// xml format
// 
