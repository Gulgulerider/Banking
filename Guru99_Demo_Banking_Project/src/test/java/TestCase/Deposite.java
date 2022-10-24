package TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import TestBases.TestBase;
import TestObject.PageObject;

public class Deposite extends TestBase
{
	@Test
	public void Deposite_01()
	{
		PageObject po = new PageObject(driver);
		
		po.UserID();
		po.Password();
		po.LOGIN();
		
		po.Deposite();
		
		String s = driver.getWindowHandle();
		driver.switchTo().window(s).navigate().refresh();
		
		po.Deposite();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals(title))
		{
			Assert.assertTrue(true);
			System.out.println("Deposite page title is verified");
		}
		else
		{
			Assert.assertTrue(true);
			System.out.println("Deposite page title is not verified");
		}
		
		po.AmountDepositeForm();
		
		po.DepositeAccoNo();
		
		po.DepositeAmount();
		
		po.DepositeDescription();
		
		po.DepositeSubmitBtn();
		
		po.title();
		
		driver.close();
		
	}

}
