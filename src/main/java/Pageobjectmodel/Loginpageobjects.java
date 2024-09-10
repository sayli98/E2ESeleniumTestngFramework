package Pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpageobjects {
	
public WebDriver driver;
	
	private By email= By.xpath("//input[@name='email']");
	private By password= By.xpath("//input[@name='password']");
	private By login= By.xpath("//input[@value='Login']");
	private By myAccount= By.xpath("//a[@title='My Account']");
	private By Logout=By.xpath("(//a[text()='Logot'])[1]");
	private By getLogouttext=By.xpath("//h1[text()='Account Logout']");
	private By warningmessage=By.xpath("//div[text()=' Warning: No match for E-Mail Address and/or Password.']");
	
	public Loginpageobjects(WebDriver driver) {
		this.driver=driver;
		
	}


	public WebElement enterEmail() {
		return driver.findElement(email);
	}
	
	
	public WebElement enterPassword() {
		return driver.findElement(password);
	}
	
	public WebElement clickonSubmit() {
		return driver.findElement(login);
	}
	
	public WebElement clickonmyaccount() {
		return driver.findElement(myAccount);
	}
	
	public WebElement clickonLogout() {
		return driver.findElement(Logout);
	}
	
	public WebElement getLogouttext() {
		return driver.findElement(getLogouttext);
	}
	
	public WebElement getwarningmessage() {
		return driver.findElement(warningmessage);
	}



}
