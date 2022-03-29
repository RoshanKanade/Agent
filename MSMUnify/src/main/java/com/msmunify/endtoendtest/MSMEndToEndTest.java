package com.msmunify.endtoendtest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.msmunify.base.ConfigFile;
import com.msmunify.base.MSMBase;
import com.msmunify.pom.ApplicationFlow;
import com.msmunify.pom.InstitutionAgent;
import com.msmunify.pom.MSMLogin;
import com.msmunify.pom.OperationApplication;
import com.msmunify.pom.OperationApplyForRefund;
import com.msmunify.pom.OperationDeferralRequest;
import com.msmunify.pom.OperationEditStudent;
import com.msmunify.pom.OperationStudent;
import com.msmunify.pom.OperationStudentApplication;
import com.msmunify.pom.Programs;

public class MSMEndToEndTest extends MSMBase
{

	@BeforeTest(alwaysRun = true)
	public void intibase() {
		try {
			MSMBase base = new MSMBase();
			base.initialization();
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

	/*
	 * @Test public void MSMInstitution() throws InterruptedException {
	 * 
	 * MSMPOM msm=new MSMPOM(driver); msm.loginpage();
	 * SettingsNotifications snot=new SettingsNotifications(driver);
	 * snot.AddNotificationsFields();
	 *
	 * CreateInstitution createinst=new CreateInstitution(driver);
	 * createinst.AddInstitution(); createinst.AddCampus();
	 * createinst.AddRegionOfMarketing(); createinst.AddProgram();
	 * createinst.AddIntake(); createinst.AddMarketingCollateral();
	 * createinst.AddDocument(); createinst.AddUpdates(); createinst.AddUser();
	 * createinst.AddProgramFee();
	 * 
	 * ApplicationFlow app=new ApplicationFlow(driver); app.Application();
	 * app.GetData(); app.UpdateMethod();
	 * 
	 * 
	 * InstitutionAgent iage=new InstitutionAgent(driver);
	 * iage.AddAEFInstitutionAgent(); iage.Readdataexcel(); iage.SaveAEF();
	 * iage.AddAgreeInstitutionAgent(); }
	 */
	
	
	/*
	 * @Test(priority = 0) public void MSMPrograms() { Programs pro = new
	 * Programs(driver); pro.GoToProgramPage();
	 * 
	 * pro.GoToFeeTab(); pro.GetFeeDataFromExcel(); pro.GoToRequirementTab();
	 * pro.GetEnglishDataFromExcel(); pro.GetSubjectDataFromExcel();
	 * pro.GetAcademicDataFromExcel(); pro.AddRequirementAdditional();
	 * pro.GetDocumentDataFromExcel(); }
	 */
	
	
	/*
	 * @Test(priority = 0) public void MSMCreateStudent() { MSMLogin log=new
	 * MSMLogin(driver); log.LoginToMSMPortal(); OperationStudent newstudent=new
	 * OperationStudent(driver); newstudent.ClickOnOperation();
	 * newstudent.GetStudentExcelData(); }
	 */
	
	/*
	 * @Test(priority = 0) public void MSMEditStudent() { MSMLogin log=new
	 * MSMLogin(driver); log.LoginToMSMPortal();
	 * 
	 * OperationEditStudent editstu=new OperationEditStudent(driver);
	 * editstu.EditStudentUI(); editstu.StudentAgentField();
	 * editstu.StudentEducationalBackground(); editstu.StudentTestScore();
	 * editstu.ClickOnStudentDocument(); editstu.GetDocumentFromExcel();
	 * editstu.GetStudentDocumentsFromExcel(); editstu.AddStudentVisa();
	 * editstu.StudentInterest(); editstu.NavigateToStudentActivityage();
	 * editstu.GetStudentActivityFromExcel(); editstu.AddStudentNotes(); }
	 */
	
	
	@Test(priority = 0) 
	public void MSMEditStudent()
	{ 
		MSMLogin log=new MSMLogin(driver);
		log.LoginToMSMPortal();
		
		/*
		 * OperationStudentApplication stuapp=new OperationStudentApplication(driver);
		 * stuapp.NavigateToEditStudentUI();
		 * stuapp.GetStudentApplicationDataFromExcel();
		 */
		
		/*
		 * OperationApplication oapp=new OperationApplication(driver);
		 * oapp.NavigateToOperationApplicationPage();
		 * oapp.GetOperationApplicationDataFromExcel();
		 */
		
		/*
		 * OperationDeferralRequest odef=new OperationDeferralRequest(driver);
		 * odef.NavigateToOperationSection();
		 * odef.GetOperationDefferalRequestDataFromExcel();
		 */
		
		OperationApplyForRefund opref=new OperationApplyForRefund(driver);
		opref.NavigateToOperationEditApplicationUI();
		opref.GetOperationTuitionFeeDataFromExcel();
		opref.GetOperationApplyForRefundDataFromExcel();
		
		
	}	
	
	
}
