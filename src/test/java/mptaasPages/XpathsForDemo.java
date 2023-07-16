package mptaasPages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import mptassTestCases.SeleniumDemoTestNGWithHashMap;

public class XpathsForDemo {
	static final Logger logger = Logger.getLogger(SeleniumDemoTestNGWithHashMap.class.getName());
	WebDriver driver;
	ExtentReports extent;
	ExtentTest test;

	
	/*
	 * Write Xpaths from here 
	 * Author- Shubham Pal Singh 
	 * Date 05-07-2023
	 */
	
	
	@FindBy(id = "btnSubmit")
	WebElement Submit;

	@FindBy(xpath = "//a[@title='Logout']")
	WebElement Logout;

	@FindBy(xpath = "//input[@name='username']")
	WebElement enterUserName;
	
	
	/* Driver Factory Setup 
	 * for writing the methods 
	 */

	public XpathsForDemo(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void userName(String sUserName) {
		enterUserName.sendKeys(sUserName);
	}

	public void userLogout() {
		Logout.click();
	}

	public void submit() {
		Submit.click();
	}
}