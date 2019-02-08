package Sample_TestNG_Class;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTestNG {
	
	WebDriver driver;
	WebDriver d = null;
//    String appUrl = "http://cristo.avosa.org:9898/dubai/registration/form";
  
    @Test
  public void Cristo_Dubai() throws InterruptedException {
    	System.setProperty("webdriver.gecko.driver","/opt/Anbu/Azhagan/WorkSpace/Selenium_Drivers/NEW/geckodriver");
    	driver = new FirefoxDriver();

    	
	  driver.get("http://cristo.avosa.org:9898/dubai/registration/form");
	  
	  driver.manage().window().maximize();
	  
//	  String expectedTitle ="Wealth Vruddhi";
//	  
//	  String actualTitle = driver.getTitle();
//      
//	  Assert.assertEquals(expectedTitle,actualTitle);
      // Register click
	  
	  driver.findElement(By.xpath("//*[@id=\"emirate_id\"]")).sendKeys("784199412345678");
         

	  driver.findElement(By.xpath("//*[@id=\"myform\"]/div/section/div/div[1]/div[2]/div[4]/div[1]/div[2]/input")).sendKeys("automation");
	  driver.findElement(By.xpath("//*[@id=\"myform\"]/div/section/div/div[1]/div[2]/div[4]/div[1]/div[3]/input")).sendKeys("automation");
	  driver.findElement(By.xpath("//*[@id=\"myform\"]/div/section/div/div[1]/div[2]/div[4]/div[2]/div[1]/div[1]")).click();

	  driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/thead/tr[1]/th[2]")).click();
	  System.out.println("");
	  
	  driver.findElement(By.xpath("//*[@id='myform']/div/section/div/div[1]/div[2]/div[4]/div[2]/div[1]/div[2]/div/div/label[1]")).click();
	  driver.findElement(By.xpath("//*[@id='m']")).click();
//	  Select select = new Select(driver.findElement(By.xpath("//*[@id='country_id']")));
//	  select.selectByVisibleText("Resident Individual");
	  
	  
	  driver.findElement(By.xpath("//*[@id=\"myform\"]/div/section/div/div[1]/div[2]/div[4]/div[2]/div[2]")).click();
		List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"resident_type\"]"));
		System.out.println(list.size());
		
		for(WebElement element:list){
			
			System.out.println("Values " + element.getAttribute("innerHTML"));
			
			String innnerhtml=element.getAttribute("innerHTML");
			
			if (element.getAttribute("innerHTML").contains("Resident Individual"))
			{
				element.click();
				break;	
			}
			
			System.out.println("Selected State is ======"+innnerhtml);
		}
	  
	
	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  
//      driver.close();
  }
}
