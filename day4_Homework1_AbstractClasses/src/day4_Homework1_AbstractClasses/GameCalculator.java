package day4_Homework1_AbstractClasses;

public abstract class GameCalculator {
	public abstract void hesapla() ; //inherit eden her class hesapla metodunu override edip kendi hesapla's�n� yazmak zorunda
	
	public final void gameOver() { //final olunca GameCalculator'� kullanan her class'�n bunu oldu�u gibi kullanmas� gerekiyor
		System.out.println("Oyun bitti.");
	}
}
