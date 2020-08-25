package TestPackage2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {

	String brower = "chrome";
	protected WebDriver driver = null;
	
	
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

@AfterMethod

public void tearDown() throws InterruptedException {
	
	driver.quit();
	
	Thread.sleep(3000);
	
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
