package TestPackage1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class FirstTest {

		
	@Test	
	public void test() {
		
		String brower = "chrome";
		WebDriver driver = null;

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
		driver.get("https://www.google.com/");
		System.out.println("Brower Open Successfully");
       
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.className("gNO89b")).click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.navigate().refresh();
		driver.get("https://www.yahoo.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.navigate().back();
		driver.navigate().forward();
		driver.quit();

	}
			
	
}
