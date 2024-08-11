package com.greentrade.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesOrderPage {
	@FindBy(xpath = "//img[@alt='Create Sales Order...']")
	private WebElement createQuotesLookupImg;
	
	public SalesOrderPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateQuotesLookupImg() {
		return createQuotesLookupImg;
	}
	
}
