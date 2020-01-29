package com.makemytrip.scripts;
import com.makemytrip.features.*;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.makemytrip.features.LoginFeature;
import com.makemytrip.generic.*;

public class LoginTest extends BaseLib
{

	@Test
	public void login()
	{
		LoginFeature lf=new LoginFeature(driver);
		lf.login("shubhamdewan230495@gmail.com");
	}
}
