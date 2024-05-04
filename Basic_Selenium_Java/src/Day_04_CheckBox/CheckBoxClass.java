package Day_04_CheckBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckBoxClass {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM TOOLS\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(); 
	driver.manage().window().maximize();
	driver.get("E:\\TESTING\\5 SELENIUM\\TELUGU SELENIUM WITH JAVA\\SEL TEL JAVA  FULL COU VID WITH NOTES 2022 BATCH AMT_2022\\4 Basic Selenium\\WebElements\\CheckBox.html");
	
	  driver.findElement(By.xpath("/html/body/div/label[5]/input")).click();
	  driver.findElement(By.xpath("/html/body/div/label[2]/input")).click();
	  driver.findElement(By.xpath("/html/body/div/label[3]/input")).click();
	  driver.findElement(By.xpath("/html/body/div/label[6]/input")).click();
	  driver.findElement(By.xpath("/html/body/div/label[1]/input")).click();
	  driver.findElement(By.xpath("/html/body/div/label[4]/input")).click();
	  driver.findElement(By.xpath("/html/body/div/label[7]/input")).click();
	  
	  driver.findElement(By.xpath("/html/body/div/label[5]/input")).click();
	  driver.findElement(By.xpath("/html/body/div/label[2]/input")).click();
	  driver.findElement(By.xpath("/html/body/div/label[3]/input")).click();
	  driver.findElement(By.xpath("/html/body/div/label[6]/input")).click();
	  driver.findElement(By.xpath("/html/body/div/label[1]/input")).click();
	  driver.findElement(By.xpath("/html/body/div/label[4]/input")).click();
	  driver.findElement(By.xpath("/html/body/div/label[7]/input")).click();
	 
	/*
	 * List<WebElement>CheckBox = driver.findElements(By.tagName("span"));
	 * 
	 * int count= CheckBox.size();
	 * 
	 * Select S = new Select((WebElement) CheckBox);
	 * 
	 * for (int i=0; i<count; i++) { System.out.println(i); S.selectByIndex(count);
	 * }
	 */
	
	}

}
