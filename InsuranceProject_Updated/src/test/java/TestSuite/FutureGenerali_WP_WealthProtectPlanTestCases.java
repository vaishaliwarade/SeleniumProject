package TestSuite;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.FutureGenerali_SP_SuperMoneyBackPlanPage;
import resources.Utility;

public class FutureGenerali_WP_WealthProtectPlanTestCases extends Utility{
	
	
			WebDriver driver;
		
	
		@DataProvider(name = "FutureGenerali_WP_WealthProtectPlan_data_provider")
		public Object[][] dpFGMethod() {
			return new Object[][] 
			{
				{ "Vaishali", "Warade" ,"21/07/1991","Passport","10","10","Yearly","Offline","None","1","Platinum","15000" },
				
			};
		}

		@Test(dataProvider = "FutureGenerali_WP_WealthProtectPlan_data_provider")
		
		public void VerifyFutureGeneraliSuperMoneyBackPlan21037(String firstName, String lastName,String DOB,String ageProof, String PT, String PPT,
				String Mode,String sourcingChannel,String category, String productOption,String productCategory,String ModelPremium)
				throws IOException, InterruptedException {

			// initiate driver
			//WebDriver driver;
			driver = intializeDriver();
			driver.manage().window().maximize();
			  
			 driver.get("http://13.234.16.249:1005/sis/inputfg.aspx?productid=21037");
			
			

			
			FutureGenerali_SP_SuperMoneyBackPlanPage objFA21037Page;

			objFA21037Page = new FutureGenerali_SP_SuperMoneyBackPlanPage(driver);

			// Enter First Name
			if (objFA21037Page.txtFirstName.isEnabled()) {
				objFA21037Page.txtFirstName.sendKeys(firstName);
				System.out.println("FirstName Entered");
			} else {
				System.out.println("FirstName box not exist");
			}

			// Enter Last Name
			if (objFA21037Page.txtLastName.isEnabled()) {
				objFA21037Page.txtLastName.sendKeys(lastName);
				System.out.println("Lastname Entered");
			} else {
				System.out.println("Lastname box not exist");
			}

			objFA21037Page.txtDOB.sendKeys(DOB);

			Actions act = new Actions(driver);

			act.sendKeys(Keys.TAB).build().perform();
			System.out.println(DOB);

			Select selectAgeProof = new Select(objFA21037Page.selectAgeProof);
			selectAgeProof.selectByVisibleText(ageProof);
			System.out.println(ageProof);

			
			Select selectPT = new Select(objFA21037Page.selectAgePT);
			selectPT.selectByVisibleText(PT);
			System.out.println(PT);
			
			Select selectPPT = new Select(objFA21037Page.selectPPT);
			selectPPT.selectByVisibleText(PPT);
			System.out.println(PPT);
			
			Select selectMode = new Select(objFA21037Page.selectMode);
			selectMode.selectByVisibleText(Mode);
			System.out.println(Mode);
			
			Select selecSourcingChannel = new Select(objFA21037Page.selectSourcingChannel);
			selecSourcingChannel.selectByVisibleText(sourcingChannel);
			System.out.println(sourcingChannel);
			
			Select selecCategory = new Select(objFA21037Page.selectCategory);
			selecCategory.selectByVisibleText(category);
			System.out.println(category);
			
			Select selecProductOption= new Select(objFA21037Page.selectProductOption);
			selecProductOption.selectByVisibleText(productOption);
			System.out.println(productOption);
			
			Select selecProductCategory = new Select(objFA21037Page.selectProductCategory);
			selecProductCategory.selectByVisibleText(productCategory);
			System.out.println(productCategory);
			
			objFA21037Page.txtModePremium.sendKeys(ModelPremium);
			System.out.println(ModelPremium);
			
			objFA21037Page.btnGenerateBI.click();
			
			
			Thread.sleep(2000);

			driver.close();

		}


}
