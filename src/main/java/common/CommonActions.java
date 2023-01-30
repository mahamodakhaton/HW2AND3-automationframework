package common;


import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import org.testng.Assert;

import reporting.Logs;

public class CommonActions {
	public static void  clickelement(WebElement element) {
		try {
			element.click();
			Logs.log(element + "has been clicked");
			Assert.assertTrue(true);
			
		} catch (NoSuchElementException |NullPointerException e) {
			e.printStackTrace();
			Logs.log(element + "no element found");
			Assert.fail();
			
		}
		
	}
	public static void inputtext(WebElement element, String input) {
		try {
			element.sendKeys(input);
			Logs.log(input + "has been placed to" + element);	
		} catch (NoSuchElementException | NullPointerException e) {
			e.printStackTrace();
			Logs.log(element + "has not been found, so should not put the input");
			Assert.fail();
		}
		
	}
	
}
