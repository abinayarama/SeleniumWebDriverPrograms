package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserVersionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		options.setBrowserVersion("115");
		WebDriver driver = new ChromeDriver(options);
		
		

	}

}
