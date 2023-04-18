package old_projectTestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.maven.torialsninja.pageobject.LandingPage;
import com.maven.torialsninja.pageobject.LoginPage;


public class Testcase07_Tab_and_Enter_Keybord extends Baseclass {

	@Test
	public void logittest() throws InterruptedException {
		
		
		driver.get(url);
		
		LandingPage landingPage=new LandingPage(driver);
		landingPage.clickdropdowm();

		driver.findElement(By.cssSelector(".caret"));
		
		
		landingPage.loginbutton();
		// driver.findElement(By.xpath("//ul[@class='list-inline']/descendant::li[4]")).click();
		 
			
		 
		 
			
			LoginPage lg =new LoginPage(driver);
			lg.setusername(username);
			while(true) {			
				lg.sendTabkeybordkey();
				
}

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
	
	
}