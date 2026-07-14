//Common Operation for JDBC :
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class JDBCUtil {
   //load and register the driver:
	 static{
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	        } catch (ClassNotFoundException e) {
	            throw new RuntimeException(e);
	        }

	    }
	 //support methods:
	    public static Connection getDBConnection() throws SQLException {
	        String url = "jdbc:mysql://localhost:3306/RegistrationDB";
	        String username = "root";
	        String password = "Saurabh@123"; // your real password
	        return DriverManager.getConnection(url, username, password);
	    }
	    
	    public static void closeConnection(Connection con , PreparedStatement ps) throws SQLException {
	        ps.close();
	        con.close();

	    }
}
