package view;
import java.io.*;
import java.util.*;

import javax.swing.*;

import control.*;
import valueObject.*;

public class IngredientView {
	private IngredientManager  ingredientManager;
	private RecipeManager recipeManager;
	private Vector<IngredientInfo> ingredientList;
	private Vector<IngredientInfo> selectList;
	
	public IngredientView(){
		this.ingredientManager = new IngredientManager();
		this.ingredientList = new Vector<IngredientInfo>();
		this.recipeManager = new RecipeManager();
		this.selectList = new Vector<IngredientInfo>();
	}
	
	public Vector<IngredientInfo> getSelectlist() throws IOException{
	  return ingredientManager.getSelectlist();
	}
	
	public void clearSelectlist() throws IOException{
	  ingredientManager.clearSelectlist();
	}
	
	public void setSelectlist(JCheckBox checkBox){
	  ingredientManager.setSelectlist(checkBox);
	}
	
	public Vector<IngredientInfo> getList(){
	  return this.ingredientManager.getList();
	}
	
}
