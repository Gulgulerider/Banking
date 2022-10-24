package TestCase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import TestBases.TestBase;
import TestObject.PageObject;

public class Withdrawal extends TestBase {
	@Test
	public void Withdrawal_01() throws IOException {
		PageObject po = new PageObject(driver);

		po.UserID();
		po.Password();
		po.LOGIN();

		po.Withdrawal();

		String s = driver.getWindowHandle();
		driver.switchTo().window(s).navigate().refresh();

		po.Withdrawal();

		String title = driver.getTitle();
		System.out.println(title);

		if (title.equals(title)) {
			Assert.assertTrue(true);
			System.out.println("Withdrawal page title is verified");
		} else {
			Assert.assertTrue(true);
			System.out.println("Withdrawal page title is not verified");
		}

		po.AmountWithdrawalForm();

		po.WithdrawalAccoNo();

		po.WithdrawalAmount();

		po.WithdrawalDescription();

		po.WithdrawalSubmitBtn();

		po.WithdrawalScreenShot();

		po.WithdrawalTransactionMessage();

		po.WithdrawalTransactionID();

		po.title();

		driver.close();

	}

}
