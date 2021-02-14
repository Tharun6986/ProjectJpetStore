package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Fmyaccount {
	WebDriver driver;
    WebElement enterstore,username,password,account,order;
   public void welcome(WebDriver driver)
    {
        this.driver=driver;
    }
    void enterstore(String s)
    {
    	WebElement enter = driver.findElement(By.linkText("Enter the Store"));
		enter.click();
    }
    
    void enterUsername(String s)
    {
        username = driver.findElement(By.name("Username"));
        username.sendKeys(s);
    }
    
    void enterPassword(String s)
    {
        driver.findElement(By.name("Password")).sendKeys(s);
    }
    void account(String s)
    {
    	driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[3]")).click();
    }
    void order(String s)
    {
    	driver.findElement(By.xpath("//*[@id=\"Catalog\"]/a")).click();
    }
}
