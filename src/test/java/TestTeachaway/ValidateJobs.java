
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

public class ValidateJobs {

	LandingPage lp;
	Actions ac;
	WebElement mainMenuItem_Jobs;
	WebDriver driver;

	public ValidateJobs(WebDriver driver) throws IOException {
		this.driver = driver;
		lp = new LandingPage(driver);
		mainMenuItem_Jobs = lp.getMainMenuItem(constants.MENU_JOBS);
	}

	public void testJobsNavigation() {

		ac = new Actions(driver);
		System.out.println("$$ Main Menu Item: " + mainMenuItem_Jobs.getText());
		ac.moveToElement(mainMenuItem_Jobs).build().perform();
	}

	public void testJobsboardNavigation() {
		try {
			testJobsNavigation();
			WebElement subMenuItem_JobBoard = lp.getSubMenuItem(constants.SUB_MENU_JOB_BOARD);
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(subMenuItem_JobBoard));
			subMenuItem_JobBoard.click();
			String expected = "Find Teaching Jobs Abroad";
			System.out.println("JOBS: " + lp.getVerificationString());
			Assert.assertEquals(lp.getVerificationString(), expected);
		} catch (StaleElementReferenceException e) {
			System.out.println("" + e.getMessage() + "\n" + e.getStackTrace());
		}

	}

	public void testDestNavigation() {
		try {
			testJobsNavigation();
			WebElement subMenuItem_Dest = lp.getSubMenuItem(constants.SUB_MENU_JOBS_DESTI);
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(subMenuItem_Dest));
			ac.moveToElement(subMenuItem_Dest).build().perform();
			Assert.assertEquals(lp.getDestItemCount().getText(), "Abu Dhabi");
		} catch (StaleElementReferenceException e) {
			System.out.println("" + e.getMessage() + "\n" + e.getStackTrace());
		}
	}

	public void testFpNavigation() {
		try {
			testJobsNavigation();
			WebElement subMenuItem_Fp = lp.getSubMenuItem(constants.SUB_MENU_JOBS_FP);
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(subMenuItem_Fp));
			ac.moveToElement(subMenuItem_Fp).build().perform();
		} catch (StaleElementReferenceException e) {
			System.out.println("" + e.getMessage() + "\n" + e.getStackTrace());
		}

	}

	public void testJobopeningsNavigation() {
		try {
			testJobsNavigation();
			WebElement subMenuItem_Jo = lp.getSubMenuItem(constants.SUB_MENU_JOBS_JO);
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(subMenuItem_Jo));
			ac.moveToElement(subMenuItem_Jo).build().perform();
			Assert.assertEquals(lp.getJobOpeningItem().getText(), "Licensed Teachers");
		} catch (StaleElementReferenceException e) {
			System.out.println("" + e.getMessage() + "\n" + e.getStackTrace());
		}

	}

	public void testTeachInUSNavigation() {
		try {
			testJobsNavigation();
			WebElement subMenuItem_TeachInUS = lp.getSubMenuItem(constants.SUB_MENU_JOBS_TIUS);
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(subMenuItem_TeachInUS));
			ac.moveToElement(subMenuItem_TeachInUS).build().perform();
			Assert.assertEquals(lp.getTeachInUSItem().getText(), "New York City");
		} catch (StaleElementReferenceException e) {
			System.out.println("" + e.getMessage() + "\n" + e.getStackTrace());
		}
	}

	public void testCommunityItemNavigation() {
		try {
			testJobsNavigation();
			WebElement subMenuItem_Comm = lp.getSubMenuItem(constants.SUB_MENU_JOBS_COMM);
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(subMenuItem_Comm));
			ac.moveToElement(subMenuItem_Comm).build().perform();
			Assert.assertEquals(lp.getCommunityItem().getText(), "Blog");
		} catch (StaleElementReferenceException e) {
			System.out.println("" + e.getMessage() + "\n" + e.getStackTrace());
		}
	}
}