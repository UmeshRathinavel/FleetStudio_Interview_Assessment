package com.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class PageElements extends BaseClass {

	private PageElements() {
		PageFactory.initElements(driver, this);
	}
	
	private static PageElements elements;

	@FindBy(xpath = "//a[@class='btn btn-primary']")
	private WebElement newcustomer_btn;
	@FindBy(xpath = "//input[@id='input-firstname']")
	private WebElement firstName;
	@FindBy(xpath = "//input[@id='input-lastname']")
	private WebElement lastName;
	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement email;
	@FindBy(xpath = "//input[@id='input-telephone']")
	private WebElement phone;
	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement password;
	@FindBy(xpath = "//input[@id='input-confirm']")
	private WebElement confirm_pass;
	
	@FindBy(xpath = "//label[text() = 'Yes']")
	private WebElement subscribe_radiobtn;
	@FindBy(xpath = "//input[@name='agree']")
	private WebElement agree;
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continue_btn;
	
		
	public static PageElements getElements() {
		if (elements == null) {
			elements = new PageElements();
		}
		return elements;
	}


	public WebElement getNewcustomer_btn() {
		return newcustomer_btn;
	}


	public WebElement getFirstName() {
		return firstName;
	}


	public WebElement getLastName() {
		return lastName;
	}


	public WebElement getEmail() {
		return email;
	}


	public WebElement getPhone() {
		return phone;
	}


	public WebElement getPassword() {
		return password;
	}


	public WebElement getConfirm_pass() {
		return confirm_pass;
	}


	public WebElement getSubscribe_radiobtn() {
		return subscribe_radiobtn;
	}


	public WebElement getAgree() {
		return agree;
	}


	public WebElement getContinue_btn() {
		return continue_btn;
	}

	
	
	
	
}
