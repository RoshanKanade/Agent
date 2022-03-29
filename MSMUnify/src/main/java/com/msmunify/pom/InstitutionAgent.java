package com.msmunify.pom;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
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
import org.openqa.selenium.support.ui.WebDriverWait;

import com.msmunify.base.MSMBase;

public class InstitutionAgent extends MSMBase
{
	WebDriver driver;
	Actions a;
	JavascriptExecutor exi;
	WebDriverWait wait;
	public InstitutionAgent(WebDriver driver)
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
			
			@FindBy(xpath = "//p[text()='Institution']")
		   	WebElement institution; 
			@FindBy(xpath = "//*[text()='filter_list']")
			WebElement filtertab;
			@FindBy(xpath = "(//input[@class='dx-texteditor-input'])[1]")
			WebElement searchtab;
			@FindBy(xpath = "//div/div[6]/div[2]/table/tbody/tr[1]/td[2]")
			WebElement GMOfolder;
			@FindBy(xpath = "//div/div[6]/div[2]/table/tbody/tr[2]/td[2]")
			WebElement edit;
			@FindBy(xpath = "//div[text()='Agent']")
		   	WebElement institutionagent; 
			@FindBy(xpath = "(//div[@class='dx-datagrid-content']//table//tbody//tr//td[10])[1]//button[text()='ADD']")
		   	WebElement aefupbutton;
			@FindBy(xpath = "//*[@controlname='AEfPath']//span[text()=' Upload ']")
		   	WebElement aefupload;
			@FindBy(xpath = "//mat-icon[text()='add']")
			WebElement addtab; 
			@FindBy(xpath = "//input[@name='RefInstName']")
			WebElement refinstname;
			@FindBy(xpath = "//input[@name='RefContPerson']")
			WebElement contactper;
			@FindBy(xpath = "//input[@name='RefEmailID']")
			WebElement mailid;
			@FindBy(xpath = "//input[@name='RefPhoneNo']")
			WebElement contactno;
			@FindBy(xpath = "//mat-select[@name='RefResponse']")
			WebElement response;
			@FindBy(xpath = "//span[@class='mat-option-text'][1]")
			WebElement selectvalue;
			@FindBy(xpath = "//*[@name='RefRemark']")
			WebElement remarks;
			@FindBy(xpath = "//*[@controlname='RefDocPath']//span[text()=' Upload ']")
		   	WebElement refupload;
			@FindBy(xpath = "(//button[text()='Save'])[2]")
		   	WebElement save;
			@FindBy(xpath = "(//button[text()='Save'])[1]")
		   	WebElement savebutton;
			
			@FindBy(xpath = "(//div[@class='dx-datagrid-content']//table//tbody//tr//td[11])[1]//button[text()='ADD']")
		   	WebElement agreeupbutton;
			@FindBy(xpath = "(//div[@class='mat-radio-outer-circle'])[2]")
		   	WebElement radiobutton;
			@FindBy(xpath = "//input[@name='TermofAgreement']")
		   	WebElement agreementyear;
			@FindBy(xpath = "//input[@placeholder='Agreement signed date']")
		   	WebElement agreestdate;
			@FindBy(xpath = "//input[@placeholder='Agreement expiry date']")
		   	WebElement agreeexdate;
			@FindBy(xpath = "//*[@controlname='AgreementPath']//span[text()=' Upload ']")
		   	WebElement agreeupload;
			@FindBy(xpath = "//button[text()='Add']")
		   	WebElement agreeadd;
			public void AddAEFInstitutionAgent() 
			{
				
				a=new Actions(driver);
				wait = new WebDriverWait(driver, 30);
				exi=(JavascriptExecutor)driver;
				try
				{
					uname.sendKeys(prop.getProperty("uname"));
					upass.sendKeys(prop.getProperty("upass"));
					Thread.sleep(3000);
					login.click();
					Thread.sleep(3000);
		    		a.moveToElement(institution).click(institution).build().perform();
		    		Thread.sleep(3000);
		    		filtertab.click();
		    		searchtab.sendKeys(prop.getProperty("abnm"));
		    		Thread.sleep(3000);
		    		a.moveToElement(GMOfolder).click(GMOfolder).build().perform();
		    		Thread.sleep(3000);
		    		a.moveToElement(edit).click(edit).build().perform();
		    		Thread.sleep(3000);
		    		
					exi.executeScript("arguments[0].scrollIntoView();",institutionagent );
					Thread.sleep(2000);
					a.moveToElement(institutionagent).click(institutionagent).build().perform();
					Thread.sleep(2000);
					filtertab.click();
					Thread.sleep(2000);
					searchtab.sendKeys(prop.getProperty("mail"));
					Thread.sleep(3000);
					
					  a.moveToElement(aefupbutton).click(aefupbutton).build().perform();
					  Thread.sleep(2000);
					  a.moveToElement(aefupload).click(aefupload).build().perform();
					  Thread.sleep(2000); StringSelection ss = new
					  StringSelection(prop.getProperty("path"));
					  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null); Robot
					  robot = new Robot(); robot.delay(300); robot.keyPress(KeyEvent.VK_ENTER);
					  robot.keyRelease(KeyEvent.VK_ENTER); robot.keyPress(KeyEvent.VK_CONTROL);
					  robot.keyPress(KeyEvent.VK_V); robot.keyRelease(KeyEvent.VK_V);
					  robot.keyRelease(KeyEvent.VK_CONTROL); robot.keyPress(KeyEvent.VK_ENTER);
					  robot.keyRelease(KeyEvent.VK_ENTER); Thread.sleep(3000);
					 
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
			public void AddRef(String inm,String imail,String refpath)
			{
				a=new Actions(driver);
				wait = new WebDriverWait(driver, 30);
				exi=(JavascriptExecutor)driver;
				try
				{
					a.moveToElement(addtab).click(addtab).build().perform();
		    		Thread.sleep(3000);
		    		refinstname.sendKeys(inm);
		    		//contactper.sendKeys(prop.getProperty("cnm"));
		    		mailid.sendKeys(imail);
		    		//contactno.sendKeys(prop.getProperty("cn"));
		    		response.click();
		    		Thread.sleep(2000);
		    		selectvalue.click();
		    		//remarks.sendKeys(prop.getProperty("desc"));
		    		Thread.sleep(2000);
		    		a.moveToElement(refupload).click(refupload).build().perform();
		    		Thread.sleep(2000);
					StringSelection ss1 = new StringSelection(refpath);
		    		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null);
		    		 Robot robot1 = new Robot();
		    		 robot1.delay(300);
		    		 robot1.keyPress(KeyEvent.VK_ENTER); 
		    		 robot1.keyRelease(KeyEvent.VK_ENTER);
		    		 robot1.keyPress(KeyEvent.VK_CONTROL); 
		    		 robot1.keyPress(KeyEvent.VK_V);
		    		 robot1.keyRelease(KeyEvent.VK_V);
		    		 robot1.keyRelease(KeyEvent.VK_CONTROL);
		    		 robot1.keyPress(KeyEvent.VK_ENTER);
		    		 robot1.keyRelease(KeyEvent.VK_ENTER);
		    		Thread.sleep(5000);
		    		a.moveToElement(save).click(save).build().perform();
		    		Thread.sleep(3000);
					
				} 
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
			public void Readdataexcel()
			{
				a=new Actions(driver);
				wait = new WebDriverWait(driver, 30);
				exi=(JavascriptExecutor)driver;
				try
				{
					String path=prop.getProperty("excelpath");
					FileInputStream Fis=new FileInputStream(path);
					XSSFWorkbook WB=new XSSFWorkbook(Fis); 
					XSSFSheet WS=WB.getSheet("Sheet2"); 
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
						
						
						String inm=WC.getStringCellValue(); 
						String imail=WC1.getStringCellValue();
						String refpath=WC2.getStringCellValue(); 
						AddRef(inm,imail,refpath);
					}
						
				} 
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
			public void SaveAEF() throws InterruptedException
			{
				a=new Actions(driver);
				wait = new WebDriverWait(driver, 30);
				exi=(JavascriptExecutor)driver;
				try 
				{
					a.moveToElement(savebutton).click(savebutton).build().perform();
		    		Thread.sleep(5000);
		    		
				} 
				catch (Exception e)
				{
					e.printStackTrace();
				}
				
			}
			public void AddAgreeInstitutionAgent()
			{
				a=new Actions(driver);
				wait = new WebDriverWait(driver, 30);
				exi=(JavascriptExecutor)driver;
				try
				{
					a.moveToElement(agreeupbutton).click(agreeupbutton).build().perform();
					Thread.sleep(3000);
					a.moveToElement(radiobutton).click(radiobutton).build().perform();
					agreementyear.sendKeys(prop.getProperty("num"));
					agreestdate.sendKeys(prop.getProperty("stdate"));
					agreeexdate.sendKeys(prop.getProperty("exdate"));
					a.moveToElement(agreeupload).click(agreeupload).build().perform();
					Thread.sleep(3000);	
					StringSelection ss = new StringSelection(prop.getProperty("pdfpath"));
		    		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		    		 Robot robot = new Robot();
		    		 robot.delay(300);
		    		 robot.keyPress(KeyEvent.VK_ENTER); 
		    		 robot.keyRelease(KeyEvent.VK_ENTER);
		    		 robot.keyPress(KeyEvent.VK_CONTROL); 
		    		 robot.keyPress(KeyEvent.VK_V);
		    		 robot.keyRelease(KeyEvent.VK_V);
		    		 robot.keyRelease(KeyEvent.VK_CONTROL);
		    		 robot.keyPress(KeyEvent.VK_ENTER);
		    		 robot.keyRelease(KeyEvent.VK_ENTER);
		    		Thread.sleep(5000);	
		    		a.moveToElement(agreeadd).click(agreeadd).build().perform();
		    		//driver.close();
					
				} 
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
}
