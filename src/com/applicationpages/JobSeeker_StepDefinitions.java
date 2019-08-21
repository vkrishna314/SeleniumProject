package com.applicationpages;

import org.openqa.selenium.support.PageFactory;

import com.applicationor.JobSeekerOR;
import com.commonutils.CommonUtlities;

public class JobSeeker_StepDefinitions extends CommonUtlities{
	
	
	public void fillForm_PersononalInformation()
	{
		JobSeekerOR jobseekeror=PageFactory.initElements(driver, JobSeekerOR.class);
		
		sendDataByClearing("First Name", "Job Seeker_Personal Information", jobseekeror.edi_FirstName, "Vamshi");
		sendDataByClearing("Last Name", "Job Seeker_Personal Information", jobseekeror.edi_LastName, "Krishna");
		sendDataByClearing("Email", "Job Seeker_Personal Information", jobseekeror.edi_Email, "vamshi.thodeti@gmai.com");
		sendDataByClearing("Contact Number", "Job Seeker_Personal Information", jobseekeror.edi_ContactNumber, "7799327686");
		sendDataByClearing("Landline Number", "Job Seeker_Personal Information", jobseekeror.edi_LandLineNumber, "11111");
		sendDataByClearing("Password", "Job Seeker_Personal Information", jobseekeror.edi_password, "xxx");
		sendDataByClearing("Confirm Password", "Job Seeker_Personal Information", jobseekeror.edi_confirmpassword, "xxx");
		sendDataByClearing("Date Of Birth", "Job Seeker_Personal Information", jobseekeror.edi_dob, "23-09-2000");
		hoverAndClick("Gender", "Job Seeker_Personal Information",jobseekeror.rdo_GenderMale);
		hoverAndClick("Are You in Notice", "Job Seeker_Personal Information",jobseekeror.rdo_No);
		sendDataByClearing("Languages Known", "Job Seeker_Personal Information", jobseekeror.edi_LanguagesKnown, "Telugu, Hindi, English");
	
	
	}

}
