package utilites;
import org.apache.log4j.Logger;
import org.apache.log4j.Appender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.SimpleLayout;

public class welcome {
	 static Logger l = Logger.getLogger(welcome.class.getName()); 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Layout l1 = new SimpleLayout(); 

		  Appender a; 

		  try 

		  { 

		  a = new FileAppender(l1,"writelog1.txt", false); 

		  l.addAppender(a); 

		  } 

		  catch(Exception e) {}	   

		 

		  l.info(" Welcome to jpetstore");
		  System.out.println("Your logic executed successfully....");
	}

}
