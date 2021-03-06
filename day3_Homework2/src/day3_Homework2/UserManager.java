package day3_Homework2;

public class UserManager {

	private BaseLogger _logger;
	public UserManager(BaseLogger logger) {
		_logger = logger;
	}
	
	public void add(User user) {
		System.out.println("Kullanıcı eklendi : " + user.getFirstName() + " " + user.getLastName());
		_logger.log();
	}

	public void delete(User user) {
		System.out.println("Kullanıcı silindi : " + user.getFirstName() + " " + user.getLastName());
		_logger.log();
	}

	public void update(User user) {
		System.out.println("Kullanıcı güncellendi : " + user.getFirstName() + " " + user.getLastName());
		_logger.log();
	}

	public void list(User... users) {
		for (User user : users) {
			System.out.println(user.getFirstName() + " " + user.getLastName());
		}
		_logger.log();
	}
}
