package TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import TestBases.TestBase;
import TestObject.PageObject;

public class Manager extends TestBase {
	@Test
	public void Manager_01() {
		PageObject po = new PageObject(driver);

		po.UserID(); // send userid
		po.Password(); // send password
		po.LOGIN(); // click on login button

		String title = driver.getTitle();

		System.out.println(title);

		if (title.equals(title)) {
			System.out.println("Manager page title is verified");
		} else {
			System.out.println("Manager page title is not verified");
		}

		po.ManagerImg1();

		if (po.ManagerImg1()) {
			Assert.assertTrue(true);
			System.out.println("Manager Img1 is verified");
		} else {
			Assert.assertTrue(false);
			System.out.println("Manager Img1 is not verified");
		}

		po.ManagerImg2();

		if (po.ManagerImg2()) {
			Assert.assertTrue(true);
			System.out.println("Manager Img2 is verified");
		} else {
			Assert.assertTrue(false);
			System.out.println("Manager Img2 is not verified");
		}

		po.ManagerImg3();

		if (po.ManagerImg3()) {
			Assert.assertTrue(true);
			System.out.println("Manager Img3 is verified");
		} else {
			Assert.assertTrue(false);
			System.out.println("Manager Img3 is not verified");
		}

		po.ManagerWelcomeNote();

		po.ManagerWelcomeNote1();

		if (po.ManagerWelcomeNote()) {
			Assert.assertTrue(true);
			System.out.println("Manager Welcome Note is verified");
		} else {
			Assert.assertTrue(false);
			System.out.println("Manager Welcome Note is not verified");
		}

		po.ManagerID();

		po.ManagerID1();

		if (po.ManagerID()) {
			Assert.assertTrue(true);
			System.out.println("Manager ID Text is verified");
		} else {
			Assert.assertTrue(false);
			System.out.println("Manager ID Text is not verified");
		}

		driver.close();

	}

}
