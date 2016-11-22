package entity;

import java.io.*;
import java.util.*;

import valueObject.*;

public class Recipe {
  private Vector<RecipeInfo> recipelist;
  private Vector<String> ingredientlist1;
  private Vector<String> ingredientlist2;
  private Vector<String> ingredientlist3;
  private Vector<String> ingredientlist4;
  
  public Recipe(){ // 생성시 레시피 별 재료리스트 추가
    this.recipelist = new Vector<RecipeInfo>();
    this.ingredientlist1 = new Vector<String>();
    this.ingredientlist2 = new Vector<String>();
    this.ingredientlist3 = new Vector<String>();
    this.ingredientlist4 = new Vector<String>();
    
    ingredientlist1.add("햄");
    ingredientlist1.add("돼지고기");
    ingredientlist1.add("소시지");
    ingredientlist1.add("양파");
    ingredientlist1.add("고추장");
    
    ingredientlist2.add("닭고기");
    ingredientlist2.add("간장");
    ingredientlist2.add("식초");
    ingredientlist2.add("물엿");
    
    ingredientlist3.add("낙지");
    ingredientlist3.add("양배추");
    ingredientlist3.add("양파");
    ingredientlist3.add("당근");
    
    ingredientlist4.add("배추");
    ingredientlist4.add("고추가루");
    ingredientlist4.add("소금");
    
    recipelist.add(new RecipeInfo("부대찌개", ingredientlist1));
    recipelist.add(new RecipeInfo("연근조림", ingredientlist2));
    recipelist.add(new RecipeInfo("낚지볶음", ingredientlist3));
    recipelist.add(new RecipeInfo("배추김치", ingredientlist4));
    
  }
  
  // selectlist와 recipelist의 재료 일치 비교 검색
  public void search(Vector<IngredientInfo> selectlist){
    int k = 0;
    for(int i = 0; i < selectlist.size(); i++){
      for(int j = 0; j < recipelist.size(); j++){
        for(k = 0; k < recipelist.get(j).getIngredient().size(); k++){
          //System.out.println(recipelist.get(j).getIngredient().size());
          System.out.println(selectlist.get(i).getIngredientName() + " ==? " + recipelist.get(j).getIngredient().get(k));
          if(selectlist.get(i).getIngredientName().equals(recipelist.get(j).getIngredient().get(k))){
            System.out.println("ok");
            recipelist.get(j).countUp(); // 일치하면 해당 recipe의 count++
          }
        }
        k = 0;
      }
    }
    for(int a = 0; a < recipelist.size(); a++)
    System.out.println(a + "번째 레시피의 count : " + recipelist.get(a).getCount());
  }
  //좋아요 정렬
  public void likeup(){
	  Vector <Integer> like = new Vector <Integer>();
	  for(int x=0; x<recipelist.size();x++){
		  like.add(recipelist.get(x).getLike()); // like 리스트에 각 레시피 좋아요 삽입
	  }
	  Collections.sort(like, new LikeComparator());
	  for(int y=0;y<like.size();y++){
		  System.out.print(); 
	  } 
  }
  class LikeComparator implements Comparator<Integer>{
	  public int compare(Integer first, Integer second){ //comparator 메소드를 구현
	  return first > second ? -1 : (first == second ? 0 : 1); 
	  }
}
