package LooperSoft;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class User_Employee_Create {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","/opt/Anbu/Azhagan/WorkSpace/Selenium_Drivers/NEW/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http:loopersoft.com:1337");
		//Login 
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.id("username")).sendKeys("sofs@gmail.com");
		driver.findElement(By.id("password")).sendKeys("samsam");
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/div[4]/input")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/ul/li[1]/a")).click();
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li//a"));
		System.out.println(list.size());
		
		for(WebElement element:list){
			
			System.out.println("Values " + element.getAttribute("innerHTML"));
			
			String innnerhtml=element.getAttribute("innerHTML");
			
			if (element.getAttribute("innerHTML").contains("Employees"))
			{
				element.click();
				break;	
			}
			
			System.out.println("Selected Employee is ======"+innnerhtml);
		}
		
		//Store select
		driver.findElement(By.xpath("//*[@id='body_content']/div[2]/div/div[1]/div[3]")).click();
		
		List<WebElement> list1 = driver.findElements(By.xpath("//*[@class='form-control']//option"));
		System.out.println(list1.size());
		
		for(WebElement element:list1){
			
			System.out.println("Values " + element.getAttribute("innerHTML"));
			
			String innnerhtml=element.getAttribute("innerHTML");
			
			if (element.getAttribute("innerHTML").contains("Lakme Kajal cosmetices pvt lit"))
			{
				element.click();
				break;	
			}
			
			System.out.println("Selected stores is ======"+innnerhtml);
		}
		
		//close
		driver.close();//*[@id="selectstores"]
	}

}
