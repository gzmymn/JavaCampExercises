package day5_Homework_eStore.googleLogin;

import day5_Homework_eStore.entities.concretes.User;

public class GoogleLogin {

	public void register(User user) {
        System.out.println(user.getFirstName()+" : Google ile kay�t olundu.");
    }

    public void login(User user) {
        System.out.println(user.getFirstName()+" : Google ile giri� yap�ld�.");
    }
}
