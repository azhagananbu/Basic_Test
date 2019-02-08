package LooperSoft;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Cap_Scre_Utility.Utility;

public class loopersoft_Login 
{
	WebDriver driver;
	
	@Test(dataProvider="looperdata")
	public void loginlooper(String username,String password) throws InterruptedException
	{
	
	System.setProperty("webdriver.gecko.driver","/opt/Anbu/Azhagan/WorkSpace/Selenium_Drivers/NEW/geckodriver");
	
	driver = new FirefoxDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http:loopersoft.com:1337");
	driver.findElement(By.linkText("Sign In")).click();
	driver.findElement(By.id("username")).sendKeys(username);
	driver.findElement(By.id("password")).sendKeys(password);
	driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/div[4]/input")).click();
	Utility.capturescreenshot(driver, "Sign In");
	
	Thread.sleep(5000);
	//System.out.println(driver.getTitle());
	
	 assertTrue(driver.getCurrentUrl().contains("/store"));
	 
	System.out.println("Page Title matched- So user able to login successfully");
	
	}
	
	@AfterMethod
	public void tearDown()
	{
		
		driver.quit();
		
	}
	
	@DataProvider (name="looperdata")
	public Object[][] passdata()
	{
		Object[][] data=new Object[3][2];
		
		data [0][0]="sofs@gmail.com";
		data [0][1]="samsam";
		
		data [1][0]="softsams@gmail.com";
		data [1][1]="samsam";
		
		data [2][0]="softsamsofs@gmailc.om";
		data [2][1]="samsam";
		
		return data;
		
	}
	
}
