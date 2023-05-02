package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import RESOURCES.BaseCLASS;

public class LoginPage extends BaseCLASS {

	public WebDriver driver;
	
	private By Username=By.xpath("//input[@id='username']");
	private By Password=By.xpath("//input[@id='password']");
	private By Login   =By.xpath("//input[@id='Login']");
	private By tryForFree=By.xpath("//a[@id='signup_link']");
	private By errorText=By.xpath("//div[@id='error']");
	
	
	public LoginPage(WebDriver driver2) {
		this.driver=driver2;
	}
	
	
	

	public WebElement enterUsername() {
		return driver.findElement(Username);		
	}
	
	public WebElement enterPassword() {
		return driver.findElement(Password);
	}
	
	public WebElement enterLogin() {
		return driver.findElement(Login);
	}
	public WebElement tryforfree() {
		return driver.findElement(tryForFree);
	}
	public WebElement errorText() {
		return driver.findElement(errorText);
	}
}
