package com.applicationOR;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JobSeekerOR {
	
	
	//************************************** JobSeeker Page WebElements *******************************************
	//*************************************  Step  1 **************************************************************

	//=======================================================================================================================


	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder2_txtfirstname']")
	public static WebElement edi_FirstName;

	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder2_txtlastname']")
	public static WebElement edi_LastName;

	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder2_txtemail']")
	public static WebElement edi_Email;

	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder2_txtmobile']")
	public static WebElement edi_ContactNumber;

	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder2_txtLandlineNo']")
	public static WebElement edi_LandLineNumber;

	@FindBy(xpath="//label[normalize-space(text())='First Name']")
	public static WebElement lbl_FirstName;

	@FindBy(xpath="//label[normalize-space(text())='Last Name']")
	public static WebElement lbl_LastName;

	@FindBy(xpath="//label[normalize-space(text())='Email']")
	public static WebElement lbl_Email;

	@FindBy(xpath="//label[normalize-space(text())='Contact No(Mobile)']")
	public static WebElement lbl_ContactNumber;

	@FindBy(xpath="//label[normalize-space(text())='Landline No :']")
	public static WebElement lbl_LandLineNumber;


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

	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder2_btnProfessional']")
	public static WebElement btn_Continue;
	
	


}
