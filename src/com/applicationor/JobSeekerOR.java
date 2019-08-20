package com.applicationor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JobSeekerOR {
	
	//************************************************* Job Seeker Page WebElement **************************************
		//=========================================================Step2============================================================================================

	
	
	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder2_ddlIndustry']")
	public static WebElement drp_CurrentIndustry;
	
	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder2_ddlrole']")
	public static WebElement drp_Role;
	
	@FindBy(xpath="//input[@name='ctl00$ContentPlaceHolder2$txtCurrentDesignation']")
	public static WebElement edi_CurrentDesignation;
	
	@FindBy(xpath="//select[@name='ctl00$ContentPlaceHolder2$ddlExp']")
	public static WebElement drp_TotalExperience_Years;
	

}
