package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homepageobjects {
	
	public WebDriver driver;
	
	//encapsulation
	private By myAccount= By.xpath("//a[@title='My Account']");
	private By register=By.xpath("//a[text()='Register']");
	private By Login=By.xpath("//a[text()='Login']");
	
	
	
	public homepageobjects(WebDriver driver) {
		
		this.driver=driver;
		
	}


	public WebElement clickonmyAccount() {
		
		return driver.findElement(myAccount);
		
		
	}
	
	
public WebElement clickonregister() {
		
		return driver.findElement(register);
		
		
	}

public WebElement clickonlogin() {
	
	return driver.findElement(Login);
}



}
