package com.test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SeleniumExample {

	public static void main(String[] args) {
		//ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		EdgeDriver  driver= new EdgeDriver();
		//SafariDriver driver = new SafariDriver();
		//InternetExplorerDriver driver = new InternetExplorerDriver();
		driver.navigate().to("https://www.facebook.com/");

		driver.quit();
	}

}

// Selenium IDE
// Selenium RC --
// Selenium Webdriver
// Selenium Grid -- 

// TestNg --
// Extent Report/Allure Report
