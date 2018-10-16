package Rough;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDlocator {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("wedriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
			driver.get("http://www.racknap.com/en-in/book-a-demo");//to run the URL
			driver.manage().window().maximize();
			//driver.findElement(By.xpath("html/body/div[1]/div/div/div[1]/ul/li[2]/a")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("name")).sendKeys("dffsfsfd");
			driver.findElement(By.className("input-round big-input")).sendKeys("ddsdsdsdseieiei");
			//driver.findElement(By.className("email")).sendKeys("bnt-gradient");
			
	}
}
