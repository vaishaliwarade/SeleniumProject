package TestSuite;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import PageObjects.FutureGenerali_SP_AssuredWealthPlanPage;
import resources.Utility;

public class FutureGenerali_SP_AssuredWealthPlanTestCases extends Utility {
	
	WebDriver driver;

	@DataProvider(name = "FutureGenerali_SP_AssuredWealthPlan_data_provider")
	public Object[][] dpFGMethod() {
		return new Object[][] 
				{
				
			{ "Vaishali", "Warade" ,"15/08/1990","Passport","10","5","Monthly","Yes","Option 1","100000" },
			{ "Vaishali", "Warade" ,"15/08/1990","Passport","10","5","Yearly","Yes","Option 1","100000" },
				};
	}	
	

	@Test(dataProvider = "FutureGenerali_SP_AssuredWealthPlan_data_provider")
	public void VerifyFutureGenerali_SP_AssuredWealthPlan21001(String firstName, String lastName, String DOB,String ageProof, String PT, String PPT, String Mode, String FutureGroupStaff,String Option, String SumAssured) throws IOException, InterruptedException {

		// initiate driver

		WebDriver driver;
		driver = intializeDriver();

		// Navigate to URL
		driver.get("http://13.234.16.249:1005/sis/inputfg.aspx?productid=21001");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// created object of page
		FutureGenerali_SP_AssuredWealthPlanPage objFA21001Page;

		objFA21001Page = new FutureGenerali_SP_AssuredWealthPlanPage(driver);

		// Enter First Name
		if (objFA21001Page.txtFirstName.isEnabled()) {
			objFA21001Page.txtFirstName.sendKeys(firstName);
			System.out.println("FirstName Entered");
		} else {
			System.out.println("FirstName box not exist");
		}

		// Enter Last Name
		if (objFA21001Page.txtLastName.isEnabled()) {
			objFA21001Page.txtLastName.sendKeys(lastName);
			System.out.println("Lastname Entered");
		} else {
			System.out.println("Lastname box not exist");
		}

		objFA21001Page.txtDOB.sendKeys(DOB);

		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).build().perform();

		Select selectAgeProof = new Select(objFA21001Page.selectAgeProof);
		selectAgeProof.selectByVisibleText(ageProof);
		System.out.print(ageProof);

		if (objFA21001Page.selectAgeProof.isEnabled()) {
			objFA21001Page.selectAgeProof.sendKeys(ageProof);
			System.out.println("Age proof is selected");
		} else {
			System.out.println("Age proof is not selected");
		}

		Select selectPT = new Select(objFA21001Page.selectAgePT);
		selectPT.selectByVisibleText(PT);

		if (objFA21001Page.selectAgePT.isEnabled()) {
			objFA21001Page.selectAgePT.sendKeys(PT);
			System.out.println("PT is selected");
		} else {
			System.out.println("PT is not selected");
		}

		Select selectPPT = new Select(objFA21001Page.selectPPT);
		selectPPT.selectByVisibleText(PPT);

		if (objFA21001Page.selectPPT.isEnabled()) {
			objFA21001Page.selectPPT.sendKeys(PPT);
			System.out.println("PPT is selected");
		} else {
			System.out.println("PPT is not selected");
		}

		Select selectMode = new Select(objFA21001Page.selectMode);
		selectMode.selectByVisibleText(Mode);

		if (objFA21001Page.selectMode.isEnabled()) {
			objFA21001Page.selectMode.sendKeys(Mode);
			System.out.println("Mode is selected");
		} else {
			System.out.println("Mode is not selected");
		}

		Select selectFutureGroupStaff = new Select(objFA21001Page.selectFutureGroupStaff);
		selectFutureGroupStaff.selectByVisibleText(FutureGroupStaff);

		if (objFA21001Page.selectFutureGroupStaff.isEnabled()) {
			objFA21001Page.selectFutureGroupStaff.sendKeys(FutureGroupStaff);
			System.out.print("Future Group Staff is selected");
		} else {
			System.out.println("Future Group Staff is not selected");
		}

		
		
		Select selectPolicyOption = new Select(objFA21001Page.selectPolicyOption);
		selectPolicyOption.selectByVisibleText(Option);
		
		if (objFA21001Page.selectPolicyOption.isEnabled()) {
			objFA21001Page.selectPolicyOption.sendKeys(Option);
			System.out.print("Policy Option is selected");
		} else {
			System.out.println("Policy Option is not selected");
		}
		

		objFA21001Page.txtSumAssured.sendKeys(SumAssured);

		objFA21001Page.btnGenerateBI.click();
		
		Thread.sleep(2000);
		
		

	

		// driver.close();

}
}




