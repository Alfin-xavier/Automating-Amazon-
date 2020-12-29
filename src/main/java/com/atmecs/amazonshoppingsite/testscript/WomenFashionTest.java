package com.atmecs.amazonshoppingsite.testscript;

import java.util.Properties;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.atmecs.amazonshoppingsite.constant.ConstantFilePath;
import com.atmecs.amazonshoppingsite.page.BasePage;
import com.atmecs.amazonshoppingsite.page.WomenFashionPage;
import com.atmecs.amazonshoppingsite.util.PropertyReader;

public class WomenFashionTest extends BasePage
{
	Properties propLocator;
	
	WomenFashionPage fashionPage;
	
	@Test
	public void womenFashion()
	{
		propLocator = PropertyReader.readProperty(ConstantFilePath.WOMEN_FASHION_LOCATOR);
		
		fashionPage = new WomenFashionPage(driver);
		
		Reporter.log("Clicking menu");
		
		fashionPage.clickMenu(propLocator.getProperty("menu"));
		
		Reporter.log("Clicking women fashion from category");
		
		fashionPage.scrollPage();
		
		fashionPage.clickWomenFashion(propLocator.getProperty("wonen_fashion"));
		
		Reporter.log("Clicking bags product");
		
		fashionPage.scrollPage();
		
		fashionPage.clickBags(propLocator.getProperty("product"));
		
		Reporter.log("Clicking bags");
		
		fashionPage.scrollPage();
		
		fashionPage.clickSlingBag(propLocator.getProperty("sling_bag"));
		
	}
}
