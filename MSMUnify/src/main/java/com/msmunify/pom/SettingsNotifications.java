package com.msmunify.pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.msmunify.base.MSMBase;

public class SettingsNotifications extends MSMBase
{
	WebDriver driver;
	Actions a;
	JavascriptExecutor exi;
	public SettingsNotifications(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@name='UserName']")
	WebElement uname;
	@FindBy(xpath = "//input[@name='Password']")
	WebElement upass;
	@FindBy(xpath = "//input[@value='Login']")
	WebElement login;
	@FindBy(xpath = "//p[text()='Settings']")
	WebElement setting;
	@FindBy(xpath = "//a[@data-toggle='collapse']//span[text()='Notifications']")
	WebElement notification;
	@FindBy(xpath = "//mat-icon[text()='add']")
	WebElement add;
	@FindBy(xpath = "//*[@name='PartnerTypeId']//div[@class='mat-select-value']")
	WebElement partner;
	@FindBy(xpath = "//input[@aria-label='dropdown search']")
	WebElement dropsearch;
	@FindBy(xpath = "(//span[@class='mat-option-text'])[3]")
	WebElement select;
	@FindBy(xpath = "//*[@name='RegionId']//div[@class='mat-select-value']")
	WebElement region;
	@FindBy(xpath = "//*[@name='InstitutionId']//div[@class='mat-select-value']")
	WebElement institution;
	@FindBy(xpath = "//*[@name='SenderId']//div[@class='mat-select-value']")
	WebElement sender;
	@FindBy(xpath = "(//span[@class='mat-option-text'])[2]")
	WebElement senderselect;
	@FindBy(xpath = "//input[@name='SubjectLine']")
	WebElement subject;
	@FindBy(xpath = "//span[text()='Schedule']")
	WebElement shedule;
	@FindBy(xpath = "//button[text()='Add']")
	WebElement addbutton;
	@FindBy(xpath = "//button[text()='Update']")
	WebElement update;
	@FindBy(xpath = "(//span[@class='mat-button-wrapper']//*[text()='close'])[1]")
	WebElement delete;
	@FindBy(xpath = " //button[text()=' Yes']")
	WebElement yes;
	@FindBy(xpath = "//*[text()='filter_list']")
	WebElement filtertab;
	@FindBy(xpath = "(//input[@class='dx-texteditor-input'])[1]")
	WebElement searchtab;
	@FindBy(xpath ="(//*[@class='dx-datagrid-table dx-datagrid-table-fixed']//tbody)[2]/tr[1]/td[1]")
	WebElement edit;
	@FindBy(xpath = "//div/div[@class='dx-checkbox-container']/span")
	WebElement checktab;
	
	public void AddNotificationsFields()
	{
		exi = (JavascriptExecutor) driver;
		try 
		{
			a=new Actions(driver);
			uname.sendKeys(prop.getProperty("uname"));
			upass.sendKeys(prop.getProperty("upass"));
			login.click();
			Thread.sleep(3000);
			setting.click();
			Thread.sleep(3000);
			exi.executeScript("arguments[0].scrollIntoView();",notification);
			Thread.sleep(3000);
			//notification.click();
			a.moveToElement(notification).click(notification).build().perform();
			Thread.sleep(3000);
			add.click();
			Thread.sleep(3000);
			partner.click();
			Thread.sleep(3000);
			dropsearch.sendKeys(prop.getProperty("partnertype"));
			Thread.sleep(3000);
			select.click();
			Thread.sleep(3000);
			region.click();
			Thread.sleep(3000);
			dropsearch.sendKeys(prop.getProperty("cnt"));
			Thread.sleep(3000);
			select.click();
			Thread.sleep(3000);
			institution.click();
			Thread.sleep(3000);
			dropsearch.sendKeys(prop.getProperty("instname"));
			Thread.sleep(3000);
			select.click();
			Thread.sleep(3000);
			sender.click();
			Thread.sleep(3000);
			dropsearch.sendKeys(prop.getProperty("adref"));
			Thread.sleep(3000);
			senderselect.click();
			Thread.sleep(3000);
			subject.sendKeys(prop.getProperty("adsub"));
			Thread.sleep(3000);
			a.moveToElement(shedule).click(shedule).build().perform();
			Thread.sleep(3000);
			senderselect.click();
			Thread.sleep(3000);
			addbutton.click();
			Thread.sleep(3000);
			filtertab.click();
			Thread.sleep(3000);
			searchtab.sendKeys(prop.getProperty("adsub"));
			Thread.sleep(3000);
			a.moveToElement(edit).click(edit).build().perform();
			Thread.sleep(3000);
			sender.click();
			Thread.sleep(3000);
			dropsearch.sendKeys(prop.getProperty("upref"));
			Thread.sleep(3000);
			senderselect.click();
			Thread.sleep(3000);
			a.moveToElement(subject).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();
			Thread.sleep(3000);
			subject.sendKeys(prop.getProperty("upsub"));
			Thread.sleep(3000);
			a.moveToElement(update).click(update).build().perform();
			Thread.sleep(3000);
			a.moveToElement(searchtab).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();
			Thread.sleep(3000);
			searchtab.sendKeys(prop.getProperty("upsub"));
			Thread.sleep(3000);
			a.moveToElement(delete).click(delete).build().perform();
			Thread.sleep(3000);
			yes.click();
			Thread.sleep(3000);
			driver.close();
			
		
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	
	

	
	
	
	
	

	

}
