package Day_04_RadioButton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM TOOLS\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("E:\\TESTING\\5 SELENIUM\\TELUGU SELENIUM WITH JAVA\\SEL TEL JAVA  FULL COU VID WITH NOTES 2022 BATCH AMT_2022\\4 Basic Selenium\\WebElements\\RadioButtons.html");
		
		driver.findElement(By.xpath("/html/body/label[3]/span")).click();
	}

}
