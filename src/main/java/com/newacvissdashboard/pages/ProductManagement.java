package com.newacvissdashboard.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.acvissnewDashboard.base.TestBase;

public class ProductManagement extends TestBase {

	

	@FindBy(xpath="//main/div/div/div/div/button[1]")
	WebElement Category;
	
	@FindBy(xpath="//main/div/div/div/div/button[2]")
	WebElement Product;
	
	@FindBy(xpath="//main/div/div/div/div/button[3]")
	WebElement Product_Serial_Mapping;
	
	@FindBy(xpath="//main/div/div/div/div/button[4]")
	WebElement Product_Serial_Demapping;
	

	//Initializing the page  objects:
			public ProductManagement() {
				PageFactory.initElements(driver, this);						
			}
	
			public Category Click_on_Category () {
				Category.click();
				return new Category();
			}
			public Product Click_on_Product () {
				Product.click();
				return new Product();
			}
	
			public ProductSerialmapping Click_on_Product_Serial_Mapping() {
				Product_Serial_Mapping.click();
				return new ProductSerialmapping();
			}
			public ProductSerialDemapping Click_on_Product_Serial_Demapping () {
				Product_Serial_Demapping.click();
				return new ProductSerialDemapping();
			}
	
	
	
	
	
	
	
	
}
