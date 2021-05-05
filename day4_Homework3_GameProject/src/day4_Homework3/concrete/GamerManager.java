package day4_Homework3.concrete;

import day4_Homework3.abstracts.GamerService;
import day4_Homework3.abstracts.UserValidationService;
import day4_Homework3.entities.Gamer;

public class GamerManager implements GamerService {

	private UserValidationService userValidationService;

	public GamerManager(UserValidationService userValidationService) {

		this.userValidationService = userValidationService;
	}

	@Override
	public void add(Gamer gamer) {
		if (userValidationService.CheckIfRealPerson(gamer)) {

			System.out.println("Validation is successful.");
			System.out.println("Gamer added : " + gamer.getFirstName() + " " + gamer.getLastName());

		} else {
			System.out.println("Not a valid person. Add operation failed.");
		}

	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Gamer deleted : " + gamer.getLastName());

	}

	@Override
	public void update(Gamer gamer) {
		if (userValidationService.CheckIfRealPerson(gamer)) {

			System.out.println("Validation is successful.");
			System.out.println("Gamer updated : " + gamer.getFirstName() + " " + gamer.getLastName());

		} else {
			System.out.println("Not a valid person. Update operation failed.");
		}

	}

}
