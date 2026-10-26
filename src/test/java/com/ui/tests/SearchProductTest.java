package com.ui.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ui.pages.MyAccountPage;

@Listeners({com.ui.listeners.TestListener.class})

public class SearchProductTest extends TestBase {
	
	
	private MyAccountPage myAccouuntPage;
	
	private static final String SEARCH_TERM = "Short black dress";
	
	@BeforeMethod(description = "Valid user logs ino the application")
	public void setup() {
		myAccouuntPage = homePage.goToLoginPage().doLoginWith("dimap90606@abowned.com","Password");
		
	}
	
	
	@Test(description = "Verify if the logged in user is able to search for a product and correct product search are displayed" , groups = {"e2e","smoke", "sanity"})
	
	public void verifyProductSearchTest() {
		
		boolean actualResult = myAccouuntPage.searchForAProduct(SEARCH_TERM).isSearchTermPresentInProductList(SEARCH_TERM);
		Assert.assertEquals(actualResult, true);
		
	}
	
	
	

}
