package Day_06_MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM TOOLS\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		Actions A = new Actions(driver);
		
		WebElement Drag = driver.findElement(By.id("draggable"));
		
		WebElement Drop = driver.findElement(By.id("droppable"));
		
		A.dragAndDrop(Drag, Drop).perform();

	}

}
