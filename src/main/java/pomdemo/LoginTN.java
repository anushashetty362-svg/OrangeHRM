package pomdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginTN {
	WebDriver driver;
	
	 LoginTN(WebDriver driver)
	 {
		 this.driver=driver; 
	 }
	 
	 //Locators or pageElements
	 
	 By user = By.xpath("//input[@id='input-email']");
	 By pass = By.xpath("//input[@id='input-password']");
	 By cl=By.xpath("//input[@value='Login']");
	 
	 //action methods
	 public void email(String em)
	 {
		 driver.findElement(user).sendKeys(em);
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
