package old_projectTestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.maven.torialsninja.pageobject.LandingPage;
import com.maven.torialsninja.pageobject.LoginPage;


public class LoginTest extends Baseclass {

	@Test (priority = 1)
	public void Testcase01_ValidEmail_And_VALIDPassword() throws InterruptedException {
		
		
		driver.get(url);
		
		LandingPage landingPage=new LandingPage(driver);
		landingPage.clickdropdowm();

		//driver.findElement(By.cssSelector(".caret")).click();
		landingPage.loginbutton();
		// driver.findElement(By.xpath("//ul[@class='list-inline']/descendant::li[4]")).click();
		 
			
		 
		 
			
			LoginPage lg =new LoginPage(driver);
			lg.setusername(username);

			lg.setpassword(password);

			lg.clickbuton();
			
			if(driver.getTitle().equals("My Account")) {
				
				Assert.assertTrue(true);
				
			}else {
				
				Assert.assertTrue(false);
			}
			

	
}
	
	
	@Test (priority = 2)
	public void Testcase02_InValidEmail_And_validPassword() throws InterruptedException {
		
		
		driver.get(url);
		LandingPage landingPage=new LandingPage(driver);
		landingPage.clickdropdowm();

		//driver.findElement(By.cssSelector(".caret")).click();
		landingPage.loginbutton();
		// driver.findElement(By.xpath("//ul[@class='list-inline']/descendant::li[4]")).click();
		 
		 
			
			LoginPage lg =new LoginPage(driver);
			
			
			lg.setusername(invalidusername);

			lg.setpassword(password);

			
			lg.clickbuton();
			String actualwarninmessage=driver.findElement(By.cssSelector(".alert.alert-danger.alert-dismissible")).getText();
			String expectedwarninmessage="Warning: No match for E-Mail Address and/or Password.";
			
			
			if(actualwarninmessage.equals(expectedwarninmessage)) {
				
				Assert.assertTrue(true);
				
			}else {
				
				Assert.assertTrue(false);
			}
			
			
			
	
}
	
	@Test (priority = 3)
	public void Testcase03_ValidEmail_And_INvalidPassword() throws InterruptedException {
		
		
		driver.get(url);
		LandingPage landingPage=new LandingPage(driver);
		landingPage.clickdropdowm();

		//driver.findElement(By.cssSelector(".caret")).click();
		landingPage.loginbutton();
		// driver.findElement(By.xpath("//ul[@class='list-inline']/descendant::li[4]")).click();
			
		 
		 
			
			LoginPage lg =new LoginPage(driver);
			
			
			lg.setusername(username);

			lg.setpassword(invalidpassword);

			
			lg.clickbuton();
			String actualwarninmessage=driver.findElement(By.cssSelector(".alert.alert-danger.alert-dismissible")).getText();
			String expectedwarninmessage="Warning: No match for E-Mail Address and/or Password.";
			
			
			if(actualwarninmessage.equals(expectedwarninmessage)) {
				
				Assert.assertTrue(true);
				
			}else {
				
				Assert.assertTrue(false);
			}
			
			
			
	
}
	
	@Test (priority = 4)
	public void Testcase04_InValidEmail_And_INvalidPassword2() throws InterruptedException {
		
		
		driver.get(url);
		LandingPage landingPage=new LandingPage(driver);
		landingPage.clickdropdowm();

		//driver.findElement(By.cssSelector(".caret")).click();
		landingPage.loginbutton();
		// driver.findElement(By.xpath("//ul[@class='list-inline']/descendant::li[4]")).click();
		 
		 
			
			LoginPage lg =new LoginPage(driver);
			
			
			lg.setusername(invalidusername);

			lg.setpassword(invalidpassword);

			
			lg.clickbuton();
			String actualwarninmessage=driver.findElement(By.cssSelector(".alert.alert-danger.alert-dismissible")).getText();
			String expectedwarninmessage="Warning: No match for E-Mail Address and/or Password.";
			
			
			if(actualwarninmessage.equals(expectedwarninmessage)) {
				
				Assert.assertTrue(true);
				
			}else {
				
				Assert.assertTrue(false);
			}
			
			
			
	
}
	
	
	
	@Test (priority = 5)
	public void Testcase05_NoEmail_And_NOPassword() throws InterruptedException {
		
		
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
	
	
	@Test (priority = 6)
	public void Testcase06_ForgottenButton() throws InterruptedException {
		
		
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