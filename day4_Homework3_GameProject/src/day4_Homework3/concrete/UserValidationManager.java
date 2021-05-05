package day4_Homework3.concrete;

import day4_Homework3.abstracts.UserValidationService;
import day4_Homework3.entities.Gamer;

public class UserValidationManager implements UserValidationService {

	@Override
	public boolean CheckIfRealPerson(Gamer gamer) {
		
		return true;
	}

}
