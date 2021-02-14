package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cloginpage {
	WebDriver driver;
	   WebElement enter,username,password,signin;
	   public void Login(WebDriver driver) {
		   this.driver=driver;
	   }
	   void enter()
	   {
		   enter = driver.findElement(By.linkText("Enter the Store"));
			enter.click();
	   }
	   void signin()
	   {
		   signin = driver.findElement(By.linkText("Sign In"));
		   signin.click();
	   }
	   void username(String s)
	   {
		   
		   username=driver.findElement(By.name("username"));
		   username.sendKeys(s);
	   }
	   void password(String s)
	   {
		   password=password.findElement(By.name("password"));
		   password.sendKeys(s);
	   }
}
