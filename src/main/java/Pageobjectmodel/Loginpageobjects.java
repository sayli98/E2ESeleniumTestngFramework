package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpageobjects {
	
	public WebDriver driver;
	
	private By email=By.xpath("//input[@name='email']");
	private By password =By.xpath("//input[@name='password']");
	private By submit=By.xpath("//input[@type='submit']");
	private By loggedin=By.xpath("//h2[contains(text(),'My Account')]");
	private By logout = By.xpath("//a[text()='Logout']");
	private By gettextlogout=By.xpath("//h1[text()='Account Logout']");
	private By warningmsg=By.xpath("//div[text()=' Warning: No match for E-Mail Address and/or Password.']");
	
public Loginpageobjects(WebDriver driver) {
		this.driver=driver;
	}

public WebElement enteremail() {
		
		return driver.findElement(email);
	}
	
public WebElement enterpassword() {
		
		return driver.findElement(password);
	}

public WebElement clickonsubmit() {
	
	return driver.findElement(submit);
}



public WebElement Loggedin() {
	
	return driver.findElement(loggedin);
}

public WebElement Logout() {
	
	return driver.findElement(logout);
}


public WebElement textLogout() {
	
	return driver.findElement(gettextlogout);
}

public WebElement warningtext() {
	
	return driver.findElement(warningmsg);
}

}
