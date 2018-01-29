package com.maven.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.maven.Utility.TestUtill;

public class TestBase {
	public static WebDriver driver;
    public static Properties prop;
	       
	       
	public TestBase(){
	
		try {
			prop=new Properties();
			FileInputStream ip=new FileInputStream(System.getProperty("user.dir") + 
					"\\src\\main\\java\\com\\maven\\config\\Config.Properties");
			prop.load(ip);
			FileInputStream ip1=new FileInputStream(System.getProperty("user.dir") + 
					"\\src\\main\\java\\com\\maven\\config\\Config1.Properties");
			prop.load(ip1);
		    }catch (FileNotFoundException e) {
				e.printStackTrace();
				}
		     catch (IOException e) {
				e.printStackTrace();
				}
            }
	
	public static void initializetion(){
		String BrowserName=prop.getProperty("Browser");
		if(BrowserName.equals("chrome")){
		    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}else if(BrowserName.equals("firefox")){
			driver=new FirefoxDriver();
		}
		String url=prop.getProperty("url");
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtill.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtill.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
	}
}
