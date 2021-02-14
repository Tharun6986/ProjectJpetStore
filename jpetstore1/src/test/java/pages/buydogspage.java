package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class buydogspage {
	WebDriver driver;
	   WebElement enter,dogs,productid,addtocart,quantity,proceedtocheckout,username,password,signin;
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
	   void dogs()
	   {
		   dogs = driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[2]/img"));
			dogs.click();
	   }
	   void productid() {
		   productid = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a"));
			productid.click();
	   }
	   void addtocart() {
		   addtocart = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a"));
			addtocart.click();
	   }
	   void quantity() {
		   quantity = driver.findElement(By.name("EST-6"));
			quantity.sendKeys("5");
	   }
	   void proceedtocheckout() {
		   proceedtocheckout = driver.findElement(By.xpath("//*[@id=\"Cart\"]/a"));
		   proceedtocheckout.click();
	   }
}
