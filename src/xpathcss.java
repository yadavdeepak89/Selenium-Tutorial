import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//How to read xpath/css using browser tool.--- Done
// how to verify that xpath/css is correct.-Done
// create custome xpath/css 
//tagname
public class xpathcss {

public static void main(String[] args) {
	System.setProperty("wedriver.chrome.driver", "F:\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.findElement(By.cssSelector("input#email.inputtext")).sendKeys("hello");
	
}
}
