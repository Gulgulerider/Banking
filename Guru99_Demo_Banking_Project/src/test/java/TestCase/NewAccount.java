package TestCase;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.Test;

import TestBases.TestBase;
import TestObject.PageObject;

public class NewAccount extends TestBase
{
	@Test(priority=1)
	public void NewAccount1() throws IOException
	{
	PageObject po = new PageObject(driver);
		
		po.UserID();		//send userid
		po.Password();		//send password
		po.LOGIN();			//click on login button
		
		po.NewAccount1();	//click on new account button
		
		if(po.NewAccountText1())
		{
			Assert.assertTrue(true);
			System.out.println("New Account Text is verified");
		}
		else
		{
			Assert.assertTrue(false);
			System.out.println("New Account Text is not verified");
		}
		
		String title = driver.getTitle();	//get title
		System.out.println(title);			//print title
		
		if(title.equals(title))
		{
			Assert.assertTrue(true);
			System.out.println(" New Account Home page title is verified");
		}
		else
		{
			Assert.assertTrue(false);
			System.out.println(" New Account Home page title is not verified");
		
		}
		
		String s = driver.getWindowHandle();
		
		driver.switchTo().window(s).navigate().refresh();	//for handling advertise
		
		po.NewAccount1();
		
		po.CustomerId();
		
		po.AccountType();
		
		po.InitialDeposite();
		
		po.SubmitNewAccount();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File targate = new File("./Screenshots/AMol_New_Customer.png");
		
		FileHandler.copy(source, targate);
		
		title = driver.getTitle();
		
		System.out.println(title);
		
		if(title.equals(title))
		{
			Assert.assertTrue(true);
			System.out.println(" Account Generated Successfully!!! title is verified");
		}
		else
		{
			Assert.assertTrue(false);
			System.out.println("Account Generated Successfully!!! title is not verified");
		
		}
		
		po.BrockenLink();
		
		po.AccountContinue();
		
		driver.switchTo().window(s).navigate().refresh();

		
		driver.close();
	}
	


	
	
	
	
	
	
	
	
}
