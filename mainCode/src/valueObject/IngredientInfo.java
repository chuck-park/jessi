package valueObject;

public class IngredientInfo {
	private int ingredientID;
	private String ingredientName;
	
	public IngredientInfo (int id, String ingredientName){
	  this.ingredientID=id;
	  this.ingredientName = ingredientName;
	 }
	public int getIngredientID() {
		return ingredientID;
	}
	public void setIngredientID(int ingredientID) {
		this.ingredientID = ingredientID;
	}
	public String getIngredientName() {
		return ingredientName;
	}
	public void setIngredientName(String ingredientName) {
		this.ingredientName = ingredientName;
	}
}
