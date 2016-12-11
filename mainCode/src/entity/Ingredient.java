package entity;

import java.io.*;
import java.util.*;

import javax.swing.*;

import valueObject.*;

public class Ingredient {
  private Vector<IngredientInfo> ingredientlist;
  private Vector<RecipeInfo> recipelist;

  public Ingredient() {
    try {
      BufferedWriter fileWriter = new BufferedWriter(new FileWriter("ingredient.txt"));

        fileWriter.write("돼지고기");
        fileWriter.newLine();
        
        fileWriter.write("소고기");
        fileWriter.newLine();
        
        fileWriter.write("닭고기");
        fileWriter.newLine();
        
        fileWriter.write("고추장");
        fileWriter.newLine();
        
        fileWriter.write("간장");
        fileWriter.newLine();
        
        fileWriter.write("된장");
        fileWriter.newLine();
        
        fileWriter.write("가지");
        fileWriter.newLine();
        
        fileWriter.write("버섯");
        fileWriter.newLine();
        
        fileWriter.write("당근");
        fileWriter.newLine();

        fileWriter.write("호박");
        fileWriter.newLine();

        fileWriter.write("파프리카");
        fileWriter.newLine();
        
        fileWriter.write("마늘");
        fileWriter.newLine();
        
        fileWriter.write("양파");
        fileWriter.newLine();

        fileWriter.write("고추");
        fileWriter.newLine();

        fileWriter.write("생강");
        fileWriter.newLine();

        fileWriter.write("파");
        fileWriter.newLine();

        fileWriter.write("고등어");
        fileWriter.newLine();

        fileWriter.write("미역");
        fileWriter.newLine();

        fileWriter.write("홍합");
        fileWriter.newLine();

        fileWriter.write("바지락");
        fileWriter.newLine();

        fileWriter.write("오징어");
        fileWriter.newLine();

        fileWriter.write("새우");
        fileWriter.newLine();
        
        fileWriter.write("꽃게");
        fileWriter.newLine();

        fileWriter.write("갈치");
        fileWriter.newLine();

        fileWriter.write("설탕");
        fileWriter.newLine();

        fileWriter.write("소금");
        fileWriter.newLine();

        fileWriter.write("후추");
        fileWriter.newLine();

        fileWriter.write("고춧가루");
        fileWriter.newLine();

        fileWriter.write("물엿");
        fileWriter.newLine();

        fileWriter.write("식초");
        fileWriter.newLine();

        fileWriter.write("굴소스");
        fileWriter.newLine();

        fileWriter.write("콩나물");
        fileWriter.newLine();

        fileWriter.write("숙주나물");
        fileWriter.newLine();

        fileWriter.write("고사리");
        fileWriter.newLine();

        fileWriter.write("시금치");
        fileWriter.newLine();
        
      fileWriter.close();

    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  public Vector<IngredientInfo> getList() {
    try {
      BufferedReader fileReader = new BufferedReader(new FileReader("ingredient.txt"));
      ingredientlist = new Vector<IngredientInfo>();
      String line = "start";
      for(int i = 0; line != null; i++){
        line = fileReader.readLine();
        if(line != null){
          ingredientlist.add(new IngredientInfo(line));
          //System.out.println(line);
        }else {
          break;
        }
      }
      
      fileReader.close();

    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return ingredientlist;
  }

  public void setSelectlist(JCheckBox checkBox) {
    try {    
      BufferedWriter fileWriter = new BufferedWriter(new FileWriter("selectlist.txt", true));
      
      if(checkBox.isSelected()){
        fileWriter.write(checkBox.getText());
        fileWriter.newLine();
        //System.out.println(checkBox.getText() + "이(가) selectlist에 추가되었습니다."); // test
      }
      
      fileWriter.close();

    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  public Vector<IngredientInfo> getSelectlist() {
    Vector<IngredientInfo> selectlist = new Vector<IngredientInfo>();
    try {
      BufferedReader fileReader = new BufferedReader(new FileReader("selectlist.txt"));
      String line = "start";
      for(int i = 0; line != null; i++){
        line = fileReader.readLine();
        if(line != null){
          selectlist.add(new IngredientInfo(line));
          //System.out.println(line); // 가져오는 재료목록 출력 테스트
        }else {
          break;
        }
      }
      
      fileReader.close();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    
    return selectlist;
  }
  
  public void clearSelectlist() throws IOException{
    BufferedWriter fileWriter = new BufferedWriter(new FileWriter("selectlist.txt"));
    fileWriter.close();
  }
}