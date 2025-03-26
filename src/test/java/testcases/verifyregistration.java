package testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Resources.Baseclass;
import Resources.commonmethods;
import Resources.storedata;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import pageobjectmodel.Registrationpageobjects;
import pageobjectmodel.homepageobjects;

public class Verifyregistration extends Baseclass {
	
	@Test
	
	@Description("Verify user registration with valid data..")
	@Epic("EP001")
	@Feature("Feature1:registration valid data")
	@Story("Story:user registration with valid data")
	@Step("Verify valid registration")
	@Severity(io.qameta.allure.SeverityLevel.NORMAL)
	public void verifyRegistrationwithValiddata() throws IOException, InterruptedException{
		
		browserlaunch();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		
		homepageobjects hp=new homepageobjects(driver);
		
		
		commonmethods.handleExplictWait(10, hp.clickonmyAccount(), driver);
		
		hp.clickonmyAccount().click();
		hp.clickonregister().click();
		
		
		Registrationpageobjects rp=new Registrationpageobjects(driver);
		rp.Enterfirstname().sendKeys(storedata.firstName);
		rp.EnterLastname().sendKeys(storedata.lastName);
		rp.Enteremail().sendKeys(emailaddress);
		rp.EnterTelephone().sendKeys(storedata.telePhone);
		rp.EnterPassword().sendKeys(storedata.password);
		rp.EnterPasswordconfirm().sendKeys(storedata.confirmPassword);
		rp.policy().click();
		rp.Continue().click();
		
		String confirmtextactual= rp.getConfirmregistrationtext().getText();
		String confirmtextexpected=storedata.regExpectedText;
		commonmethods.handleassertions(confirmtextactual, confirmtextexpected);
		
		
	}

	@Test
	@Description("Verify user registration with blank data..")
	@Epic("EP001")
	@Feature("Feature2:registration blank data")
	@Story("Story:user registration with blank data")
	@Step("Verify blank data registration")
	@Severity(io.qameta.allure.SeverityLevel.NORMAL)
	public void verifyRegistrationwithBlankdata() throws IOException, InterruptedException {
		
        browserlaunch();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		homepageobjects hp=new homepageobjects(driver);
		
		commonmethods.handleExplictWait(10, hp.clickonmyAccount(), driver);
		
		hp.clickonmyAccount().click();
		hp.clickonregister().click();
		
		
		
		
        Registrationpageobjects rp=new Registrationpageobjects(driver);
		
       
        
		rp.Continue().click();
		
		commonmethods.handleExplictWait(10, rp.warningmsgemail(), driver);
		
		String Firstnameactual=rp.warningmsgfirstname().getText();
		String Firstnameexpected=storedata.firstNameErrorExpectedresult;
		commonmethods.handleassertions(Firstnameactual, Firstnameexpected);
		
		
		
		
		String Lastnameactual=rp.warningmsgLastname().getText();
		String Lastnameexpected=storedata.lastNameErrorExpectedresult;
		commonmethods.handleassertions(Lastnameactual, Lastnameexpected);
		
		
		
		String Emailactual=rp.warningmsgemail().getText();
		String Emailexpected=storedata.emailErrorExpectedresult;
		commonmethods.handleassertions(Emailactual, Emailexpected);
		
		
		String Telephoneactual=rp.warningmsgtelephone().getText();
		String Telephoneexpected=storedata.telePhoneErrorExpectedresult;
		commonmethods.handleassertions(Telephoneactual, Telephoneexpected);

		
		String Passwordactual=rp.warningmsgpassword().getText();
		String Passwordexpected=storedata.passwordErrorExpectedresult;
		commonmethods.handleassertions(Passwordactual, Passwordexpected);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



}
