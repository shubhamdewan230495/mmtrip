package com.makemytrip.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

public class MainPage {

	@FindBy(xpath="//p[text()=' Login or Create Account']")
	private WebElement loginbutton;
	
	
	
	public WebElement getLoginbutton() {
		return loginbutton;
	}



	public MainPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
}
