package testScripts;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HideImageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		//Method 1
		//options.addArguments("blink-settings=imagesEnabled=False");
		//Method 2
		Map<String, Object>  imgpref =new HashMap <String, Object>();
		imgpref.put("profile.managed_default_content_settings.images", 2);
		options.setExperimentalOption("prefs", imgpref);
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.opencart.com/index.php?route=cms/demo");
		
		
	}

}
