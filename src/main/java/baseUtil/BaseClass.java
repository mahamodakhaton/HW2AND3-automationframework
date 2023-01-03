package baseUtil;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.Homepage;

public class BaseClass {

	public WebDriver driver;
	public Homepage homepage;

	@BeforeMethod
	public void setUp() {
		//System.setProperty("webdriver.chrome.driver",
				//"C:\\Users\\maham\\eclipse-workspace\\com.walgreens\\driver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.walgreens.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		homepage = new Homepage(driver);
	}
	
	@AfterMethod
	public void tearUp () {
		driver.quit();
	}

}


