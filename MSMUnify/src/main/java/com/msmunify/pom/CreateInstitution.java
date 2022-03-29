package com.msmunify.pom;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.msmunify.base.MSMBase;

public class CreateInstitution extends MSMBase
{

	WebDriver driver;
	Actions a;
	JavascriptExecutor exi;
	public CreateInstitution(WebDriver driver)
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
    @FindBy(xpath = "//mat-icon[text()='add']")
   	WebElement addtab; 
    @FindBy(xpath = "//input[@name='InstName']")
   	WebElement name; 
    @FindBy(xpath = "//*[@name='PartnerTypeId']")
   	WebElement partnertype;
    @FindBy(xpath = "//input[@aria-label='dropdown search']")
   	WebElement searchddl;
    @FindBy(xpath = "//mat-select[@name='InstCurrency']")
   	WebElement currency; 
    @FindBy(xpath = "//*[text()='Save']")
   	WebElement save;
    //Create campus
    @FindBy(xpath = "//div[text()='Campus']")
   	WebElement campus; 
    @FindBy(xpath = "//input[@name='CampusName']")
   	WebElement campusname;
    @FindBy(xpath = "//input[@name='City']")
   	WebElement city;
    @FindBy(xpath = "//span[text()='Country']")
   	WebElement country;
    @FindBy(xpath = "//span[text()='Province']")
   	WebElement provience;
    @FindBy(xpath = "//*[@name='GoogleMapLink']")
   	WebElement googlemap;
    @FindBy(xpath = "//input[@aria-label='dropdown search']")
	WebElement dropsearch;
	@FindBy(xpath = "(//span[@class='mat-option-text'])[3]")
	WebElement select;
	@FindBy(xpath = "//button[text()='Add']")
	WebElement addbutton;
	//create region of marketing
	@FindBy(xpath = "//div[text()='Region of Marketing']")
   	WebElement regionmarketing;
    @FindBy(xpath = "//*[@name='CountryId']//span[text()='Region']")
   	WebElement regionddl;
    //search filter
    @FindBy(xpath = "//*[text()='filter_list']")
	WebElement filtertab;
	@FindBy(xpath = "(//input[@class='dx-texteditor-input'])[1]")
	WebElement searchtab;
	@FindBy(xpath = "//div/div[6]/div[2]/table/tbody/tr[1]/td[2]")
   	WebElement GMOfolder;
	@FindBy(xpath = "//div/div[6]/div[2]/table/tbody/tr[2]/td[2]")
   	WebElement edit;
	@FindBy(xpath = "//div/div[6]/div[2]/table/tbody/tr[2]/td[5]/div/button/span/*[text()='keyboard_arrow_down']")
   	WebElement action;
	//create program
	@FindBy(xpath = "//span[text()=' assignment']")
   	WebElement programbutton;
	@FindBy(xpath = "//input[@name='ProgramName']")
   	WebElement proname;
	@FindBy(xpath = "//input[@name='AliasName']")
   	WebElement aliasname;
	@FindBy(xpath = "//*[@name='ProgramModes']//span[text()='Modes']")
   	WebElement promade;
	@FindBy(xpath = "(//span[@class='mat-option-text'])[2]")
	WebElement selectmode;
	@FindBy(xpath = "//*[@name='ProgramLevel']//div[@class='mat-select-value']")
   	WebElement leveledu;
	@FindBy(xpath = "//input[@name='Keyword']")
   	WebElement searchkey;
	//create intek
	 @FindBy(xpath = "//div[text()='Marketing-Collateral']")
	 WebElement marketingcollateral;
	 @FindBy(xpath = "//mat-select[@name='RegionId']//div[@class='mat-select-value']")
	 WebElement regionid;
	 @FindBy(xpath = "//button//span[@class='mat-button-wrapper']//*[text()='folder']")
	 WebElement uplodefile;
	 @FindBy(xpath = "//input[@name='MaterialTitle']")
	 WebElement groupname;
	 @FindBy(xpath = "//input[@name='MaterialDescription']")
	 WebElement filename;
	 @FindBy(xpath = "//input[@name='checkTersm']")
	 WebElement checkTersm;
	 @FindBy(xpath = "//button[text()=' Add ']")
	 WebElement addmarketing;
	//Create intek
	 @FindBy(xpath = "//div[text()='Intake']")
	 WebElement intektab;
	 @FindBy(xpath = "//input[@name='IntakeName']")
	 WebElement intekname;
	 @FindBy(xpath = "//input[@placeholder='Intake Date']")
	 WebElement intakedate;
	 @FindBy(xpath = "//input[@name='OfferLetterTAT']")
	 WebElement offerlettertat;
	 @FindBy(xpath = "//input[@name='LOA_TAT']")
	 WebElement loltat;
	 @FindBy(xpath = "//input[@name='FeeReceiveTAT']")
	 WebElement feereceivetat;
	 @FindBy(xpath = "//input[@name='RefundTAT']")
	 WebElement refundtat;
	 @FindBy(xpath = "//*[@name='IntekStatus']//div[@class='mat-select-value']")
	 WebElement intakestatus;
	 @FindBy(xpath = "(//div[@class='mat-checkbox-inner-container'])[2]")
	 WebElement onshore;
	 @FindBy(xpath = "(//div[@class='mat-checkbox-inner-container'])[3]")
	 WebElement offshore;
	 //Add institution document
	 @FindBy(xpath = "//div[text()='Document']")
	 WebElement insdocument;
	 @FindBy(xpath = "//*[@name='DocumentId']//div[@class='mat-select-value']")
	 WebElement doc;
	 //Create update fields
	 @FindBy(xpath = "//div[text()='Updates']")
	 WebElement insupdates;
	 @FindBy(xpath = "//input[@placeholder='Title']")
	 WebElement titles;
	 @FindBy(xpath = "//*[@name='EventDescription']//div[@data-placeholder='Description']")
	 WebElement descript;
	//create user
	 @FindBy(xpath = "//div[text()='Users']")
	 WebElement user;
	 @FindBy(xpath = "//input[@name='DisplayName']")
	 WebElement displayname;
	 @FindBy(xpath = "//input[@name='UserName']")
	 WebElement username;
	 @FindBy(xpath = "//input[@name='MobileNo']")
	 WebElement mobino;
	 @FindBy(xpath = "//div[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']")
	 WebElement check;
	//Add fee
	 @FindBy(xpath = "(//div[@class='card-body']//tbody)[3]//tr[1]//td[1]")
	 WebElement proedit;
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
	
    public void AddInstitution()
    {
    	a = new Actions(driver);
    	exi = (JavascriptExecutor) driver;
		try 
		{
			uname.sendKeys(prop.getProperty("uname"));
			upass.sendKeys(prop.getProperty("upass"));
			login.click();
	    	institution.click();
	    	addtab.click();
	    	name.sendKeys(prop.getProperty("nm"));
	    	partnertype.click();
	    	searchddl.sendKeys(prop.getProperty("ptype"));
	    	selectmode.click();
	    	currency.click();
	    	searchddl.sendKeys(prop.getProperty("cur"));
	    	select.click();
	    	a.moveToElement(save).perform();
	    	save.click();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
    }
    public void AddCampus()
    {
    	a = new Actions(driver);
    	exi = (JavascriptExecutor) driver;
    	try 
    	{
    		Thread.sleep(3000);
    		a.moveToElement(campus).click(campus).build().perform();
    		//campus.click();
    		a.moveToElement(addtab).click(addtab).build().perform();
    		//addtab.click();
    		campusname.sendKeys(prop.getProperty("cnm"));
    		city.sendKeys(prop.getProperty("ct"));
    		country.click();
    		dropsearch.sendKeys(prop.getProperty("cnt"));
    		select.click();
    		provience.click();
    		dropsearch.sendKeys(prop.getProperty("prv"));
    		select.click();
    		googlemap.sendKeys(prop.getProperty("link"));
    		addbutton.click();	
    		Thread.sleep(3000);
		}
    	catch (Exception e) 
    	{
			e.printStackTrace();
		}
    }
    public void AddRegionOfMarketing()
    {
    	a = new Actions(driver);
    	exi = (JavascriptExecutor) driver;
    	try 
    	{
    		Thread.sleep(3000);
    		a.moveToElement(regionmarketing).click(regionmarketing).build().perform();
    		//regionmarketing.click();
    		a.moveToElement(addtab).click(addtab).build().perform();
    		regionddl.click();
    		Thread.sleep(3000);
    		dropsearch.sendKeys(prop.getProperty("cnt"));
    		dropsearch.sendKeys(Keys.ENTER);
    		Thread.sleep(3000);
    		addbutton.click();
    		Thread.sleep(3000);
		}
    	catch (Exception e) 
    	{
			e.printStackTrace();
		}
    }
    public void AddProgram()
    {
    	a = new Actions(driver);
    	exi = (JavascriptExecutor) driver;
    	try 
    	{
    		Thread.sleep(3000);
    		a.moveToElement(institution).click(institution).build().perform();
    		//institution.click();
    		Thread.sleep(3000);
    		filtertab.click();
    		searchtab.sendKeys(prop.getProperty("nm"));
    		Thread.sleep(3000);
    		a.moveToElement(GMOfolder).click(GMOfolder).build().perform();
    		Thread.sleep(3000);
    		a.moveToElement(action).click(action).build().perform();
    		Thread.sleep(3000);
    		//action.click();
    		programbutton.click();
    		Thread.sleep(3000);
    		addtab.click();
    		proname.sendKeys(prop.getProperty("nm"));
    		aliasname.sendKeys(prop.getProperty("nm"));
    		promade.click();
    		dropsearch.sendKeys(prop.getProperty("mode"));
    		selectmode.click();
    		Thread.sleep(3000);
    		a.moveToElement(leveledu).doubleClick(leveledu).build().perform();
    		Thread.sleep(3000);
    		dropsearch.sendKeys(prop.getProperty("edu"));
    		select.click();
    		Thread.sleep(3000);
    		a.moveToElement(save).build().perform();
    		searchkey.sendKeys(prop.getProperty("nm"));
    		save.click();	
    		Thread.sleep(3000);
		}
    	catch (Exception e) 
    	{
			e.printStackTrace();
		}
    }
    public void AddIntake()
    {
    	a = new Actions(driver);
    	exi = (JavascriptExecutor) driver;
    	try 
    	{
    		Thread.sleep(3000);
    		a.moveToElement(institution).click(institution).build().perform();
    		Thread.sleep(3000);
    		a.moveToElement(GMOfolder).click(GMOfolder).build().perform();
    		Thread.sleep(3000);
    		a.moveToElement(edit).click(edit).build().perform();
    		Thread.sleep(3000);
    		a.moveToElement(intektab).click(intektab).build().perform();
    		Thread.sleep(3000);
    		a.moveToElement(addtab).click(addtab).build().perform();
    		regionid.click();
    		dropsearch.sendKeys(prop.getProperty("region"));
    		selectmode.click();
    		Thread.sleep(3000);
    		intekname.sendKeys(prop.getProperty("inm"));
    		intakedate.sendKeys(prop.getProperty("indt"));
    		offerlettertat.sendKeys(prop.getProperty("num"));
    		loltat.sendKeys(prop.getProperty("num"));
    		feereceivetat.sendKeys(prop.getProperty("num"));
    		refundtat.sendKeys(prop.getProperty("num"));
    		intakestatus.click();
    		Thread.sleep(3000);
    		dropsearch.sendKeys(prop.getProperty("instatus"));
    		selectmode.click();
    		a.moveToElement(onshore).click(onshore).build().perform();
    		a.moveToElement(offshore).click(offshore).build().perform();
    		a.moveToElement(addbutton).click(addbutton).build().perform();
    		Thread.sleep(3000);
		}
    	catch (Exception e) 
    	{
			e.printStackTrace();
		}
    }
    public void AddMarketingCollateral()
    {
    	a = new Actions(driver);
    	exi = (JavascriptExecutor) driver;
    	try 
    	{
    		Thread.sleep(3000);
    		a.moveToElement(marketingcollateral).click(marketingcollateral).build().perform();
    		Thread.sleep(3000);
    		a.moveToElement(addtab).click(addtab).build().perform();
    		regionid.click();
    		Thread.sleep(3000);
    		dropsearch.sendKeys(prop.getProperty("region"));
    		selectmode.click();
    		Thread.sleep(3000);
    		a.moveToElement(uplodefile).click(uplodefile).build().perform();
    		 StringSelection ss = new StringSelection("C:\\Users\\funak\\Downloads\\GMO team Ui.png");
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
    		Thread.sleep(3000);
    		groupname.sendKeys(prop.getProperty("groupnm"));
    		filename.sendKeys(prop.getProperty("filenm"));
    		a.moveToElement(checkTersm).click(checkTersm).build().perform();
    		Thread.sleep(3000);
    		addmarketing.click();
    		Thread.sleep(3000);
		}
    	catch (Exception e) 
    	{
			e.printStackTrace();
		}
    }
    public void AddDocument()
    {
    	a = new Actions(driver);
    	exi = (JavascriptExecutor) driver;
    	try 
    	{
    		Thread.sleep(3000);
    		a.moveToElement(insdocument).click(insdocument).build().perform();
    		Thread.sleep(3000);
    		a.moveToElement(addtab).click(addtab).build().perform();
    		doc.click();
    		Thread.sleep(3000);
    		dropsearch.sendKeys(prop.getProperty("docname"));
    		dropsearch.sendKeys(Keys.ENTER);
    		Thread.sleep(3000);
    		addbutton.click();
    		Thread.sleep(3000);
		}
    	catch (Exception e) 
    	{
			e.printStackTrace();
		}
    }
    public void AddUpdates()
    {
    	a = new Actions(driver);
    	exi = (JavascriptExecutor) driver;
    	try 
    	{
    		Thread.sleep(3000);
    		a.moveToElement(insupdates).click(insupdates).build().perform();
    		Thread.sleep(3000);
    		a.moveToElement(addtab).click(addtab).build().perform();
    		Thread.sleep(3000);
    		titles.sendKeys(prop.getProperty("ttl"));
    		descript.sendKeys(prop.getProperty("desc"));
    		Thread.sleep(3000);
    		addmarketing.click();
    		Thread.sleep(3000);
		}
    	catch (Exception e) 
    	{
			e.printStackTrace();
		}
    }
    public void AddUser()
    {
    	a = new Actions(driver);
    	exi = (JavascriptExecutor) driver;
    	try 
    	{
    		Thread.sleep(3000);
    		exi.executeScript("arguments[0].scrollIntoView();",user);
    		Thread.sleep(3000);
    		a.moveToElement(user).click(user).build().perform();
    		//regionmarketing.click();
    		Thread.sleep(3000);
    		a.moveToElement(addtab).click(addtab).build().perform();
    		displayname.sendKeys(prop.getProperty("dnm"));
    		username.sendKeys(prop.getProperty("usernm"));
    		mobino.sendKeys(prop.getProperty("mobi"));
    		Thread.sleep(3000);
    		a.moveToElement(check).click(check).build().perform();
    		Thread.sleep(3000);
    		save.click();
    		Thread.sleep(3000);
		}
    	catch (Exception e) 
    	{
			e.printStackTrace();
		}
    }
    
    public void AddProgramFee()
    {
    	a = new Actions(driver);
    	exi = (JavascriptExecutor) driver;
    	try 
    	{
    		Thread.sleep(3000);
    		a.moveToElement(institution).click(institution).build().perform();
    		//institution.click();
    		Thread.sleep(3000);
    		a.moveToElement(GMOfolder).click(GMOfolder).build().perform();
    		Thread.sleep(3000);
    		a.moveToElement(action).click(action).build().perform();
    		Thread.sleep(3000);
    		programbutton.click();
    		Thread.sleep(3000);
    		a.moveToElement(proedit).click(proedit).build().perform();
    		Thread.sleep(3000);
    		a.moveToElement(feetab).click(feetab).build().perform();
    		Thread.sleep(3000);
    		a.moveToElement(addtab).click(addtab).build().perform();
    		type.click();
    		Thread.sleep(3000);
    		dropsearch.sendKeys(prop.getProperty("type"));
    		selectmode.click();
    		Thread.sleep(3000);
    		regionid.click();
    		Thread.sleep(3000);
    		dropsearch.sendKeys(prop.getProperty("region"));
    		selectmode.click();
    		Thread.sleep(3000);
    		feebasis.click();
    		Thread.sleep(3000);
    		dropsearch.sendKeys(prop.getProperty("basis"));
    		selectmode.click();
    		Thread.sleep(3000);
    		a.moveToElement(amount).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();
    		Thread.sleep(3000);
    		amount.sendKeys(prop.getProperty("amounts"));
    		exi.executeScript("arguments[0].scrollIntoView();",tatdays);
    		Thread.sleep(3000);
    		deadlindate.sendKeys(prop.getProperty("deaddate"));
    		tatdays.sendKeys(prop.getProperty("days"));
    		Thread.sleep(3000);
    		addbutton.click();
    		Thread.sleep(3000);
		}
    	catch (Exception e) 
    	{
			e.printStackTrace();
		}
    }
}
