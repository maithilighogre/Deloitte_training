package User;
public class User {
	private String loginId;
	private String password;
	private String email;
	
	//constructor
	public User(String loginId, String password, String email) {
		super();
		this.loginId = loginId;
		this.password = password;
		this.email = email;
	}
	
	//getters and setters
	public String getLoginId() {
		return loginId;
	}
	public void setLoginid(String loginId) {
		this.loginId = loginId;
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
	
	
	//to string method
	@Override
	public String toString() {
		return "User1 [loginId=" + loginId + ", password=" + password + ", email=" + email + "]";
	}
	

}
