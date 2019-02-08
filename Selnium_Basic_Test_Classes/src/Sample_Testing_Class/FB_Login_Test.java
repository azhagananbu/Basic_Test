package Sample_Testing_Class;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FB_Login_Test {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/opt/Anbu/Azhagan/WorkSpace/Selenium_Drivers/NEW/geckodriver");
		WebDriver driver = new FirefoxDriver();

        driver.get("http://192.168.1.13/xebro/index");
       
        driver.manage().window().maximize();
        
        //driver.findElement(By.linkText("Sign In")).click();
        driver.findElement(By.linkText("//*[@id=\"ownmenu\"]/li[3]/a/i")).click();
//        driver.findElement(By.id("pass")).sendKeys("lovebeauty");
//        //driver.findElement(By.xpath("/select[@id='category']/option[@id='cat2']")).click();
//        Thread.sleep(2000);
//        //driver.findElement(By.xpath("//select[@id='category']/option[@id='cat2']")).click();
//        //WebElement SignIButton = driver.findElement(By.xpath("//*[@id="login-form"]/div[4]/input"))
//        WebElement SignInButton = driver.findElement(By.id("loginbutton"));
//        SignInButton.click();
       
        driver.close();
       
	}
}
