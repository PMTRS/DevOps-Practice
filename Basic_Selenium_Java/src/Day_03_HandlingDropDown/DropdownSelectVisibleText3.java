package Day_03_HandlingDropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSelectVisibleText3 {

	public static void main(String[] args) throws InterruptedException {

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

		driver.switchTo().frame(0); // Moving into the frame based on Index.

		WebElement dd = driver.findElement(By.id("loc_code"));// webElement

		List<WebElement> ddvalues = dd.findElements(By.tagName("option")); // list of webElement

		/*
		 * int totalelements = ddvalues.size(); // List of WebElements Size //
		 * System.out.println(totalelements); // Print WebElements total list
		 * 
		 * for (int i = 0; i < totalelements; i++) { //
		 * System.out.println(ddvalues.get(i)); // printing address values
		 * System.out.println(ddvalues.get(i).getText()); // Printing Values }
		 * 
		 * driver.switchTo().defaultContent();// Coming out of any frame
		 * 
		 * String checktext =
		 * driver.findElement(By.xpath("//*[@id=\"option-menu\"]/li[1]")).getText(); //
		 * using Loading currect or not
		 * 
		 * System.out.println(checktext);// Print Value
		 */
		
		Select s = new Select(dd); // add webelement reference
		
		Thread.sleep(3000); // 3 sec will slow selection process
		
		s.selectByValue("6"); // Value Should be select in string  ex 1,2,3,4,5,10,-...etc.
		
	}

}
