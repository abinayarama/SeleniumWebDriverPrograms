package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FramesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		
		//from mainpage to frame 1
		driver.switchTo().frame("frame1");
		WebElement inputbox = driver.findElement(By.xpath("//input[@type='text']"));
		inputbox.sendKeys("Welcome to the page");
		
		//from frame 1 to frame 3
		//Frame 3 is first in frame 1
		//Index of frame3 is 0
		driver.switchTo().frame("frame3");
		driver.findElement(By.id("a")).click();
		
		//from frame 3 to frame 1
		driver.switchTo().parentFrame();
		//To clear the text box
		inputbox.clear();
		inputbox.sendKeys("Welcome Back");
		
		//from frame 1 to mainpage : We can switch from any frames to mainpage
		driver.switchTo().defaultContent();
		WebElement title=driver.findElement(By.xpath("//label"));
		System.out.println(title.getText());
		
		//from mainpage to frame 2
		//Frame 2 is second frame in mainpage
		//Index of frame 2 is 1
		driver.switchTo().frame("frame2");
		Select drop = new Select(driver.findElement(By.id("animals")));
		drop.selectByIndex(1);
		
		

	}

}
