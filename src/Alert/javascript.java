package Alert;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascript {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("wedriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://cssi01mstrjqy26prep.dxcloud.episerver.net/");
		//driver.findElement(By.xpath("html/body/div[1]/section/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div[2]/span[1]/input[2]")).click();
		Thread.sleep(6000);
		
		/*driver.switchTo().alert().accept();   //ok
		driver.switchTo().alert().dismiss();	//cancel
		driver.switchTo().alert().getText();
		driver.switchTo().alert().sendKeys("Hello");*/
		
	/*	Alert alert=driver.switchTo().alert();
		alert.accept();
		alert.dismiss();
		alert.getText();*/
		driver.findElement(By.xpath("html/body/div[7]/div[2]/div/div/button")).click();
		/*WebElement popupwindow = driver.findElement(By.cssSelector(".sign-up-popup__bottom-line"));
		if (popupwindow.isDisplayed()) {
		System.out.println("The sign up popup window displayed");

		            WebElement close = driver.findElement(By.xpath("//button[text()='sign-up-popup__close']"));
		            close.click();
		            System.out.println("Closed the signup popup window");           
		            }*/
		
		
	}

}
