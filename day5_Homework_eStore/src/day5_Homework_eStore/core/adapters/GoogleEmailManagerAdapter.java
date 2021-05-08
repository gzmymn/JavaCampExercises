package day5_Homework_eStore.core.adapters;

import day5_Homework_eStore.core.EmailService;
import day5_Homework_eStore.googleEmail.GoogleEmailManager;

public class GoogleEmailManagerAdapter implements EmailService {

	
private GoogleEmailManager googleEmailManager;
	
	public GoogleEmailManagerAdapter() {
		googleEmailManager = new GoogleEmailManager();
	}

	@Override
	public void send(String email, String message) {		
		googleEmailManager.send(email, message);
	}
}
