package democlass;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Listenerclass implements ITestListener{

	ExtentReports er;
	
	//It will monitor the Listener class example when it is starting ending
	ExtentTest test;
	
	
	@Override
	public void onStart(ITestContext context) {
		
		ExtentSparkReporter esr = new ExtentSparkReporter(".\\ExtentReport\\"+1+".html");
		
		//To provide title of the report
		esr.config().setDocumentTitle("Final vtiger Report");
		
		//Providing the theme
		esr.config().setTheme(Theme.DARK);
		
		//Providing the reporter name
		esr.config().setReportName("Deepu");
		
		//Extra Relevant information about Report
		er = new ExtentReports();
		
		er.attachReporter(esr);
		
		er.setSystemInfo("Operating system", "Windows");
		
		er.setSystemInfo("Language", "Java");
	
	}
	
	@Override 
	public void onFinish(ITestContext context) {
		
		//It is going to consolidate the reports
		er.flush();
		
	}

   
    @Override
	public void onTestStart(ITestResult result) {
		
		String name= result.getName();
		
		//Particular test case monitor
		test = er.createTest(name);	
		
	}

    
	@Override
	public void onTestSuccess(ITestResult result) {
		
		String name = result.getName();
		
		test.log(Status.PASS, name +"-------->pass");
			}
	
	 @Override
		public void onTestFailure(ITestResult result) {
			
	       String name = result.getName();
			
			test.log(Status.FAIL, name +"-------->Fail");	
			
		}
	 

	    @Override
		public void onTestSkipped(ITestResult result) {
			
	        String name = result.getName();
			
			test.log(Status.SKIP, name +"-------->skipped");
		
		}


}
