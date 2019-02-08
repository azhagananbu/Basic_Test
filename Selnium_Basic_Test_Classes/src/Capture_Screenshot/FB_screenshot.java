package Capture_Screenshot;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Cap_Scre_Utility.Utility;

public class FB_screenshot {
	WebDriver driver;
	
	@Test
	public void capturescreenshhot() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "/opt/Anbu/Azhagan/WorkSpace/Selenium_Drivers/geckodriver");
		
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
//		Utility.capturescreenshot(driver, "Browser started 1");
		driver.manage().window().maximize();
//		Utility.capturescreenshot(driver, "Browser started 2");
		driver.findElement(By.id("email")).sendKeys("anbumaji@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("lovebeauty");
		driver.findElement(By.xpath("//*[@class='uiButton uiButtonConfirm']")).click();
	
		assertTrue(driver.getCurrentUrl().contains(".com"));
		Thread.sleep(2000);
		
		String actual_Error=driver.findElement(By.xpath("//*[@class='_4rbf _53ij']/a")).getText();
//				.getAttribute("innerHTML");
		assertTrue(actual_Error.contains("Please enter an email address"));
		System.out.println("Actual error is "+actual_Error);
		
	
		//When Passed
//		Utility.capturescreenshot(driver, "Test passed");
	
	}
	
	@AfterMethod
	public void breakdown(ITestResult result)
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			
			Utility.capturescreenshot(driver, result.getName());
			
		}
		
		driver.close();
	}
	
}

//TakesScreenshot ts=(TakesScreenshot)driver;

//File source=ts.getScreenshotAs(OutputType.FILE);