package com.dryrun;

import com.applicationpages.HomePage_StepDefinitions;
import com.applicationpages.JobSeeker_StepDefinitions;
import com.commonutils.CommonUtlities;

public class Tc_01_TestFormRegistration extends CommonUtlities{
	
	public static void main(String[] args) {
		
		
		launchApplication("chrome", "https://www.talentzing.com");
		
		HomePage_StepDefinitions hompage=new HomePage_StepDefinitions();
		
		hompage.navigateToJobSeeker();
		
		JobSeeker_StepDefinitions jobseeker=new JobSeeker_StepDefinitions();
		jobseeker.validate_AllMandatoryFields_PersonalInformation();
		
	}

}
