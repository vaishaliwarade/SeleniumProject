package TestSuite;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Parent {
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
	String appURL = "http://216.10.244.78:1005/sis/inputfg.aspx?";
	try {
		setDriver(appURL);

	} catch (Exception e) {
		System.out.println("Error....." + e.getStackTrace());
	}
}

}
