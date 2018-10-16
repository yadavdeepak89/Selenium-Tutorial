package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frametest {

	
	public static void main(String[] args) {
		System.setProperty("wedriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");
		
		//move on Frame
		//driver.switchTo().frame(1);
		//driver.findElement(By.xpath("html/body/button")).click();
		//move on main window
		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.xpath("html/body/div[5]/div/span[2]/span")).getText());
		
		int frameNum=driver.findElements(By.tagName("iframe")).size();
		for(int i=0;i< frameNum;i++){
			driver.switchTo().frame(i);
			
			int elesize=driver.findElements(By.xpath("html/body/button")).size();
			if(elesize>0){
				
				driver.findElement(By.xpath("html/body/button")).click();
				break;
			}
			driver.switchTo().defaultContent();
		}
		
		
		
		
	}
}
