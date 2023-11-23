package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTipTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		driver.get("https://jqueryui.com/tooltip/");
		
		driver.switchTo().frame("demo-frame");
		action.moveToElement(driver.findElement(By.id("age"))).perform();
		
		
		 ;
		
		
		

	}

}
