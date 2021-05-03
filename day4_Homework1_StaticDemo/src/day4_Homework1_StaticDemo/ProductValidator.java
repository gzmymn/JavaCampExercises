package day4_Homework1_StaticDemo;

public class ProductValidator {
	
	static {
		System.out.println("Statik yapýcý blok çalýþtý");
	}
	
	public ProductValidator() {
		System.out.println("Yapýcý blok çalýþtý");
	}
	
	public static boolean isValid(Product product) {
		if(product.price>0 && !product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	
	public void bisey() { //bunu manager'da kullanabilmek için new'lemek gerek
		
	}
	
	
}
