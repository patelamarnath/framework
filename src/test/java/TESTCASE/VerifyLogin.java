package TESTCASE;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LoginPage;
import RESOURCES.BaseCLASS;

public class VerifyLogin extends BaseCLASS {

	/*@Test
	public void login() throws IOException, InterruptedException {
	
		// initializeDriver();.....no need to initialize browser and nevigate url...code is written in baseclass 
		//driver.get("https://login.salesforce.com/"); // This driver is not null- its having scope 

		LoginPage LP = new LoginPage(driver);
		Thread.sleep(5000);

		LP.enterUsername().sendKeys("samar");
		LP.enterPassword().sendKeys("321*");
		LP.enterLogin().click();
		LP.tryforfree().click();

	}*/

	@Test
	public void login1() throws IOException {

	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		LoginPage LPO = new LoginPage(driver);

		LPO.enterUsername().sendKeys("rahul");
		LPO.enterPassword().sendKeys("123");
		LPO.enterLogin().click();

		
		// using soft assertion
		
		String actualText = LPO.errorText().getText();
		 
		String expctedText = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		
		SoftAssert assertion = new SoftAssert();
		assertion.assertEquals(actualText, expctedText, "Error message is not valid");
		
		assertion.assertAll();
	}
}
