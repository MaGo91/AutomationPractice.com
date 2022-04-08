package com.test.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.data.Data;
import com.test.pages.AuthenticationPage;
import com.test.pages.CheckOutPage;
import com.test.pages.ContactPage;
import com.test.pages.HomePage;
import com.test.pages.ProductListPage;
import com.test.pages.ProductPage;
import com.test.utilities.Util;

public class TestCases extends Util {
		
	public void registerTest(WebDriver driver, WebDriverWait wait) {
		HomePage hp = new HomePage();
		AuthenticationPage ap = new AuthenticationPage();
		
		hp.goToSignIn(driver, wait);
		ap.registerStep1(driver, wait);
		ap.registerStep2(driver, wait);
		hp.logOut(driver, wait);
		hp.goHome(driver, wait);
		
		System.out.println("Register Test, Sucessfully DONE...");
	}
	
	public void buyProductTest(WebDriver driver, WebDriverWait wait) {
		HomePage hp = new HomePage();
		AuthenticationPage ap = new AuthenticationPage();
		ProductListPage plp = new ProductListPage();
		ProductPage pp = new ProductPage();

		hp.goToSignIn(driver, wait);
		ap.logIn(driver, wait);
		hp.goHome(driver, wait);
		hp.goToProductList(driver, wait);
		plp.selectProduct(driver, wait);
		pp.plusProduct(driver, wait);
		pp.addToCar(driver, wait);
		
		System.out.println("Buy Product Test, Sucessfully DONE...");
	}
	
	public void checkOutTest(WebDriver driver, WebDriverWait wait) {
		CheckOutPage cop = new CheckOutPage();

		cop.proceedToCheckOut(driver, wait);
		
		System.out.println("Checkout Test, Sucessfully DONE...");
	}
	
	public void contactTest(WebDriver driver, WebDriverWait wait) {
		HomePage hp = new HomePage();
		ContactPage cp = new ContactPage();
		
		hp.goToContactUs(driver, wait);
		cp.sendContactMessage(driver, wait);
		
		System.out.println("Contact Test, Sucessfully DONE...");
	}
}
