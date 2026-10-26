package com.ui.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.constants.Size.*;
import com.ui.pages.SearchResultPage;
import com.utility.BrowserUtility;

public class ProductCheckoutTest extends TestBase {
	
	
	private static final String SEARCH_TERM = "Print summer dress";
	
	private SearchResultPage searchResultPage;
	
	@BeforeMethod(description = "User logs into the appication and searces for a product")
	public void setup() {
		searchResultPage = homePage.goToLoginPage().doLoginWith("dimap90606@abowned.com","Password").searchForAProduct(SEARCH_TERM);
		
	}
	
	
	
	@Test(description = "Verify if the logged in user is able to buy a dress" , groups = {"e2e" , "smoke" , "sanity"})
	public void checkoutTest() {
		
		
		searchResultPage.clickOnTheProductAtIndex(2).changeSize(M).addProductToCart().proceedToCheckout().
		
		goToConfirmAddressPage().goToShippmentPage().goToPaymentPage();
		
		
		
	}

}
