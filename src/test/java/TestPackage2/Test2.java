package TestPackage2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test2 extends BaseTest{

	@Test(priority=1)
	public void c() {

		driver.get("https://www.google.com/");
		System.out.println("Brower Open Successfully");
	    driver.findElement(By.name("q")).sendKeys("Selenium Training cccccccccccccccc");
		
		SoftAssert st = new SoftAssert();
		// st.assertEquals(driver.getTitle(), "Yahoo");
		st.assertEquals(driver.getTitle(), "Google");
		// st.assertEquals(driver.getTitle(), "Yahoo");

		st.assertAll();

		
	}

	
}
