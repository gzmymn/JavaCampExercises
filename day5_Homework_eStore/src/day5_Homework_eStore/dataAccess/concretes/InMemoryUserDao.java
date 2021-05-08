package day5_Homework_eStore.dataAccess.concretes;

import java.util.ArrayList;

import java.util.List;

import day5_Homework_eStore.dataAccess.abstracts.UserDao;
import day5_Homework_eStore.entities.concretes.User;

public class InMemoryUserDao implements UserDao {
	
	private List<User> users = new ArrayList<User>();

	public InMemoryUserDao() {
		super();
		User user1 = new User(1, "Gizem", "Yaman", "gzm@gmail.com", "123456", true);
		User user2 = new User(2, "Alparslan", "Tekkanat", "alp@gmail.com", "123456", true);
		User user3 = new User(3, "Kerem", "Yaman", "krm@gmail.com", "123456", true);
		
		users.add(user1);
		users.add(user2);
		users.add(user3);		
	}
	
	
	@Override
	public void add(User user) {
		System.out.println("Inmemory user added : " + user.getFirstName());
		users.add(user);
		
	}

	@Override
	public void delete(int id) {
		User userToDelete = users.stream()
				.filter(u -> u.getId() == id)
				.findFirst()
				.orElse(null);
		
		users.remove(userToDelete);
		
	}

	@Override
	public void update(User user) {
		
		User userToUpdate = users.stream()
				.filter(u -> u.getId() == user.getId())
				.findFirst()
				.orElse(null);
		
		userToUpdate.setEmail(user.getEmail());
		userToUpdate.setFirstName(user.getFirstName());
		userToUpdate.setLastName(user.getLastName());
		userToUpdate.setPassword(user.getPassword());
		userToUpdate.setVerify(user.isVerify());
		
	}

	

	@Override
	public List<User> getAll() {
		
		return users;
	}


	@Override
	public User get(String email) {
		
		User user = users.stream()
				.filter(u -> u.getEmail() == email)
				.findFirst()
				.orElse(null);
		return user;
	}

}
