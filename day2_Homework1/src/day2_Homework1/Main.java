package day2_Homework1;

public class Main {

	public static void main(String[] args) {
		
		Category category1 = new Category(1, "Front-End Programming");
		Category category2 = new Category();
		category2.id = 2;
		category2.categoryName = "Back-End Programming";
		
		Category[] categories = {category1, category2};
		
		for (Category category : categories) {		
			
			System.out.println(category.categoryName);
		}
		
		System.out.println("-----------------------------");
		
		
		Instructor instructor1 = new Instructor(1, "Engin", "Demiroð");
		Instructor instructor2 = new Instructor(2, "Kerem", "Varýþ");
				
		Instructor[] instructors = {instructor1, instructor2};
		
		for (Instructor instructor : instructors) {
			System.out.println(instructor.firstName + " " + instructor.lastName);
		}
		
		System.out.println("-----------------------------");
		
		Course course1 = new Course(1, "Java", "Engin Demiroð", 70);
		Course course2 = new Course(2, "C#", "Engin Demiroð", 100);
		
		Course[] courses = {course1, course2};
		
		for (Course course : courses) {
			System.out.println(course.courseName + " %" + course.completionRate + " tamamlandý");
		}
		
		System.out.println("-----------------------------");
		
		CategoryManager categoryManager = new CategoryManager();
		categoryManager.addToCategory(category2);
		categoryManager.deleteToCategory(category1);

	}

}
