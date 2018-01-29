package com.maven.TestScript;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.maven.Base.TestBase;
import com.maven.PageLibs.RagistrationPage;

public class RegistrationPageTest extends TestBase {
	RagistrationPage RegistrationPage;
		
	 public RegistrationPageTest(){
		super();
	}
	 
		@BeforeMethod
		public void setup(){
			initializetion();
			RegistrationPage =new RagistrationPage();		
			}
		
		@Test
		public void validateRagistrationPage() {			
			
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
