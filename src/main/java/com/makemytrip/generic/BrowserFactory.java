package com.makemytrip.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class BrowserFactory 
{
	 
	public static WebDriver launch(String browsername)
	{
		WebDriver driver=null;
		if(browsername.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver","./exefiles/chromedriver.exe");
		driver=new ChromeDriver();
		}
		else
		{
			Reporter.log("Browser option not available");
		}
		return driver;
	}
}
