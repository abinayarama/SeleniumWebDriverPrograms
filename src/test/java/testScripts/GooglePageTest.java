package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePageTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		WebElement searchbox = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		searchbox.sendKeys("java tutorial");
		Thread.sleep(2000);
		List <WebElement> suggestedlist = driver.findElements(By.xpath("//ul[@class='G43f7e']//li//descendant::div[@class='wM6W7d']"));
		System.out.println("Total list count:"+suggestedlist.size());
//		for (WebElement totallist:suggestedlist)
//			System.out.println(totallist.getText());
		
		for (int i=0;i< suggestedlist.size();i++)
		{
			
		System.out.println(suggestedlist.get(i).getText());
		
		if(suggestedlist.get(i).getText().equalsIgnoreCase("java tutorial tutorialspoint")) 
		{
			suggestedlist.get(i).click();
			Thread.sleep(1000);
			break;
		}}
		driver.close();

	}

}
