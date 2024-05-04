package Day_02;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_account {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM TOOLS\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.ubereats.com/");
		
		String Hometitle = driver.getTitle();		// Home Page Title
		
		System.out.println(Hometitle);
		
		String Logtitle = driver.getTitle();
		
		System.out.println(Logtitle);
		
		//driver.findElement(By.className("")).sendKeys("da fp fq");
		
		//driver.findElement(By.xpath("//*[@id=\"wrapper\"]/header/div/div/div/div/div/div/div[3]/div/a[1]")).click();
		
		driver.findElement(By.name(Logtitle)).sendKeys(args);
		
		String hometitle = driver.getTitle();
		
		if(hometitle.equals(hometitle))
		{
			System.out.println("Here Home Title has been validated");
		}
		else
		{
			System.out.println("Here Incorrect HomeTitle");
		}
		
		String logtitle = driver.getTitle();
		
		if(logtitle.equals(logtitle)) 
		{
			System.out.println("Here Log Title is Validated");
		}
		else
		{
			System.out.println("Here Incorrect Log Title");
		}
		
		String Checktext = driver.findElement(By.xpath("")).getText();
		
		System.out.println(Checktext); // Login page Loaded
		
		if(Checktext.equals("Welcome Selenium"))
		{
			System.out.println("Here Login Page successfully loaded");
		}
		else
		{
			System.out.println("Here Page not loaded");
		}
		
	}
}
