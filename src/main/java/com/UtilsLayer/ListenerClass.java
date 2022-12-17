package com.UtilsLayer;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener {

	public void onStart(ITestContext context) {

		System.out.println("Suite started Name is " + context.getSuite().getName());
	}

	public void onTestStart(ITestResult result) {
		System.out.println("Test Case started Name is " + result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Case Pass Name is " + result.getMethod().getMethodName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test Case Fail Name is " + result.getMethod().getMethodName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Case Skip Name is " + result.getMethod().getMethodName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onTestFailedWithTimeout(ITestResult result) {

	}

	public void onFinish(ITestContext context) {
		System.out.println("Suite completed name is " + context.getSuite().getName());
	}

}
