import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IDLocator {
	
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");//to open the url in browser
		/*driver.findElement(By.id("name")).sendKeys("er.yadav.deepak");
		driver.findElement(By.name("email")).sendKeys("hello");
		driver.findElement(By.linkText("What is RackNap?")).click();*/
//		driver.findElement(By.partialLinkText("High speed web hosting with SSD Caching")).click();
		driver.findElement(By.className("inputtext")).sendKeys("hello");
		
				
		
	}
	
}