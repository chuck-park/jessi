package control;
import java.io.*;
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
	public Vector<IngredientInfo> getSelectlist() throws IOException {
	  return this.selectlist = ingredient.getSelectlist();
	}
	
	public void setSelectlist(int ingredientID){
		ingredient.setSelectlist(ingredientID);
	}
	
	public Vector<IngredientInfo> getList() {
		ingredientlist = ingredient.getList();
		return ingredientlist;
	}
	
}
