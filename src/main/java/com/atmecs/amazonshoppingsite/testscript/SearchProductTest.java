package com.atmecs.amazonshoppingsite.testscript;

import java.util.Properties;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.atmecs.amazonshoppingsite.constant.ConstantFilePath;
import com.atmecs.amazonshoppingsite.page.BasePage;
import com.atmecs.amazonshoppingsite.page.SearchProductPage;
import com.atmecs.amazonshoppingsite.util.PropertyReader;

public class SearchProductTest extends BasePage
{
	SearchProductPage searchProduct;
	
	Properties searchProd;
	
	Properties prodName;
	
	@Test
	public void searchProduct()
	{
		searchProd = PropertyReader.readProperty(ConstantFilePath.SEARCH_PRODUCT_LOCATOR);
		
		prodName = PropertyReader.readProperty(ConstantFilePath.TESTDATA);
		
		searchProduct = new SearchProductPage(driver);
		
		Reporter.log("Entering product name on searchbox");
		
		searchProduct.searchProduct(searchProd.getProperty("searchProduct"),prodName.getProperty("product"));
		
		Reporter.log("Clicking search icon");
		
		searchProduct.clickSearchIcon(searchProd.getProperty("searchIcon"));
		
		Reporter.log("Scroll to select the product");
		
		searchProduct.scrollPage();
		
		Reporter.log("Selecting a product");
		
		searchProduct.selectProduct(searchProd.getProperty("product"));
		
		Reporter.log("Switching to new window");
		
		searchProduct.switchingWindow();
		
		Reporter.log("Adding product to the cart");
		
		searchProduct.clickAddToCart(searchProd.getProperty("addProduct"));
		
		Reporter.log("Opening and view products in the cart");
		
		searchProduct.viewCart(searchProd.getProperty("shoppingCart"));
		
		Reporter.log("Delete product from the cart");

		searchProduct.deleteProd(searchProd.getProperty("delProduct"));
		
	}
}
