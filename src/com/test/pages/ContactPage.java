package com.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.data.Data;
import com.test.utilities.Util;

public class ContactPage extends Util {
	
	public void sendContactMessage(WebDriver driver, WebDriverWait wait) {
		
		selectFirstElement(driver, Data.getXpath("ContactSelectSubjectHeading"));
		selectFirstElement(driver, Data.getXpath("ContactSelectOrder"));
		selectFirstElement(driver, Data.getXpath("ContactSelectProduct"));
		writeElement(driver, wait, Data.getXpath("ContactTextAreaMessage"), Data.getData("ContactMessage"));
		
		clickElement(driver, wait, Data.getXpath("ContactSubmit"));
	}
}

