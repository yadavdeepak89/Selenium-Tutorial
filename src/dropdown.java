import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.znetlive.com/shared-hosting/");//to open the url in browser
		// First way to work wth the drop down.
		
		//driver.findElement(By.xpath("html/body/div[3]/div/div/form[1]/div/div/div[2]/select")).sendKeys("5 years at 89/month (36% off )");
		
		Select slect=new Select(driver.findElement(By.xpath("html/body/div[3]/div/div/form[1]/div/div/div[2]/select")));//Second way to wrok with drop-downs.
		//slect.selectByVisibleText("2 years at 139/month");
		slect.selectByIndex(4);
		List<WebElement> h=slect.getOptions();
		System.out.println(h.size());
		System.out.println(slect.getFirstSelectedOption());
		
	
		
}
}
