package TestSuite;

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
import org.testng.annotations.Test;

public class FutureGenerali_WP_HomePageTest {
	
	public WebDriver driver;
	int plancount = 1;

	@BeforeClass
	public void openurl() throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium course\\chromedriver.exe");
		driver = new ChromeDriver();
		//WebDriver driver;
		//driver = intializeDriver();
		
		driver.get("http://13.234.16.249:1005/sis/inputfg.aspx?");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[contains(text(),'Select Product')]")).click();
	}

	@BeforeMethod
	public void clicklink() {
		//System.out.println("before method start");
		WebDriverWait wait=new WebDriverWait(driver, 20);
		WebElement clickplanlink;
		clickplanlink=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='rptCompanyCat_lblCatName_1' and  text()='Wealth Plans']//parent::li//ul//li["+plancount+"]")));
		String name =driver.findElement(
				By.xpath("//span[@id='rptCompanyCat_lblCatName_1' and  text()='Wealth Plans']//parent::li//ul//li["
						+ plancount + "]")).getText();
                System.out.println(name);
		driver.findElement(	By.xpath("//span[@id='rptCompanyCat_lblCatName_1' and  text()='Wealth Plans']//parent::li//ul//li["
						+ plancount + "]")).click();
		plancount++;
	//	System.out.println("before method end");
}

	@Test(priority = 1)
	public void plan1() {
		{
			//System.out.println("Future Generali Wealth Protect Plan");	
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
