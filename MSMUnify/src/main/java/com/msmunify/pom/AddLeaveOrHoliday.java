package com.msmunify.pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.msmunify.base.MSMBase;

public class AddLeaveOrHoliday extends MSMBase
{

	WebDriver driver;
	Actions a;
	public AddLeaveOrHoliday(WebDriver driver)
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
	@FindBy(xpath = "//li//a//i[text()='assignment']")
	WebElement task;
	@FindBy(xpath = "//button[text()='Add Leave/ Holiday']")
	WebElement addleaveorholiday;
	@FindBy(xpath = "//input[@name='TaskSubject']")
	WebElement tasksubject;
	@FindBy(xpath = "//*[@name='TaskDescription']")
	WebElement taskdescription;
	@FindBy(xpath = "//button[text()='Add']")
	WebElement add;
	@FindBy(xpath = "//button[text()='Update']")
	WebElement update;
	@FindBy(xpath = "//input[@placeholder='Date']")
	WebElement date;
	@FindBy(xpath = "//button[text()='Delete']")
	WebElement delete;
	@FindBy(xpath = " //button[text()=' Yes']")
	WebElement yes;
	@FindBy(xpath = "//*[text()='filter_list']")
	WebElement filtertab;
	@FindBy(xpath = "(//input[@class='dx-texteditor-input'])[3]")
	WebElement searchtab;
	@FindBy(xpath ="(//*[@class='dx-datagrid-table dx-datagrid-table-fixed']//tbody)[2]/tr[1]/td[1]")
	WebElement edit;
	@FindBy(xpath = "//div/div[@class='dx-checkbox-container']/span")
	WebElement checktab;
	@FindBy(xpath = "//input[@placeholder='To Date']")
	WebElement todate;
	@FindBy(xpath = "//span[text()='GET']  ")
	WebElement get;
	public void AddLeaveAndHoliday()
	{
		try 
		{
		a=new Actions(driver);
		uname.sendKeys(prop.getProperty("uname"));
		upass.sendKeys(prop.getProperty("upass"));
		login.click();
		Thread.sleep(3000);
		task.click();
		Thread.sleep(3000);
		addleaveorholiday.click();
		Thread.sleep(3000);
		tasksubject.sendKeys(prop.getProperty("tsub"));
		Thread.sleep(3000);
		taskdescription.sendKeys(prop.getProperty("tdes"));
		Thread.sleep(3000);
		add.click();
		Thread.sleep(3000);
		filtertab.click();
		Thread.sleep(3000);
		searchtab.sendKeys(prop.getProperty("tsub"));
		Thread.sleep(3000);
		a.moveToElement(edit).click(edit).build().perform();
		Thread.sleep(3000);
		date.click();
		a.moveToElement(date).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();
		Thread.sleep(3000);
		date.sendKeys(prop.getProperty("date"));
		Thread.sleep(3000);
		tasksubject.click();
		a.moveToElement(tasksubject).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();
		Thread.sleep(3000);
		tasksubject.sendKeys(prop.getProperty("tup"));
		Thread.sleep(3000);
		update.click();
		Thread.sleep(3000);
		todate.click();
		a.moveToElement(todate).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();
		Thread.sleep(3000);
		todate.sendKeys(prop.getProperty("date"));
		Thread.sleep(3000);
		get.click();
		Thread.sleep(3000);
		filtertab.click();
		Thread.sleep(3000);
		searchtab.sendKeys(prop.getProperty("tup"));
		Thread.sleep(3000);
		a.moveToElement(edit).click(edit).build().perform();
		Thread.sleep(3000);
		delete.click();
		Thread.sleep(3000);
		yes.click();
		Thread.sleep(3000);
		checktab.click();
		Thread.sleep(3000);
		driver.close();
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}	
	}
}
