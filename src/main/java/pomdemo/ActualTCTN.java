package pomdemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ActualTCTN {

	WebDriver driver;

	@BeforeClass
	void setup() {
		driver = new ChromeDriver();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	
	@Test
	void test1() {
		LoginTN lt = new LoginTN(driver);
		lt.email("Admin12@gmail.com");
		lt.password("admin123");
		lt.clbtn();
		
	}
	
	@AfterClass
	void teardown() {
		driver.close();
	}
}
