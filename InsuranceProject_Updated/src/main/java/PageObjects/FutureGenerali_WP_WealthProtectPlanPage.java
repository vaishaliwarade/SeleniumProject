package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FutureGenerali_WP_WealthProtectPlanPage {

	
	//Product ID - 21010
			public void FutureGenerali_WealthProtectPlanPage(WebDriver driver) {
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

			@FindBy(id = "dynSourcing_Channel")
			public WebElement selectSourcingChannel;
			
			@FindBy(xpath = "//select[@id='dynIS_STAFF']")
			public WebElement selectFutureGroupStaff;
			
			@FindBy(id = "ddlOpt0")
			public WebElement planOption;
			
			@FindBy(id = "txtMP")
			public WebElement ModalPremium;
			
			@FindBy(id = "txtSA")
			public WebElement SumAssured;
			
			
			
						
			@FindBy(xpath = "//input[@id='fundPer21001']")
			public WebElement FutureSecureFund;
			
			@FindBy(xpath = "//input[@id='fundPer21002']")
			public WebElement FutureIncomeFund;
			
			@FindBy(xpath = "//input[@id='fundPer21003']")
			public WebElement FutureBalanceFund;
			
			@FindBy(xpath = "//input[@id='fundPer21004']")
			public WebElement FutureApexFund;
			
			@FindBy(xpath = "//input[@id='fundPer21005']")
			public WebElement FutureOppFund;
			
			@FindBy(xpath = "//input[@id='fundPer21006']")
			public WebElement FutureMaxFund;
			
			@FindBy(xpath = "//input[@id='fundPer21007']")
			public WebElement FutureMidFund;
			
			@FindBy(xpath = "//input[@id='rSA30004']")
			public WebElement DeathRider;
			
			@FindBy(xpath = "//input[@id='rSA30004']")
			public WebElement DisRider;
			
			
			@FindBy(xpath = "//text()[contains(.,'Generate BI')]/ancestor::span[1]")
			public WebElement btnGenerateBI;

			
			
			
			
			
			
			
			
			
			
			
}
