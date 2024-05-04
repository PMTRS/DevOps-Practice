package Day_06_WebHandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windowscheck {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","D:\\SELENIUM TOOLS\\Drivers\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://localhost/orangehrm-2.5.0.6/orangehrm-2.5.0.6/login.php");
		
		 System.out.println("After Launhing Home Page Title is :" +driver.getTitle());
		
		 driver.findElement(By.linkText("OrangeHRM")).click();
		
		 System.out.println("After Clicking on Link Title is : "+driver.getTitle());
		
		 //driver.close(); //it close Current Page Parent 
		
		 Set<String> TotalWindows = driver.getWindowHandles();
		
		 System.out.println(TotalWindows.size());
		
		 List<String> listwindows = new ArrayList<String>(TotalWindows);
		
		 driver.switchTo().window(listwindows.get(0)); //it Nagavitate to Parent windows
		 System.out.println(listwindows.get(0));
		 System.out.println(driver.getTitle());
		 System.out.println("1");
		 
	
		 driver.switchTo().window(listwindows.get(1)); //it Nagavitate to Child Windows 
		 System.out.println(listwindows.get(1));
		 System.out.println(driver.getTitle());
		 System.out.println("2");
		 
		 Actions A = new Actions(driver);
		 
		 A.moveToElement(driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[1]/a"))).perform();
		 Thread.sleep(2200);
		 driver.switchTo().window(listwindows.get(0));
		 System.out.println(listwindows.get(0));
		 System.out.println(driver.getTitle());
		 System.out.println("3");
		 
		 driver.findElement(By.name("txtUserName")).sendKeys("selenium");
		 driver.findElement(By.name("txtPassword")).sendKeys("selenium");
		 driver.findElement(By.name("Submit")).click();
		 driver.findElement(By.linkText("Logout")).click();
		
	}

}
