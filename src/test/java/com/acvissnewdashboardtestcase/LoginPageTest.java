package com.acvissnewdashboardtestcase;

import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.acvissnewDashboard.base.TestBase;
import com.newacvissdashboard.pages.LoginPage;

public class LoginPageTest extends TestBase {
    LoginPage loginPage;
    
    
    public LoginPageTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        loginPage = new LoginPage();
    }

    @Test(priority = 1)
    public void loginPageTitleTest() {
        String title = loginPage.validateLoginPageTitle();
        Assert.assertEquals(title, "ATN-Certify");
        System.out.println("Print The Title: " + title);
    }

    @Test(priority = 2)
    public void acvissLogoTest() throws InterruptedException  {
    	Thread.sleep(3000);
        boolean flag = loginPage.validateAcvissImage();
        Assert.assertTrue(flag);
        System.out.println("Image is there: " + flag);
    }
    
	@Test(priority = 3)
	public void logintest() throws InterruptedException, IOException {
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));	
		String title= driver.getTitle();
		Assert.assertEquals("ATN-Certify",title );
	}

   @Test(priority = 4)
    public void emptyValidationForUsernameTest() {
        String emptyMessage = loginPage.emptyUsername();
        System.out.println("Print the text: " + emptyMessage);
    }

    @Test(priority = 5)
    public void emptyValidationForPasswordTest() {
        String emptyMessage = loginPage.emptyPassword();
        System.out.println("Print the text: " + emptyMessage);
    }

    @Test(priority = 6)
    public void incorrectUsernameAndPasswordTest() {
        loginPage.invalidUsernameAndPassword(prop.getProperty("username1"), prop.getProperty("password1"));
        String invalidMessage = loginPage.invalidUsernameAndPasswordMessage();
        System.out.println("Print the text: " + invalidMessage);
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }
}