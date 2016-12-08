package control;

import java.util.*;

import javax.swing.*;

import entity.*;
import valueObject.*;

public class RecipeManager {
  private Recipe recipe;
  
  public RecipeManager(){
    this.recipe = new Recipe();
  }
  
  public int getLikelist(){
	  return recipe.getLikelist();
  }
  
  public Vector<RecipeInfo> sortLike(JTable table){
    return recipe.sortLike(table);
 }
  
  public Vector<RecipeInfo> search(Vector<IngredientInfo> selectlist){
   return recipe.search(selectlist);
  }
}
