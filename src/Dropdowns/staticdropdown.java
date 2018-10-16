package Dropdowns;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class staticdropdown {

	public static void main(String[] args) {
		System.setProperty("wedriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//Test
		driver.get("https://www.znetlive.com/shared-hosting/");
		WebElement ele=driver.findElement(By.xpath("html/body/div[3]/div/div/form[1]/div/div/div[2]/select"));
		//ele.sendKeys("2 years at 2.14/month (1% off )");
	
		/*driver.findElement(By.xpath("html/body/div[3]/div/div/form[1]/div/div/div[2]/select")).sendKeys("2 years at 2.14/month (1% off )");
		System.out.println(driver.getCurrentUrl());
		Select abc =new Select(driver.findElement(By.xpath("html/body/div[3]/div/div/form[1]/div/div/div[2]/select")));
		//abc.selectByValue("Decennial");
		//abc.selectByVisibleText("10 years at 0.74/month (66% off )");
		abc.selectByIndex(4);
		List<WebElement> list=abc.getOptions();
		System.out.println(list.size());*/
		Select select=new Select(ele);
		select.selectByVisibleText("2 years at 139/month ");
		select.selectByIndex(1);
		select.selectByValue("Biennially");
		
		//Get all the drop down using get option method:
	/*	List<WebElement> dropdownOption=select.getOptions();
		int dropsize=dropdownOption.size();
		System.out.println("Size of drop down"+dropsize);
		
		for(int i=0;i<dropsize;i++){
			String str=dropdownOption.get(i).getText();
		
			System.out.println(dropdownOption.get(i).getAttribute("value"));
		}*/
		
		//Get all the dropdown values using own logics
		//WebElement dropdownele=driver.findElement(By.xpath("html/body/div[3]/div/div/form[1]/div/div/div[2]/select"));
		
		/*List<WebElement> dropdownooption=dropdownele.findElements(By.tagName("option"));
		int dropsize=dropdownooption.size();
		System.out.println("Size of drop down:  "+dropsize);
		
		for(int i=1;i<dropsize;i++){
			
				System.out.println(dropdownooption.get(i).getText());	
		
		}
		*/
	
	//Print all the links from webpage
	WebElement printblock=	driver.findElement(By.xpath("html/body/footer/div[2]/div/div[1]/div[1]"));
		
		List<WebElement> allLinks=printblock.findElements(By.tagName("a"));
		System.out.println(allLinks);
		int dropsize=allLinks.size();
		System.out.println("Size of drop down:  "+dropsize);
		
		for(int i=0;i<dropsize;i++){
			
			System.out.println(allLinks.get(i).getText());
			
			if(allLinks.get(i).getText().equalsIgnoreCase("partner")){
				//System.out.println(str);
				allLinks.get(i).click();

				
			}
		
		}
		
		
	}
	
}
