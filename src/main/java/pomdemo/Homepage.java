package pomdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {

	WebDriver driver;
	
	Homepage(WebDriver driver)
	 {
		 this.driver=driver; 
	 }
	 By drop= By.xpath("//p[@class='oxd-userdropdown-name']");
	 By mu=By.linkText("Logout");
	 
	 public void clbt()
	 {
		 driver.findElement(drop).click();
		 
}
	 public void clbt2()
	 {
		 driver.findElement(mu).click();
}
}
