package com.atmecs.amazonshoppingsite.page;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.atmecs.amazonshoppingsite.constant.ConstantFilePath;
import com.atmecs.amazonshoppingsite.util.PropertyReader;
import com.atmecs.amazonshoppingsite.util.TestNgListener;

public class BasePage
{
	public WebDriver driver;
	Properties properties;
	String baseUrl;
	String browserUrl;
	
	@Parameters("browser")
	@BeforeMethod
	public void beforeMethod(String browser) throws InterruptedException, IOException 
	{
		properties = PropertyReader.readProperty(ConstantFilePath.CONFIG);
		baseUrl = properties.getProperty("url");
		browserUrl = properties.getProperty("browser");
		
		if (browser.equalsIgnoreCase("chrome")) 
		{
			System.setProperty(ConstantFilePath.CHROME_DIR, ConstantFilePath.CHROME_PATH);
			driver = new ChromeDriver();
			driver.get(baseUrl);
			Assert.assertEquals(baseUrl, "https://www.amazon.in/", "Verified the Url");
		}
		
		else if(browser.equalsIgnoreCase("firefox")) 
		{
			System.setProperty(ConstantFilePath.GECKO_DIR, ConstantFilePath.GECKO_PATH);
			driver = new FirefoxDriver();
			driver.get(baseUrl);
			Assert.assertEquals(baseUrl, "https://www.amazon.in/", "Verified the Url");
		}
		
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
	  
	  TestNgListener.driver = driver;
	  }
	
	@AfterMethod
	public void afterMethod()
	{
		driver.close();

	}
}
