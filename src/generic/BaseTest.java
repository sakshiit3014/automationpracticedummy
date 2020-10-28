package generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTest implements IAutoConstant{
	public static WebDriver driver;
	static{
		System.setProperty(GECKO_KEY, GECKO_VALUE);
		System.setProperty(CHROME_KEY, CHROME_VALUE);
	}
	//@BeforeMethod
	//@BeforeClass
	@BeforeTest
	public void openApplication(){
		 //driver = new FirefoxDriver();
		 driver = new ChromeDriver();
		 String url = Lib.getProperty(CONFIG_PATH, "URL");
		driver.get(url);
		String ITO = Lib.getProperty(CONFIG_PATH, "ImplicitTimeOut");
		int timeoutPeriod = Integer.parseInt(ITO);
		driver.manage().timeouts().implicitlyWait(timeoutPeriod, TimeUnit.SECONDS); 
		
	}
	
	
	//@AfterMethod
	//public void closeApplication(){
		//driver.close();
	//}
	
	
	public void takeScreenshot(String testname){
		Date d = new Date();
		String currentdate = d.toString().replaceAll(":", "_");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File(".\\screenshots\\"+currentdate+"\\"+testname+"_screenshot.png");
		try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}