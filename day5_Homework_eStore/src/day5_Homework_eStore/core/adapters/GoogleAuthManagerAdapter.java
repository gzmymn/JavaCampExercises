package day5_Homework_eStore.core.adapters;

import day5_Homework_eStore.business.abstracts.UserService;
import day5_Homework_eStore.core.ExternalAuthService;
import day5_Homework_eStore.entities.concretes.LoginDto;
import day5_Homework_eStore.entities.concretes.User;

public class GoogleAuthManagerAdapter implements ExternalAuthService {
	
	private UserService userService;
	

	public GoogleAuthManagerAdapter(UserService userService) {
		super();
		this.userService = userService;
	}

	@Override
	public void register(String email) {
		if(userExists(email) == false)
		{				
			userService.add(email);	
		}else {
			User user = userService.get(email);
			LoginDto LoginDto = new LoginDto();
			LoginDto.setEmail(user.getEmail());
			LoginDto.setPassword(user.getPassword());
			
			login(LoginDto);
		}
		
	}

	@Override
	public boolean userExists(String email) {

		if(userService.get(email) != null) {
			return true;
		}		
		return false;
	}

	@Override
	public void login(LoginDto dto) {
		
		if(dto != null && dto.getPassword().equals(dto.getPassword())) {
			System.out.println("You have successfully logged in.");				
		}else {
			System.out.println("Your username or password is incorrect!");
		}
		
	}

}
