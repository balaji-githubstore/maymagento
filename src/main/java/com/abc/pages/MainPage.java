package com.abc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
	By logout=By.linkText("Log Out");
	WebDriver driver;
	
	public MainPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public String getCurrentTitle()
	{
		String title=driver.getTitle();
		return title;
	}
	
	public void clickLogout()
	{
		driver.findElement(logout).click();
	}
}
