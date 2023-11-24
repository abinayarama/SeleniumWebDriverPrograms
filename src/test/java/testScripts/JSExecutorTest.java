package testScripts;

import javax.swing.text.Document;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.opencart.com/");
		
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		String strtitle = (String)js.executeScript("return document.title");
		System.out.println(strtitle);
		
		 

	}

}
