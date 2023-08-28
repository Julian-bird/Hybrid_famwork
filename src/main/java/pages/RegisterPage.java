package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage {
	WebDriver driver;
	@FindBy(id="input-firstname")
	private WebElement FirstName;
	
	@FindBy(id="input-lastname")
	private WebElement LastName;
	
	@FindBy(id="input-email")
	private WebElement EMail;
	
	@FindBy(id="input-password")
	private WebElement Password;
	
	@FindBy(css="input[name='agree']")
	private WebElement Privacy;
	
	@FindBy(css="button[type='submit']")
	private WebElement button;
	
	@FindBy(id="error-firstname")
	private WebElement errorFirstname;
	
	@FindBy(id="error-lastname")
	private WebElement errorLastname;
	
	@FindBy(id="error-email")
	private WebElement errorEmail;
	
	@FindBy(id="error-password")
	private WebElement errorPassword;
	
	@FindBy(id="alert")
	private WebElement alert;
	
}
