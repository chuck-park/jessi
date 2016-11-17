package control;

import java.util.*;

import entity.*;
import valueObject.*;

public class RecipeManager {
  private Recipe recipe;
  
  public RecipeManager(){
    this.recipe = new Recipe();
  }
  
  public void search(Vector<IngredientInfo> selectlist){
    recipe.search(selectlist);
  }
}
