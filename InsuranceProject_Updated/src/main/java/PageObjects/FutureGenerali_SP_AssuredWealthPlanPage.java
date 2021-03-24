package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FutureGenerali_SP_AssuredWealthPlanPage {
	// Product ID - 21001
		public FutureGenerali_SP_AssuredWealthPlanPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		@FindBy(id = "txtLifeAssuredFirstName")
		public WebElement txtFirstName;

		@FindBy(id = "txtLifeAssuredLastName")
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

		@FindBy(id = "ddlOpt0")
		public WebElement selectPolicyOption;

		@FindBy(id = "txtSA")
		public WebElement txtSumAssured;

		@FindBy(xpath = "//text()[contains(.,'Generate BI')]/ancestor::span[1]")
		public WebElement btnGenerateBI;

	}
	
	

