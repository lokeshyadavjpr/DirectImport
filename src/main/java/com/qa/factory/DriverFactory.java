package com.qa.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	
	public WebDriver driver;	
	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
	
	
	public WebDriver launchBrowser(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			tlDriver.set(new ChromeDriver());	
		}else if(browser.equalsIgnoreCase("firefox")) {
			tlDriver.set(new FirefoxDriver());
	}
		return getDriver();
	}
	
	public static synchronized WebDriver getDriver()
	{
		return tlDriver.get();
	}
	
}

