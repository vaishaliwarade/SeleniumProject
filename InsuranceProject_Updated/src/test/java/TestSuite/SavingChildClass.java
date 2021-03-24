package TestSuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SavingChildClass extends Parent {
	
	int plancount = 1;
	MethodSavingPlan saving;
		
		@BeforeClass
		public void openurl() {
			driver = getDriver();
			saving = new MethodSavingPlan(driver);
			driver.findElement(By.xpath("//span[text()='Select Product']")).click();
		}

		@BeforeMethod
		public void clicklink() {
			System.out.println("before method start");
			WebDriverWait wait=new WebDriverWait(driver, 20);
			WebElement clickplanlink;
			clickplanlink=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='rptCompanyCat_lblCatName_3' and  text()='Savings Plans']//parent::li//ul//li["
					+ plancount + "]")));
	String name = driver.findElement(
			By.xpath("//span[@id='rptCompanyCat_lblCatName_3' and  text()='Savings Plans']//parent::li//ul//li["
					+ plancount + "]"))
			.getText();
	System.out.println(name);

	driver.findElement(
			By.xpath("//span[@id='rptCompanyCat_lblCatName_3' and  text()='Savings Plans']//parent::li//ul//li["
					+ plancount + "]"));
			plancount++;
	}

		@Test(priority = 1)
		public void plan() {
			{
				WebDriverWait wait=new WebDriverWait(driver, 20);

				WebElement back;
				back=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Change Product']")));
				driver.findElement(
						By.xpath("//button[text()='Change Product']")).click();

				
				
			}
		}

		@Test(priority = 2, enabled = true)
		public void plan2() {
			{
				WebDriverWait wait=new WebDriverWait(driver, 20);

				WebElement back;
				back=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Change Product']")));
				driver.findElement(
						By.xpath("//button[text()='Change Product']")).click();
			}
		}

		
		@Test(priority = 3, enabled = true)
		public void plan3() {
			{
				WebDriverWait wait=new WebDriverWait(driver, 20);

				WebElement back;
				back=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Change Product']")));
				driver.findElement(
						By.xpath("//button[text()='Change Product']")).click();
				//System.out.println("Future Generali Dhan Vridhi ");
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

		
	}