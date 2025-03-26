package testcases;

import java.io.IOException;

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
import io.qameta.allure.severity.SeverityLevel;
import pageobjectmodel.Loginpageobjects;
import pageobjectmodel.homepageobjects;

public class Verifylogin extends Baseclass{
	@Test
	@Description("Verify user login with valid data..")
	@Epic("EP001")
	@Feature("Feature3:Login valid data")
	@Story("Story:user login with valid data")
	@Step("Verify valid login")
	@Severity(io.qameta.allure.SeverityLevel.BLOCKER)
	
	public void verifyLoginwithValiddata() throws IOException, InterruptedException {
		
	
	
	
	
	
	homepageobjects hp=new homepageobjects(driver);
	
	commonmethods.handleExplictWait(10, hp.clickonmyAccount(), driver);
	
	hp.clickonmyAccount().click();
	hp.clickonlogin().click();
	
	
	
	
	Loginpageobjects lp=new Loginpageobjects(driver);
	
	
	
	lp.enteremail().sendKeys(emailaddress);
	lp.enterpassword().sendKeys(storedata.password);
	lp.clickonsubmit().click();
	
	commonmethods.handleExplictWait(20, lp.Loggedin(), driver);
	
	
	
	
	String loginactual=lp.Loggedin().getText();
	String loginexpected=storedata.Loginexpectedtext;
	commonmethods.handleassertions(loginactual, loginexpected);
	
	
	
	hp.clickonmyAccount().click();
	lp.Logout().click();
	
	String logouttextactual=driver.getCurrentUrl();
	String logouttextexpected=storedata.logOutExpectedConfirmationurl;
    commonmethods.handleassertions(logouttextactual, logouttextexpected);
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	@Test
	@Description("Verify user login with invalid data..")
	@Epic("EP001")
	@Feature("Feature4:Login invalid data")
	@Story("Story:user login with invalid data")
	@Step("Verify invalid login")
	@Severity(io.qameta.allure.SeverityLevel.BLOCKER)
	public void verifyLoginwithInValiddata() throws IOException, InterruptedException {
		
	
	
	
	
	homepageobjects hp=new homepageobjects(driver);
	
	commonmethods.handleExplictWait(10, hp.clickonmyAccount(), driver);
	
	hp.clickonmyAccount().click();
	hp.clickonlogin().click();
	
	
	
	Loginpageobjects lp=new Loginpageobjects(driver);
	lp.enteremail().sendKeys(emailaddress);
	lp.enterpassword().sendKeys(storedata.incorrectPassword);
	lp.clickonsubmit().click();
	
	commonmethods.handleExplictWait(15, lp.warningtext(), driver);
	
	String Warningerroractual=lp.warningtext().getText();
	String Warningerrorexpected=storedata.loginFailedExpectedText;
	commonmethods.handleassertions(Warningerroractual, Warningerrorexpected);
	
	
	
}
}

