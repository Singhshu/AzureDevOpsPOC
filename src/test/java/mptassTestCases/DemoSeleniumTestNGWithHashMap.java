package mptassTestCases;

import static utility.ConfigReader.getDemoUrl;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import mptaasPages.Data;

public class DemoSeleniumTestNGWithHashMap {
	public WebDriver driver;
	public String crendentials;
	public String credentialsInfo[];

	@BeforeMethod(alwaysRun = true)
	public void setup() throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\Chrome Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(getDemoUrl());
	}

	@Test(priority = 1)
	public void loginWithStudentUserTest() throws InterruptedException {
		/*
		 * Splitting the user credentials using Hasmap and split function, user
		 * credentials are getting fetched from Data.java class file
		 */
		String crendentials = Data.getUserLoginInfor().get("student");
		String credentialsInfo[] = crendentials.split("_");
		//Actual program starts from here
		driver.findElement(By.id("txtUserid")).sendKeys(credentialsInfo[0]);
		driver.findElement(By.id("txtPassword")).sendKeys(credentialsInfo[1]);
		WebElement clickLogin = driver.findElement(By.id("btnSubmit"));
		clickLogin.click();
		Thread.sleep(3000);
		WebElement closePopUp = driver.findElement(By.xpath("//button[@onclick='closeme_obcapply();']"));
		closePopUp.click();
		WebElement logout = driver.findElement(By.xpath("//div[@class='navbar-custom-menu']"));
		logout.click();

	}

	@Test(priority = 2)
	public void loginWithVerifierUserTest() throws InterruptedException {
		/*
		 * Splitting the user credentials using Hasmap and split function, user
		 * credentials are getting fetched from Data.java class file
		 */
		String crendentials = Data.getUserLoginInfor().get("verifier");
		String credentialsInfo[] = crendentials.split("_");
		//Actual program starts from here
		driver.findElement(By.id("txtUserid")).sendKeys(credentialsInfo[0]);
		driver.findElement(By.id("txtPassword")).sendKeys(credentialsInfo[1]);
		WebElement clickLogin = driver.findElement(By.id("btnSubmit"));
		clickLogin.click();
		Thread.sleep(3000);
		WebElement closePopUp = driver.findElement(By.xpath("//button[@onclick='closeme_obcapply();']"));
		closePopUp.click();
		WebElement logout = driver.findElement(By.xpath("//div[@class='navbar-custom-menu']"));
		logout.click();
	}

	@Test(priority = 3)
	public void loginWithApproverUserTest() throws InterruptedException {
		/*
		 * Splitting the user credentials using Hasmap and split function, user
		 * credentials are getting fetched from Data.java class file
		 */
		String crendentials = Data.getUserLoginInfor().get("approver");
		String credentialsInfo[] = crendentials.split("_");
		//Actual program starts from here
		driver.findElement(By.id("txtUserid")).sendKeys(credentialsInfo[0]);
		driver.findElement(By.id("txtPassword")).sendKeys(credentialsInfo[1]);
		WebElement clickLogin = driver.findElement(By.id("btnSubmit"));
		clickLogin.click();
		Thread.sleep(3000);
		WebElement pmsApproval = driver.findElement(By.xpath("/html/body/div/div[5]/aside/div/section/ul/li[7]"));
		pmsApproval.click();
		WebElement obc = driver.findElement(By.xpath("/html/body/div/div[5]/aside/div/section/ul/li[7]/ul/li/ul/li/a"));
		obc.click();
		Select select = new Select(driver.findElement(By.name("ddlApplicationType")));
		Thread.sleep(5000);
		select.selectByVisibleText(Data.selectApplicationStatus().get("A"));
		Thread.sleep(5000);
		/*
		 * WebElement logout =
		 * driver.findElement(By.xpath("//div[@class='navbar-custom-menu']"));
		 * logout.click();
		 */
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
