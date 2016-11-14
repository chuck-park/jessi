package valueObject;

public class IngredientInfo {
	private int ingredientID;
	private String ingredientName;
	private String ingredientTime;
	private String ingredientRoom;
	private String ingredientProfessor;
	private String point;
	
	public IngredientInfo (int id, String ingredientName){
	  this.ingredientID=id;
	  this.ingredientName = ingredientName;
	 }
	 
	public IngredientInfo (int id, String ingredientName, String time, String room, String professor){
		this.ingredientID = id;
		this.ingredientName = ingredientName;
		this.ingredientTime = time;
		this.ingredientRoom = room;
		this.ingredientProfessor = professor;
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
