package Sample_Testing_Class;
 
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class tes{

	public WebDriver driver = new FirefoxDriver();
    public void main() {
    	System.setProperty("webdriver.gecko.driver", "/opt/Anbu/Azhagan/WorkSpace/Selenium_Drivers/NEW/geckodriver");
		WebDriver driver = new FirefoxDriver();

    	
    	

    	  driver = new FirefoxDriver();

    	     
          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



          driver.get("http://www.onlinestore.toolsqa.wpengine.com");


        driver.findElement(By.id("username")).click();

    

       

        driver.findElement(By.id("log")).sendKeys("testuser_1");

      

        

        driver.findElement(By.id("pwd")).sendKeys("Test@123");

        
        driver.findElement(By.id("login")).click();

      

        System.out.println(" Login Successfully, now it is the time to Log Off buddy.");

    

        driver.findElement(By.id("account_logout"));


        driver.quit();

    }

  }