package old_projectTestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.maven.torialsninja.pageobject.LandingPage;
import com.maven.torialsninja.pageobject.LoginPage;


public class Testcase06_ForgottenButton extends Baseclass {

	@Test
	public void logittest() throws InterruptedException {
		
		
		driver.get(url);
		LandingPage landingPage=new LandingPage(driver);
		landingPage.clickdropdowm();

		//driver.findElement(By.cssSelector(".caret")).click();
		landingPage.loginbutton();
		// driver.findElement(By.xpath("//ul[@class='list-inline']/descendant::li[4]")).click();
		 
		 
			
			LoginPage lg =new LoginPage(driver);
			
			
			
			

			
			
			
			
			if(lg.forgottenbutondisspaly()) {
				
				Assert.assertTrue(true);
				
			}else {
				
				Assert.assertTrue(false);
			}
			
			
			lg.clickforgottenbuton();
			
			String actualwarninmessage=driver.findElement(By.xpath("//h1[contains(text(),'Forgot Your Password?')]")).getText();
			String expectedwarninmessage="Forgot Your Password?";
			
			
			if(actualwarninmessage.equals(expectedwarninmessage)) {
				
				Assert.assertTrue(true);
				
			}else {
				
				Assert.assertTrue(false);
			}
			
			
			
	
}
}