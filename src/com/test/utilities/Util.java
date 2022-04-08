package com.test.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util {

	public static void back(WebDriver driver) {
		driver.navigate().back();
	}

	public static void finishTest(WebDriver driver) {
		driver.close();
		driver.quit();
	}

	public static void waitFor(WebDriver driver, int seconds) throws InterruptedException {
		try {
			Thread.sleep(seconds*1000);
		} catch(InterruptedException ex) {
			
			driver.close();
			driver.quit();
		}
	}
	
	public static void writeElement(WebDriver driver, WebDriverWait wait, String xPath, String value) {
        WebElement e; 
        e = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xPath)));
        e.clear();
        e.sendKeys(value);
	}
	
	public static void clickElement(WebDriver driver, WebDriverWait wait, String xPath) {
        WebElement e; 
        e = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xPath)));
        e.click();
	}
	
	public static void selectElementByText(WebDriver driver, String xPath, String value) {
        Select e = new Select(driver.findElement(By.xpath(xPath)));
        e.selectByVisibleText(value);
	}
	
	
	public static void selectFirstElement(WebDriver driver, String xPath) {
        Select e = new Select(driver.findElement(By.xpath(xPath)));
        e.selectByIndex(1);
	}
	
	public void selectOptionByValue(WebDriver driver, WebDriverWait wait, String xPath, String value) {
		Select sel = new Select(driver.findElement(By.xpath(xPath)));
		sel.selectByValue(value);	
	}

}
