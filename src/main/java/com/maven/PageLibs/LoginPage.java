package com.maven.PageLibs;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.maven.Base.TestBase;

public class LoginPage extends TestBase {
	RagistrationPage RagistrationPage;
	
	
	@FindBy(xpath = ".//*[@id='inputEmail']")
	private WebElement emailEdit;
	
	@FindBy(xpath = "//input[@id='inputPassword']")
	private WebElement passwordEdit;
	
	@FindBy(xpath = ".//*[@id='login']")
	private WebElement Submitbutton;
	
	@FindBy(xpath = "//a[contains(text(),'Register')]")
	private WebElement Registrationbutton;
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	
	public void loginPage(String email,String Passwd){
		emailEdit.sendKeys(email);
		passwordEdit.sendKeys(Passwd);
		Submitbutton.click();

	}
	
	public RagistrationPage ClickOnRegisrationButton(){
		Registrationbutton.click();
		return RagistrationPage;
	}


}
