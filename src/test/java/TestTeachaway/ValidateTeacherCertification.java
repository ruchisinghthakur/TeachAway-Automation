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

public class ValidateTeacherCertification {

	LandingPage lp;
	Actions ac;
	WebElement mainMenuItem_Tc;
	WebDriver driver;

	public ValidateTeacherCertification(WebDriver driver) throws IOException {
		this.driver = driver;
		lp = new LandingPage(driver);
		mainMenuItem_Tc = lp.getMainMenuItem(constants.MENU_TC);
	}

	public void testTcNavigation() {

		ac = new Actions(driver);
		System.out.println("$$ Main Menu Item: " + mainMenuItem_Tc.getText());
		ac.moveToElement(mainMenuItem_Tc).build().perform();
	}

	public void testCertificationProgramNavigation() {
		try {
			testTcNavigation();
			WebElement subMenuItem_cp = lp.getTcSubMenuItem(constants.SUB_MENU_TC_CERTIPROG);
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(subMenuItem_cp));
			subMenuItem_cp.click();
			Assert.assertEquals(lp.getVerificationString(), "Teacher Certification Program");
		} catch (StaleElementReferenceException e) {
			System.out.println("" + e.getMessage() + "\n" + e.getStackTrace());
		}

	}

	public void testCertificationGuideNavigation() throws InterruptedException {
		try {
			testTcNavigation();
			WebElement subMenuItem_cg = lp.getTcSubMenuItem(constants.SUB_MENU_TC_CERTIGUIDE);
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(subMenuItem_cg));
			subMenuItem_cg.click();
			Assert.assertEquals(lp.getVerificationString(), "Alternative Teacher Certification");
		} catch (StaleElementReferenceException e) {
			System.out.println("" + e.getMessage() + "\n" + e.getStackTrace());
		}
	}

}