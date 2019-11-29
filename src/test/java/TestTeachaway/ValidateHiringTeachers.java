package TestTeachaway;

import Constants.constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pageObject.LandingPage;
import java.io.IOException;

public class ValidateHiringTeachers{
	
	LandingPage lp;
	Actions ac;
	WebElement mainMenuItem_Hiring;
	WebDriver driver;
	public ValidateHiringTeachers(WebDriver driver) throws IOException {
		this.driver = driver;
	 lp = new LandingPage(driver);
	 mainMenuItem_Hiring = lp.getMainMenuItem(constants.MENU_HIRETEACHERS);
	}	
	
	
public void testHiringNavigation() {
	
	ac = new Actions(driver);
	System.out.println("$$ Main Menu Item: "+mainMenuItem_Hiring.getText());
	ac.moveToElement(mainMenuItem_Hiring).click().build().perform();
	Assert.assertEquals(lp.getVerificationString(), "Hiring teachers just got easier");
}






}