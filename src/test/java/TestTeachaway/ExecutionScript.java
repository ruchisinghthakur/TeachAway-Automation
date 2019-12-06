package TestTeachaway;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObject.LandingPage;

public class ExecutionScript extends FrameworkDriverScript {

	WebElement mainMenuItem;
	LandingPage lp;
	Actions ac;
	
	@BeforeTest
	public void startup() throws IOException {

		driver = driverInitialization();
		driver.get(prop.getProperty("url"));

	}
	
	@Test (dataProvider = "MenuDataProvider")
	public void testJobs_JobBoard(String Menu,String SubMenu) throws InterruptedException, IOException {
		lp = new LandingPage(driver);
		mainMenuItem = lp.getMainMenuItem(Menu);
		ac = new Actions(driver);
		System.out.println("$$ Main Menu Item: " + mainMenuItem.getText());
		ac.moveToElement(mainMenuItem).build().perform();
		WebElement subMenuItem = lp.getSubMenuItem(Menu,SubMenu);
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(subMenuItem));
		subMenuItem.click();
	
		
	}
	
	
	
		@DataProvider(name="MenuDataProvider")
		public static Object[][] getDataFromDataprovider(){
	        return new Object[][] {
	            { "Jobs", "Job Board" },
	            { "Jobs", "Destinations" },
	            { "Jobs", "Featured Programs" },
	            { "Jobs", "Job Openings" },
	            { "Jobs", "Teach in the US"},
	            { "Jobs", "Community" },
	            { "Tefl", "TEFL Courses" },
	            { "Tefl", "TEFL Certification Guide" },
	            { "Teacher Certification","Certification Program" },
	            { "Teacher Certification", "Teacher Certification Guide" }
	        }; 
		}
	
	@AfterTest
	public void teardown() {
		driver.close();
		driver=null; //to close the initialization
	}

}