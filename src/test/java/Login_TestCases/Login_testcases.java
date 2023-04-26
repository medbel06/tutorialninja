package Login_TestCases;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.maven.torialsninja.pageobject.LandingPage;
import com.maven.torialsninja.pageobject.LoginPage;


public class Login_testcases extends Baseclass {

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
	@Test(priority = 7)
	public void Testcase07_Tabbutton_enterbutton() throws InterruptedException {
		
		
		driver.get(url);
		
		LandingPage landingPage=new LandingPage(driver);
		landingPage.clickdropdowm();

		driver.findElement(By.cssSelector(".caret"));
		
		
		landingPage.loginbutton();
		// driver.findElement(By.xpath("//ul[@class='list-inline']/descendant::li[4]")).click();
		 
			
		 
		 
			
			LoginPage lg =new LoginPage(driver);
		//	driver.findElement(By.cssSelector(".fa.fa-phone"));
			
	lg.setusername(username);
		lg.sendTabkeybordkey();
			lg.setpassword(password);
			lg.sendEnterkeybordkey();
			
			

		//	lg.setpassword(password);

		//	lg.sendEnterkeybordkey();
			
//			if(driver.getTitle().equals("My Account")) {
//				
//				Assert.assertTrue(true);
//				
//			}else {
//				
//				Assert.assertTrue(false);
//			}
//			
	
}
	
	
	
	
	
	@Test(priority = 8)
	public void Testcase08_place_holder_text() throws InterruptedException {
		
		
		driver.get(url);
		
		LandingPage landingPage=new LandingPage(driver);
		landingPage.clickdropdowm();

		driver.findElement(By.cssSelector(".caret"));
		
		
		landingPage.loginbutton();
		// driver.findElement(By.xpath("//ul[@class='list-inline']/descendant::li[4]")).click();
		 
			
		 
		 
			
			LoginPage lg =new LoginPage(driver);
			String expectedemailplaceholder="E-Mail Address";
			String emailplaceholder=driver.findElement(By.xpath("//input[@placeholder='E-Mail Address']")).getAttribute("placeholder");
			
			String expectedpasswordplaceholder="Password";
			String passwordplaceholder=driver.findElement(By.xpath("//input[@placeholder='Password']")).getAttribute("placeholder");
			
			if(expectedemailplaceholder.equals(emailplaceholder) && expectedpasswordplaceholder.equals(passwordplaceholder)) {
				
				Assert.assertTrue(true);
				
			}else {
				
				Assert.assertTrue(false);
			}
			
	
}
	
	@Test(priority = 9)
	public void Testcase09_logoutbackbutton() throws InterruptedException {
		
		

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
			
			
			driver.navigate().back();
			
			if(driver.getTitle().equals("My Account")) {
				
				Assert.assertTrue(true);
				
			}else {
				
				Assert.assertTrue(false);
			}
			

	
	
}
	
	
	@Test(priority = 10)
	public void Testcase10_logoutdropdownbackbutton() throws InterruptedException {
		
		

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
			
			
			landingPage.clickdropdowm();
			driver.findElement(By.partialLinkText("Logout")).click();
		

			
			
			driver.navigate().back();
			
			if(!driver.getTitle().equals("My Account")) {
				
				Assert.assertTrue(true);
				
			}else {
				
				Assert.assertTrue(false);
			}
			

	
	
}
	
	
	
	
//	@Test(priority = 11,invocationCount=5 )
//	public void Testcase11_Repeatlogin5times() throws InterruptedException {
//		
//	
//
//		driver.get(url);
//		
//		LandingPage landingPage=new LandingPage(driver);
//		landingPage.clickdropdowm();
//
//		//driver.findElement(By.cssSelector(".caret")).click();
//		landingPage.loginbutton();
//		// driver.findElement(By.xpath("//ul[@class='list-inline']/descendant::li[4]")).click();
//		 
//			
//		 
//		 
//			
//			LoginPage lg =new LoginPage(driver);
//			lg.setusername(invalidusername);
//
//			lg.setpassword(password);
//
//			lg.clickbuton();
//			
//			String expectedmessage="Your account has exceeded allowed number of login attempts. Please try again in 1 hour.";
//			String message=driver.findElement(By.xpath("/html/body/div[2]/div[1]")).getText();
//			
//			System.out.println(c);
//			
//			if(message.equals(expectedmessage) ) {
//				
//				Assert.assertTrue(true);
//				
//			}else {
//				
//				Assert.assertTrue(false);
//			}			
//			
//			

	//
	//
	//
	//
//}
	
	
	
	@Test(priority = 12)
	public void Testcase12_passwordhiding() throws InterruptedException {
		
		

		driver.get(url);
		
		LandingPage landingPage=new LandingPage(driver);
		landingPage.clickdropdowm();

		//driver.findElement(By.cssSelector(".caret")).click();
		landingPage.loginbutton();
		// driver.findElement(By.xpath("//ul[@class='list-inline']/descendant::li[4]")).click();
		 
			
		 
		 
			
			LoginPage lg =new LoginPage(driver);
			lg.setusername(username);

			lg.setpassword(password);
			
			WebElement passwroood=driver.findElement(By.id("input-password"));

			if (passwroood.getAttribute("type") == "password"){
				System.out.println("okk");
			}
			
			
			
		

	
	
}
	
	
}