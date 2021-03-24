package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FutureGenerali_SP_AssuredMoneyBackPlan {
	
	// Product ID - 21014
		public FutureGenerali_SP_AssuredMoneyBackPlan(WebDriver driver) {
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
		public WebElement SelectOption;
		
				
		@FindBy(id = "txtMP")
		public WebElement txtModalPremium;
		
		@FindBy(id = "txtSA")
		public WebElement txtSumAssured;

		@FindBy(xpath = "//text()[contains(.,'Generate BI')]/ancestor::span[1]")
		public WebElement btnGenerateBI;

	}