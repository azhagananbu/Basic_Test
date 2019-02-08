package Message_Captures;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Handle_Alert_Msg {
	
	 @Test
	 public void handlealert() throws InterruptedException {
		 	
			System.setProperty("webdriver.gecko.driver","/opt/Anbu/Azhagan/WorkSpace/Selenium_Drivers/NEW/geckodriver");
			WebDriver driver = new FirefoxDriver();
			driver.get("http://www.ksrtc.in");
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//*[@id='searchBtn']")).click();
			
			Thread.sleep(2000);
			
//			Alert alt=driver.switchTo().alert();
//			alt.accept();
			//Capture Alert
			String actual_msg=driver.switchTo().alert().getText();
			
			System.out.println("Alert message is " +actual_msg);
			
			driver.switchTo().alert().accept();
			
			//validate Alert
			String expected_msg="Please select start place.It is required please update the same";
			
			Assert.assertEquals(actual_msg, expected_msg);
			
			driver.quit();
			
			
	 }

}
