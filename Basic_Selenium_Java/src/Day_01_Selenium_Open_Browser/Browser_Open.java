package Day_01_Selenium_Open_Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Open {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM TOOLS\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
			
		driver.manage().window().minimize();
		
		driver.get("https:www.google.com");

		driver.findElement(By.id("")).sendKeys("");// Priority 1
		driver.findElement(By.name("")).sendKeys("");// Priority 2
		driver.findElement(By.className("")).sendKeys("");// Priority 3
		driver.findElement(By.xpath("")).sendKeys("");// Priority 4
		driver.findElement(By.tagName("")).sendKeys("");// Priority 5
		driver.findElement(By.linkText("")).sendKeys("");// Priority 6
		driver.findElement(By.partialLinkText("")).sendKeys("");// Priority 7
		driver.findElement(By.cssSelector("")).sendKeys("");// Priority 8
	}

}
