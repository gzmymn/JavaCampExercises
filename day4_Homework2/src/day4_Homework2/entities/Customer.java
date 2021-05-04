package day4_Homework2.entities;
import java.time.LocalDate;



import day4_Homework2.abstracts.Entity;

public class Customer implements Entity {
	private int customerId;
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private String nationalityId;
	
	public Customer () {
		
	}
	
	public Customer(int customerId, String firstName, String lastName,  String nationalityId, LocalDate dateOfBirth) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalityId = nationalityId;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
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
	
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public String getNationalityId() {
		return nationalityId;
	}
	
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
		
}
