import java.sql.*;

public class Model {
	private String uname;
	private String uemail;
	private String upass;
	private String ucity;
	
	private Connection connect;
	private PreparedStatement pstmt;
	
	public String getUname() {
		return uname;
	}
	
	public void setUname(String uname) {
		this.uname = uname;
	}
	
	public String getUemail() {
		return uemail;
	}
	
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	
	public String getUpass() {
		return upass;
	}
	
	public void setUpass(String upass) {
		this.upass = upass;
	}
	
	public String getUcity() {
		return ucity;
	}
	
	public void setUcity(String ucity) {
		this.ucity = ucity;
	}
	
	public int register() {
		int row = 0;
		try {
			connect = JdbcUtil.getDBConnection();
			String sql = "INSERT INTO USER (uname, uemail, upassword, ucity) values (?,?,?,?) ";
			pstmt = connect.prepareStatement(sql);
			
			pstmt.setString(1, uname);
			pstmt.setString(2, uemail);
			pstmt.setString(3, upass);
			pstmt.setString(4, ucity);
			
			row = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				JdbcUtil.closeResource(connect, pstmt);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return row;
	}
	
}
