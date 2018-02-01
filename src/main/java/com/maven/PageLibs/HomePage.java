package com.maven.PageLibs;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.maven.Base.TestBase;

public class HomePage extends TestBase {
	
	LoginPage LoginPage;
	@FindBy(xpath = "//a[contains(text(),'Demo')]")
	private WebElement DemoLink;
	
	@FindBy(xpath = "//a[contains(text(),'Order')]")
	private WebElement orderLink;
	
	@FindBy(xpath = "//i[@class='ico fa fa-lock']")
	private WebElement LoginLink;
	

	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	public void HomePageTitle(){
		String HomePageTitle=driver.getTitle();
		System.out.println(HomePageTitle);
	}
	
public void VarifyDemoLink(){
	Boolean bool=DemoLink.isDisplayed();
	System.out.println("it is present or not=" + bool);
	DemoLink.click();	    
}
public void VarifyOrderLink(){
	Boolean bool=DemoLink.isDisplayed();
	System.out.println("it is present or not=" + bool);
	orderLink.click();	    
}
public LoginPage VarifyLoginLInk(){
	LoginLink.click();
	String Parent=driver.getWindowHandle();
	Set<String> AllWindows=driver.getWindowHandles();
	int size=AllWindows.size();
	System.out.println(size);
	for (String next : AllWindows) {
		if(!Parent.equalsIgnoreCase(next)){
			driver.switchTo().window(next);
		}
		
	}
	return LoginPage;
}
	

	
	

}
