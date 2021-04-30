package day3_Homework2;

public class InstructorManager extends UserManager {

	private BaseLogger _logger;
	public InstructorManager(BaseLogger logger) {
		super(logger);
		this._logger = logger;
		
	}

	@Override
	public void add(User instructor) {
		super.add(instructor);
		System.out.println("Eðitmen eklendi.");
	}

	@Override
	public void delete(User instructor) {
		super.delete(instructor);
		System.out.println("Eðitmen silindi.");
	}

	@Override
	public void update(User instructor) {
		super.update(instructor);
		System.out.println("Eðitmen güncellendi.");
	}

	@Override
	public void list(User... users) {
		super.list(users);
		System.out.println("Eðitmenler listelendi");
	}
	
	public void addDepartment(Instructor instructor, String academicDepartment) {
		instructor.setAcademicDepartment(academicDepartment);
		System.out.println("Eðitmen için : " + instructor.getAcademicDepartment() + " departmaný eklendi.");
		_logger.log();
	}
	
	public void addExperience(Instructor instructor, String experience	) {
		instructor.setExperience(experience);
		System.out.println("Eðitmen için : " + instructor.getExperience() + " deneyim eklendi.");
		_logger.log();
	}
}
