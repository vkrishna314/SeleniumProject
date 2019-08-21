package com.applicationpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.applicationor.JobSeekerOR;
import com.commonutils.CommonUtlities;


public class JobSeeker_StepDefinitions extends CommonUtlities{
	
	public static void verify_fields()
	{
		JobSeekerOR jobseekeror = PageFactory.initElements(driver, JobSeekerOR.class);
		
	  launchApplication("chrome", "https://www.talentzing.com/Jobseeker/JSRegistration.aspx");	
	  IsElementDisplayed("Current Industry", "JobSeeker Personal Information", jobseekeror.edi_FirstName);
        
	}
	

	
	
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





	////Validation of mandatory text for First Name
	public void ValidateMandatoryField_PersonalInformation(){
		
		JobSeekerOR jobseekeror = PageFactory.initElements(driver, JobSeekerOR.class);
		
		
		//Checking for the null value in FirstName Field
		try{
		if(JobSeekerOR.edi_FirstName.equals(null))
		{
		JobSeekerOR.btn_ContinueStep1.click();
		} else
			
				throw new Exception("Field value is not null");
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	
		
			
		
		String expected_msg= "* Please specify firstname";
	    String actual_msg = getTextForWebElement("First Name", "JobSeeker Personal Informaton", JobSeekerOR.txt_FirstNameMandatorytext	);
	    		try{
	    if(expected_msg.equals(actual_msg))
	     {
		
               System.out.println("Correct validations of first name");
		
	     } else
			
				throw  new Exception("Validation text is not displayed");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    
	    //Colour validation of Mandatory text fields
	    try{
	   if( isElementColorRed( JobSeekerOR.txt_FirstNameMandatorytext))
	   {
	    
	    System.out.println("The colour is matched ");
	    

        } else
		
			throw new Exception("Colour Mismatch");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

	
