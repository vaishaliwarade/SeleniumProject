package TestSuite;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import PageObjects.FutureGenerali_SP_BigIncomeMultiplierPlanPage;
import PageObjects.FutureGenerali_SP_SuperMoneyBackPlanPage;
import resources.Utility;

public class FutureGenerali_SP_BigIncomeMultiplierPlanTestCases extends Utility {

	WebDriver driver;

	Actions act;
	FutureGenerali_SP_BigIncomeMultiplierPlanPage objFA21015Page;

	public FutureGenerali_SP_BigIncomeMultiplierPlanTestCases(WebDriver driver) {

		act = new Actions(driver);
		objFA21015Page = new FutureGenerali_SP_BigIncomeMultiplierPlanPage(driver);
		this.driver=driver;

	}

	public void FutureGeneraliBigIncomeMultiplierPlan21045(String firstName, String lastName, String DOB,
			String ageProof, String PT, String PPT, String futureGrpStaff, String sourcingChannel, String payingFreq,
			String PaymentMode, String ModePremium) throws IOException, InterruptedException {

		

		// Enter First Name
		objFA21015Page.txtLastName.clear();
		objFA21015Page.txtFirstName.sendKeys(firstName);
		System.out.println(firstName);

		// Enter Last Name
		objFA21015Page.txtLastName.clear();
		objFA21015Page.txtLastName.sendKeys(lastName);
		System.out.println(lastName);

		objFA21015Page.txtLastName.clear();
		objFA21015Page.txtDOB.sendKeys(DOB);

		//Actions act = new Actions(driver);

		act.sendKeys(Keys.TAB).build().perform();
		System.out.println(DOB);

		Select selectAgeProof = new Select(objFA21015Page.selectAgeProof);
		selectAgeProof.selectByVisibleText(ageProof);
		System.out.println(ageProof);

		Select selectPT = new Select(objFA21015Page.selectAgePT);
		selectPT.selectByVisibleText(PT);
		System.out.println(PT);

		Select selectPPT = new Select(objFA21015Page.selectPPT);
		selectPPT.selectByVisibleText(PPT);
		System.out.println(PPT);

		Select selectMode = new Select(objFA21015Page.selectFutureGrouStaff);
		selectMode.selectByVisibleText(futureGrpStaff);
		System.out.println(futureGrpStaff);

		Select selecSourcingChannel = new Select(objFA21015Page.selectSourcingChannel);
		selecSourcingChannel.selectByVisibleText(sourcingChannel);
		System.out.println(sourcingChannel);

		Select selectPayFre = new Select(objFA21015Page.selectPremiumPayingFreq);
		selectPayFre.selectByVisibleText(payingFreq);
		System.out.println(payingFreq);

		Select selecPaymentMode = new Select(objFA21015Page.selectPaymentMode);
		selecPaymentMode.selectByVisibleText(PaymentMode);
		System.out.println(PaymentMode);

		objFA21015Page.txtModelPremium.sendKeys(ModePremium);

		objFA21015Page.btnGenerateBI.click();

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

		//driver.close();

	}

}
