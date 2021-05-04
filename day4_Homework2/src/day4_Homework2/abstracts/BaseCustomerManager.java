package day4_Homework2.abstracts;

import day4_Homework2.entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	
	@Override
	public void save(Customer customer) {
		System.out.println("Saved to database: " + customer.getFirstName());
	}
}
