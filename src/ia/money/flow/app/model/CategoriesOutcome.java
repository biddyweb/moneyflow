package ia.money.flow.app.model;

public class CategoriesOutcome {

	int id; 
	String categoryName;
	
	public CategoriesOutcome(int id, String categoryName) {
		super();
		this.id = id;
		this.categoryName = categoryName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	

}
