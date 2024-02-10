package com.test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumTestNG {

	ChromeDriver driver;

	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		Assert.fail();
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	@Test()
	public void navigateUrl() {
		
		driver.navigate().to("https://www.facebook.com/");
		
		
	}

}
