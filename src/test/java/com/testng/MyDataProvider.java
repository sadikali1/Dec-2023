package com.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MyDataProvider {

	@Test(dataProvider = "TestData")
	public void testAdd(int a, int b, int result) {
	
		int sum = a+b;
		Assert.assertEquals(sum, result);
	}
	
	@DataProvider(name="TestData")
	public Object[][] setupData() {
		Object[][] obj = {
				{10, 20, 30},
				{12, 13, 25},
				{15, 20, 30},
				{10, 15, 25},
				{20, 30, 50}
		};
		return obj;
	}
}
