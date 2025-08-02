package internetHeroku;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ActualIH {

	WebDriver driver;


    @BeforeClass
	void setup()
	{
		driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	@Test
	void test1()
	{
		LoginIH ih = new LoginIH(driver);
		ih.username("tomsmith");
		ih.password("SuperSecretPassword!");
		ih.clbtn();
	}
	@AfterClass
	void teardown()
	{
		driver.close();
		
	}
}
