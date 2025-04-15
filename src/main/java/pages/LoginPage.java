package pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;



public class LoginPage extends TestBase{
	
    public LoginPage() {
		
		PageFactory.initElements(driver, this);
		
	
}
	
	@FindBy(name="username")
	WebElement username;
	
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(xpath="//img[contains(@class,'img-responsive')]")
	WebElement logo;
	
	
	public HomePage login(String usernameText, String passwordText) {
		
		username.sendKeys(usernameText);
		password.sendKeys(passwordText);
		loginBtn.click();
		
		return new HomePage();
		
	}
	
	public boolean validateImage(){
		return logo.isDisplayed();
	}
	

	
}
