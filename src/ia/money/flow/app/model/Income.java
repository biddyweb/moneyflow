package ia.money.flow.app.model;

public class Income {
	
	int id;
	double incomeSum;
	String incomeComment;
	int categoryIncomeId;
	String date;
	
	public Income(int id,double incomeSum, String incomeComment, int categoryIncomeId, String date) {
		super();
		this.id = id;
		this.incomeSum = incomeSum;
		this.incomeComment = incomeComment;
		this.categoryIncomeId = categoryIncomeId;
		this.date = date;
	}
	
	public int getId() {
		return id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getIncomeSum() {
		return incomeSum;
	}
	public void setIncomeSum(double incomeSum) {
		this.incomeSum = incomeSum;
	}
	public String getIncomeComment() {
		return incomeComment;
	}
	public void setIncomeComment(String incomeComment) {
		this.incomeComment = incomeComment;
	}
	public int getCategoryIncomeId() {
		return categoryIncomeId;
	}
	public void setCategoryIncomeId(int categoryIncomeId) {
		this.categoryIncomeId = categoryIncomeId;
	}
	
	
}
