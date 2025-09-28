package Assignment5;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class OracleConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");

		
		
		Connection con = DriverManager.getConnection(
			    "jdbc:oracle:thin:@//localhost:1521/orclpdb",
			    "ORACLEHOMEUSER2",
			    "123"
			);




Statement st=con.createStatement();
String query="select * from employee";
ResultSet rs=st.executeQuery(query);
while(rs.next()) {
	System.out.println(rs.getInt(1)+" "+rs.getString(2));
}
rs.close();
st.close();
con.close();

	}

}

