package com.atmecs.amazonshoppingsite.util;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class PaymentDataProvider 
{

	@DataProvider(name = "testData")
	public Object[][] womenFashion(Method method)
	{
		Object[][] data = ReadingDataFromExcel.readExcelData(method.getName());
		
		return data;
	}
}
