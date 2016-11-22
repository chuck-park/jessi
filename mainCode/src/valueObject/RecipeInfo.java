package valueObject;

import java.util.*;

public class RecipeInfo {
  private String recipeName;
  private Vector<String> ingredient;
  private int like; // 추천순 정렬을 위한 like 변수
  private int count;
  private int total; 
  
  public RecipeInfo (String recipeName, Vector<String> ingredient){
    this.recipeName = recipeName;
    this.ingredient = ingredient;
    this.like = 0;
    this.count = 0;
    this.total = 0;
  }

  public String getRecipeName() {
    return recipeName;
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
