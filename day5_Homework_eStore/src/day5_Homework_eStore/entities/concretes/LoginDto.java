package day5_Homework_eStore.entities.concretes;

import day5_Homework_eStore.entities.abstracts.Dto;

public class LoginDto implements Dto {

	private String email;
	private String password;
	
	public LoginDto() {
		super();
	}

	public LoginDto(String email, String password) {
		super();
		this.setEmail(email);
		this.setPassword(password);
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
}
