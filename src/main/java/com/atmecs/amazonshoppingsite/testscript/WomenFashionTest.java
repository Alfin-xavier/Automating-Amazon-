package com.atmecs.amazonshoppingsite.testscript;

import java.util.Properties;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.atmecs.amazonshoppingsite.constant.ConstantFilePath;
import com.atmecs.amazonshoppingsite.page.BasePage;
import com.atmecs.amazonshoppingsite.page.WomenFashionPage;
import com.atmecs.amazonshoppingsite.util.PaymentDataProvider;
import com.atmecs.amazonshoppingsite.util.PropertyReader;

public class WomenFashionTest extends BasePage
{
	Properties propLocator;
	
	WomenFashionPage fashionPage;
	
	Properties payData;
	
	@Test(dataProvider = "testData", dataProviderClass = PaymentDataProvider.class)
	public void womenFashion(String username, String password)
	{
		propLocator = PropertyReader.readProperty(ConstantFilePath.WOMEN_FASHION_LOCATOR);
		
		payData = PropertyReader.readProperty(ConstantFilePath.PAYMENT_TESTDATA);
		
		fashionPage = new WomenFashionPage(driver);
		
		Reporter.log("Clicking menu");
		
		fashionPage.clickMenu(propLocator.getProperty("menu"));
		
		Reporter.log("Clicking women fashion from category");
		
		fashionPage.clickWomenFashion(propLocator.getProperty("wonen_fashion"));
		
		Reporter.log("Clicking bags product");
		
		fashionPage.clickBags(propLocator.getProperty("product"));
		
		Reporter.log("Clicking bags");
		
		fashionPage.clickSlingBag(propLocator.getProperty("sling_bag"));
		
		Reporter.log("Filter by rating");
		
		fashionPage.rating(propLocator.getProperty("rating"));
		
		Reporter.log("Selecting bag");
		
		fashionPage.selectBag(propLocator.getProperty("bag"));
		
		Reporter.log("Switching to bag detail page");
		
		fashionPage.switchingWindow();
		
		Reporter.log("Clicking buy now button");
		
		fashionPage.clickBuyNow(propLocator.getProperty("buy_now"));
		
		Reporter.log("Providing mail_id");
		
		fashionPage.enterEmail(propLocator.getProperty("buy_now"), username);
		
		Reporter.log("Providing Password");

		fashionPage.enterEmail(propLocator.getProperty("buy_now"), password);
		
	}
}
