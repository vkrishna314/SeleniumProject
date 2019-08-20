package com.applicationor;

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
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder2_btnProfessional']")
	public static WebElement btn_Continue;


	
	
	
	

}
