package resources;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public WebDriver driver;
	public WebDriver getDriver() {
		return driver;
	}

	
	private void setDriver( String appURL) {
			driver = initChromeDriver(appURL);
		}
	


protected static WebDriver initChromeDriver(String appURL) {
	System.err.println("Opening google chrome....");
	 System.setProperty("webdriver.chrome.driver", "E:\\Selenium course\\chromedriver.exe");	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to(appURL);
	return driver;
}

@BeforeClass
public void initializeTestBaseSetup() throws IOException {
	String appURL = "http://13.234.16.249:1005/sis/inputfg.aspx?";
	try {
		setDriver(appURL);

	} catch (Exception e) {
		System.out.println("Error....." + e.getStackTrace());
	}
}



public void dateSelect(String Year, String Month, String Date) throws InterruptedException

{

	while (!driver
			.findElement(By.cssSelector("[class='datepicker-years'] [class='table-condensed'] [class='switch']"))
			.getText().contains("1990-1999")) {
		driver.findElement(By.xpath("//div[1]//div[3]//th[1]//i[1]")).click();
	}
	
	Thread.sleep(2000);
	
	
	WebDriverWait wait = new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.elementToBeClickable(By.className("year")));
    
	int count = driver.findElements(By.className("year")).size();
	for (int i = 0; i < count; i++) {
		String text = driver.findElements(By.className("year")).get(i).getText();
		if (text.equalsIgnoreCase(Year)) {
			driver.findElements(By.className("year")).get(i).click();
			break;
		}

	}
	
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.elementToBeClickable(By.className("month")));
	
	int count1 = driver.findElements(By.className("month")).size();
	for (int j = 0; j < count1; j++) {
		String text = driver.findElements(By.className("month")).get(j).getText();
		if (text.equalsIgnoreCase(Month)) {
			driver.findElements(By.className("month")).get(j).click();
			break;
		}

	}
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.elementToBeClickable(By.className("day")));
	

	int count2 = driver.findElements(By.className("day")).size();
	for (int k = 0; k < count2; k++) {
		String text = driver.findElements(By.className("day")).get(k).getText();
		if (text.equalsIgnoreCase(Date)) {
			driver.findElements(By.className("day")).get(k).click();
			break;
		}

	}

	Thread.sleep(2000);
}

}
