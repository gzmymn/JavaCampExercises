package day3_Homework2;

public class Instructor extends User {
	
	private String academicDepartment;
	private String experience;

	public Instructor() {
		super();
	}

	public Instructor(int id, String firstName, String lastName, String email, String password, String academicDepartmant,
			String experience, String picture, String role, boolean status) {
		super(id, firstName, lastName, email, password, picture, role, status);
		this.setAcademicDepartment(academicDepartmant);
		this.setExperience(experience);
	}



	public String getAcademicDepartment() {
		return academicDepartment;
	}

	public void setAcademicDepartment(String academicDepartment) {
		this.academicDepartment = academicDepartment;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}
	
	
}
