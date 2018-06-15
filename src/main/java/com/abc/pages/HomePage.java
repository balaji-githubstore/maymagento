package com.abc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

class ExcelRead
{
	final static String name="send";
}
public class HomePage  {
	By myAccount=By.xpath("//*[text()='MY ACCOUNT']");
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver= driver;
	}
	
	
	public void clickMyAccount()
	{
		WebElement myaccEle=driver.findElement(myAccount);
		myaccEle.click();
	}
	

}
