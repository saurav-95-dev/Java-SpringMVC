//All DB related tasks will be written here:
//This class is reponsible to eastablish connection to the DB and store the data.

public class Model {
	//Create variables according to the attributes that we have in DB .
	private String uname;
	private int id;
	private String password;
	private String email;
	private String ucity;
	private Connection con;
	
	
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
	
	public int Register() {
	    con = JDBCUtil.getDBConnection();
	}
	
	
	

}
