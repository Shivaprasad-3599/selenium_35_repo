package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class KavasakiTest {
	@Test
	public void launch() {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.kawasaki-india.com/");
		Reporter.log("Kavasaki Launched",true);
	}


}
