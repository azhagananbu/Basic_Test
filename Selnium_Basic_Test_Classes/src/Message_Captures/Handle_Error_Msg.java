package Message_Captures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Handle_Error_Msg {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","/opt/Anbu/Azhagan/WorkSpace/Selenium_Drivers/NEW/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("http:loopersoft.com:1337");
		//Login 
		driver.findElement(By.linkText("Sign In")).click();
//		driver.findElement(By.id("username")).sendKeys("sofs@gmail.com");
		driver.findElement(By.id("password")).sendKeys("samsam");
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/div[4]/input")).click();
		Thread.sleep(2000);
		
		String actual_Error=driver.findElement(By.xpath("//*[@id='login-form']/div[1]/label")).getText();
		
		System.out.println("Actual error is "+actual_Error);
		
		String Expected_Error="Please enter an email address.";
		
		//Type 1
		Assert.assertEquals(actual_Error, Expected_Error);
		
		//Type 2
		Assert.assertTrue(actual_Error.contains("Please enter an email address"));
		
		System.out.println("Test completed Successfully");
		
		driver.quit();

	}

}

