package Com.TestNG.Listeners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Extents_Listeners extends TestListenerAdapter
{

	public void onTestSuccess(ITestResult tr)
	{
		System.out.println("Testcase Pass");
		
	}
	
	public void onTestFailure(ITestResult tr)
	{
		System.out.println("Testcase Fail");
		
	}
	
	
}
