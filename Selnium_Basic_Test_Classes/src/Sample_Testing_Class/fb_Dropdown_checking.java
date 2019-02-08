package Sample_Testing_Class;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class fb_Dropdown_checking {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "/opt/Anbu/Azhagan/WorkSpace/Selenium_Drivers/NEW/chromedriver");
	WebDriver driver = new ChromeDriver();
//	System.setProperty("webdriver.gecko.driver", "/opt/Seleinium Webdriver/eclipse/Selenium Drivers/geckodriver");
//// Create a new instance of the Firefox driver
//WebDriver driver = new FirefoxDriver();

//  Wait For Page To Load
// Put a Implicit wait, this means that any search for elements on the page
//could take the time the implicit wait is set for before throwing exception 
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
// Navigate to URL
driver.get("https://www.facebook.com/");
// Maximize the window.
driver.manage().window().maximize();
driver.findElement(By.id("u_0_j")).sendKeys("Vijay");
driver.findElement(By.id("u_0_l")).sendKeys("kumar");
driver.findElement(By.id("u_0_o")).sendKeys("9597137704");
driver.findElement(By.id("u_0_v")).sendKeys("banu@1525");
Select date = new Select(driver.findElement(By.xpath("//*[@id='day']")));
date.selectByVisibleText("24");
Select month = new Select(driver.findElement(By.xpath("//*[@id='month']")));
month.selectByVisibleText("Apr");
Select year = new Select(driver.findElement(By.xpath("//*[@id='year']")));
year.selectByVisibleText("1994");
driver.findElement(By.id("u_0_9")).click(); //this code is working for female
//fb.findElement(By.className("_58mt")).click();

//driver.findElement(By.cssSelector("[id=u_0_j]")).click();
driver.findElement(By.xpath("//*[@id='u_0_11']")).click();

// Enter UserName
//driver.findElement(By.linkText("Sign In")).click();
//driver.findElement(By.id("username")).sendKeys("sofs@gmail.com");
// WebElement login = driver.findElement(By.id("identifierNext"));
// login.click();
// Enter Password
//driver.findElement(By.id("password")).sendKeys("samsam");
//driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/div[4]/input")).click();
//WebElement login1 = driver.findElement(By.id("identifierNext"));
//login1.click();
// Wait For Page To Load
//FirefoxProfile fp = new FirefoxProfile();
//fp.setPreference("security.insecure_field_warning.contextual.enabled", false);
//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
// Click on 'Sign In' button
//WebDriverWait wait = new WebDriverWait(driver, 10);
//WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[data-test='testing-job-subject']")));
//driver.findElement(By.linkText("signIn")).click();
//Click on Compose Mail.

WebDriverWait wait = new WebDriverWait(driver, 100);
wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[id=u_0_n]")));
wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id=u_0_n]")));

//Close the browser.
driver.close();
}
}

