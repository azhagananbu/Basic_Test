package Cap_Scre_Utility;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility 
{
	public static void capturescreenshot(WebDriver driver, String screenshotName)
	{
	
			try 
			{
				TakesScreenshot ts=(TakesScreenshot)driver;
			    FileHandler.copy(ts.getScreenshotAs(OutputType.FILE), new File("./Screenshots/"+screenshotName+".png"));
			    System.out.println("Screenshot Taken");
			}  
			catch (Exception e) {
				
				System.out.println("Exception while taking screenshot "+e.getMessage());
 
			}
			
			
	
	} 

}
