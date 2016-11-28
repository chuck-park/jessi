package entity;

import java.io.*;

import java.util.*;

import valueObject.*;

public class Recipe {
  private Vector<RecipeInfo> recipelist;
  private Vector<RecipeInfo> likelist;
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
  
  public int getLikelist(){
	  recipelist.get(0).setLike(4);
	  recipelist.get(1).setLike(5);
	  recipelist.get(2).setLike(1);
	  
	  System.out.println("recipelist size print : " + recipelist.size());
	  
	  this.likelist = new Vector <RecipeInfo>(); // 좋아요가 1이상인 list에 레시피인포 생성
	  
	  for(int x=0; x<recipelist.size();x++){ 
		  if(recipelist.get(x).getLike()!=0){ // list에 좋아요가 0이 아닌 리스트를 넣는다
			  likelist.add(recipelist.get(x));
			  System.out.println("likelist "+x + " print : " + likelist.size());
		  }
	  }
	  return likelist.size();
  }
  
  public void sortLike(){
	  for(int x=0; x<likelist.size();x++){
	  System.out.println("before print : " + likelist.get(x).getLike());
	  }
	  //quickSort(likelist, 0, likelist.size() );
	  bubbleSort(likelist);
	  for(int x=0; x<likelist.size();x++){
	  System.out.println("after print : " + likelist.get(x).getLike());
	  }
	  
  }
  
  void bubbleSort(Vector<RecipeInfo> likelist) {

	    int n = likelist.size();
	    Vector<RecipeInfo> temp = new Vector<RecipeInfo>();

	    for (int i = 0; i < n; i++) {
	        for (int j = 1; j < (n - i); j++) {

	            if (likelist.get(j-1).getLike() < likelist.get(j).getLike()) {
	            	temp.add(0, likelist.get(j-1));
	            	  likelist.add(j-1, likelist.get(j));
	            	  likelist.add(j, temp.get(0));
	            }

	        }
	    }
	    System.out.println("?");
	}
  
  
  
  /*
  int partition(Vector<RecipeInfo> likelist, int left, int right)
  {
        int i = left, j = right;
        int middle = left + (right - left) /2;
        Vector<RecipeInfo> temp = new Vector<RecipeInfo>();
        int pivot = likelist.get(middle).getLike();
       
        while (i <= j) {
              while (likelist.get(left).getLike() < pivot)
                    i++;
              while (likelist.get(right).getLike() > pivot)
                    j--;
              if (i <= j) {
            	  temp.add(0, likelist.get(left));
            	  likelist.add(left, likelist.get(right));
            	  likelist.add(right, temp.get(0));
                    i++;
                    j--;
              }
        };
       
        return i;
  }
   
  void quickSort(Vector<RecipeInfo> likelist, int left, int right) {
        int index = partition(likelist, left, right);
        if (left < index - 1)
              quickSort(likelist, left, index - 1);
        if (index < right)
              quickSort(likelist, index, right);
  }
  
  */
  
 
 }


