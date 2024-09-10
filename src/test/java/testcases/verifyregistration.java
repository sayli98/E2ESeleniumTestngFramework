package testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Pageobjectmodel.Registrationpageobjects;
import Pageobjectmodel.homepageobjects;
import Resources.Baseclass;
import Resources.CommonMethod;
import Resources.Storedata;

public class verifyregistration extends Baseclass {
	
	@Test
	public void verifyregistrationwithvalidtestdata() throws IOException {
		
		
		
		homepageobjects hp=new homepageobjects(driver);
		
		CommonMethod.handleExplictWait(10,hp.clickonmyaccount(), driver);
		
		hp.clickonmyaccount().click();
		hp.clickonRegistration().click();
		
		Registrationpageobjects rp= new Registrationpageobjects(driver);
		rp.EnterFirstname().sendKeys(Storedata.firstname);
		rp.EnterLastname().sendKeys(Storedata.Lastname);
		rp.EnterEmail().sendKeys(emailaddress);
		rp.EnterTelephone().sendKeys(Storedata.Telephone);
		rp.EnterPassword().sendKeys(Storedata.Password);
		rp.EnterPasswordConfirm().sendKeys(Storedata.Confirmpassword);
		rp.ClickPrivacyPolicy().click();
		rp.ClickContinue().click();
		
		
		String actual=rp.getRegistrationConfirmationtext().getText();
		String expected= Storedata.regexpectedtext;
		
		CommonMethod.handleAssertion(actual, expected);
	}
	
	@Test
public void verifyregistrationwithBlanktestdata() throws IOException {
		
		
		homepageobjects hp=new homepageobjects(driver);
		
		CommonMethod.handleExplictWait(10,hp.clickonmyaccount(), driver);
		
		hp.clickonmyaccount().click();
		hp.clickonRegistration().click();
		
		Registrationpageobjects rp= new Registrationpageobjects(driver);
		rp.geterrortxtContinue().click();
		
		
		
		String firstnameactual = rp.geterrortxtFirstname().getText();
		String firstnameexpected= Storedata.firstnameexpected;
		
		CommonMethod.handleAssertion(firstnameactual, firstnameexpected);
		
		String lastnameactual= rp.geterrortxtLastname().getText();
		String lastnameexpected= Storedata.lastnameexpected;
		
		CommonMethod.handleAssertion(lastnameactual, lastnameexpected);
		
		String emailactual= rp.geterrortxtEmail().getText();
		String emailexpected= Storedata.emailexpected;
		
		CommonMethod.handleAssertion(emailactual, emailexpected);
		
		String telephoneactual=rp.geterrortxtTelephone().getText();
		String telephoneexpected= Storedata.telephoneexpected;
		
		CommonMethod.handleAssertion(telephoneactual, telephoneexpected);
		
		String passwordactual= rp.geterrortxtPassword().getText();
		String passwordexpected= Storedata.passwordexpected;
		
		CommonMethod.handleAssertion(passwordactual, passwordexpected);
	
	}
		
	//}

}
