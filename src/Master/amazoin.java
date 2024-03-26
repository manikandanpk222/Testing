package Master;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class amazoin implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generted method stub
		System.out.println("onTestStart"+ result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestSuccess"+ result.getName());
	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestFailure"+ result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestSkip"+ result.getName());
	
	}

}
