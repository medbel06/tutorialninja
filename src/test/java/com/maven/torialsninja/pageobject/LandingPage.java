package com.maven.torialsninja.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

	public WebDriver driver;
	
	@FindBy(xpath="//span[@class='caret']")
	private WebElement dropdown;
	
	@FindBy(xpath="//ul[@class='list-inline']/descendant::li[4]")
	private WebElement loginbutton;
	
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	//action
	
	public void clickdropdowm() {
		
		dropdown.click();
		
	}
	
public void loginbutton() {
		
	loginbutton.click();
		
	}
	
}
