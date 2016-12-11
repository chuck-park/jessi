package view;

import java.io.*;
import java.util.*;

import javax.swing.*;
import javax.swing.table.*;

import control.*;
import valueObject.*;

public class RecipeView {
  private RecipeManager recipeManager;
  private IngredientManager ingredientManager;

  public RecipeView() throws IOException {
    this.recipeManager = new RecipeManager();
    this.ingredientManager = new IngredientManager();
    // recipeManager.getLikelist();
    // recipeManager.sortLike();
  }

  public void showTableData(Vector<RecipeInfo> resultlist, JTable table) {
    int j = 0;

    for (int i = 0; i < resultlist.size(); i++) {
      // System.out.println("i : " + i); System.out.println("j : " + j); // test
      table.setValueAt(Integer.toString(i + 1), i, j); // Integer.toString(i) ==
                                                       // String.valueOf(i)
      table.setValueAt(resultlist.get(i).getRecipeName(), i, j + 1); // 레시피 이름
      table.setValueAt(
          String.valueOf(((float) (resultlist.get(i).getCount()) / (float) (resultlist.get(i).getTotal())) * 100 + "%"),
          i, j + 2); // 재료일치비율
      table.setValueAt(String.valueOf(resultlist.get(i).getLike()), i, j + 3); // 좋아요

    }
  }
  
  public void clearTableData(JTable table) {
    int j = 0;

    for (int i = 0; i < 35; i++) {
      // System.out.println("i : " + i); System.out.println("j : " + j); // test
      table.setValueAt("", i, j); // Integer.toString(i) ==
                                                       // String.valueOf(i)
      table.setValueAt("", i, j + 1); // 레시피 이름
      table.setValueAt("", i, j + 2); // 재료일치비율
      table.setValueAt("", i, j + 3); // 좋아요

    }
  }

  public Vector<RecipeInfo> search(Vector<IngredientInfo> selectlist) {
    return recipeManager.search(selectlist);
  }

  public void getLikelist() {
    recipeManager.getLikelist();
  }

  public Vector<RecipeInfo> sortLike(JTable table) {
    return recipeManager.sortLike(table);
  }
}
