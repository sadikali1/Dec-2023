package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertExample {

	
	@Test
	public void hardAssertExp() {
		Assert.assertEquals(1, 2);
		Assert.assertEquals("Test1", "Test3", "Error message");
		Assert.assertTrue("Test Auomation".contains("Test"), "Test1 is not available 'Test Auomation'");
		
	}
	
	@Test
	public void softAssertExp() {
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(1, 2);
		softAssert.assertEquals("Test1", "Test3", "Error message");
		softAssert.assertTrue("Test Auomation".contains("Test1"), "Test1 is not available 'Test Auomation'");
		softAssert.assertAll();
	}
}



// Hard Assertion
// Soft Assertion