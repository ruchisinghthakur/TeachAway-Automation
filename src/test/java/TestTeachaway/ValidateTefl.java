package TestTeachaway;

import Constants.constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pageObject.LandingPage;
import java.io.IOException;
import org.openqa.selenium.StaleElementReferenceException;

public class ValidateTefl {

	LandingPage lp;
	Actions ac;
	WebElement mainMenuItem_Tefl;
	WebDriver driver;

	public ValidateTefl(WebDriver driver) throws IOException {
		this.driver = driver;
		lp = new LandingPage(driver);
		mainMenuItem_Tefl = lp.getMainMenuItem(constants.MENU_TEFL);
	}

	public void testTeflNavigation() {

		ac = new Actions(driver);
		System.out.println("$$ Main Menu Item: " + mainMenuItem_Tefl.getText());
		ac.moveToElement(mainMenuItem_Tefl).build().perform();
	}

	public void testTeflCoursesNavigation() {
		try {
			testTeflNavigation();
			WebElement subMenuItem_TeflCourses = lp.getTeflSubMenuItem(constants.SUB_MENU_TEFL_COURSES);
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(subMenuItem_TeflCourses));
			subMenuItem_TeflCourses.click();
			Assert.assertEquals(lp.getVerificationString(), "Online TEFL certification");
		} catch (StaleElementReferenceException e) {
			System.out.println("" + e.getMessage() + "\n" + e.getStackTrace());
		}

	}

	public void testTeflCertificationNavigation() throws InterruptedException {
		try {
			testTeflNavigation();
			WebElement subMenuItem_TeflCerti = lp.getTeflSubMenuItem(constants.SUB_MENU_TEFL_CERTIFICATION);
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(subMenuItem_TeflCerti));
			subMenuItem_TeflCerti.click();
			Assert.assertEquals(lp.getVerificationString(), "TEFL Certification");
		} catch (StaleElementReferenceException e) {
			System.out.println("" + e.getMessage() + "\n" + e.getStackTrace());
		}
	}

}