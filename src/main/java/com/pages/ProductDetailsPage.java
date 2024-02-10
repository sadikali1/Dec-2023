package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ProductDetailsPage {

	WebDriver driver;

	public ProductDetailsPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//h1[@data-automation-id=\"product-title\"]")
	private WebElement productNameElement;
	
	@FindBy(css = "p[data-automation-id=\"addToCart\"]")
	private WebElement addToCartElement;
	
	@FindBy(xpath="//button[@data-automation-id=\"at-panel-checkout-button\"]")
	private WebElement viewCheckOut;
	
	public void verifySearchResult(String product) {
		String text = productNameElement.getText();
		Assert.assertEquals(text, product);
	}
	
	public void addCart() {
		addToCartElement.click();
	}
	
	public void clickViewCheckOut() {
		viewCheckOut.click();
	}
}
