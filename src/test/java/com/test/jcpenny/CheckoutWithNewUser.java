package com.test.jcpenny;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pages.CartPage;
import com.pages.HomePage;
import com.pages.ProductDetailsPage;
import com.utilties.BaseTest;

public class CheckoutWithNewUser extends BaseTest{

	@Test()
	public void testCheckOutNewUser() {
		String prodct = "Home Expressions Reagan Stripe Quilt";
		// search product
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.search(prodct);
		
		// verify product
		ProductDetailsPage productDetailsPage = PageFactory.initElements(driver, ProductDetailsPage.class);
		productDetailsPage.verifySearchResult(prodct);
		
		// add to cart
		productDetailsPage.addCart();
		
		// view cart and checkout 
		productDetailsPage.clickViewCheckOut();
		
		// Verify product on cart page and checkout
		CartPage cartPage = PageFactory.initElements(driver, CartPage.class);
		cartPage.verifyProductDetail(prodct);
		cartPage.clickCheckOutButton();
		
		// Create new account
	}
}
