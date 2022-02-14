package com.msmunify.endtoendtest;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.msmunify.base.MSMBase;
import com.msmunify.pom.MSMPOM;

public class MSMEndToEndTest extends MSMBase
{
	@BeforeTest(alwaysRun = true)
		public void intibase() 
		{
			try 
			{
				MSMBase base = new MSMBase();
				base.initialization();
			} 
			catch (Throwable e) 
			{
				e.printStackTrace();
			}
		}
	@Test
	public void MSMPOMGetvalue()
	{
		MSMPOM msm=new MSMPOM(driver);
		msm.loginpage();
	}
}
