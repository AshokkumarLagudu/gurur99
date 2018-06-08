package UtilClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Util {
 public static WebDriver driver;
	public void Initioalization(){
	System.setProperty("webdriver.gecko.driver","E:\\SeleniumPract\\geckodriver-v0.19.1-win64\\geckodriver.exe");
	driver=new FirefoxDriver();
	
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    driver.get("http://www.demo.guru99.com/V4/");
	}
	

	
}
