package Day_04_HyperLink;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLinkClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM TOOLS\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("E:\\TESTING\\5 SELENIUM\\TELUGU SELENIUM WITH JAVA\\SEL TEL JAVA  FULL COU VID WITH NOTES 2022 BATCH AMT_2022\\4 Basic Selenium\\WebElements\\HyderLinks.html");
		
		List<WebElement> HyberLinks = driver.findElements(By.tagName("a"));
		
		System.out.println(HyberLinks.size());
		
		driver.findElement(By.xpath("/html/body/a[2]")).click();
		driver.findElement(By.xpath("/html/body/a[1]")).click();
		driver.findElement(By.xpath("/html/body/a[3]")).click();
	}

}
