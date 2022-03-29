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

public class OperationStudent extends MSMBase
{

	WebDriver driver;
	Actions a;
	JavascriptExecutor exi;
	public OperationStudent(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	//Create Student
	@FindBy(xpath = "//p[text()='Operation']")
   	WebElement operation; 
	@FindBy(xpath = "//span[text()='Students']")
   	WebElement students; 
	@FindBy(xpath = "//mat-icon[text()='add']")
   	WebElement addtab;
	@FindBy(xpath = "//*[@name='Salution']//div[@class='mat-select-value']")
   	WebElement title;
	@FindBy(xpath = "//input[@name='FirstName']")
	WebElement firstname;
	@FindBy(xpath = "//input[@name='MiddleName']")
   	WebElement middlename;
	@FindBy(xpath = "//input[@name='LastName']")
   	WebElement lastname;
	@FindBy(xpath = "//*[@name='Gender']//div[@class='mat-select-value']")
	WebElement gender;
	@FindBy(xpath = "(//span[@class='mat-option-text'])[1]")
	WebElement genselect;
	@FindBy(xpath = "//input[@placeholder='Date of Birth']")
	WebElement dateofbirth;
	@FindBy(xpath = "//*[@name='MaritialStatus']//div[@class='mat-select-value']")
	WebElement maritialstatus;
	@FindBy(xpath = "//div[@class='mat-form-field-infix']//*[@name='Citizenship']")
	WebElement citizenship;
	@FindBy(xpath = "//input[@aria-label='dropdown search']")
	WebElement dropsearch;
	@FindBy(xpath = "(//span[@class='mat-option-text'])[3]")
	WebElement selectmode;
	@FindBy(xpath = "(//span[@class='mat-option-text'])[2]")
	WebElement select;
	@FindBy(xpath = "(//span[@class='mat-option-text'])[4]")
	WebElement emerselectmode;
	@FindBy(xpath = "//*[@name='Language']//div[@class='mat-select-value']")
	WebElement language;
	@FindBy(xpath = "//input[@name='PassportNo']")
	WebElement passportno;
	@FindBy(xpath = "//input[@placeholder='Expiry Date']")
	WebElement expirydate;
	@FindBy(xpath = "//*[@name='MobileNoCountryCode']//div[@class='mat-select-value']")
	WebElement mobilenocountrycode;
	@FindBy(xpath = "//input[@name='MobileNo']")
	WebElement mobileno;
	@FindBy(xpath = "//input[@name='Email']")
	WebElement emailid;
	@FindBy(xpath = "//input[@name='Addres']")
	WebElement addres;
	@FindBy(xpath = "//*[@name='Country']//div[@class='mat-select-value']")
	WebElement country;
	@FindBy(xpath = "//*[@name='Province']//div[@class='mat-select-value']")
	WebElement province;
	@FindBy(xpath = "//input[@name='City']")
	WebElement city;
	@FindBy(xpath = "//input[@name='Pincode']")
	WebElement pincode;
	@FindBy(xpath = "//div[@class='mat-checkbox-inner-container']")
	WebElement sameasabovecheckbox;
	@FindBy(xpath = "//input[@name='EmrgencyName']")
	WebElement emrgencyname;
	@FindBy(xpath = "//input[@name='EmergencyEmail']")
	WebElement emergencyemail;
	@FindBy(xpath = "//input[@name='EmergencyRelation']")
	WebElement emergencyrelation;
	@FindBy(xpath = "//*[@name='EmergencyHomePhoneCountryCode']//div[@class='mat-select-value']")
	WebElement ehcntcode;
	@FindBy(xpath = "//input[@name='EmergencyHomePhone']")
	WebElement emergencyhomephone;
	@FindBy(xpath = "//*[@name='EmergencyCellPhoneCountryCode']//div[@class='mat-select-value']")
	WebElement ecpcntcode;
	@FindBy(xpath = "//input[@name='EmergencyCellPhone']")
	WebElement emergencycellphone;
	@FindBy(xpath = "//*[@name='EmergencyBusinessPhoneCountryCode']//div[@class='mat-select-value']")
	WebElement ebpcntcode;
	@FindBy(xpath = "//input[@name='EmergencyBusinessPhone']")
	WebElement emergencybusinessphone;
	@FindBy(xpath = "//input[@name='EmergencyAddress']")
	WebElement emergencyaddress;
	@FindBy(xpath = "//*[@name='EmergencyCountry']//div[@class='mat-select-value']")
	WebElement emergencycountry;
	@FindBy(xpath = "//*[@name='EmergencyProvince']//div[@class='mat-select-value']")
	WebElement emergencyprovince;
	@FindBy(xpath = "//*[@name='EmergencyCity']")
	WebElement emergencycity;
	@FindBy(xpath = "//*[@name='EmergencyPincode']")
	WebElement emergencypincode;
	@FindBy(xpath = "//*[@name='AgentId']//div[@class='mat-select-value']")
	WebElement agentid;
	@FindBy(xpath = "//button[text()=' Save ']")
	WebElement save;
	
	public void ClickOnOperation()
	{
		operation.click();
		
	}
	public void CreateNewStudent(String fn,String mn,String ln,String dob,String cnt,String lgn,String pn,String ed,String cc,String mon,String eid,String add,String pvn,String ct,String zc,String rltn)
	{
		a = new Actions(driver);
		exi = (JavascriptExecutor) driver;
		try
		{
			Thread.sleep(3000);
			students.click();
			Thread.sleep(3000);
			addtab.click();
			Thread.sleep(3000);
			title.click();
			genselect.click();
			firstname.sendKeys(fn);
			middlename.sendKeys(mn);
			lastname.sendKeys(ln);
			gender.click();
			genselect.click();
			dateofbirth.sendKeys(dob);
			maritialstatus.click();
			selectmode.click();
			citizenship.click();
			Thread.sleep(3000);
			dropsearch.sendKeys(cnt);
			if(cnt.equals("India"))
			{
			selectmode.click();
			Thread.sleep(3000);
			}
			else 
			{
				select.click();
				Thread.sleep(3000);
			}
			language.click();
			dropsearch.sendKeys(lgn);
			select.click();
			passportno.sendKeys(pn);
			expirydate.sendKeys(ed);
			mobilenocountrycode.click();
			Thread.sleep(3000);
			dropsearch.sendKeys(cc);
			selectmode.click();
			mobileno.sendKeys(mon);
			emailid.sendKeys(eid);
			addres.sendKeys(add);
			exi.executeScript("arguments[0].scrollIntoView();",country);
			Thread.sleep(3000);
			country.click();
			Thread.sleep(3000);
			dropsearch.sendKeys(cnt);
			if(cnt.equals("India"))
			{
			selectmode.click();
			Thread.sleep(3000);
			}
			else 
			{
				select.click();
				Thread.sleep(3000);
			}
			province.click();
			Thread.sleep(3000);
			dropsearch.sendKeys(pvn);
			select.click();
			city.sendKeys(ct);
			Thread.sleep(3000);
			genselect.click();
			pincode.sendKeys(zc);
			a.moveToElement(sameasabovecheckbox).click(sameasabovecheckbox).build().perform();
			emrgencyname.sendKeys(fn);
			emergencyemail.sendKeys(eid);
			emergencyrelation.sendKeys(rltn);
			genselect.click();
			ehcntcode.click();
			dropsearch.sendKeys(cc);
			selectmode.click();
			emergencyhomephone.sendKeys(mon);
			ecpcntcode.click();
			dropsearch.sendKeys(cc);
			selectmode.click();
			emergencycellphone.sendKeys(mon);
			ebpcntcode.click();
			dropsearch.sendKeys(cc);
			selectmode.click();
			emergencybusinessphone.sendKeys(mon);
			exi.executeScript("arguments[0].scrollIntoView();",save);
			emergencyaddress.sendKeys(add);
			emergencycountry.click();
			dropsearch.sendKeys(cnt);
			if(cnt.equals("India"))
			{
				emerselectmode.click();
				Thread.sleep(3000);
			}
			else 
			{
				selectmode.click();
				Thread.sleep(3000);
			}
			emergencyprovince.click();
			dropsearch.sendKeys(pvn);
			select.click();
			emergencycity.sendKeys(ct);
			Thread.sleep(3000);
			genselect.click();
			emergencypincode.sendKeys(zc);
			/*
			 * agentid.click(); dropsearch.sendKeys("Krishna Consultants");
			 * selectmode.click();
			 */
			Thread.sleep(3000);
			save.click();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	public void GetStudentExcelData()
	{
		try 
		{
			String path="C:\\Users\\funak\\Downloads\\12832.xlsx";
			FileInputStream Fis=new FileInputStream(path);
			XSSFWorkbook WB=new XSSFWorkbook(Fis); 
			XSSFSheet WS=WB.getSheet("Sheet7"); 
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
				
				String fn=WC.getStringCellValue(); 
				String mn=WC1.getStringCellValue();
				String ln=WC2.getStringCellValue(); 
				String dob=WC3.getStringCellValue(); 
				String cnt=WC4.getStringCellValue();
				String lgn=WC5.getStringCellValue(); 
				String pn=WC6.getStringCellValue(); 
				String ed=WC7.getStringCellValue();
				String cc=WC8.getStringCellValue(); 
				String mon=WC9.getStringCellValue(); 
				String eid=WC10.getStringCellValue();
				String add=WC11.getStringCellValue(); 
				String pvn=WC12.getStringCellValue(); 
				String ct=WC13.getStringCellValue();
				String zc=WC14.getStringCellValue(); 
				String rltn=WC15.getStringCellValue(); 
				CreateNewStudent(fn,mn,ln,dob,cnt,lgn,pn,ed,cc,mon,eid,add,pvn,ct,zc,rltn);
			}
				
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
