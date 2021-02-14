package utilites;

import java.io.File;
import com.google.common.io.Files;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import testcases.tc9_remove;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class screenshots {



	//private static final String TakesScreenshot = null;
	static int i = 1;
    static WebDriver driver;
    static WebElement username,password;
    public static void main(String[] args) throws Exception 
    {
    	// FOR VALID REGISTRATION
       System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	       driver=new ChromeDriver();
	       driver.get("https://petstore.octoperf.com/");
	     captureScreenshot();

	       screenshots registrationpage = new screenshots();
	       
    	WebElement enter = driver.findElement(By.linkText("Enter the Store"));
		enter.click();
	       captureScreenshot();

		WebElement signin = driver.findElement(By.linkText("Sign In"));
		signin.click();
	       captureScreenshot();

		
		
		WebElement register=driver.findElement(By.xpath("//*[@id=\"Catalog\"]/a"));
		register.click();
	       captureScreenshot();

		WebElement userid=driver.findElement(By.name("username"));
		userid.sendKeys("madhuri123");
	       captureScreenshot();

		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("madhu123");
	       captureScreenshot();

		WebElement repeatpassword=driver.findElement(By.name("repeatedPassword"));
		repeatpassword.sendKeys("madhu123");
	       captureScreenshot();

		WebElement firstname=driver.findElement(By.name("account.firstName"));
		firstname.sendKeys("abcd");
	       captureScreenshot();

		WebElement lastname=driver.findElement(By.name("account.lastName"));
		lastname.sendKeys("xyz");
	     captureScreenshot();

		WebElement email=driver.findElement(By.name("account.email"));
		email.sendKeys("madhu@gmail.com");
	       captureScreenshot();
		WebElement phone=driver.findElement(By.name("account.phone"));
		phone.sendKeys("987324728");
	       captureScreenshot();

		WebElement address1=driver.findElement(By.name("account.address1"));
		address1.sendKeys("abcstreet");
	      captureScreenshot();

		WebElement address2=driver.findElement(By.name("account.address2"));
		address2.sendKeys("xyzstreet");
	       captureScreenshot();

		WebElement city=driver.findElement(By.name("account.city"));
		city.sendKeys("ghf");
	      captureScreenshot();

		WebElement state=driver.findElement(By.name("account.state"));
		state.sendKeys("chicago");
	      captureScreenshot();

		WebElement zip=driver.findElement(By.name("account.zip"));
		zip.sendKeys("53723");
	      captureScreenshot();

		WebElement country=driver.findElement(By.name("account.country"));
		country.sendKeys("UN");
	      captureScreenshot();

		WebElement langauagepreference=driver.findElement(By.name("account.languagePreference"));
		langauagepreference. click();
	      captureScreenshot();

		WebElement favouritecategory=driver.findElement(By.name("account.favouriteCategoryId"));
		favouritecategory. click();
		WebElement enablemylist= driver.findElement(By.name("account.listOption"));
	    enablemylist.click();
	      captureScreenshot();

	   WebElement enablemybanner= driver.findElement(By.name("account.bannerOption"));
		enablemybanner.click();
		WebElement saveinformation= driver.findElement(By.name("newAccount"));
		saveinformation.click();
	       captureScreenshot();    
        
        // FOR INVALID REGISTRATION
        

		WebElement signin1 = driver.findElement(By.linkText("Sign In"));
		signin1.click();
	       captureScreenshot();

		
		
		WebElement register1=driver.findElement(By.xpath("//*[@id=\"Catalog\"]/a"));
		register1.click();
	       captureScreenshot();

		WebElement userid1=driver.findElement(By.name("username"));
		userid1.sendKeys("madhuri123");
	

		WebElement password1=driver.findElement(By.name("password"));
		password1.sendKeys("madhu123");
		

		WebElement repeatpassword1=driver.findElement(By.name("repeatedPassword"));
		repeatpassword1.sendKeys("");
	       

		WebElement firstname1=driver.findElement(By.name("account.firstName"));
		firstname1.sendKeys("");
		
		WebElement lastname1=driver.findElement(By.name("account.lastName"));
		lastname1.sendKeys("xyz");
	       

		WebElement email1=driver.findElement(By.name("account.email"));
		email1.sendKeys("madhu@gmail.com");
	       
		WebElement phone1=driver.findElement(By.name("account.phone"));
		phone1.sendKeys("");
		

		WebElement address11=driver.findElement(By.name("account.address1"));
		address11.sendKeys("abc");
	      

		WebElement address21=driver.findElement(By.name("account.address2"));
		address21.sendKeys("xyzstreet");
	       		WebElement city1=driver.findElement(By.name("account.city"));
		city1.sendKeys("");
	       		WebElement state1=driver.findElement(By.name("account.state"));
		state1.sendKeys("karnataka");
	       

		WebElement zip1=driver.findElement(By.name("account.zip"));
		zip1.sendKeys("57210");
	       
		WebElement country1=driver.findElement(By.name("account.country"));
		country1.sendKeys("");
	       

		WebElement langauagepreference1=driver.findElement(By.name("account.languagePreference"));
		langauagepreference1. click();
	       
		WebElement favouritecategory1=driver.findElement(By.name("account.favouriteCategoryId"));
		favouritecategory1. click();
		WebElement enablemylist1= driver.findElement(By.name("account.listOption"));
	    enablemylist1.click();
	    Thread.sleep(3000);
	       

	   WebElement enablemybanner1= driver.findElement(By.name("account.bannerOption"));
		enablemybanner1.click();
	captureScreenshot();
		WebElement saveinformation1= driver.findElement(By.name("newAccount"));
		saveinformation1.click();
	       captureScreenshot();
	       Thread.sleep(3000);
	       driver.quit();  
	       
	       //FOR VALID LOGIN

	       System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	       driver=new ChromeDriver();
	       driver.get("https://petstore.octoperf.com/");
	      captureScreenshot();

	       screenshots registrationpages1 = new screenshots();
	       
	   	driver.findElement(By.linkText("Enter the Store")).click();
	    driver.findElement(By.linkText("Sign In")).click();
	     driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/p[2]/input[2]")).click();
	     driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/p[2]/input[2]")).clear();
	     username=driver.findElement(By.name("username"));
	     password=driver.findElement(By.name("password"));
     captureScreenshot();
	     username.sendKeys("madhuri123");
	     Thread.sleep(2000);
	     password.sendKeys("madhu123");
	    captureScreenshot();
	     Thread.sleep(2000);
	     WebElement btnLogin = 
	             driver.findElement(By.name("signon"));
	             btnLogin.click();
	            captureScreenshot();
	             Thread.sleep(2000);
	           WebElement signout=  driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]"));
	           signout.click();
	     Thread.sleep(2000);  
	          captureScreenshot(); 
	            
	          //  FOR INVALID USERNAME
	         driver.findElement(By.linkText("Sign In")).click();
	   	     driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/p[2]/input[2]")).click();
	   	     driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/p[2]/input[2]")).clear();
	   	     username=driver.findElement(By.name("username"));
	   	     password=driver.findElement(By.name("password"));
	   	     username.sendKeys("madhuri1");
	   	     Thread.sleep(2000);
	   	     password.sendKeys("madhu123");
	       captureScreenshot();
	   	     Thread.sleep(2000);
	   	     WebElement btnLogin1 = 
	   	             driver.findElement(By.name("signon"));
	   	             btnLogin1.click();
	   	            captureScreenshot();
	   	     Thread.sleep(2000);  
	   	    
	   	     //FOR INVALID PASSWORD
	   	     
	    	  driver.findElement(By.linkText("Sign In")).click();
		     driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/p[2]/input[2]")).click();
		     driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/p[2]/input[2]")).clear();
		     username=driver.findElement(By.name("username"));
		     password=driver.findElement(By.name("password"));
		     username.sendKeys("madhuri123");
		     Thread.sleep(2000);
		     password.sendKeys("madhu12");
	     captureScreenshot();
		     Thread.sleep(2000);
		     WebElement btnLogin11 = 
		             driver.findElement(By.name("signon"));
		             btnLogin11.click();
		         captureScreenshot();
		             
		     Thread.sleep(2000);  
		     
		     //FOR EMPTY FIELDS
		     driver.findElement(By.linkText("Sign In")).click();
		     driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/p[2]/input[2]")).click();
		     driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/p[2]/input[2]")).clear();
		     username=driver.findElement(By.name("username"));
		     password=driver.findElement(By.name("password"));
		     username.sendKeys("");
		     Thread.sleep(2000);
		     password.sendKeys("");
		    captureScreenshot();
		     Thread.sleep(2000);
		     WebElement btnLogin111 = 
		             driver.findElement(By.name("signon"));
		             btnLogin111.click();
		             captureScreenshot();
		 Thread.sleep(2000);     
		 
		 //BUYING A PRODUCT
		 driver.findElement(By.linkText("Sign In")).click();
	     driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/p[2]/input[2]")).click();
	     driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/p[2]/input[2]")).clear();
	     username=driver.findElement(By.name("username"));
	     password=driver.findElement(By.name("password"));
	     captureScreenshot();
	     username.sendKeys("madhuri123");
	     Thread.sleep(2000);
	     password.sendKeys("madhu123");
	    captureScreenshot();
	     Thread.sleep(2000);
	     WebElement btnLogin2 = 
	             driver.findElement(By.name("signon"));
	             btnLogin2.click();
	             captureScreenshot();
	             Thread.sleep(2000);
	             
	             WebElement	fish = driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img"));
	 			fish.click();
	 			captureScreenshot();
	 			WebElement productid = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a"));
	 			productid.click();
	 			captureScreenshot();
	 			WebElement addtocart = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a"));
	 				addtocart.click();
	 				captureScreenshot();
	 				
	 				driver.findElement(By.name("EST-1")).click();
	 				 driver.findElement(By.name("EST-1")).clear();

	 			WebElement	quantity = driver.findElement(By.name("EST-1"));
	 				quantity.sendKeys("5");
	 			captureScreenshot();
	 			WebElement	proceedtocheckout = driver.findElement(By.xpath("//*[@id=\"Cart\"]/a"));
	 				   proceedtocheckout.click();
	 				  captureScreenshot();

	 				  //PAYMENT DETAILS
	 				 driver.findElement(By.name("order.creditCard")).click();
		 	   		 driver.findElement(By.name("order.creditCard")).clear();
		 			 WebElement cardnumber=driver.findElement(By.name("order.creditCard"));
		 				cardnumber. sendKeys("6785 8976 3245 6120");
		 				captureScreenshot();
		 				
		 				driver.findElement(By.name("order.expiryDate")).click();
		 				 driver.findElement(By.name("order.expiryDate")).clear();
		 				 Thread.sleep(2000);
		 			WebElement	expirydate=driver.findElement(By.name("order.expiryDate"));
		 	    		expirydate. sendKeys("12/26");	
		 	            captureScreenshot();
		 	            
	 		    	WebElement neworder=driver.findElement(By.name("newOrder"));
	 		    	neworder.click();
	 		    	captureScreenshot();
	 		    	
	 		    	WebElement confirm=driver.findElement(By.xpath("//*[@id=\"Catalog\"]/a"));
	 		    	confirm.click();
	 		    	captureScreenshot(); 
	 	           WebElement signout1=  driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]"));
		           signout1.click();
		           captureScreenshot();
		           driver.quit();
		           
	         	 /* // INVALID PAYMENT DETAILS
	 				 WebElement cardtype=driver.findElement(By.name("order.cardType"));
	 	   			cardtype. click();	
	 	   			Thread.sleep(1000);
	 	   			
	 	   			driver.findElement(By.name("order.creditCard")).click();
	 	   		 driver.findElement(By.name("order.creditCard")).clear();
	 			 WebElement cardnumber=driver.findElement(By.name("order.creditCard"));
	 				cardnumber. sendKeys("");
	 				captureScreenshot();
	 				Thread.sleep(1000);
	 				
	 				
	 				driver.findElement(By.name("order.expiryDate")).click();
	 				 driver.findElement(By.name("order.expiryDate")).clear();
	 				 Thread.sleep(2000);
	 			WebElement	expirydate=driver.findElement(By.name("order.expiryDate"));
	 	    		expirydate. sendKeys("");	
	 	    		captureScreenshot();
	 	    		Thread.sleep(1000);
	 	    		
	 	    		
	 			WebElement neworder=driver.findElement(By.name("newOrder"));
	 	    	neworder.click();
	 	    	Thread.sleep(3000);
	 	    	captureScreenshot();
	 	    	WebElement confirm=driver.findElement(By.xpath("//*[@id=\"Catalog\"]/a"));
	 	    	confirm.click();
	 	    	Thread.sleep(3000);
	 	    	captureScreenshot();  */
		 
		 
		           //FOR MY ACCOUNT
		           System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			        driver = new ChromeDriver();
			        driver.get("https://petstore.octoperf.com/");
			        myaccount enterstore = new myaccount(); 
			    
					WebElement enter1 = driver.findElement(By.linkText("Enter the Store"));
					enter1.click();
					driver.findElement(By.linkText("Sign In")).click();
			        Thread.sleep(3000);
			        driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/p[2]/input[2]")).click();
			        Thread.sleep(3000);
			        driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/p[2]/input[2]")).clear();
			        Thread.sleep(3000);
			        username=driver.findElement(By.name("username"));
			        password=driver.findElement(By.name("password"));
			        username.sendKeys("sreekeerthi");
			        Thread.sleep(3000);
			        password.sendKeys("keerthi@511");
			        Thread.sleep(3000);
			        WebElement btnLogins2 = 
			                driver.findElement(By.name("signon"));
			                btnLogins2.click();
			                driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[3]")).click();
			                Thread.sleep(3000);
			                captureScreenshot();
			                driver.findElement(By.xpath("//*[@id=\"Catalog\"]/a")).click();
			                Thread.sleep(3000);
			                captureScreenshot();
						driver.quit();
						
						//FOR REMOVING AN ITEM
						System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				        driver = new ChromeDriver();
				        driver.get("https://petstore.octoperf.com/");
				        tc9_remove remove=new tc9_remove();
						 driver.findElement(By.linkText("Enter the Store")).click();
						    driver.findElement(By.linkText("Sign In")).click();
						    Thread.sleep(2000);
						    driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/p[2]/input[2]")).click(); 
						   driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/p[2]/input[2]")).clear();
						   Thread.sleep(2000);
						   WebElement username=driver.findElement(By.name("username"));
						   WebElement password11=driver.findElement(By.name("password"));
						    username.sendKeys("sreekeerthi");
						    Thread.sleep(2000);
						    password11.sendKeys("keerthi@511");
						    WebElement btnLogins3 = 
						            driver.findElement(By.name("signon"));
						            btnLogin.click();
						            Thread.sleep(2000);
						
						WebElement	fish1 = driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img"));
							fish1.click();
							Thread.sleep(2000);
							WebElement productid1 = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a"));
							productid1.click();
							Thread.sleep(2000);
							WebElement addtocart1 = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a"));
								addtocart1.click();
								Thread.sleep(2000);
							 driver.findElement(By.name("EST-1")).click();
							 driver.findElement(By.name("EST-1")).clear();
							 Thread.sleep(2000);
							 captureScreenshot();
							 WebElement quantity1=driver.findElement(By.name("EST-1"));
							 quantity1.sendKeys("2");
								Thread.sleep(2000);
								captureScreenshot();
							WebElement	proceedtocheckout1 = driver.findElement(By.xpath("//*[@id=\"Cart\"]/a"));
								   proceedtocheckout1.click();
								   
						driver.quit();
    }
    
    static void captureScreenshot() throws Exception
    {
        File scrFile;
        scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Files.copy(scrFile, new File("C:\\test steps\\steps" + i + ".jpeg"));
        
        i++;
    }
}
