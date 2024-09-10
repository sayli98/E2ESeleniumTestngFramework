package Pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homepageobjects {
	
	public WebDriver driver;
	
	private By myAccount= By.xpath("//a[@title='My Account']");
	private By Registration= By.xpath("//a[text()='Register']");
	private By login= By.xpath("//a[text()='Login']");
	
	public homepageobjects(WebDriver driver) {
		this.driver=driver;
		
	}


	public WebElement clickonmyaccount() {
		return driver.findElement(myAccount);
	}
	
	
	public WebElement clickonRegistration() {
		return driver.findElement(Registration);
	}
	
	public WebElement clickonLogin() {
		return driver.findElement(login);
	}
	
	

}
