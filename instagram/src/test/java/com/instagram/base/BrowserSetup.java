package com.instagram.base;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserSetup {

	public static WebDriver driver;
	public String browser="chrome";
	

	
	@BeforeClass
	public void beforeClass(){
		
		if(browser.equalsIgnoreCase("chrome") ){
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
				
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		
		// Get Url of Application
			String url = "https://www.instagram.com/accounts/login/?hl=en";
				driver.get(url);
				
		}
	
	
	@AfterClass
	public void afterClass(){
		
		driver.quit();
		
	}
	
}
