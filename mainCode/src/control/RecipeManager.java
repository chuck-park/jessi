package control;

import java.util.*;

import javax.swing.*;

import entity.*;
import valueObject.*;

public class RecipeManager {
  private Recipe recipe;

  public RecipeManager() {
    this.recipe = new Recipe();
  }

//  public int getLikelist() {
//    return recipe.getLikelist();
//  }

  public Vector<RecipeInfo> likeSort(Vector<RecipeInfo> resultlist) {
    return recipe.likeSort(resultlist);
  }

  public Vector<RecipeInfo> nameSort(Vector<RecipeInfo> resultlist) {
    return recipe.nameSort(resultlist);
  }

  public Vector<RecipeInfo> search(Vector<IngredientInfo> selectlist) {
    return recipe.search(selectlist);
  }
}
