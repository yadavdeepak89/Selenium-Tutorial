package Rough;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testdropdwn {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("wedriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
			driver.get("https://www.znetlive.com/shared-hosting/");//to run the URL
			Thread.sleep(6000);
			/*driver.getTitle();////To get the title of that URL.
		//driver.findElement(By.xpath("//*[@id='lite_hosting']")).sendKeys("3 years at 1.39/month (36% off )");
			Select select=new Select(driver.findElement(By.xpath("//*[@id='lite_hosting']")));
			//select.selectByVisibleText("3 years at 1.39/month (36% off )");
			select.selectByValue("Biennially");*/
			//Getparticular block link
			/*WebElement dropdown=driver.findElement(By.xpath("html/body/div[6]/div/div/div[2]/div/ul"));
			List<WebElement> links=dropdown.findElements(By.tagName("a"));
			for(int  i=0;i<links.size();i++){
				System.out.println(links.get(i).getText());				
			}
			System.out.println();*/
			
			
			//WebElement dropdown=driver.findElement(By.xpath("html/body/div[6]/div/div/div[2]/div/ul"));
			List<WebElement> links=driver.findElements(By.tagName("a"));
			for(int  i=0;i<links.size();i++){
				System.out.println(links.get(i).getText());				
			}
			System.out.println(links.size());
	
		
	}
}
