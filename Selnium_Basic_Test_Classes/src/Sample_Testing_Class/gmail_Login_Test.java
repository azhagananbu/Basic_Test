package Sample_Testing_Class;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class gmail_Login_Test {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","/opt/Anbu/Azhagan/WorkSpace/Selenium_Drivers/NEW/geckodriver");
	
	//Initialize the instance
	WebDriver driver = new FirefoxDriver();

	//launch gmail.com
	driver.get("https://accounts.google.com");

	//maximize the browser
	driver.manage().window().maximize();

	//find the element by xpath and enter the email address which you want to login.
	driver.findElement(By.xpath("//input[@aria-label='Email or phone']")).sendKeys("anbumaji");

	//wait for a seconds
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	//find the Next Button and click on it.
	driver.findElement(By.xpath("//*[text()='Next']/../..")).click();


    WebDriverWait wait = new WebDriverWait(driver, 100);
    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='password']")));
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));


	//find the password field and enter the password for the gmail.
	driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("banu@1525");
	
	//*[@id="password"]/div[1]/div/div[1]/input
	//find the Next Button and click on it.
	driver.findElement(By.xpath("//*[text()='Next']/../..")).click();

	//get the hash code.
//	int hashCodeValue = driver.GetHashCode();

	//print the value.
//	Console.WriteLine("Value is "+hashCodeValue);

	//find the element by xpath n click.
//	driver.findElement(By.xpath("(//a[@role='button'])[3]")).click();
	
    WebDriverWait wait1 = new WebDriverWait(driver, 100);
    wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div/header/div[2]/div[3]/div/div[2]/div/a/span")));
    wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/header/div[2]/div[3]/div/div[2]/div/a/span")));

	//click on sign out.
	driver.findElement(By.xpath("/html/body/div[2]/div/header/div[2]/div[3]/div/div[2]/div/a/span")).click();

	//wait for a second
	 WebDriverWait wait11 = new WebDriverWait(driver, 100);
	    wait11.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div/header/div[2]/div[3]/div/div[2]/div/a/span")));
	    wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/header/div[2]/div[3]/div/div[2]/div/a/span")));


	//close the driver instance.
	driver.close();

	//quit
//	driver.quit();

}
}