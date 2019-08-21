package com.commonutils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
=======
import org.openqa.selenium.interactions.Actions;
>>>>>>> Stashed changes
=======
import org.openqa.selenium.interactions.Actions;
>>>>>>> Stashed changes
=======
import org.openqa.selenium.interactions.Actions;
>>>>>>> Stashed changes
=======
import org.openqa.selenium.interactions.Actions;
>>>>>>> Stashed changes

public class CommonUtlities {

	// ********************************** Variables Declaration
	// ******************************

	public static WebDriver driver;

	// ======================================================================================

	/**
	 * @Method Name:launchApplication
	 * @Purpose:This method is used to launch the application with user
	 *               specified url and browser
	 * @Input Parameter:String browsername,String url
	 * @Output Parameter:boolean
	 * @test
	 */

	public static boolean launchApplication(String browser, String url) {
		boolean status = true;
		try {
			System.out.println("Attempting to launch the Browser :" + browser);
			// check if the browser and url is not empty

			if (!(browser.isEmpty() || browser == null)) {
				System.out
						.println("Valiadate browser parameter is not null or empty sucessfully");
			} else {
				throw new Exception(
						"Browser is not defined by the user, must be chrome or ff or ie");
			}

			if (!(url.isEmpty() || url == null) && url.startsWith("https://")) {
				System.out
						.println("Valiadate URL parameter is not null or empty sucessfully");
			} else {
				throw new Exception(
						"URL is not defined by the user, must pass valid url with https://");
			}

			// launch the browser

			switch (browser.toLowerCase()) {
			case "chrome":
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\Vamsikrishna\\Downloads\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();
				break;
			case "ff":

				driver = new FirefoxDriver();
				break;
			default:
				throw new Exception(
						"Invalid Browser name , must be chrome or ff , but the uer has given value :"
								+ browser);
			}
			// maximize the browser
			driver.manage().window().maximize();
			// pass the url
			driver.get(url);

		} catch (Exception e) {
			status = false;

			System.out.println("Error in laumchApp is " + e.getMessage());
		}
		return status;

	}

	/**
	 * @Method Name:hoverAndClick
	 * @Purpose:This method is used to hover and click on elements in the
	 *               application with user specified page
	 * @Input Parameter:String elementname,String pagename, Webelement element
	 * @Output Parameter:boolean
	 * @author Vamsikrishna
	 */

	public static boolean hoverAndClick(String elementname, String pagename,
			WebElement element) {
		boolean status = true;
		try {
			System.out.println("Attempting to hover and Click :" + elementname
					+ "in page" + pagename);
			// check if the elementName and Web element is not empty

			if (!(elementname.isEmpty() || elementname == null)) {
				System.out.println("Valiadated element Name " + elementname
						+ "is not null or empty sucessfully");
			} else {
				throw new Exception("Element Name " + elementname
						+ "is Null or Empty");
			}

			if (element != null) {
				System.out.println("Web Element" + element + " is not null");
			} else {
				throw new Exception("Web Element " + element
						+ "is null, please recheck your path");
			}

			// hover and Click
			Actions act = new Actions(driver);

			act.moveToElement(element).click(element).build().perform();
			System.out.println("Clicked on Element" + elementname
					+ "Successfully");

		} catch (Exception e) {
			status = false;

			System.out.println("Error in Hover and Click " + elementname
					+ "in page" + pagename + e.getMessage());
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

	public static boolean sendData(String elementname, String pagename,
			WebElement element, String data) {
		boolean status = true;
		try {
			System.out.println("Attempting to send Data :" + data
					+ "into field" + elementname + "into page" + pagename);
			// check if the Data is not empty

			if (!(data.isEmpty() || data == null)) {
				System.out
						.println("Valiadated Data is not null or empty sucessfully");
			} else {
				throw new Exception("Data " + data + "is Null or Empty");
			}

			// send Data
			element.sendKeys(data);

		} catch (Exception e) {
			status = false;

			System.out.println("Error in Sending Data " + data + " into Field "
					+ elementname + "in page " + pagename + e.getMessage());

		}
		return status;
	}

	/**
	 * @Method Name:sendDataByClearing
	 * @Purpose:This method is used to send Data into the fields by Clearing the
	 *               field
	 * @Input Parameter:String Data,String fieldname, String Pagename
	 * @Output Parameter:boolean
	 * @author Vamsikrishna
	 */

	public static boolean sendDataByClearing(String elementname,
			String pageName, WebElement element, String data) {
		boolean status = true;
		try {
			System.out.println("Attempting to send Data by Clearing :" + data
					+ "into field" + elementname + "in Page" + pageName);
			// check if the data is not empty

			if (!(data.isEmpty() || data == null)) {
				System.out
						.println("Valiadated Data is not null or empty sucessfully");
			} else {
				throw new Exception("Data is Null or Empty");
			}

			// send Data by Clearing

			element.clear();
			element.sendKeys(data);

		} catch (Exception e) {
			status = false;

			System.out.println("Error in Sending Data " + data
					+ " by Clearing into Field " + elementname + "in page "
					+ pageName + e.getMessage());
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

	public static boolean sendDataByChars(String elementname, String pageName,
			WebElement element, String data) {
		boolean status = true;
		try {
			System.out.println("Attempting to send Data " + data
					+ "by Clearing fieldname " + elementname + "in page"
					+ pageName);
			// check if the data is not empty

			if (!(data.isEmpty() || data == null)) {
				System.out
						.println("Valiadated Data is not null or empty sucessfully");
			} else {
				throw new Exception("Data is Null or Empty");
			}

			// send Data by Char Sequence

			element.clear();

			char[] arr = data.toCharArray();

			for (int i = 0; i <= arr.length - 1; i++) {
				element.sendKeys(String.valueOf(arr[i]));
			}

		} catch (Exception e) {
			status = false;

			System.out.println("Error in Sending Data by Char into field "
					+ elementname + "in page " + pageName + e.getMessage());
		}
		return status;
	}

	/**
	 * @Method Name:selectDropDownByIndex
	 * @Purpose:This method is used to select the drop down by using its index
	 *               value
	 * @Input Parameter:String elementname,String pageName, WebElement
	 *        webElement,int indexValue
	 * @author Shika
	 * @Output Parameter:boolean
	 */

	public static boolean selectDropdownByIndex(String elementname,
			String pageName, WebElement webElement, int indexValue) {
		boolean status = true;
		try {
			System.out.println("Selecting the dropdown  by pageName" + pageName
					+ "elementname" + elementname + " Webelement " + webElement
					+ "indexValue" + indexValue);
			// Check whether the pageName is not null
			if (pageName == null) {
				throw new Exception(
						"Page Name can not be null, please indicate on which page you reffering to");
			}
			// Check whether the webElement is found or not
			if (webElement == null) {
				throw new Exception(
						"WebElement is null ,please enter the valid web element");
			}
			// selecting the element by indexValue
			Select dropdown = new Select(webElement);
			dropdown.selectByIndex(indexValue);

			System.out.println("Dropdown is selected by pageName" + pageName
					+ "elementname" + elementname + " Webelement " + webElement
					+ "indexValue" + indexValue);
		}

		catch (Exception e) {
			status = false;
			System.out.println(e.getStackTrace());
		}
		return status;

	}

	/**
	 * 
	 * 
	 * 
	 * @Method Name:selectDropDownByValue
	 * @Purpose:This method is used to select the drop down by using the value
	 *               given to the dropdown
	 * @Input Parameter:String elementname,String pageName, WebElement
	 *        webElement,String value
	 * @Output Parameter:boolean
	 * @author Shika
	 */

	public static boolean selectDropdownByValue(String elementname,
			String pageName, WebElement webElement, String value)

	{
		boolean status = true;
		try {
			System.out.println("Selecting the dropdown  by pageName" + pageName
					+ "elementname" + elementname + " Webelement " + webElement
					+ "Value" + value);
			// Check whether the page Name is not null
			if (pageName == null) {
				throw new Exception(
						"Page Name can not be null, please indicate on which page you reffering to");
			}

			// Check whether the webElement is found or not
			if (webElement == null) {
				throw new Exception(
						"WebElement is null,enter the valid web element");
			}
			// Check whether the string value is not empty or null
			if ((value == null || value.isEmpty())) {
				throw new Exception(
						"Value is not defiened by the user,enter the valid value ");

			}

			// selecting the element by indexValue
			Select dropdown = new Select(webElement);
			dropdown.selectByValue(value);

			System.out.println("The dropdown is selected by pageName"
					+ pageName + "elementname" + elementname + " Webelement "
					+ webElement + "Value" + value);

		} catch (Exception e) {
			status = false;
			System.out.println(e.getStackTrace());
		}
		return status;

	}

	/**
	 * 
	 * 
	 * 
	 * @Method Name:selectDropDownByVisibleText
	 * @Purpose:This method is used to select the drop down by using the visible
	 *               text displayed in the application.
	 * @Input Parameter:String VisibleText,WebElement element,PageName
	 *        pageName,String Visible Text
	 * @Output Parameter:boolean
	 * @author Shika
	 */
	public static boolean selectDropdownByVisibleText(String elementname,
			String pageName, WebElement webElement, String visibleText)

	{
		boolean status = true;
		try {
			System.out.println("Selecting the dropdown  by pageName" + pageName
					+ "elementname" + elementname + " Webelement " + webElement
					+ "VisibleText" + visibleText);
			// Check whether the page Name is not null
			if ((pageName == null)) {

				throw new Exception(
						"Page Name cannot be null,please indicate on which page yor are referring to");
			}

			// Check whether the webElement is found or not
			if (webElement == null) {

				throw new Exception(
						"WebElement cannot be null,please enter the weblement");
			}
			// Check whether the string value is not empty or null
			if ((visibleText == null || visibleText.isEmpty())) {

				throw new Exception(
						"Text is not defiened by the user,please enter the text ");
			}

			// selecting the element by indexValue
			Select dropdown = new Select(webElement);
			dropdown.selectByVisibleText(visibleText);

			System.out.println("The dropdown  is selected by pageName"
					+ pageName + "elementname" + elementname + " Webelement "
					+ webElement + "VisibleText" + visibleText);

		} catch (Exception e) {
			status = false;
			System.out.println(e.getStackTrace());
		}
		return status;

	}

	/**
	 * 
	 * 
	 * @param elementname
	 * @Method Name:selectDropDownByXpath
	 * @Purpose:This method is used to select the drop down by using the Xpath
	 *               of the dropdown.
	 * @Input Parameter:String Xpath
	 * @Output Parameter:boolean
	 */

	public static boolean selectDropdownByXpath(String elementname,
			String pageName, WebElement webElement, String Xpath) {
		boolean status = true;
		try {
			System.out.println("Selecting the dropdown  by pageName" + pageName
					+ "elementname" + elementname + " Webelement " + webElement
					+ "Xpath" + Xpath);
			// Check whether the page Name is not null
			if (pageName == null) {

				throw new Exception(
						"Page Name cannot be null,please indicate on which page yor are referring to");
			}

			// check whether the web element is not null

			if (webElement == null) {

				throw new Exception(
						"WebElement cannot be null,please enter the web element");
			}

			// Check whether the xpath is not empty or null
			if ((Xpath.isEmpty() || Xpath == null))

			{
				throw new Exception(
						"Xpath is not defined by the user,please enter the xpath");
			}
			// check whether the web element is not null

			// selecting the element by Xpath
			WebElement dropdownelement = driver.findElement(By.xpath(Xpath));

			// check whether the dropdownelement is not null
			if (dropdownelement == null)

			{
				throw new Exception(
						"DropdownElement is null,enter the valid dropdownnelement");

			}
			System.out.println("The dropdown is selected  by pageName"
					+ pageName + "elementname" + elementname + " Webelement "
					+ elementname + "Xpath" + Xpath);

		} catch (Exception e) {
			status = false;
			System.out.println(e.getStackTrace());
		}
		return status;

	}

	/**
	 * 
	 * 
	 * @Method Name:selectDropDownByCssSelector
	 * @Purpose:This method is used to select the drop down by using the
	 *               CSSSeletor of the dropdown.
	 * @Input Parameter:String CssSelector
	 * @Output Parameter:boolean
	 * @author Shika
	 */

	public static boolean selectDropdownByCssselector(String elementname,
			String pageName, WebElement webElement, String CssSelector) {
		boolean status = true;
		try {
			System.out.println("Selecting the dropdown  by pageName" + pageName
					+ "elementname" + elementname + " Webelement " + webElement
					+ "CssSelector" + CssSelector);
			// Check whether the page Name is not null
			if ((pageName == null)) {

				throw new Exception(
						"Page Name cannot be null,please indicate on which page yor are referring to");
			}

			// Check whether the Web Element is not null

			if (webElement == null) {
				throw new Exception(
						"WebElement cannot be equal to  null,enter the valid web element");
			}
			// Check whether the cssSelector is not empty or null
			if ((CssSelector.isEmpty() || CssSelector == null)) {

				throw new Exception(
						"CssSelector is not defined by the user,enter the valid cssSelector");
			}

			// selecting the element by CssSelector
			WebElement dropdownelement = driver.findElement(By
					.cssSelector(CssSelector));

			// check whether the dropdownelement is not null
			if (dropdownelement == null) {

				throw new Exception("DropdownElement is null");
			}
			System.out.println(" Dropdown is selected  by pageName" + pageName
					+ "elementname" + elementname + " Webelement " + webElement
					+ "CssSelector" + CssSelector);

		} catch (Exception e) {
			status = false;
			System.out.println(e.getStackTrace());
		}
		return status;

	}

	/**
	 * @Method Name: getAttribute
	 * @Purpose: This method is used to get the attribute
	 * @InputParameters: elementname, pagename, Web element,String attribute
	 * @OutputParameter: attributevalue
	 * @Author: Raghavendra
	 */

	public static String getAttribute(String elementname, String pagename,
			WebElement element, String attribute) {
		String attributevalue = "";
		try {
			System.out.println("Code to get the attribute value");

			// Check if the attribute and Web element name is passed

			if ((attribute.isEmpty() || attribute == null)) {
				throw new Exception("attribute can not be null or empty");
			}

			if (element == null) {
				throw new Exception("Web Element " + elementname
						+ " is not defined, please check");
			}

			attributevalue = element.getAttribute(attribute);

		}

		catch (Exception e) {
			System.out.println(e.getMessage());
		}

<<<<<<< Updated upstream
=======
public static boolean IsElementDisplayed(String elementname, String pagename, WebElement element) {
>>>>>>> Stashed changes

		return attributevalue;
	}

	// ******************Variables Declaration******************

	// =================================================================//

	/**
	 * @Method Name: getText
	 * @Purpose: This method is used to get the attribute
	 * @InputParameters: elementname, pagename, element
	 * @OutputParameter: data
	 * @Author: Raghavendra
	 */

	public static String getTextForWebElement(String elementname,
			String pagename, WebElement element) {
		String data = "";

		try {
			System.out.println("Trying to get the text");

			// Check if the element value is passed or not

			if ((element == null)) {

				throw new Exception("Element is not passed by the user");
			}

			// get the text of the element user passed
			data = element.getText();

		}

		catch (Exception e) {

			System.out.println(e.getMessage());
		}

		return data;
	}

	public static boolean IsElementSelected(String elementname, String pagename,
			WebElement element) {

		// ******************Variables Declaration******************

		// =================================================================//

		/**
		 * @Method Name: IsElementSelected
		 * @Purpose: This method is used to check if element passed by user is
		 *           selected or not
		 * @InputParameters: element name,page name, element
		 * @OutputParameter: status
		 * @Author: Raghavendra
		 */

		boolean status = true;

		try {

			System.out
					.println("To check if user passed element is selected or not");

			// Check if the element value is passed or not
			if (element == null) {
				throw new Exception("Web Element " + elementname
						+ " is not defined, please check");
			}

			status = element.isSelected();

		}

		catch (Exception e) {
			System.out.println(e.getStackTrace());
		}

		return status;

	}

	public static boolean IsElementDisplayed(String elementname, String pagename,
			WebElement element) {

		// ******************Variables Declaration******************

		// =================================================================//

		/**
		 * @Method Name: IsElementDisplayed
		 * @Purpose: This method is used to check if element is displayed or not
		 * @InputParameters: element name, pagename, element
		 * @OutputParameter: status
		 * @Author: Raghavendra Test for commit
		 */

		boolean status = true;

		try {
			System.out
					.println("To check if user passed element is displayed or not");

			// Check if the element value is passed or not

			if (element == null) {
				throw new Exception("Web Element " + elementname
						+ " is not defined, please check");
			}
			// To check if user required web element is displayed or not
			status = element.isDisplayed();
		}

		catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
		return status;
	}

	public static boolean IsElementEnabled(String elementname, String pagename,
			WebElement element) {

		// ******************Variables Declaration******************

		// =================================================================//

		/**
		 * @Method Name: IsElementEnabled
		 * @Purpose: This method is used to check user required element is
		 *           enabled or disabled
		 * @InputParameters: element name, pagename, element
		 * @OutputParameter: status
		 * @Author: Raghavendra
		 */

		boolean status = true;

		try {
			System.out
					.println("To check if user passed element is enabled or not");

			// Check if the element value is passed or not

			if (element == null) {
				throw new Exception("Web Element " + elementname
						+ " is not defined, please check");
			}

			status = element.isEnabled();

		}

		catch (Exception e) {
			System.out.println(e.getStackTrace());
		}

		return status;

	}

	/**
	 * 
	 * 
	 * @param element
	 * @Method isElementColorRed
	 * @Purpose:This method is used to check if the element color is red
	 * @Input Parameter:WebElement element
	 * @Output Parameter:boolean
	 */
	
	public static boolean isElementColorRed(WebElement element) {
		String red = "rgba(255, 0, 0, 1)";
		if (element.getAttribute("color").equals(red))
			return true;
		else
			return false;
	}
}
