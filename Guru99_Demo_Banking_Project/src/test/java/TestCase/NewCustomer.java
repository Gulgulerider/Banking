package TestCase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import TestBases.TestBase;
import TestObject.PageObject;


public class NewCustomer extends TestBase
{

	@Test (priority=1)
	public void NewCustomer_01()
	{
		PageObject po = new PageObject(driver);
		
		po.UserID();		//send userid
		po.Password();		//send password
		po.LOGIN();			//click on login button
		
		String title = driver.getTitle();	//get title
		System.out.println(title);			//print title
		
		po.NewCustomer();		//click on new customer button
		
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
	
	@Test (priority=2)
	public void AddNewCustomerMale_02() throws InterruptedException, IOException  
	{
		PageObject po = new PageObject(driver);
		
//		po.UserID();
//		po.Password();
//		po.LOGIN();
			
//		po.NewCustomer();
		
		String s = driver.getWindowHandle();
		
		driver.switchTo().window(s).navigate().refresh();	//for handling advertise
		
		po.NewCustomer();
		
		po.CustomerNameMale();
		
		String title = driver.getTitle();
		System.out.println(title);	

		po.GenderMale();	

		po.DOB();	//date of birth day and month
		
		po.DOBYEAR();	//for year
	
		po.Address(); 	//address
		
		po.city();
		
		po.State();
		
		po.pin();
		
		po.MobileNumber();
		
		po.Email();
		
		po.PasswordNewCustomer();	//new customer generation password
			
		po.SubmitBtnForNewCustomer();	//click on submit button
		
		Thread.sleep(2000);
		
		po.Screenshot();	//take a screenshot
		
		String title1 = driver.getTitle();		//get new customer login page title
		System.out.println(title1);
		
		po.ClickOnContinueBtn();	//click on continue button
		
		driver.switchTo().window(s).navigate().refresh();	//for handlilng addds

	}
	
	
	@Test (priority=3)
	public void AddNewCustomerFemale_03() throws InterruptedException, IOException
	{
		PageObject po = new PageObject(driver);
		
//		po.UserID();
//		po.Password();
//		po.LOGIN();
		
//		po.NewCustomer();
		
		String s = driver.getWindowHandle();
		
		driver.switchTo().window(s).navigate().refresh();
		
		po.NewCustomer();
			
		String title = driver.getTitle();
		System.out.println(title);	
		
		po.CustomerNameFemale();
		
		po.GenderFemale();
		
		po.DOB10();
		
		po.DOBYEAR10();
		
		po.Address1();
		
		po.city1();
		
		po.State1();
		
		po.pin1();
		
		po.MobileNumber1();
		
		po.Email1();
		
		po.PasswordNewCustomer1();
		
		po.SubmitBtnForNewCustomer();
		
		Thread.sleep(2000);
		
		po.Screenshot1();
		
		String title1 = driver.getTitle();
		System.out.println(title1);
		
		po.ClickOnContinueBtn();
		
		driver.switchTo().window(s).navigate().refresh();
		
	driver.close();	

	}
	

}
