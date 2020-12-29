package com.atmecs.amazonshoppingsite.page;

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
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
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
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	}
	
}
