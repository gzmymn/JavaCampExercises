package day5_Homework_eStore.business.concretes;

import day5_Homework_eStore.business.abstracts.AuthService;
import day5_Homework_eStore.business.abstracts.UserService;
import day5_Homework_eStore.core.utils.UtilsRegex;
import day5_Homework_eStore.entities.concretes.LoginDto;
import day5_Homework_eStore.entities.concretes.User;

public class AuthManager implements AuthService {

	private UserService userService;

	public AuthManager(UserService userService) {
		super();
		this.userService = userService;
	}

	@Override
	public void register(User user) {

		if (userValidate(user) && passwordValidate(user.getPassword()) && userExists(user.getEmail()) == false
				&& UtilsRegex.emailValidate(user.getEmail())) {
			userService.add(user);
		} else {
			System.out.println("Registration failed!");
		}

	}

	@Override
	public void verify(User user, String token) {

		if (user != null && token.length() > 15) {
			User existUser = userService.get(user.getEmail());
			existUser.setVerify(true);

			userService.update(existUser);

			System.out.println("Email verified.");
		} else {
			System.out.println("Email could not be verified!");
		}

	}

	@Override
	public boolean userExists(String email) {

		User user = userService.get(email);

		if (user == null) {
			return false;
		}

		else {
			System.out.println(email + " : This Email already exists! You must use another email address.");
			return true;
		}
	}

	@Override
	public void login(LoginDto dto) {
		
		User user = userService.get(dto.getEmail());

		if (user != null && user.getPassword().equals(dto.getPassword())) {
			System.out.println("You have successfully logged in.");
		} else {
			System.out.println("Username or password is incorrect!");
		}

	}

	public boolean userValidate(User user) {
		if (user != null && !user.getFirstName().isEmpty() && !user.getLastName().isEmpty()
				&& !user.getEmail().isEmpty() && !user.getPassword().isEmpty()) {
			return true;
		}

		System.out.println("Do not leave blank space.");

		return false;
	}

	public boolean passwordValidate(String password) {

		if (password.length() >= 6) {
			return true;
		}

		System.out.println("Your password must be longer than 6 characters.");

		return false;
	}

}
