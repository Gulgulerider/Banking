package TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import TestBases.TestBase;
import TestObject.PageObject;

public class MiniStatement extends TestBase {
	@Test
	public void MiniStatement_01() {
		PageObject po = new PageObject(driver);

		po.UserID();
		po.Password();
		po.LOGIN();

		po.MiniStatement();

		po.MiniStatementText();

		String s = driver.getWindowHandle();
		driver.switchTo().window(s).navigate().refresh();

		po.MiniStatement();

		String title = driver.getTitle();
		System.out.println(title);

		if (title.equals(title)) {
			Assert.assertTrue(true);
			System.out.println("Mini Statement title is verified");
		} else {
			Assert.assertTrue(false);
			System.out.println("Mini Statement title is not verified");
		}

		po.MiniStatementForm();

		po.MiniStatementAccountNo();

		po.MiniStatementSubmitBtn();

		po.title();

		driver.close();

	}

}
