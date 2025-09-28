package Assignment5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Sample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//step 1 register the driver
		Class.forName("oracle.jdbc.driver.OracleDriver");

		//step 2 create the connection
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orclpdb",
			    "ORACLEHOMEUSER2",
			    "123");
			
		System.out.println("Connection created");
	}

}
