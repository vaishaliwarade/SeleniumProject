package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FutureGenerali_SP_AssuredIncomePlanPage {

	
	public FutureGenerali_SP_AssuredIncomePlanPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	/*@FindBy(xpath = "//input[@type='text'][@name='txtLifeAssuredFirstName']")
	public WebElement txtFirstName;
	*/
	@FindBy(xpath = "//input[@id='txtLifeAssuredFirstName']")
	public WebElement txtFirstName;
	
		
		
	@FindBy(css = "#txtLifeAssuredLastName")
	public WebElement txtLastName;
	
	@FindBy(xpath = "//input[@type='text'][@name='txtAge']")
	public WebElement txtDOB;

	@FindBy(xpath = "//select[@name='ddlAgeProof']")
	public WebElement selectAgeProof;
	
	@FindBy(xpath = "//select[@name='ddlPT']")
	public WebElement selectAgePT;
	
	@FindBy(xpath = "//select[@name='ddlPPT']")
	public WebElement selectPPT;
	
	@FindBy(xpath = "//select[@name='dynInput_Mode']")
	public WebElement selectMode;
	
	@FindBy(xpath = "//select[@id='dynIS_STAFF']")
	public WebElement selectFutureGroupStaff;

	@FindBy(xpath = "//select[@id='dynSourcing_Channel']")
	public WebElement selectSourcingChannel;
	
	@FindBy(xpath = "//select[@id='ddlOpt0'] 	")
	public WebElement selectLampsumMaturity;
	
	@FindBy(xpath = "//select[@id='ddlOpt1'] 	")
	public WebElement selectpayoutOption;
	
	
	
	@FindBy(id = "txtMP")
	public WebElement txtModePremium;
	
	@FindBy(xpath = "//text()[contains(.,'Generate BI')]/ancestor::span[1]")
	public WebElement btnGenerateBI;


	@FindBy(xpath="//div[@id='divError']")
	public WebElement Error;
	
}
