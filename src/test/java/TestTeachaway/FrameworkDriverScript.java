package TestTeachaway;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Constants.constants;

public class FrameworkDriverScript extends constants {
	public WebDriver driver;
	public Properties prop;

	public WebDriver driverInitialization() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream(RESOURCES_PATH);
		prop.load(fis);
		String driverName = prop.getProperty("browser");
		if (driverName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", DRIVER_PATH);
			driver = new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
}
