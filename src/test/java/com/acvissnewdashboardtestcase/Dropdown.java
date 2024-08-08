package com.acvissnewdashboardtestcase;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.acvissnewDashboard.base.TestBase;

public class Dropdown extends TestBase {

    public  void selectFromDropdown() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        // Step 1: Locate and click the dropdown input to open the options
        WebElement dropdownInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@role='combobox']")));
        dropdownInput.click(); // Click the input to open the dropdown
        
        // Step 2: Wait for the options to be visible
        WebElement dropdownList = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[contains(@class, 'MuiAutocomplete-listbox')]")));
        
        // Find all option elements within the dropdown
        List<WebElement> options = dropdownList.findElements(By.tagName("li"));
        
        // Iterate through options and select the desired one
        for (WebElement option : options) {
            if (option.getText().equals("KItply")) {
                option.click();
                break; // Exit loop once the desired option is selected
            }
        }
    }
}
