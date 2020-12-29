package com.atmecs.amazonshoppingsite.page;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SearchProductPage 
{
	WebDriver driver;

	public SearchProductPage(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	public void searchProduct(String xpath, String value)
	{
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.findElement(By.xpath(xpath)).sendKeys(value);
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	}
	
	public void clickSearchIcon(String xpath)
	{
		driver.findElement(By.xpath(xpath)).click();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	}
	
	public void scrollPage()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	}
	
	public void selectProduct(String xpath)
	{
		driver.findElement(By.xpath(xpath)).click();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	}
	
	public void clickAddToCart(String xpath)
	{
		driver.findElement(By.xpath(xpath)).click();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	}
	
	public void switchingWindow()
	{
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> id = ids.iterator();
		String parent = id.next();
		driver.close();
		String child = id.next();
		driver.switchTo().window(child);
		String title = driver.getTitle();
		System.out.println("Current window title:" +title);
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
	}
	
	public void viewCart(String xpath)
	{
		driver.findElement(By.xpath(xpath)).click();
		driver.manage().timeouts().implicitlyWait(7000, TimeUnit.SECONDS);
	}
	
	public void deleteProd(String xpath)
	{
		driver.findElement(By.xpath(xpath)).click();
		driver.manage().timeouts().implicitlyWait(15000, TimeUnit.SECONDS);
	}
}
