package testcases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Pageobjectmodel.Loginpageobjects;
import Pageobjectmodel.Registrationpageobjects;
import Pageobjectmodel.homepageobjects;
import Resources.Baseclass;
import Resources.CommonMethod;
import Resources.Storedata;

public class verifylogin extends Baseclass{
	
	@Test
	public void verifyLoginwithvalidtestdata() throws IOException, InterruptedException {
		
		
		homepageobjects hp=new homepageobjects(driver);
		
		CommonMethod.handleExplictWait(10,hp.clickonmyaccount(), driver);
		
		hp.clickonmyaccount().click();
		hp.clickonLogin().click();
		
		Loginpageobjects lp= new Loginpageobjects(driver);
		lp.enterEmail().sendKeys(emailaddress);
		lp.enterPassword().sendKeys(Storedata.Password);
		lp.clickonSubmit().click();
		lp.clickonmyaccount().click();
		lp.clickonLogout().click();
		
		
		
		
		String loginactual= driver.getCurrentUrl();
		String loginexpected= Storedata.Loginexpectedurl;
		
		CommonMethod.handleAssertion(loginactual, loginexpected);
		
		String logoutactual=lp.getLogouttext().getText();
		String logoutexpected= Storedata.Logoutexpectedurl;
		
		
		CommonMethod.handleAssertion(logoutactual, logoutexpected);
		
	}
	
	@Test
	public void verifyLoginwithInvalidtestdata() throws IOException, InterruptedException {
		
		
		homepageobjects hp=new homepageobjects(driver);
		
		CommonMethod.handleExplictWait(10,hp.clickonmyaccount(), driver);
		
		hp.clickonmyaccount().click();
		hp.clickonLogin().click();
		
		Loginpageobjects lp= new Loginpageobjects(driver);
		lp.enterEmail().sendKeys(emailaddress);
		lp.enterPassword().sendKeys(Storedata.incorrectpassword);
		lp.clickonSubmit().click();
		
		
		CommonMethod.handleExplictWait(15,lp.getwarningmessage(), driver);
		
		
		
		String loginfailactual= lp.getwarningmessage().getText();
		String loginfailexpected= Storedata.Loginfaliedexpectedtext;
		
		
		CommonMethod.handleAssertion(loginfailactual, loginfailexpected);
		
	
		
		
	}
	
	
	

}
