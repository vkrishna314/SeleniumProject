package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.commonutils.CommonUtlities;

public class sample extends CommonUtlities{

	public static void main(String[] args) {
		if(CommonUtlities.launchApplication("chrome", "https://www.flipkart.com/")) {
			String elementName = "Login & Signup";
			WebElement element = driver.findElement(By.linkText(elementName));

			CommonUtlities.hoverAndClick(elementName, "landing page", element);
			
		}
		

		System.out.println("Completed Launch ");
		
	}

}
