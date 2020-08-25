package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listeners implements ITestListener{
	
	public void onTestStart(ITestResult result) {


	}

	public void onTestSuccess(ITestResult result) {


		System.out.println("Passed Test - "+result.getName());

	}

	public void onTestFailure(ITestResult result) {

		System.setProperty("org.uncommons.reportng.escape-output","false");
		Reporter.log("<a href=\"D:\\SAI KUMAR\\screen shot.jpg\" target=\"_blank\">Screenshot link</a>");
		Reporter.log("<br>");
		Reporter.log("<a href=\"F:\\screenshot\\error.jpg\" target=\"_blank\"><img height=200 width=200 src=\"D:\\\\SAI KUMAR\\\\screen shot.jpg\"></a>");


		System.out.println("Capturing Screenshot for the Failed test -- "+result.getName());

	}

	public void onTestSkipped(ITestResult result) {
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		

	}

	public void onFinish(ITestContext context) {
		

	}
	

}
