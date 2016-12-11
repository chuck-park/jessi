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
  public JTable newJTable(){
    JTable table;
    String[][] data; // 3명의 정보를 담을 2차원 배열을 생성한다.
    String[] title = { "번호", "레시피 이름", "재료일치비율", "좋아요" }; // 컬럼의 제목 정보를 표현할 1차원
    data = new String[35][4];
    table = new JTable(data, title); // table = new JTable(데이터-2차원배열, 컬럼배열);
    this.table = table;
    return table;
  }
  public void setJTable(JTable table) {
    this.table = table;
  }
  
  public JTable getJTable() {
    return this.table;
  }
  
//  public void clearJTable(){
//    JTable table;
//    JScrollPane scroll; // 테이블 위에 열 라벨을 넣어주자~ scroll
//    String[][] data; // 3명의 정보를 담을 2차원 배열을 생성한다.
//    String[] title = { "번호", "레시피 이름", "재료일치비율", "좋아요" }; // 컬럼의 제목 정보를 표현할 1차원
//    data = new String[35][4];
//    table = new JTable(data, title); // table=new JTable(데이터-2차원배열, 컬럼배열);
//
//    setJTable(table);
//  }
}
