package day2_Homework1;

public class InstructorManager {
	
	public void addToCategory(Instructor instructor) {
		System.out.println(instructor.firstName + " , eðitmen eklendi." );
	}
	
	public void deleteToCategory(Instructor instructor) {
		System.out.println(instructor.firstName + " , eðitmen silindi." );
	}
	
	public void updateToCategory(Instructor instructor) {
		System.out.println(instructor.firstName + " , eðitmen güncellendi." );
	}

}
