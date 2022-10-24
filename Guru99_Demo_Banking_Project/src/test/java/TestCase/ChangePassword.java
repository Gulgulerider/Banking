package TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import TestBases.TestBase;
import TestObject.PageObject;

public class ChangePassword extends TestBase {

	@Test
	public void ChangePassword_01() {
		PageObject po = new PageObject(driver);

		po.UserID();
		po.Password();
		po.LOGIN();

		po.ChangePassword();

		po.ChangePasswordText();

		String s = driver.getWindowHandle();
		driver.switchTo().window(s).navigate().refresh();

		po.ChangePassword();

		String title = driver.getTitle();
		System.out.println(title);

		if (title.equals(title)) {
			Assert.assertTrue(true);
			System.out.println("Change Password title is verified");
		} else {
			Assert.assertTrue(false);
			System.out.println("Change Password title is not verified");
		}

		po.ChangePasswordForm();

		po.OldPassword();

		po.NewPassword();

		po.ConfirmPassword();

		po.ChangePasswordSubmitBtn();

		po.title();

		driver.close();

	}
}
