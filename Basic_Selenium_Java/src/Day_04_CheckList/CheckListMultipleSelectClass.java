package Day_04_CheckList;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckListMultipleSelectClass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM TOOLS\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("E:\\TESTING\\5 SELENIUM\\TELUGU SELENIUM WITH JAVA\\SEL TEL JAVA  FULL COU VID WITH NOTES 2022 BATCH AMT_2022\\4 Basic Selenium\\WebElements\\countrydropdown.html");
		
		WebElement CheckList = driver.findElement(By.id("country"));
		
		List<WebElement> CheckValues = driver.findElements(By.tagName("option"));
		
		int count = CheckValues.size();
		
		//System.out.println(count);
		
		Select S = new Select(CheckList);
		
		/*
		 * S.selectByIndex(1); S.selectByIndex(2); S.selectByIndex(3);
		 * S.selectByIndex(4);
		 */
		for (int i=0; i<=count; i++)
		{
			if(CheckValues.get(i).getText().startsWith("An")) 
			{
				System.out.println(i);
				S.selectByIndex(i);
				Thread.sleep(300);
			}
			
		}
	}

}
