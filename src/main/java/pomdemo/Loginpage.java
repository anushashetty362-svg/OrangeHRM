package pomdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
    //constructor
	WebDriver driver;
	
	 Loginpage(WebDriver driver)
	 {
		 this.driver=driver; 
	 }
	 
	 //Locators or pageElements
	 
	 By user = By.xpath("//input[@name='username']");
	 By pass = By.xpath("//input[@placeholder='Password']");
	 By cl=By.xpath("//button[@type='submit']");
	 
	 //action methods
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
