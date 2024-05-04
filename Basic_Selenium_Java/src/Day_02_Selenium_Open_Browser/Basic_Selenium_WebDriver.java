package Day_02_Selenium_Open_Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Selenium_WebDriver {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM TOOLS\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// driver.manage().window().minimize();

		driver.get("http://localhost/orangehrm-2.5.0.6/orangehrm-2.5.0.6/login.php");

		String hometitle = driver.getTitle(); // Using title
		// System.out.println(hometitle); // Print Home Title

		if (hometitle.equals("OrangeHRM - New Level of HR Management")) {
			System.out.println("Here Home Title is Validate");
		} else {
			System.out.println("Here Home Title Is not Valiadate");
		}

		driver.findElement(By.name("txtUserName")).sendKeys("selenium");// user Id

		driver.findElement(By.name("txtPassword")).sendKeys("selenium");// Password

		driver.findElement(By.name("Submit")).click(); // Click on Login

		String logintitle = driver.getTitle(); // Login Title
		System.out.println(logintitle); // Print Title

		if (logintitle.equals("OrangeHRM")) {
			System.out.println("Here Login Title is Validate");
		} else {
			System.out.println("Here Login Title is Not Validate");
		}

		String checktext = driver.findElement(By.xpath("//*[@id=\"option-menu\"]/li[1]")).getText(); //using Loading currect or not
		// System.out.println(checktext);// Print Value

		if (checktext.equals("Welcome selenium")) {
			System.out.println("Here Login Page Loaded Succesfully");
		} else {
			System.out.println("Here Login Page Not Loaded Succesfully");
		}
		
		//driver.close();// It Close Current Pages
		driver.quit(); // It Close all Pages

		System.out.println("Yes Google Opened");

	}

}
