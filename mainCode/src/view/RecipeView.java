package view;

import java.io.*;
import java.util.*;

import control.*;
import valueObject.*;

public class RecipeView {
  private RecipeManager recipeManager;
  private IngredientManager ingredientManager;
  private Vector<IngredientInfo> selectList;
  
  public RecipeView() throws IOException{
    this.recipeManager = new RecipeManager();
    this.ingredientManager = new IngredientManager();
    this.selectList = ingredientManager.getSelectlist();
    recipeManager.getLikelist();
    recipeManager.sortLike();
  }
  
  public void search() { 
    recipeManager.search(this.selectList);
  }
  
  public void getLikelist(){
    recipeManager.getLikelist();
  }
  
  public void sortLike(){
    recipeManager.sortLike();
  }
}
