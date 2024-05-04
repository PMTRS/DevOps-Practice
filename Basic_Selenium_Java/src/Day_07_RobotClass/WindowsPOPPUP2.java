package Day_07_RobotClass;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowsPOPPUP2 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver","D:\\SELENIUM TOOLS\\Drivers\\chromedriver.exe");
		
		System.setProperty("webdriver.firefox.driver", "D:\\SELENIUM TOOLS\\Drivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://the-internet.herokuapp.com/basic_auth");
		
		Robot ro = new Robot();
	
		ro.keyPress(KeyEvent.VK_A);
		ro.keyPress(KeyEvent.VK_D);
		ro.keyPress(KeyEvent.VK_M);
		ro.keyPress(KeyEvent.VK_I);
		ro.keyPress(KeyEvent.VK_N);
		
		ro.keyPress(KeyEvent.VK_TAB);
		
		ro.keyPress(KeyEvent.VK_A);
		ro.keyPress(KeyEvent.VK_D);
		ro.keyPress(KeyEvent.VK_M);
		ro.keyPress(KeyEvent.VK_I);
		ro.keyPress(KeyEvent.VK_N);
		
		Thread.sleep(2000);
		
		ro.keyPress(KeyEvent.VK_ENTER);
		ro.keyRelease(KeyEvent.VK_ENTER);
	}

}
