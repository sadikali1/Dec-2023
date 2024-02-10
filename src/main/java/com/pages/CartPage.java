package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CartPage {
	
	WebDriver driver;

	public CartPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(css = "[data-automation-id='at-product-title-link']> span")
	private WebElement productDetails;

	@FindBy(css="button[id=\"checkoutButton\"]")
	private WebElement checkOutButton;
	
	public void verifyProductDetail(String name) {
		String product = productDetails.getText();
		Assert.assertEquals(product, name);
	}
	
	public void clickCheckOutButton() {
		checkOutButton.click();
	}
	
}
