package Rough;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class mousehover {
	
	public static void main(String[] args) {
		System.setProperty("wedriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
			driver.get("https://www.amazon.in/");//to run the URL
			Actions act=new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath("html/body/div[1]/header/div/div/div/div[1]/div[1]/a"))).contextClick().build().perform();
			//act.moveToElement(driver.findElement(By.xpath("html/body/div[1]/header/div/div/div/div[3]/div/form/div[3]/div[1]/input"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
			act.moveToElement(driver.findElement(By.xpath("html/body/div[1]/header/div/div/div/div[3]/div/form/div[3]/div[1]/input"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
			
	}
	

}
