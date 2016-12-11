package entity;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import control.RecipeManager;
import valueObject.RecipeInfo;

public class SearchRecipe {
   HashMap<Integer, String> myMap = new HashMap<Integer, String>();
   public void setRecipeNameInHashmap(int num, String recipeName){
      myMap.put(num, recipeName);
    }   
   
   @SuppressWarnings("null")
public Vector<RecipeInfo> getRecipeNameInHashmap(String recipeName, JTable table, JFrame frame){
	   Recipe s = new Recipe();
	   Vector<RecipeInfo> resultlist;
	   resultlist = s.Hsearch(recipeName);
	   if (myMap.containsValue(recipeName)){
    	  for(int h = 0; h<table.getColumnCount();h++){
	    	  for(int i = 0; i<table.getRowCount();i++){
	    		  table.setValueAt(" ", i, h);
	    	  }
    	  }
          table.setValueAt("1", 0, 0);
          table.setValueAt(recipeName, 0, 1);
          table.setValueAt("", 0, 2);
          
       }else  {
         JOptionPane.showMessageDialog(frame, "요리명 "+recipeName+"이(가) 존재하지 않습니다.");
       }
       return resultlist;
   }  
}