package day4_Homework3.entities;

import java.time.LocalDate;

import day4_Homework3.abstracts.Entity;

public class Gamer implements Entity {

	private int gamerId;
	private String firstName;
	private String lastName;
	private String nationalityId;
	private LocalDate dateOfBirth;
	private String nickName;
	
	public Gamer() {
		
	}

	public Gamer(int gamerId, String firstName, String lastName, String nationalityId, LocalDate dateOfBirth, String nickName) {
		
		this.setGamerId(gamerId);
		this.setFirstName(firstName);;
		this.setLastName(lastName);;
		this.setNationalityId(nationalityId);
		this.setDateOfBirth(dateOfBirth);
		this.setNickName(nickName);
	}

	public int getGamerId() {
		return gamerId;
	}

	public void setGamerId(int gamerId) {
		this.gamerId = gamerId;
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

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
}
