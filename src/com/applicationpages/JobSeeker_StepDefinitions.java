package com.applicationpages;

<<<<<<< Updated upstream
=======
import java.util.HashMap;
import java.util.Map;

>>>>>>> Stashed changes
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.applicationor.JobSeekerOR;
import com.commonutils.CommonUtlities;

<<<<<<< Updated upstream

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
		
=======
public class JobSeeker_StepDefinitions extends CommonUtlities {

	public static JobSeekerOR jobseekeror = PageFactory.initElements(driver, JobSeekerOR.class);

	/**
	 * 
	 */
	public void fillForm_PersononalInformation() {
		JobSeekerOR jobseekeror = PageFactory.initElements(driver, JobSeekerOR.class);

>>>>>>> Stashed changes
		sendDataByClearing("First Name", "Job Seeker_Personal Information", jobseekeror.edi_FirstName, "Vamshi");
		sendDataByClearing("Last Name", "Job Seeker_Personal Information", jobseekeror.edi_LastName, "Krishna");
		sendDataByClearing("Email", "Job Seeker_Personal Information", jobseekeror.edi_Email,
				"vamshi.thodeti@gmai.com");
		sendDataByClearing("Contact Number", "Job Seeker_Personal Information", jobseekeror.edi_ContactNumber,
				"7799327686");
		sendDataByClearing("Landline Number", "Job Seeker_Personal Information", jobseekeror.edi_LandLineNumber,
				"11111");
		sendDataByClearing("Password", "Job Seeker_Personal Information", jobseekeror.edi_password, "xxx");
		sendDataByClearing("Confirm Password", "Job Seeker_Personal Information", jobseekeror.edi_confirmpassword,
				"xxx");
		sendDataByClearing("Date Of Birth", "Job Seeker_Personal Information", jobseekeror.edi_dob, "23-09-2000");
		hoverAndClick("Gender", "Job Seeker_Personal Information", jobseekeror.rdo_GenderMale);
		hoverAndClick("Are You in Notice", "Job Seeker_Personal Information", jobseekeror.rdo_No);
		sendDataByClearing("Languages Known", "Job Seeker_Personal Information", jobseekeror.edi_LanguagesKnown,
				"Telugu, Hindi, English");

	}

<<<<<<< Updated upstream




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
=======
	public void fillForm_ProfessionalDetails() {
		JobSeekerOR jobseekeror = PageFactory.initElements(driver, JobSeekerOR.class);

		// Select Current Industry
		selectDropdownByVisibleText("Current Industry", "Job Seeker_Professional Details",
				jobseekeror.drp_CurrentIndustry, "Accounting/Finance");

		// Select Role
		selectDropdownByVisibleText("Role", "Job Seeker_Professional Details", jobseekeror.drp_Role, "Account Manager");

		selectDropdownByVisibleText("Job Type", "Job Seeker_Professional Details", jobseekeror.drp_JobType,
				"Account Manager");

		// Enter Current Designation
		sendDataByClearing("Current Designation", "Job Seeker_Professional Details", jobseekeror.edi_CurrentDesignation,
				"Senior Manager");

		// Select Job Type
		selectDropdownByVisibleText("Job Type", "Job Seeker_Professional Details", jobseekeror.drp_JobType,
				"Account Manager");

		// Select Total Experience in Years
		selectDropdownByVisibleText("Total Experience in Years", "Job Seeker_Professional Details",
				jobseekeror.drp_TotalExperience_Years, "7");

		// Select Total Experience in Months
		selectDropdownByVisibleText("Total Experience in Months", "Job Seeker_Professional Details",
				jobseekeror.drp_TotalExperience_Months, "2");

		// Enter Resume Headline
		sendDataByClearing("Resume Headline", "Job Seeker_Professional Details", jobseekeror.txt_ResumeHeadline,
				"7 Years of Experience in Testing");

		// Enter Current Company
		sendDataByClearing("Current Company", "Job Seeker_Professional Details", jobseekeror.txt_CurrentCompany,
				"Cigniti");

		// Select Total Experience in Months
		selectDropdownByVisibleText("Current Location", "Job Seeker_Professional Details",
				jobseekeror.drp_CurrentLocation, "Hyderabad");

		// Select Total Experience in Months
		selectDropdownByVisibleText("Preferred Location", "Job Seeker_Professional Details",
				jobseekeror.drp_PreferredLocation, "Hyderabad");

	}

	public void fillForm_EducationalDetails() {
		JobSeekerOR jobseekeror = PageFactory.initElements(driver, JobSeekerOR.class);
		selectDropdownByVisibleText("Education", "Job Seeker_Education Details", jobseekeror.drp_Education,
				"Accounting/Finance");
		selectDropdownByVisibleText("Current Industry", "Job Seeker_Professional Details",
				jobseekeror.drp_CurrentIndustry, "Accounting/Finance");
		selectDropdownByVisibleText("Current Industry", "Job Seeker_Professional Details",
				jobseekeror.drp_CurrentIndustry, "Accounting/Finance");

	}

	public void validate_AllMandatoryFields_PersonalInformation() {
		validate_MandatoryFields_PersonalInformation(errorMessages().get("firstnameerror").toString(),
				jobseekeror.lbl_FirstNameMandatorytext);
	}

	public static Map errorMessages() {
		Map<String, String> map = new HashMap();
		map.put("firstnameerror", "* Please specify name first");
		map.put("lastnamerror", "* Please specify lastname.");
		return map;
	}

	public void validate_MandatoryFields_PersonalInformation(String object, WebElement element) {

		// Checking for the null value in FirstName Field
		try {
			if (!(element == null)) {
				jobseekeror.btn_ContinueStep1.click();
			} else

				throw new Exception("First Name is null");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// Validation of mandatory text for first name
		String msg = getTextForWebElement(object, "JobSeeker Personal Informaton", element);
		try {
			if (msg.equals(object))
			{
				System.out.println("Correct validations of" + object);
				
				if (isElementColorRed(element))
					
					System.out.println("The colour is matched ");
				
				else
					
					throw new Exception("Colour Mismatch");
			}
			else

				throw new Exception("Validation text is not displayed");

>>>>>>> Stashed changes
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("error in validate_MandatoryFields_PersonalInformation" + e.getMessage());
		}
<<<<<<< Updated upstream
	}
}

	
=======

		// Colour validation of Mandatory text fields

	}

}
>>>>>>> Stashed changes
