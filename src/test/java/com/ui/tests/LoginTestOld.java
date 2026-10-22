package com.ui.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.BrowserUtility;






public class LoginTestOld {

	public static void main(String[] args) {

		WebDriver wd = new ChromeDriver();

		BrowserUtility  browserUtility  = new BrowserUtility(wd);
		
		browserUtility.goToWebsite("https://automationpractice.techwithjatin.com");
		
		browserUtility.maximizeWindow();

		

		// Sign in

		By singInLinkLocator = By.xpath("//a[contains(text(),'Sign in')]");
		
        browserUtility.clickOn(singInLinkLocator);
		
		
		By emailTextBoxLocator = By.id("email");
		browserUtility.enterText(emailTextBoxLocator, "dimap90606@abowned.com");
		


	

		By passwordTextBoxLocator = By.id("passwd");
		
		browserUtility.enterText(passwordTextBoxLocator, "Password");

		
		
		By submitLoginButtonLocator = By.id("SubmitLogin");

		browserUtility.clickOn(submitLoginButtonLocator);
		
		
		

	}

}
