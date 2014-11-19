package ia.money.flow.app.model;

public class Outcome {
	
	int id;
	double outcomeSum;
	String outcomeComment;
	int categoryOutcomeId;
	String date;
	
	public Outcome(int id, double outcomeSum, String outcomeComment,
			int categoryOutcomeId, String date) {
		super();
		this.id = id;
		this.outcomeSum = outcomeSum;
		this.outcomeComment = outcomeComment;
		this.categoryOutcomeId = categoryOutcomeId;
		this.date = date;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getOutcomeSum() {
		return outcomeSum;
	}
	public void setOutcomeSum(double outcomeSum) {
		this.outcomeSum = outcomeSum;
	}
	public String getOutcomeComment() {
		return outcomeComment;
	}
	public void setOutcomeComment(String outcomeComment) {
		this.outcomeComment = outcomeComment;
	}
	public int getCategoryId() {
		return categoryOutcomeId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryOutcomeId = categoryId;
	}
	
	
	
}
