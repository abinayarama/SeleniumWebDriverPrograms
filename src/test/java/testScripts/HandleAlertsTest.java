package testScripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlertsTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");
		
//		driver.findElement(By.xpath("(//button[contains(text(),'Click me!')])[1]")).click();
//		Thread.sleep(5000);
//		Alert alert = driver.switchTo().alert();
//		System.out.println("Alert message:"+alert.getText());
//		alert.accept();
		
		//Handling confirmation alert
//		driver.findElement(By.xpath("(//button[contains(text(),'Click me!')])[2]")).click();
//		Thread.sleep(5000);
//		Alert confirm = driver.switchTo().alert();
//		System.out.println("Alert message:"+confirm.getText());
//		confirm.dismiss();
//		
		//Handling prompt alert
		driver.findElement(By.xpath("//button[contains(text(),'Click for Prompt Box')]")).click();
		Thread.sleep(5000);
		Alert prompt = driver.switchTo().alert();
		System.out.println("Alert message:"+prompt.getText());
		prompt.sendKeys("Welcome");
		prompt.accept();
		
		
		
		
		driver.close();
		
	}

}
