package control;
import java.util.Vector;

import entity.Ingredient;
import valueObject.IngredientInfo;

public class IngredientManager {
	private Vector<IngredientInfo> ingredientlist;
	Vector<IngredientInfo> selectlist;
	
	

	private Ingredient ingredient;
	
	public IngredientManager(){
		ingredient = new Ingredient();
		selectlist = new Vector<IngredientInfo>();
		
	}
	public Vector<IngredientInfo> getSelectlist() {
		this.selectlist = ingredient.getSelectlist();
		return selectlist;
		
	}
	
	public void setSelectlist(int ingredientID) {
		ingredient.setSelectlist(ingredientID);
		
	}
	
	public Vector<IngredientInfo> getList() {
		// TODO Auto-generated method stub
		ingredientlist = ingredient.getList();
		
		return ingredientlist;
	}
	
}
