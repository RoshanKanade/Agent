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

import com.msmunify.base.MSMBase;

public class OperationEditStudent extends MSMBase
{
	WebDriver driver;
	Actions a;
	JavascriptExecutor exi;
	public OperationEditStudent(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
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
	//add agent in recruiter/agent field
	@FindBy(xpath ="(//span[@class='mat-content'])[2]//div//button//i[@class='fa fa-edit']")
	WebElement recruiteragent;
	@FindBy(xpath ="//*[@name='AgentId']")
	WebElement agenttab;
	@FindBy(xpath ="//input[@aria-label='dropdown search']")
	WebElement agentsearchtab;
	@FindBy(xpath = "(//span[@class='mat-option-text'])[3]")
	WebElement selectmode;
	@FindBy(xpath = "(//span[@class='mat-option-text'])[2]")
	WebElement select;
	//add education details
	@FindBy(xpath ="(//span[@class='mat-content'])[3]//div//button//i[@class='fa fa-edit']")
	WebElement educationbackground;
	@FindBy(xpath ="//*[@name='CountryOfEducation']//div[@class='mat-select-value']")
	WebElement countryofeducation;
	@FindBy(xpath ="//input[@aria-label='dropdown search']")
	WebElement dropdownsearch;
	@FindBy(xpath ="//*[@name='HighestLevelOfEducation']//div[@class='mat-select-value']")
	WebElement highestlevelofeducation;
	@FindBy(xpath ="//*[@name='GradingScheme']//div[@class='mat-select-value']") 
	WebElement gradingscheme;
	@FindBy(xpath ="//*[@name='GradeAverage']") 
	WebElement gradeaverage;  
	@FindBy(xpath ="//button[text()='Update']") 
	WebElement update;
	//add test score data
	@FindBy(xpath ="(//span[@class='mat-content'])[4]//div//button//i[@class='fa fa-edit']")
	WebElement testscore;
	@FindBy(xpath ="//*[@name='EnglishExamType']//div[@class='mat-select-value']")
	WebElement englishexamtype;
	@FindBy(xpath ="//*[@name='EnglishExamDate']//input[@placeholder='Exam Date']")
	WebElement englishexamdate;
	@FindBy(xpath ="//input[@name='EnglishScoreOverall']")
	WebElement overall;
	//add documents
	@FindBy(xpath ="//h1[text()='Documents']")
	WebElement documents;
	@FindBy(xpath = "(//*[text()='add'])[1]")
	WebElement adddoc;
	@FindBy(xpath ="(//div//table//tbody//tr)[5]//td[5]//*[text()='keyboard_arrow_down']")
	WebElement docaction;
	@FindBy(xpath = "//input[@accept='.jpg,.png,.pdf']")
	WebElement choosefile;
	@FindBy(xpath ="//button[text()='Upload']")
	WebElement upload;
	@FindBy(xpath ="//div[@class='mat-menu-content']//button[@type='button']")
	WebElement uploadtab;
	@FindBy(xpath ="//*[@name='DocumentTypeId']//div[@class='mat-select-value']")
	WebElement documentsddl;
	@FindBy(xpath = "//input[@name='DocumentFile']")
	WebElement newchoosefile;
	//add student visa
	@FindBy(xpath ="//h1[text()='Student Visa']")
	WebElement studentvisa;
	@FindBy(xpath = "(//*[text()='add'])[2]")
	WebElement addvisa;
	@FindBy(xpath ="//*[@name='CountryId']//div[@class='mat-select-value']")
	WebElement country;
	@FindBy(xpath ="//*[@name='VisaTypeId']//div[@class='mat-select-value']")
	WebElement type;
	@FindBy(xpath ="//*[@name='VisaStatus']//div[@class='mat-select-value']")
	WebElement status;
	@FindBy(xpath ="//*[@name='Comment']")
	WebElement comment;
	@FindBy(xpath ="//button[text()='Add']")
	WebElement addbutton;
	//add interest
	@FindBy(xpath ="//h1[text()='Interest']")
	WebElement studentinterest;
	@FindBy(xpath = "(//*[text()='add'])[3]")
	WebElement addinterest;
	@FindBy(xpath = "//*[@name='InstitutionId']//div[@class='mat-select-value']")
	WebElement instituteddl;
	//add activity
	@FindBy(xpath ="//h1[text()='Activities']")
	WebElement studentactivity;
	@FindBy(xpath = "(//*[text()='add'])[4]")
	WebElement addactivity;
	@FindBy(xpath = "//*[@name='ActivityType']//div[@class='mat-select-value']")
	WebElement activitytype;
	@FindBy(xpath = "//input[@placeholder='Activity Date']")
	WebElement activitydate;
	@FindBy(xpath = "//*[@name='institution']//div[@class='mat-select-value']")
	WebElement activityinstitution;
	@FindBy(xpath = "//*[@name='ProgramId']//div[@class='mat-select-value']")
	WebElement activityprogram;
	@FindBy(xpath = "//*[@name='IntakeGroupId']//div[@class='mat-select-value']")
	WebElement activityintek;
	@FindBy(xpath = "//*[@name='ActivityResponse']//div[@class='mat-select-value']")
	WebElement activityresponce;
	@FindBy(xpath = "//*[@data-placeholder='Description']")
	WebElement activitydescription;
	@FindBy(xpath = "(//span[@class='mat-option-text'])[1]")
	WebElement resposelect;
	//add student notes
	@FindBy(xpath ="(//span[@class='mat-content']//div//h1[@class='sbheading'])[5]")
	WebElement studentnotes;
	@FindBy(xpath = "//*[@name='Remark']")
	WebElement remark;
	@FindBy(xpath ="//*[text()='Add']")
	WebElement addnots;
	
	public void EditStudentUI()
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
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	public void StudentAgentField()
	{
		a = new Actions(driver);
    	exi = (JavascriptExecutor) driver;
		try
		{
			exi.executeScript("arguments[0].scrollIntoView();",recruiteragent );
			a.moveToElement(recruiteragent).click(recruiteragent).build().perform();
			agenttab.click();
			agentsearchtab.sendKeys(prop.getProperty("assignage"));
			selectmode.click();	
			Thread.sleep(4000);
			
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	public void StudentEducationalBackground()
	{
		a = new Actions(driver);
    	exi = (JavascriptExecutor) driver;
		try 
		{
			a.moveToElement(educationbackground).click(educationbackground).build().perform();
			countryofeducation.click();
			dropdownsearch.sendKeys(prop.getProperty("cnt"));
			if(prop.getProperty("cnt").equals(prop.getProperty("comcnt")))
			{
			selectmode.click();
			Thread.sleep(3000);
			}
			else 
			{
				select.click();
				Thread.sleep(3000);
			}
			highestlevelofeducation.click();
			dropdownsearch.sendKeys(prop.getProperty("higheducation"));
			select.click();
			gradingscheme.click();
			dropdownsearch.sendKeys(prop.getProperty("gradescheme"));
			select.click();
			gradeaverage.sendKeys(prop.getProperty("grade"));
			update.click();
			Thread.sleep(3000);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void StudentTestScore()
	{
		a = new Actions(driver);
    	exi = (JavascriptExecutor) driver;
		try 
		{
			a.moveToElement(testscore).click(testscore).build().perform();
			englishexamtype.click();
			dropdownsearch.sendKeys(prop.getProperty("examname"));
			select.click();
			englishexamdate.sendKeys(prop.getProperty("exandate"));
			overall.sendKeys(prop.getProperty("overollscore"));
			update.click();
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void ClickOnStudentDocument()
	{
		a = new Actions(driver);
    	exi = (JavascriptExecutor) driver;
		try 
		{
			exi.executeScript("arguments[0].scrollIntoView();",documents);
			Thread.sleep(3000);
			documents.click();
			Thread.sleep(3000);
			/*
			 * filtertab.click(); Thread.sleep(2000);
			 */
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}
	public void AddDocuments(String dc,String pt)
	{
		a = new Actions(driver);
    	exi = (JavascriptExecutor) driver;
		try
		{
			Thread.sleep(3000);
			a.moveToElement(searchtab).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();
			Thread.sleep(3000);
			searchtab.sendKeys(dc);
			Thread.sleep(3000);
			a.moveToElement(docaction).click(docaction).build().perform();
			Thread.sleep(3000);
			a.moveToElement(uploadtab).click(uploadtab).build().perform();
			Thread.sleep(3000);
			choosefile.sendKeys(pt);
			Thread.sleep(3000);
			upload.click();
			Thread.sleep(3000);
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	public void GetDocumentFromExcel()
	{
		try 
		{
			String path="C:\\Users\\funak\\Downloads\\12832.xlsx";
			FileInputStream Fis=new FileInputStream(path);
			XSSFWorkbook WB=new XSSFWorkbook(Fis); 
			XSSFSheet WS=WB.getSheet("Sheet8"); 
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
				String dc=WC.getStringCellValue(); 
				String pt=WC1.getStringCellValue();
				AddDocuments(dc,pt);
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	public void AddStudentDocuments(String dc,String pt)
	{
		a = new Actions(driver);
    	exi = (JavascriptExecutor) driver;
		try 
		{
			
			adddoc.click();
			Thread.sleep(2000);
			documentsddl.click();
			Thread.sleep(2000);
			dropdownsearch.sendKeys(dc);
			Thread.sleep(2000);
			select.click();
			Thread.sleep(2000);
			newchoosefile.sendKeys(pt);
			Thread.sleep(2000);
			upload.click();
			Thread.sleep(2000);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public void GetStudentDocumentsFromExcel()
	{
		try 
		{
			String path="C:\\Users\\funak\\Downloads\\12832.xlsx";
			FileInputStream Fis=new FileInputStream(path);
			XSSFWorkbook WB=new XSSFWorkbook(Fis); 
			XSSFSheet WS=WB.getSheet("Sheet8"); 
			int Rc=WS.getLastRowNum(); 
			for (int i = 1; i<=Rc; i++) 
			{ 
				XSSFRow WR=WS.getRow(i);
				if(WR==null)
				{
					break;
				} 
				XSSFCell WC2=WR.getCell(2);
				XSSFCell WC3=WR.getCell(3);
				XSSFCell WC4=WR.getCell(4);
				XSSFCell WC5=WR.getCell(5);
				XSSFCell WC6=WR.getCell(6);
				
				String dc=WC2.getStringCellValue(); 
				String pt=WC3.getStringCellValue();
				AddStudentDocuments(dc,pt);
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public void AddStudentVisa()
	{
		a = new Actions(driver);
    	exi = (JavascriptExecutor) driver;
		try 
		{
			exi.executeScript("arguments[0].scrollIntoView();",studentvisa);
			Thread.sleep(3000);
			studentvisa.click();
			Thread.sleep(3000);
			addvisa.click();
			Thread.sleep(3000);
			country.click();
			Thread.sleep(3000);
			dropdownsearch.sendKeys(prop.getProperty("comcnt"));
			Thread.sleep(3000);
			if(prop.getProperty("comcnt").equals("India"))
			{
			selectmode.click();
			Thread.sleep(3000);
			}
			else 
			{
				select.click();
				Thread.sleep(3000);
			}
			type.click();
			Thread.sleep(3000);
			dropdownsearch.sendKeys(prop.getProperty("cityzen"));
			Thread.sleep(3000);
			select.click();
			Thread.sleep(3000);
			status.click();
			Thread.sleep(3000);
			dropdownsearch.sendKeys(prop.getProperty("status"));
			Thread.sleep(3000);
			select.click();
			Thread.sleep(3000);
			comment.sendKeys(prop.getProperty("comments"));
			Thread.sleep(3000);
			addbutton.click();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	public void StudentInterest()
	{
		a = new Actions(driver);
    	exi = (JavascriptExecutor) driver;
		try 
		{
			exi.executeScript("arguments[0].scrollIntoView();",studentinterest);
			Thread.sleep(3000);
			studentinterest.click();
			Thread.sleep(3000);
			addinterest.click();
			Thread.sleep(3000);
			instituteddl.click();
			Thread.sleep(3000);
			select.click();
			Thread.sleep(3000);
			addbutton.click();
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	public void NavigateToStudentActivityage()
	{
		a = new Actions(driver);
    	exi = (JavascriptExecutor) driver;
    	try
    	{
    		exi.executeScript("arguments[0].scrollIntoView();",studentactivity);
			Thread.sleep(3000);
			studentactivity.click();
		}
    	catch (Exception e) 
    	{
			e.printStackTrace();
		}
		
	}
	public void StudentActivity(String at,String ad,String ai,String ap,String adc)
	{
		a = new Actions(driver);
    	exi = (JavascriptExecutor) driver;
		try 
		{
			
			addactivity.click();
			Thread.sleep(3000);
			activitytype.click();
			dropdownsearch.sendKeys(at);
			select.click();
			Thread.sleep(3000);
			activitydate.sendKeys(ad);
			Thread.sleep(3000);
			activityinstitution.click();
			dropdownsearch.sendKeys(ai);
			select.click();
			Thread.sleep(3000);
			activityprogram.click();
			dropdownsearch.sendKeys(ap);
			Thread.sleep(3000);
			if(ap.equals(prop.getProperty("program")))
			{
				select.click();
				Thread.sleep(3000);
			}
			else 
			{
				selectmode.click();
				Thread.sleep(3000);
				activityintek.click();
				select.click();
				Thread.sleep(3000);
			}
			activityresponce.click();
			resposelect.click();
			Thread.sleep(3000);
			activitydescription.sendKeys(adc);
			Thread.sleep(3000);
			a.moveToElement(addbutton).click(addbutton).build().perform();
			Thread.sleep(3000);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	public void GetStudentActivityFromExcel()
	{
		try 
		{
			String path="C:\\Users\\funak\\Downloads\\12832.xlsx";
			FileInputStream Fis=new FileInputStream(path);
			XSSFWorkbook WB=new XSSFWorkbook(Fis); 
			XSSFSheet WS=WB.getSheet("Sheet9"); 
			int Rc=WS.getLastRowNum(); 
			for (int i = 1; i<=Rc; i++) 
			{ 
				XSSFRow WR=WS.getRow(i);
				if(WR==null)
				{
					break;
				} 
				XSSFCell WC0=WR.getCell(0);
				XSSFCell WC1=WR.getCell(1);
				XSSFCell WC2=WR.getCell(2);
				XSSFCell WC3=WR.getCell(3);
				XSSFCell WC4=WR.getCell(4);
				
				String at=WC0.getStringCellValue(); 
				String ad=WC1.getStringCellValue();
				String ai=WC2.getStringCellValue(); 
				String ap=WC3.getStringCellValue();
				String adc=WC4.getStringCellValue(); 
				
				StudentActivity(at,ad,ai,ap,adc);
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	public void AddStudentNotes()
	{
		a = new Actions(driver);
    	exi = (JavascriptExecutor) driver;
		try 
		{
			exi.executeScript("arguments[0].scrollIntoView();",studentnotes);
			Thread.sleep(3000);
			studentnotes.click();
			Thread.sleep(3000);
			remark.sendKeys("Hi New Student");
			Thread.sleep(3000);
			addnots.click();
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
