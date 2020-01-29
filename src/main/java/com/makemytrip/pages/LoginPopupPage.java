package com.makemytrip.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

public class LoginPopupPage 
{
	
	public WebElement getUsername() {
		return username;
	}
	public WebElement getgoogleloginbutton() {
		return googlelogin;
	}
	@FindBy(id="username")
	private WebElement username;
	//
	@FindBy(xpath="//div[contains(@class,'googleLoginBtn')]")
	private WebElement googlelogin;
	
	
	public LoginPopupPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
