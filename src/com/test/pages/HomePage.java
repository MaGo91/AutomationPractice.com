package com.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.data.*;
import com.test.utilities.Util;

public class HomePage extends Util {
	
	public void goHome(WebDriver driver, WebDriverWait wait) {
		clickElement(driver, wait, Data.getXpath("HomeLink"));
	}
	
	public void goToSignIn(WebDriver driver, WebDriverWait wait) {
		clickElement(driver, wait, Data.getXpath("HomeSignInLink"));
	}
	
	public void logOut(WebDriver driver, WebDriverWait wait) {
		clickElement(driver, wait, Data.getXpath("HomeLogout"));
	}
	
	public void goToContactUs(WebDriver driver, WebDriverWait wait) {
		clickElement(driver, wait, Data.getXpath("HomeContactUs"));
	}

	public void goToProductList(WebDriver driver, WebDriverWait wait){
		clickElement(driver,wait,Data.getXpath("LinkFilterProduct"));
	}
}

