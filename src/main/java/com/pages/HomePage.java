package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(id = "searchInputId")
	private WebElement searchElement;
	
	@FindBy(xpath = "//button[@data-automation-id='searchIconBlock']")
	private WebElement searchButton;
	
	
	//By searchLocator = By.id("searchInputId");
	//By searchButton = By.xpath(;
	
	public void search(String product) {
		searchElement.sendKeys(product);
		searchButton.click();
	}
}


// Utility 