package testScripts;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsTest {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		Actions actions=new Actions(driver);
//		driver.get("https://demo.opencart.com/");
//		WebElement searchbox = driver.findElement(By.name("search"));
//		actions.contextClick(searchbox).perform();
		
		
		
		driver.get("https://stqatools.com/demo/DoubleClick.php");
		Thread.sleep(5000);
		WebElement button = driver.findElement(By.xpath("//button[contains(text(),'Click Me / Double Click Me!')]"));
		//actions.doubleClick(button).perform();
		actions.doubleClick(button).doubleClick(button).build().perform();
		
		TakesScreenshot screen =  (TakesScreenshot)driver;
		File src = screen.getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+"/screenshots/"+"Fullpage"+".jpg";
		FileUtils.copyFile(src, new File(path));
		Thread.sleep(5000);
		WebElement image = driver.findElement(By.cssSelector("div.col-12.text-center"));

		actions.scrollToElement(image).perform();
		File src1 = screen.getScreenshotAs(OutputType.FILE);
		String path1 = System.getProperty("user.dir")+"/screenshots/"+System.currentTimeMillis()+".jpg";
		
		

	}

}
