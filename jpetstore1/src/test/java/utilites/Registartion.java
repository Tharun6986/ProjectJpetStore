package utilites;
import org.apache.log4j.Logger;
import org.apache.log4j.Appender;
import org.apache.log4j.Category;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.SimpleLayout;

public class Registartion {
	 static Logger l = Logger.getLogger(welcome.class.getName()); 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Layout l1 = new SimpleLayout(); 

		  Appender a; 

		try 

		  { 

		  a = new FileAppender(l1,"Registration.txt", false); 

		  l.addAppender(a); 

		  } 

		  catch(Exception e) {}	   

		 

		  l.info("User enter the vaild details and moves to login page");
		  l.fatal("user enter invalid repeat password,system displays error message");
		  System.out.println("Your logic executed successfully....");
	}

}
