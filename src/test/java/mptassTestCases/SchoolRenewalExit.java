package mptassTestCases;

import static utility.ConfigReader.getUrl;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import mptaasPages.SchoolRenewalExitPage;

public class SchoolRenewalExit {
	static final Logger logger = Logger.getLogger(SchoolRenewalExit.class.getName());

	WebDriver driver;
	SchoolRenewalExitPage objLogin;

	@BeforeTest(alwaysRun = true)
	public void setup() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\Chrome Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(getUrl());
	}

	@BeforeMethod(alwaysRun = true)
	public void beforeMethod() throws IOException, InterruptedException {
		objLogin = new SchoolRenewalExitPage(driver);
		PropertyConfigurator.configure("log4j.properties");
	}

	@Test(priority = 1)
	public void preMatricTestCase1() throws Exception {
		objLogin.enterProfileId("PR1002493968");
		Thread.sleep(3000);
		objLogin.getPassword("1234");
		Thread.sleep(3000);
		objLogin.submit();
		Thread.sleep(3000);
		objLogin.applyforPreMatric();
		Thread.sleep(3000);
		objLogin.clickApplicationApply();
		Thread.sleep(3000);
		objLogin.selectAcademicClass();
		Thread.sleep(3000);
		objLogin.selectEleventhClass();
		Thread.sleep(3000);
		objLogin.selectStream();
		Thread.sleep(3000);
		objLogin.selectScience();
		Thread.sleep(3000);
		objLogin.submit();
		Thread.sleep(3000);
		objLogin.userLogout();
	}

	@Test(priority = 2)
	public void preMatricTestCase2() throws Exception {
		Thread.sleep(3000);
		objLogin.enterProfileId("PR1002491676");
		Thread.sleep(3000);
		objLogin.getPassword("1234");
		Thread.sleep(3000);
		objLogin.submit();
		Thread.sleep(3000);
		objLogin.applyforPreMatric();
		Thread.sleep(3000);
		objLogin.clickApplicationApply();
		Thread.sleep(3000);
		objLogin.selectAcademicClass();
		Thread.sleep(3000);
		objLogin.selectEleventhClass();
		Thread.sleep(3000);
		objLogin.selectStream();
		Thread.sleep(3000);
		objLogin.selectScience();
		Thread.sleep(3000);
		objLogin.submit();
		Thread.sleep(7000);
		objLogin.selectDistrict();
		Thread.sleep(3000);

		// Input fields
		objLogin.enterUserDistrict("SATNA");
		Thread.sleep(5000);
		objLogin.selectInstitute();
		Thread.sleep(5000);
		objLogin.enterInstituteCode("sSEG23130207406");
		Thread.sleep(5000);
		objLogin.enterIncomeCertificateNumber("RS/418/0111/5862/2021");
		Thread.sleep(3000);
		objLogin.enterIncomeCertificateDate("12-07-2021");
		Thread.sleep(3000);
		objLogin.getIncomeDetail();
		Thread.sleep(30000);
		try {
			driver.switchTo().alert().accept();
		} catch (NoAlertPresentException e) {
		}
		Thread.sleep(3000);
		objLogin.clickAdmissionDate();
		Thread.sleep(3000);
		objLogin.selectDate();
		Thread.sleep(5000);
		objLogin.clickOnAcceptDateConfirmation();
		Thread.sleep(3000);
		objLogin.enterSamagraId("134254269");
		Thread.sleep(3000);
		objLogin.clickGetSamagraDetail();
		Thread.sleep(10000);
		// End Input Fields

		// Enable Keyboard
		Actions actions = new Actions(driver);
		WebElement amountLabel = driver.findElement(By.id("txtAmount"));
		actions.moveToElement(amountLabel).click().perform();
		Thread.sleep(3000);
		objLogin.submit();
		Thread.sleep(3000);
		// End Enable Keyboard

		// Get the amount value and apply assertion
		String actualAmount = amountLabel.getText();
		String expectedAmount = "2950";
		if (actualAmount.equals(expectedAmount)) {
			Assert.assertEquals(actualAmount, expectedAmount, "Amount value is as expected");
			System.out.println("As expected");
		} else {
			Assert.fail("Amount value is not as expected");
			System.out.println("Not Matched");
		}
		objLogin.submitPreMatricApplication();
		// Get the amount value and apply assertion- End

		Thread.sleep(3000);
		objLogin.clickCheckDeclaration();
		Thread.sleep(3000);
		objLogin.submit();
		Thread.sleep(3000);
		objLogin.clickOnConfirm();
		Thread.sleep(3000);
		objLogin.clickOnExitApplication();
		Thread.sleep(3000);
		objLogin.userLogout();
		Thread.sleep(3000);

	}

	@AfterTest
	public void tearDownTest() {
		driver.close();
		driver.quit();
		System.out.println("Test completed successfully");
	}
}
