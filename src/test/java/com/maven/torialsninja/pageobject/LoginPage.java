package com.maven.torialsninja.pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	
	WebDriver ldriver;
	 
	 
	 public  LoginPage(WebDriver rdriver){
		 
		 ldriver=rdriver;
		 PageFactory.initElements(rdriver,this);
	 }
	 
	 @FindBy(id ="input-email")
	 WebElement textemail;
	 
	 @FindBy(id ="input-password")
	 WebElement textpassword;
	 
	 @FindBy(xpath ="//div[contains(@class, 'well')]/descendant::input[3]")
	 WebElement butnLogin;
	 
	 
	 @FindBy(linkText ="Forgotten Password")
	 WebElement forgotenpassword;
	 
	 
	 public void setusername(String uasername) {
		 textemail.sendKeys(uasername);
		 		 
	 }

	 public void setpassword(String pass) {
		 textpassword.sendKeys(pass);
		 
	 }
	 public void clickbuton() {
		 butnLogin.click();
		 
	 }
	 
	 public boolean forgottenbutondisspaly() {
		 boolean displaystatus=forgotenpassword.isDisplayed();
		 return displaystatus;
	 }
	 
	 
	 public void clickforgottenbuton() {
		 forgotenpassword.click();
		 
	 }


	 public void sendTabkeybordkey() {
		 textemail.sendKeys(Keys.TAB);
		 
	 }
	 
	 public void sendEnterkeybordkey() {
		 textemail.sendKeys(Keys.ENTER);
		 
	 }
	 

}
