package com.dryrun;

import java.util.Iterator;
import java.util.Set;

import com.applicationpages.HomePage_StepDefinitions;
import com.commonutils.CommonUtlities;

public class Tc_02_TestFresherRegistration extends CommonUtlities {

	public static void main(String[] args) {
		launchApplication("chrome", "https://www.talentzing.com");
		HomePage_StepDefinitions hompage = new HomePage_StepDefinitions();
		hompage.navigateToFresher();
		String parent = driver.getWindowHandle();
		System.out.println("home page handle is:::" + parent);
		System.out.println(driver.getCurrentUrl());
		Set<String> totalHandles = getWinHandles();
		// totalHandles.remove(landingPage.toString());

		Iterator<String> it = totalHandles.iterator();
		try {
			while (it.hasNext()) {
				String crntwindow = it.next();
				if (!parent.equals(crntwindow)) {
					driver.switchTo().window(crntwindow);
					break;
				}

			}
		} catch (Exception e) {
			System.out.println("error is:::" + e);
		}
		driver.close();

	}
}
