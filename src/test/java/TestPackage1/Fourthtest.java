package TestPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Fourthtest {
	
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
	
	System.out.println("Before Method");

	}
	
		
	@Test(priority=3, enabled=false)
	
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
	
	@BeforeSuite 
	 
	public void BeforeSuite() {
		System.out.println("Before Suite");
	}
	
	@BeforeClass
	
	public void BeforeClass() {
		System.out.println("Before Class");
	}
	@BeforeTest
	
	public void BeforeTest() {
		
		System.out.println("Before Test");
	}
	
    @AfterSuite
	 
	public void AfterSuite() {
		System.out.println("After Suite");
	}
	
	@AfterClass
	
	public void AfterClass() {
		System.out.println("After Class");
	}
	
	
	@AfterTest
	
	public void AfterTest() {
		
		System.out.println("After Test");
	}
	
}
