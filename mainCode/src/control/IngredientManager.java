package control;
import java.io.*;
import java.util.Vector;

import javax.swing.*;

import entity.Ingredient;
import valueObject.IngredientInfo;

public class IngredientManager {
	private Vector<IngredientInfo> ingredientlist;
	private Ingredient ingredient;
	
	public IngredientManager(){
		ingredient = new Ingredient();
	}
	public Vector<IngredientInfo> getSelectlist() throws IOException {
	  return ingredient.getSelectlist();
	}
	
	public void setSelectlist(JCheckBox checkBox){
		ingredient.setSelectlist(checkBox);
	}
	
	public Vector<IngredientInfo> getList() {
	  return ingredient.getList();
	}
	
	public void clearSelectlist() throws IOException{
	  ingredient.clearSelectlist();
	}
}
