package baseUtil;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Homepage;
import utils.Configuration;

public class BaseClass {

	public WebDriver driver;
	public Homepage homepage;
	Configuration configuration;

	@BeforeMethod
	public void setUp() {

		// system is a class and setProperty is a method //ist way to show the locator
		// of chrom driver //This is absolute path
		//
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\maham\\eclipse-workspace\\com.walgreens\\driver\\chromedriver.exe");
		// 3rd and final way to show the location of chrom driver
		// This is dynamic way relative path
		// driver = new ChromeDriver();

		// Above we showed till today with chrome browser
		// If you wanna use gecko driver, you must have firefox browser in your system
		// System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		// You have to change the driver name if you change the driver above
		// driver = new FirefoxDriver();

		// If you wanna use edge driver, you must have microsoft edge browser in your
		// system
		// System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
		// You have to change the driver name if you change the driver above
		// driver = new EdgeDriver();

		// When none of browser working, then you can use webdrivermanager
		// webdriver manager doesn't need any physical driver
		// From below line, the most updated version is used, when no version is
		// mentioned
		// WebDriverManager.chromedriver().setup();
		// driver = new ChromeDriver();

		// 108.0.5359.71 -- current version, it always changed, so use it
		// 108.0.5359.22 -- older version
		// 107.0.5304.62 -- older version from above
		// older version sometimes used for stability of browser, sometime for the
		// request of Authority
		// if you choose version, then it will use that specific version
		// if you don't use driverVersion() method, it will open the most updated
		// version
		// WebDriverManager.chromedriver().driverVersion("107.0.5304.62").setup();
		// driver = new ChromeDriver();

		// WebDriverManager is used for most updated firefoxdriver()
		// WebDriverManager.firefoxdriver().setup();
		// driver = new FirefoxDriver();

		// WebDriverManager is used for most updated edgedriver()
		// WebDriverManager.edgedriver().setup();
		// driver = new EdgeDriver();

		// In the industry: Chrome driver is used 90% time
		// and the best practice to show location: ./driver/chromedriver.exe
		// System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		// driver = new ChromeDriver();

		// System.setProperty("webdriver.msedge.driver", "./driver/msedgedriver.exe");
		// System.setProperty("webdriver.firefox.bin", "C:/Program Files/Mozilla
		// Firefox/firefox.exe");
		// driver = new ChromeDriver();
		// driver = new EdgeDriver();

		// **************************************//

		WebDriverManager.chromedriver().driverVersion("108.0539.22").setup();
		driver = new ChromeDriver();
		// WebDriverManager.firefoxdriver().setup();
		// driver = new FirefoxDriver();
		// WebDriverManager.edgedriver().setup();
		// driver = new EdgeDriver();
		// *******************************//

		 //WebDriverManager.chromedriver().setup();
		 //driver = new ChromeDriver();

		 //System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		 //driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.walgreens.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		homepage = new Homepage(driver);
	}

	@AfterMethod
	public void tearUp() {
		driver.quit();
	}

}
