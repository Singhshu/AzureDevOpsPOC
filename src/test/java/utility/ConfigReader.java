package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	public static Properties getPropertyObject() throws IOException {
		/*
		 * FileInputStream fp = new FileInputStream(
		 * "C:\\Users\\HP\\eclipse-workspace\\com.mptaascnew.mpsedc\\src\\test\\java\\utilities\\data.properties"
		 * );
		 */
		FileInputStream fp = new FileInputStream(
				"I:\\Automation POC\\seleniumframwork\\MptaascProject\\src\\test\\java\\utility\\data.properties");
		
		Properties prop = new Properties();
		prop.load(fp);
		return prop;
	}

	public static String enterNewEmail() throws IOException {
		return getPropertyObject().getProperty("Email");
	}

	public static String enterSecondName() throws IOException {
		return getPropertyObject().getProperty("SecondName");
	}

	public static String enterFirstName() throws IOException {
		return getPropertyObject().getProperty("FirstName");
	}

	public static String textEditor() throws IOException {
		return getPropertyObject().getProperty("editor");
	}

	public static String textArea() throws IOException {
		return getPropertyObject().getProperty("textA");
	}

	public static String uploadFile() throws IOException {
		return getPropertyObject().getProperty("upload");
	}

	public static String searchCountry() throws IOException {
		return getPropertyObject().getProperty("Country");
	}

	public static String dateTime() throws IOException {
		return getPropertyObject().getProperty("DateTime");
	}

	public static String selectToDate() throws IOException {
		return getPropertyObject().getProperty("ToDate");
	}

	public static String selectFromDate() throws IOException {
		return getPropertyObject().getProperty("FromDate");
	}

	public static String selectDate() throws IOException {
		return getPropertyObject().getProperty("Date");
	}

	public static String enterURLtext() throws IOException {
		return getPropertyObject().getProperty("URLtext");
	}

	public static String enterTelephoneNumber() throws IOException {
		return getPropertyObject().getProperty("Telephone");
	}

	public static String selectGender() throws IOException {
		return getPropertyObject().getProperty("Gender");
	}

	public static String enterText() throws IOException {
		return getPropertyObject().getProperty("txt");
	}

	public static String enterNewPassword() throws IOException {
		return getPropertyObject().getProperty("password");
	}

	public static String getEnterMobileNumber() throws IOException {
		return getPropertyObject().getProperty("mobile");
	}

	public static String getEmail() throws IOException {
		return getPropertyObject().getProperty("email");
	}

	public static String getDemoUserName() throws IOException {
		return getPropertyObject().getProperty("Username");
	}

	public static String getUrl() throws IOException {
		return getPropertyObject().getProperty("PreMatricURL");
	}
	public static String getDemoUrl() throws IOException {
		return getPropertyObject().getProperty("demoURL");
	}

	// Payment Configuration reader

	public static String getPaymentUrl() throws IOException {
		return getPropertyObject().getProperty("paymenturl");
	}

	public static String getPMSUrl() throws IOException {
		return getPropertyObject().getProperty("pmsurl");
	}
	
	public static String getPMSUser() throws IOException {
		return getPropertyObject().getProperty("Usernamepms");
	}
	
	public static String getPMSUserPassword() throws IOException {
		return getPropertyObject().getProperty("PmsPassword");
	}
	
	//Create Pool Account
	public static String getAccountType() throws IOException {
		return getPropertyObject().getProperty("AccountType");
	}
	
	public static String Bank() throws IOException {
		return getPropertyObject().getProperty("Bank");
	}
	
	public static String enterifscCode() throws IOException {
		return getPropertyObject().getProperty("IFSCODE");
	}
	
	public static String accounNumber() throws IOException {
		return getPropertyObject().getProperty("ACCNO");
	}
	
	public static String enteraccountHolderName() throws IOException {
		return getPropertyObject().getProperty("AccountHolderName");
	}
	
	public static String enterVendorId() throws IOException {
		return getPropertyObject().getProperty("VendorID");
	}
	
	public static String enterOTP() throws IOException {
		return getPropertyObject().getProperty("OTP");
	}
	
}