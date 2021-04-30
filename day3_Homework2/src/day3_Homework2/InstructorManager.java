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
		System.out.println("E�itmen eklendi.");
	}

	@Override
	public void delete(User instructor) {
		super.delete(instructor);
		System.out.println("E�itmen silindi.");
	}

	@Override
	public void update(User instructor) {
		super.update(instructor);
		System.out.println("E�itmen g�ncellendi.");
	}

	@Override
	public void list(User... users) {
		super.list(users);
		System.out.println("E�itmenler listelendi");
	}
	
	public void addDepartment(Instructor instructor, String academicDepartment) {
		instructor.setAcademicDepartment(academicDepartment);
		System.out.println("E�itmen i�in : " + instructor.getAcademicDepartment() + " departman� eklendi.");
		_logger.log();
	}
	
	public void addExperience(Instructor instructor, String experience	) {
		instructor.setExperience(experience);
		System.out.println("E�itmen i�in : " + instructor.getExperience() + " deneyim eklendi.");
		_logger.log();
	}
}
