package com.abc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	By emailId=By.id("email");
	By pass=By.name("login[password]");
	By login=By.xpath("(//*[@class='button'])[1]");
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public void sendUserName(String name)
	{
		driver.findElement(emailId).sendKeys(name);
	}
	
	public void sendPassword(String password)
	{
		driver.findElement(pass).sendKeys(password);
	}
	public void clickLogin()
	{
		driver.findElement(login).click();
	}
	
	
	
	

}
