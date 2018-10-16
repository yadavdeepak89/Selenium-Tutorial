package Rough;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childwindow {
	
	public static void main(String[] args) {
		System.setProperty("wedriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.hdfcbank.com/");
		//move on Frame
		
		//driver.findElement(By.xpath("//*[@id='div-close']")).click();
	
		driver.findElement(By.xpath("//*[@id='loginsubmit']")).click();
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> itr=ids.iterator();
		String pwindow=itr.next();
		String cwindow=itr.next();
		
		System.out.println(driver.getTitle());
		
		//move on main window
		driver.switchTo().window(cwindow);
		System.out.println(driver.getTitle());
		
		
	}

}
