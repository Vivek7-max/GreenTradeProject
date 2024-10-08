package com.greentrade.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.greentrade.genericutility.WebActionUtility;

public class SearchQuotePage {
	@FindBy(id="search_txt")
	private WebElement searchTbx;

	@FindBy(name="search_field")
	private WebElement indropDwn;
	
	@FindBy(xpath="//input[@name='search']")
	private WebElement searchNowBtn;
		
	public SearchQuotePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getSearchedQuote(WebDriver driver, String text) {
		return driver.findElement(By.xpath("//a[text()='"+text+"']"));
	}
	
	public void searchAndSelectQuote(WebDriver driver, String quoteName) throws Throwable {
		searchTbx.sendKeys(quoteName);
		WebActionUtility wLib = new WebActionUtility();
		wLib.moveToElementAndPause(driver, searchNowBtn);
		searchNowBtn.click();
		Thread.sleep(2000);
		getSearchedQuote(driver, quoteName).click();
	}
}
