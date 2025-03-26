package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Baseclass {
	
	public WebDriver driver;
	
	public Properties prop;
	
	public static String emailaddress= Uniqueemailaddress();
	
	public void browserlaunch() throws IOException {
		
		//Read the file/data
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties");
		
		//access the properties file---object of the properties class
		 prop =new Properties();
		
		prop.load(fis);
		
		String browsername=prop.getProperty("browser");
		
		if(browsername.equalsIgnoreCase("chrome")) {
			
			driver= new ChromeDriver();
			
		}else if(browsername.equalsIgnoreCase("firefox")) {
			
			driver= new FirefoxDriver();
			
		}else if(browsername.equalsIgnoreCase("edge")) {
			
			driver= new EdgeDriver();
			
		}else {
			
			System.out.println("please choose the correct browser");
		}
		
			
			
		
		
	}
	
	
	public static String Uniqueemailaddress() {
		
		
		return System.currentTimeMillis()+ "@gmail.com";
		
		
		
		
				
		
		
		
	}
	
	@BeforeMethod
	public void launchbrowserandopenURL() throws IOException {
		
		browserlaunch();
		
		driver.get(prop.getProperty("url"));
		
	}
	
	@AfterMethod
	public void closebrowser() {
		
		driver.quit();
		
		
	}

}


