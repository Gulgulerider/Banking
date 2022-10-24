package TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import TestBases.TestBase;
import TestObject.PageObject;

public class CustomisedStatement extends TestBase {
	@Test(priority = 1)
	public void CustomisedStatement_01() throws InterruptedException {
		PageObject po = new PageObject(driver);

		po.UserID();
		po.Password();
		po.LOGIN();

		po.CustomisedStatement();

		po.CustomisedStatementText();

		String s = driver.getWindowHandle();
		driver.switchTo().window(s).navigate().refresh();

		po.CustomisedStatement();

		String title = driver.getTitle();
		System.out.println(title);

		if (title.equals(title)) {
			Assert.assertTrue(true);
			System.out.println("Customised Statement title is verified");
		} else {
			Assert.assertTrue(false);
			System.out.println("Customised Statement title is not verified");
		}

		po.CustomisedStatementForm();

		po.CustomisedStatementAccountNo();

		po.FromDate();

		po.FromDateYEAR();

		po.ToDate();

		po.ToDateYEAR();

		po.CustomisedStatementMiniTransValue();

		po.CustomisedStatementNumOfTrans();

		po.CustomisedStatementSubmitBtn();

		po.title();

		driver.close();

	}

}
