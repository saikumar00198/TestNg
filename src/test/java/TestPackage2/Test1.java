package TestPackage2;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.SkipException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test1 extends BaseTest{

	int i = 1;

	@Test(dependsOnMethods = "x")
	public void a() {

		driver.get("https://www.google.com/");
		System.out.println("Brower Open Successfully");
		
		driver.findElement(By.name("q")).sendKeys("Selenium Training aaaaaaaaaaaaaa");
		
		SoftAssert st = new SoftAssert();

		st.assertEquals(driver.getTitle(), "Google");
		 st.assertEquals(driver.getTitle(), "Yahoo");

		st.assertAll();


	}

	@Test()
	public void x() {


		driver.get("https://www.google.com/");
		System.out.println("Brower Open Successfully");
	
		driver.findElement(By.name("q")).sendKeys("Selenium Training xxxxxxxxxx");
		
		SoftAssert st = new SoftAssert();

		st.assertEquals(driver.getTitle(), "Google");
//		st.assertEquals(driver.getTitle(), "Yahoo");

		st.assertAll();

		
	}

	@Test(groups= {"smokeTest"})
	public void p() {
		if(i==1) {
			
			throw new SkipException("Skipping the test as the condition is not met");
			}

		System.out.println("P");

	}


	@Test(groups= {"RegresstionTesting"})
	public void q() {
		System.out.println("Q");

	}

	@Test(groups= {"smokeTest","RegresstionTesting"})
	public void r() {
		System.out.println("R");

	}


	
	

}
