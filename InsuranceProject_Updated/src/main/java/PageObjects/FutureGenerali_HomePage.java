package PageObjects;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import resources.Utility;

public class FutureGenerali_HomePage extends Utility {

	public FutureGenerali_HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//driver.findElement(By.xpath("//span[contains(text(),'Select Product')]")).click();
	@FindBy(xpath = "//span[contains(text(),'Select Product')]")
	public WebElement SelectProduct;
	
	@FindBy(xpath = "//select[@name='ddlPT']")
	public WebElement selectAgePT;

	@FindBy(xpath = "//select[@name='ddlPPT']")
	public WebElement selectPPT;
	
	@FindBy(xpath = "//select[@id='dynInput_Mode']")
	public WebElement SelectMode;
	
	@FindBy(xpath = "//select[@id='dynSourcing_Channel']")
	public WebElement selectSourcingChannel;
	
	@FindBy(xpath = "//select[@id='dynIS_STAFF']")
	public WebElement selectFutureGrouStaff;
	
	@FindBy(id = "ddlOpt0']")
	public WebElement Sele;
	
	
}