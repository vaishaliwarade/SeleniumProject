package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FutureGenerali_SP_BigIncomeMultiplierPlanPage {

	//Product ID - 21015
	public FutureGenerali_SP_BigIncomeMultiplierPlanPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@type='text'][@name='txtLifeAssuredFirstName']")
	public WebElement txtFirstName;

	@FindBy(xpath = "//input[@type='text'][@name='txtLifeAssuredLastName']")
	public WebElement txtLastName;

	@FindBy(xpath = "//input[@type='text'][@name='txtAge']")
	public WebElement txtDOB;

	@FindBy(xpath = "//select[@name='ddlAgeProof']")
	public WebElement selectAgeProof;

	@FindBy(xpath = "//select[@name='ddlPT']")
	public WebElement selectAgePT;

	@FindBy(xpath = "//select[@name='ddlPPT']")
	public WebElement selectPPT;
	
	@FindBy(xpath = "//select[@id='dynIS_STAFF']")
	public WebElement selectFutureGrouStaff;

	@FindBy(xpath = "//select[@id='dynSourcing_Channel']")
	public WebElement selectSourcingChannel;

	@FindBy(xpath = "//select[@id='ddlOpt0']")
	public WebElement selectPremiumPayingFreq;
	
	@FindBy(xpath = "//select[@id='ddlOpt1']")
	public WebElement selectPaymentMode;
	

	@FindBy(id = "txtMP")
	public WebElement txtModelPremium;

	@FindBy(xpath = "//text()[contains(.,'Generate BI')]/ancestor::span[1]")
	public WebElement btnGenerateBI;

}
