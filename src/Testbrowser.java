import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testbrowser {
	
	public static void main(String[] args) {
		
	//System.setProperty("wedriver.chrome.driver", "F:\\chromedriver.exe");
		//FirefoxDriver h=new FirefoxDriver();
		WebDriver driver= new ChromeDriver();
		driver.get("https://gmail.com");//to open the url in browser
		System.out.println(driver.getTitle());//To validate the title.
		System.out.println(driver.getCurrentUrl());
		
	/*WebElement	element=driver.findElement(By.xpath("//input[@type='email']"));
	element.sendKeys("Test");//send keys used for fill the val
	element.click();*/
		//driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ljdklfjkldjfldjfdsjlf");
		
		
		
		 
	
		
	
				
		
	
	}
	
}
