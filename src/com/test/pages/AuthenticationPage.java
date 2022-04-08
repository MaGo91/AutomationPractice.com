package com.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.data.Data;
import com.test.utilities.Util;

public class AuthenticationPage extends Util {
	
	public void logIn(WebDriver driver, WebDriverWait wait) {
		writeElement(driver, wait, Data.getXpath("LoginInputEmail"), Data.getData("RegisterEmail"));
		writeElement(driver, wait, Data.getXpath("LoginPw"), Data.getData("RegisterPassword"));
		clickElement(driver, wait, Data.getXpath("LoginSubmit"));
	}
	
	public void registerStep1(WebDriver driver, WebDriverWait wait) {
		writeElement(driver, wait, Data.getXpath("RegisterInputEmail"), Data.getData("RegisterEmail"));
		clickElement(driver, wait, Data.getXpath("RegisterSubmitStep1"));
	}
	
	public void registerStep2(WebDriver driver, WebDriverWait wait) {
		clickElement(driver, wait, Data.getXpath("RegisterCheckTitle"));
		writeElement(driver, wait, Data.getXpath("RegisterInputCustomerFirstName"), Data.getData("RegisterCustomerFirstName"));
		writeElement(driver, wait, Data.getXpath("RegisterInputCustomerLastName"), Data.getData("RegisterCustomerLastName"));
		writeElement(driver, wait, Data.getXpath("RegisterInputPassword"), Data.getData("RegisterPassword"));
		selectElementByText(driver, Data.getXpath("RegisterSelectDay"), Data.getData("RegisterDay"));
		selectElementByText(driver, Data.getXpath("RegisterSelectMonth"), Data.getData("RegisterMonth"));
		selectElementByText(driver, Data.getXpath("RegisterSelectYear"), Data.getData("RegisterYear"));
		writeElement(driver, wait, Data.getXpath("RegisterInputFirstName"), Data.getData("RegisterFirstName"));
		writeElement(driver, wait, Data.getXpath("RegisterInputLastName"), Data.getData("RegisterLastName"));
		writeElement(driver, wait, Data.getXpath("RegisterInputCompany"), Data.getData("RegisterCompany"));
		writeElement(driver, wait, Data.getXpath("RegisterInputAddress"), Data.getData("RegisterAddress"));
		writeElement(driver, wait, Data.getXpath("RegisterInputCity"), Data.getData("RegisterCity"));
		selectElementByText(driver, Data.getXpath("RegisterSelectState"), Data.getData("RegisterState"));
		writeElement(driver, wait, Data.getXpath("RegisterInputPostCode"), Data.getData("RegisterPostCode"));
		writeElement(driver, wait, Data.getXpath("RegisterInputAditionalInfo"), Data.getData("RegisterAditionalInfo"));
		writeElement(driver, wait, Data.getXpath("RegisterInputPhone"), Data.getData("RegisterPhone"));
		writeElement(driver, wait, Data.getXpath("RegisterInputAlias"), Data.getData("RegisterAlias"));
		clickElement(driver, wait, Data.getXpath("RegisterSubmitStep2"));
	}
}
