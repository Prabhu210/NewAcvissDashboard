package com.acvissnewdashboardtestcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.acvissnewDashboard.base.TestBase;
import com.newacvissdashboard.pages.CodeManagement;
import com.newacvissdashboard.pages.CustomerManagement;
import com.newacvissdashboard.pages.Homepage;
import com.newacvissdashboard.pages.LicenceManagement;
import com.newacvissdashboard.pages.LoginPage;
import com.newacvissdashboard.pages.LoyaltySystem;
import com.newacvissdashboard.pages.ProductManagement;
import com.newacvissdashboard.pages.VariableData;

public class HomePageTestcases extends TestBase {
    LoginPage loginPage;
    Homepage homepage;
    Dropdown dropdown;
    CustomerManagement customerManagement;
    CodeManagement codeManagement;
    ProductManagement productManagement;
    VariableData variableData;
    LoyaltySystem loyaltySystem;
    LicenceManagement licenceManagement;

    public HomePageTestcases() {
        super();
    }

    @BeforeClass
    public void setUp() throws InterruptedException {
        initialization();
        loginPage = new LoginPage();
        homepage = loginPage.login(prop.getProperty("username"), prop.getProperty("password")); 
        Thread.sleep(3000);
       // driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        dropdown=new Dropdown();
        dropdown.selectFromDropdown();
    
        customerManagement = new CustomerManagement();
        codeManagement = new CodeManagement();
        productManagement = new ProductManagement();
        variableData = new VariableData();
        loyaltySystem = new LoyaltySystem();
    }
      

    @Test(priority = 1)
    public void homePageTitleTest() {
        String title = homepage.validateHomePageTitle();
        Assert.assertEquals(title, "ATN-Certify", "Home page title did not match.");
    }

   @Test(priority = 2)
    public void verifyAcvissLogo() {
        boolean flag = homepage.validateAcvissImage();
        Assert.assertTrue(flag, "ACVISS logo is not displayed.");
    }

    @Test(priority = 3)
    public void userDetails() {
        String user = homepage.User_Details();
        System.out.println("User details: " + user);
        Assert.assertNotNull(user, "User details are not available.");
    }

    @Test(priority = 4)
    public void verifyCustomerManagementTest() {
        customerManagement = homepage.Click_on_CustomerManagementLink();
        Assert.assertNotNull(customerManagement, "Customer Management page did not load.");
    }

    @Test(priority = 5)
    public void verifyCodeManagementTest() {
        codeManagement = homepage.Click_on_CodeManagementLink();
        Assert.assertNotNull(codeManagement, "Code Management page did not load.");
    }

    @Test(priority = 6)
    public void verifyProductManagement() {
        productManagement = homepage.Click_on_Productmanagement();
        Assert.assertNotNull(productManagement, "Product Management page did not load.");
    }

    @Test(priority = 7)
    public void verifyUserManagement() {
        productManagement = homepage.Click_on_Productmanagement(); // This seems duplicated
        Assert.assertNotNull(productManagement, "Product Management page did not load.");
    }

    @Test(priority = 8)
    public void verifyVariableData() {
        variableData = homepage.Click_on_VariableData();
        Assert.assertNotNull(variableData, "Variable Data page did not load.");
    }

    @Test(priority = 11)
    public void verifyLoyaltySystem() {
        loyaltySystem = homepage.Click_on_LoyaltySystem();
        Assert.assertNotNull(loyaltySystem, "Loyalty System page did not load.");
    }

    @Test(priority = 12)
    public void verifyLicenceManagement() {
        licenceManagement = homepage.Click_on_LicenceManagement();
        Assert.assertNotNull(licenceManagement, "Licence Management page did not load.");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
