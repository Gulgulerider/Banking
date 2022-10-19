package TestCase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import TestBases.TestBase;
import TestObject.PageObject;


public class TitlePage extends TestBase
{
	
	@Test(priority=1)
	public void Login_01()
	
	{
		PageObject po = new PageObject(driver);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		po.UserID();
		po.UserIDText();
		
		if(po.UserIDText())
		{
			Assert.assertTrue(true);
			System.out.println("UserID Text is verified");
		}
		else
		{
			Assert.assertTrue(false);
			System.out.println("UserID Text is not verified");
		}
		
		po.Password();
		po.PasswordText();
		
		if(po.UserIDText())
		{
			Assert.assertTrue(true);
			System.out.println("Password Text is verified");
		}
		else
		{
			Assert.assertTrue(false);
			System.out.println("Password Text is not verified");
		}
		
		po.RESETText();
		if(po.UserIDText())
		{
			Assert.assertTrue(true);
			System.out.println("RESET Text is verified");
		}
		else
		{
			Assert.assertTrue(false);
			System.out.println("RESET Text is not verified");
		}		
		
		po.LOGIN();
				
	}

	@Test (priority=2)
	public void NewCustomer_02()
	{
		PageObject po = new PageObject(driver);
		
//		po.UserID();
//		po.Password();
//		po.LOGIN();
		
		String title = driver.getTitle();
		System.out.println(title);	
		
		po.NewCustomer();
		
		if(po.NewCustomerText())
		{
			Assert.assertTrue(true);
			System.out.println("New Customer Text is verified");
		}
		else
		{
			Assert.assertTrue(false);
			System.out.println("New Customer Text is not verified");
		}
		
		
	}
	
	@Test (priority=3)
	public void AddNewCustomerMale_03() throws InterruptedException, IOException  
	{
		PageObject po = new PageObject(driver);
		
		po.UserID();
		po.Password();
		po.LOGIN();
			
		po.NewCustomer();
		
		String s = driver.getWindowHandle();
		
		driver.switchTo().window(s).navigate().refresh();
		
		po.NewCustomer();
		
		po.CustomerNameMale();
		
		String title = driver.getTitle();
		System.out.println(title);	

		po.GenderMale();

		po.DOB();		//	Not performed action required
		
		po.Address();
		
		po.city();
		
		po.State();
		
		po.pin();
		
		po.MobileNumber();
		
		po.Email();
		
		po.PasswordNewCustomer();
		
		po.Screenshot();
		
		po.SubmitBtnForNewCustomer();
		
		Thread.sleep(5000);
		
	

	}
	
	
	@Test (priority=4)
	public void AddNewCustomerFemale_04() throws InterruptedException, IOException
	{
		PageObject po = new PageObject(driver);
		
		po.UserID();
		po.Password();
		po.LOGIN();
		
		po.NewCustomer();
		
		String s = driver.getWindowHandle();
		
		driver.switchTo().window(s).navigate().refresh();
		
		po.NewCustomer();
			
		String title = driver.getTitle();
		System.out.println(title);	
		
		po.CustomerNameFemale();
		
		po.GenderFemale();
		
//		po.DOB1();
		
		po.Address1();
		
		po.city1();
		
		po.State1();
		
		po.pin1();
		
		po.MobileNumber1();
		
		po.Email1();
		
		po.PasswordNewCustomer1();
		
		po.Screenshot();
		
		po.SubmitBtnForNewCustomer();
		
		Thread.sleep(5000);
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
