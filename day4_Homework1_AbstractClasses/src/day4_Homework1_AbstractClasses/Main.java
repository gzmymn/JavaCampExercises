package day4_Homework1_AbstractClasses;

public class Main {

	public static void main(String[] args) {
		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		womanGameCalculator.hesapla();
		womanGameCalculator.gameOver();
		
		//GameCalculator gameCalculator = new GameCalculator(); -- bu �ekilde kullan�lm�yor
		GameCalculator gameCalculator = new KidsGameCalculator(); //bu �ekilde kullanabilirim bunun referans�n� tutuyor.
		gameCalculator.hesapla();
			
			

	}

}
