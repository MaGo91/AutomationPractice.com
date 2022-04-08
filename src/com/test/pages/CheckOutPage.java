package com.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.data.Data;
import com.test.utilities.Util;

public class CheckOutPage extends Util {

	 public void proceedToCheckOut (WebDriver driver, WebDriverWait wait) {
		 
		 clickElement(driver, wait, Data.getXpath("ProceedToCheckOut"));
		 clickElement(driver, wait, Data.getXpath("ProceedToCheckOut2"));
		 clickElement(driver, wait, Data.getXpath("ProcessAdress"));
		 clickElement(driver, wait, Data.getXpath("CarrierCheck"));
		 clickElement(driver, wait, Data.getXpath("ProcessCarrier"));
		 clickElement(driver, wait, Data.getXpath("PayByBankWire"));
		 clickElement(driver, wait, Data.getXpath("Submit"));
	 }
}
