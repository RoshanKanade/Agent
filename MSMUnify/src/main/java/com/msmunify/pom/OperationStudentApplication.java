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

public class OperationStudentApplication extends MSMBase
{
	WebDriver driver;
	Actions a;
	JavascriptExecutor exi;
	public OperationStudentApplication(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	//edit student UI
		@FindBy(xpath = "//p[text()='Operation']")
	   	WebElement operation; 
		@FindBy(xpath = "//span[text()='Students']")
	   	WebElement students; 
		@FindBy(xpath = "//*[text()='filter_list']")
		WebElement filtertab;
		@FindBy(xpath = "(//input[@class='dx-texteditor-input'])[1]")
		WebElement searchtab;
		@FindBy(xpath = "//div/div[6]/div[2]/table/tbody/tr[1]/td[1]")
	   	WebElement editstudentui;
		@FindBy(xpath ="//h1[text()='Applications']")
		WebElement studentapplication;
		@FindBy(xpath = "(//*[text()='add'])[5]")
		WebElement addapplication;
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
	    public void NavigateToEditStudentUI()
		{
	    	a = new Actions(driver);
	    	exi = (JavascriptExecutor) driver;
			try
			{
				operation.click();
				Thread.sleep(3000);
				students.click();
				Thread.sleep(3000);
				filtertab.click();
				searchtab.sendKeys(prop.getProperty("stuno"));
				Thread.sleep(3000);
				editstudentui.click();
				Thread.sleep(3000);
				exi.executeScript("arguments[0].scrollIntoView();",studentapplication );
	    		Thread.sleep(3000);
	    		studentapplication.click();
	    		Thread.sleep(3000);
	    		addapplication.click();
			} 
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	    public void AddNewStudentApplications(String in,String pg,String ik,String mar,String ade)
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
	    public void GetStudentApplicationDataFromExcel()
	    {
	    	a = new Actions(driver);
	    	exi = (JavascriptExecutor) driver;
	    	try 
	    	{
	    		String path="C:\\Users\\funak\\Downloads\\12832.xlsx";
				FileInputStream Fis=new FileInputStream(path);
				XSSFWorkbook WB=new XSSFWorkbook(Fis); 
				XSSFSheet WS=WB.getSheet("Sheet10"); 
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
					AddNewStudentApplications(in,pg,ik,mar,ade);
				}
			} 
	    	catch (Exception e)
	    	{
				e.printStackTrace();
			}
	    }

}
