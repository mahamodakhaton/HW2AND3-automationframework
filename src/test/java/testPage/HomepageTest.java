package testPage;

import java.awt.Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import baseUtil.BaseClass;
import net.bytebuddy.asm.Advice.Enter;

// Number Two Home Work(*****************************************************)

public class HomepageTest extends BaseClass {
	private String checkboxselected;

	@Test(enabled = false)
	public void sendkeyssearch() throws InterruptedException {
		homepage.sendkeysinsearcchelement();
	}

	@Test(enabled = false, priority = 1)
	public void clickAccountTest() throws InterruptedException {
		homepage.clickAccount();
	}

	@Test(enabled = false)
	public void searchnametest() throws InterruptedException {
		homepage.clicksearchname();
	}

	@Test(enabled = false)
	public void searchblueshado() throws InterruptedException {
		homepage.searchblueshadow();

	}

	@Test(enabled = false)
	public void searchweeklyAd() throws InterruptedException {
		homepage.searchweeklyAd();
	}

	@Test(enabled = false)
	public void searchaccountelement() throws InterruptedException {
		homepage.searchaccountElement();
	}

	@Test(enabled = false)
	public void searchIconCart() throws InterruptedException {
		homepage.searchIconCart();
	}

	@Test(enabled = false)
	public void searchNewyearElement() throws InterruptedException {
		homepage.searchNewyearElement();
	}

	@Test(enabled = false)
	public void searchEmailelement() throws InterruptedException {
		homepage.searchaccountElement();
	}

	// Number Three Home Work(***************************************************************************)
	@Test(enabled = false)
	public void role1_use_of_cssSelector_as_locator_logo() {
		driver.findElement(By.cssSelector("span.icon.icon__wag-corner-flag")).click();

	}

	@Test(enabled = false)
	public void role2_use_of_cssSelector_as_locator_Newyear() {
		driver.findElement(By.cssSelector("span.font__fifty.color__text-blue")).click();
	}

	@Test(enabled = false)
	public void role3_use_of_cssSelector_as_locator_searchIconCart() {
		driver.findElement(By.cssSelector("span.icon.icon__cart")).click();
	}

	@Test(enabled = false)
	public void use_of_isdisplayed_in_image() {
		boolean elementDisplayed = driver.findElement(By.cssSelector("span.icon.icon__wag-corner-flag")).isDisplayed();
		System.out.println("is the Logo displayed? Ans:" + elementDisplayed);
	}

	@Test(enabled = false) // This is enable button (*****************************)
	public void AccountfunctionalityTest() throws InterruptedException {
		homepage.clickAccount();
		homepage.clickSigningElement();
		homepage.displayedenableShowPassword();

	}

	@Test(enabled = false) // This is selected button (****************************)

	public void use_of_AccountfunctionalityTest1() throws InterruptedException {
		homepage.clickAccount();
		homepage.clickSigningElement();
		homepage.checkselectbox();
		System.out.println("is this checkbox selected? Ans:" + checkboxselected);

	}

	@Test(enabled = false) // (  This is LogoTest*****************************************************)
	public void logoDisplayedTest() {
		homepage.logoDisplayed();
	}

	@Test(enabled = false)
	public void use_of_getTitle_method_in_home_page() {
		System.out.println("The title of the pageis:" + driver.getTitle());

	}

	@Test(enabled = false)// (Url Test*********************************************************)
	public void use_of_getCurrentURL_method() throws InterruptedException {
		System.out.println("The title of the pageis:" + driver.getCurrentUrl());

	}
	@Test (enabled = false)  //(Text Method*******************************************************)
	public void use_of_getText_method() {
		WebElement weeklyAdElement = driver.findElement(By.xpath("//strong[contains(text(),'Weekly Ad')]"));
		System.out.println("The Text for the Web Element is:"+weeklyAdElement.getText());
		
	}
	@Test (enabled = false) //( Attribute Method****************************************************)
	public void use_of_getAttribute_method() {
		String logo = driver.findElement(By.cssSelector("span.icon.icon__wag-corner-flag")).getAttribute("cssSelector");
		System.out.println("The value of attiribute is:" + logo);
	}
	@Test(enabled = false) //( Clear Method************************************************************)
	public void Use_of_clear_method_in_searchEngine() throws InterruptedException {
		driver.findElement(By.id("ntt-placeholder")).sendKeys("Cosmetics");
		Thread.sleep(5000);
		driver.findElement(By.id("ntt-placeholder")).clear();
		Thread.sleep(5000);
		driver.findElement(By.id ("ntt-placeholder")).sendKeys("Shampoo");
		Thread.sleep(5000);
		
		
	}
	@Test(enabled = true)
	public void Use_of_clear_method_in_searchEngine1() throws InterruptedException {
		driver.findElement(By.id("ntt-placeholder")).sendKeys("Cosmetics",Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.id("ntt-placeholder")).clear();
		Thread.sleep(5000);
		driver.findElement(By.id ("ntt-placeholder")).sendKeys("Shampoo",Keys.ENTER);
		Thread.sleep(5000);
	

}
	@Test(enabled = false)
	public void Use_of_navigate_method() throws InterruptedException {
		Thread.sleep(5000);
		driver.navigate().to("https://www.walmart.com");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		
}
}