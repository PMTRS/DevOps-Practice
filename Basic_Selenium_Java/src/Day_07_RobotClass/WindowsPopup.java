package Day_07_RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsPopup {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		//System.setProperty("webdriver.chrome.driver","D:\\SELENIUM TOOLS\\Drivers\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.firefox.driver", "D:\\SELENIUM TOOLS\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/orangehrm-2.5.0.5/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("selenium");
		driver.findElement(By.name("txtPassword")).sendKeys("selenium");
		driver.findElement(By.name("Submit")).click();
		
		Actions A = new Actions(driver);
		
		A.moveToElement(driver.findElement(By.xpath("//*[@id=\"pim\"]/a/span"))).perform(); // PIM : Add Employee
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"pim\"]/ul/li[2]/a/span")).click();
		Thread.sleep(2000);
		
		driver.switchTo().frame(driver.findElement(By.id("rightMenu"))); // frame
		Thread.sleep(2000);
		
		driver.findElement(By.id("txtEmployeeId")).sendKeys("1000"); // Code
		Thread.sleep(2000);
		
		driver.findElement(By.id("txtEmpLastName")).sendKeys("Linux"); // Last Name
		Thread.sleep(2000);
		
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("Kurmar"); // First Name
		Thread.sleep(2000);
		
		driver.findElement(By.id("txtEmpMiddleName")).sendKeys("Kurmar"); // Middle Name
		Thread.sleep(2000);
		
		driver.findElement(By.id("txtEmpNickName")).sendKeys("luckay"); // Nick Name
		Thread.sleep(2000);
		
		A.moveToElement(driver.findElement(By.id("photofile"))).click().perform();
		Thread.sleep(2000);
		
		StringSelection S = new StringSelection("E:\\TESTING\\5 SELENIUM\\01) SELENIUM WITH JAVA WITH NOTES TELUGU\\SELENIUM TELUGU\\4 Basic Selenium\\NOTE\\IC.png");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(S,null);
		  
		  Robot ro = new Robot(); 
		  ro.keyPress(KeyEvent.VK_ENTER);
		  ro.keyRelease(KeyEvent.VK_ENTER);
		  Thread.sleep(2000);
		  
		  ro.keyPress(KeyEvent.VK_CONTROL); 
		  ro.keyPress(KeyEvent.VK_V);
		  Thread.sleep(2000);
		  
		  ro.keyRelease(KeyEvent.VK_CONTROL); 
		  ro.keyRelease(KeyEvent.VK_V);
		  Thread.sleep(2000);
		  
		  ro.keyPress(KeyEvent.VK_ENTER); 
		  ro.keyRelease(KeyEvent.VK_ENTER);
		 
		  driver.findElement(By.id("btnEdit")).click();	// Save
		  //driver.findElement(By.xpath("//*[@id=\"btnEdit\"]")).click(); 	// Save
		  
	}

}
