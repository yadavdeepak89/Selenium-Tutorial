package Rough;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScriptExcecutionMouseHover {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("wedriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
			/*driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");//to run the URL
			driver.switchTo().frame("iframeResult");
			Thread.sleep(3000);
			
			((JavascriptExecutor)driver).executeScript("myFunction()");*/
		driver.get("https://www.firstcry.com/");
		driver.manage().window().maximize();
		//driver.switchTo().frame("");
		driver.findElement(By.name("Email")).sendKeys("Test");
	}
}
