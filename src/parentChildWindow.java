import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class parentChildWindow {
	
	
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		String parentID;
		driver.get("https://www.hdfcbank.com/");//to open the url in browser
		
		List<String> windowhandl=(List<String>) driver.getWindowHandles();
		Iterator<String> itr;
		
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[1]/div[3]/ul/li[1]/a")).click();
		//driver.findElement(By.xpath("html/body/div[4]/div[2]/div[1]/a")).click();
		
		windowhandl=(List<String>) driver.getWindowHandles();
		itr=windowhandl.iterator();
		parentID=itr.next();
		System.out.println(parentID);
		String childID=itr.next();
		System.out.println(childID);
		
		driver.switchTo().window(childID);
		driver.close();
		driver.switchTo().window(parentID);
		driver.close();
		
		
		
		
	}
		

}
