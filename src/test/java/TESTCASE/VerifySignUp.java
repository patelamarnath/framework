package TESTCASE;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LoginPage;
import PageObjectModel.SignupPage;
import RESOURCES.BaseCLASS;
import RESOURCES.CommonMethods;

public class VerifySignUp extends BaseCLASS {

	@Test
	public void signup() throws IOException, InterruptedException {

	//	initializeDriver(); .....modificaion url in signuppage
	//	driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		LoginPage LP = new LoginPage(driver);
		LP.tryforfree().click();

		SignupPage sp = new SignupPage(driver);
		Thread.sleep(2000);

		sp.enterfirstname().sendKeys("samar");
		sp.enterlastname().sendKeys("season");
		sp.enterjobtitle().sendKeys("tester");
		sp.enteremail().sendKeys("season123@gmail.com");
		sp.entercompany().sendKeys("google");
		sp.enterphone().sendKeys("9514862370");
		
		
		CommonMethods.handleDropdown(sp.enteremployee(), 1);
		
		CommonMethods.handleDropdown(sp.entercountry(), 2);
		
		
		/*Select s = new Select(sp.enteremployee());
		s.selectByIndex(2);
		Select a = new Select(sp.entercountry());
		a.selectByVisibleText("India");*/
		

	}
}
