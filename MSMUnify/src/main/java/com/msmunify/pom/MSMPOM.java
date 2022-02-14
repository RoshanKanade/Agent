package com.msmunify.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.msmunify.base.MSMBase;

public class MSMPOM extends MSMBase
{
WebDriver driver;
	
	public MSMPOM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='UserName'] ")
	WebElement uname;
	@FindBy(xpath = "//input[@name='Password'] ")
	WebElement upass;
	@FindBy(xpath = "//input[@value='Login']  ")
	WebElement login;
	
	public void loginpage()
	{
		uname.sendKeys(prop.getProperty("uname"));
		upass.sendKeys(prop.getProperty("upass"));
		login.click();
	}
	
}
