package com.newacvissdashboard.pages;

import org.openqa.selenium.support.PageFactory;

import com.acvissnewDashboard.base.TestBase;

public class CustomerManagement extends TestBase {
	
	public CustomerManagement() {
		PageFactory.initElements(driver, this);
	}
}
