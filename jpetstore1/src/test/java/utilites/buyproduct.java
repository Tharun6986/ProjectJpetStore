package utilites;

import org.apache.log4j.Appender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

public class buyproduct {

	static Logger l = Logger.getLogger(welcome.class.getName()); 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Layout l1 = new SimpleLayout(); 

		  Appender a; 

		try 

		  { 

		  a = new FileAppender(l1,"buyproduct.txt", false); 

		  l.addAppender(a); 

		  } 

		  catch(Exception e) {}	   

		 

		  l.info("User selects the fish ");
		  l.info("User selects the type of the fish and click on product id ");
		  l.info("User click on add to cart and user can add any number of items to cart ");
		  l.info("User enters the quantity of item ");
		  l.info("User can remove an item from the cart ");
		  l.info("User update the cart ");
		  l.info("User click on proceed to checkout and system navigates to payment page ");
		  System.out.println("Your logic executed successfully....");
	}
}
