package day5_Homework_eStore;

import day5_Homework_eStore.business.concretes.AuthManager;
import day5_Homework_eStore.business.concretes.UserManager;
import day5_Homework_eStore.core.adapters.GoogleEmailManagerAdapter;
import day5_Homework_eStore.dataAccess.concretes.InMemoryUserDao;
import day5_Homework_eStore.entities.concretes.User;

public class Main {

	public static void main(String[] args) {


		UserManager userManager = new UserManager(new InMemoryUserDao(), new GoogleEmailManagerAdapter());
		
		User engin = new User(4, "Engin", "Demiroð", "engin@gmail.com", "123654", true);
		userManager.add(engin);
		
		User duygu = new User(2, "Duygu", "Öztürk", "duygu@gmail.com", "123456", false);
		userManager.update(duygu);
		
		InMemoryUserDao inMemoryUserDao = new InMemoryUserDao();
		GoogleEmailManagerAdapter googleEmailManagerAdapter = new GoogleEmailManagerAdapter();
		

		
		AuthManager authManager =new AuthManager(new UserManager(inMemoryUserDao, googleEmailManagerAdapter));
		//authManager.register(mert);
		authManager.register(engin);
		//UserManager userManager = new UserManager(inMemoryUserDao, googleEmailManagerAdapter);
		
		userManager.getAll();
		//userManager.getAll();	
		

	}

}
