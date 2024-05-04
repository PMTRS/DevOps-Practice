package Day_02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Title {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM TOOLS\\Drivers\\chromedriver.exe" );
		
		WebDriver  driver = new ChromeDriver();
		
		driver.get("https://www.ubereats.com/");
		
		String hometitle = driver.getTitle();
		
		//System.out.println(hometitle);		// Home Title Print
		
		driver.manage().window().maximize();
		
		if(hometitle.equals("Uber Eats | Food Delivery and Takeout | Order Online from Restaurants Near You"))  
		{
			
			System.out.println("Home Title has been validated");
		}
		else
		{
			System.out.println("Incorrect Home Title");
		}
		
		
	}

}
