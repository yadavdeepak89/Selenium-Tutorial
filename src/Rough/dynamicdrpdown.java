	package Rough;

	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

public class dynamicdrpdown {

	public static void main(String[] args) {
				WebDriver driver= new ChromeDriver();
				driver.get("https://www.znetlive.com/shared-hosting/");
				/*driver.get("http://spicejet.com/");//to open the url in browser
				driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
				driver.findElement(By.xpath("//*[@id='dropdownGroup1']/div/ul[2]/li[3]/a")).click();
				driver.findElement(By.xpath("//*[@id='dropdownGroup1']/div/ul[2]/li[1]/a")).click();*/
				//driver.get("https://www.makemytrip.com/flights?cmp=disp_DF_icubes_21296_");
				driver.manage().window().maximize();
				//List<WebElement> ele1=	driver.findElements(By.tagName("option"));
				Select sel=new Select(driver.findElement(By.xpath("html/body/div[3]/div/div/form[1]/div/div/div[2]/select")));
				List<WebElement> ele=sel.getOptions();
				ele.size();
				
				for(int i=0;i<ele.size();i++){
					
					System.out.println(ele.get(i).getAttribute("value"));
					String ele4= ele.get(i).getAttribute("value");
					String str="Triennially";
					if(ele4.equals(str)){
						
					sel.selectByValue(str);
					}
				}
					}
		


}
