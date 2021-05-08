package day5_Homework_eStore.core.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UtilsRegex {

	public static boolean emailValidate(String email){
        String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
        
        //"^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$"
        
        //"([a-zA-Z0-9])+\@([a-zA-Z0-9])+\.[a-zA-Z]{2,}"

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(email);
        System.out.println(email +" : "+ matcher.matches());
        return matcher.matches();
	}
}
