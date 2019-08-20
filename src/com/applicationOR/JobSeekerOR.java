package com.applicationOR;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JobSeekerOR {
	@FindBy(xpath ="//input[@id='ctl00_ContentPlaceHolder2_txtpwd']")
	public static WebElement edi_password ;
	
	@FindBy(xpath="//label[normalize-space(text())='Password']")
	public static WebElement lbl_Password;
	
	@FindBy(xpath="//label[normalize-space(text())='Confirm Password']")
	public static WebElement lbl_ConfirmPassword;
	
	@FindBy(xpath ="//input[@id='ctl00$ContentPlaceHolder2$txtconfirmpwd']")
	public static WebElement edi_confirmpassword ;
	
	
	@FindBy(xpath="//label[normalize-space(text())='Date of Birth']")
	public static WebElement lbl_DOB;
	
	@FindBy(xpath ="//input[@id='ctl00_ContentPlaceHolder2_txtdateOfBirth']")
	public static WebElement edi_dob ;
	
	
	
	
	@FindBy(xpath="//label[normalize-space(text())='Gender']")
	public static WebElement lbl_Gender ;
	
	
	@FindBy(xpath ="//input[@id='ctl00_ContentPlaceHolder2_rdoGender_0']")
	public static WebElement rdo_GenderMale;
	
	@FindBy(xpath ="//input[@id='ctl00_ContentPlaceHolder2_rdoGender_1']")
	public static WebElement rdo_GenderFeMale;
	
	
   @FindBy(xpath="//label[normalize-space(text())='Are you on Notice?']")
	public static WebElement lbl_AreYouNotice ;


   @FindBy(xpath ="//input[@id='ctl00_ContentPlaceHolder2_rblstNotice_0']")
    public static WebElement rdo_Yes;

    @FindBy(xpath ="//input[@id='ctl00_ContentPlaceHolder2_rblstNotice_1']")
     public static WebElement rdo_No;


	
	@FindBy(xpath="//label[normalize-space(text())='Language(s) Known']")
	public static WebElement lbl_languagesKnown ;
	
	@FindBy(xpath ="//input[@id='ctl00_ContentPlaceHolder2_txtlanguagesKnown']")
	public static WebElement edi_LanguagesKnown;

	
	

}
