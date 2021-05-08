package day5_Homework_eStore.dataAccess.abstracts;

import java.util.List;

import day5_Homework_eStore.entities.concretes.User;

public interface UserDao {

	void add(User user);
	void delete(int userId);
	void update(User user);
	User get(String email);
	List<User> getAll();
}
