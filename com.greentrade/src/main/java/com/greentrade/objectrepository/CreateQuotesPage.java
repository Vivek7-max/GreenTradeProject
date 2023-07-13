package com.greentrade.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateQuotesPage {
	@FindBy(name = "subject")
	private WebElement subjectTbx;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;
	
	@FindBy(xpath = "//input[@name='potential_name']/following-sibling::img")
	private WebElement selectOpportunityLookupImg;
	
	@FindBy(xpath = "//input[@name='contact_name']/following-sibling::img")
	private WebElement selectContactLookupImg;
	
	@FindBy(xpath = "//input[@name='account_name']/following-sibling::img")
	private WebElement selectOrganizationLookupImg;
	
	
	
	public CreateQuotesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void createCampaign(WebDriver driver, String subject) {
		subjectTbx.sendKeys(subject);
		saveBtn.click();
	}
}
