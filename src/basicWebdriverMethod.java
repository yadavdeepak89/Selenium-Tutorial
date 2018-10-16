import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class basicWebdriverMethod {
	
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://gmail.com");//to open the url in browser
		System.out.println(driver.getTitle());//To validate the title.
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		driver.get("https://in.yahoo.com/?p=us");
		
		
		driver.navigate().back();
		driver.close();//Close the browser.
		driver.quit();//will close all the browser which opendde by selenium.
		
		
		
	}
	

}
