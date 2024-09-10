package Pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Registrationpageobjects {
	
public WebDriver driver;
	
	private By Firstname= By.xpath("//input[@name='firstname']");
	private By Lastname= By.xpath("//input[@name='lastname']");
	private By Email= By.xpath("//input[@name='email']");
	private By Telephone= By.xpath("//input[@name='telephone']");
	private By Password= By.xpath("//input[@name='password']");
	private By PasswordConfirm= By.xpath("//input[@name='confirm']");
	private By PrivacyPolicy=By.xpath("//input[@type='checkbox']");
	private By Continue=By.xpath("//input[@value='Continue']");
	private By getRegistrationConfirmationtext=By.xpath("//h1[text()='Your Account Has Been Created!']");
	//Blank data code
	private By errortxtFirstname= By.xpath("//div[text()='First Name must be between 1 and 32 characters!']");
	private By errortxtLastname= By.xpath("//div[text()='Last Name must be between 1 and 32 characters!']");
	private By errortxtEmail= By.xpath("//div[text()='E-Mail Address does not appear to be valid!']");
	private By errortxtTelephone= By.xpath("//div[text()='Telephone must be between 3 and 32 characters!']");
	private By errortxtPassword= By.xpath("//div[text()='Password must be between 4 and 20 characters!']");
	private By errortxtContinue=By.xpath("//input[@value='Continue']");
	
	
	
	public Registrationpageobjects(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement EnterFirstname() {
		return driver.findElement( Firstname);
	}
	
	
	public WebElement EnterLastname() {
		return driver.findElement(Lastname);
	}
	public WebElement EnterEmail() {
		return driver.findElement(Email);
	}
	
	public WebElement EnterTelephone() {
		return driver.findElement(Telephone);
	}
	
	public WebElement EnterPassword() {
		return driver.findElement(Password);
	}
	
	public WebElement EnterPasswordConfirm() {
		return driver.findElement(PasswordConfirm);
	}
	
	
	public WebElement ClickPrivacyPolicy() {
		return driver.findElement(PrivacyPolicy);
	}
	
	public WebElement ClickContinue() {
		return driver.findElement(Continue);
	}
	
	public WebElement getRegistrationConfirmationtext() {
		return driver.findElement(getRegistrationConfirmationtext);
	}
	

	public WebElement geterrortxtFirstname() {
		return driver.findElement(errortxtFirstname);
		
	}
	
	public WebElement geterrortxtLastname() {
		return driver.findElement(errortxtLastname);
		
	}
	
	public WebElement geterrortxtEmail() {
		return driver.findElement(errortxtEmail);
		
	}
	
	
	public WebElement geterrortxtTelephone() {
		return driver.findElement(errortxtTelephone);
		
	}
	
	
	public WebElement geterrortxtPassword() {
		return driver.findElement(errortxtPassword);
		
	}
	
	
	
	public WebElement geterrortxtContinue() {
		return driver.findElement(errortxtContinue);
		
	}
	
	
	
	
	
	
	
	
	
}
