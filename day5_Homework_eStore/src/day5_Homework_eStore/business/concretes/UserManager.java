package day5_Homework_eStore.business.concretes;

import java.util.List;

import day5_Homework_eStore.business.abstracts.UserService;
import day5_Homework_eStore.core.EmailService;
import day5_Homework_eStore.dataAccess.abstracts.UserDao;
import day5_Homework_eStore.entities.concretes.User;

public class UserManager implements UserService {
	
	private UserDao userDao;
	private EmailService emailService;
	
	

	public UserManager(UserDao userDao, EmailService emailService) {
		super();
		this.userDao = userDao;
		this.emailService = emailService;
	}

	@Override
	public void add(User user) {
		userDao.add(user);	
		System.out.println("Log: " + user.getEmail());
		emailService.send(user.getEmail(), "You have registered.");
		
	}

	@Override
	public void add(String email) {
		User user =new User();
		user.setEmail(email);
		userDao.add(user);
		System.out.println("Log2: " + user.getEmail());
		emailService.send(email,"You have registered.");
		
	}

	@Override
	public void update(User user) {

		if(userValidate(user)) {
			userDao.update(user);
		}
		
	}

	@Override
	public void delete(int userId) {

		userDao.delete(userId);
		
	}

	@Override
	public User get(String email) {
		
		return userDao.get(email);
	}

	@Override
	public List<User> getAll() {
		
		for (User user : userDao.getAll()) {
			System.out.println(user.getId() +" "+ user.getEmail() + " " + user.getFirstName() + " " + user.getLastName());
		}
		return userDao.getAll();
	}
	
	public boolean userValidate(User user) {
		if(user.getFirstName().length()>=2 && user.getLastName().length()>=2) {
			return true;				
		}
		System.out.println("Your fisrtname and lastname must be a minimum of 2 characters.");
		return false;
	}

}
