package Sample_Testing_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sbi_login {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","/opt/Anbu/Azhagan/WorkSpace/Selenium_Drivers/NEW/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.onlinesbi.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='banking']/div[1]/div/div/a[1]/span[1]")).click();
		driver.findElement(By.xpath("//*[@id='banner']/div[2]/a")).click();
		//*[@id="username"]
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("sanjeeve");
}
	}
	
