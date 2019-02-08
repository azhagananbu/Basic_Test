package Sample_TestNG_Class;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class handlebootstrapdropdon {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","/opt/Seleinium Webdriver/eclipse/Selenium Drivers/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http:loopersoft.com:1337");
		//Login 
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.id("username")).sendKeys("sofs@gmail.com");
		driver.findElement(By.id("password")).sendKeys("samsam");
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/div[4]/input")).click();
		
		//create Stores
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/h1/a")).click();
		
		//wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
		//dropdown type 1
				driver.findElement(By.xpath("//*[@id='select2-stateid-container']")).click();
//				Select select = new Select(driver.findElement(By.xpath("//ul[@class='select2-results__options']//li")));
//				select.selectByVisibleText("Colorado");
				List<WebElement> list = driver.findElements(By.xpath("//ul[@class='select2-results__options']//li"));
//				System.out.println(list);
				
				for(WebElement element:list){
					
					System.out.println("Values " + element.getAttribute("innerHTML"));
					String innnerhtml=element.getAttribute("innerHTML");
					
					if (element.getAttribute("innerHTML").contains("Colorado"))
					{
						element.click();
						break;	
					}
//					Select select1 = new Select(driver.findElement(By.xpath("//ul[@class='select2-results__options']//li")));
//					select1.selectByVisibleText("Colorado");
					System.out.println("Selected State is ======"+innnerhtml);
				}
				
				
				
				 //a[text()[contains(.,"Colorado")]]﻿



//					System.out.println(list.get(i).getText());
//					if(list.get(i).getText().equals("Colorado")){
//						list.get(i).click();
//						break;
//					}
				
				//dropdown type 2
//				Select oSelect = new Select(driver.findElement(By.xpath("//*[@id='select2-stateid-result-gcyc-1525']")));
//				oSelect.selectByVisibleText("Colorado");
				
//				dropdown type 3
//				driver.findElement(By.xpath("//*[@id='select2-stateid-container']")).click();
//				Select select = new Select(driver.findElement(By.xpath("//*[@id='select2-stateid-container']")));
//				select.selectByVisibleText(Colorado);
				
//				//dropdown type 4
//				WebElement dropdown = driver.findElement(By.id("select2-stateid-container"));
//				dropdown.click();
//				List<WebElement> options = dropdown.findElements(By.className("select2-search__field"));
//				options.get(4).click();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
//				driver.findElement(By.xpath("//*[@id='select2-stateid-container']")).click();
				
//				WebDriverWait wait = new WebDriverWait(driver, 100);
//				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='select2-stateid-container']")));
//				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='select2-stateid-container']")));

//				WebElement state_dropdown=driver.findElement(By.id("select2-stateid-container"));
//				Select state = new Select(driver.findElement(By.xpath("//*[@id='select2-stateid-results']")));
//				state.selectByVisibleText("Colorado");
				//close
				driver.close();

	}

}
