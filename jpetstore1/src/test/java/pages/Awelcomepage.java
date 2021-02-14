package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Awelcomepage {
	WebDriver driver;
    WebElement enterstore;
   public void welcome(WebDriver driver)
    {
        this.driver=driver;
    }
    void enterstore(String s)
    {
    	WebElement enter = driver.findElement(By.linkText("Enter the Store"));
		enter.click();
    }
}
