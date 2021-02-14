package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Epayment {
	WebDriver driver;
    WebElement enterstore,fish,productid,addtocart,quantity,proceedtocheckout,username,password,signin,cardtype,cardnumber,expirydate,
    firstname,lastname,email,phone,address1,address2,city,state,zip,country,neworder,confirm,signout;
    
   public void welcome(WebDriver driver)
    {
        this.driver=driver;
    }
    void enterstore(String s)
    {
    	WebElement enter = driver.findElement(By.linkText("Enter the Store"));
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
	   void fish()
	   {
		   fish = driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img"));
			fish.click();
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
		   quantity = driver.findElement(By.name("EST-1"));
			quantity.sendKeys("2");
	   }
	   void proceedtocheckout() {
		   proceedtocheckout = driver.findElement(By.xpath("//*[@id=\"Cart\"]/a"));
		   proceedtocheckout.click();
	   }
    
    	public void cardtype()
    	{
    		
    			cardtype=driver.findElement(By.name("order.cardType"));
    			cardtype. click();	
    	}
    	public void cardnumber()
    	{
    		
    			cardnumber=driver.findElement(By.name("order.creditCard"));
    			cardnumber. sendKeys("2314");	
    	}
    	public void expirydate()
    	{
    		
    		expirydate=driver.findElement(By.name("order.expiryDate"));
    		expirydate. sendKeys("54");	
    	}
    	public void firstname()
    	{
    		
    		 firstname=driver.findElement(By.name("order.billToFirstName"));
    		 firstname. sendKeys("deeksha");	
    	}
    	public void lastname()
    	{
    	lastname=driver.findElement(By.name("order.billToLastName"));
    	lastname.sendKeys("kote");
    	}
    	
    	public void address1()
    	{
    	address1=driver.findElement(By.name("order.billAddress1"));
    	address1.sendKeys("shiva krupa,nrupatunga 5th main");
    	}
    	public void address2()
    	{
    	address2=driver.findElement(By.name("order.billAddress2"));
    	address2.sendKeys("shiva krupa,nrupatunga 5th main");
    	}
    	public void city()
    	{
    	city=driver.findElement(By.name("order.billCity"));
    	city.sendKeys("tumkur");
    	}
    	public void state()
    	{
    	state=driver.findElement(By.name("order.billState"));
    	state.sendKeys("karnataka");
    	}
    	public void zip()
    	{
    	zip=driver.findElement(By.name("order.billZip"));
    	zip.sendKeys("57210");
    	}
    	public void country()
    	{
    	country=driver.findElement(By.name("order.billCountry"));
    	country.sendKeys("india");
    	}
    	public void neworder()
    	{
    	neworder=driver.findElement(By.name("newOrder"));
    	neworder.click();
    	}
    	public void confirm()
    	{
    	confirm=driver.findElement(By.xpath("//*[@id=\"Catalog\"]/a"));
    	confirm.click();
    	}
    	public void signout()
    	{
    	signout=driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]"));
    	signout.click();
    	}
    	
    }

