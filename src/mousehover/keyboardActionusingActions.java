package mousehover;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardActionusingActions {

	
	public static void main(String[] args) {
		System.setProperty("wedriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		WebElement ele=driver.findElement(By.xpath("html/body/div[1]/header/div/div[1]/div[3]/div/form/div[3]/div[1]/input"));
		
		
		Actions act=new Actions(driver);
		act.keyDown(ele, Keys.SHIFT).sendKeys("mouse").doubleClick().build().perform();
		
		
		
		
	}
}
