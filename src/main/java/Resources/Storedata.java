package Resources;

public class storedata {
	
	public static String firstName= "Priya";
	public static String lastName= "Sharma";
	
	public static String regExpectedText= "Your Account Has Been Created!";
	
	public static String telePhone = "1234567890";
	public static String password = "Naveen12";
	public static String confirmPassword = "Naveen12";
	public static String incorrectPassword ="kdahdf";
	
	//storing expected result for all the classes
	public static String registerExpectedsucessURL = "https://naveenautomationlabs.com/opencart/index.php?route=account/success";
	public static String firstNameErrorExpectedresult = "First Name must be between 1 and 32 characters!";	
	public static String lastNameErrorExpectedresult = "Last Name must be between 1 and 32 characters!";
	public static String emailErrorExpectedresult = "E-Mail Address does not appear to be valid!";
	public static String telePhoneErrorExpectedresult = "Telephone must be between 3 and 32 characters!";
	public static String passwordErrorExpectedresult = "Password must be between 4 and 20 characters!";
	public static String privacyPolicyErrorExpectedresult = "Warning: You must agree to the Privacy Policy!";
	
	//String the expected data for login 
	public static String Loginexpectedtext="My Account";
	public static String logOutExpectedConfirmationurl = "https://naveenautomationlabs.com/opencart/index.php?route=account/logout";

	public static String loginFailedExpectedText = "Warning: No match for E-Mail Address and/or Password.";

}
