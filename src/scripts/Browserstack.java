package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Browserstack {
	public static final String USERNAME = "kalpitamankame1";
	  public static final String AUTOMATE_KEY = "kEoqVz5N8w6qF6PF1sHP";
	  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	  public static void main(String[] args) throws Exception {

	    DesiredCapabilities caps = new DesiredCapabilities();
//	    caps.setCapability("browser", "Chrome");
//	    caps.setCapability("browser_version", "62.0");
//	    caps.setCapability("os", "Windows");
//	    caps.setCapability("os_version", "10");
//	    caps.setCapability("resolution", "1024x768");
//	    caps.setCapability("name", "Bstack-[Java] Sample Test");

	    caps.setCapability("os", "OS X");
	    caps.setCapability("os_version", "Catalina");
	    caps.setCapability("browser", "Chrome");
	    caps.setCapability("browser_version", "79.0 beta");
	    caps.setCapability("project", "GooglePageTest");
	    caps.setCapability("build", "Build 1.0");
	    caps.setCapability("name", "'Title Test'");
	    caps.setCapability("browserstack.local", "false");
	    caps.setCapability("browserstack.debug", "true");
	    caps.setCapability("browserstack.networkLogs", "true");
	    caps.setCapability("browserstack.selenium_version", "3.5.2");
	    WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);
	    driver.get("https://bombayworks.sumhr.com/user/login");
	    
	    WebElement element = driver.findElement(By.name("UserLogin[username]"));
	    WebElement element1 = driver.findElement(By.name("UserLogin[password]"));
	    WebElement loginbutton = driver.findElement(By.className("button")); 
	  
	    element.sendKeys("sakshi.chauhan@bombayworks.se");
	    element1.sendKeys("Firefox82");
	    loginbutton.click();
	    
	    WebElement skip = driver.findElement(By.className("introjs-skipbutton"));
	    skip.click();
	    
	    WebElement profile = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul[2]/li[7]/a"));
	    profile.click();
	   // element.submit();
	  
	    
	    WebElement profileDetail = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul[2]/li[7]/ul/li[1]/a"));
	    profileDetail.click();
	    
	    WebElement proPic = driver.findElement(By.xpath("//*[@id=\"user-profile-pic\"]/img"));
	    proPic.click();
	    
	    WebElement edit = driver.findElement(By.xpath("//*[@id=\"personal\"]"));
	    edit.click();
	    
	    WebElement dob = driver.findElement(By.xpath("//*[@id=\"UserPersonal_show_dob_year\"]"));
	    dob.click();
	    
	    WebElement update = driver.findElement(By.xpath("//*[@id=\"profile_update_btn\"]"));
	    update.click();
	    
	    WebElement message = driver.findElement(By.xpath(""));
	    System.out.println(driver.getTitle());
	   // driver.quit();

	  }
	}
