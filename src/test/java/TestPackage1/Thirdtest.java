package TestPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Thirdtest {
	
	String brower = "chrome";
	WebDriver driver = null;
	
	@BeforeMethod 
	
	public void Openbroswer() 
	
	{
	
	if (brower.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Workspace\\SeleniumPractice\\Executable Files\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	if (brower.equals("Firefox")) {
		System.setProperty("webdriver.gecko.driver",
				"D:\\Workspace\\SeleniumPractice\\Executable Files\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	driver.manage().window().maximize();

	}
	
		
	@Test(priority=3)
	
	public void a() throws InterruptedException {
				

		
		driver.get("https://www.google.com/");
		System.out.println("Brower Open Successfully");
       
		driver.findElement(By.name("q")).sendKeys("Selenium aaaaaaaaaaaaaaaaaaaaa");
		SoftAssert st = new SoftAssert();
		//st.assertEquals(driver.getTitle(),"Yahoo");
		st.assertEquals(driver.getTitle(),"Google");
		//st.assertEquals(driver.getTitle(),"Yahoo");
		st.assertAll();
		Thread.sleep(3800);
				
	    }
	
	@Test(priority=1)
    public void c() throws InterruptedException {
		
				
		
		driver.get("https://www.google.com/");
		System.out.println("Brower Open Successfully");
       
		driver.findElement(By.name("q")).sendKeys("Selenium cccccc");
		SoftAssert st = new SoftAssert();
		//st.assertEquals(driver.getTitle(),"Yahoo");
		st.assertEquals(driver.getTitle(),"Google");
		//st.assertEquals(driver.getTitle(),"Yahoo");
		st.assertAll();
			
		Thread.sleep(3000);
	}
	
	@Test(priority=2)
	public void b() throws InterruptedException {
						
			
			driver.get("https://www.google.com/");
			System.out.println("Brower Open Successfully");
	       
			driver.findElement(By.name("q")).sendKeys("Selenium bbbbbb");
			SoftAssert st = new SoftAssert();
			//st.assertEquals(driver.getTitle(),"Yahoo");
			st.assertEquals(driver.getTitle(),"Google");
			//st.assertEquals(driver.getTitle(),"Yahoo");
			st.assertAll();					
			Thread.sleep(3000);		

		}

	@AfterMethod
	
	public void tearDown() throws InterruptedException {
		
		driver.quit();
		
		Thread.sleep(3000);
		
	}
	
}
