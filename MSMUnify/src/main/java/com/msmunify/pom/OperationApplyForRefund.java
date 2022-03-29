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

public class OperationApplyForRefund extends MSMBase
{
	WebDriver driver;
	Actions a;
	JavascriptExecutor exi;
	public OperationApplyForRefund(WebDriver driver)
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
	@FindBy(xpath = "//div/div[6]/div[2]/table/tbody/tr[1]//td[1]")
   	WebElement editapplication;
	@FindBy(xpath = "//span[text()='Fee']")
   	WebElement feetab;
	@FindBy(xpath = "(//mat-icon[text()='add'])[4]")
	WebElement addfee;
	@FindBy(xpath = "//*[@name='FeeType']//div[@class='mat-select-value']")
	WebElement feetype;
	@FindBy(xpath = "//*[@name='PaymentMode']//div[@class='mat-select-value']")
	WebElement modeofpayment;
	@FindBy(xpath ="//input[@aria-label='dropdown search']")
	WebElement dropdownsearch;
	@FindBy(xpath = "(//span[@class='mat-option-text'])[2]")
	WebElement selectmode;
	@FindBy(xpath = "//*[@name='FeeBasis']//div[@class='mat-select-value']")
	WebElement feebasis;
	@FindBy(xpath = "//*[@name='ReceiptType']//div[@class='mat-select-value']")
	WebElement receipttype;
	@FindBy(xpath = "//span[@class='mat-button-wrapper']//*[@title='Upload']")
	WebElement fileupload;
	@FindBy(xpath = "//button[text()='Submit']")
	WebElement submit;
	
	@FindBy(xpath = "//div/div[6]/div[2]/table/tbody/tr[1]/td[3]//div//button//span//*[text()=' keyboard_arrow_down ']")
   	WebElement action;
	@FindBy(xpath = "(//div[@class='cdk-overlay-pane']//div//button)[3]")
	WebElement applyforrefundbutton;
	@FindBy(xpath = "(//div[@class='dx-toolbar-after'])[2]//*[text()='add']")
	WebElement addrefund;
	@FindBy(xpath = "//*[@name='DocumentTypeId']//*[@class='mat-select-value']")
	WebElement refunddoc;
	@FindBy(xpath = "//input[@name='DocumentFile']")
	WebElement refunduplod;
	@FindBy(xpath = "//button[text()='Upload']")
	WebElement uplod;
	@FindBy(xpath = "//button[text()='Apply for Refund']")
	WebElement applyforrefund;
	@FindBy(xpath = "//div[@class='cdk-overlay-pane']//div//button//span[text()=' assignment_turned_in ']")
	WebElement submitetoinstitute;
	@FindBy(xpath = "//input[@name='inputText']")
	WebElement remark;
	@FindBy(xpath = "//span[text()=' OK ']")
	WebElement ok;
	@FindBy(xpath = "//div[@class='cdk-overlay-pane']//div//button//span[text()=' check_circle ']")
	WebElement approverefund;
	@FindBy(xpath = "//div[@class='cdk-overlay-pane']//div//button//span[text()=' money_off_csred ']")
	WebElement rejectrefund;
	@FindBy(xpath = "//div[@class='cdk-overlay-pane']//div//button//span[text()=' price_check ']")
	WebElement receivedrefund;
	@FindBy(xpath = "//div[@class='cdk-overlay-pane']//div//button//span[text()=' cancel ']")
	WebElement deleterefund;
	@FindBy(xpath = "//button[text()=' Yes']")
	WebElement yestab;

	public void NavigateToOperationEditApplicationUI()
	{
		a = new Actions(driver);
    	exi = (JavascriptExecutor) driver;
		try
		{
			operation.click();
			Thread.sleep(3000);
			application.click();
			Thread.sleep(3000);
			filtertab.click();
			Thread.sleep(3000);
			searchtab.sendKeys(prop.getProperty("appno"));
			Thread.sleep(3000);
			a.moveToElement(editapplication).click(editapplication).build().perform();
			Thread.sleep(3000);
			exi.executeScript("arguments[0].scrollIntoView();",feetab );
    		Thread.sleep(3000);
    		feetab.click();
    		Thread.sleep(3000);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	public void AddTuitionFeeInFeeSection(String ft,String bs,String rt)
	{
		a = new Actions(driver);
    	exi = (JavascriptExecutor) driver;
		try
		{
    		addfee.click();
    		Thread.sleep(3000);
    		feetype.click();
    		Thread.sleep(3000);
    		if(ft.equals("Application Fee"))
    		{
    			selectmode.click();
    		}
    		else
    		{
        		dropdownsearch.sendKeys(ft);
        		Thread.sleep(3000);
        		selectmode.click();	
    		}
    		modeofpayment.click();
    		Thread.sleep(3000);
    		selectmode.click();
    		Thread.sleep(3000);
    		feebasis.click();
    		Thread.sleep(3000);
    		dropdownsearch.sendKeys(bs);
    		Thread.sleep(3000);
    		selectmode.click();
    		Thread.sleep(3000);
    		receipttype.click();
    		Thread.sleep(3000);
    		dropdownsearch.sendKeys(rt);
    		selectmode.click();
    		Thread.sleep(3000);
    		submit.click();
    		Thread.sleep(3000);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	 public void GetOperationTuitionFeeDataFromExcel()
	    {
	    	a = new Actions(driver);
	    	exi = (JavascriptExecutor) driver;
	    	try 
	    	{
	    		String path="C:\\Users\\funak\\Downloads\\12832.xlsx";
				FileInputStream Fis=new FileInputStream(path);
				XSSFWorkbook WB=new XSSFWorkbook(Fis); 
				XSSFSheet WS=WB.getSheet("Sheet13"); 
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
					
					String ft=WC.getStringCellValue(); 
					String bs=WC1.getStringCellValue();
					String rt=WC2.getStringCellValue(); 
					AddTuitionFeeInFeeSection(ft,bs,rt);
				}
			} 
	    	catch (Exception e)
	    	{
				e.printStackTrace();
			}
	    }
	 public void AddApplyForRefundUI(String rd,String rp,String rmk)
		{
			a = new Actions(driver);
	    	exi = (JavascriptExecutor) driver;
			try
			{
				application.click();
				Thread.sleep(3000);
				filtertab.click();
				Thread.sleep(3000);
				a.moveToElement(searchtab).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();
				Thread.sleep(3000);
				searchtab.sendKeys(prop.getProperty("appno"));
				Thread.sleep(3000);
				a.moveToElement(action).click(action).build().perform();
				Thread.sleep(3000);
				a.moveToElement(applyforrefundbutton).click(applyforrefundbutton).build().perform();
				Thread.sleep(3000);
				addrefund.click(); 
				Thread.sleep(3000); 
				refunddoc.click(); 
				Thread.sleep(3000);
				dropdownsearch.sendKeys(rd); 
				Thread.sleep(3000);
				selectmode.click(); Thread.sleep(3000);
				refunduplod.sendKeys(rp);
				Thread.sleep(3000);
				uplod.click();
				Thread.sleep(3000); 
				applyforrefund.click();
				Thread.sleep(10000);
				a.moveToElement(action).click(action).build().perform();
				Thread.sleep(3000);
				submitetoinstitute.click();
				remark.sendKeys(rmk);
				Thread.sleep(2000);
				ok.click();
				Thread.sleep(10000);
				a.moveToElement(action).click(action).build().perform();
				Thread.sleep(3000);
				approverefund.click();
				remark.sendKeys(rmk);
				Thread.sleep(2000);
				ok.click();
				Thread.sleep(10000);
				a.moveToElement(action).click(action).build().perform();
				Thread.sleep(3000);
				rejectrefund.click();
				remark.sendKeys(rmk);
				Thread.sleep(2000);
				ok.click();
				Thread.sleep(10000);
				a.moveToElement(action).click(action).build().perform();
				Thread.sleep(3000);
				approverefund.click();
				remark.sendKeys(rmk);
				Thread.sleep(2000);
				ok.click();
				Thread.sleep(10000);
				a.moveToElement(action).click(action).build().perform();
				Thread.sleep(3000);
				receivedrefund.click();
				remark.sendKeys(rmk);
				Thread.sleep(2000);
				ok.click();
				Thread.sleep(10000);
				a.moveToElement(action).click(action).build().perform();
				Thread.sleep(3000);
				deleterefund.click();
				Thread.sleep(3000);
				yestab.click();
				Thread.sleep(3000);
			} 
			catch (Exception e)
			{
				e.printStackTrace();
			}
		} 
	 public void GetOperationApplyForRefundDataFromExcel()
	    {
	    	a = new Actions(driver);
	    	exi = (JavascriptExecutor) driver;
	    	try 
	    	{
	    		String path="C:\\Users\\funak\\Downloads\\12832.xlsx";
				FileInputStream Fis=new FileInputStream(path);
				XSSFWorkbook WB=new XSSFWorkbook(Fis); 
				XSSFSheet WS=WB.getSheet("Sheet14"); 
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
					
					String rd=WC.getStringCellValue(); 
					String rp=WC1.getStringCellValue();
					String rmk=WC2.getStringCellValue(); 
					AddApplyForRefundUI(rd,rp,rmk);
				}
			} 
	    	catch (Exception e)
	    	{
				e.printStackTrace();
			}
	    }
}
