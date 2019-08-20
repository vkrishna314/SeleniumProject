package com.applicationor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Fresher {

	/* WEB ELEMENTS OF Fresher Page */

	// =======================================================================

	@FindBy(xpath = "//*[@id='aspnetForm']/div[3]/div/div[2]/div[1]/h2")
	public static WebElement lbl_RegistrationForm;

	@FindBy(xpath = "//*[@id='aspnetForm']/div[3]/div/div[2]/div[3]/div[1]/div/div[1]/label")
	public static WebElement lbl_FirstName;

	@FindBy(xpath = "//*[@id='aspnetForm']/div[3]/div/div[2]/div[3]/div[1]/div/div[1]/div/input")
	public static WebElement edi_FirstName;

	@FindBy(xpath = "//*[@id='aspnetForm']/div[3]/div/div[2]/div[3]/div[1]/div/div[2]/label")
	public static WebElement lbl_LastName;

	@FindBy(xpath = "//*[@name='ctl00$ContentPlaceHolder2$txtlastname']")
	public static WebElement edi_LastName;

	@FindBy(xpath = "//label[normalize-space(text())='Email']")
	public static WebElement lbl_Email;

	@FindBy(xpath = "//input[@name='ctl00$ContentPlaceHolder2$txtemail']")
	public static WebElement edi_Email;

	@FindBy(xpath = "//label[normalize-space(text())='Contact No(Mobile)']")
	public static WebElement lbl_MobileCtNum;

	@FindBy(xpath = "//input[@name='ctl00$ContentPlaceHolder2$txtmobile']")
	public static WebElement edi_MobileCtNum;

}
