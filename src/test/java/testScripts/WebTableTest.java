package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/table-sort-search-demo.html");
		List <WebElement> names=driver.findElements(By.xpath("//td[contains(text(),'San Francisco')]//preceding-sibling::td[2]"));
		Thread.sleep(1000);
		System.out.println("Associates who works in San Francisco:");
		for (WebElement items:names)
		System.out.println(items.getText());
		System.out.println("Total number of associates:"+names.size());
		
		driver.close();

	}

}
