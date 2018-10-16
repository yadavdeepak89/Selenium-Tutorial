package mousehover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehoverfirst {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("wedriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		WebElement ele=driver.findElement(By.xpath("html/body/div[1]/header/div/div[3]/div[1]/div[2]/a/span[1]"));
		
		
		Actions act=new Actions(driver);
		act.moveToElement(ele).build().perform();
		Thread.sleep(3000);
		
		act.moveToElement(driver.findElement(By.xpath("html/body/div[1]/header/div/div[1]/div[4]/div[4]/div[2]/span[1]/span"))).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("html/body/div[1]/header/div/div[1]/div[4]/div[4]/div[3]/div[1]/div[1]/div/a[1]/span[1]")).click();
		Thread.sleep(5000);
		
	}
	
	
}
