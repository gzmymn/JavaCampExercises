package day4_Homework1_AbstractClasses;

public class Main {

	public static void main(String[] args) {
		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		womanGameCalculator.hesapla();
		womanGameCalculator.gameOver();
		
		//GameCalculator gameCalculator = new GameCalculator(); -- bu şekilde kullanılmıyor
		GameCalculator gameCalculator = new KidsGameCalculator(); //bu şekilde kullanabilirim bunun referansını tutuyor.
		gameCalculator.hesapla();
			
			

	}

}
