package Rough;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dynamicdropdown {

	
		public static void main(String[] args) {
			WebDriver driver= new ChromeDriver();
			/*driver.get("http://spicejet.com/");//to open the url in browser
			driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
			driver.findElement(By.xpath("//*[@id='dropdownGroup1']/div/ul[2]/li[3]/a")).click();
			driver.findElement(By.xpath("//*[@id='dropdownGroup1']/div/ul[2]/li[1]/a")).click();*/
			driver.get("https://www.makemytrip.com/flights?cmp=disp_DF_icubes_21296_");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("html/body/div[2]/div[3]/div[1]/section/div[2]/div[1]/input")).click();
			driver.findElement(By.xpath("html/body/div[2]/div[3]/div[3]/div/div[1]/ul[1]/li[5]/div/p[1]/span[1]")).click();
			driver.findElement(By.xpath("html/body/div[2]/div[3]/div[1]/section/div[2]/div[1]/input")).click();
			driver.findElement(By.xpath("(html/body/div[2]/div[3]/div[3]/div/div[2]/ul[1]/li[2]/div/p[1]/span[1])[2]")).click();
		
			
				}
	}	

