package day4_Homework1_AbstractClasses;

public abstract class GameCalculator {
	public abstract void hesapla() ; //inherit eden her class hesapla metodunu override edip kendi hesapla'sýný yazmak zorunda
	
	public final void gameOver() { //final olunca GameCalculator'ý kullanan her class'ýn bunu olduðu gibi kullanmasý gerekiyor
		System.out.println("Oyun bitti.");
	}
}
