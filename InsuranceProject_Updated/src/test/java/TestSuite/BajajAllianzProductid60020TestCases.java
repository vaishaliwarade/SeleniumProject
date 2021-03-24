package TestSuite;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import PageObjects.BajajAllianzProductid60020Page;
import resources.Utility;

public class BajajAllianzProductid60020TestCases extends Utility {

	WebDriver driver;
	BajajAllianzProductid60020Page objBA60020Page;

	@DataProvider(name = "BajajAllianz600200_data_provider")
	public Object[][] dpBajajAllianz600200() {
		return new Object[][] 
				{ { "Vaishali","Warade","F","1990","Aug","5","400701","MAHARASHTRA","15","5","Annual","15000" },
				  { "Vaishali","Warade","F","1990","Aug","5","400701","MAHARASHTRA","10","7","Monthly","1000" },
		          { "Jyoti","Chopade","F", "1991","Jul","21","400701","MAHARASHTRA","15", "5", "Quarterly","15000"},
		          { "Pratyush","Singh","M","1990","Nov","17","400701","MAHARASHTRA","15", "5", "Semi-Annual","15000"},
				};
	}
	
	@Test(dataProvider = "BajajAllianz600200_data_provider")
	public void BajajAllianzProduct60020(String firstName,String lastName, String Gender, String DOBYear,String DOBMonth, String DOBDate,String pinCode,String State,
			String strPT,String strPPT,String Mode,String ModePremium) throws IOException, InterruptedException {
		
		//initiate driver
		WebDriver driver;	
		driver = intializeDriver();
		
		//Navigate to URL
		driver.get("http://216.10.244.78:1010/sis/input.aspx?productid=60020");
		driver.manage().window().maximize();
		
		//created object of page BajajAllianzProductid60020Page
		BajajAllianzProductid60020Page objBA60020Page;
		
		objBA60020Page = new BajajAllianzProductid60020Page(driver);
		
		//Enter First Name
		if (objBA60020Page.txtFirstName.isEnabled()) {
			objBA60020Page.txtFirstName.sendKeys(firstName);
			System.out.println("FirstName Entered");
		}
		else {
			System.out.println("FirstName box not exist");
		}
		
		//Enter Last Name
		if (objBA60020Page.txtLastName.isEnabled()) {
			objBA60020Page.txtLastName.sendKeys(lastName);
			System.out.println("Lastname Entered");
		}
		else {
			System.out.println("Lastname box not exist");
		}
		
		//Select Gender
		if (objBA60020Page.selectGender.isDisplayed()) {
			Select selectGender = new Select(objBA60020Page.selectGender);
			selectGender.selectByValue(Gender);
			System.out.println("Gender is selected");
		}
		else {
			System.out.println("Gender box not exist");
		}
		
		//Select Date of Birth
		//driver.findElement(By.id("txtAge")).click();
		objBA60020Page.selectAge.click();		
		dateSelect(DOBYear, DOBMonth, DOBDate);
		
		//Select pinCode
		objBA60020Page.txtPinCode.sendKeys(pinCode);
		
		//Select state
		Select state = new Select(objBA60020Page.selectSalesState);
		state.selectByVisibleText(State);

		//Select PT
		Select PT = new Select(objBA60020Page.selectPT);
		PT.selectByVisibleText(strPT);
		
		//Select PPT
		Select PPT = new Select(objBA60020Page.selectPPT);
		PPT.selectByVisibleText(strPPT);
		
		//Select Mode
		Select mode = new Select(objBA60020Page.selecMode);
		mode.selectByVisibleText(Mode);
		
		//Enter Premium Amount
		objBA60020Page.txtMP.sendKeys(ModePremium);
		
		//Click on Generate BI button
		objBA60020Page.btnGenerateBI.click();
		
		Thread.sleep(25000);

		WebDriverWait wait = new WebDriverWait(driver, 20); //you can play with the time integer  to wait for longer than 15 seconds.
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//text()[contains(.,'Download PDF')]/ancestor::button[1]"))); //if you want to wait for a particular title to show up
		
		//This code is to scoll down till the element
		WebElement Element = driver.findElement(By.xpath("//text()[contains(.,'Download PDF')]/ancestor::button[1]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;

        //This will scroll the page till the element is found		
        js.executeScript("arguments[0].scrollIntoView();", Element);
		
        //Click on Download PDF button
		driver.findElement(By.xpath("//text()[contains(.,'Download PDF')]/ancestor::button[1]")).click();
		
		driver.close();

	}
/*
	@AfterSuite
	public void Close() throws IOException {
		//closeDriver(driver);
	}
*/
}
