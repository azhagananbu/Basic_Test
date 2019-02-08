package Cross_Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class loginverification {
	WebDriver driver;
	@Test
	@Parameters("Browsers")
	public void loginverificationtest(String browsername) throws InterruptedException
	{
		if(browsername.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "/opt/Anbu/Azhagan/WorkSpace/Selenium_Drivers/NEW/geckodriver");
			driver=new FirefoxDriver();
		}
		else if(browsername.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "/opt/Anbu/Azhagan/WorkSpace/Selenium_Drivers/NEW/chromedriver");
			driver=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("Opera"))
		{
//			ChromeOptions options = new ChromeOptions();
//			options.addExtensions(new File("/opt/Seleinium Webdriver/eclipse/Selenium Drivers/operadriver_linux64/operadriver"));
//			ChromeDriver driver = new ChromeDriver(options);
			System.setProperty("WebDriver.opera.driver", "/opt/Anbu/Azhagan/WorkSpace/Selenium_Drivers/NEW/operadriver");
			driver=new OperaDriver();
		}
		driver.manage().window().maximize();
//		driver.get("http:loopersoft.com:1337");
		driver.get("http://boscojava.online/#/");
		System.out.println(driver.getTitle());
		
		driver.quit();
	}



	}
	
	
	
	
	

