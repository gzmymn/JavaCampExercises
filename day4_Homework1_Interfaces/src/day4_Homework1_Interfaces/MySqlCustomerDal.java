package day4_Homework1_Interfaces;

public class MySqlCustomerDal implements ICustomerDal, IRepository {

	@Override
	public void add() {
		System.out.println("My Sql'e eklendi");
		
	}

}
