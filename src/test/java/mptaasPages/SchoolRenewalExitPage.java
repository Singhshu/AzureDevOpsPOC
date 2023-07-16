package mptaasPages;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import mptassTestCases.SchoolRenewalExit;

public class SchoolRenewalExitPage {
	static final Logger logger = Logger.getLogger(SchoolRenewalExit.class.getName());
	WebDriver driver;
	ExtentReports extent;
	ExtentTest test;

	@FindBy(xpath = "//div[@id='MPTAASModal']//button[text()='Close']")
	WebElement closePopUp;

	@FindBy(xpath = "//input[@name='username']")
	WebElement enterUserName;

	@FindBy(id = "txtPassword")
	WebElement enterPassword;

	@FindBy(xpath = "//button[@id='btnSubmit']")
	WebElement login;

	@FindBy(xpath = "//span[text()='Admission Management']")
	WebElement admissionManagement;

	@FindBy(xpath = "//span[text()='Student Renewal']")
	WebElement studentRenewal;

	@FindBy(xpath = "//select[@name='ClassId']")
	WebElement selectClass;

	@FindBy(xpath = "//option[@value='7']")
	WebElement classSelected;

	@FindBy(xpath = "//option[@value='12']")
	WebElement classtwelfthSelected;

	@FindBy(xpath = "//button[@name='ctrlbtnSearch']")
	WebElement search;

	@FindBy(id = "txtUserid")
	WebElement enterProfileId;

	@FindBy(xpath = "//a[text()=' Renew ']")
	WebElement renew;

	@FindBy(xpath = "//div[@id='divConfirmReNewAdmission']//input[@value='Grade']")
	WebElement gradeRadioButton;

	@FindBy(xpath = "//div[@id='divPassingGradePercentage']//input[@value='Grade']")
	WebElement failedGradeRadioButton;

	@FindBy(xpath = "//input[@value='Failed']")
	WebElement selectFailed;

	@FindBy(xpath = "//div[@id='divConfirmReNewAdmission']//select[@name='PassingGrade']")
	WebElement gradeDropDown;

	@FindBy(xpath = "//select[@id='ddlPassingGrade2' and @name='PassingGrade']")
	WebElement gradeDropDownExit;

	@FindBy(xpath = "//option[@value='B-1']")
	WebElement gradeSelected;

	@FindBy(xpath = "//option[@value='E']")
	WebElement failedGradeSelected;

	@FindBy(xpath = "//button[@name='ctrlbtnSubmitAdmission']")
	WebElement submit;

	@FindBy(xpath = "//button[@name='ctrlbtnSubmitAdmissionExit']")
	WebElement exitSubmit;

	@FindBy(xpath = "//button[@class='swal-button swal-button--confirm swal-button--danger']")
	WebElement yes;

	@FindBy(xpath = "//button[@class='swal-button swal-button--cancel']")
	WebElement no;

	@FindBy(xpath = "//button[text()='Close']")
	WebElement close;

	@FindBy(xpath = "//button[text()='OK']")
	WebElement confimationOk;

	// Exit Scenario

	@FindBy(xpath = "//a[text()=' Exit ']")
	WebElement exit;

	@FindBy(xpath = "//a[@title='Logout']")
	WebElement logout;

	@FindBy(xpath = "//a[span[contains(text(), 'Apply Class')]]")
	WebElement preMatricApply;

	@FindBy(xpath = "//a[@href='/PreMetric/PMS/Scholarship/AcademicYearSelectionSchool']")
	WebElement applicationApply;

	/*
	 * @FindBy(name="//select[@name='AcademicClass']") WebElement AcademicClass;
	 */

	@FindBy(name = "AcademicClass")
	WebElement AcademicClass;

	@FindBy(xpath = "//option[@value='11th']")
	WebElement EleventhClass;

	@FindBy(name = "Stream")
	WebElement Stream;

	@FindBy(xpath = "//option[@value='Science']")
	WebElement Science;

	@FindBy(id = "btnSubmit")
	WebElement Submit;

	@FindBy(xpath = "//a[@title='Logout']")
	WebElement Logout;

	// Testcase two

	@FindBy(xpath = "(//span[@class='select2-selection select2-selection--single'])[1]")
	WebElement District;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement EnterDistrict;

	@FindBy(xpath = "(//span[@class='select2-selection select2-selection--single'])[2]")
	WebElement Institute;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement InstituteCode;

	@FindBy(id = "txtIncomeCertificateNumber")
	WebElement IncomeCertificateNumber;

	@FindBy(id = "txtIncomeCertificateIssueDate")
	WebElement IncomeCertificateDate;

	@FindBy(id = "btnGetIncomeDetail")
	WebElement IncomeDetail;

	@FindBy(id = "txtAdmissionDate")
	WebElement AdmissionDate;
	
	@FindBy(xpath="//td[@class='day' and text()='1']")
	WebElement Date;

	@FindBy(id = "btnConfirmation")
	WebElement AcceptDateConfirmation;

	@FindBy(id = "txtEnrollmentNumber")
	WebElement SamagraId;

	@FindBy(id = "btnGetEnrolledDetail")
	WebElement GetSamagraDetail;
	
	
	@FindBy(id = "btnYesConfirmYesNo")
	WebElement submitApplication;
	
	@FindBy(id = "chkSubmit")
	WebElement CheckDeclaration;
	
	
	@FindBy(id = "btnConfirmationYes")
	WebElement ClickConfirm;
	
	@FindBy(id = "btnNoConfirmYesNo")
	WebElement ExitApplication;
	
	
	
	
	public void clickOnExitApplication() {
		ExitApplication.click();
	}
	
	public void clickOnConfirm() {
		CheckDeclaration.click();
	}
	public void clickCheckDeclaration() {
		CheckDeclaration.click();
	}
	
	public void submitPreMatricApplication() {
		submitApplication.click();
	}
	
	public void selectDate() {
		Date.click();
	}

	public void clickGetSamagraDetail() {
		GetSamagraDetail.click();
	}

	public void enterSamagraId(String SamagraID) {
		SamagraId.sendKeys(SamagraID);
	}

	public void clickOnAcceptDateConfirmation() {
		AcceptDateConfirmation.click();
	}

	public void clickAdmissionDate() {
		AdmissionDate.click();
	}

	public void getIncomeDetail() {
		IncomeDetail.click();

	}

	public void enterIncomeCertificateDate(String institute) {
		IncomeCertificateDate.sendKeys(institute);
	}

	public void enterIncomeCertificateNumber(String institute) {
		IncomeCertificateNumber.sendKeys(institute);
	}

	public void selectInstitute() {
		Institute.click();
	}

	public void enterInstituteCode(String institute) {
		InstituteCode.sendKeys(institute);
		InstituteCode.sendKeys(Keys.ENTER);
	}

	public void enterUserDistrict(String district) {
		EnterDistrict.sendKeys(district);
		EnterDistrict.sendKeys(Keys.ENTER);
	}

	public void selectDistrict() {
		District.click();
	}

	public void userLogout() {
		Logout.click();
	}

	public void submit() {
		Submit.click();
	}

	public void selectScience() {
		Science.click();
	}

	/*
	 * public void closePOPUP() { closePopUp.click(); }
	 */

	public void selectAcademicClass() {
		AcademicClass.click();
	}

	public void selectEleventhClass() {
		EleventhClass.click();
	}

	public void applyforPreMatric() {
		preMatricApply.click();
	}

	public void clickApplicationApply() {
		applicationApply.click();
	}

	public void selectStream() {
		Stream.click();
	}

	public SchoolRenewalExitPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void userName(String sUserName) {
		enterUserName.sendKeys(sUserName);
	}

	public void getPassword(String sPassword) {
		enterPassword.sendKeys(sPassword);
	}

	public void clickLogin() {
		login.click();
	}

	public void clickAdmissionManagement() {
		admissionManagement.click();
	}

	public void clickStudentRenewal() {
		studentRenewal.click();
	}

	public void clickSelectClass() {
		selectClass.click();
	}

	public void classSelected() {
		classSelected.click();
	}

	public void classTwelfthSelected() {
		classtwelfthSelected.click();
	}

	public void clickSearch() {
		search.click();
	}

	public void enterProfileId(String profileId) {
		enterProfileId.sendKeys(profileId);
		/* logger.info("Shubham Pal Singh"); */
	}

	public void clickRenew() {
		renew.click();
	}

	public void selectFailedRadioButton() {
		selectFailed.click();
	}

	public void clickGradeRadioButton() {
		gradeRadioButton.click();
	}

	public void clickfailedGradeRadioButton() {
		failedGradeRadioButton.click();
	}

	public void clickGradeDropDown() {
		gradeDropDown.click();
	}

	public void clickGradeDropDownExit() {
		gradeDropDownExit.click();
	}

	public void clickGradeSelected() {
		gradeSelected.click();
	}

	public void clickFailedGrade() {
		failedGradeSelected.click();
	}

	public void clickSubmit() {
		submit.click();
	}

	public void clickYes() {
		yes.click();
	}

	public void clickNo() {
		no.click();
	}

	public void clickClose() {
		close.click();
	}

	public void clickconfimationOk() {
		confimationOk.click();
	}

	public void clickLogOut() {
		logout.click();
	}

	// Exit Scenario
	public void clickExit() {
		exit.click();
	}

	public void clickExitSubmit() {
		exitSubmit.click();
	}

}