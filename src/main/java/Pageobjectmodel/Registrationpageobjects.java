package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Registrationpageobjects {
	
	public WebDriver driver;
	
	private By Firstname=By.xpath("//input[@name='firstname']");
	private By Lastname =By.xpath("//input[@name='lastname']");
	private By Email=By.xpath("//input[@name='email']");
	private By Telephone =By.xpath("//input[@name='telephone']");
	private By Password=By.xpath("//input[@name='password']");
	private By ConfirmPassword =By.xpath("//input[@name='confirm']");
	private By Privacypolicy=By.xpath("//input[@type='checkbox']");
	private By Continue =By.xpath("//input[@value='Continue']");
	private By Registrationconfirm=By.xpath("//h1[text()='Your Account Has Been Created!']");
	private By warningerrorfirstname=By.xpath("//div[text()='First Name must be between 1 and 32 characters!']");
	private By warningerrorlastname=By.xpath("//div[text()='Last Name must be between 1 and 32 characters!']");
	private By warningerroremail=By.xpath("//div[text()='E-Mail Address does not appear to be valid!']");
	private By warningerrortelephone=By.xpath("//div[text()='Telephone must be between 3 and 32 characters!']");
	private By warningerrorpassword=By.xpath("//div[text()='Password must be between 4 and 20 characters!']");
	
	
public Registrationpageobjects(WebDriver driver) {
		this.driver=driver;
	}


public WebElement Enterfirstname() {
		
		return driver.findElement(Firstname);
	}
	
public WebElement EnterLastname() {
		
		return driver.findElement(Lastname);
	}

public WebElement Enteremail() {
	
	return driver.findElement(Email);
}


public WebElement EnterTelephone() {
	
	return driver.findElement(Telephone);
}

public WebElement EnterPassword() {
	
	return driver.findElement(Password);
}

public WebElement EnterPasswordconfirm() {
	
	return driver.findElement(ConfirmPassword);
	

}


public WebElement policy() {
	
	return driver.findElement(Privacypolicy);
	

}

public WebElement Continue() {
	
	return driver.findElement(Continue);
	

} 
public WebElement getConfirmregistrationtext() {
	
	return driver.findElement(Registrationconfirm);
	

}

public WebElement warningmsgfirstname() {
	
	return driver.findElement(warningerrorfirstname);
	

}

public WebElement warningmsgLastname() {
	
	return driver.findElement(warningerrorlastname);
	

}



public WebElement warningmsgemail() {
	
	return driver.findElement(warningerroremail);
	

}



public WebElement warningmsgtelephone() {
	
	return driver.findElement(warningerrortelephone);
	

}



public WebElement warningmsgpassword() {
	
	return driver.findElement(warningerrorpassword);
	

}




}
