package com.applicationpages;

import org.openqa.selenium.support.PageFactory;

import com.applicationor.HomepageOR;
import com.commonutils.CommonUtlities;

public class HomePage_StepDefinitions extends CommonUtlities {
	
	
	public void navigateToJobSeeker()
	{
		HomepageOR homepageor=PageFactory.initElements(driver, HomepageOR.class);
		hover("Register", "Home Page", homepageor.lnk_Register);
		
		hoverAndClick("Register", "Home Page", homepageor.lnk_JobSeeker);
		
		
	}

}
