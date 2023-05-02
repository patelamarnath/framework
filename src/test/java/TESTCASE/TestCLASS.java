package TESTCASE;

import java.io.IOException;

import org.testng.annotations.Test;

import RESOURCES.BaseCLASS;

public class TestCLASS extends BaseCLASS {

	@Test
	public void login() throws IOException {
		
		initializeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.get("https://login.salesforce.com/");
	}
}
