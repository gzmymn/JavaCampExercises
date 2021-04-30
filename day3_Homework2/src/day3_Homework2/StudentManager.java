package day3_Homework2;

public class StudentManager extends UserManager {

	private BaseLogger _logger;
	public StudentManager(BaseLogger logger) {
		super(logger);
		this._logger = logger;
		
	}

	@Override
	public void add(User student) {
		super.add(student);
		System.out.println("Öğrenci eklendi.");
	}

	@Override
	public void delete(User student) {
		super.delete(student);
		System.out.println("Öğrenci silindi.");
	}

	@Override
	public void update(User student) {
		super.update(student);
		System.out.println("Öğrenci güncellendi.");
	}

	@Override
	public void list(User... users) {
		super.list(users);
		System.out.println("Öğrenciler listelendi");
	}
	
	public void addAddress(Student student, String address) {
		student.setAddress(address);
		System.out.println("Öğrenci için : " + student.getAddress() + " adres eklendi.");
		_logger.log();
	}
}
