package Sample_Testing_Class;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class poshan {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/opt/Anbu/Azhagan/WorkSpace/Selenium_Drivers/NEW/geckodriver");
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "http://poshanabhiyaan.gov.in/#/";
        String expectedTitle = "Poshan";
        String actualTitle = "";
        driver.get(baseUrl);
        actualTitle = driver.getTitle();
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
       
        
        driver.close();
       
	}
}
