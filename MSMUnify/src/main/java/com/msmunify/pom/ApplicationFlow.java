package com.msmunify.pom;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.msmunify.base.MSMBase;

public class ApplicationFlow extends MSMBase
{
	WebDriver driver;
	Actions a;
	JavascriptExecutor exi;
	WebDriverWait wait;
	public ApplicationFlow(WebDriver driver)
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
		@FindBy(xpath = "//div[text()='Application Flow']")
	   	WebElement applicationflow; 
		@FindBy(xpath = "//*[@name='countryId']//span[text()='Region']")
		WebElement regionddl;
		@FindBy(xpath = "//input[@aria-label='dropdown search']")
		WebElement dropsearch;
		@FindBy(xpath = "(//span[@class='mat-option-text'])[2]")
		WebElement select;
		@FindBy(xpath = "//*[text()='edit']")
		WebElement editclick;
		@FindBy(xpath = "(//mat-icon[text()='add'])[2]")
	   	WebElement addflow; 
		
		@FindBy(xpath = "//input[@name='StatusName']")
		WebElement status;
		@FindBy(xpath = "//*[@name='OutCome']//span[text()='Outcome']")
		WebElement outcome;
		@FindBy(xpath = "//div//mat-option//span[text()=' Approved ']")
		WebElement approvedvalue;
		@FindBy(xpath = "//div//mat-option//span[text()=' Refund ']")
		WebElement refundvalue;
		@FindBy(xpath = "//div//mat-option//span[text()=' Rejected ']")
		WebElement rejectedvalue;
		@FindBy(xpath = "//div//mat-option//span[text()=' Dropout ']")
		WebElement dropout;
		@FindBy(xpath = "//div//mat-option//span[text()=' In Process ']")
		WebElement inprocess;
		@FindBy(xpath = "//div//mat-option//span[text()='Study Permit Approved']")
		WebElement studypermitapp;
		@FindBy(xpath = "//div//mat-option//span[text()='Study Permit Refused']")
		WebElement studypermitref;
		
		
		@FindBy(xpath = "//*[@name='VisiblityStatus']//span[text()='Visible To']")
		WebElement visible;
		@FindBy(xpath = "//div//mat-option//span[text()=' All ']")
		WebElement allvalue;
		@FindBy(xpath = "//div//mat-option//span[text()=' Agent ']")
		WebElement agentvalue;
		@FindBy(xpath = "//div//mat-option//span[text()=' Institution ']")
		WebElement institutionvalue;
		@FindBy(xpath = "//div//mat-option//span[text()=' MSM Team ']")
		WebElement msmteam;
		
		
		@FindBy(xpath = "//button[text()=' Add ']")
		WebElement add;
		@FindBy(xpath = "//button[text()='Close']")
		WebElement close;
		
		@FindBy(xpath = "(//div[@class='flow-container']//div[1])//div[text()=' UserApp ']")
		WebElement drag;
		@FindBy(xpath = "(//div[@class='flow-container']//div[1])//div[text()=' UserRej ']")
		WebElement drag1;
		@FindBy(xpath = "(//div[@class='flow-container']//div[1])//div[text()=' UserRef ']")
		WebElement drag2;
		@FindBy(xpath = "(//div[@class='flow-container']//div[1])//div[text()=' UserDrop ']")
		WebElement drag3;
		@FindBy(xpath = "(//div[@class='flow-container']//div[1])//div[text()=' UserInpro ']")
		WebElement drag4;
		@FindBy(xpath = "(//div[@class='flow-container']//div[1])//div[text()=' UserStudyPerApp ']")
		WebElement drag5;
		@FindBy(xpath = "(//div[@class='flow-container']//div[1])//div[text()=' UserStudeyPerRef ']")
		WebElement drag6;
		
		
		@FindBy(xpath = "(//div[@class='flow-container'])[2]")
		WebElement drop;
		@FindBy(xpath = "//button//span[text()='Update']")
		WebElement update;
		
		String a1="Approved";
		String b="Rejected"; 
		String e="Refund"; 
		String g="Dropout";
		String h="In Process";
		String i="Study Permit Approved";
		String j="Study Permit Refused";
		
		
		String c="All";
		String d="Agent"; 
		String f="Institution";
		String ff="MSM Team";
		
		public void Application() 
		{
			
			a=new Actions(driver);
			wait = new WebDriverWait(driver, 30);
			exi=(JavascriptExecutor)driver;
			try
			{
				uname.sendKeys(prop.getProperty("uname"));
				upass.sendKeys(prop.getProperty("upass"));
				login.click();
				Thread.sleep(3000);
	    		a.moveToElement(institution).click(institution).build().perform();
	    		Thread.sleep(3000);
	    		filtertab.click();
	    		searchtab.sendKeys(prop.getProperty("nm"));
	    		Thread.sleep(3000);
	    		a.moveToElement(GMOfolder).click(GMOfolder).build().perform();
	    		Thread.sleep(3000);
	    		a.moveToElement(edit).click(edit).build().perform();
	    		Thread.sleep(3000);
	    		
				exi.executeScript("arguments[0].scrollIntoView();",applicationflow );
				Thread.sleep(2000);
				a.moveToElement(applicationflow).click(applicationflow).build().perform();
				Thread.sleep(2000);
				regionddl.click();
				Thread.sleep(2000);
				select.click();
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
			}
		public String ApplicationFlowField(String nm, String out, String visi) 
		{
			
			try 
			{
				Thread.sleep(2000); 
				//wait.until(ExpectedConditions.elementToBeClickable(editclick)).click();
				a.moveToElement(editclick).click(editclick).build().perform();
				Thread.sleep(2000); 
				wait.until(ExpectedConditions.elementToBeClickable(addflow)).click();
				//send the status value from status field
				status.sendKeys(nm); 
				Thread.sleep(3000);
				outcome.click();
				if(out.equals(a1)) 
				{
				  approvedvalue.click();
				} 
				else if(out.equals(b))
				{ 
					refundvalue.click(); 
				} 
				else if(out.equals(e)) 
				{ 
					rejectedvalue.click(); 
				}
				else if(out.equals(g)) 
				{ 
					dropout.click(); 
				}
				else if(out.equals(h)) 
				{ 
					inprocess.click(); 
				}
				else if(out.equals(i)) 
				{ 
					studypermitapp.click(); 
				}
				else if(out.equals(j)) 
				{ 
					studypermitref.click(); 
				}
				
				
				  Thread.sleep(3000);
				  visible.click(); 
				if(visi.equals(c))
				{ 
					allvalue.click();  
				}
				else if(visi.equals(d))
				{ 
					agentvalue.click();  
				} 
				else if(visi.equals(f))
				{
				  institutionvalue.click();
				}
				else if(visi.equals(ff))
				{
					msmteam.click();
				}
				Thread.sleep(3000); 
				  add.click();
				  Thread.sleep(3000);
				  close.click();
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
				  return visi;	 
			}
		public String DrogMethod(String nm, String out, String visi) 
		{
			driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
			try 
			{
				Thread.sleep(3000);
				if(out.equals(a1)) 
				{
					a.moveToElement(drag)
					.pause(Duration.ofSeconds(1))
					.clickAndHold(drag)
					.pause(Duration.ofSeconds(1))
					.moveByOffset(1, 0)
					.moveToElement(drop)
					.moveByOffset(1, 0)
					.pause(Duration.ofSeconds(1)).release().perform();
				} 
				else if(out.equals(b))
				{ 
					a.moveToElement(drag1)
					.pause(Duration.ofSeconds(1))
					.clickAndHold(drag1)
					.pause(Duration.ofSeconds(1))
					.moveByOffset(1, 0)
					.moveToElement(drop)
					.moveByOffset(1, 0)
					.pause(Duration.ofSeconds(1)).release().perform(); 
				} 
				else if(out.equals(e)) 
				{ 
					a.moveToElement(drag2)
					.pause(Duration.ofSeconds(1))
					.clickAndHold(drag2)
					.pause(Duration.ofSeconds(1))
					.moveByOffset(1, 0)
					.moveToElement(drop)
					.moveByOffset(1, 0)
					.pause(Duration.ofSeconds(1)).release().perform(); 
				}
				
				else if(out.equals(g)) 
				{ 
					a.moveToElement(drag3)
					.pause(Duration.ofSeconds(1))
					.clickAndHold(drag3)
					.pause(Duration.ofSeconds(1))
					.moveByOffset(1, 0)
					.moveToElement(drop)
					.moveByOffset(1, 0)
					.pause(Duration.ofSeconds(1)).release().perform(); 
				}
				
				else if(out.equals(h)) 
				{ 
					a.moveToElement(drag4)
					.pause(Duration.ofSeconds(1))
					.clickAndHold(drag4)
					.pause(Duration.ofSeconds(1))
					.moveByOffset(1, 0)
					.moveToElement(drop)
					.moveByOffset(1, 0)
					.pause(Duration.ofSeconds(1)).release().perform(); 
				}
				
				else if(out.equals(i)) 
				{ 
					a.moveToElement(drag5)
					.pause(Duration.ofSeconds(1))
					.clickAndHold(drag5)
					.pause(Duration.ofSeconds(1))
					.moveByOffset(1, 0)
					.moveToElement(drop)
					.moveByOffset(1, 0)
					.pause(Duration.ofSeconds(1)).release().perform(); 
				}
				
				else if(out.equals(j)) 
				{ 
					a.moveToElement(drag6)
					.pause(Duration.ofSeconds(1))
					.clickAndHold(drag6)
					.pause(Duration.ofSeconds(1))
					.moveByOffset(1, 0)
					.moveToElement(drop)
					.moveByOffset(1, 0)
					.pause(Duration.ofSeconds(1)).release().perform(); 
				}
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
				return visi;
			}
		public void GetData()
		{
			try
			{
				String path="C:\\Users\\funak\\Downloads\\12832.xlsx";
				FileInputStream Fis=new FileInputStream(path);
				XSSFWorkbook WB=new XSSFWorkbook(Fis); 
				XSSFSheet WS=WB.getSheet("Sheet1"); 
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
					
					String nm=WC.getStringCellValue(); 
					String out=WC1.getStringCellValue();
					String visi=WC2.getStringCellValue(); 
					ApplicationFlowField(nm,out,visi);
					DrogMethod(nm,out,visi); 
				}	
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
			}
		public void UpdateMethod() 
		{
	
			try 
			{
				Thread.sleep(3000); 
				update.click(); 
				Thread.sleep(3000); 
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		
}
