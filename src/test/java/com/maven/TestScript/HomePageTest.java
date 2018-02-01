package com.maven.TestScript;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.maven.Base.TestBase;
import com.maven.PageLibs.HomePage;

public class HomePageTest extends TestBase {
	
	HomePage HomePage;
	
	 public HomePageTest(){
		super();
	}
	@BeforeMethod
	public void setup(){
		initializetion();
		HomePage =new HomePage();		
		}
	
	@Test(priority=0)
	public void GetTitle(){
		HomePage.HomePageTitle();
	}
	
	@Test(priority=1)
	public void DemoLink(){
		HomePage.VarifyDemoLink();
	}
	
	@Test(priority=2)
	public void OrderLink(){
		HomePage.VarifyOrderLink();
	}
	
	@Test(enabled=false)
	public void validatelogin() {
		HomePage.VarifyLoginLInk();
	}
	
	@AfterTest
	public void tearDown(){
		driver.quit();
	}

}
