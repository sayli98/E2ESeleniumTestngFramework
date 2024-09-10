package Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class Baseclass {

	public static WebDriver driver;
	
	public Properties prop;
	
	public static String emailaddress = UniqueemailAddress();

	public void browserLaunch() throws IOException {

		// Read the data.properties

		FileInputStream fis = new FileInputStream(System.getProperty
				("user.dir")+"\\src\\main\\java\\Resources\\data.properties");

		// Object of properties class access the .properties file
		 prop = new Properties();

		prop.load(fis);

		String browsername = prop.getProperty("browser");

		if (browsername.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();
		} else if (browsername.equalsIgnoreCase("firefox")) {

			driver = new FirefoxDriver();

		} else if (browsername.equalsIgnoreCase("firefox")) {

			driver = new FirefoxDriver();

		} else {
			System.out.println("Please choose the correct browser");
		}
	}
	
	public static String UniqueemailAddress() {
		return System.currentTimeMillis()+ "@gmail.com";
	}
	
	
	
	//To capture the screenshot
		public static String screenShot(WebDriver driver, String filename)  {
			String dateAndTime = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
			// 202408311143

			File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			String destination = System.getProperty("user.dir") + "\\ScreenShot\\" + filename + "_" + dateAndTime + ".png";
		    try {
				FileUtils.copyFile(source, new File(destination));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return destination;
		}
		
		
		@BeforeSuite
		public void ExtentReport() {
			extentReport.setup();
		}
		
		@AfterSuite
		public void endReport() {
			extentReport.endReport();
		}
	
	@BeforeMethod
	public void launchbrowserandOpenURL  () throws IOException{
		browserLaunch();
		
		driver.get(prop.getProperty("url"));
	}
	
	@AfterMethod
	public void closeBrowser() throws IOException {
		 driver.quit();
	}
	
}
