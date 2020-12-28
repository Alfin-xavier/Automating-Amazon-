package com.atmecs.amazonshoppingsite.util;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNgListener implements ITestListener
{
	public static WebDriver driver;
	@Override
	public void onTestStart(ITestResult result) 
	{
		System.out.println(result.getName() + "started !!");
	}

	@Override
	public void onTestSuccess(ITestResult result)
	{
		System.out.println(result.getName() + "passed!!");
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		System.out.println(result.getName() + "failed !!");
		TakeScreenShot.takeScreenshot(driver, result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		System.out.println(result.getName() + "skipped !!");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) 
	{

	}

	@Override
	public void onStart(ITestContext context)
	{

	}

	@Override
	public void onFinish(ITestContext context) 
	{

	}
	
}
