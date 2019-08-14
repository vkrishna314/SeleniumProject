package com.commonutils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class CommonUtlities {
	
	//********************************** Variables Declaration ******************************
	
	public static WebDriver driver;
	
	
	//======================================================================================
	
	/**
	 * @Method Name:launchApplication
	 * @Purpose:This method is used to launch the application with user specified url and browser
	 * @Input Parameter:String browsername,String url
	 * @Output Parameter:boolean 
	 */

	public static boolean launchApplication(String browser,String url)
	{
		boolean status=true;
	try
	{
		System.out.println("Attempting to launch the Browser :"+browser);
		//check if the browser and url is not empty
		
		if(!(browser.isEmpty() || browser==null))
		{
			System.out.println("Valiadate browser parameter is not null or empty sucessfully");
		}else
		{
			throw new Exception("Browser is not defined by the user, must be chrome or ff or ie");
		}
		
		if(!(url.isEmpty() || url==null) && url.startsWith("https://"))
		{
			System.out.println("Valiadate URL parameter is not null or empty sucessfully");
		}else
		{
			throw new Exception("URL is not defined by the user, must pass valid url with https://");
		}
		
	//launch the browser
		
		
		switch(browser.toLowerCase())
		{
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vamsikrishna\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			break;
		case "ff":
			
			driver=new FirefoxDriver();
			break;
		default:
			throw new Exception("Invalid Browser name , must be chrome or ff , but the uer has given value :"+browser);
		}
	//	maximize the browser
		driver.manage().window().maximize();
	//pass the url
		driver.get(url);
		
	}catch(Exception e)
	{
		status=false;
		
		System.out.println("Error in laumchApp is "+e.getMessage());
	}
	return status;
	
	}
	
	
	/**
	 * @Method Name:hoverAndClick
	 * @Purpose:This method is used to hover and click on elements in the application with user specified page
	 * @Input Parameter:String elementname,String pagename, Webelement element
	 * @Output Parameter:boolean 
	 * @author Vamsikrishna
	 */

	public static boolean hoverAndClick(String elementname,String pagename, WebElement element)
	{
		boolean status=true;
	try
	{
		System.out.println("Attempting to hover and Click :"+elementname+"in page"+ pagename);
		//check if the elementName and Web element is not empty
		
		if(!(elementname.isEmpty() || elementname==null))
		{
			System.out.println("Valiadated element Name "+elementname+ "is not null or empty sucessfully");
		}else
		{
			throw new Exception("Element Name "+elementname+ "is Null or Empty");
		}
		
		if(element!=null)
		{
			System.out.println("Web Element"+element+" is not null");
		}else
		{
			throw new Exception("Web Element "+element+ "is null, please recheck your path");
		}
		
//hover and Click
	Actions act = new Actions(driver)		;
	
	act.moveToElement(element).click(element).build().perform();
	System.out.println("Clicked on Element"+elementname+ "Successfully");
	

		
	}catch(Exception e)
	{
		status=false;
		
		System.out.println("Error in Hover and Click "+elementname+ "in page"+pagename+e.getMessage());
	}
	return status;
	
	}
	
	/**
	 * @Method Name:hoverAndClick
	 * @Purpose:This method is used to send Data into the fields
	 * @Input Parameter:String Data,String fieldname, String Pagename
	 * @Output Parameter:boolean 
	 * @author Vamsikrishna
	 */

	public static boolean sendData(String elementname, String pagename, WebElement element, String data)
	{
		boolean status=true;
	try
	{
		System.out.println("Attempting to send Data :"+data+ "into field" +elementname+"into page"+pagename);
		//check if the Data is not empty
		
		if(!(data.isEmpty() || data==null))
		{
			System.out.println("Valiadated Data is not null or empty sucessfully");
		}else
		{
			throw new Exception("Data "+data+ "is Null or Empty");
		}
		
		
		
//send Data
		element.sendKeys(data);	
		
	}catch(Exception e)
	{
		status=false;
		
		System.out.println("Error in Sending Data "+data+" into Field "+elementname+"in page "+pagename+e.getMessage());

	}
	return status;
	}
	
	
	/**
	 * @Method Name:sendDataByClearing
	 * @Purpose:This method is used to send Data into the fields by Clearing the field
	 * @Input Parameter:String Data,String fieldname, String Pagename
	 * @Output Parameter:boolean 
	 * @author Vamsikrishna
	 */
	
	
	
	public static boolean sendDataByClearing(String elementname, String pageName, WebElement element, String data)
	{
		boolean status=true;
	try
	{
		System.out.println("Attempting to send Data by Clearing :"+data+ "into field" +elementname+"in Page"+pageName);
		//check if the data is not empty
		
		if(!(data.isEmpty() || data==null))
		{
			System.out.println("Valiadated Data is not null or empty sucessfully");
		}else
		{
			throw new Exception("Data is Null or Empty");
		}
		
		
		
//send Data by Clearing
		
		element.clear();
		element.sendKeys(data);
		
		}
	catch(Exception e)
	{
		status=false;
		
		System.out.println("Error in Sending Data "+data+" by Clearing into Field "+elementname+"in page "+pageName+e.getMessage());
	}
	return status;
	}
	
	/**
	 * @Method Name:sendDataByChars
	 * @Purpose:This method is used to send Data into the field by Char Sequence
	 * @Input Parameter:String Data,String fieldname, String Pagename
	 * @Output Parameter:boolean 
	 * @author Vamsikrishna
	 */
	
	public static boolean sendDataByChars(String elementname, String pageName, WebElement element, String data)
	{
		boolean status=true;
	try
	{
		System.out.println("Attempting to send Data "+data+ "by Clearing fieldname "+elementname+ "in page"+pageName);
		//check if the data is not empty
		
		if(!(data.isEmpty() || data==null))
		{
			System.out.println("Valiadated Data is not null or empty sucessfully");
		}else
		{
			throw new Exception("Data is Null or Empty");
		}
		
		
		
//send Data by Char Sequence
		
		element.clear();
		
		char[] arr = data.toCharArray();

for(int i=0;i<=arr.length-1;i++)
{
	element.sendKeys(String.valueOf(arr[i]));
}
		
		
		
		}catch(Exception e)
	{
		status=false;
		
		System.out.println("Error in Sending Data by Char into field "+elementname+ "in page "+pageName+e.getMessage());
	}
	return status;
	}

}
