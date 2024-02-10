package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetMethods {

	@Test()
	public void getDriverMethods() {
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String sourceCode = driver.getPageSource();
		System.out.println(sourceCode);
		
	}
	
	@Test()
	public void getWebElementMethods() {
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String text = driver.findElement(By.className("_8eso")).getText();
		System.out.println(text);
		Assert.assertEquals(text, "Facebook helps you connect and share with the people in your life.");
		
		String att = driver.findElement(By.id("email")).getAttribute("placeholder");
		System.out.println(att);
		Assert.assertEquals(att, "Email address or phone number");
		
		WebElement element = driver.findElement(By.name("login"));
		String fontSize = element.getCssValue("font-size");
		System.out.println(fontSize);
		
		String lineHeight = element.getCssValue("line-height");
		System.out.println(lineHeight);
		
		
	}
}
