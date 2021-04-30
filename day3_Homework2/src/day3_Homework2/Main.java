package day3_Homework2;

public class Main {

	public static void main(String[] args) {
		
		StudentManager studentManager = new StudentManager(new DatabaseLogger());
		
		
		
		Student student1 = new Student(1, "Gizem", "Yaman", "gzm@gmail.com", "1234", "student", "picture1", "İstanbul", true);
		Student student2 = new Student(2, "Alp", "Tekkanat", "alp@gmail.com", "1234", "student", "picture2", "Ankara", true);
		Student student3 = new Student(3, "Ecrin", "İnci", "ei@gmail.com", "1234", "student", "picture3", "Bursa", true);
		
		
		
		InstructorManager instructorManager = new InstructorManager(new FileLogger());
		Instructor instructor1 = new Instructor(1, "Engin", "Demiroð", "engin@gmail.com", "1234", "Programming", "15 years", "picture4",  "instructor", true);
		Instructor instructor2 = new Instructor(2, "Kerem", "Varış", "kerem@gmail.com", "1234", "Programming", "12 years", "picture5", "instructor", true);
		Instructor instructor3 = new Instructor(3, "Murat", "Kurtboğan", "murat@gmail.com", "1234", "Programming", "12 years", "picture6", "instructor", true);
		
		//addStudent(studentManager, student1);
		
		//addInstructor(instructorManager, instructor1);

		studentManager.addAddress(student3, "Bursa");
		System.out.println("-------------------");
		studentManager.list(student1,student2,student3);
		System.out.println("-------------------");
		instructorManager.list(instructor1,instructor2, instructor3);

	}

}
