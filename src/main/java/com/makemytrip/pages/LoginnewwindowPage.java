package com.makemytrip.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginnewwindowPage 
{

	@FindBy(xpath="//div[text()='Use another account']")
	private WebElement useanotheraccountbutton;

	@FindBy(id="identifierId")
	private WebElement loginbox;
	
	@FindBy(xpath="//span[text()='Next']")
	private WebElement nextbutton;
	
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement passwordbox;
	
	public LoginnewwindowPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getUseanotheraccountbutton() {
		return useanotheraccountbutton;
	}

	public WebElement getLoginbox() {
		return loginbox;
	}

	public WebElement getNextbutton() {
		return nextbutton;
	}

	public WebElement getPasswordbox() {
		return passwordbox;
	}
	
}
