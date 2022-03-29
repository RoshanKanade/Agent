package com.msmunify.pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.msmunify.base.MSMBase;
public class MSMPOM extends MSMBase
{
	WebDriver driver;
	Actions a;
	public MSMPOM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='UserName'] ")
	WebElement uname;
	@FindBy(xpath = "//input[@name='Password'] ")
	WebElement upass;
	@FindBy(xpath = "//input[@value='Login']  ")
	WebElement login;
	@FindBy(xpath = "//li//a//i[text()='assignment']  ")
	WebElement task;
	@FindBy(xpath = "//button[text()='Add Task']  ")
	WebElement addtask;
	@FindBy(xpath = "//span[text()='Type']  ")
	WebElement type;
	@FindBy(xpath = "//input[@aria-label='dropdown search']  ")
	WebElement search;
	@FindBy(xpath = "//mat-option[@class='mat-option ng-star-inserted mat-active']//span[@class='mat-option-text']  ")
	WebElement searchvalue;
	@FindBy(xpath = "//*[@placeholder='Start Hours']//div[@class='mat-select-value']  ")
	WebElement hours;
	@FindBy(xpath = "//*[@placeholder='Start Minutes']//div[@class='mat-select-value']  ")
	WebElement minute;
	@FindBy(xpath = "//input[@name='ActualHours']  ")
	WebElement actualhours;
	@FindBy(xpath = "//input[@name='ActualMinutes']  ")
	WebElement actualmnt;
	@FindBy(xpath = "//input[@name='TaskSubject']  ")
	WebElement sub;
	@FindBy(xpath = "//button[text()='Add']  ")
	WebElement button;
	
	@FindBy(xpath = "//input[@placeholder='Due date']  ")
	WebElement duedate;
	@FindBy(xpath = "//input[@placeholder='Reminder date']  ")
	WebElement reminderdate;
	@FindBy(xpath = "//input[@name='isRecurring']  ")
	WebElement recurring;
	@FindBy(xpath = "//span[text()='Recurring Mode']  ")
	WebElement recurringmode;
	@FindBy(xpath = "(//span[@class='mat-option-text'])[2]  ")
	WebElement selectvalue;
	@FindBy(xpath = "//input[@placeholder='Recurrence Start']  ")
	WebElement recurringsrtdate;
	@FindBy(xpath = "//input[@placeholder='Recurrence End']  ")
	WebElement recurringenddate;
	@FindBy(xpath = "//input[@placeholder='Number of calls done']  ")
	WebElement noofcall;
	@FindBy(xpath = "//input[@placeholder='To Date']  ")
	WebElement todate;
	@FindBy(xpath = "//span[text()='GET']  ")
	WebElement get;
	@FindBy(xpath = "//*[text()='filter_list']")
	WebElement filtertab;
	@FindBy(xpath = "(//input[@class='dx-texteditor-input'])[3]")
	WebElement searchtab;
	@FindBy(xpath = "//button[text()='Delete']")
	WebElement delete;
	@FindBy(xpath = " //button[text()=' Yes']")
	WebElement yes;
	@FindBy(xpath ="(//*[@class='dx-datagrid-table dx-datagrid-table-fixed']//tbody)[2]/tr[1]/td[1]")
	WebElement edit;
	@FindBy(xpath = "//div/div[@class='dx-checkbox-container']/span")
	WebElement checktab;
	public void loginpage() throws InterruptedException
	{
		a=new Actions(driver);
		uname.sendKeys(prop.getProperty("uname"));
		upass.sendKeys(prop.getProperty("upass"));
		login.click();
		Thread.sleep(3000);
		task.click();
		Thread.sleep(3000);
		addtask.click();
		Thread.sleep(3000);
		type.click();
		Thread.sleep(3000);
		search.sendKeys("Calling (marketing)");
		Thread.sleep(3000);
		selectvalue.click();
		Thread.sleep(3000);
		duedate.click();
		a.moveToElement(duedate).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();
		Thread.sleep(3000);
		duedate.sendKeys("20/02/2022");
		Thread.sleep(3000);
		noofcall.sendKeys("2");
		Thread.sleep(3000);
		hours.click();
		Thread.sleep(3000);
		search.sendKeys("2");
		Thread.sleep(3000);
		selectvalue.click();
		Thread.sleep(3000);
		minute.click();
		Thread.sleep(3000);
		search.sendKeys("30");
		Thread.sleep(3000);
		selectvalue.click();
		Thread.sleep(3000);
		actualhours.sendKeys(prop.getProperty("hr"));
		Thread.sleep(3000);
		actualmnt.sendKeys(prop.getProperty("mn"));
		Thread.sleep(3000);
		sub.sendKeys(prop.getProperty("sub"));
		Thread.sleep(3000);
		reminderdate.sendKeys("19/02/2022");
		Thread.sleep(3000);
		a.moveToElement(recurring).click(recurring).build().perform();
		Thread.sleep(3000);
		a.moveToElement(button).build().perform();
		Thread.sleep(3000);
		recurringmode.click();
		Thread.sleep(3000);
		search.sendKeys("m");
		Thread.sleep(3000);
		selectvalue.click();
		Thread.sleep(3000);
		recurringsrtdate.sendKeys("21/02/2022");
		Thread.sleep(3000);
		recurringenddate.sendKeys("25/03/2022");
		Thread.sleep(3000);
		button.click();
		Thread.sleep(3000);
		todate.click();
		a.moveToElement(todate).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();
		Thread.sleep(3000);
		todate.sendKeys("20/02/2022");
		Thread.sleep(3000);
		get.click();
		Thread.sleep(3000);
		filtertab.click();
		Thread.sleep(3000);
		searchtab.sendKeys("Math");
		Thread.sleep(3000);
		a.moveToElement(edit).click(edit).build().perform();
		Thread.sleep(3000);
		a.moveToElement(delete).build().perform();
		Thread.sleep(3000);
		delete.click();
		Thread.sleep(3000);
		yes.click();
		Thread.sleep(3000);
		checktab.click();
	}
	
	public void RecurringMode() throws InterruptedException
	{
		uname.sendKeys(prop.getProperty("uname"));
		upass.sendKeys(prop.getProperty("upass"));
		login.click();
		Thread.sleep(3000);
		task.click();
		Thread.sleep(3000);
		addtask.click();
		Thread.sleep(3000);
		type.click();
		Thread.sleep(3000);
		searchvalue.click();
		Thread.sleep(3000);
		hours.click();
		Thread.sleep(3000);
		searchvalue.click();
		Thread.sleep(3000);
		minute.click();
		Thread.sleep(3000);
		searchvalue.click();
		Thread.sleep(3000);
		actualhours.sendKeys(prop.getProperty("hr"));
		Thread.sleep(3000);
		actualmnt.sendKeys(prop.getProperty("mn"));
		Thread.sleep(3000);
		sub.sendKeys(prop.getProperty("sub"));
		Thread.sleep(3000);
		//a.moveToElement(button).build().perform();
		Thread.sleep(3000);
		button.click();
		Thread.sleep(3000);
	}
	
}
