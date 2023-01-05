package xpath;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class XpathClass {
	//creating unique id
			@FindBy(id = "sitewide-account-button-greeting")
			WebElement sitWebElement;
			@FindBy (className = "logo_at sitewide-mo9nlj")
			WebElement logElement;
			@FindBy(className  = "sitewide-epnfun")
			WebElement sitewidElement;

			// creating xpath by id
			@FindBy (xpath = "//input[@id='globalsearchInputField']")
			WebElement searchEngine;
			@FindBy(xpath = "//input[@id = 'twotabsearchtextbox']")
			WebElement twotabsearchtextbox;
			@FindBy(xpath = "//input[@id='edit-keys']")
			WebElement searcheditkeys;
			
					   



			// creat xpath by name
			@FindBy(xpath = "//input[@name='keys'])[1]")
			WebElement searchName;

			// creating xpath by class

			@FindBy(xpath = "//input[@class='form-search'])[1]")
			WebElement fromsearch;
			
				
			@FindBy(xpath = "//i[@class='icon'])[1]")
			WebElement searchicon;
			@FindBy(xpath = "//img[@class='no-b-lazy'])[1]")
			WebElement logodisplayed;
			@FindBy(xpath  = "(//a[@class='menu-item-link'])[2]")
			WebElement clickemployer;
			
			

			// creating xpath by text
			@FindBy(xpath = "//a[text()='Track an order']")
			WebElement trackanorder;

			@FindBy(xpath = "(//a[text()='Contact Us'])[1]")
			WebElement fromcontactus;

			@FindBy(xpath = "(//a[text()='Member Services'])[1]")
			WebElement clickmemberservice;

			@FindBy(xpath = "(//span[text()='Contact Us'])[1]")
				WebElement clickcontactus;
			
			@FindBy(xpath =  "//div[@text()='Sign In']")
			WebElement clicksignin;

			
			
			// creating xpath by using and logic

			@FindBy(xpath = "//input[@id ='gh-search-input and @gh-search-inputname ]")
			WebElement inputnameandid;
			
			@FindBy(xpath = "//input[@id='edit-keys' and @name='keys']")
			WebElement searchidandName01;
		}


