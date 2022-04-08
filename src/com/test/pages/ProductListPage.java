package com.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.data.Data;
import com.test.utilities.Util;

public class ProductListPage extends Util{
	
	public void selectCategory(WebDriver driver, WebDriverWait wait, int number){
		clickElement(driver, wait, Data.getXpath("CategoryProduct")+number+"']");
	}
	
	public void selectSize(WebDriver driver, WebDriverWait wait, int number){
		clickElement(driver, wait, Data.getXpath("SizeProductChk")+number+"']");
	}
	
	public void selectFeature(WebDriver driver, WebDriverWait wait, int number){
		clickElement(driver, wait, Data.getXpath("FeatureProduct")+number+"']");
	}
	
	public void selectManufacturer(WebDriver driver, WebDriverWait wait, int number){
		clickElement(driver, wait, Data.getXpath("ProductManufacturer")+number+"']");
	}
	
	public void selectNew(WebDriver driver, WebDriverWait wait){
		clickElement(driver, wait, Data.getXpath("ProductNewOption"));
	}
	
	public void selectProduct(WebDriver driver, WebDriverWait wait) {
		clickElement(driver,wait, Data.getXpath("ProductLink"));
	}
}