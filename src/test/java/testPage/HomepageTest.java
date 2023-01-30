package testPage; 
import static common.CommonActions.*;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



import baseUtil.BaseClass;

// Number Two Home Work(*****************************************************)

public class HomepageTest extends BaseClass {

	private String checkSelectbox;
	private Set<String> allWindowHandles;

	@Test(enabled = false, priority = 1)
	public void sendkeyssearch() throws InterruptedException {
		homepage.sendkeysinsearcchelement();
	}

	
	@Test(enabled = false, priority = 2)
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

	// Number Three Home
	// Work(***************************************************************************)
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
		System.out.println("is this checkbox selected? Ans:" + checkSelectbox);
	}

	@Test(enabled = false)
	public void InputTextInAccountandSigningThenClickSelectBox1() throws InterruptedException {
		homepage.InputTextInAccountandSigningThenClickSelectBox1();
	}

	@Test(enabled = false) // ( This is LogoTest*****************************************************)
	public void logoDisplayedTest() {
		homepage.logoDisplayed();
	}

	@Test(enabled = false)
	public void use_of_getTitle_method_in_home_page() {
		System.out.println("The title of the pageis:" + driver.getTitle());

	}

	@Test(enabled = false) // (Url Test*********************************************************)
	public void use_of_getCurrentURL_method() throws InterruptedException {
		System.out.println("The title of the pageis:" + driver.getCurrentUrl());

	}

	@Test(enabled = false) // (Text Method*******************************************************)
	public void use_of_getText_method() {
		WebElement weeklyAdElement = driver.findElement(By.xpath("//strong[contains(text(),'Weekly Ad')]"));
		System.out.println("The Text for the Web Element is:" + weeklyAdElement.getText());

	}

	@Test(enabled = false) // ( Attribute Method****************************************************)
	public void use_of_getAttribute_method() {
		String logo = driver.findElement(By.cssSelector("span.icon.icon__wag-corner-flag")).getAttribute("cssSelector");
		System.out.println("The value of attiribute is:" + logo);
	}

	@Test(enabled = false) // ( Clear Method************************************************************)
	public void Use_of_clear_method_in_searchEngine() throws InterruptedException {
		driver.findElement(By.id("ntt-placeholder")).sendKeys("Cosmetics");
		Thread.sleep(5000);
		driver.findElement(By.id("ntt-placeholder")).clear();
		Thread.sleep(5000);
		driver.findElement(By.id("ntt-placeholder")).sendKeys("Shampoo");
		Thread.sleep(5000);

	}

	@Test(enabled = false)
	public void Use_of_clear_method_in_searchEngine1() throws InterruptedException {
		driver.findElement(By.id("ntt-placeholder")).sendKeys("Cosmetics", Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.id("ntt-placeholder")).clear();
		Thread.sleep(5000);
		driver.findElement(By.id("ntt-placeholder")).sendKeys("Shampoo", Keys.ENTER);
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

	// Home work Five
	// ******************************************************************************************

	@Test(enabled = false)
	public void use_of_set_specific_size_in_a_window() throws InterruptedException {
		Thread.sleep(4000);
		dimension = new Dimension(800, 500);
		driver.manage().window().setSize(dimension);
		driver.navigate().to("https://www.bcbs.com/");
		Thread.sleep(4000);
		System.out.println("The size of the maximize screen is:" + driver.manage().window().getSize());
		driver.manage().window().maximize();
		Thread.sleep(5000);
		System.out.println("The size of the screen is:" + driver.manage().window().getSize());
		Thread.sleep(4000);
		driver.manage().window().setSize(dimension);
		Thread.sleep(5000);
		System.out.println("The size of the screen is:" + driver.manage().window().getSize());
		driver.manage().window().fullscreen();
		Thread.sleep(5000);
		System.out.println("The size of the screen is:" + driver.manage().window().getSize());
	}

	@Test(enabled = false)
	public void use_of_set_script_timeout_for_window() {
		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(15));
		driver.get("https://www.walmart.com/store/3795-north-bergen-nj");
	}

	@Test(enabled = false)
	public void logoDisplayedtest1() {
		homepage.logoDisplayed();
		assertTrue(true, "Application logo is not Displayed");
	}

	@Test(enabled = false)
	public void role1_use_of_hard_assert_method() throws InterruptedException {
		Thread.sleep(5000);
		driver.get("https://www.walgreens.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement logo = driver.findElement(By.cssSelector("span.icon.icon__wag-corner-flag"));
		boolean star2 = logo.isDisplayed();
		System.out.println("Logo is Displayed" + star2);
		assertTrue(true, "Application is not displayed");
	}

	@Test(enabled = false) 
	public void role2_use_of_hard_assert_method() throws InterruptedException {
		Thread.sleep(5000);
		driver.get("https://www.walgreens.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofDays(20));
		WebElement logo = driver.findElement(By.cssSelector("span.icon.icon__wag-corner-flag"));
		boolean star = logo.isDisplayed();
		System.out.println("Logo is Displayed"+ star);
		assertFalse(true, "Application logo is not displayed");

	}
	


	@Test(enabled = false) // fail
	public void use_of_getTitle_method_with_assertion1() throws InterruptedException {
		driver.get("https://www.costco.com/");
		String expected = "Welcome to Costco Wholesale";
		String actual = driver.getTitle();
		System.out.println("Actual title: " + actual);
		Assert.assertEquals(actual, expected, "Titles doesn't match");
		Thread.sleep(3000);
	}

	@Test(enabled = false) // fail This should be fail
	public void use_of_getTitle_method_with_assertion02() throws InterruptedException {
		String expected = "https://www.walgreens.com/";
		String actual = driver.getTitle();
		System.out.println("Actual title:" + actual);
		Assert.assertEquals(actual, expected, "Home page Title doesnot match");
		Thread.sleep(4000);
		String currentURL = driver.getCurrentUrl();
		System.out.println("The current url is: " + currentURL);
		
	}
		
		

	@Test(enabled = false)
	public void use_of_getTitle_method_with_soft_assertion() throws InterruptedException {
		String expected = "https://www.walgreens.com/";
		String actual = driver.getTitle();
		System.out.println("The Title of the home page is:" + actual);
		SoftAssert softAssert = new SoftAssert();
		// assertEquals(actual, expected,"Home page Title doesnot match");
		String currentURL = driver.getCurrentUrl();
		System.out.println("The current url is: " + currentURL);
	}

	@Test(enabled = false)
	public void use_of_mouse_hoverAction_on_aboutUS() throws InterruptedException {
		Thread.sleep(5000);
		driver.get("https://www.costco.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// actions = new Actions(driver);
		WebElement aboutUs = driver.findElement(By.xpath("//a[@class='grocery nav-flyout' and @id='Home_Ancillary_0']"));
		Thread.sleep(5000);
		actions.moveToElement(aboutUs).build().perform();
		Thread.sleep(4000);
	}

	@Test(enabled = false)
	public void use_of_mouse_hoverAction_on_ourLocations() throws InterruptedException {
		Thread.sleep(5000);
		driver.get("https://www.costco.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		actions = new Actions(driver);
		WebElement grocery = driver.findElement(By.xpath("//a[@class='grocery nav-flyout' and @id='Home_Ancillary_0']"));
		Thread.sleep(5000);
		actions.moveToElement(grocery).build().perform();
		Thread.sleep(4000);
	}

	@Test(enabled = false)
	public void use_of_dropdown_selectByVisibleText_method() throws InterruptedException {
		Thread.sleep(5000);
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement droElement1 = driver.findElement(By.xpath("//select[@id='gh-cat']"));
		select = new Select(droElement1);
		select.selectByVisibleText("All Categories");
		Thread.sleep(5000);

	}

	@Test(enabled = false)
	public void use_of_dropdown_selectByIndex_method() throws InterruptedException {
		Thread.sleep(5000);
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement droElement2 = driver.findElement(By.xpath("//select[@id='gh-cat']"));
		select = new Select(droElement2);
		select.selectByIndex(5);
		Thread.sleep(5000);

	}

	@Test(enabled = false)
	public void use_of_dropdown_selectByvalue_method() throws InterruptedException {
		Thread.sleep(5000);
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement droElement3 = driver.findElement(By.xpath("//select[@id='gh-cat']"));
		select = new Select(droElement3);
		select.selectByValue("267");
		Thread.sleep(5000);
	}

	@Test(enabled = false)
	public void use_of_click_method_in_loginButtonTest() throws InterruptedException {
		driver.findElement(By.id("ntt-placeholder")).click();
		Thread.sleep(3000);

	}
	@Test(enabled = false)
	public void alternate_use_of_click_method_in_loginButtonTest1() throws InterruptedException {
		driver.findElement(By.id("ntt-placeholder")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	}
	
	@Test(enabled = false)
	public void alternate_use_of_click_method_in_loginButtonTest2() throws InterruptedException {
		driver.findElement(By.id("ntt-placeholder")).sendKeys(Keys.RETURN);
		Thread.sleep(3000);
		
	}
	// alternate of click
	@Test(enabled = false)
	public void alternate_of_click_method_in_logingButtonTest03() throws InterruptedException {
		WebElement loginBut = driver.findElement(By.id("pf-dropdown-signin"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", loginBut);
		Thread.sleep(4000);

	}
	
	@Test(enabled = false)
	public void homepageLoginButtonTest01() {
		WebElement homepageLoginButton = driver.findElement(By.xpath("//strong[text()='Account']"));
		actions.moveToElement(homepageLoginButton).perform();
	}
	@Test(enabled = false)
	public void homepageLoginButtonTest02() {
		WebElement homepageLoginButton = driver.findElement(By.xpath("//strong[text()='Account']"));
		actions.moveToElement(homepageLoginButton).click().perform();
	}
			
	@Test(enabled = false) 
	public void homepageAccountfunctionality() throws InterruptedException {
		WebElement homepageAccountfunctionality = driver.findElement(By.id("ntt-placeholder"));
		actions.clickAndHold(homepageAccountfunctionality).release().perform();
		Thread.sleep(4000);

	}

	@Test(enabled = false) 
	public void homepageLogingButtonTest05() throws InterruptedException {
		WebElement homepageAccountButton = driver.findElement(By.id("ntt-placeholder"));
		Thread.sleep(4000);
		WebElement homepageLoginButton = driver.findElement(By.id("ntt-placeholder"));
		actions.sendKeys(homepageLoginButton, Keys.RETURN).perform();
		Thread.sleep(4000);
	}
	
	//Home Work Six
	//****************************************************************************************

	@Test(enabled = false)
	public void loggerPositiveTest() throws InterruptedException {
		homepage.signInAccountWithWrongCredentials();
	}
	
	@Test(enabled = true)
	public void loggerNegetiveTest() throws InterruptedException {
		homepage.signInAccountWithWrongCredentials();
	}


	@Test(enabled = false)
	public void Use_of_sendKeys_method_then_click_in_submit() throws InterruptedException {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("ntt-placeholder")).sendKeys("Cosmetics");
		Thread.sleep(5000);
		driver.findElement(By.id("ntt-placeholder")).click();
		Thread.sleep(5000);

	}

	@Test(enabled = false) 
	public void sendKeys_by_javascriptExecutor() throws InterruptedException {
		Thread.sleep(5000);
		driver.get("https://www.ebay.com/");		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@id='gh-ac']"));
		Thread.sleep(5000);
		WebElement searchField = driver.findElement(By.xpath("//input[@id='gh-ac']"));
		WebElement searchButton = driver.findElement(By.id("gh-btn"));
		js.executeScript("arguments[0].value='Medicine'",searchField);
		Thread.sleep(5000);
		js.executeScript("arguments[0].click()",searchButton);
		Thread.sleep(5000);
	}
	
	@Test(enabled = false)
	public void Use_of_sendKeys_method_in_searchEngine_by_javascriptExecutor() throws InterruptedException {
		WebElement searchEngine = driver.findElement(By.id("ntt-placeholder"));
		js.executeScript("arguments[0].value='toys'", searchEngine);
		Thread.sleep(5000);
		driver.findElement(By.id("ntt-placeholder")).clear();
		Thread.sleep(5000);
		WebElement searchfield = driver.findElement(By.id("ntt-placeholder"));
		js.executeScript("arguments[0].value='toys'", searchfield);
		Thread.sleep(5000);
		
	}
	@Test(enabled = false) // it will fail
	public void how_to_handle_hidden_element_by_regular_selenium_method() throws InterruptedException {
		Thread.sleep(5000);
		driver.get("https://courses.letskodeit.com/practice");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("hide-textbox")).click();
		driver.findElement(By.xpath("//input[@id='displayed-text']")).sendKeys("Enthrall IT");
	}
	@Test(enabled = false) // 
	public void how_to_handle_hidden_element_by_javascriptExecutor() throws InterruptedException {
		Thread.sleep(5000);
		driver.get("https://courses.letskodeit.com/practice");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("hide-textbox")).click();
		
		WebElement field = driver.findElement(By.xpath("//input[@id='displayed-text']"));
		js.executeScript("arguments[0]. value='Mahamoda'",field);
		
	}
	
	@Test(enabled = false)//
	public void scrollIntoViewElement() throws InterruptedException {
		Thread.sleep(5000);	
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(5000);
		WebElement Home = driver.findElement(By.xpath("//span[text()='Home']"));
		js.executeScript("arguments[0].scrollIntoViewElement;", Home);
		Thread.sleep(5000);
	}
	@Test(enabled = false)
	public void Use_of_scroll_down_and_scroll_up_by_javascriptExecutor() throws InterruptedException {
		Thread.sleep(5000);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0, 1000)","");
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0, -500)", "");
		Thread.sleep(5000);
	}
	

	@Test(enabled = false) 
	public void use_of_explicitly_wait_in_walgreens() throws InterruptedException {
		Thread.sleep(5000);
		driver.get("https://www.walgreens.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ntt-placeholder"))).click();
		driver.findElement(By.id("ntt-placeholder")).sendKeys("Pharmacy", Keys.RETURN);

	}

	@Test(enabled = false) 
	public void use_of_explicitly_wait() throws InterruptedException {
		driver.get("https://www.walgreens.com/");
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ntt-placeholder"))).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("(//li[@class='menu-item menu-item__level-0 menu-item--expanded'][1]")).sendKeys("rosa maria", Keys.RETURN);

	}

	@Test(enabled = false) 
	public void use_of_explicitly_wait_in_walgreens2() throws InterruptedException {
		Thread.sleep(5000);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ntt-placeholder"))).click();
		driver.findElement(By.id("ntt-placeholder")).sendKeys("Baby Formula", Keys.RETURN);

	}

	@Test(enabled = false) 
	public void use_of_explicitly_wait_in_walgreens3() throws InterruptedException {
		Thread.sleep(5000);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ntt-placeholder"))).click();
		driver.findElement(By.id("ntt-placeholder")).sendKeys("Beauty", Keys.RETURN);

	}

	@Test(enabled = false)
	public void use_of_explicitly_wait_in_walgreens4() throws InterruptedException {
		Thread.sleep(5000);
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ntt-placeholder"))).click();
		driver.findElement(By.id("ntt-placeholder")).sendKeys("Medicine", Keys.RETURN);

	}

	@Test(enabled = false) 
	public void use_of_explicitly_wait_in_walgreens5() throws InterruptedException {
		Thread.sleep(5000);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ntt-placeholder"))).click();
		driver.findElement(By.id("ntt-placeholder")).sendKeys("Cosmetic", Keys.RETURN);

	}
	//HomeWork (7)***********************************************************************
	
	
	@Test (enabled = false, groups = {"functionalTest"})
	  public void skipHomePageTitleTest() {
		String title = "https://www.walgreens.com/";
		if(title.equals(driver.getTitle())) {
			throw new SkipException("Skipping--as the title matches as expected");
		}else {
			System.out.println("Home page Title doesn't match...");
		}
		System.out.println("I am out of else condition");
		}
	

	@Test(enabled = false)
	public void switchBetweenWindow01()throws InterruptedException{
		Thread.sleep(3000);
		driver.get("https://enthrallit.com");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String parentWindow = driver.getWindowHandle();
		System.out.println("parent window id: " + parentWindow );
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		Thread.sleep(3000);
		Set<String>allWindowHandles= driver.getWindowHandles();
		System.out.println("Total Windos opened:" + allWindowHandles.size());
		String parent = (String) allWindowHandles.toArray()[0];
		String child1 = (String) allWindowHandles.toArray()[1];
		System.out.println("Parent Window ID:"+parent);
		System.out.println("Child Window ID:" + child1);
		driver.switchTo().window(child1);
		
	}
	
}

