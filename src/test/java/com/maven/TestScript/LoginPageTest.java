package com.maven.TestScript;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.maven.PageLibs.LoginPage;
import com.maven.Base.TestBase;

public class LoginPageTest extends TestBase{
	
	LoginPage LoginPage;
	
	 public LoginPageTest(){
		super();
	}
	@BeforeMethod
	public void setup(){
		initializetion();
		LoginPage =new LoginPage();		
		}
	
	@Test(priority=1)
	public void DemoLink(){
		LoginPage.VarifyDemoLink();
	}
	
	@Test(priority=2)
	public void OrderLink(){
		LoginPage.VarifyOrderLink();
	}
	@Test(priority=3)
	public void validatelogin() {
		LoginPage.loginPage(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	@AfterTest
	public void tearDown(){
		driver.close();
	}
}
