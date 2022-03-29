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

public class Programs extends MSMBase
{
	WebDriver driver;
	Actions a;
	JavascriptExecutor exi;
	public Programs(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//Login
		@FindBy(xpath = "//input[@name='UserName']")
		WebElement uname;
		@FindBy(xpath = "//input[@name='Password']")
		WebElement upass;
		@FindBy(xpath = "//input[@value='Login']")
		WebElement login;
		
		//Create Institution
		@FindBy(xpath = "//p[text()='Institution']")
	   	WebElement institution; 
		//search filter
	    @FindBy(xpath = "//*[text()='filter_list']")
		WebElement filtertab;
		@FindBy(xpath = "(//input[@class='dx-texteditor-input'])[1]")
		WebElement searchtab;
		@FindBy(xpath = "//div/div[6]/div[2]/table/tbody/tr[1]/td[2]")
	   	WebElement GMOfolder;
		@FindBy(xpath = "//div/div[6]/div[2]/table/tbody/tr[2]/td[2]")
	   	WebElement editinst;
		@FindBy(xpath = "//div/div[6]/div[2]/table/tbody//tr[1]//td[1]")
	   	WebElement editpro;
		@FindBy(xpath = "//div/div[6]/div[2]/table/tbody/tr[2]/td[5]/div/button/span/*[text()='keyboard_arrow_down']")
	   	WebElement action;
		//edit program
		@FindBy(xpath = "//span[text()=' assignment']")
	   	WebElement programbutton;
		@FindBy(xpath = "//mat-icon[text()='add']")
	   	WebElement addtab;
		@FindBy(xpath = "//input[@aria-label='dropdown search']")
		WebElement dropsearch;
		@FindBy(xpath = "(//span[@class='mat-option-text'])[2]")
		WebElement selectmode;
		@FindBy(xpath = "(//span[@class='mat-option-text'])[3]")
		WebElement select;
		@FindBy(xpath = "(//div[@class='card-body']//tbody)[3]//tr[1]//td[1]")
		WebElement proedit;
		//add all fees
		@FindBy(xpath = "//div[text()='Fee']")
		WebElement feetab;
		@FindBy(xpath = "//mat-select[@name='FeeType']//div[@class='mat-select-value']")
		WebElement type;
		@FindBy(xpath = "//mat-select[@name='FeeBasis']//div[@class='mat-select-value']")
		WebElement feebasis;
		@FindBy(xpath = "//input[@name='FeeAmount']")
		WebElement amount;
		@FindBy(xpath = "//input[@placeholder='Deadline Date']")
		WebElement deadlindate;
		@FindBy(xpath = "//input[@name='TAT']")
		WebElement tatdays;
		@FindBy(xpath = "//mat-select[@name='RegionId']//div[@class='mat-select-value']")
		WebElement regionid;
		@FindBy(xpath = "//button[text()='Add']")
		WebElement addbutton;
		//add requirement details
		@FindBy(xpath = "//div[text()='Requirement']")
		WebElement requirementtab;
		@FindBy(xpath = "//*[@name='ReqId']//div[@class='mat-select-value']")
		WebElement requirement;
		@FindBy(xpath = "//input[@name='Score']")
		WebElement score;
		//Add subject
		@FindBy(xpath = "//div[text()='Subject']")
		WebElement sub;
		@FindBy(xpath = "//*[@name='GradeId']//div[@class='mat-select-value']")
		WebElement grade;
		@FindBy(xpath = "//*[@name='GradeScheme']//div[@class='mat-select-value']")
		WebElement gradescheme;
		//Add Academic details
		@FindBy(xpath = "//div[text()='Academic']")
		WebElement academic;
		//Add Additional details
		@FindBy(xpath = "//div[text()='Additional']")
		WebElement additional;
		@FindBy(xpath = "//div[@data-placeholder='Detail']")
		WebElement detail;
		//Add Documents
		@FindBy(xpath = "//div[text()='Documents']")
		WebElement documents;
		@FindBy(xpath = "//*[@name='DocumentTypeId']//div[@class='mat-select-value']")
		WebElement documenttypes;
		
				
		 public void GoToProgramPage()
		    {
		    	a = new Actions(driver);
		    	exi = (JavascriptExecutor) driver;
				try 
				{
					uname.sendKeys(prop.getProperty("uname"));
					upass.sendKeys(prop.getProperty("upass"));
					login.click();
					Thread.sleep(5000);
		    		a.moveToElement(institution).click(institution).build().perform();
		    		Thread.sleep(3000);
		    		filtertab.click();
		    		Thread.sleep(3000);
		    		searchtab.sendKeys(prop.getProperty("nm"));
		    		Thread.sleep(3000);
		    		a.moveToElement(GMOfolder).click(GMOfolder).build().perform();
		    		Thread.sleep(3000);
		    		a.moveToElement(action).click(action).build().perform();
		    		Thread.sleep(3000);
		    		programbutton.click();
		    		Thread.sleep(3000);
		    		filtertab.click();
		    		searchtab.sendKeys(prop.getProperty("pronm"));
		    		Thread.sleep(3000);
		    		a.moveToElement(proedit).doubleClick(proedit).build().perform();
		    		Thread.sleep(3000);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
		    }
		    public void GoToFeeTab()
		    {
		    	a = new Actions(driver);
		    	exi = (JavascriptExecutor) driver;
		    	try 
		    	{
		    		filtertab.click();
		    		searchtab.sendKeys(prop.getProperty("pronm"));
		    		Thread.sleep(3000);
		    		a.moveToElement(proedit).doubleClick(proedit).build().perform();
		    		Thread.sleep(3000);
		    		a.moveToElement(feetab).click(feetab).build().perform();
		    		Thread.sleep(3000);
				} 
		    	catch (Exception e) 
		    	{
					e.printStackTrace();
				}
		    }
		    public void AddAllFee(String typ,String rgn,String bsc,String amt,String dld,String tat)
		    {
		    	a = new Actions(driver);
		    	try 
		    	{
		    		a.moveToElement(addtab).click(addtab).build().perform();
		    		type.click();
		    		Thread.sleep(3000);
		    		dropsearch.sendKeys(typ);
		    		selectmode.click();
		    		Thread.sleep(3000);
		    		regionid.click();
		    		Thread.sleep(3000);
		    		dropsearch.sendKeys(rgn);
		    		selectmode.click();
		    		Thread.sleep(3000);
		    		
		    		if(typ.equals(prop.getProperty("appfee"))||typ.equals(prop.getProperty("regfee")))
		    		{
		    		System.out.println("Success");
		    		}
		    		else
		    		{
			    		feebasis.click();
			    		Thread.sleep(3000);
			    		dropsearch.sendKeys(bsc);
			    		selectmode.click();
			    		Thread.sleep(3000);	
					}
		    		a.moveToElement(amount).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();
		    		Thread.sleep(3000);
		    		amount.sendKeys(amt);
		    		exi.executeScript("arguments[0].scrollIntoView();",tatdays);
		    		Thread.sleep(3000);
		    		deadlindate.sendKeys(dld);
		    		tatdays.sendKeys(tat);
		    		Thread.sleep(3000);
		    		addbutton.click();
		    		Thread.sleep(3000);
				}
		    	catch (Exception e) 
		    	{
					e.printStackTrace();
				}
		    }
		    public void GetFeeDataFromExcel()
			{
				try
				{
					String path="C:\\Users\\funak\\Downloads\\12832.xlsx";
					FileInputStream Fis=new FileInputStream(path);
					XSSFWorkbook WB=new XSSFWorkbook(Fis); 
					XSSFSheet WS=WB.getSheet("Sheet3"); 
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
						XSSFCell WC5=WR.getCell(5);
						XSSFCell WC6=WR.getCell(6);
						XSSFCell WC7=WR.getCell(7);
						XSSFCell WC8=WR.getCell(8);
						XSSFCell WC9=WR.getCell(9);
						XSSFCell WC10=WR.getCell(10);
						XSSFCell WC11=WR.getCell(11);
						XSSFCell WC12=WR.getCell(12);
						XSSFCell WC13=WR.getCell(13);
						XSSFCell WC14=WR.getCell(14);
						XSSFCell WC15=WR.getCell(15);
						XSSFCell WC16=WR.getCell(16);
						XSSFCell WC17=WR.getCell(17);
						XSSFCell WC18=WR.getCell(18);
						XSSFCell WC19=WR.getCell(19);
						
						String typ=WC.getStringCellValue(); 
						String rgn=WC1.getStringCellValue();
						String bsc=WC2.getStringCellValue(); 
						String amt=WC3.getStringCellValue(); 
						String dld=WC4.getStringCellValue();
						String tat=WC5.getStringCellValue(); 
						AddAllFee(typ,rgn,bsc,amt,dld,tat);
						
					}	
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		    public void GoToRequirementTab()
		    {
		    	a = new Actions(driver);
		    	exi = (JavascriptExecutor) driver;
		    	try 
		    	{
		    		a.moveToElement(requirementtab).click(requirementtab).build().perform();
		    		Thread.sleep(3000);
				} 
		    	catch (Exception e) 
		    	{
					e.printStackTrace();
				}
		    }
		    public void AddRequirementEnglish(String req,String scores)
		    {
		    	a = new Actions(driver);
		    	exi = (JavascriptExecutor) driver;
		    	try 
		    	{
		    		
		    		a.moveToElement(addtab).click(addtab).build().perform();
		    		Thread.sleep(3000);
		    		regionid.click();
		    		Thread.sleep(3000);
		    		dropsearch.sendKeys(prop.getProperty("region"));
		    		selectmode.click();
		    		Thread.sleep(3000);
		    		requirement.click();
		    		Thread.sleep(3000);
		    		dropsearch.sendKeys(req);
		    		selectmode.click();
		    		Thread.sleep(3000);
		    		score.sendKeys(scores);
		    		Thread.sleep(3000);
		    		addbutton.click();
		    		Thread.sleep(3000);
				} 
		    	catch (Exception e)
		    	{
					e.printStackTrace();
				}
		    }
		    public void GetEnglishDataFromExcel()
			{
				try
				{
					String path="C:\\Users\\funak\\Downloads\\12832.xlsx";
					FileInputStream Fis=new FileInputStream(path);
					XSSFWorkbook WB=new XSSFWorkbook(Fis); 
					XSSFSheet WS=WB.getSheet("Sheet4"); 
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
						String req=WC.getStringCellValue(); 
						String scores=WC1.getStringCellValue();
						AddRequirementEnglish(req,scores);
						
					}	
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		    
		    public void AddRequirementSubject(String sbjct,String grd,String grdsc,String sscr)
		    {
		    	a = new Actions(driver);
		    	exi = (JavascriptExecutor) driver;
		    	try 
		    	{
		    		a.moveToElement(sub).click(sub).build().perform();
		    		Thread.sleep(3000);
		    		a.moveToElement(addtab).click(addtab).build().perform();
		    		Thread.sleep(3000);
		    		regionid.click();
		    		Thread.sleep(3000);
		    		dropsearch.sendKeys(prop.getProperty("region"));
		    		selectmode.click();
		    		Thread.sleep(3000);
		    		requirement.click();
		    		Thread.sleep(3000);
		    		dropsearch.sendKeys(sbjct);
		    		select.click();
		    		Thread.sleep(3000);
		    		grade.click();
		    		Thread.sleep(3000);
		    		dropsearch.sendKeys(grd);
		    		selectmode.click();
		    		Thread.sleep(3000);
		    		gradescheme.click();
		    		Thread.sleep(3000);
		    		dropsearch.sendKeys(grdsc);
		    		selectmode.click();
		    		Thread.sleep(3000);
		    		score.sendKeys(sscr);
		    		Thread.sleep(3000);
		    		addbutton.click();
		    		Thread.sleep(3000);
				} 
		    	catch (Exception e)
		    	{
					e.printStackTrace();
				}
		    }
		    public void GetSubjectDataFromExcel()
			{
				try
				{
					String path="C:\\Users\\funak\\Downloads\\12832.xlsx";
					FileInputStream Fis=new FileInputStream(path);
					XSSFWorkbook WB=new XSSFWorkbook(Fis); 
					XSSFSheet WS=WB.getSheet("Sheet5"); 
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
						String sbjct=WC.getStringCellValue(); 
						String grd=WC1.getStringCellValue();
						String grdsc=WC2.getStringCellValue(); 
						String sscr=WC3.getStringCellValue();
						
						AddRequirementSubject(sbjct,grd,grdsc,sscr);
						
					}	
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		    
		    public void AddRequirementAcademic(String acde,String grdsc,String sscr)
		    {
		    	a = new Actions(driver);
		    	exi = (JavascriptExecutor) driver;
		    	try 
		    	{
		    		a.moveToElement(academic).click(academic).build().perform();
		    		Thread.sleep(3000);
		    		a.moveToElement(addtab).click(addtab).build().perform();
		    		Thread.sleep(3000);
		    		regionid.click();
		    		Thread.sleep(3000);
		    		dropsearch.sendKeys(prop.getProperty("region"));
		    		selectmode.click();
		    		Thread.sleep(3000);
		    		requirement.click();
		    		Thread.sleep(3000);
		    		dropsearch.sendKeys(acde);
		    		selectmode.click();
		    		Thread.sleep(3000);
		    		gradescheme.click();
		    		Thread.sleep(3000);
		    		dropsearch.sendKeys(grdsc);
		    		selectmode.click();
		    		Thread.sleep(3000);
		    		score.sendKeys(sscr);
		    		Thread.sleep(3000);
		    		addbutton.click();
		    		Thread.sleep(3000);
				} 
		    	catch (Exception e)
		    	{
					e.printStackTrace();
				}
		    }
		    public void GetAcademicDataFromExcel()
			{
				try
				{
					String path="C:\\Users\\funak\\Downloads\\12832.xlsx";
					FileInputStream Fis=new FileInputStream(path);
					XSSFWorkbook WB=new XSSFWorkbook(Fis); 
					XSSFSheet WS=WB.getSheet("Sheet6"); 
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
						String acde=WC.getStringCellValue(); 
						String grdsc=WC1.getStringCellValue(); 
						String sscr=WC2.getStringCellValue();
						
						AddRequirementAcademic(acde,grdsc,sscr);
						
					}	
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		    
		    public void AddRequirementAdditional()
		    {
		    	a = new Actions(driver);
		    	exi = (JavascriptExecutor) driver;
		    	try 
		    	{
		    		a.moveToElement(additional).click(additional).build().perform();
		    		Thread.sleep(3000);
		    		a.moveToElement(addtab).click(addtab).build().perform();
		    		Thread.sleep(3000);
		    		regionid.click();
		    		Thread.sleep(3000);
		    		dropsearch.sendKeys(prop.getProperty("region"));
		    		selectmode.click();
		    		Thread.sleep(3000);
		    		detail.sendKeys(prop.getProperty("dtls"));
		    		Thread.sleep(3000);
		    		addbutton.click();
		    		Thread.sleep(3000);
				} 
		    	catch (Exception e)
		    	{
					e.printStackTrace();
				}
		    }
		    public void AddRequirementDocument(String doc)
		    {
		    	a = new Actions(driver);
		    	exi = (JavascriptExecutor) driver;
		    	try 
		    	{
		    		a.moveToElement(documents).click(documents).build().perform();
		    		Thread.sleep(3000);
		    		a.moveToElement(addtab).click(addtab).build().perform();
		    		Thread.sleep(3000);
		    		regionid.click();
		    		Thread.sleep(3000);
		    		dropsearch.sendKeys(prop.getProperty("region"));
		    		selectmode.click();
		    		documenttypes.click();
		    		Thread.sleep(3000);
		    		dropsearch.sendKeys(doc);
		    		selectmode.click();
		    		Thread.sleep(3000);
		    		addbutton.click();
		    		Thread.sleep(3000);
				} 
		    	catch (Exception e)
		    	{
					e.printStackTrace();
				}
		    }
		    public void GetDocumentDataFromExcel()
			{
				try
				{
					String path="C:\\Users\\funak\\Downloads\\12832.xlsx";
					FileInputStream Fis=new FileInputStream(path);
					XSSFWorkbook WB=new XSSFWorkbook(Fis); 
					XSSFSheet WS=WB.getSheet("Sheet6"); 
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
						String doc=WC3.getStringCellValue(); 
						AddRequirementDocument(doc);
						
					}	
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
}
