package DAY_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Basic_Selenium_WebDriver {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver","D:\\SELENIUM TOOLS\\Drivers\\chromedriver.exe");
		
		System.setProperty("webdriver.firefox.driver", "D:\\SELENIUM TOOLS\\Drivers\\geckodriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		//driver.manage().window().minimize();
		
		driver.get("http://localhost/orangehrm-2.5.0.5/login.php");
		
		driver.findElement(By.name("txtUserName")).sendKeys("selenium");// user Id 
			
		driver.findElement(By.name("txtPassword")).sendKeys("selenium");// Password
		
		driver.findElement(By.name("Submit")).click(); // Click on Login
		
		//driver.close();
		
		System.out.println("Yes Google Opened");
	}
}
