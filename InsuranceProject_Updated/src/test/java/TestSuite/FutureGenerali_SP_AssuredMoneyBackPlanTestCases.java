package TestSuite;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.FutureGenerali_SP_AssuredMoneyBackPlan;
import resources.Utility;

public class FutureGenerali_SP_AssuredMoneyBackPlanTestCases extends Utility {
	
	WebDriver driver;

	@DataProvider(name = "FutureGenerali_SP_AssuredMoneyBackPlan_data_provider")
	public Object[][] dpFGMethod() {
		return new Object[][] 
				{
				
			{ "Vaishali", "Warade" ,"15/08/1990","Passport","10","5","Yearly","Online","Yes","B","100000" },
			{ "Vaishali", "Warade" ,"15/08/1990","Passport","10","5","Yearly","Online","Yes","B","100000" },
				};
	}	
	

	@Test(dataProvider = "FutureGenerali_SP_AssuredMoneyBackPlan_data_provider")
	public void VerifyFutureGenerali_SP_AssuredMoneyBackPlan21014(String firstName, String lastName, String DOB,String ageProof, String PT, String PPT, String Mode, String FutureGroupStaff,String SourcingChannel,String Option, String SumAssured) throws IOException, InterruptedException {

		// initiate driver

		WebDriver driver;
		driver = intializeDriver();

		// Navigate to URL
		driver.get("http://13.234.16.249:1005/sis/inputfg.aspx?productid=21014");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// created object of page
		FutureGenerali_SP_AssuredMoneyBackPlan objFA21014Page;

		objFA21014Page = new FutureGenerali_SP_AssuredMoneyBackPlan(driver);

		// Enter First Name
		if (objFA21014Page.txtFirstName.isEnabled()) {
			objFA21014Page.txtFirstName.sendKeys(firstName);
			System.out.println("FirstName Entered");
		} else {
			System.out.println("FirstName box not exist");
		}

		// Enter Last Name
		if (objFA21014Page.txtLastName.isEnabled()) {
			objFA21014Page.txtLastName.sendKeys(lastName);
			System.out.println("Lastname Entered");
		} else {
			System.out.println("Lastname box not exist");
		}

		objFA21014Page.txtDOB.sendKeys(DOB);

		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).build().perform();

		Select selectAgeProof = new Select(objFA21014Page.selectAgeProof);
		selectAgeProof.selectByVisibleText(ageProof);
		System.out.print(ageProof);

		if (objFA21014Page.selectAgeProof.isEnabled()) {
			objFA21014Page.selectAgeProof.sendKeys(ageProof);
			System.out.println("Age proof is selected");
		} else {
			System.out.println("Age proof is not selected");
		}

		Select selectPT = new Select(objFA21014Page.selectAgePT);
		selectPT.selectByVisibleText(PT);

		if (objFA21014Page.selectAgePT.isEnabled()) {
			objFA21014Page.selectAgePT.sendKeys(PT);
			System.out.println("PT is selected");
		} else {
			System.out.println("PT is not selected");
		}

		Select selectPPT = new Select(objFA21014Page.selectPPT);
		selectPPT.selectByVisibleText(PPT);

		if (objFA21014Page.selectPPT.isEnabled()) {
			objFA21014Page.selectPPT.sendKeys(PPT);
			System.out.println("PPT is selected");
		} else {
			System.out.println("PPT is not selected");
		}

		Select selectMode = new Select(objFA21014Page.selectMode);
		selectMode.selectByVisibleText(Mode);

		if (objFA21014Page.selectMode.isEnabled()) {
			objFA21014Page.selectMode.sendKeys(Mode);
			System.out.println("Mode is selected");
		} else {
			System.out.println("Mode is not selected");
		}

		Select selectFutureGroupStaff = new Select(objFA21014Page.selectFutureGroupStaff);
		selectFutureGroupStaff.selectByVisibleText(FutureGroupStaff);

		if (objFA21014Page.selectFutureGroupStaff.isEnabled()) {
			objFA21014Page.selectFutureGroupStaff.sendKeys(FutureGroupStaff);
			System.out.print("Future Group Staff is selected");
		} else {
			System.out.println("Future Group Staff is not selected");
		}

		Select selectSourcingChannel = new Select(objFA21014Page.selectSourcingChannel);
		selectSourcingChannel.selectByVisibleText(SourcingChannel);
		
		if (objFA21014Page.selectSourcingChannel.isEnabled()) {
			objFA21014Page.selectSourcingChannel.sendKeys(SourcingChannel);
			System.out.print("Sourcing is selected");
		} else {
			System.out.println("Sourcing is not selected");
		}
		
		Select SelectOption = new Select(objFA21014Page.SelectOption);
		SelectOption.selectByVisibleText(Option);
		
		if (objFA21014Page.SelectOption.isEnabled()) {
			objFA21014Page.SelectOption.sendKeys(Option);
			System.out.print("Sourcing is selected");
		} else {
			System.out.println("Sourcing is not selected");
		}
		

		objFA21014Page.txtSumAssured.sendKeys(SumAssured);

		objFA21014Page.btnGenerateBI.click();
		
		Thread.sleep(2000);
		
		

	

		// driver.close();

}
}


