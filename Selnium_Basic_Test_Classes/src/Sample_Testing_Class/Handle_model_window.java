package Sample_Testing_Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handle_model_window {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","/opt/Anbu/Azhagan/WorkSpace/Selenium_Drivers/NEW/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.goibibo.com/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id='get_sign_in']")).click();
		
		driver.switchTo().frame("authiframe");
		
		driver.findElement(By.xpath("//*[@id='authMobile']")).sendKeys("8667012457");
		
		driver.findElement(By.xpath("//*[@id='mobileSubmitBtn']")).click();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.close();
	}
}