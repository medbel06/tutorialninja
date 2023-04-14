package com.maven.torialsninja.listner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.maven.torialsninja.utilites.LoginPageExtentReports;

public class MyListner implements ITestListener{

	public ExtentReports extentReports ;
	public ExtentTest extentTest ;

	@Override
	public void onStart(ITestContext context) {
		
		try {
			extentReports=LoginPageExtentReports.generateExtentReports();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
			
		
		System.out.println("execution of tutorial ninja started");
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		
		String testname=result.getName();
		extentTest=extentReports.createTest(testname);
		extentTest.log(Status.INFO, testname+"started execting");
	//	System.out.println(testname+"started execting");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String testname=result.getName();
		
		extentTest=extentReports.createTest(testname);
		extentTest.log(Status.PASS, testname+"succefully exected");
		//System.out.println(testname+"succefully exected");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String testname=result.getName();
		
		extentTest=extentReports.createTest(testname);
		extentTest.log(Status.FAIL, testname+"failed");
		//System.out.println(testname+"failed");
		//System.out.println(result.getThrowable());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String testname=result.getName();
		extentTest=extentReports.createTest(testname);
		extentTest.log(Status.SKIP, testname+"skipped");
		
		//System.out.println(testname+"skipped");
		//System.out.println(result.getThrowable());
		}

	

	

	@Override
	public void onFinish(ITestContext context) {
		
		extentReports.flush();
		
		System.out.println("execution of tutorial ninja finished");
		
		extentReports.flush();

	}
	
	
	
	
	

}
