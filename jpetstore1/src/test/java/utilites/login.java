package utilites;

import org.apache.log4j.Appender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

public class login {

	static Logger l = Logger.getLogger(welcome.class.getName()); 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Layout l1 = new SimpleLayout(); 

		  Appender a; 

		try 

		  { 

		  a = new FileAppender(l1,"login.txt", false); 

		  l.addAppender(a); 

		  } 

		  catch(Exception e) {}	   

		 

		  l.info("User enter the vaild details and moves to home page");
		  l.fatal("user enter invalid username,system displays please enter valid username and password");
		  l.fatal("user enter invalid password,system displays please enter valid username and password ");
		  l.fatal("user clicks on login with empty username and password feilds,system displays login page");
		  System.out.println("Your logic executed successfully....");
	}


}
