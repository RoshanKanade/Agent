package com.msmunify.pom;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.msmunify.base.MSMBase;

public class OperationApplication extends MSMBase
{
	WebDriver driver;
	Actions a;
	JavascriptExecutor exi;
	public OperationApplication(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
		@FindBy(xpath = "//p[text()='Operation']")
	   	WebElement operation; 
		@FindBy(xpath ="//span[text()='Applications']")
		WebElement applications;
		@FindBy(xpath = "//mat-icon[text()='add']")
		WebElement newadd;
		@FindBy(xpath = "(//input[@name='keyword'])[2]")
		WebElement search;
		@FindBy(xpath = "//span[text()='Search']")
		WebElement searchclick;
		@FindBy(xpath ="(//div[@class='mat-dialog-content']//div//table)[2]//tr[1]//td[1]")
		WebElement editstudent;
		@FindBy(xpath ="//input[@aria-label='dropdown search']")
		WebElement dropdownsearch;
		@FindBy(xpath = "(//span[@class='mat-option-text'])[3]")
		WebElement selectmode;
		@FindBy(xpath = "(//span[@class='mat-option-text'])[2]")
		WebElement select;
		
		@FindBy(xpath ="//*[@name='InstitutionId']//div[@class='mat-select-value']")
		WebElement institution;
		@FindBy(xpath ="//*[@name='ProgramId']//div[@class='mat-select-value']")
		WebElement program;
		@FindBy(xpath = "//*[@name='IntekId']//div[@class='mat-select-value']")
	   	WebElement intake;
	    @FindBy(xpath = "//*[@name='ShoreType']//div[@class='mat-select-value']")
	   	WebElement studpresence;
	    @FindBy(xpath = "//button[text()='Continue']")
	   	WebElement continuetab;
	
	    @FindBy(xpath = "//*[@name='AgentId']//div[@class='mat-select-value']")
	   	WebElement assiagent;
	    @FindBy(xpath = "//*[@name='AssignedTo']//div[@class='mat-select-value']")
	   	WebElement councellor;
	    @FindBy(xpath = "//*[@name='MarketingManager']//div[@class='mat-select-value']")
	   	WebElement marketingmanager;
	    @FindBy(xpath = "//*[@name='AdmissionExecutive']//div[@class='mat-select-value']")
	   	WebElement admissionexecutive;
	    @FindBy(xpath = "//button[text()=' Save ']")
	   	WebElement save;
	  
	    @FindBy(xpath = "//button[text()='Submit Application']")
	   	WebElement submitapplication; 
	    @FindBy(xpath = "//button[text()='Submit To Institute']")
	   	WebElement submitinstitute;
	    @FindBy(xpath = "//button[text()=' Yes']")
	   	WebElement yes;
	    public void NavigateToOperationApplicationPage()
		{
	    	a = new Actions(driver);
	    	exi = (JavascriptExecutor) driver;
			try
			{
				operation.click();
				Thread.sleep(3000);
				applications.click();
				Thread.sleep(3000);
				newadd.click();
				Thread.sleep(3000);
				search.sendKeys(prop.getProperty("stunm"));
				Thread.sleep(3000);
				searchclick.click();
				Thread.sleep(3000);
				editstudent.click();
	    		Thread.sleep(3000);
			} 
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	    public void AddNewOperationApplications(String in,String pg,String ik,String mar,String ade)
	    {
	    	a = new Actions(driver);
	    	exi = (JavascriptExecutor) driver;
	    	try 
	    	{
	    		
	    		
	    		Thread.sleep(3000);
	    		institution.click();
	    		Thread.sleep(3000);
	    		dropdownsearch.sendKeys(in);
	    		select.click();
	    		Thread.sleep(3000);
	    		program.click();
	    		Thread.sleep(3000);
	    		dropdownsearch.sendKeys(pg);
	    		select.click();
	    		Thread.sleep(3000);
	    		intake.click();
	    		Thread.sleep(3000);
	    		dropdownsearch.sendKeys(ik);
	    		select.click();
	    		Thread.sleep(3000);
	    		studpresence.click();
	    		select.click();
	    		Thread.sleep(3000);
	    		a.moveToElement(continuetab).click(continuetab).build().perform();
	    		Thread.sleep(3000);
	    		exi.executeScript("arguments[0].scrollIntoView();",save );
	    		Thread.sleep(3000);
	    		assiagent.click();
	    		select.click();
	    		Thread.sleep(3000);
	    		councellor.click();
	    		select.click();
	    		Thread.sleep(3000);
	    		marketingmanager.click();
	    		Thread.sleep(3000);
	    		dropdownsearch.sendKeys(mar);
	    		select.click();
	    		Thread.sleep(3000);
	    		admissionexecutive.click();
	    		Thread.sleep(3000);
	    		dropdownsearch.sendKeys(ade);
	    		select.click();
	    		Thread.sleep(3000);
	    		save.click();
	    		Thread.sleep(3000);
	    		a.moveToElement(submitapplication).click(submitapplication).build().perform();
	    		Thread.sleep(3000);
	    		a.moveToElement(yes).click(yes).build().perform();
	    		Thread.sleep(3000);
	    		a.moveToElement(submitinstitute).click(submitinstitute).build().perform();
	    		Thread.sleep(3000);
	    		a.moveToElement(yes).click(yes).build().perform();
	    		Thread.sleep(3000);
	    		driver.navigate().back();
			} catch (Exception e) 
	    	{
				
			}
	    }
	    public void GetOperationApplicationDataFromExcel()
	    {
	    	a = new Actions(driver);
	    	exi = (JavascriptExecutor) driver;
	    	try 
	    	{
	    		String path="C:\\Users\\funak\\Downloads\\12832.xlsx";
				FileInputStream Fis=new FileInputStream(path);
				XSSFWorkbook WB=new XSSFWorkbook(Fis); 
				XSSFSheet WS=WB.getSheet("Sheet11"); 
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
					XSSFCell WC2=WR.getCell(2);
					XSSFCell WC3=WR.getCell(3);
					XSSFCell WC4=WR.getCell(4);
					String in=WC.getStringCellValue(); 
					String pg=WC1.getStringCellValue();
					String ik=WC2.getStringCellValue(); 
					String mar=WC3.getStringCellValue(); 
					String ade=WC4.getStringCellValue();
					AddNewOperationApplications(in,pg,ik,mar,ade);
				}
			} 
	    	catch (Exception e)
	    	{
				e.printStackTrace();
			}
	    }


}
