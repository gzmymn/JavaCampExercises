package day4_Homework1_StaticDemo;

public class ProductManager {

	public void add(Product product) {
		//ProductValidator validator = new ProductValidator();
		if(ProductValidator.isValid(product)) {
		System.out.println("Eklendi");
		}else {
			System.out.println("�r�n bilgileri ge�ersizdir.");
		}
	}
}
