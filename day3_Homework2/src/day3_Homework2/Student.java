package day3_Homework2;

public class Student extends User {

	private String address;
	
	public Student() {
		super();
	}

	public Student(int id, String firstName, String lastName, String email, String password, String role,
			String picture, String address, boolean status) {
		super(id, firstName, lastName, email, password, role, picture, status);
		this.setAddress(address);
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
