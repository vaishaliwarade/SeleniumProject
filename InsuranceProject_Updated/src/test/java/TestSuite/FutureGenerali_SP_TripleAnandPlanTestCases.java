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
import resources.Utility;

public class FutureGenerali_SP_TripleAnandPlanTestCases extends Utility {
	WebDriver driver;

	@DataProvider(name = "FutureGenerali_SP_TripleAnandPlan_data_provider")
	public Object[][] dpFGMethod() {
		return new Object[][] 
				{
				
			{ "Vaishali", "Warade" ,"15/08/1990","Passport","20","15","Yearly","Yes","Online","5000" },
			{ "Vaishali", "Warade" ,"15/08/1990","Passport","20","15","Yearly","Yes","Offline","50000" },
				};
	}	
	

	@Test(dataProvider = "FutureGenerali_SP_TripleAnandPlan_data_provider")
	public void VerifyFutureGenerali_SP_TripleAnandPlan21019(String firstName, String lastName, String DOB,String ageProof, String PT, String PPT, String Mode, String FutureGroupStaff, String SourcingChannel, String SumAssured) throws IOException, InterruptedException {

		// initiate driver

		WebDriver driver;
		driver = intializeDriver();

		// Navigate to URL
		driver.get("http://13.234.16.249:1005/sis/inputfg.aspx?productid=21019");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// created object of page
		FutureGenerali_SP_TripleAnandPlanPage objFA21019Page;

		objFA21019Page = new FutureGenerali_SP_TripleAnandPlanPage(driver);

		// Enter First Name
		if (objFA21019Page.txtFirstName.isEnabled()) {
			objFA21019Page.txtFirstName.sendKeys(firstName);
			System.out.println("FirstName Entered");
		} else {
			System.out.println("FirstName box not exist");
		}

		// Enter Last Name
		if (objFA21019Page.txtLastName.isEnabled()) {
			objFA21019Page.txtLastName.sendKeys(lastName);
			System.out.println("Lastname Entered");
		} else {
			System.out.println("Lastname box not exist");
		}

		objFA21019Page.txtDOB.sendKeys(DOB);

		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).build().perform();

		Select selectAgeProof = new Select(objFA21019Page.selectAgeProof);
		selectAgeProof.selectByVisibleText(ageProof);
		System.out.print(ageProof);

		if (objFA21019Page.selectAgeProof.isEnabled()) {
			objFA21019Page.selectAgeProof.sendKeys(ageProof);
			System.out.println("Age proof is selected");
		} else {
			System.out.println("Age proof is not selected");
		}

		Select selectPT = new Select(objFA21019Page.selectAgePT);
		selectPT.selectByVisibleText(PT);

		if (objFA21019Page.selectAgePT.isEnabled()) {
			objFA21019Page.selectAgePT.sendKeys(PT);
			System.out.println("PT is selected");
		} else {
			System.out.println("PT is not selected");
		}

		Select selectPPT = new Select(objFA21019Page.selectPPT);
		selectPPT.selectByVisibleText(PPT);

		if (objFA21019Page.selectPPT.isEnabled()) {
			objFA21019Page.selectPPT.sendKeys(PPT);
			System.out.println("PPT is selected");
		} else {
			System.out.println("PPT is not selected");
		}

		Select selectMode = new Select(objFA21019Page.selectMode);
		selectMode.selectByVisibleText(Mode);

		if (objFA21019Page.selectMode.isEnabled()) {
			objFA21019Page.selectMode.sendKeys(Mode);
			System.out.println("Mode is selected");
		} else {
			System.out.println("Mode is not selected");
		}

		Select selectFutureGroupStaff = new Select(objFA21019Page.selectFutureGroupStaff);
		selectFutureGroupStaff.selectByVisibleText(FutureGroupStaff);

		if (objFA21019Page.selectFutureGroupStaff.isEnabled()) {
			objFA21019Page.selectFutureGroupStaff.sendKeys(FutureGroupStaff);
			System.out.print("Future Group Staff is selected");
		} else {
			System.out.println("Future Group Staff is not selected");
		}

		Select selectSourcingChannel = new Select(objFA21019Page.selectSourcingChannel);
		selectSourcingChannel.selectByVisibleText(SourcingChannel);
		System.out.println(SourcingChannel);

		objFA21019Page.txtSumAssured.sendKeys(SumAssured);
		System.out.println(SumAssured);
		System.out.println("\r\n");
		objFA21019Page.btnGenerateBI.click();
		
		Thread.sleep(2000);
		
		objFA21019Page.Error.isDisplayed();
		System.out.println(objFA21019Page.Error.getText());
		
		if(objFA21019Page.Error.isDisplayed()) {
			System.out.println("Validation Error displayed\r\n");
		} else {
			System.out.println("No validation error\r\n");
		}

	

		// driver.close();

}
}