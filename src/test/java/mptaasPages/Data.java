package mptaasPages;

import java.util.HashMap;

public class Data {

	public static HashMap<String, String> getUserLoginInfor() {
		HashMap<String, String> userMap = new HashMap<String, String>();
		userMap.put("student", "PR1001250413_1234");
		userMap.put("verifier", "iTEP00321_1234");
		userMap.put("approver", "stscholarship_1234");
		userMap.put("souser", "stscholarship_1234");
		userMap.put("pouser", "bhopal_do_1234");
		return userMap;
	}

	public static HashMap<String, String> selectApplicationStatus() {
		HashMap<String, String> userMap = new HashMap<String, String>();
		userMap.put("V", "Verified");
		userMap.put("A", "Approved");
		userMap.put("PF", "Pending for Verification");
		userMap.put("PI", "Pending from Institute");
		userMap.put("RI", "Rejected by Institute");
		userMap.put("SentC", "Sent for Clarification to student");
		userMap.put("Received", "Clarification Recieved from student");
		userMap.put("Temp", "Temporary Rejected");
		userMap.put("Perm", "Permanent Rejected");
		return userMap;
	}

	public static HashMap<String, String> monthMap(){
		HashMap<String, String> monthMap = new HashMap<String, String>();
		monthMap.put("Jan", "January");
		monthMap.put("Feb", "February");
		monthMap.put("Mar", "March");
		monthMap.put("Apr", "April");
		monthMap.put("May", "May");
		monthMap.put("Jun", "June");
		monthMap.put("Jul", "July");
		monthMap.put("Aug", "Aug");
		monthMap.put("Sep", "September");
		monthMap.put("Oct", "October");
		monthMap.put("Nov", "November");
		monthMap.put("Dec", "December");
		return monthMap;
	}
}
