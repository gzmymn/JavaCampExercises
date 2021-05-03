package day4_Homework1_Interfaces;

public class SqlServerCustomerDal implements ICustomerDal {

	@Override
	public void add() {
		System.out.println("Sql Server'a eklendi.");
		
	}

}
