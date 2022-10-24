package TestCase;

import org.testng.annotations.Test;

import TestBases.TestBase;
import TestObject.PageObject;

public class EditAccount extends TestBase {
	@Test(priority = 1)
	public void EditAccount_01() {
		PageObject po = new PageObject(driver);

		po.UserID(); // send userid
		po.Password(); // send password
		po.LOGIN(); // click on login button

		po.EditAccount(); // click on edit account btn

		String s = driver.getWindowHandle();
		driver.switchTo().window(s).navigate().refresh();

		po.EditAccount(); // click on edit account btn

		po.title();

		po.AccountNo(); // click and send account number

		po.EditAccountForm(); // print edit account form

		if (po.EditAccountForm()) {
			System.out.println("Edit Account Form Text is verified");
		} else {
			System.out.println("Edit Account Form Text is not verified");
		}

		po.EditAccountSubmitBtn();

		po.title();

		driver.close();
	}

}
