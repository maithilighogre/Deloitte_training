import java.util.*;
public class Customer implements Comparable {

	int id;
	String name;
	String mobileNo;
	String email;
	
	public Customer(int id, String name, String mobileNo, String email) {
		super();
		this.id = id;
		this.name = name;
		this.mobileNo = mobileNo;
		this.email = email;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public int compareTo(Object o) {
		Customer c=(Customer)o;
		return c.getId()-this.getId();
		
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", mobileNo=" + mobileNo + ", email=" + email + "]";
	}
	
}

