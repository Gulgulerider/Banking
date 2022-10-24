package TestCase;

import org.testng.annotations.Test;

import TestBases.TestBase;
import TestObject.PageObject;

public class DeleteCustomer extends TestBase
{
	@Test
	public void DeleteCustomer_01()
	{
		PageObject po = new PageObject(driver);

		po.UserID();		//send userid
		po.Password();		//send password
		po.LOGIN();			//click on login button
		
		po.DeleteCustomer();
		
		String s = driver.getWindowHandle();
		driver.switchTo().window(s).navigate().refresh();
		
		po.DeleteCustomer();
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		if(title.equals(title))
		{
			System.out.println("Delete Customer title is verified");
		}
		else
		{
			System.out.println("Delete Customer title is not verified");
		}
		
		if(po.DeleteCustomerText())
		{
			System.out.println("Delete Customer is verified");
		}
		else
		{
			System.out.println("Delete Customer is not verified");
		}
		
		po.EditAccountForm();
		
		if(po.EditAccountForm())
		{
			System.out.println("Delete Customer form text is verified");
		}
		else
		{
			System.out.println("Delete Customer form text is not verified");
		}
		
		po.DeleteCustomerSubmitBtn();
		
		po.title();
		
		po.HandleAlertForDeleteCustomer();
		
		po.HandleAlertForDeleteCustomer();
		
		po.title();
		
		driver.close();	
		
	}
	

}
