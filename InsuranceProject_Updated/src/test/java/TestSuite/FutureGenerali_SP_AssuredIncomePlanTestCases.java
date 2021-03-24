package TestSuite;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.FutureGenerali_SP_AssuredIncomePlanPage;
import PageObjects.FutureGenerali_SP_LifeTimePartnerPlanPage;
import resources.Utility;

public class FutureGenerali_SP_AssuredIncomePlanTestCases extends Utility {

	WebDriver driver;

	Actions act;
	FutureGenerali_SP_AssuredIncomePlanPage objFA21012Page;

	public FutureGenerali_SP_AssuredIncomePlanTestCases(WebDriver driver) {

		act = new Actions(driver);
		objFA21012Page = new FutureGenerali_SP_AssuredIncomePlanPage(driver);
		this.driver=driver;
	}

	public void VerifyFutureGenerali_SP_AssuredIncomePlan21015(String firstName, String lastName, String DOB,
			String ageProof, String PT, String PPT, String Mode, String FutureGroupStaff, String sourcingChannel,
			String LampsumMaturity, String PayoutOption, String ModePremium) throws IOException, InterruptedException {

		

		// Enter First Name
		objFA21012Page.txtFirstName.clear();
		objFA21012Page.txtFirstName.sendKeys(firstName);
		System.out.println(firstName);
	
		 objFA21012Page.txtLastName.clear();
	
		objFA21012Page.txtLastName.sendKeys(lastName);
		System.out.println(lastName);

		objFA21012Page.txtDOB.clear();
		objFA21012Page.txtDOB.sendKeys(DOB);

	//	Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).build().perform();
		System.out.println(DOB);

		
		Select selectAgeProof = new Select(objFA21012Page.selectAgeProof);
		selectAgeProof.selectByVisibleText(ageProof);
		System.out.println(ageProof);

		Select selectPT = new Select(objFA21012Page.selectAgePT);
		selectPT.selectByVisibleText(PT);
		System.out.println(PT);

		Select selectPPT = new Select(objFA21012Page.selectPPT);
		selectPPT.selectByVisibleText(PPT);
		System.out.println(PPT);

		Select selectMode = new Select(objFA21012Page.selectMode);
		selectMode.selectByVisibleText(Mode);

		if (objFA21012Page.selectMode.isEnabled()) {
			objFA21012Page.selectMode.sendKeys(Mode);
			System.out.println("Mode is selected");
		} else {
			System.out.println("Mode is not selected");
		}

		Select selectFutureGroupStaff = new Select(objFA21012Page.selectFutureGroupStaff);
		selectFutureGroupStaff.selectByVisibleText(FutureGroupStaff);

		if (objFA21012Page.selectFutureGroupStaff.isEnabled()) {
			objFA21012Page.selectFutureGroupStaff.sendKeys(FutureGroupStaff);
			System.out.println("Future Group Staff is selected");
		} else {
			System.out.print("Future Group Staff is not selected");
		}

		Select selecSourcingChannel = new Select(objFA21012Page.selectSourcingChannel);
		selecSourcingChannel.selectByVisibleText(sourcingChannel);
		System.out.println(sourcingChannel);
		
		Select selecPaymentMode = new Select(objFA21012Page.selectLampsumMaturity);
		selecPaymentMode.selectByVisibleText(LampsumMaturity);
		System.out.println(LampsumMaturity);

		Select selectpayoutOption = new Select(objFA21012Page.selectpayoutOption);
		selectpayoutOption.selectByVisibleText(PayoutOption);
		System.out.println(PayoutOption);

		objFA21012Page.txtModePremium.sendKeys(ModePremium);
		System.out.println(ModePremium);

		objFA21012Page.btnGenerateBI.click();

Thread.sleep(10000);
		
		List<WebElement> actualvalues = driver.findElements(By.xpath("//div/table[@class='PolicyTable']"));
		for (int i = 0; i < actualvalues.size(); i++) {
			System.out.println((actualvalues.get(i).getText()));
			System.out.println("\r\n");
		}
		
		String data[] = new String[5];
		data[0] = "";
		data[1] = "";
		data[2] = "15,000";
		data[3] = "15,675";
		data[4] = "15,338";
		// for 2nd column
		for (int i = 2; i <= 4; i++) {
			String basePlan = driver
					.findElement(By.xpath("//div[@style='clear:both;']//table[@class='PolicyTable']//tbody//tr[" + i + "]//td[2]")).getText();
			// System.out.println("Value in site is "+basePlan);
			// System.out.println("Value in array is "+data[i]);
			Assert.assertEquals(basePlan, data[i]);
			 if(basePlan.equals(data[i]))
			 System.out.println("Base Plan Matched"); 
			  
			 else  System.out.println("Base Plan does not Matched");
			}

        //for 4th column       
		for (int i = 2; i <= 4; i++) {
			String premium = driver.findElement(By.xpath(
					"//div[@style='clear:both;']//tbody//tr[" + i + "]/td[@class='BgGray']//following-sibling::td[3]"))
					.getText();
			// System.out.println("Value in site is "+premium);
			// System.out.println("Value in array is "+data[i]);
			Assert.assertEquals(premium, data[i]);
			if(premium.equals(data[i]))
			  System.out.println("Total Instalment Premium Matched"); 
			 
			 
			 else  System.out.println("Total Instalment Premium does not Matched");
			
			}
		
		}


		// driver.close();

	}

