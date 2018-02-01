package com.maven.TestScript;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.maven.PageLibs.HomePage;
import com.maven.PageLibs.LoginPage;
import com.maven.Base.TestBase;

public class LoginPageTest extends TestBase{
	HomePage HomePage;
	LoginPage LoginPage;
	
	 public LoginPageTest(){
		super();
	}
	@BeforeMethod
	public void setup(){
		initializetion();
		HomePage=new HomePage();
		LoginPage =new LoginPage();		
		}

	
	@Test
	public void validatelogin() {
		HomePage.VarifyLoginLInk();
		LoginPage.loginPage(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	@AfterTest
	public void tearDown(){
		driver.close();
	}
}
