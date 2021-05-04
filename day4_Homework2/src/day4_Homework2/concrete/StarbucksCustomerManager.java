package day4_Homework2.concrete;

import day4_Homework2.abstracts.BaseCustomerManager;
import day4_Homework2.abstracts.CustomerCheckService;
import day4_Homework2.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void save(Customer customer) {
		
		if(customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
			System.out.println("Validation is successful.");
			
		}else {
			System.out.println("Not a valid person.");
		}
	}
}
