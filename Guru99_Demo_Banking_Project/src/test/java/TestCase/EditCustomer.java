package TestCase;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.Test;

import TestBases.TestBase;
import TestObject.PageObject;

public class EditCustomer extends TestBase {

	@Test(priority = 1)

	public void EditCustomer1() throws InterruptedException, IOException {
		PageObject po = new PageObject(driver);

		po.UserID(); // send userid
		po.Password(); // send password
		po.LOGIN(); // click on login button

		po.EditCustomer1();

		if (po.EditCustomerText1()) {
			Assert.assertTrue(true);
			System.out.println("Edit Customer Text is verified");
		} else {
			Assert.assertTrue(false);
			System.out.println("Edit Customer Text is not verified");
		}

		String title = driver.getTitle(); // get title
		System.out.println(title); // print title

		if (title.equals(title)) {
			Assert.assertTrue(true);
			System.out.println(" Edit Customer Home page title is verified");
		} else {
			Assert.assertTrue(false);
			System.out.println(" Edit Customer Home page title is not verified");

		}

		String s = driver.getWindowHandle();

		driver.switchTo().window(s).navigate().refresh(); // for handling advertise

		po.EditCustomer1();

		po.CustomerId();

		po.EditCustomerSubmitBtn();

		String title1 = driver.getTitle(); // get title
		System.out.println(title1); // print title

		if (title1.equals(title1)) {
			Assert.assertTrue(true);
			System.out.println(" Edit Customer Entry page title is verified");
		} else {
			Assert.assertTrue(false);
			System.out.println(" Edit Customer Entry page title is not verified");

		}

		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);

		File targate = new File("./Screenshots/Amol_EditCustomer.png");

		FileHandler.copy(source, targate);

//		Thread.sleep(3000);

		po.Address();

		po.city();

		po.State();

		po.pin();

		po.MobileNumber();

		po.Email();

		po.EditCustomerEntryPageSubmitBtn();

//		Thread.sleep(3000);

		po.HandleAlertForEditCustomer();

		driver.close();

	}

}
