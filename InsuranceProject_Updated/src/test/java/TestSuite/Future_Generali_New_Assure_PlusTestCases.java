package TestSuite;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.FutureGenerali_SP_TripleAnandPlanPage;
import PageObjects.Future_Generali_New_Assure_PlusPage;
import resources.Utility;

public class Future_Generali_New_Assure_PlusTestCases extends Utility {
	
	WebDriver driver;

	@DataProvider(name = "Future_Generali_New_Assure_Plus_data_provider")
	public Object[][] dpFGMethod() {
		return new Object[][] 
				{
				
			{ "Vaishali", "Warade" ,"15/08/1990","Passport","15","10","Yearly","Yes","Online","Option 1","500000" },
			{ "Vaishali", "Warade" ,"15/08/1990","Passport","10","10","Monthly","Yes","Offline","Option 1","50000" },
				};
	}	
	

	@Test(dataProvider = "Future_Generali_New_Assure_Plus_data_provider")
	public void VerifyFuture_Generali_New_Assure_Plus21018(String firstName, String lastName, String DOB,String ageProof, String PT, String PPT, String Mode, String FutureGroupStaff, String SourcingChannel, String PayoutOption, String SumAssured) throws IOException, InterruptedException {

		// initiate driver

		WebDriver driver;
		driver = intializeDriver();

		// Navigate to URL
		driver.get("http://216.10.244.78:1005/sis/inputfg.aspx?productid=21018");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// created object of page
		Future_Generali_New_Assure_PlusPage objFA21018Page;

		objFA21018Page = new Future_Generali_New_Assure_PlusPage(driver);

		// Enter First Name
		if (objFA21018Page.txtFirstName.isEnabled()) {
			objFA21018Page.txtFirstName.sendKeys(firstName);
			System.out.println("FirstName Entered");
		} else {
			System.out.println("FirstName box not exist");
		}

		// Enter Last Name
		if (objFA21018Page.txtLastName.isEnabled()) {
			objFA21018Page.txtLastName.sendKeys(lastName);
			System.out.println("Lastname Entered");
		} else {
			System.out.println("Lastname box not exist");
		}

		objFA21018Page.txtDOB.sendKeys(DOB);

		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).build().perform();

		Select selectAgeProof = new Select(objFA21018Page.selectAgeProof);
		selectAgeProof.selectByVisibleText(ageProof);
		System.out.print(ageProof);

		if (objFA21018Page.selectAgeProof.isEnabled()) {
			objFA21018Page.selectAgeProof.sendKeys(ageProof);
			System.out.println("Age proof is selected");
		} else {
			System.out.println("Age proof is not selected");
		}

		Select selectPT = new Select(objFA21018Page.selectAgePT);
		selectPT.selectByVisibleText(PT);

		if (objFA21018Page.selectAgePT.isEnabled()) {
			objFA21018Page.selectAgePT.sendKeys(PT);
			System.out.println("PT is selected");
		} else {
			System.out.println("PT is not selected");
		}

		Select selectPPT = new Select(objFA21018Page.selectPPT);
		selectPPT.selectByVisibleText(PPT);

		if (objFA21018Page.selectPPT.isEnabled()) {
			objFA21018Page.selectPPT.sendKeys(PPT);
			System.out.println("PPT is selected");
		} else {
			System.out.println("PPT is not selected");
		}

		Select selectMode = new Select(objFA21018Page.selectMode);
		selectMode.selectByVisibleText(Mode);

		if (objFA21018Page.selectMode.isEnabled()) {
			objFA21018Page.selectMode.sendKeys(Mode);
			System.out.println("Mode is selected");
		} else {
			System.out.println("Mode is not selected");
		}

		Select selectFutureGroupStaff = new Select(objFA21018Page.selectFutureGroupStaff);
		selectFutureGroupStaff.selectByVisibleText(FutureGroupStaff);

		if (objFA21018Page.selectFutureGroupStaff.isEnabled()) {
			objFA21018Page.selectFutureGroupStaff.sendKeys(FutureGroupStaff);
			System.out.println("Future Group Staff is selected");
		} else {
			System.out.println("Future Group Staff is not selected");
		}

		Select selectSourcingChannel = new Select(objFA21018Page.selectSourcingChannel);
		selectSourcingChannel.selectByVisibleText(SourcingChannel);
		
		if (objFA21018Page.selectSourcingChannel.isEnabled()) {
			objFA21018Page.selectSourcingChannel.sendKeys(SourcingChannel);
			System.out.println("Sourcing Channel is selected");
		} else {
			System.out.println("Sourcing Channel is not selected");
		}
		
		Select selectPayoutOption = new Select(objFA21018Page.selectPayoutOption);
		selectPayoutOption.selectByVisibleText(PayoutOption);
		
		if (objFA21018Page.selectPayoutOption.isEnabled()) {
			objFA21018Page.selectPayoutOption.sendKeys(PayoutOption);
			System.out.println("Benefit Payout Option is selected");
		} else {
			System.out.println("Payout Option is not selected");
		}

		objFA21018Page.txtSumAssured.sendKeys(SumAssured);

		objFA21018Page.btnGenerateBI.click();
		
		Thread.sleep(2000);
		
	}

}
