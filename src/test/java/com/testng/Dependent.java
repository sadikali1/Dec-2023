package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependent {
	
	@Test
	public void add() {
		System.out.println("Added");
		Assert.fail();
	}
	
	@Test(dependsOnMethods = {"add", "update"})
	public void delete() {
		System.out.println("Deleted");
	}
	
	@Test(dependsOnMethods = {"add"})
	public void update() {
		System.out.println("Updated");
	}

}
