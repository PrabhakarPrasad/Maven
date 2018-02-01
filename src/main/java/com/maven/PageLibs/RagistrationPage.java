package com.maven.PageLibs;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.maven.Base.TestBase;

public class RagistrationPage extends TestBase {

	RagistrationPage RagistrationPage;

	@FindBy(xpath = "//input[@id='inputFirstName']")
	private WebElement FirstName;

	@FindBy(xpath = "//input[@id='inputLastName']")
	private WebElement LastName;

	@FindBy(xpath = "//input[@id='inputEmail']")
	private WebElement EmailAddress;

	@FindBy(xpath = "//input[@id='inputPhone']")
	private WebElement phonenumber;

	@FindBy(xpath = "//input[@id='inputAddress1']")
	private WebElement StreetAddress;

	@FindBy(xpath = "//input[@id='inputCity']")
	private WebElement CityName;

	@FindBy(xpath = "//input[@id='stateinput']")
	private WebElement Statename;

	@FindBy(xpath = "//input[@id='inputPostcode']")
	private WebElement postcode;

	@FindBy(xpath = "//*[@id='customfield1']")
	private WebElement foundby;

	@FindBy(xpath = "//input[@id='customfield2']")
	private WebElement WattsappNo;

	@FindBy(xpath = "//input[@id='inputNewPassword1']")
	private WebElement Password;

	@FindBy(xpath = "//input[@id='inputNewPassword2']")
	private WebElement Cpassword;

	@FindBy(xpath = "//input[@id='inputCaptcha']")
	private WebElement imageCharTextBox;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement RagistrationSubmitButton;

	@FindBy(xpath = "//a[contains(text(),'Register')]")
	private WebElement Registrationbutton;

	public RagistrationPage() {
		PageFactory.initElements(driver, this);
	}
	

	public void RegistrationPage(String FName, String LName, String Email, String PNo, String Adress, String City,
			String State, String PostCode, String WhatsAppNo, String PWord, String CPword, String ImageText) {

		Registrationbutton.click();
		FirstName.sendKeys(FName);
		LastName.sendKeys(LName);
		EmailAddress.sendKeys(Email);
		phonenumber.sendKeys(PNo);
		StreetAddress.sendKeys(Adress);
		CityName.sendKeys(City);
		Statename.sendKeys(State);
		postcode.sendKeys(PostCode);
		WebElement Select = foundby;
		Select sel = new Select(Select);
		Boolean value = sel.isMultiple();
		System.out.println(value);
		sel.selectByIndex(1);
		WattsappNo.sendKeys(WhatsAppNo);
		Password.sendKeys(PWord);
		Cpassword.sendKeys(CPword);
		imageCharTextBox.sendKeys(ImageText);
		RagistrationSubmitButton.click();
	}

}
