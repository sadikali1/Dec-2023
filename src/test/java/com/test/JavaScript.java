package com.test;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScript {

	@Test()
	public void testActionsButton() {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scroll(1000, 1000)");
		
		
	}
}
