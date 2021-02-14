package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class buycatpages {
	WebDriver driver;
	   WebElement enter,cats,productid,addtocart,quantity,remove,proceedtocheckout,username,password,signin;
	   
	
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
	   void cats()
	   {
		   cats = driver.findElement(By.xpath("//*[@id=\\\"SidebarContent\\\"]/a[3]/img"));
			cats.click();
	   }
	   void productid() {
		   productid = driver.findElement(By.xpath("//*[@id=\\\"Catalog\\\"]/table/tbody/tr[2]/td[1]/a"));
			productid.click();
	   }
	   void addtocart() {
		   addtocart = driver.findElement(By.xpath("//*[@id=\\\"Catalog\\\"]/table/tbody/tr[2]/td[5]/a"));
			addtocart.click();
	   }
	   void quantity() {
		   quantity = driver.findElement(By.name("EST-14"));
			quantity.sendKeys("2");
	   }
	   void remove() {
		   driver.findElement(By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[3]/td[8]/a")).click();
	   }
	   void proceedtocheckout() {
		   proceedtocheckout = driver.findElement(By.xpath("//*[@id=\\\"Cart\\\"]/a"));
		   proceedtocheckout.click();
	   }
}
