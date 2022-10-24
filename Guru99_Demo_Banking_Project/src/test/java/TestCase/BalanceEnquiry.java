package TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import TestBases.TestBase;
import TestObject.PageObject;

public class BalanceEnquiry extends TestBase {
	@Test
	public void BalanceEnquiry_01() {
		PageObject po = new PageObject(driver);

		po.UserID();
		po.Password();
		po.LOGIN();

		po.BalanceEnquiry();

		po.BalanceEnquiryText();

		String s = driver.getWindowHandle();
		driver.switchTo().window(s).navigate().refresh();

		po.BalanceEnquiry();

		String title = driver.getTitle();
		System.out.println(title);

		if (title.equals(title)) {
			Assert.assertTrue(true);
			System.out.println("Balance Enquiry title is verified");
		} else {
			Assert.assertTrue(false);
			System.out.println("Balance Enquiry title is not verified");
		}

		po.BalanceEnquiryForm();

		po.BalanceAccountNo();

		po.BalanceSubmitBtn();

		po.title();

		driver.close();

	}

}
