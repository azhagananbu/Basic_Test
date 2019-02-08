/**
 * 
 */
package Com.TestNG.Listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author anbu
 *
 */
public class Seleni_Test_Listeners 
{
	/**
	 * @param args
	 */
	@Test
	public void login_1() 
	{
		System.out.println("Inside Test Login_1");
	}
	
	@Test
	public void login_2() 
	{
		System.out.println("Inside Test Login_2");
		 
		Assert.assertEquals("Anbazhagan", "Anbazhagan@1525");
	}

}
