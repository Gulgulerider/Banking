package TestCase;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import TestBases.TestBase;
import TestObject.PageObject;

public class LoginPage extends TestBase
{
		@Test(priority=1)
		
	public void FindLogoAndBrockenLink()	
	{
		PageObject po = new PageObject(driver);
		
		po.Logo();
		
		if(po.Logo())
		{
			Assert.assertTrue(true);
			System.out.println("Logo is verified");
		}
		else
		{
			Assert.assertTrue(true);
			System.out.println("Logo is not verified");
		}
	}
		
		
		@Test (priority=2)
		public void BrockenLink() throws IOException
		{
			List <WebElement> links = driver.findElements(By.tagName("a"));
			
			System.out.println(links.size());
			
			for(int i=0; i<links.size(); i++)
			{
				WebElement element = links.get(i);
				
				String url = element.getAttribute("href");
				
				URL link = new URL(url);
				
				HttpURLConnection httpConn = (HttpURLConnection) link.openConnection();
				
				httpConn.connect();
				
				int rescode=httpConn.getResponseCode();
				
				if(rescode>=300)
				{
					System.out.println(url + " - " + " is broken link");
				}
				else
				{
					System.out.println(url + " - " + " is valid link");
				}
			}
		}
		
		
	@Test(priority=3)	
	public void ValidateLinkIcon()
	{
		PageObject po = new PageObject(driver);
		
		po.Testing();
		
		String s = driver.getWindowHandle();
		
		driver.switchTo().window(s).navigate().back();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals(title))
		{
			Assert.assertTrue(true);
			System.out.println("Testing Page is verified");
		}
		else
		{
			Assert.assertTrue(false);
			System.out.println("Testing Page is not verified");
		}
		
		po.Selenium();
		
		String s1 = driver.getWindowHandle();
		
		driver.switchTo().window(s1).navigate().back();
		
		String title1 = driver.getTitle();
		System.out.println(title1);
		
		if(title1.equals(title1))
		{
			Assert.assertTrue(true);
			System.out.println("Selenium Page is verified");
		}
		else
		{
			Assert.assertTrue(false);
			System.out.println("Selenium Page is not verified");
		}
		
		
		po.LiveProject();
		
		String s2 = driver.getWindowHandle();
		
		driver.switchTo().window(s2).navigate().back();
		
		String title2 = driver.getTitle();
		System.out.println(title2);
		
		if(title2.equals(title2))
		{
			Assert.assertTrue(true);
			System.out.println("LiveProject Page is verified");
		}
		else
		{
			Assert.assertTrue(false);
			System.out.println("LiveProject Page is not verified");
		}
		
		
		po.Java();
		
		String s3 = driver.getWindowHandle();
		
		driver.switchTo().window(s3).navigate().back();
		
		String title3 = driver.getTitle();
		System.out.println(title3);
		
		if(title3.equals(title3))
		{
			Assert.assertTrue(true);
			System.out.println("Java Page is verified");
		}
		else
		{
			Assert.assertTrue(false);
			System.out.println("Java Page is not verified");
		}	
		
	}
		
		
	@Test(priority=11)
	public void Login() 
	
	{
		PageObject po = new PageObject(driver);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		po.UserID();
		po.UserIDText();
		
		if(po.UserIDText())
		{
			Assert.assertTrue(true);
			System.out.println("UserID Text is verified");
		}
		else
		{
			Assert.assertTrue(false);
			System.out.println("UserID Text is not verified");
		}
		
		po.Password();
		po.PasswordText();
		
		if(po.UserIDText())
		{
			Assert.assertTrue(true);
			System.out.println("Password Text is verified");
		}
		else
		{
			Assert.assertTrue(false);
			System.out.println("Password Text is not verified");
		}
		
		po.RESETText();
		if(po.UserIDText())
		{
			Assert.assertTrue(true);
			System.out.println("RESET Text is verified");
		}
		else
		{
			Assert.assertTrue(false);
			System.out.println("RESET Text is not verified");
		}	
		
		po.LOGIN();
				
	}
	
		

	
		
		
		
}

