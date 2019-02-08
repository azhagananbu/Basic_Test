 package Sample_TestNG_Class;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Sample {
       public WebDriver driver = new FirefoxDriver();
       String appUrl = "http://cristo.avosa.org:9898/baptism/registration/form/DI";

@Test
public void gmailLogin() throws InterruptedException {

              driver.get("http://cristo.avosa.org:9898/baptism/registration/form/DI");
             
              driver.manage().window().maximize();
             
//              String expectedTitle ="Wealth Vruddhi";
//        
//              String actualTitle = driver.getTitle();
//              Assert.assertEquals(expectedTitle,actualTitle);
             
//              
//              driver.findElement(By.id("password")).sendKeys("anbu@1525");
             
        	  driver.findElement(By.xpath("//*[@id=\"myform\"]/div/section/div/div[1]/div[2]/div[2]/div/input")).sendKeys("aaa");
        	  driver.findElement(By.id("email")).sendKeys("anbu250494@gmail.com");
        	  driver.wait(2000);
            
              driver.close();
}
} 