package day4_Homework2.concrete;

import day4_Homework2.abstracts.CustomerCheckService;
import day4_Homework2.entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		return true;
	}

}
