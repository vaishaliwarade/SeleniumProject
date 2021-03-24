

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import resources.BaseClass;
import resources.Utility;

public class FutureGenerali_SavingPlan_HomePageTest extends BaseClass {

	public WebDriver driver;
	int plancount = 1;

	@BeforeClass
	public void openurl() {
		driver = getDriver();
		driver.findElement(By.xpath("//span[text()='Select Product']")).click();
	}

	@BeforeMethod
	public void clicklink() {
		// System.out.println("before method start");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement clickplanlink;
		clickplanlink = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//span[@id='rptCompanyCat_lblCatName_3' and  text()='Savings Plans']//parent::li//ul//li["
						+ plancount + "]")));
		String name = driver.findElement(
				By.xpath("//span[@id='rptCompanyCat_lblCatName_3' and  text()='Savings Plans']//parent::li//ul//li["
						+ plancount + "]"))
				.getText();
		System.out.println(name);

		driver.findElement(
				By.xpath("//span[@id='rptCompanyCat_lblCatName_3' and  text()='Savings Plans']//parent::li//ul//li["
						+ plancount + "]"))
				.click();
		plancount++;
		/*
		 * if(i>5) { break; }
		 * 
		 */
		// System.out.println("before method end");
	}

	@DataProvider(name = "FutureGeneraliSuperMoneyBackPlan_data_provider")
	public Object[][] dpFGMethod() {
		return new Object[][] { { "Vaishali", "Warade", "21/07/1991", "Passport", "10", "10", "Yearly", "Offline",
				"None", "1", "Platinum", "15000" } };

	}

	@Test(priority = 1, dataProvider = "FutureGeneraliSuperMoneyBackPlan_data_provider")
	public void plan(String firstName, String lastName, String DOB, String ageProof, String PT, String PPT, String Mode,
			String sourcingChannel, String category, String productOption, String productCategory, String ModelPremium)
			throws IOException, InterruptedException {
		{
			// System.out.println("Future Generali Wealth Protect Plan");
			WebDriverWait wait = new WebDriverWait(driver, 20);

			WebElement back;
			back = wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Change Product']")));
			driver.findElement(By.xpath("//button[text()='Change Product']")).click();

			FutureGenerali_SP_SuperMoneyBackPlanTestCases SMBP = new FutureGenerali_SP_SuperMoneyBackPlanTestCases(driver);
			SMBP.VerifyFutureGeneraliSuperMoneyBackPlan21037(firstName, lastName, DOB, ageProof, PT, PPT, Mode,
					sourcingChannel, category, productOption, productCategory, ModelPremium);

		}
	}

	
	/*
	@DataProvider(name = "FutureGeneraliLifeTimePartner_data_provider")
	public Object[][] dpFG2Method() {
		return new Object[][] 
		{
			{ "Vaishali", "Warade" ,"21/07/1991","Passport","Upto Age 100","6","Yearly","Yearly","Offline","None","Immediate Income","2500000" },
			{ "Vaishali", "Warade" ,"21/07/1991","Passport","Upto Age 100","6","Yearly","Half-yearly","Offline","None","Immediate Income","2500000" },
		};
	}
	
	@Test(priority = 2, enabled = false, dataProvider = "FutureGeneraliLifeTimePartner_data_provider")
	public void plan2(String firstName, String lastName,String DOB,String ageProof, String PT, String PPT,
			String Mode,  String ModeofSurvivalBenefit,String sourcingChannel,String category,String policyoption,String SumAssured) throws IOException, InterruptedException {
		{
			WebDriverWait wait=new WebDriverWait(driver, 20);

			WebElement back;
			back=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Change Product']")));
			driver.findElement(
					By.xpath("//button[text()='Change Product']")).click();
			
			FutureGenerali_SP_LifeTimePartnerPlanTestCases obj = new FutureGenerali_SP_LifeTimePartnerPlanTestCases();
			obj.VerifyFutureGeneraliLifeTimePartnerPlan21036(firstName, lastName, DOB, ageProof, PT, PPT, Mode, ModeofSurvivalBenefit, sourcingChannel, category, policyoption, SumAssured);
			
		}
	}
	@DataProvider(name = "FutureGenerali_SP_AssuredIncomePlan_data_provider")
	public Object[][] dpFG3Method() {
		return new Object[][]
		{ 
			
		{ "Avanish", "Warade" ,"15/08/1990","Aadhar with DOB","15","15","Monthly","Yes","Online","No","Monthly Payout Option","20000" },
			
		};
	}
	
	
	@Test(priority = 3, enabled = false, dataProvider = "FutureGenerali_SP_AssuredIncomePlan_data_provider")
	public void plan3(String firstName, String lastName,String DOB,String ageProof, String PT, String PPT,
			String Mode,String FutureGroupStaff, String sourcingChannel,String LampsumMaturity,String PayoutOption,String ModePremium) throws IOException, InterruptedException {
		{
			WebDriverWait wait=new WebDriverWait(driver, 20);

			WebElement back;
			back=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Change Product']")));
			driver.findElement(
					By.xpath("//button[text()='Change Product']")).click();
			
			FutureGenerali_SP_AssuredIncomePlanTestCases AIP=new FutureGenerali_SP_AssuredIncomePlanTestCases();
			AIP.VerifyFutureGenerali_SP_AssuredIncomePlan21012(firstName, lastName, DOB, ageProof, PT, PPT, Mode, FutureGroupStaff, sourcingChannel, LampsumMaturity, PayoutOption, ModePremium);
			
		}
	}

	
	@Test(priority = 4, enabled = true)
	public void plan4() {
		{
			WebDriverWait wait=new WebDriverWait(driver, 20);

			WebElement back;
			back=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Change Product']")));
			driver.findElement(
					By.xpath("//button[text()='Change Product']")).click();
		}
	}

	
	@Test(priority = 5, enabled = true)
	public void plan5() {
		{
			WebDriverWait wait=new WebDriverWait(driver, 20);

			WebElement back;
			back=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Change Product']")));
			driver.findElement(
					By.xpath("//button[text()='Change Product']")).click();
		}
	}
	
	@Test(priority = 6, enabled = true)
	public void plan6() {
		{
			WebDriverWait wait=new WebDriverWait(driver, 20);

			WebElement back;
			back=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Change Product']")));
			driver.findElement(
					By.xpath("//button[text()='Change Product']")).click();
		}
	}
	
	@Test(priority = 7, enabled = true)
	public void plan7() {
		{
			WebDriverWait wait=new WebDriverWait(driver, 20);

			WebElement back;
			back=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Change Product']")));
			driver.findElement(
					By.xpath("//button[text()='Change Product']")).click();
		}
	}
	
	@Test(priority = 8, enabled = true)
	public void plan8() {
		{
			WebDriverWait wait=new WebDriverWait(driver, 20);

			WebElement back;
			back=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Change Product']")));
			driver.findElement(
					By.xpath("//button[text()='Change Product']")).click();
		}
	}
	
	@Test(priority = 9, enabled = true)
	public void plan9() {
		{
			WebDriverWait wait=new WebDriverWait(driver, 20);

			WebElement back;
			back=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Change Product']")));
			driver.findElement(
					By.xpath("//button[text()='Change Product']")).click();
		}
	}
	/* @Test(priority = 10, enabled = true)
	public void pla10() {
		{
			WebDriverWait wait=new WebDriverWait(driver, 20);

			WebElement back;
			back=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Change Product']")));
			driver.findElement(
					By.xpath("//button[text()='Change Product']")).click();
		}
	}
*/
}
