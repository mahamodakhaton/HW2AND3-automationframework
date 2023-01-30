package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v105.input.Input;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static common.CommonActions.*;

import java.net.PasswordAuthentication;

public class Homepage {

	WebDriver driver;

	public Homepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	

	@FindBy(id = "ntt-placeholder")
	WebElement searchbox;

	public void sendkeysinsearcchelement() throws InterruptedException {
		searchbox.sendKeys("medicine");
		Thread.sleep(5000);

	}
	

	@FindBy(xpath = "//input[@name='Ntt']")
	WebElement searchnameElement;

	public void clicksearchname() throws InterruptedException {
		searchnameElement.click();
		Thread.sleep(5000);

	}

	@FindBy(xpath = "(//input[@class='blue-shadow'])[1]")
	WebElement searchblueshadoElement;

	public void searchblueshadow() throws InterruptedException {
		searchblueshadoElement.click();
		Thread.sleep(5000);

	}

	@FindBy(xpath = "//strong[contains(text(),'Weekly Ad')]")
	WebElement searchweeklyAd;

	public void searchweeklyAd() throws InterruptedException {
		searchweeklyAd.click();
		Thread.sleep(5000);

	}

	@FindBy(xpath = "//strong[contains(text(),'Accou')]")
	WebElement searcaccountElement;

	public void searchaccountElement() throws InterruptedException {
		searcaccountElement.click();
		Thread.sleep(5000);

	}

	@FindBy(css = "span.icon.icon__cart")
	WebElement searchIconCartElement;

	public void searchIconCart() throws InterruptedException {
		searchIconCartElement.click();
		Thread.sleep(5000);
	}

	@FindBy(css = "span.font__fifty.color__text-blue")
	WebElement searchNewyearElement;

	public void searchNewyearElement() throws InterruptedException {
		searchNewyearElement.click();
		Thread.sleep(5000);

	}

	@FindBy(css = "input#user_name")
	WebElement searchEmailElement;

	public void searchEmailElement() throws InterruptedException {
		searchEmailElement.click();
		Thread.sleep(5000);
	}
	// Display enable
	// button(**********************************************************)

	@FindBy(xpath = "//strong[text()='Account']")
	WebElement Account;

	public void clickAccount() throws InterruptedException {
		Account.click();
		Thread.sleep(3000);
	}

	@FindBy(id = "pf-dropdown-signin")
	WebElement clickSigningeElement;

	public void clickSigningElement() throws InterruptedException {
		clickSigningeElement.click();
		Thread.sleep(5000);

	}

	@FindBy(css = "input#ShowCharacter")
	WebElement displayedshowenablpassword;

	public void displayedenableShowPassword() throws InterruptedException {
		displayedshowenablpassword.isEnabled();
		Thread.sleep(5000);
	}

	// Display Selected in Checkbox
	// (****************************************************)

	@FindBy(xpath = "//strong[text()='Account']") // 1
	WebElement Account1;

	public void clickAccount1() throws InterruptedException {
		Account.click();
		Thread.sleep(3000);

	}
    			
	@FindBy(id = "pf-dropdown-signin")
	WebElement clickSigningeElement1;
	

	public void clickSigningElement1() throws InterruptedException {
		clickSigningeElement.click();
		Thread.sleep(5000);
	}

	@FindBy(name = "showPassword")
	WebElement checkselectbox;
	private WebElement logo;
	

	public void checkselectbox() throws InterruptedException {
		checkselectbox.click();
		Thread.sleep(5000);

	}

	@FindBy(css = "span.icon.icon__wag-corner-flag")	
	public boolean logoDisplayed() {
		boolean Star = logo.isDisplayed();
		System.out.println("The logo is Displayed?Ans:" + Star);
		return Star;

	}
	
	@FindBy(xpath = "//input[@id='user_name']")
	WebElement emailElement;	
	private void inputEmail() throws InterruptedException{
		inputtext(emailElement,"maha@gmail");
		Thread.sleep(3000);
	}
	
	@FindBy(xpath = "//input[@id='user_password']")
	WebElement passWordElement;
	private void inputPassword() throws InterruptedException{
	inputtext(passWordElement, "m1234");
		
	}
				
	@FindBy (id = "submit_btn")
	WebElement signInElement;		
	private void clickSignIn() throws InterruptedException{
	clickelement(signInElement);
		
	}
	
	

	public void signInAccountWithWrongCredentials() throws InterruptedException {
		clickAccount();
		clickSigningElement();
		inputEmail();
		inputPassword();
		clickSignIn();
		
	

	}
	

	

	// test logger is not correct
	@FindBy(css = "//strong[text()='Account wrong']")
	WebElement wrongAccountElement;

	public void loggerNegativemethod() throws InterruptedException {
		inputtext(Account, "//strong[text()='Account']");
		Thread.sleep(5000);
		inputtext(clickSigningeElement, "pf-dropdown-signin");
		clickelement(checkselectbox);
		Thread.sleep(5000);

	}
	@FindBy(xpath = "//strong[text()='Account']")
	WebElement homepageAccountButton;
	public void HomepageAccountClickButton () throws InterruptedException {
		homepageAccountButton.click();
		Thread.sleep(5000);
		
	}

	public void InputTextInAccountandSigningThenClickSelectBox1() {
		WebElement homepageAccountElement;
		
	}

	 

}
