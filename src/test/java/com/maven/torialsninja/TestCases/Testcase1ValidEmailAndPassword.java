package com.maven.torialsninja.TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.maven.torialsninja.pageobject.LoginPage;


public class Testcase1ValidEmailAndPassword extends Baseclass {

	@Test
	public void logittest() throws InterruptedException {
		
		
		driver.get(url);
		driver.findElement(By.cssSelector(".caret")).click();

		 driver.findElement(By.xpath("//ul[@class='list-inline']/descendant::li[4]")).click();
		 
			
		 
		 
			
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
	
	
}