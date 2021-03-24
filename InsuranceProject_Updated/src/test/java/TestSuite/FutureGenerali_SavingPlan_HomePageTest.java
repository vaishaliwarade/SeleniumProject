package TestSuite;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import resources.BaseClass;
import resources.Utility;

public class FutureGenerali_SavingPlan_HomePageTest extends BaseClass {
	
	FutureGenerali_SavingPlan_HomePageTest back;

	FutureGenerali_SP_SuperMoneyBackPlanTestCases SMBP;
	FutureGenerali_SP_LifeTimePartnerPlanTestCases LTPP;
	FutureGenerali_SP_AssuredIncomePlanTestCases AIP;
	FutureGenerali_SP_BigIncomeMultiplierPlanTestCases BIMP;
	
	
	public WebDriver driver;
	WebDriverWait wait;
	int plancount = 1;
	

	@BeforeClass
	public void openurl() {
		driver = getDriver();
		wait = new WebDriverWait(driver, 20);
		SMBP = new FutureGenerali_SP_SuperMoneyBackPlanTestCases(driver);
		LTPP = new FutureGenerali_SP_LifeTimePartnerPlanTestCases(driver);
		AIP = new FutureGenerali_SP_AssuredIncomePlanTestCases(driver);
		BIMP = new FutureGenerali_SP_BigIncomeMultiplierPlanTestCases(driver);
		
		driver.findElement(By.xpath("//span[text()='Select Product']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@BeforeMethod
	public void clicklink() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement clickplanlink;
		clickplanlink = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//span[@id='rptCompanyCat_lblCatName_3' and  text()='Savings Plans']//parent::li//ul//li["
						+ plancount + "]")));
		String name = driver.findElement(
				By.xpath("//span[@id='rptCompanyCat_lblCatName_3' and  text()='Savings Plans']//parent::li//ul//li["
						+ plancount + "]"))
				.getText();
		System.out.println("\r\n");
		System.out.println(name);

		driver.findElement(
				By.xpath("//span[@id='rptCompanyCat_lblCatName_3' and  text()='Savings Plans']//parent::li//ul//li["
						+ plancount + "]"))
				.click();
		plancount++;
		
	}

	@DataProvider(name = "FutureGeneraliSuperMoneyBackPlan_data_provider")
	public Object[][] dpFGMethod() {
		//Object data[][]=  new Object[2][11];

		return new Object[][] {
		     	/*{ "Vaishali", "Warade", "21/07/1991", "Passport", "10", "10", "Yearly", "Offline","None", "1", "Platinum", "15000" },
		     	{ "Vaishali", "Warade" ,"21/07/1991","Passport","10","10","Yearly","Offline","None","1","Platinum","15000" },
				{ "Vaishali", "Warade" ,"21/07/1991","Passport","10","10","Half-Yearly","Offline","None","1","Platinum","15000" },
				{ "Vaishali", "Warade" ,"21/07/1991","Passport","10","10","Quarterly","Offline","Staff","2","Platinum","15000" },
				{ "Vaishali", "Warade" ,"21/07/1991","Passport","10","10","Monthly","Offline","Staff","2","Platinum","15000" },
				{ "Vaishali", "Warade" ,"21/07/1991","Passport","12","12","Yearly","Offline","None","1","Platinum","15000" },
				{ "Vaishali", "Warade" ,"21/07/1991","Passport","12","12","Half-Yearly","Online","None","1","Gold","15000" },
				{ "Vaishali", "Warade" ,"21/07/1991","Passport","12","12","Quarterly","Offline","Staff","2","Platinum","15000" },
				{ "Vaishali", "Warade" ,"21/07/1991","Passport","12","12","Monthly","Online","Staff","2","Gold","15000" },
				{ "Vaishali", "Warade" ,"21/07/1991","Passport","15","15","Yearly","Offline","None","1","Platinum","15000" },
				{ "Vaishali", "Warade" ,"21/07/1991","Passport","15","15","Half-Yearly","Offline","Staff","1","Platinum","15000" },
				{ "Vaishali", "Warade" ,"21/07/1991","Passport","15","15","Quarterly","Offline","Staff","1","Platinum","15000" },
				{ "Vaishali", "Warade" ,"21/07/1991","Passport","15","15","Monthly","Offline","Staff","1","Platinum","15000" },
				{ "Vaishali", "Warade" ,"21/07/1991","Passport","20","20","Yearly","Online","Staff","2","Silver","15000" },
				{ "Vaishali", "Warade" ,"21/07/1991","Passport","20","20","Half-Yearly","Offline","None","1","Silver","15000" },
			*/	{ "Vaishali", "Warade" ,"21/07/1991","Passport","20","20","Quarterly","Online","Staff","2","Silver","15000" },
				//{ "Teena", "Cherian" ,"21/07/1990","Passport","20","20","Monthly","Offline","Staff","1","Silver","15000" },		
			};

	}

	@Test(priority = 1, dataProvider = "FutureGeneraliSuperMoneyBackPlan_data_provider")
	public void plan(String firstName, String lastName, String DOB, String ageProof, String PT, String PPT, String Mode,
			String sourcingChannel, String category, String productOption, String productCategory, String ModelPremium)
			throws IOException, InterruptedException {
		{
					
			SMBP.VerifyFutureGeneraliSuperMoneyBackPlan21037(firstName, lastName, DOB, ageProof, PT, PPT, Mode,	sourcingChannel, category, productOption, productCategory, ModelPremium);
			/*WebElement back;
			back = wait.until(
			ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Change Product']")));
			driver.findElement(By.xpath("//button[text()='Change Product']")).click();
			*/
		}
	}

	
	@DataProvider(name = "FutureGeneraliLifeTimePartner_data_provider")
	public Object[][] dpFG2Method() {
		return new Object[][] 
				{
				/*{ "Vaishali", "Warade" ,"21/07/1991","Passport","Upto Age 100","6","Yearly","Yearly","Offline","None","Immediate Income","2500000" },
				{ "Vaishali", "Warade" ,"21/07/1991","Passport","Upto Age 100","6","Yearly","Half-yearly","Offline","None","Immediate Income","2500000" },
				{ "Vaishali", "Warade" ,"21/07/1991","Passport","Upto Age 100","8","Half-Yearly","Monthly","Online","Staff","Immediate Income","2500000" },
				{ "Vaishali", "Warade" ,"21/07/1991","Passport","Upto Age 100","8","Half-Yearly","Yearly","Offline","None","Immediate Income","2500000" },
				{ "Vaishali", "Warade" ,"21/07/1991","Passport","Upto Age 100","10","Monthly","Yearly","Offline","None","Immediate Income","2500000" },
				{ "Vaishali", "Warade" ,"21/07/1991","Passport","Upto Age 100","10","Monthly","Yearly","Offline","None","Immediate Income","2500000" },
				{ "Vaishali", "Warade" ,"21/07/1991","Passport","Upto Age 100","12","Quarterly","Yearly","Offline","None","Immediate Income","2500000" },
				{ "Vaishali", "Warade" ,"21/07/1991","Passport","Upto Age 100","12","Quarterly","Monthly","Offline","None","Immediate Income","2500000" },
				{ "Vaishali", "Warade" ,"21/07/1991","Passport","Upto Age 100","6","Monthly","Yearly","Offline","None","Deferred Income","2500000" },
				{ "Vaishali", "Warade" ,"21/07/1991","Passport","Upto Age 100","6","Yearly","Half-yearly","Offline","None","Deferred Income","2500000" },
				{ "Vaishali", "Warade" ,"21/07/1991","Passport","Upto Age 100","8","Half-Yearly","Monthly","Online","Staff","Deferred Income","2500000" },
				{ "Vaishali", "Warade" ,"21/07/1991","Passport","Upto Age 100","8","Half-Yearly","Yearly","Offline","None","Deferred Income","2500000" },
				{ "Vaishali", "Warade" ,"21/07/1991","Passport","Upto Age 100","10","Monthly","Yearly","Offline","None","Deferred Income","2500000" },
				{ "Vaishali", "Warade" ,"21/07/1991","Passport","Upto Age 100","10","Monthly","Yearly","Offline","None","Deferred Income","2500000" },
				{ "Vaishali", "Warade" ,"21/07/1991","Passport","Upto Age 100","12","Quarterly","Yearly","Offline","None","Deferred Income","2500000" },
				*/{ "Ajay", "Warade" ,"21/07/1980","Aadhar with DOB","Upto Age 100","12","Quarterly","Monthly","Offline","None","Deferred Income","2500000" },
			};
	}
	
	@Test(priority = 2, enabled = true, dataProvider = "FutureGeneraliLifeTimePartner_data_provider")
	public void plan2(String firstName, String lastName, String DOB,
			String ageProof, String PT, String PPT, String Mode, String ModeofSurvivalBenefit, String sourcingChannel,
			String category, String policyoption, String SumAssured) throws IOException, InterruptedException {
		{

			LTPP.VerifyFutureGeneraliLifeTimePartnerPlan21036(firstName, lastName, DOB, ageProof, PT, PPT, Mode, ModeofSurvivalBenefit, sourcingChannel, category, policyoption, SumAssured);
						
		}
	}
	@DataProvider(name = "FutureGenerali_SP_AssuredIncomePlan_data_provider")
	public Object[][] dpFG3Method() {
		return new Object[][]
		{ 
			
		{ "Avanish", "Warade" ,"15/08/1990","Aadhar with DOB","15","15","Monthly","Yes","Online","No","Monthly Payout Option","20000" },
			
		};
	}
		
	@Test(priority = 4, enabled = false, dataProvider = "FutureGenerali_SP_AssuredIncomePlan_data_provider")
	public void plan3(String firstName, String lastName,String DOB,String ageProof, String PT, String PPT,
			String Mode,String FutureGroupStaff, String sourcingChannel,String LampsumMaturity,String PayoutOption,String ModePremium) throws IOException, InterruptedException {
		{
			
			AIP.VerifyFutureGenerali_SP_AssuredIncomePlan21015( firstName,  lastName,  DOB, ageProof,  PT,  PPT,  Mode,  FutureGroupStaff,  sourcingChannel, LampsumMaturity,  PayoutOption,  ModePremium);
		/*	WebElement back;
			back = wait.until(
			ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Change Product']")));
			driver.findElement(By.xpath("//button[text()='Change Product']")).click();
			*/
		}
	}

	
	 
	 @DataProvider(name = "FutureGeneraliBigIncomeMultiplier_data_provider")
	public Object[][] dpFG4Method() {
		return new Object[][]
		{ 
			
			/*{ "Vaishali", "Warade" ,"15/08/1990","Passport","14","12","Yes","Online","Yearly","Annual Income","20000" },
			{ "Vaishali", "Warade" ,"15/08/1990","Passport","14","12","Yes","Offline","Yearly","Lump-Sum","20000" },
			{ "Vaishali", "Warade" ,"15/08/1990","Passport","14","12","No","Online","Yearly","Annual Income","20000" },
			{ "Vaishali", "Warade" ,"15/08/1990","Passport","14","12","No","Offline","Yearly","Lump-Sum","20000" },
			{ "Vaishali", "Warade" ,"15/08/1990","Passport","14","12","Yes","Online","Monthly","Monthly Income","20000" },
			{ "Vaishali", "Warade" ,"15/08/1990","Passport","14","12","Yes","Offline","Monthly","Lump-Sum","20000" },		
			{ "Vaishali", "Warade" ,"15/08/1990","Passport","14","12","No","Online","Monthly","Monthly Income","20000" },
		*/	{ "jyoti", "Singh" ,"15/08/1990","Passport","14","12","No","Offline","Monthly","Lump-Sum","20000" }			

		};
	}
	
	@Test(priority = 3, enabled = false,dataProvider = "FutureGeneraliBigIncomeMultiplier_data_provider")
	public void plan4(String firstName, String lastName,String DOB,String ageProof, String PT, String PPT,
			String futureGrpStaff, String sourcingChannel,String payingFreq,String PaymentMode,String ModePremium) throws IOException, InterruptedException {
		{
	
			BIMP.FutureGeneraliBigIncomeMultiplierPlan21045(firstName, lastName, DOB, ageProof, PT, PPT, futureGrpStaff, sourcingChannel, payingFreq, PaymentMode, ModePremium);
		}
	}

/*	
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
	@Test(priority = 10, enabled = true)
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
	
	@AfterMethod
	public void Changeproduct()
{
	WebElement back;
	back = wait.until(
	ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Change Product']")));
	driver.findElement(By.xpath("//button[text()='Change Product']")).click();
}


}
