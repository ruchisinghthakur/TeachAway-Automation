package TestTeachaway;

import Constants.constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pageObject.LandingPage;
import java.io.IOException;

public class ValidateCourses {

	LandingPage lp;
	Actions ac;
	WebElement mainMenuItem_Courses;
	WebDriver driver;

	public ValidateCourses(WebDriver driver) throws IOException {
		this.driver = driver;
		lp = new LandingPage(driver);
		mainMenuItem_Courses = lp.getMainMenuItem(constants.MENU_COURSES);
	}

	public void testCourseNavigation() throws InterruptedException {

		ac = new Actions(driver);
		System.out.println("$$ Main Menu Item: " + mainMenuItem_Courses.getText());
		ac.moveToElement(mainMenuItem_Courses).click().build().perform();
		Assert.assertEquals(lp.getVerificationString(), "Courses and Certifications");
	}

}