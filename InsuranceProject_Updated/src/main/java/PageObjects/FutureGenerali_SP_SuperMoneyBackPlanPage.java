package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FutureGenerali_SP_SuperMoneyBackPlanPage {

	public FutureGenerali_SP_SuperMoneyBackPlanPage(WebDriver driver) {
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
	
	@FindBy(xpath = "//select[@name='dynInput_Mode']")
	public WebElement selectMode;

	@FindBy(xpath = "//select[@id='dynSourcing_Channel']")
	public WebElement selectSourcingChannel;
	
	@FindBy(xpath = "//select[@id='dyncategory']")
	public WebElement selectCategory;
	
	@FindBy(xpath = "//select[@id='ddlOpt0']")
	public WebElement selectProductOption;
	
	@FindBy(xpath = "//select[@id='ddlOpt1']")
	public WebElement selectProductCategory;
	
	@FindBy(id = "txtMP")
	public WebElement txtModePremium;
	
	@FindBy(xpath = "//text()[contains(.,'Generate BI')]/ancestor::span[1]")
	public WebElement btnGenerateBI;
	
	@FindBy(xpath="//div[@id='divError']")
	public WebElement Error;
	
	
}
