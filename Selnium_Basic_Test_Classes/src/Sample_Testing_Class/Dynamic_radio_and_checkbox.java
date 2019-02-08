package Sample_Testing_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Dynamic_radio_and_checkbox {
@Test
public void test12() throws Exception{

	// set driver path

	io.github.bonigarcia.wdm.WebDriverManager.firefoxdriver().setup();;
	WebDriver driver = new FirefoxDriver();

	// Load google.com

	driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");

	driver.findElement(By.id("java")).click(); //this code is working for Java
	//fb.findElement(By.className("_58mt")).click();
	
	
	
	// close browser

	driver.close();
}
}




