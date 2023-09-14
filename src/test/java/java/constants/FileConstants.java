package constants;

import utils.CommonUtils;

public class FileConstants {	
	public static final String LOGIN_TESTDATA_FILE_PATH =  System.getProperty("user.dir") + "/src/main/resources/testdata/LoginTestData.xlsx";
	public static final String LOGIN_TESTDATA_FILE_PATH2 =  System.getProperty("user.dir") + "/src/main/resources/testdata/loginTestData.properties";
	public static final String USER_MENU_TESTDATA_FILE_PATH =  System.getProperty("user.dir") + "/src/main/resources/testdata/userMenuTestData.properties";
	public static final String PROFILE_PHOTO_FILE_PATH =  System.getProperty("user.dir") + "/src/main/resources/testdata/Photo.png";
	public static final String REPORT_PATH =  System.getProperty("user.dir") + "/src/main/resources/reports/"+CommonUtils.getStringDateAndTimeStamp()+"_SFDC.html";
	public static final String SCREENSHOT_PATH =  System.getProperty("user.dir") + "/src/main/resources/reports/"+CommonUtils.getStringDateAndTimeStamp()+"_SFDC.PNG";
	public static final String ACC_TESTDATA_FILE_PATH =  System.getProperty("user.dir") + "/src/main/resources/testdata/Account.properties";
	public static final String OPP_TESTDATA_FILE_PATH =  System.getProperty("user.dir") + "/src/main/resources/testdata/OpportunitiesTestData.properties";
	public static final String LEAD_TESTDATA_FILE_PATH =  System.getProperty("user.dir") + "/src/main/resources/testdata/Lead.properties";
	public static final String CONTACT_TESTDATA_FILE_PATH =  System.getProperty("user.dir") + "/src/main/resources/testdata/Contacts.properties";
	
}
