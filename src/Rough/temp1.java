package Rough;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class temp1 {

	
		public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.racknap.com/en-in/contact-us");//to open the url in browser
		
//		Select slect=new Select(driver.findElement(By.id("fruits")));//Second way to wrok with drop-downs.
//		//slect.selectByVisibleText("2 years at 139/month");
//		//slect.selectByIndex(4);
//		slect.selectByVisibleText("Banana");
//		List<WebElement> h=slect.getOptions();
//		System.out.println(h.size());
//		System.out.println(slect.getFirstSelectedOption());
		
		//driver.findElement(By.cssSelector("#name")).sendKeys("hello");
		driver.findElement(By.cssSelector("#contact_no")).sendKeys("87989799");
		driver.findElement(By.cssSelector("input#name.input-round.big-input")).sendKeys("hello");
		}
}
