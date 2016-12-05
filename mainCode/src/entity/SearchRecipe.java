package entity;

import java.util.HashMap;
import java.util.Scanner;

import javax.swing.*;

public class SearchRecipe {
   HashMap<Integer, String> myMap = new HashMap<Integer, String>();
   public void setRecipeNameInHashmap(int num, String recipeName){
      myMap.put(num, recipeName);
    }   
   
   public void getRecipeNameInHashmap(String recipeName, JTable table, JFrame frame){
      System.out.print("요리검색 ");
       if (myMap.containsValue(recipeName)){
          System.out.print("검색결과 "+recipeName+"가 존재합니다.");
          table.setValueAt("1", 0, 0);
          table.setValueAt(recipeName, 0, 1);
          
       }else  {
         System.out.println("검색결과 "+recipeName+"가 존재하지 않습니다.");
         table.setValueAt(" ", 0, 0);
         table.setValueAt(null, 0, 1);
         JOptionPane.showMessageDialog(frame, "검색결과 "+recipeName+"가 존재하지 않습니다.");
       }
   }  
}