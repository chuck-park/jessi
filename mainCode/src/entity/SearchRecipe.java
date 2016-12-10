package entity;

import java.util.HashMap;
import java.util.Scanner;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class SearchRecipe {
   HashMap<Integer, String> myMap = new HashMap<Integer, String>();
   public void setRecipeNameInHashmap(int num, String recipeName){
      myMap.put(num, recipeName);
    }   
   
   public void getRecipeNameInHashmap(String recipeName, JTable table, JFrame frame){
       if (myMap.containsValue(recipeName)){
    	  for(int h = 0; h<table.getColumnCount();h++){
	    	  for(int i = 0; i<table.getRowCount();i++){
	    		  table.setValueAt(" ", i, h);
	    	  }
    	  }
          table.setValueAt("1", 0, 0);
          table.setValueAt(recipeName, 0, 1);
          table.setValueAt("100%", 0, 2);
       }else  {
         JOptionPane.showMessageDialog(frame, "요리명 "+recipeName+"이(가) 존재하지 않습니다.");
       }
   }  
}