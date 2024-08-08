package com.newacvissdashboard.pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.acvissnewDashboard.base.TestBase;

public class Homepage extends TestBase {
	
		//page Factory - OR:
		
		@FindBy(xpath="//aside/div/div[1]/div[2]/img")
		WebElement Acviss_logo;
		
		@FindBy(xpath="//aside/div/div[2]")
		WebElement User_Details;
		
		@FindBy(xpath="//header/div/div/div/div/button")
		WebElement User_Profile;
		
		@FindBy(xpath="//aside/div/div[2]/following::a[2]")
		WebElement CustomerManagement;
		
		@FindBy(xpath="//aside/div/div[2]/following::a[3]")
		WebElement CodeManagement;
		
		@FindBy(xpath="//aside/div/div[2]/following::a[4]")
		WebElement ProductManagement;
		
		@FindBy(xpath="//aside/div/div[2]/following::a[5]")
		WebElement VariableData;
		
		@FindBy(xpath="//aside/div/div[2]/following::a[6]")
		WebElement UserManagement;
		
		@FindBy(xpath="//aside/div/div[2]/following::a[7]")
		WebElement ConsumerEngagement;
		
		@FindBy(xpath="//aside/div/div[2]/following::a[8]")
		WebElement LoyaltySystem;
		
		@FindBy(xpath="//aside/div/div[2]/following::a[9]")
		WebElement LicenceManagement;
		
		@FindBy(xpath="//aside/div/div[2]/following::a[10]")
		WebElement LoyaltyInsights;
		
		@FindBy(xpath="//aside/div/div[2]/following::a[11]")
		WebElement LoyaltyBonusPoints;
		
		@FindBy(xpath="//aside/div/div[2]/following::a[12]")
		WebElement StoreManagement;
		
		@FindBy(xpath="//aside/div/div[2]/following::a[13]")
		WebElement Insights;
		
		@FindBy(xpath="//aside/div/div[2]/following::a[14]")
		WebElement FraudAnalysis;
		
		@FindBy(xpath="//aside/div/div[2]/following::a[15]")
		WebElement Payment;
		
		@FindBy(xpath="//aside/div/div[2]/following::a[16]")
		WebElement ReferAndEarn;
		
		@FindBy(xpath="//aside/div/div[2]/following::a[17]")
		WebElement Settings;
		
		@FindBy(xpath="//aside/div/div[2]/following::a[18]")
		WebElement Analytics;
		
		@FindBy(xpath="//aside/div/div[2]/following::a[19]")
		WebElement GeoFenching;
		
		@FindBy(xpath="//aside/div/div[2]/following::a[20]")
		WebElement Ecommerce;
		
		
		
		//Initializing the page  objects:
			public Homepage() {
				PageFactory.initElements(driver, this);		  
			}
			//Actions:
			public String validateHomePageTitle() {
				return driver.getTitle();
			}
			
			public boolean  validateAcvissImage() {
				return Acviss_logo.isDisplayed();
			}	
			
			public String User_Details() {
				return User_Details.getText();				
			}
			public CustomerManagement Click_on_CustomerManagementLink() {
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
				wait.until(ExpectedConditions.elementToBeClickable(CustomerManagement)).click();
				return new CustomerManagement();
			}
			
			public CodeManagement Click_on_CodeManagementLink() {
				CodeManagement.click();
				return new CodeManagement();
			}
			
			public ProductManagement Click_on_Productmanagement() {
				ProductManagement.click();
				return new ProductManagement();
			}
			
			public VariableData Click_on_VariableData() {
				VariableData.click();
				return new VariableData();
			}
			
			public LoyaltySystem Click_on_LoyaltySystem() {
				LoyaltySystem.click();
				return new LoyaltySystem();
			}
			public LicenceManagement Click_on_LicenceManagement() {
				LicenceManagement.click();
				return new LicenceManagement();
			}
			/*public UserManagement Click_on_UserManagement() {
				UserManagement.click();
				return new UserManagement();
			}
			public ConsumerEngagement Click_on_ConsumerEngagement() {
				ConsumerEngagement.click();
				return new ConsumerEngagement();
			}
			public LoyaltyInsights Click_on_LoyaltyInsights() {
				LoyaltyInsights.click();
				return new LoyaltyInsights();
			}
			public LoyaltyBonusPoints Click_on_LoyaltyBonusPoints() {
				LoyaltyBonusPoints.click();
				return new LoyaltyBonusPoints();
			}
			public StoreManagement Click_on_StoreManagement() {
				StoreManagement.click();
				return new StoreManagement();
			}
			public Insights Click_on_Insights() {
				Insights.click();
				return new Insights();
			}
			
			public FraudAnalysis Click_on_FraudAnalysis() {
				FraudAnalysis.click();
				return new FraudAnalysis();
			}
			
			public Payment Click_on_Payment() {
				Payment.click();
				return new Payment();
			}
			public ReferAndEarn Click_on_ReferAndEarn() {
				ReferAndEarn.click();
				return new ReferAndEarn();
			}
			public Settings Click_on_Settings() {
				Settings.click();
				return new Settings();
			}
			public Analytics Click_on_Analytics() {
				Analytics.click();
				return new Analytics();
			}
			public GeoFenching Click_on_GeoFenching() {
				GeoFenching.click();
				return new GeoFenching();
			}
			public Ecommerce Click_on_Ecommerce() {
				Ecommerce.click();
				return new Ecommerce();
			}*/
	}
			



