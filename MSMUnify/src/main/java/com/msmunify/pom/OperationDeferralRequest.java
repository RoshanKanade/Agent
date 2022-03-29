package com.msmunify.pom;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OperationDeferralRequest 
{
	WebDriver driver;
	Actions a;
	JavascriptExecutor exi;
	public OperationDeferralRequest(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath = "//p[text()='Operation']")
   	WebElement operation; 
	@FindBy(xpath ="//span[text()='Applications']")
	WebElement application;
	@FindBy(xpath = "//*[text()='filter_list']")
	WebElement filtertab;
	@FindBy(xpath = "(//input[@class='dx-texteditor-input'])[1]")
	WebElement searchtab;
	@FindBy(xpath = "//div/div[6]/div[2]/table/tbody/tr[1]/td[3]//div//button//span//*[text()=' keyboard_arrow_down ']")
   	WebElement action;
	@FindBy(xpath = "(//div[@class='cdk-overlay-pane']//div//button)[2]")
	WebElement defferalbutton;
	@FindBy(xpath = "//*[@name='IntekId']//div[@class='mat-select-value']")
	WebElement defferto;
	@FindBy(xpath ="//input[@aria-label='dropdown search']")
	WebElement dropdownsearch;
	@FindBy(xpath = "(//span[@class='mat-option-text'])[3]")
	WebElement selectmode;
	@FindBy(xpath = "//button[text()='Save']")
	WebElement savemode;
	@FindBy(xpath ="//span[text()='Deferral Requests']")
	WebElement deferralrequest;
	
	public void NavigateToOperationSection()
	{
		try
		{
			operation.click();
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	public void CreateOperationDefferalRequest(String aid,String itk)
	{
    	a = new Actions(driver);
    	exi = (JavascriptExecutor) driver;
		try
		{
			Thread.sleep(3000);
			application.click();
			Thread.sleep(3000);
			filtertab.click();
			Thread.sleep(3000);
			a.moveToElement(searchtab).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();
			Thread.sleep(3000);
			searchtab.sendKeys(aid);
			Thread.sleep(3000);
			a.moveToElement(action).click(action).build().perform();
			Thread.sleep(3000);
			a.moveToElement(defferalbutton).click(defferalbutton).build().perform();
			Thread.sleep(3000);
			defferto.click();
			Thread.sleep(3000);
			dropdownsearch.sendKeys(itk);
			Thread.sleep(3000);
			selectmode.click();
			Thread.sleep(3000);
			savemode.click();
			Thread.sleep(3000);
			deferralrequest.click();
			Thread.sleep(3000);
			filtertab.click();
			Thread.sleep(3000);
			a.moveToElement(searchtab).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();
			Thread.sleep(3000);
			searchtab.sendKeys(aid);
			Thread.sleep(3000);
			
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	public void GetOperationDefferalRequestDataFromExcel()
    {
    	a = new Actions(driver);
    	exi = (JavascriptExecutor) driver;
    	try 
    	{
    		String path="C:\\Users\\funak\\Downloads\\12832.xlsx";
			FileInputStream Fis=new FileInputStream(path);
			XSSFWorkbook WB=new XSSFWorkbook(Fis); 
			XSSFSheet WS=WB.getSheet("Sheet12"); 
			int Rc=WS.getLastRowNum(); 
			for (int i = 1; i<=Rc; i++) 
			{ 
				XSSFRow WR=WS.getRow(i);
				if(WR==null)
				{
					break;
				} 
				XSSFCell WC=WR.getCell(0);
				XSSFCell WC1=WR.getCell(1);
				
				String aid=WC.getStringCellValue(); 
				String itk=WC1.getStringCellValue();
				
				CreateOperationDefferalRequest(aid,itk);
			}
		} 
    	catch (Exception e)
    	{
			e.printStackTrace();
		}
    }
}
