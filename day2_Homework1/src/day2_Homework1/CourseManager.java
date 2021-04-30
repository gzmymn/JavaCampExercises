package day2_Homework1;

public class CourseManager {

	public void addToCategory(Course course) {
		System.out.println(course.courseName + " , kursu eklendi." );
	}
	
	public void deleteToCategory(Course course) {
		System.out.println(course.courseName + " , kursu silindi." );
	}
	
	public void updateToCategory(Course course) {
		System.out.println(course.courseName + " , kursu güncellendi." );
	}
}
