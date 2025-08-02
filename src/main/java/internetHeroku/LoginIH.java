package internetHeroku;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginIH {

	WebDriver driver;

	LoginIH(WebDriver driver)
	{
		this.driver = driver;
		
	}
	  By user= By.xpath("//input[@type='text']");
	  By pass = By.name("password");
	  By cl=By.xpath("//i[@class='fa fa-2x fa-sign-in']");

	public void username(String un)
	{
		driver.findElement(user).sendKeys(un);
	}

	public void password(String pw)
	{
		driver.findElement(pass).sendKeys(pw);
	}

	public void clbtn()
	{
	driver.findElement(cl).click();
	}
}
