package com.atmecs.amazonshoppingsite.page;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class WomenFashionPage 
{
	WebDriver driver;

	public WomenFashionPage(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	public void clickMenu(String xpath)
	{
		driver.findElement(By.xpath(xpath)).click();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	}
	
	public void clickWomenFashion(String xpath)
	{
		driver.findElement(By.xpath(xpath)).click();
		driver.manage().timeouts().implicitlyWait(15000, TimeUnit.SECONDS);
	}
	
	public void clickSlingBag(String xpath)
	{
		driver.findElement(By.xpath(xpath)).click();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	}
	
	public void clickBags(String xpath)
	{
		driver.findElement(By.xpath(xpath)).click();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	}
	
	public void scrollPage()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500)");
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
	}
	
	public void rating(String xpath)
	{
		driver.findElement(By.xpath(xpath)).click();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
	}
	
	public void selectBag(String xpath)
	{
		driver.findElement(By.xpath(xpath)).click();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
	}
	
	public void clickBuyNow(String xpath)
	{
		driver.findElement(By.xpath(xpath)).click();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
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
	
	public void enterEmail(String xpath, String value)
	{
		driver.findElement(By.xpath(xpath)).sendKeys(value);
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	}
	
	public void enterPassword(String xpath, String value)
	{
		driver.findElement(By.xpath(xpath)).sendKeys(value);
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	}
}
