package day5_Homework_eStore.core;

import day5_Homework_eStore.entities.concretes.LoginDto;

public interface ExternalAuthService {

	void register(String email);
	boolean userExists(String email);
	void login(LoginDto dto);
}
