package control;

import java.util.*;

import javax.swing.*;

import entity.*;
import valueObject.*;

//Hashmap Used
public class SearchRecipeManager {
  private SearchRecipe hashmap;
  private Ingredient ingredient;
  private Recipe recipe;
  private JTable table;
  public SearchRecipeManager(){
    this.hashmap = new SearchRecipe();
    
  }
  public SearchRecipe getHashmap() {
    return this.hashmap;
  }
  public void initialize(){
    this.recipe = new Recipe();
    this.recipe.initialize(this.hashmap);
    
  }
  public void setJTable(JTable table) {
    this.table = table;
  }
  public JTable getJTable() {
    return this.table;
  }
  
}
