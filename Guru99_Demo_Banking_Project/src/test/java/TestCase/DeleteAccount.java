package TestCase;

import TestBases.TestBase;
import TestObject.PageObject;

public class DeleteAccount extends TestBase
{
	public void DeleteAccount_01()
	{
	PageObject po = new PageObject(driver);
	
	po.UserID();		//send userid
	po.Password();		//send password
	po.LOGIN();			//click on login button
	
	po.DeleteAccount();
	
	String s = driver.getWindowHandle();
	driver.switchTo().window(s).navigate().refresh();
	
	po.DeleteAccount();
	
	po.title();
	
	
	
	
	
	
	}

}
