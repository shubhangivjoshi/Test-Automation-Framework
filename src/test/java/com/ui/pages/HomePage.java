package com.ui.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.constants.Browser;
import static com.constants.Env.*;
import com.utility.BrowserUtility;
import com.utility.JSONUtility;
import com.utility.LoggerUtility;

import static com.utility.PropertiesUtil.*;

public final class HomePage extends BrowserUtility {

	Logger logger = LoggerUtility.getLogger(this.getClass());

	private static final By SING_IN_LINK_LOCATOR = By.xpath("//a[contains(text(),'Sign in')]");

	public HomePage(Browser browser, boolean isHeadless) {
		super(browser, isHeadless);// to call the parent class constructor from the child constructor
		goToWebsite(JSONUtility.readJSON(QA).getUrl());
	}


	public HomePage(WebDriver driver) {
		
		super(driver);
		
		goToWebsite(JSONUtility.readJSON(QA).getUrl());
		
		
	}

	public LoginPage goToLoginPage() { // page functions -----> can not return void

		logger.info("Trying to performing click to go to sign in page");

		clickOn(SING_IN_LINK_LOCATOR);
		LoginPage loginPage = new LoginPage(getDriver());

		return loginPage;

	}


	public void quit() {
		// TODO Auto-generated method stub
		
	}




	

}
