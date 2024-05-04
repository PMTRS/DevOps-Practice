package Day_06_KeyboardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoard1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM TOOLS\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("CricketScore");
		
		Actions Act = new Actions(driver);
		
		Act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		
		Act.keyDown(Keys.DELETE).keyUp(Keys.DELETE).perform();
		
		Act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		Thread.sleep(2000);
		
		Act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		Thread.sleep(4000);
		
		Act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		Thread.sleep(5000);
		
		Act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		Thread.sleep(6000);
		
		Act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		Thread.sleep(7000);
		
		Act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		Thread.sleep(7000);
		Act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
	}

}
