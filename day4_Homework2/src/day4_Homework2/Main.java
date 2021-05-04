package day4_Homework2;


import java.time.LocalDate;



import day4_Homework2.abstracts.BaseCustomerManager;
import day4_Homework2.adapters.MernisServiceAdapter;
import day4_Homework2.concrete.CustomerCheckManager;
import day4_Homework2.concrete.NeroCustomerManager;
import day4_Homework2.concrete.StarbucksCustomerManager;
import day4_Homework2.entities.Customer;


public class Main {

	public static void main(String[] args)  {

		Customer customer1 = new Customer(1,"Alp","Tekkanat", "12345678901", LocalDate.of(1995,5,15));
		Customer customer2 =new Customer(2,"Gizem Kübra","Yaman","12345678901", LocalDate.of(1994,1,6));
		
		BaseCustomerManager neroCustomerManager= new NeroCustomerManager();
		neroCustomerManager.save(customer1);
		
		BaseCustomerManager starbucksCustomerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
		starbucksCustomerManager.save(customer2);
		
		
		
		
		
	}

}
