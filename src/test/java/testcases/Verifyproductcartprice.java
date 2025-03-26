package testcases;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifyproductcartprice {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver(); // 123

		driver.get("https://naveenautomationlabs.com/opencart/");

		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("iphone");

		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();

		WebElement obj = driver.findElement(By.xpath("//p[@class='price']"));

		String iphonecost = obj.getText();

		System.out.println(iphonecost);

		String[] spl = iphonecost.split(" ");

		System.out.println(Arrays.toString(spl));

		System.out.println(spl[0]);

		System.out.println("==========================================================");

		String Stringiphonecost = spl[0].replaceAll("[^0-9\\.]", "");

		System.out.println(Stringiphonecost);

		Double fiphonecost = Double.parseDouble(Stringiphonecost);

		System.out.println(fiphonecost);

		driver.findElement(By.xpath("(//i[@class='fa fa-shopping-cart'])[3]")).click();

		// SAMSUNG CODE
		System.out.println(
				"============================================================================================");

		driver.findElement(By.xpath("//input[@placeholder='Search']")).clear();

		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("samsung");

		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();

		WebElement obj2 = driver.findElement(By.xpath("(//p[@class='price'])[1]"));

		String samsungcost = obj2.getText();

		System.out.println(samsungcost);

		String[] splS = samsungcost.split(" ");

		System.out.println(Arrays.toString(splS));

		System.out.println(splS[0]);

		System.out.println("============================================================================================");

		String StringSScost = splS[0].replaceAll("[^0-9\\.]", "");

		System.out.println(StringSScost);

		Double finalSScost = Double.parseDouble(StringSScost);

		System.out.println(finalSScost);

		driver.findElement(By.xpath("(//i[@class='fa fa-shopping-cart'])[4]")).click();

		System.out.println(
				"============================================================================================");

		Double Totalamount = fiphonecost + finalSScost;

		System.out.println(Totalamount);

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//i[@class='fa fa-shopping-cart'])[2]")).click();

		System.out.println("============================================================================================");

		WebElement obj3 = driver.findElement(By.xpath("//td[text()='$365.20']"));

		String cartamount = obj3.getText();

		System.out.println(cartamount);
		
		System.out.println("============================================================================================");

		String StringTcartamount = cartamount.replaceAll("[^0-9\\.]", "");

		System.out.println(StringTcartamount);
		
		System.out.println("============================================================================================");
		
		Double Tcartamount= Double.parseDouble(StringTcartamount);
		
		if (Totalamount.equals(Tcartamount)) {
	    	   System.out.println("amount matching sucessfully");
	       }else {
	    	   System.out.println("amount not matching sucessfully");
	       }
		
		
		driver.findElement(By.xpath("(//i[@class='fa fa-shopping-cart'])[3]")).click();
	       

	}
}
