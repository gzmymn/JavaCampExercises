package day4_Homework1_AbstractDemo;

public class CustomerManager {
	
	BaseDatabaseManager databaseManager;
	
	public void getCustomers() {
		databaseManager.getData();
	}
}
