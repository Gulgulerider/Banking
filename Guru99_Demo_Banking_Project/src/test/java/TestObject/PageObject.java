package TestObject;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject 
{
	public WebDriver driver;
	
	public PageObject (WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
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
	
	
	@FindBy(id = "dob")
	WebElement DOB;
	
	public void DOB() throws InterruptedException
	{
		DOB.click();
		
		DOB.sendKeys("10121991");
		
//		Thread.sleep(3000);
//		
//		DOB.sendKeys("12");
////		
//		Thread.sleep(3000);
//		
//		DOB.sendKeys("1991");
//		
//		Thread.sleep(3000);
		
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
		
		File targate = new File("./ScreenShots/New_Customer.png");
		
		FileHandler.copy(source, targate);
	}
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[2]")
	WebElement GenderFemale;
	
	public void GenderFemale()
	{
		GenderFemale.isSelected();
		GenderFemale.click();
		
	}
	
	@FindBy(id = "dob")
	WebElement DOB1;
	
	public void DOB1()
	{
		DOB1.click();
		
		DOB1.sendKeys("21");
		
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
		MobileNumber1.sendKeys("9109876543");

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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
