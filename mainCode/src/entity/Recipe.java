package entity;

import java.io.*;
import java.util.*;

import valueObject.*;

public class Recipe {
  private Vector<Recipeinfo> recipelist1;
  private Vector<String> ingredientlist1;
  private Vector<String> ingredientlist2;
  private Vector<String> ingredientlist3;
  private Vector<String> ingredientlist4;
  
  public Recipe(){
    recipelist1.add("ÇÜ");
  }
  public Vector<Recipeinfo> getList() {
    try {

      BufferedReader fileReader = new BufferedReader(new FileReader("type.txt"));
      recipelist = new Vector<Recipeinfo>();

      recipelist.add(new Recipeinfo("ºÎ´ëÂî°³");
      recipelist.add(new TypeInfo(fileReader.read(), fileReader.readLine()));
      recipelist.add(new TypeInfo(fileReader.read(), fileReader.readLine()));
      recipelist.add(new TypeInfo(fileReader.read(), fileReader.readLine()));

      fileReader.close();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return recipelist;
  }
}
