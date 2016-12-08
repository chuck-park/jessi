package valueObject;

public class IngredientInfo {
	private String ingredientName;
	
	public IngredientInfo (String ingredientName){
	  this.ingredientName = ingredientName;
	 }
	public String getIngredientName() {
		return ingredientName;
	}
	public void setIngredientName(String ingredientName) {
		this.ingredientName = ingredientName;
	}
}
