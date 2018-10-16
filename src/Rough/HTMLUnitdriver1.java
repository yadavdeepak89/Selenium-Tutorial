package Rough;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HTMLUnitdriver1 {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.Gmail.com");
		driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.54904237.760016572.1532747473-1441613747.1532747473");//to open the url in browser
		int fsize=driver.findElements(By.tagName("frame")).size();
		driver.switchTo().frame(0);

		driver.findElement(By.xpath("html/body/form/table[2]/tbody/tr/td[2]/table/tbody/tr[1]/td[1]/table/tbody/tr[3]/td[2]/table/tbody/tr[2]/td[2]/span/input")).sendKeys("HDFC  Bank");
			System.out.println("Element found");
		System.out.println(fsize);

/*for(int i=1;i<=fsize;i++){
	
	driver.switchTo().frame(i);
	if(driver.findElements(By.xpath("html/body/form/table[2]/tbody/tr/td[2]/table/tbody/tr[1]/td[1]/table/tbody/tr[3]/td[2]/table/tbody/tr[2]/td[2]/span/input")).size()>0){
		
		driver.findElement(By.xpath("html/body/form/table[2]/tbody/tr/td[2]/table/tbody/tr[1]/td[1]/table/tbody/tr[3]/td[2]/table/tbody/tr[2]/td[2]/span/input")).sendKeys("HDFC  Bank");
		System.out.println("Element found");
		
	}
}*/
//driver.switchTo().frame("login_page");
		//driver.findElement(By.xpath("html/body/form/table[2]/tbody/tr/td[2]/table/tbody/tr[1]/td[1]/table/tbody/tr[3]/td[2]/table/tbody/tr[2]/td[2]/span/input")).sendKeys("HDFC  Bank");
		System.out.println("Text has been entered into the search filed.");
		//driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[1]/div[3]/ul/li[1]/a")).click();
		System.out.println("Clicked on the element");
	}

}
