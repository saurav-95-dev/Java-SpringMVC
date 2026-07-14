//All DB related tasks will be written here:
//This class is reponsible to eastablish connection to the DB and store the data.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Model {
	//Create variables according to the attributes that we have in DB .
	private String uname;
	private int id;
	private String password;
	private String email;
	private String ucity;
	private Connection con;
	private PreparedStatement ps;
	private int rows = 0;
	
	
	//Generate setters and getters in order to get the data from Controller to Modal class.
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUcity() {
		return ucity;
	}
	public void setUcity(String ucity) {
		this.ucity = ucity;
	}
	
	public int register() {
	    try {
			con = JDBCUtil.getDBConnection();
			String sql = "insert into users (uname ,email , password, ucity ) values (?,?,?,?)";
			ps=con.prepareStatement(sql);
			ps.setString(1 , uname);
			ps.setString(2, email);
			ps.setString(3 , password);
			ps.setString(4 , ucity);
			
			rows = ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    finally {
	    	try {
				JDBCUtil.closeConnection(con, ps);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    return rows;
	    
	}
	
	
	

}
