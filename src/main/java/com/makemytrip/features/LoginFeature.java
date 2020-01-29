package com.makemytrip.features;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

import com.makemytrip.pages.*;

public class LoginFeature {
WebDriver driver;
MainPage m;
LoginPopupPage lp;
LoginnewwindowPage lpwind;
	public void login(String regnumber)
	{
		m.getLoginbutton().click();
		lp.getgoogleloginbutton().click();
		Set<String> sessionids = driver.getWindowHandles();
		System.out.println(sessionids.getClass().getSimpleName());
		Iterator it=sessionids.iterator();
		String pid=it.next().toString();
		System.out.println("parentid="+pid);
		String cid=it.next().toString();
		System.out.println("childid="+cid);
		driver.switchTo().window(cid);
		lpwind.getUseanotheraccountbutton().click();
		lpwind.getLoginbox().sendKeys("shubhamdewan230495@gmail.com");
		lpwind.getNextbutton().click();
		lpwind.getPasswordbox().sendKeys("Radhaswamig@230495");
		
		
		
	}
	public LoginFeature(WebDriver driver) {
		this.driver=driver;
		m=new MainPage(driver);
		lp=new LoginPopupPage(driver);
	}
}
