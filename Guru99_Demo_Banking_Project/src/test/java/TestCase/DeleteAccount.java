package TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import TestBases.TestBase;
import TestObject.PageObject;

public class DeleteAccount extends TestBase {
	@Test
	public void DeleteAccount_01() {
		PageObject po = new PageObject(driver);

		po.UserID(); // send userid
		po.Password(); // send password
		po.LOGIN(); // click on login button

		po.DeleteAccount();

		String s = driver.getWindowHandle();
		driver.switchTo().window(s).navigate().refresh();

		po.DeleteAccount();

		po.DeleteAccountText();

		String title = driver.getTitle();
		System.out.println(title);

		if (title.equals(title)) {
			Assert.assertTrue(true);
			System.out.println("Delete Customer title is verified");
		} else {
			Assert.assertTrue(false);
			System.out.println("Delete Customer title is not verified");
		}

		po.DeleteAccountNo();

		po.DeleteAccountSubmitBtn();

		po.title();

		po.DeleteAccountThisPageText();

		driver.close();

	}

}
