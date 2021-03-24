package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BajajAllianzProductid60020Page {
	
	public BajajAllianzProductid60020Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(xpath = "//input[@type='text'][@name='txtLifeAssuredFirstName']")
	public WebElement txtFirstName;
	
	@FindBy(xpath = "//input[@type='text'][@name='txtLifeAssuredLastName']")
	public WebElement txtLastName;
	
	@FindBy(xpath = "//select[@name='ddlLI_GENDER']")
	public WebElement selectGender;
	
	@FindBy(id = "txtAge")
	public WebElement selectAge;
	
	@FindBy(id = "PinCode")
	public WebElement txtPinCode;
	
	@FindBy(id = "SalesState")
	public WebElement selectSalesState;
	
	@FindBy(id = "ddlPT")
	public WebElement selectPT;
	
	@FindBy(id = "ddlPPT")
	public WebElement selectPPT;
	
	@FindBy(id = "dynInput_Mode")
	public WebElement selecMode;
	
	@FindBy(id = "txtMP")
	public WebElement txtMP;
	
	@FindBy(xpath = "//text()[contains(.,'Generate BI')]/ancestor::button[1]")
	public WebElement btnGenerateBI;
	
	@FindBy(xpath = "//text()[contains(.,'Download PDF')]/ancestor::button[1]")
	public WebElement btnDownloadPDF;
}
