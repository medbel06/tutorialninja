package old_projectTestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.maven.torialsninja.pageobject.LandingPage;
import com.maven.torialsninja.pageobject.LoginPage;


public class Testcase05_NoEmail_And_NOPassword extends Baseclass {

	@Test
	public void logittest() throws InterruptedException {
		
		
		driver.get(url);
		LandingPage landingPage=new LandingPage(driver);
		landingPage.clickdropdowm();

		//driver.findElement(By.cssSelector(".caret")).click();
		landingPage.loginbutton();
		// driver.findElement(By.xpath("//ul[@class='list-inline']/descendant::li[4]")).click();
		 
		 
			
			LoginPage lg =new LoginPage(driver);
			
			
			

			
			lg.clickbuton();
			String actualwarninmessage=driver.findElement(By.cssSelector(".alert.alert-danger.alert-dismissible")).getText();
			String expectedwarninmessage="Warning: No match for E-Mail Address and/or Password.";
			
			
			if(actualwarninmessage.equals(expectedwarninmessage)) {
				
				Assert.assertTrue(true);
				
			}else {
				
				Assert.assertTrue(false);
			}
			
			
			
	
}
}