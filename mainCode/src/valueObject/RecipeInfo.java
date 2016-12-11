package valueObject;

import java.util.*;

public class RecipeInfo {
  private String recipeName;
  private String recipe;
  private Vector<String> ingredient;
  private int like; 
  private int count;
  private int total; 
  
  public RecipeInfo (String recipeName, int total, Vector<String> ingredient, String recipe){
    this.recipeName = recipeName;
    this.ingredient = ingredient;
    this.total = total;
    this.like = 0;
    this.count = 0;
    this.recipe = recipe;
  }
  
  public RecipeInfo (String recipeName, int total, Vector<String> ingredient, String recipe, int like){
    this.recipeName = recipeName;
    this.ingredient = ingredient;
    this.total = total;
    this.like = like;
    this.count = 0;
    this.recipe = recipe;
  }

  public String getRecipeName() {
    return recipeName;
  }
  public String getRecipe() {
	    return recipe;
	  }
  public void setRecipeName(String recipeName) {
    this.recipeName = recipeName;
  }

  public Vector<String> getIngredient() {
    return ingredient;
  }

  public void setIngredient(Vector<String> ingredient) {
    this.ingredient = ingredient;
  }

  public int getLike() {
    return like;
  }

  public void setLike(int like) {
    this.like = like;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }

  public int getTotal() {
    return total;
  }

  public void setTotal(int total) {
    this.total = total;
  }
  
  public void countUp(){
    this.count++;
  }
}
