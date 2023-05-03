package RESOURCES;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class CommonMethods {

	public static void handleDropdown(WebElement a,int index) {
		
		Select s = new Select(a);
		s.selectByIndex(2);
	}
	
	
	public static void handleAssertions(String act, String exp, String message) {
		//act--actual test, exp--expected test, message--error msg
		
		SoftAssert assertion = new SoftAssert();
		
		assertion.assertEquals(act, exp,message);
		
		assertion.assertAll();
	}
	
	
	
}
