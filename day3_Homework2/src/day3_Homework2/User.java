package day3_Homework2;

public class User {
	
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String role;
	private String picture;
	private boolean status;
	
	public User() {
		super();
	}
		

	public User(int id, String firstName, String lastName, String email, String password, String role, String picture,
			boolean status) {
		
		this.setId(id);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setEmail(email);
		this.setPassword(password);
		this.setRole(role);
		this.setPicture(picture);
		this.setStatus(status);
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
	
}
