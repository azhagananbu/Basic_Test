package LooperSoft;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Loopersoft_Category 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","/opt/Anbu/Azhagan/WorkSpace/Selenium_Drivers/NEW/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http:loopersoft.com:1337");
		//Login 
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.id("username")).sendKeys("softsamsofs@gmail.com");
		driver.findElement(By.id("password")).sendKeys("samsam");
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/div[4]/input")).click();
		
		//create Stores
		driver.findElement(By.linkText("Categories")).click();
		driver.findElement(By.linkText("Create")).click();
		
		driver.findElement(By.xpath("//p[@class='CaptionCont SlectBox']")).click();
		driver.findElement(By.xpath("//li[@data-val='7']//span//i")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Test')]")).getText();
		driver.findElement(By.xpath("//li[@data-val='10']//span//i")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Kumudham Styles Trends')]")).
		getScreenshotAs(null);
		driver.findElement(By.xpath("//*[@id=\"category\"]/div[1]/div[3]/div/div/div/div/p[1]")).click();

		
		
		//li[@data-val='7']//span
//		driver.findElement(By.xpath("//span[@class='select2-dropdown select2-dropdown--above']")).click();
//		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='optWrapper okCancelInMulti multiple open']//li"));
//		System.out.println(list.size());
//		
//		
//		for(WebElement element:list){
//			
//			System.out.println("Values " + element.getAttribute("innerHTML"));
//			
//			String innnerhtml = element.getAttribute("innerHTML");
//			
//			if (element.getAttribute("innerHTML").contains(" Alex Stores"))
//			{
//				element.click();
//				System.out.println("Selected Store is ====== "+innnerhtml);
//				break;
//			}
//			
//			System.out.println("Selected Store is ====== "+innnerhtml);
//		}
//		
		
		
		
		
		
		//dropdown type 1
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
}
}

