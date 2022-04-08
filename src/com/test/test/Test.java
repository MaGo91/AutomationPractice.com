package com.test.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.data.Data;
import com.test.pages.HomePage;
import com.test.test.TestCases;
import com.test.utilities.Util;

public class Test extends Util {

	public static void main(String[] args) {
		Data d = new Data();
		WebDriver driver = d.configInit();
		WebDriverWait wait = new WebDriverWait(driver, 100);
		
		TestCases tc = new TestCases();
		
		try {
			tc.registerTest(driver, wait);
			waitFor(driver, 3);
			
			tc.buyProductTest(driver, wait);
			waitFor(driver, 3);
			
			tc.checkOutTest(driver, wait);
			waitFor(driver, 3);
			
			tc.contactTest(driver, wait);
			waitFor(driver, 3);
			
			finishTest(driver);
		} catch (Exception e) {
			System.out.println("ERROR: "+e.getMessage());
		}
	}

}
