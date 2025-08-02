package pomdemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ActualTestCase {
	
	WebDriver driver;

	@BeforeClass
	void setup() {
		driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	
	@Test
	void test1() {
		Loginpage pg = new Loginpage(driver);
		pg.username("Admin");
		pg.password("admin123");
		pg.clbtn();
		Homepage hp = new Homepage(driver);
		hp.clbt();
		hp.clbt2();
		
	
		
	}
	
	@AfterClass
	void teardown() {
		driver.close();
	}
}
