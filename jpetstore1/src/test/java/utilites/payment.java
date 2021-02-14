package utilites;

import org.apache.log4j.Appender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

public class payment {

	static Logger l = Logger.getLogger(welcome.class.getName()); 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Layout l1 = new SimpleLayout(); 

		  Appender a; 

		try 

		  { 

		  a = new FileAppender(l1,"payment.txt", false); 

		  l.addAppender(a); 

		  } 

		  catch(Exception e) {}	   

		 

		  l.info("User selects the cardtype ");
		  l.info("User enter the card number ");
		  l.info("User enter the expiry date ");
		  l.info("User clicks on continue system moves to confirm order page");
		  l.info("User clicks on confirm order to confirm order ");
		  l.info("system displays THANK YOU,YOUR ORDER HAS BEEN SUBMITTED");
		  l.fatal("user click on continue with empty card number system displays error message");
		  l.fatal("user click on continue with empty expiry date system displays error message");
		  System.out.println("Your logic executed successfully....");
	}
}
