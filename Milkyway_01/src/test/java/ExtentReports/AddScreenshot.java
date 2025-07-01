package ExtentReports;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class AddScreenshot {
	@Test
	public void addscreenshot() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.flipkart.com/");
		TakesScreenshot ts=(TakesScreenshot) driver;
		 String screenshort = ts.getScreenshotAs(OutputType.BASE64);
		 ExtentSparkReporter sp=new ExtentSparkReporter("./HTML_reoprts/screenshotReport.html");
		  ExtentReports eReport=new ExtentReports();
		  
		  eReport.attachReporter(sp);
		  ExtentTest test=eReport.createTest("addscrenshot");
		  test.log(Status.INFO, "Adding screenshot");
		  test.addScreenCaptureFromBase64String(screenshort);
		  eReport.flush();
		 
		
	}

}
