package ExtentReports;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class CreatReport {
	@Test
	public void Creatrep() {
		
		ExtentSparkReporter spark=new ExtentSparkReporter("./HTML_reports/extentreport.html");
		
		ExtentReports ereport=new ExtentReports();
		
		ereport.attachReporter(spark);
		
		ExtentTest test=ereport.createTest("createReport");
		
		test.log(Status.PASS, "log message added into report");
		
		ereport.flush();
		
	}

}
