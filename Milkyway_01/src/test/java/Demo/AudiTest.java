package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AudiTest {
	@Test
	public void launch() {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://auditestdrive.in/");
		Reporter.log("Audi Car Launched",true);
		driver.close();
	}


}
