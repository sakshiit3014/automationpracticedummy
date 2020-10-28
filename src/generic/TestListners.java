package generic;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListners implements ITestListener {

	BaseTest b = new BaseTest();
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		String testmethodName = result.getName();
		b.takeScreenshot("TestAddToCart");
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}
	
	@Override
	public void onStart(ITestContext context) {
		
	}
	
	@Override
	public void onFinish(ITestContext context) {

	}
}
