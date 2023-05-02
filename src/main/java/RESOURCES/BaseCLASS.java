package RESOURCES;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseCLASS {
	public WebDriver driver;
	public Properties pro;

	public void initializeDriver() throws IOException {
		// This will access the properties file
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\AMAR\\eclipse-workspace\\MAVEN\\src\\main\\java\\RESOURCES\\Data.properties");

		// to read the file
		pro = new Properties();
		pro.load(fis);

		String browsername = pro.getProperty("Browser");

		if (browsername.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browsername.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browsername.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		} else {
			System.out.println("please choose valid browser to run your scripts");
		}
	}

	@BeforeMethod
	public void launchBrowser() throws IOException {
		initializeDriver();

		String url = pro.getProperty("url");
		driver.get(url);
	}

	@AfterMethod
	public void quitBrowser() {

		driver.quit();

	}

}
