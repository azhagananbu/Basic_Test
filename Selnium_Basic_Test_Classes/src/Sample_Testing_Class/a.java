package Sample_Testing_Class;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a {
	public static void main(String[] args) {
		
//		ChromeOptions options = new ChromeOptions();
//		options.addExtensions(new File("/opt/Seleinium Webdriver/eclipse/Selenium Drivers/operadriver"));
//		ChromeDriver driver = new ChromeDriver(options);
//		System.setProperty("webDriver.chrome.driver", "/opt/Seleinium Webdriver/eclipse/Selenium Drivers/operadriver_linux64/operadriver");
//		
		
//		ChromeOptions options = new ChromeOptions();
//		options.addExtensions(new File("/opt/Seleinium Webdriver/eclipse/Selenium Drivers/operadriver_linux64/operadriver"));
//		ChromeDriver driver = new ChromeDriver(options);
//		driver.get("https://www.facebook.com/");
		
		
		
		
//		System.setProperty("webdriver.opera.driver","/home/samy/Azhagan/WorkSpace/Selenium_Drivers/operadriver");
//		System.setProperty("opera.binary","/home/samy/Azhagan/WorkSpace/Selenium_Drivers/operadriver");
		
		
		System.setProperty("webdriver.chrome.driver", "/opt/Anbu/Azhagan/WorkSpace/Selenium_Drivers/NEW/chromedriver");

		WebDriver driver1 = new ChromeDriver();
		
        //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception

        driver1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //Launch the Online Store Website
        driver1.get("https://www.facebook.com/");
        
    	// Find the element that's ID attribute is 'account'(My Account)

        driver1.findElement(By.id("email")).sendKeys("testuser_1");

        // Find the element that's ID attribute is 'log' (Username)

        // Enter Username on the element found by above desc.

//        driver.findElement(By.id("log")).sendKeys("testuser_1");

        // Find the element that's ID attribute is 'pwd' (Password)

        // Enter Password on the element found by the above desc.

        driver1.findElement(By.id("pass")).sendKeys("Test@123");

        // Now submit the form. WebDriver will find the form for us from the element

        driver1.findElement(By.xpath("//*[@id='u_0_2']")).click();

        // Print a Log In message to the screen

        System.out.println(" Login Successfully, now it is the time to Log Off buddy.");

        // Find the element that's ID attribute is 'account_logout' (Log Out)

        driver1.findElement(By.id("account_logout"));

        driver1.quit();

    }

  }