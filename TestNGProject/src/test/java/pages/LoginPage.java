package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	//-------WebElements or Locators-------------
	
	@FindBy(linkText="Log in")
	WebElement loginLink;
	
	@FindBy(name="user_login")
	WebElement UserName;
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(id="remember-me")
	WebElement rememberMe;

	@FindBy(name="btn_login")
	WebElement LoginBtn;

	
	//-----------Functions------------------------
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);   //need to call this 'initElement' function to with class called 'PageFactory' with the method, otherwise all
		 										  // this (webElements / Locators) will be initialized on this class itself.
		
	}

	 public void LoginFunction(String UserNameVal, String PwdVal) {
		 
		 	// click on the login link
			//WebElement loginLink = driver.findElement(By.linkText("Log in"));   //don't need to declare them again becoz its already define in the Locator section
			loginLink.click();

			//WebElement UserName = driver.findElement(By.name("user_login"));
			UserName.sendKeys("abc@xyz.com");

			//WebElement Password = driver.findElement(By.id("password"));
			Password.sendKeys("Abc@12345");

			//WebElement rememberMe = driver.findElement(By.id("remember-me"));
			rememberMe.click();

			//WebElement LoginBtn = driver.findElement(By.name("btn_login"));
			LoginBtn.click();
	 }
}
