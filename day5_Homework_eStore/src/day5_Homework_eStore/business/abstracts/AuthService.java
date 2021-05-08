package day5_Homework_eStore.business.abstracts;

import day5_Homework_eStore.entities.concretes.LoginDto;
import day5_Homework_eStore.entities.concretes.User;

public interface AuthService {

	void register(User user);
	void verify(User user, String token);
	boolean userExists(String email);
	void login(LoginDto dto);
}
