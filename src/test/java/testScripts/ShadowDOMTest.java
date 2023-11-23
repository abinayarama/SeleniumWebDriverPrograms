package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOMTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://watir.com/examples/shadow_dom.html");
		
		WebElement shadowhost = driver.findElement(By.cssSelector("div#shadow_host"));
		SearchContext context=shadowhost.getShadowRoot();
		WebElement shadowcontent = context.findElement(By.cssSelector("span#shadow_content"));
		System.out.println("Shadow DOM content:"+shadowcontent.getText());
		
		WebElement nestedshadowhost = context.findElement(By.cssSelector("div#nested_shadow_host"));
		SearchContext context2 = nestedshadowhost.getShadowRoot();
		WebElement content2=context2.findElement(By.cssSelector("div#nested_shadow_content"));
		System.out.println("Shadow DOM content:"+content2.getText());
		
//		WebElement content3 = context.findElement(By.xpath("//div[@id='nested_shadow_host']//input[2]"));
//		System.out.println("Shadow DOM content:"+content3.getText());
		//Cannot access shadow DOM elements via regular driver.
//		WebElement content = driver.findElement(By.cssSelector("span#shadow_content"));
//		System.out.println("Shadow DOM content via driver:"+content.getText());

	}

}
