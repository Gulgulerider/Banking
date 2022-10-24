package TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import TestBases.TestBase;
import TestObject.PageObject;

public class LogOut extends TestBase {
	@Test
	public void LogOut_01() {

		PageObject po = new PageObject(driver);

		po.UserID();
		po.Password();
		po.LOGIN();

		po.title();

		po.LogOutText();

		po.LogOut();

		String title = driver.getTitle();
		System.out.println(title);

		if (title.equals("Guru99 Bank Home Page")) {
			Assert.assertTrue(true);
			System.out.println("Guru99 Bank Home Page title is verified");
		} else {
			Assert.assertTrue(false);
			System.out.println("Guru99 Bank Home Page title is not verified");
		}

		driver.close();

	}

}
