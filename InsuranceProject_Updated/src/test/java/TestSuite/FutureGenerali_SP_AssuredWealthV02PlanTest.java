package TestSuite;

import static org.testng.Assert.assertTrue;

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

import PageObjects.FutureGenerali_SP_AssuredWealthV02PlanPage;
import resources.Utility;

public class FutureGenerali_SP_AssuredWealthV02PlanTest extends Utility {
	WebDriverWait wait;
	

	@DataProvider(name = "FutureGenerali_SP_AssuredWealthV02Plan_data_provider")
	public Object[][] dpFGMethod() {
		return new Object[][] 
				{
				
			{ "Vaishali", "Warade" ,"15/08/1990","Passport","15","10","Yearly","Yes","Option 2","500000" },
			//{ "Vaishali", "Warade" ,"15/08/1990","Passport","10","10","Yearly","Yes","Option 1","400000" },
				};
	}	
	

	@Test(dataProvider = "FutureGenerali_SP_AssuredWealthV02Plan_data_provider")
	public void VerifyFutureGenerali_SP_AssuredWealthV02Plan21023(String firstName, String lastName, String DOB,String ageProof, String PT, String PPT, String Mode, String FutureGroupStaff, String PolicyOption, String SumAssured) throws IOException, InterruptedException {

		// initiate driver

		WebDriver driver;
		driver = intializeDriver();
		wait = new WebDriverWait(driver, 20);
		

		// Navigate to URL
		driver.get("http://13.234.16.249:1005/sis/inputfg.aspx?productid=21023");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// created object of page
		FutureGenerali_SP_AssuredWealthV02PlanPage objFA21023Page;

		objFA21023Page = new FutureGenerali_SP_AssuredWealthV02PlanPage(driver);

		// Enter First Name
		if (objFA21023Page.txtFirstName.isEnabled()) {
			objFA21023Page.txtFirstName.sendKeys(firstName);
			System.out.println(firstName+"  FirstName Entered");
		} else {
			System.out.println("FirstName box not exist");
		}

		// Enter Last Name
		if (objFA21023Page.txtLastName.isEnabled()) {
			objFA21023Page.txtLastName.sendKeys(lastName);
			System.out.println(lastName+"  Lastname Entered");
		} else {
			System.out.println("Lastname box not exist");
		}

		objFA21023Page.txtDOB.sendKeys(DOB);

		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).build().perform();

		Select selectAgeProof = new Select(objFA21023Page.selectAgeProof);
		selectAgeProof.selectByVisibleText(ageProof);
	//	System.out.print(ageProof);

		if (objFA21023Page.selectAgeProof.isEnabled()) {
			objFA21023Page.selectAgeProof.sendKeys(ageProof);
			System.out.println(ageProof+"  Age proof is selected");
		} else {
			System.out.println("Age proof is not selected");
		}

		Select selectPT = new Select(objFA21023Page.selectAgePT);
		selectPT.selectByVisibleText(PT);

		if (objFA21023Page.selectAgePT.isEnabled()) {
			objFA21023Page.selectAgePT.sendKeys(PT);
			System.out.println(PT+"  PT is selected");
		} else {
			System.out.println("PT is not selected");
		}

		Select selectPPT = new Select(objFA21023Page.selectPPT);
		selectPPT.selectByVisibleText(PPT);

		if (objFA21023Page.selectPPT.isEnabled()) {
			objFA21023Page.selectPPT.sendKeys(PPT);
			System.out.println(PPT+"  PPT is selected");
		} else {
			System.out.println("PPT is not selected");
		}

		Select selectMode = new Select(objFA21023Page.selectMode);
		selectMode.selectByVisibleText(Mode);

		if (objFA21023Page.selectMode.isEnabled()) {
			objFA21023Page.selectMode.sendKeys(Mode);
			System.out.println(Mode+"  Mode is selected");
		} else {
			System.out.println("Mode is not selected");
		}

		Select selectFutureGroupStaff = new Select(objFA21023Page.selectFutureGroupStaff);
		selectFutureGroupStaff.selectByVisibleText(FutureGroupStaff);

		if (objFA21023Page.selectFutureGroupStaff.isEnabled()) {
			objFA21023Page.selectFutureGroupStaff.sendKeys(FutureGroupStaff);
			System.out.println(FutureGroupStaff+"  Future Group Staff is selected");
		} else {
			System.out.println("Future Group Staff is not selected");
		}

		Select selectPolicyOption = new Select(objFA21023Page.selectPolicyOption);
		selectPolicyOption.selectByVisibleText(PolicyOption);
		
		if (objFA21023Page.selectPolicyOption.isEnabled()) {
			objFA21023Page.selectPolicyOption.sendKeys(PolicyOption);
			System.out.println(PolicyOption+"  Policy Option is selected");
		} else {
			System.out.println("Policy Option is not selected");
		}

		objFA21023Page.txtSumAssured.sendKeys(SumAssured);
		System.out.println(SumAssured +"  Sum Assured Entered");

		objFA21023Page.btnGenerateBI.click();
		
		Thread.sleep(3000);
		
		

		objFA21023Page.Error.isDisplayed();
			System.out.println(objFA21023Page.Error.getText());
			
			if(objFA21023Page.Error.isDisplayed()) {
				System.out.println("Validation Error displayed\r\n");
			} else {
				System.out.println("No validation error\r\n");
			}
			Thread.sleep(6000);
		
			List<WebElement> actualvalues = driver.findElements(By.xpath("//div/table[@class='PolicyTable']"));
			for (int i = 0; i < actualvalues.size(); i++) {
				System.out.println((actualvalues.get(i).getText()));
				System.out.println("\r\n");
			}
			
			
			WebElement back;
			back = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/table[@class='PolicyTable']")));
			driver.findElement(By.xpath("//div/table[@class='PolicyTable']")).click();
		
			
			
			String data[]= new String [5];
			data[0]="";
			data[1]="";
			data[2]="57,154";
			data[3]="59,726";
			data[4]="58,440";
			//for 2nd column
			for (int i=2; i<=4 ;i++){
				String basePlan= driver.findElement(By.xpath("//div[@style='clear:both;']//table[@class='PolicyTable']//tbody//tr["+i+"]//td[2]")).getText();
				//System.out.println("Value in site is "+basePlan);
				//System.out.println("Value in array is "+data[i]);
				Assert.assertEquals(basePlan, data[i]);
				if(basePlan.equals(data[i]))
				{
					System.out.println("Base Plan Matched");
				}
				else System.out.println("Base Plan does not Matched");
				
			}
						
	//for 4th column       
			for (int i=2; i<=4 ;i++){
				String premium= driver.findElement(By.xpath("//div[@style='clear:both;']//tbody//tr["+i+"]/td[@class='BgGray']//following-sibling::td[3]")).getText();
				//System.out.println("Value in site is "+premium);
				//System.out.println("Value in array is "+data[i]);
				Assert.assertEquals(premium, data[i]);
				if(premium.equals(data[i]))
				{
					System.out.println("Total Instalment Premium Matched");
				}
				else System.out.println("Total Instalment Premium does not Matched");
			}
			
			
			}

			

		}
	

								  

	
		// driver.close();
	

