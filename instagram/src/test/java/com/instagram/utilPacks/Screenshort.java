package com.instagram.utilPacks;

import java.io.File;
import java.io.IOException;

import java.util.Date;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.instagram.base.BrowserSetup;

public class Screenshort {

	public WebDriver driver;
	public Screenshort() {
		this.driver = BrowserSetup.driver;
	}
	 public void takeScreenShot(){

//		 test.log(LogStatus.INFO, "Take screenshot and keep it on the memory location called File");
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 String time = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss").format(new Date());
		
		 try {
//		 test.log(LogStatus.INFO, "copy the screenshot from File and paste in the given location");
		 //FileUtils.copyFile(src, new File("C:\\images\\pic.png"));

		 FileUtils.copyFile(src, new File("./Screenshort" + time + "image.png"));
		 //extent = new ExtentReports(new SimpleDateFormat("yyyy-MM-dd hh-mm-ss").format(new Date()) + "reports.html");
		 } catch (IOException e) {
		 e.printStackTrace();
		 }

//		 test.log(LogStatus.INFO, "Tag the screenshot into the report generated");
//		 test.log(LogStatus.INFO,test.addScreenCapture(ConstantValues.SCREEN_LOCATION + time + "pic.png"));
		 }

}
