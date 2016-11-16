package valueObject;

import java.util.*;

public class Recipeinfo {
  private int recipeID;
  private String recipeName;
  private Vector<String> ingredient;
  private int like; // 추천순 정렬을 위한 like 변수
  private int count;
  private int total; 
  
  public Recipeinfo (int id, String recipeName, Vector<String> ingredient){
    this.recipeID = id;
    this.recipeName = recipeName;
    this.ingredient = ingredient;
    this.like = 0;
    this.count = 0;
    this.total = 0;
  }
}
