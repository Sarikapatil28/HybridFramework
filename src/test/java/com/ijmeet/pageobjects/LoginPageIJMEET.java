package com.ijmeet.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageIJMEET {
	WebDriver driver;
	
	public LoginPageIJMEET(WebDriver driver)
	{
	
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	 
	
	 

	@FindBy(linkText ="Sign In")
	@CacheLookup
	WebElement link_text_Signin;
	
	
	@FindBy(id="email")
	@CacheLookup
	WebElement email_txt_box;
	
	@FindBy(id="password")
	@CacheLookup
	WebElement password_txt_box;
	
	@FindBy(xpath="//button[@type='submit']")
	@CacheLookup
	WebElement signin_btn;
	
	
	
	public void click_on_signin()
	{
		link_text_Signin.click();
		
	}
	public void enter_email(String U_email)
	{
		email_txt_box.sendKeys(U_email);
	}
	public void set_password(String pwd)
	
	{
		password_txt_box.sendKeys(pwd);
	}
	public void sign_inbtn()
	{
		signin_btn.click();
	}
	
}
	
