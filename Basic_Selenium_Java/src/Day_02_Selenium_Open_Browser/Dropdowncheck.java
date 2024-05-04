package Day_02_Selenium_Open_Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdowncheck {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM TOOLS\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("http://localhost/orangehrm-2.5.0.6/orangehrm-2.5.0.6/login.php");

		String hometitle = driver.getTitle(); // Using title
		
		if (hometitle.equals("OrangeHRM - New Level of HR Management")) {
			System.out.println("Here Home Title is Validate");
		} else {
			System.out.println("Here Home Title Is not Valiadate");
		}

		driver.findElement(By.name("txtUserName")).sendKeys("selenium");// user Id

		driver.findElement(By.name("txtPassword")).sendKeys("selenium");// Password

		driver.findElement(By.name("Submit")).click(); // Click on Login

		driver.findElement(By.id("loc_code"));	// its in Frame we need to now Handling Frame

	}

}
