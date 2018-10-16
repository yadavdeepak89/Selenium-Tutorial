package checkboxAndRadiobutton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	
	public static void main(String[] args) {
		System.setProperty("wedriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.znetlive.com/order/hosting.php?id=MTQ1MA==&billingcycle=RGVjZW5uaWFs");
		Thread.sleep(5000);
		//How to handle with check box & isSelected()
		/*driver.findElement(By.xpath("html/body/div[4]/div/form/div[2]/div/label[2]/input")).click();
		System.out.println(driver.findElement(By.xpath("html/body/div[4]/div/form/div[2]/div/div/div[4]/input")).isSelected());
		driver.findElement(By.xpath("html/body/div[4]/div/form/div[2]/div/div/div[4]/input")).click();
		System.out.println(driver.findElement(By.xpath("html/body/div[4]/div/form/div[2]/div/div/div[4]/input")).isSelected());*/
		
		
		//WORK WITH RADIO BUTTONS
		System.out.println(driver.findElement(By.id("fourth")).isSelected();
		System.out.println(driver.findElement(By.id("fourth")).getAttribute("checked");
		driver.findElement(By.id("fourth")).click();
		System.out.println(driver.findElement(By.id("fourth")).isSelected());
		System.out.println(driver.findElement(By.id("fourth")).getAttribute("checked"));
		/*System.out.println(driver.findElement(By.xpath("html/body/div[4]/div/form/div[2]/div/div/div[4]/input")).isSelected());
		driver.findElement(By.xpath("html/body/div[4]/div/form/div[2]/div/div/div[4]/input")).click();
		System.out.println(driver.findElement(By.xpath("html/body/div[4]/div/form/div[2]/div/div/div[4]/input")).isSelected());*/
	}
}
