package Rough;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("wedriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.znetlive.com/buy-domains/bulk-registrations/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("html/body/div[4]/div/form/div[2]/div/label[2]/input")).click();
		WebElement elenew=driver.findElement(By.xpath("html/body/div[4]/div/form/div[2]/div/div"));
		List<WebElement> ele=elenew.findElements(By.name("tlds[]"));
		int size =ele.size();
		System.out.println(size);
		for(int i=0;i<size;i++){
		ele.get(i).getText();
		ele.get(i).click();
			
		}
		/*System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().sendKeys("Test");
		*/
	
	
}
}