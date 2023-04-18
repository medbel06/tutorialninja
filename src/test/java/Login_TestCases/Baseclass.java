package Login_TestCases;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import com.maven.torialsninja.utilites.Readconfig;

public class Baseclass {

	Readconfig rc=new Readconfig();

	
	public String url=rc.getApplicationURL();
	public String username=rc.getApplicationEmail();
	public String password=rc.getApplicationPassword();
	public String invalidusername=rc.getApplicationinvalidEmail();
	public String invalidpassword=rc.getApplicationinvalidPassword();
	public WebDriver driver;
	SoftAssert softAssert = new SoftAssert();
	public static ChromeOptions options;

	

	@BeforeMethod
	public void setup() {
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");

		options = new ChromeOptions();

		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		

		 
		 
		 


		
	}
	
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}

	
}
