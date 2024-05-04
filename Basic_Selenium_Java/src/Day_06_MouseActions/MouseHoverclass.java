package Day_06_MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverclass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM TOOLS\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/orangehrm-2.5.0.6/orangehrm-2.5.0.6/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("selenium");
		driver.findElement(By.name("txtPassword")).sendKeys("selenium");
		driver.findElement(By.name("Submit")).click();
		//driver.findElement(By.xpath("//*[@id="report"]/a/span"));
		
		Actions A = new Actions(driver);
		A.moveToElement(driver.findElement(By.xpath("//*[@id=\"report\"]/a/span"))).perform();
		driver.findElement(By.xpath("//*[@id=\"report\"]/ul/li[2]/a/span")).click();
		
	}
	

}
