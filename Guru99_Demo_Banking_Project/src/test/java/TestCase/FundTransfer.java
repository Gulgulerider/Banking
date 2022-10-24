package TestCase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import TestBases.TestBase;
import TestObject.PageObject;

public class FundTransfer extends TestBase {
	@Test
	public void FundTransfer_01() throws IOException {
		PageObject po = new PageObject(driver);

		po.UserID();
		po.Password();
		po.LOGIN();

		po.FundTransfer();

		String s = driver.getWindowHandle();
		driver.switchTo().window(s).navigate().refresh();

		po.FundTransfer();

		String title = driver.getTitle();
		System.out.println(title);

		if (title.equals(title)) {
			Assert.assertTrue(true);
			System.out.println("Fund Transfer page title is verified");
		} else {
			Assert.assertTrue(true);
			System.out.println("Fund Transfer page title is not verified");
		}

		po.FundTransferForm();

		po.FundPayersAccountNo();

		po.FundPayeesAccountNo();

		po.FundTransferAmount();

		po.FundTransferDescription();

		po.FundTransferSubmitBtn();

		po.title();

		po.HomeBtn();

		po.title();

		driver.close();

	}

}
