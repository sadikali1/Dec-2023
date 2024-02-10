package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FacebookSignUp {

	@Test()
	public void testFacebookSignUp() {
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("QA");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Test");
		
		//WebElement dayElement = driver.findElement(By.id("day"));
		Select selectDay = new Select(driver.findElement(By.id("day")));
		selectDay.selectByIndex(3);
		
		WebElement monthElement = driver.findElement(By.id("month"));
		Select monthSelect = new Select(monthElement);
		monthSelect.selectByValue("4");
		
		WebElement yearElement = driver.findElement(By.id("year"));
		Select yearSelect = new Select(yearElement);
		yearSelect.selectByVisibleText("2018");
		
		
	}
}


// Selenium -- Wait functions
// Implicit wait
// Explicit wait