
package TestSuite;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

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
import PageObjects.FutureGenerali_SP_SuperMoneyBackPlanPage;
import resources.BaseClass;

public class FutureGenerali_SP_SuperMoneyBackPlanTestCases extends BaseClass {

	public WebDriver driver;
	Actions act;
	FutureGenerali_SP_SuperMoneyBackPlanPage objFA21037Page;
	
	

	public FutureGenerali_SP_SuperMoneyBackPlanTestCases(WebDriver driver) {

		act = new Actions(driver);
		objFA21037Page = new FutureGenerali_SP_SuperMoneyBackPlanPage(driver);
		
		this.driver=driver;
	}

	public void VerifyFutureGeneraliSuperMoneyBackPlan21037(String firstName, String lastName, String DOB,
			String ageProof, String PT, String PPT, String Mode, String sourcingChannel, String category,
			String productOption, String productCategory, String ModelPremium)
			throws IOException, InterruptedException {

		// Enter First Name
		objFA21037Page.txtFirstName.clear();
			objFA21037Page.txtFirstName.sendKeys(firstName);
			System.out.println(firstName);
		
		// Enter Last Name
			objFA21037Page.txtLastName.clear();
			objFA21037Page.txtLastName.sendKeys(lastName);
			System.out.println(lastName);
		
			 objFA21037Page.txtDOB.clear();
		objFA21037Page.txtDOB.sendKeys(DOB);

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

		Select selecProductOption = new Select(objFA21037Page.selectProductOption);
		selecProductOption.selectByVisibleText(productOption);
		System.out.println(productOption);

		Select selecProductCategory = new Select(objFA21037Page.selectProductCategory);
		selecProductCategory.selectByVisibleText(productCategory);
		System.out.println(productCategory);

		objFA21037Page.txtModePremium.sendKeys(ModelPremium);
		System.out.println(ModelPremium);

		objFA21037Page.btnGenerateBI.click();
		
		
		
		objFA21037Page.Error.isDisplayed();
		System.out.println(objFA21037Page.Error.getText());
		
		if(objFA21037Page.Error.isDisplayed()) {
			System.out.println("Validation Error displayed\r\n");
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


