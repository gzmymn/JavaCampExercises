package day4_Homework1_Interfaces;

public class Main {

	public static void main(String[] args) {

		CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
		
		customerManager.add();
		

	}

}
