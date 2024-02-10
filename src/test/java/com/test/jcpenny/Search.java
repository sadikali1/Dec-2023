package com.test.jcpenny;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pages.HomePage;
import com.pages.ProductDetailsPage;
import com.utilties.BaseTest;

public class Search extends BaseTest{
	
	@Test()
	public void testSearch() {
		String prodct = "Home Expressions Reagan Stripe Quilt";
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.search(prodct);
				
		// verify product
		ProductDetailsPage productDetailsPage = PageFactory.initElements(driver, ProductDetailsPage.class);
		productDetailsPage.verifySearchResult(prodct);
	}

}

// POM (Page OBject MOdel)

// 