package com.maven.TestScript;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.maven.Base.TestBase;
import com.maven.PageLibs.HomePage;
import com.maven.PageLibs.LoginPage;
import com.maven.PageLibs.RagistrationPage;

public class RegistrationPageTest extends TestBase {
	RagistrationPage RegistrationPage;
	LoginPage LoginPage;
	HomePage HomePage;
	
	
	 public RegistrationPageTest(){
		super();
	}
	 
		@BeforeMethod
		public void setup(){
			initializetion();
			HomePage = new HomePage();
			LoginPage =new LoginPage();
			RegistrationPage =new RagistrationPage();
			}
		
		@Test
		public void validateRagistrationPage() {
			HomePage.VarifyLoginLInk();
			LoginPage.ClickOnRegisrationButton();
			RegistrationPage.RegistrationPage(prop.getProperty("FName"), prop.getProperty("LName"),
					prop.getProperty("Email"), prop.getProperty("PNo"), prop.getProperty("Adress"), prop.getProperty("City"),
					prop.getProperty("State"), prop.getProperty("PostCode"), prop.getProperty("WhatsAppNo")
					, prop.getProperty("Prabhakar_123"), prop.getProperty("Prabhakar_123"), prop.getProperty(""));
		}
		
		@AfterTest
		public void tearDown(){
			driver.close();
		}
	
}
