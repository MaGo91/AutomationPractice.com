package com.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.data.Data;
import com.test.utilities.Util;

public class ProductPage extends Util{
	
	public void plusProduct(WebDriver driver, WebDriverWait wait){
		clickElement(driver, wait, Data.getXpath("PlusProduct"));
	}
	
	public void selectSize(WebDriver driver,WebDriverWait wait, String value) {
		selectOptionByValue(driver,wait,Data.getXpath("SizeProductSelect"),value);
	}
	
	public void addToCar(WebDriver driver, WebDriverWait wait) {
		clickElement(driver, wait, Data.getXpath("AddToCarButton"));
	}
}