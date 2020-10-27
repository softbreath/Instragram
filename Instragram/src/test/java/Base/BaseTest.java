package Base;

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

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public static WebDriver driver;
	
	public void init(){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.instagram.com/?hl=en");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	
	public void takeScreenShot(){
		 //Take screenshot and keep it on the memory location called File
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		 // To get a name for screenshots as timestamp
		 String time = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss").format(new Date());
		
		 try {
		 //copy the screenshot from File and paste in the given location");
		
		 FileUtils.copyFile(src, new File("c:\\image\\"+ time + "pic.png"));
		
		 } catch (IOException e) {
		 e.printStackTrace();
		 }

		 }

}
