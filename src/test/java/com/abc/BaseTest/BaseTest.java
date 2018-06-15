package com.abc.BaseTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import com.abc.pages.HomePage;
import com.abc.pages.LoginPage;
import com.abc.pages.MainPage;

public class BaseTest {
	@Test
	public void testMagento() throws InterruptedException {
		// TODO Auto-generated method stub
		//changes
		//changes
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://magento.com");

		HomePage home = new com.abc.pages.HomePage(driver);
		home.clickMyAccount();

		LoginPage login = new com.abc.pages.LoginPage(driver);
		login.sendUserName("balajidinakaran1@gmail.com");
		login.sendPassword("Welcome1234");
		login.clickLogin();

		MainPage main = new MainPage(driver);
		Thread.sleep(5000);
		System.out.println(main.getCurrentTitle());
		main.clickLogout();
		Thread.sleep(5000);
		driver.quit();
	}
}
