package LooperSoft;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class looperSoft_Store_Creation {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","/opt/Anbu/Azhagan/WorkSpace/Selenium_Drivers/NEW/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http:loopersoft.com:1337");
		//Login 
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.id("username")).sendKeys("sofs@gmail.com");
		driver.findElement(By.id("password")).sendKeys("samsam");
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/div[4]/input")).click();
		
		//create Stores
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/h1/a")).click();
		driver.findElement(By.id("storeName")).sendKeys("Kajal agrwal 1 cosmetices pvt lit");
		driver.findElement(By.id("storeEamil")).sendKeys("bosco@gmail.com");
		driver.findElement(By.id("storecontactNumber")).sendKeys("042456446");
		driver.findElement(By.id("storeAddress")).sendKeys("lic phonix alaskka");
		driver.findElement(By.id("storeCity")).sendKeys("New york");
		
		//dropdown type 1
		
//		Select select = new Select(driver.findElement(By.xpath("//ul[@class='select2-results__options']//li")));
//		select.selectByVisibleText("Colorado");
//		driver.findElement(By.xpath("//*[@id='select2-stateid-container']")).click();
		driver.findElement(By.xpath("//*[@id='select2-stateid-container']")).click();
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='select2-results__options']//li"));
		System.out.println(list.size());
		
		for(WebElement element:list){
			
			System.out.println("Values " + element.getAttribute("innerHTML"));
			
			String innnerhtml=element.getAttribute("innerHTML");
			
			if (element.getAttribute("innerHTML").contains("Idaho"))
			{
				element.click();
				break;	
			}
			
			System.out.println("Selected State is ====== "+innnerhtml);
		}
		
		
		//dropdown type 1
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.findElement(By.id("storeZip")).sendKeys("232133");
		driver.findElement(By.id("storefacebook")).sendKeys("kds@gmail.com/facebook");
		driver.findElement(By.id("storetwitter")).sendKeys("kds@gmail.com/twitter");
		driver.findElement(By.id("storeyelp")).sendKeys("kds@gmail.com/help");
		driver.findElement(By.id("storewebsite")).sendKeys("www.kds.styles.com");
		driver.findElement(By.id("snapchat")).sendKeys("kds@gmail.com/snapchat");
		driver.findElement(By.id("googleplaces")).sendKeys("kds@gmail.com/googleplaces");
		driver.findElement(By.id("instagram")).sendKeys("kds@gmail.com/instagram");
		driver.findElement(By.id("tripadvisor")).sendKeys("kds@gmail.com/tripadvisor");
		driver.findElement(By.id("storefeedbackhappylink")).sendKeys("kds@gmail.com/storefeedbackhappylink");
		driver.findElement(By.id("storefeedbackhappylink1")).sendKeys("kds@gmail.com");
		
		driver.findElement(By.id("storeStatusActive")).click();
		
		driver.findElement(By.id("manager_password")).sendKeys("admin");
		driver.findElement(By.id("manager_confirm_password")).sendKeys("admin");
		driver.findElement(By.id("purchaseOverAmountForFacial")).sendKeys("500");
		driver.findElement(By.id("storePurchaseOverAmount")).sendKeys("500");
		
		//dropdown type 2
//		driver.findElement(By.xpath("//*[@id='select2-scheduleWhen-container']")).click();
//		Select select = new Select(driver.findElement(By.xpath("//ul[@class='select2-results__options']//li")));
//		select.selectByVisibleText("Colorado");
		driver.findElement(By.xpath("//*[@id='select2-scheduleWhen-container']")).click();
		List<WebElement> list1 = driver.findElements(By.xpath("//ul[@class='select2-results__options']//li"));
		System.out.println(list1.size());
		
		for(WebElement element:list1){
			
			System.out.println("Values " + element.getAttribute("innerHTML"));
			
			String innnerhtml=element.getAttribute("innerHTML");
			
			if (element.getAttribute("innerHTML").contains("Daily"))
			{
				element.click();
				break;	
			}
			System.out.println("Selected Interval is ======"+innnerhtml);
		}
		
//		WebElement dropdown = driver.findElement(By.id("scheduleWhen"));
//		dropdown.click();
//		List<WebElement> options = dropdown.findElements(By.className("form-control placeholder-single"));
//		options.get(4).click();
		
		driver.findElement(By.id("storeFacialRooms")).sendKeys("5");
		
//		WebElement dropdown1 = driver.findElement(By.id("select2-copyfromstoreid-container"));
//		dropdown1.click();
//		List<WebElement> options1 = dropdown1.findElements(By.className("select2-selection__rendered"));
//		options1.get(4).click();
		
		
//		WebElement uploadElement = driver.findElement(By.id("storeLogo"));
//		uploadElement.sendKeys("/home/samy/Pictures/suday/sam2.jpeg");
		
		//submit
		driver.findElement(By.xpath("//*[@id='create-store']/div[2]/input")).click();
		
		//wait
		WebDriverWait wait1 = new WebDriverWait(driver, 20);
		wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='create-store']/div[2]/input")));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='create-store']/div[2]/input")));
		
		//close
		driver.close();
}
}
//}
