package day2_Homework1;

public class CategoryManager {
	
	public void addToCategory(Category category) {
		System.out.println(category.categoryName + " , kategorisi eklendi." );
	}
	
	public void deleteToCategory(Category category) {
		System.out.println(category.categoryName + " , kategorisi silindi." );
	}
	
	public void updateToCategory(Category category) {
		System.out.println(category.categoryName + " , kategorisi güncellendi." );
	}

}
