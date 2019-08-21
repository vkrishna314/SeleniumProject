package com.applicationpages;

import org.openqa.selenium.support.PageFactory;

import com.applicationor.JobSeekerOR;
import com.commonutils.CommonUtlities;

public class JobSeeker_StepDefinitions extends CommonUtlities{

	
	public void ValidateMandatoryField_PersonalInformation(){
		
		JobSeekerOR jobseekeror = PageFactory.initElements(driver, JobSeekerOR.class);
		JobSeeker_StepDefinitions stp = new JobSeeker_StepDefinitions();
		
		
		//Checking for the null value in FirstName Field
		try{
		if(jobseekeror.lbl_FirstName.equals(null))
		{
		jobseekeror.btn_Continue.click();
		} else
			
				throw new Exception("Field value is not null");
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	
		
			
		
		//Validation of  mandatory text for first name
		String message= "* Please specify firstname.";
	    String msg = stp.getTextForWebElement("First Name", "JobSeeker Personal Informaton", JobSeekerOR.lbl_FirstNameMandatorytext);
	    try{
	    if(msg.equals(message))
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
	   if( isElementColorRed( JobSeekerOR.lbl_FirstNameMandatorytext))
	   {
	    
	    System.out.println("The colour is matched ");
	    

} else
		
			throw new Exception("Colour Mismatch");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }}
