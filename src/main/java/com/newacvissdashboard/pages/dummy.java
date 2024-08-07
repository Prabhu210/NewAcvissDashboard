package com.newacvissdashboard.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dummy {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//driver.get("https://certify-bonus-assist-frontend.vercel.app/login");
		driver.get("https://test.acviss.co/dashboard/login/");
		/*String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(3000);
		WebElement a = driver.findElement(By.xpath("//div/div/div/div/div/img"));
		System.out.println(a.isDisplayed());*/
		WebElement b = driver.findElement(By.xpath("//input[@id='username']"));
		System.out.println(b.getAttribute("validationMessage"));
	
	}

}
