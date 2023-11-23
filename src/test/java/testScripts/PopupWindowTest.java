package testScripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupWindowTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://stqatools.com/demo/Windows.php");
		String parentWin = driver.getWindowHandle();
//		System.out.println("Parent window:"+parentWin);
		
		WebElement firstbutton = driver.findElement(By.xpath("//button[contains(text(),' Click to open new Tab ')]"));
		firstbutton.click();
//		System.out.println("Title of parent window:"+driver.getTitle());
		Set <String> tabs= driver.getWindowHandles();
		for (String child:tabs)
		{
			System.out.println("Windows:"+child);
			if(!child.equalsIgnoreCase(parentWin))
			{
				driver.switchTo().window(child);
				System.out.println("Title of child window:"+ driver.getTitle());
				
				driver.findElement(By.xpath("(//span[contains(text(),'Java')])[1]")).click();
				
			}
			
		}
		driver.close();
		driver.switchTo().window(parentWin);
		System.out.println("parent title"+driver.getTitle());
		driver.findElement(By.xpath("//button[contains(text(),'new Window')]"));
		
		//Opening new window in new tab/window
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");
		
		
		
		
		

	}

}
