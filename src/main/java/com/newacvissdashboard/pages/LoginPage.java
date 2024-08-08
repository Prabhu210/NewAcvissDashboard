package com.newacvissdashboard.pages;

import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.acvissnewDashboard.base.TestBase;

public class LoginPage extends TestBase {

    @FindBy(xpath = "//input[@id='email']")
    WebElement username;

    @FindBy(xpath = "//form/div[2]/input")
    WebElement password;

    @FindBy(xpath = "//form/div[3]/button")
    WebElement login_button;

    @FindBy(xpath = "//div/div/div/div/div/img")
    WebElement acviss_logo;

    @FindBy(xpath = "//div[contains(text(),'Invalid credentials')]")
    WebElement incorrectUsernameAndPassword;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    // Actions
    public String validateLoginPageTitle() {
        return driver.getTitle();
    }

    public boolean validateAcvissImage() {
        return acviss_logo.isDisplayed();
    }
    
    public Homepage login(String UN , String PW) throws InterruptedException{
		username.sendKeys(UN);
		password.sendKeys(PW);
		login_button.click();
		
		return new  Homepage();
	}

    public String emptyUsername() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(login_button)).click();
        return username.getAttribute("validationMessage");
    }

    public String emptyPassword() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(login_button)).click();
        return password.getAttribute("");
    }

    public LoginPage invalidUsernameAndPassword(String un, String pw) {
        username.sendKeys(un);
        password.sendKeys(pw);
        login_button.click();
        return new LoginPage();
    }

    public String invalidUsernameAndPasswordMessage() {
        return incorrectUsernameAndPassword.getText();
    }
}
