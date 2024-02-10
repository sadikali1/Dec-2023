package com.testng;

import org.testng.annotations.Test;

public class TestNgProperties {
	
	@Test(priority = 1, dependsOnMethods = {"test2"})
	public void test4() {
		System.out.println("Test4");
	}
	
	@Test
	public void test1() {
		System.out.println("Test1");
	}
	
	@Test(priority = 4, enabled = false)
	public void test2() {
		System.out.println("Test2");
	}
	
	@Test(priority = 3)
	public void test3() {
		System.out.println("Test3");
	}
	
	
 // DOM (Document Object Model)
 // POM (Page Object Model)
}

// Add
// delete
// update

