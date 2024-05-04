package Day_01_Selenium_Open_Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Selenium_WebDriver {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM TOOLS\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().window().minimize();
		
		driver.get("http://localhost/orangehrm-2.5.0.6/orangehrm-2.5.0.6/login.php");
		
		driver.findElement(By.name("txtUserName")).sendKeys("selenium");// user Id 
			
		driver.findElement(By.name("txtPassword")).sendKeys("selenium");// Password
		
		driver.findElement(By.name("Submit")).click(); // Click on Login
		
		driver.close();
		
		System.out.println("Yes Google Opened");
	}
}
