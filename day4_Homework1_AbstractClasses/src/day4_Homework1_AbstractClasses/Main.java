package day4_Homework1_AbstractClasses;

public class Main {

	public static void main(String[] args) {
		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		womanGameCalculator.hesapla();
		womanGameCalculator.gameOver();
		
		//GameCalculator gameCalculator = new GameCalculator(); -- bu þekilde kullanýlmýyor
		GameCalculator gameCalculator = new KidsGameCalculator(); //bu þekilde kullanabilirim bunun referansýný tutuyor.
		gameCalculator.hesapla();
			
			

	}

}
