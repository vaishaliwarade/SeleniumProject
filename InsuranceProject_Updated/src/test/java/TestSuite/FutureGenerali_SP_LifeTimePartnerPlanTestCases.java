package TestSuite;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
import PageObjects.FutureGenerali_SP_LifeTimePartnerPlanPage;
import PageObjects.FutureGenerali_SP_SuperMoneyBackPlanPage;
import resources.BaseClass;
import resources.Utility;

public class FutureGenerali_SP_LifeTimePartnerPlanTestCases extends BaseClass {

	public WebDriver driver;
	Actions act;
	FutureGenerali_SP_LifeTimePartnerPlanPage objFA21036Page;
	WebDriverWait wait;

	public FutureGenerali_SP_LifeTimePartnerPlanTestCases(WebDriver driver) {

		act = new Actions(driver);
		objFA21036Page = new FutureGenerali_SP_LifeTimePartnerPlanPage(driver);
		this.driver=driver;
	}

	public void VerifyFutureGeneraliLifeTimePartnerPlan21036(String firstName, String lastName, String DOB,
			String ageProof, String PT, String PPT, String Mode, String ModeofSurvivalBenefit, String sourcingChannel,
			String category, String policyoption, String SumAssured) throws IOException, InterruptedException {

		
	 objFA21036Page.txtFirstName.clear();
	
			
/*
		WebElement firstname;
		firstname=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text'][@name='txtLifeAssuredFirstName']")));
		driver.findElement(	By.xpath("//input[@type='text'][@name='txtLifeAssuredFirstName']")).sendKeys(firstName);
*/
			objFA21036Page.txtFirstName.sendKeys(firstName);
			System.out.println(firstName);
		
			 objFA21036Page.txtLastName.clear();
		
			objFA21036Page.txtLastName.sendKeys(lastName);
			System.out.println(lastName);
		
			 objFA21036Page.txtDOB.clear();
		objFA21036Page.txtDOB.sendKeys(DOB);

		act.sendKeys(Keys.TAB).build().perform();
		System.out.println(DOB);

		
		Select selectAgeProof = new Select(objFA21036Page.selectAgeProof);
		selectAgeProof.selectByVisibleText(ageProof);
		System.out.println(ageProof);

		Select selectPT = new Select(objFA21036Page.selectAgePT);
		selectPT.selectByVisibleText(PT);
		System.out.println(PT);

		Select selectPPT = new Select(objFA21036Page.selectPPT);
		selectPPT.selectByVisibleText(PPT);
		System.out.println(PPT);

		Select selectMode = new Select(objFA21036Page.selectMode);
		selectMode.selectByVisibleText(Mode);
		System.out.println(Mode);

		Select selectSurvivalBenefit = new Select(objFA21036Page.selectSurvivalBenefit);
		selectSurvivalBenefit.selectByVisibleText(ModeofSurvivalBenefit);
		System.out.println(ModeofSurvivalBenefit);

		Select selecSourcingChannel = new Select(objFA21036Page.selectSourcingChannel);
		selecSourcingChannel.selectByVisibleText(sourcingChannel);
		System.out.println(sourcingChannel);

		Select selecCategory = new Select(objFA21036Page.selectCategory);
		selecCategory.selectByVisibleText(category);
		System.out.println(category);

		Select selecPolicyOption = new Select(objFA21036Page.selectPolicyOption);
		selecPolicyOption.selectByVisibleText(policyoption);
		System.out.println(policyoption);

		objFA21036Page.txtSumAssured.sendKeys(SumAssured);
		System.out.println(SumAssured);
		System.out.println(SumAssured);

		objFA21036Page.btnGenerateBI.click();
		
		objFA21036Page.Error.isDisplayed();
		System.out.println(objFA21036Page.Error.getText());
		
		if(objFA21036Page.Error.isDisplayed()) {
			System.out.println("Validation Error displayed-failed\r\n");
		} else {
			System.out.println("No validation error appeared\r\n");
		}
Thread.sleep(10000);
		
		List<WebElement> actualvalues = driver.findElements(By.xpath("//div/table[@class='PolicyTable']"));
		for (int i = 0; i < actualvalues.size(); i++) {
			System.out.println((actualvalues.get(i).getText()));
			System.out.println("\r\n");
		}
		
		String data[] = new String[5];
		data[0] = "";
		data[1] = "";
		data[2] = "20,000";
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
			 { System.out.println("Base Plan Matched"); 
			 } 
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
			 { System.out.println("Total Instalment Premium Matched"); 
			 
			 } 
			 else  System.out.println("Total Instalment Premium does not Matched");
			
			}
		
		}


		// driver.close();

	}


