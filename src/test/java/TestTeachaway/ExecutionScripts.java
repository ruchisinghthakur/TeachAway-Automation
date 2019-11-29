package TestTeachaway;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExecutionScripts extends FrameworkDriverScript {

	@BeforeTest
	public void startup() throws IOException {

		driver = driverInitialization();
		driver.get(prop.getProperty("url"));

	}
	
    //This test is intended to verify successful navigation to JobBoard under Jobs in main menu
	@Test
	public void testJobs_JobBoard() throws InterruptedException, IOException {
		ValidateJobs vj = new ValidateJobs(driver);
		System.out.println("$$ TEST JOBS");
		vj.testJobsboardNavigation();
		Thread.sleep(1000);
	}
	
	//This test is intended to verify successful navigation to Destinations under Jobs in main menu
	@Test
	public void testJobs_Destination() throws InterruptedException, IOException {
		ValidateJobs vj = new ValidateJobs(driver);
		System.out.println("$$ TEST JOBS1");
		vj.testDestNavigation();
		Thread.sleep(1000);
	}

	//This test is intended to verify successful navigation to FeaturedPrograms under Jobs in main menu
	@Test
	public void testJobs_FeaturedPrograms() throws InterruptedException, IOException {
		ValidateJobs vj = new ValidateJobs(driver);
		System.out.println("$$ TEST JOBS2");
		vj.testFpNavigation();
		Thread.sleep(1000);
	}

	//This test is intended to verify successful navigation to JobOpenings under Jobs in main menu
	@Test
	public void testJobs_JobOpenings() throws InterruptedException, IOException {
		ValidateJobs vj = new ValidateJobs(driver);
		System.out.println("$$ TEST JOBS3");
		vj.testJobopeningsNavigation();
		Thread.sleep(1000);
	}

	//This test is intended to verify successful navigation to Teach in US under Jobs in main menu
	@Test
	public void testJobs_TeachInUS() throws InterruptedException, IOException {
		ValidateJobs vj = new ValidateJobs(driver);
		System.out.println("$$ TEST JOBS4");
		vj.testTeachInUSNavigation();
		Thread.sleep(1000);
	}

	//This test is intended to verify successful navigation to Community under Jobs in main menu
	@Test
	public void testJobs_Community() throws InterruptedException, IOException {
		ValidateJobs vj = new ValidateJobs(driver);
		System.out.println("$$ TEST JOBS5");
		vj.testCommunityItemNavigation();
		Thread.sleep(1000);
	}

	//This test is intended to verify successful navigation to TEFL Courses under TEFL in main menu
	@Test
	public void testTefl_Courses() throws InterruptedException, IOException {
		ValidateTefl vt = new ValidateTefl(driver);
		System.out.println("$$ TEST JOBS6");
		vt.testTeflCoursesNavigation();
		Thread.sleep(1000);
	}

	//This test is intended to verify successful navigation to TEFL Certification under TEFL in main menu
	@Test
	public void testTefl_Cerification() throws InterruptedException, IOException {
		ValidateTefl vt = new ValidateTefl(driver);
		System.out.println("$$ TEST JOBS7");
		vt.testTeflCertificationNavigation();
		Thread.sleep(1000);
	}

	//This test is intended to verify successful navigation to Certification Program under Teacher Certification in main menu
	@Test
	public void testTeacherCertification_Program() throws InterruptedException, IOException {
		ValidateTeacherCertification vtc = new ValidateTeacherCertification(driver);
		System.out.println("$$ TEST JOBS8");
		vtc.testCertificationProgramNavigation();
		Thread.sleep(1000);
	}
	
	//This test is intended to verify successful navigation to Certification guide under Teacher Certification in main menu
	@Test
	public void testTeacherCertification_Guide() throws InterruptedException, IOException {
		ValidateTeacherCertification vtc = new ValidateTeacherCertification(driver);
		System.out.println("$$ TEST JOBS8");
		vtc.testCertificationGuideNavigation();
		Thread.sleep(1000);
	}
	
	//This test is intended to verify successful navigation Courses in main menu
	@Test
	public void testCourses() throws InterruptedException, IOException {
		ValidateCourses vc = new ValidateCourses(driver);
		System.out.println("$$ TEST JOBS9");
		vc.testCourseNavigation();
		Thread.sleep(1000);
	}

	//This test is intended to verify successful navigation to Hiring Teachers in main menu
	@Test
	public void testHiringTeachers() throws InterruptedException, IOException {
		ValidateHiringTeachers vht = new ValidateHiringTeachers(driver);
		System.out.println("$$ TEST JOBS10");
		vht.testHiringNavigation();
		Thread.sleep(1000);
	}

	@AfterTest
	public void teardown() {
		driver.close();
		driver=null; //to close the initialization
	}

}
