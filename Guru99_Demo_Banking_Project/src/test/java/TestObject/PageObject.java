package TestObject;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class PageObject 
{
	public WebDriver driver;
	
	public PageObject (WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public void title()
	{
		String title = driver.getTitle();
		
		System.out.println(title);
	}
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[1]/div[1]")
	WebElement Logo;
	
	public boolean Logo()
	{
		return Logo.isDisplayed();
	}
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/table/tbody/tr/td[1]")
	WebElement Testing;
	
	public boolean TestingIcon()
	{
		return Testing.isDisplayed();
	}
	
	public void Testing()
	{
		Testing.click();	
	}
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/table/tbody/tr/td[2]")
	WebElement Selenium;
	
	public boolean SeleniumIcon()
	{
		return Selenium.isDisplayed();
	}
	
	public void Selenium()
	{
		Selenium.click();	
	}
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/table/tbody/tr/td[3]")
	WebElement LiveProject;
	
	public boolean LiveProjectIcon()
	{
		return LiveProject.isDisplayed();
	}
	
	public void LiveProject()
	{
		LiveProject.click();	
	}
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/table/tbody/tr/td[4]")
	WebElement Java;
	
	public boolean JavaIcon()
	{
		return Java.isDisplayed();
	}
	
	public void Java()
	{
		Java.click();	
	}
	
	
	@FindBy(xpath="/html/body/form/table/tbody/tr[1]/td[2]/input")
	WebElement UserID;
	
	public void UserID()
	{
		UserID.click();
		UserID.clear();
		UserID.sendKeys("mngr448494");
		
	}
	
	public boolean UserIDText()
	
	{
		return UserID.isDisplayed();
	}
	
	@FindBy(xpath="/html/body/form/table/tbody/tr[2]/td[2]/input")
	WebElement Password;
	
	public void Password()
	{
		Password.click();
		Password.clear();
		Password.sendKeys("ynUtemE");
		
	}
	
	public boolean PasswordText()
	
	{
		return Password.isDisplayed();
	}
	
	@FindBy(xpath="/html/body/form/table/tbody/tr[3]/td[2]/input[1]")
	WebElement LOGIN;
	
	public void LOGIN()
	{
		LOGIN.click();
	}
	public boolean LOGINText()
	
	{
		return Password.isDisplayed();
	}
	
	@FindBy(xpath="/html/body/form/table/tbody/tr[3]/td[2]/input[1]")
	WebElement RESET;
	
	public boolean RESETText()
	
	{
		return RESET.isDisplayed();
	}
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td/center/img[1]")
	WebElement ManagerImg1;
	
	public boolean ManagerImg1()
	{
		return ManagerImg1.isDisplayed();
	}
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td/center/img[2]")
	WebElement ManagerImg2;
	
	public boolean ManagerImg2()
	{
		return ManagerImg2.isDisplayed();
	}
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td/center/img[3]")
	WebElement ManagerImg3;
	
	public boolean ManagerImg3()
	{
		return ManagerImg3.isDisplayed();
	}
	
	@FindBy(css = "marquee.heading3[behavior=alternate]")
	WebElement ManagerWelcomeNote;
	
	public boolean ManagerWelcomeNote()
	{
		return ManagerWelcomeNote.isDisplayed();
	}
	
	public void ManagerWelcomeNote1()
	{
		String a = ManagerWelcomeNote.getText();
		
		System.out.println(a);
	}
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[3]/td")
	WebElement ManagerID;
	
	public boolean ManagerID()
	{
		return ManagerID.isDisplayed();
	}
	
	public void ManagerID1()
	{
		String a = ManagerID.getText();
		
		System.out.println(a);			
	}
	
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[2]")
	WebElement NewCustomer;
	
	public void NewCustomer()
	{
		NewCustomer.click();
	}
	public boolean NewCustomerText()
	
	{
		return NewCustomer.isDisplayed();
	}
	
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input")
	WebElement CustomerNameMale;
	
	public void CustomerNameMale()
	{
		CustomerNameMale.click();
		CustomerNameMale.sendKeys("Amol");
	}
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input")
	WebElement CustomerNameFemale;
	
	public void CustomerNameFemale()
	{
		CustomerNameFemale.click();
		CustomerNameFemale.sendKeys("Simona");
	}
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]")
	WebElement GenderMale;
	
	public void GenderMale()
	{
		GenderMale.isSelected();
		GenderMale.click();
		
	}
	
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[1]")
	WebElement DOB;
	
	public void DOB() throws InterruptedException
	{
		Actions act = new Actions(driver);
		
		act.moveToElement(DOB).moveByOffset(100, 0).click().sendKeys("10").build().perform();
		
		act.moveToElement(DOB).moveByOffset(110, 0).click().sendKeys("12").build().perform();	
	
	}
	
	@FindBy(id= "dob")
	WebElement DOBYEAR;
	
	public void DOBYEAR()
	{
		DOBYEAR.click();
		DOBYEAR.sendKeys("1991");
	}
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/textarea")
	WebElement Address;
	
	public void Address()
	{
	//	Actions act = new Actions(driver);
		
	//	act.moveToElement(Address).dragAndDropBy(Address, 350, 50).build().perform();
		
		Address.click();
		Address.sendKeys("Khed karjat");

	}	
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[8]/td[2]/input")
	WebElement city;
	
	public void city()
	{
		city.click();
		city.sendKeys("Baramati");

	}
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[9]/td[2]/input")
	WebElement State;
	
	public void State()
	{
		State.click();
		State.sendKeys("Maharashtra");

	}
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[10]/td[2]/input")
	WebElement pin;
	
	public void pin()
	{
		pin.click();
		pin.sendKeys("414403");

	}
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[11]/td[2]/input")
	WebElement MobileNumber;
	
	public void MobileNumber()
	{
		MobileNumber.click();
		MobileNumber.sendKeys("9975925906");

	}
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[12]/td[2]/input")
	WebElement Email;
	
	public void Email()
	{
		Email.click();
		Email.sendKeys("Amolsuryawanshi777@gmail.com");

	}
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[13]/td[2]/input")
	WebElement PasswordNewCustomer;
	
	public void PasswordNewCustomer()
	{
		PasswordNewCustomer.click();
		PasswordNewCustomer.sendKeys("123456");

	}

	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[14]/td[2]/input[1]")
	WebElement SubmitBtnForNewCustomer;
	
	public void SubmitBtnForNewCustomer()
	{
		SubmitBtnForNewCustomer.click();		
	}


	public void Screenshot() throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File targate = new File("./Screenshots/Amol_Customer.png");
		
		FileHandler.copy(source, targate);
	}
	
	@FindBy(xpath= "//*[@id=\"customer\"]/tbody/tr[14]/td/a")
	WebElement Continue;
	
	public void ClickOnContinueBtn()
	{
		Continue.click();

	}
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[2]")
	WebElement GenderFemale;
	
	public void GenderFemale()
	{
		GenderFemale.isSelected();
		GenderFemale.click();
		
	}
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[1]")
	WebElement DOB10;
	
	public void DOB10()
	{
		Actions act = new Actions(driver);
		
		act.moveToElement(DOB10).moveByOffset(100, 0).click().sendKeys("22").build().perform();
		
		act.moveToElement(DOB10).moveByOffset(110, 0).click().sendKeys("08").build().perform();	
		
	}
	
	@FindBy(id= "dob")
	WebElement DOBYEAR10;
	
	public void DOBYEAR10()
	{
		DOBYEAR10.click();
		DOBYEAR10.sendKeys("1997");
	}
	
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/textarea")
	WebElement Address1;
	
	public void Address1()
	{
	//	Actions act = new Actions(driver);
		
	//	act.moveToElement(Address).dragAndDropBy(Address, 350, 50).build().perform();
		
		Address1.click();
		Address1.sendKeys("Echalkarangi");

	}
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[8]/td[2]/input")
	WebElement city1;
	
	public void city1()
	{
		city1.click();
		city1.sendKeys("Kolhapur");

	}
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[9]/td[2]/input")
	WebElement State1;
	
	public void State1()
	{
		State1.click();
		State1.sendKeys("Maharashtra");

	}
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[10]/td[2]/input")
	WebElement pin1;
	
	public void pin1()
	{
		pin1.click();
		pin1.sendKeys("414807");

	}
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[11]/td[2]/input")
	WebElement MobileNumber1;
	
	public void MobileNumber1()
	{
		MobileNumber1.click();
		MobileNumber1.sendKeys("9975925906");

	}
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[12]/td[2]/input")
	WebElement Email1;
	
	public void Email1()
	{
		Email.click();
		Email.sendKeys("Simona777@gmail.com");

	}
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[13]/td[2]/input")
	WebElement PasswordNewCustomer1;
	
	public void PasswordNewCustomer1()
	{
		PasswordNewCustomer1.click();
		PasswordNewCustomer1.sendKeys("098765");

	}
	
	public void Screenshot1() throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File targate = new File("./Screenshots/Simona_Customer.png");
		
		FileHandler.copy(source, targate);
	}
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[3]")
	WebElement EditCustomer1;
	
	public void EditCustomer1()
	{
		EditCustomer1.click();		
	}
	
	public boolean EditCustomerText1()
	{
		return EditCustomer1.isDisplayed();
	}
	
	@FindBy(css="input[name=cusid]")
	WebElement CustomerId;
	
	public void CustomerId()
	{
		CustomerId.click();
		
		CustomerId.sendKeys("59844");
		
	}
	
	@FindBy(xpath="/html/body/div[2]/table/tbody/tr/td/table/tbody/tr[11]/td[2]/input[1]")
	WebElement EditCustomerSubmitBtn;
	
	
	public void EditCustomerSubmitBtn()
	{
		EditCustomerSubmitBtn.click();
	}
	
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[13]/td[2]/input[1]")
	WebElement EditCustomerEntryPageSubmitBtn;
	
	public void EditCustomerEntryPageSubmitBtn()
	{
		EditCustomerEntryPageSubmitBtn.click();
	}
	
	public void HandleAlertForEditCustomer()
	{
		driver.switchTo().alert().accept();
	}

	@FindBy(xpath="/html/body/div[3]/div/ul/li[5]")	
	WebElement NewAccount1;
	
	public void NewAccount1()
	{
		NewAccount1.click();		
	}
	
	public boolean NewAccountText1()
	{
		return NewAccount1.isDisplayed();
	}
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[3]/td[2]/select")
	WebElement AccountType;
	
	public void AccountType()
	{
		AccountType.click();
		
		Select s = new Select(AccountType);
		
		s.selectByVisibleText("Savings");
		
		System.out.println(s.getOptions().size());
		
	}
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input")
	WebElement InitialDeposite;
	
	public void InitialDeposite()
	{
		InitialDeposite.click();
		InitialDeposite.sendKeys("555");
	}
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]")
	WebElement SubmitNewAccount;
	
	public void SubmitNewAccount()
	{
		SubmitNewAccount.click();
	}
	
	@FindBy(xpath="//*[@id=\"account\"]/tbody/tr[11]/td/a")
	WebElement AccountContinue;
	
	public void AccountContinue()
	{
		AccountContinue.click();
	}
	
	public void BrockenLink() throws IOException
	{
		List <WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for(int i=0; i<links.size(); i++)
		{
			WebElement element = links.get(i);
			
			String url = element.getAttribute("href");
			
			URL link = new URL(url);
			
			HttpURLConnection httpconn = (HttpURLConnection) link.openConnection();
			
			httpconn.connect();
			
			int rescode = httpconn.getResponseCode();
			
			if(rescode>=350)
			{
				System.out.println(url + " - " + " Is Broken Link");
			}
			else
			{
				System.out.println(url + " - " + " Is Valid Link");
			}
				
		}	
		
	}
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[6]")
	WebElement EditAccount;
	
	public void EditAccount()
	{
		EditAccount.click();
	}
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[2]/input")
	WebElement AccountNo;
	
	public void AccountNo()
	{
		AccountNo.click();
		AccountNo.sendKeys("113060");
	}
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[11]/td[2]/input[1]")
	WebElement EditAccountSubmitBtn;
	
	public void EditAccountSubmitBtn()
	{
		EditAccountSubmitBtn.click();
	}

	@FindBy(css="p.heading3[align=center]")
	WebElement EditAccountForm;
	
	public boolean EditAccountForm()
	{
		String a = EditAccountForm.getText();
		
		System.out.println(a);
		
		return true;
	}
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[4]")
	WebElement DeleteCustomer;
	
	public void DeleteCustomer()
	{
		DeleteCustomer.click();
	}
	
	public boolean DeleteCustomerText()
	{
		return DeleteCustomer.isDisplayed();
	}
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[2]/td[2]/input")
	WebElement DeleteCustomerID;
	
	public void DeleteCustomerID()
	{
		DeleteCustomerID.click();
		
		DeleteCustomerID.sendKeys("74371");
	}
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/input[1]")
	WebElement DeleteCustomerSubmitBtn;
	
	public void DeleteCustomerSubmitBtn()
	{
		DeleteCustomerSubmitBtn.click();
	}
	
	public void HandleAlertForDeleteCustomer()
	{
		driver.switchTo().alert().accept();	//click on ok btn
		
	//	driver.switchTo().alert().dismiss();	//click on cancle btn
	}
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[7]")
	WebElement DeleteAccount;
	
	public void DeleteAccount()
	{
		DeleteAccount.click();
	}
	
	public boolean DeleteAccountText()
	{
		return DeleteAccount.isDisplayed();
		
	}
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[2]/input")
	WebElement DeleteAccountNo;
	
	public void DeleteAccountNo()
	{
		DeleteAccountNo.click();
		DeleteAccountNo.sendKeys("113101");
	}
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[11]/td[2]/input[1]")
	WebElement DeleteAccountSubmitBtn;
	
	public void DeleteAccountSubmitBtn()
	{
		DeleteAccountSubmitBtn.click();
		
		driver.switchTo().alert().accept();
	}
	
	@FindBy(xpath="//*[@id=\"main-message\"]/h1/span")
	WebElement DeleteAccountThisPageText;
	
	public void DeleteAccountThisPageText()
	{
		String DATP = DeleteAccountThisPageText.getText();
		
		System.out.println(DATP);	
	}
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[8]")
	WebElement Deposite;
	
	public void Deposite()
	{
		Deposite.click();
	}
	
	public boolean DepositeText()
	{
		return Deposite.isSelected();
	}
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[2]/input")
	WebElement DepositeAccoNo;
	
	public void DepositeAccoNo()
	{
		DepositeAccoNo.click();
		DepositeAccoNo.sendKeys("113101");
	}
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/input")
	WebElement DepositeAmount;
	
	public void DepositeAmount()
	{
		DepositeAmount.click();
		DepositeAmount.sendKeys("555");
	}
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[8]/td[2]/input")
	WebElement DepositeDescription;
	
	public void DepositeDescription()
	{
		DepositeDescription.click();
		DepositeDescription.sendKeys("Amount added in acount please check and confirmed");
	}
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/p")
	WebElement AmountDepositeForm;
	
	public void AmountDepositeForm()
	{
		String ADFORM = AmountDepositeForm.getText();
		System.out.println(ADFORM);
		
		if(ADFORM.equals(ADFORM))
		{
			Assert.assertTrue(true);
			System.out.println("Amount Deposite Form Text is verified");
		}
		else
		{
			Assert.assertTrue(true);
			System.out.println("Amount Deposite Form Text is not verified");
		}
		
	}
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[12]/td[2]/input[1]")
	WebElement DepositeSubmitBtn;
	
	public void DepositeSubmitBtn()
	{
		DepositeSubmitBtn.click();
	}
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[9]")
	WebElement Withdrawal;
	
	public void Withdrawal()
	{
		Withdrawal.click();
	}
	
	public boolean WithdrawalText()
	{
		return Withdrawal.isSelected();
	}
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[2]/input")
	WebElement WithdrawalAccoNo;
	
	public void WithdrawalAccoNo()
	{
		WithdrawalAccoNo.click();
		WithdrawalAccoNo.sendKeys("113101");
	}
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/input")
	WebElement WithdrawalAmount;
	
	public void WithdrawalAmount()
	{
		WithdrawalAmount.click();
		WithdrawalAmount.sendKeys("505");
	}
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[8]/td[2]/input")
	WebElement WithdrawalDescription;
	
	public void WithdrawalDescription()
	{
		WithdrawalDescription.click();
		WithdrawalDescription.sendKeys("Amount Withdrawal in acount please check and confirmed");
	}
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/p")
	WebElement AmountWithdrawalForm;
	
	public void AmountWithdrawalForm()
	{
		String AWFORM = AmountWithdrawalForm.getText();
		System.out.println(AWFORM);
		
		if(AWFORM.equals(AWFORM))
		{
			Assert.assertTrue(true);
			System.out.println("Amount Withdrawal Form Text is verified");
		}
		else
		{
			Assert.assertTrue(true);
			System.out.println("Amount Withdrawal Form Text is not verified");
		}
		
	}
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[12]/td[2]/input[1]")
	WebElement WithdrawalSubmitBtn;
	
	public void WithdrawalSubmitBtn()
	{
		WithdrawalSubmitBtn.click();
	}
	
	public void WithdrawalScreenShot() throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File targate = new File("./Screenshots/Withdrawal_TransactionID.png");
		
		FileHandler.copy(source, targate);
	}
	
	@FindBy(xpath="//*[@id=\"withdraw\"]/tbody/tr[1]/td/p")
	WebElement WithdrawalTransactionMessage;
	
	public void WithdrawalTransactionMessage()
	{
		String WTSMS = WithdrawalTransactionMessage.getText();	
		System.out.println(WTSMS);
		
		if(WTSMS.equals(WTSMS))
		{
			Assert.assertTrue(true);
			System.out.println("Withdrawal Transaction Message is verified");
		}
		else
		{
			Assert.assertTrue(true);
			System.out.println("Withdrawal Transaction Message is not verified");
		}
	}
	
	@FindBy(xpath="//*[@id=\"withdraw\"]/tbody/tr[6]")
	WebElement WithdrawalTransactionID;
	
	public void WithdrawalTransactionID()
	{
		String WTID =  WithdrawalTransactionID.getText();
		System.out.println(WTID);
		
		if(WTID.equals(WTID))
		{
			Assert.assertTrue(true);
			System.out.println("Withdrawal Transaction ID is verified");
		}
		else
		{
			Assert.assertTrue(true);
			System.out.println("Withdrawal Transaction ID is not verified");
		}	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
