package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Facebook {
	WebDriver driver;

	@BeforeMethod
	@Parameters({"browser"})
	public void setup(String browserType) {
		System.out.println(browserType);
		if(browserType.equals("chrome"))
			driver = new ChromeDriver();
		else if(browserType.equals("firefox"))
			driver = new FirefoxDriver();
		else if(browserType.equals("edge"))
			driver = new EdgeDriver();
		else
			throw new RuntimeException("Please pass correct value of browser");
	}
	
	@Test()
	public void navigateUrl() {
		driver.navigate().to("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.id("email"));
		email.clear();
		email.sendKeys("demo@test.com");
		
		WebElement passwordInput = driver.findElement(By.id("pass"));
		email.clear();
		passwordInput.sendKeys("Password");
		
		//WebElement loginInButton = driver.findElement(By.name("login"));
		//loginInButton.click();
		
		driver.findElement(By.name("login")).click();
	}
	
	@AfterMethod
	public void close() {
		driver.quit();
	}
}


// element 
//	-- locator

// By.id
// By.name
// By.xpath
// By.cssSelector
// By.className
// By.link
// By.partialLink
// By.tagName
// 

