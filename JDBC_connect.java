import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class JDBC_connect {
public static void main(String[] args)  {
	try {
		//1) .load driver class
		
	Class.forName(" com. mysql. cj. jdbc.Driver");
	//2) get connecton 
	String url =" jdbc:mysql://localhost:3306/";
	String username="root";
	String pass="root";
	   Connection con= DriverManager.getConnection(url, username, pass);
	
	  
	}
	catch(ClassNotFoundException | SQLException e){
		e.printStackTrace();
	
		
	}
}
}
