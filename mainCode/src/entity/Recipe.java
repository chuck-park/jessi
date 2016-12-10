package entity;

import java.util.*;

import javax.swing.*;

import valueObject.*;

public class Recipe {
  private Vector<RecipeInfo> recipelist;
  private Vector<RecipeInfo> likelist;
  private Vector<RecipeInfo> resultlist;
  private Vector<String> ingredientlist1;
  private Vector<String> ingredientlist2;
  private Vector<String> ingredientlist3;
  private Vector<String> ingredientlist4;
  private Vector<String> ingredientlist5;
  private Vector<String> ingredientlist6;
  private Vector<String> ingredientlist7;
  private Vector<String> ingredientlist8;
  private Vector<String> ingredientlist9;
  private Vector<String> ingredientlist10;
  private Vector<String> ingredientlist11;
  private Vector<String> ingredientlist12;
  private Vector<String> ingredientlist13;
  private Vector<String> ingredientlist14;
  private Vector<String> ingredientlist15;
  private Vector<String> ingredientlist16;
  private Vector<String> ingredientlist17;
  private Vector<String> ingredientlist18;
  private Vector<String> ingredientlist19;
  private Vector<String> ingredientlist20;


  SearchRecipe hashmap;

  String a = "1. 부대찌개"
		  +"<<조리법>>"
  		+ "01. 냄비에 육수 재료를 넣고 한소끔 끓여 멸치 육수 3컵(600ml)을 만든다."
  		+ "02. 볼에 양념 재료를 넣고 골고루 섞는다."
  		+ "03. 통조림 햄은 0.5cm 두깨로 썰고 소시지는 어슷 썬다. 다진 돼지고기는 청주 1큰술과 후춧가루 약간에 버무려 재운다."
  		+ "04. 대파는 어슷 썰고 양파는 채 썬다."
  		+ "05. 냄비에 햄, 소시지, 다진 돼지고기, 김치, 떡국떡, 양파, 대파, 삶은 마카로니, 통조림 콩을 넣는다.(떡국떡은 물에 담가 두었다가 넣는다.)"
  		+ "06. 양념과 육수를 넣고 끓인다.(간이 부족하면 소금으로 간한다.)";
  String b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;
  
  public Recipe() {// 생성시 레시피 별 재료리스트 추가
    this.recipelist = new Vector<RecipeInfo>();
    this.resultlist = new Vector<RecipeInfo>();
    this.ingredientlist1 = new Vector<String>();
    this.ingredientlist2 = new Vector<String>();
    this.ingredientlist3 = new Vector<String>();
    this.ingredientlist4 = new Vector<String>();
    this.ingredientlist5 = new Vector<String>();
    this.ingredientlist6 = new Vector<String>();
    this.ingredientlist7 = new Vector<String>();
    this.ingredientlist8 = new Vector<String>();
    this.ingredientlist9 = new Vector<String>();
    this.ingredientlist10 = new Vector<String>();
    this.ingredientlist11 = new Vector<String>();
    this.ingredientlist12 = new Vector<String>();
    this.ingredientlist13 = new Vector<String>();
    this.ingredientlist14 = new Vector<String>();
    this.ingredientlist15 = new Vector<String>();
    this.ingredientlist16 = new Vector<String>();
    this.ingredientlist17 = new Vector<String>();
    this.ingredientlist18 = new Vector<String>();
    this.ingredientlist19 = new Vector<String>();
    this.ingredientlist20 = new Vector<String>();
    
    ingredientlist1.add("햄");
    ingredientlist1.add("돼지고기");
    ingredientlist1.add("소시지");
    ingredientlist1.add("양파");
    ingredientlist1.add("고추장");
    
    ingredientlist2.add("연근");
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
    
    ingredientlist5.add("된장");
    ingredientlist5.add("양파");
    ingredientlist5.add("파");
    ingredientlist5.add("고춧가루");
    ingredientlist5.add("바지락");
    
    ingredientlist6.add("갈치");
    ingredientlist6.add("고추장");
    ingredientlist6.add("고춧가루");
    ingredientlist6.add("간장");
    ingredientlist6.add("무");
    
    ingredientlist7.add("홍합");
    ingredientlist7.add("마늘");
    ingredientlist7.add("파");
    ingredientlist7.add("무");
  
    ingredientlist8.add("굴소수");
    ingredientlist8.add("소굼");
    ingredientlist8.add("파");
    ingredientlist8.add("당근");
    ingredientlist8.add("버섯");
    ingredientlist8.add("파프리카");
    ingredientlist8.add("밥");
    
    ingredientlist9.add("미역");
    ingredientlist9.add("식초");
    ingredientlist9.add("설탕");
    ingredientlist9.add("소금");
    ingredientlist9.add("무");
    
    ingredientlist10.add("돼지고기");
    ingredientlist10.add("양파");
    ingredientlist10.add("파");
    ingredientlist10.add("고추장");
    ingredientlist10.add("고춧가루");
    ingredientlist10.add("간장");
    ingredientlist10.add("마늘");
    ingredientlist10.add("설탕");
    ingredientlist10.add("소금");
    ingredientlist10.add("후추");
    
    ingredientlist11.add("닭고기");
    ingredientlist11.add("파");
    ingredientlist11.add("마늘");
    ingredientlist11.add("생강");
    ingredientlist11.add("숙주나물");
    ingredientlist11.add("고사리");
    ingredientlist11.add("고추장");
    ingredientlist11.add("소금");
    ingredientlist11.add("간장");
    ingredientlist11.add("후춧가루");
    
    ingredientlist11.add("소고기");
    ingredientlist11.add("파");
    ingredientlist11.add("마늘");
    ingredientlist11.add("생강");
    ingredientlist11.add("숙주나물");
    ingredientlist11.add("고사리");
    ingredientlist11.add("고추장");
    ingredientlist11.add("소금");
    ingredientlist11.add("간장");
    ingredientlist11.add("후춧가루");
    
    ingredientlist12.add("소고기");
    ingredientlist12.add("파");
    ingredientlist12.add("마늘");
    ingredientlist12.add("생강");
    ingredientlist12.add("숙주나물");
    ingredientlist12.add("고사리");
    ingredientlist12.add("고추장");
    ingredientlist12.add("소금");
    ingredientlist12.add("간장");
    ingredientlist12.add("후춧가루");

    ingredientlist13.add("계란");
    ingredientlist13.add("양파");
    ingredientlist13.add("식용유");
    ingredientlist13.add("소금");
    ingredientlist13.add("후추");
    
    ingredientlist14.add("밥");
    ingredientlist14.add("옥수수");
    ingredientlist14.add("참치캔");
    ingredientlist14.add("치즈");
    ingredientlist14.add("양파");
    ingredientlist14.add("굴소스");
    
    ingredientlist15.add("밥");
    ingredientlist15.add("베이컨");
    ingredientlist15.add("계란");
    ingredientlist15.add("파");
    ingredientlist15.add("케첩");
    ingredientlist15.add("간장");
    
    ingredientlist16.add("밥");
    ingredientlist16.add("데리야끼소스");
    ingredientlist16.add("소금");
    ingredientlist16.add("치킨");
    ingredientlist16.add("김");
    ingredientlist16.add("마요네즈");
    
    ingredientlist17.add("계란");
    ingredientlist17.add("고추참치");
    ingredientlist17.add("버섯");
    ingredientlist17.add("소금");
    ingredientlist17.add("파");
    
    ingredientlist18.add("밥");
    ingredientlist18.add("버섯");
    ingredientlist18.add("마늘");
    ingredientlist18.add("양파");
    ingredientlist18.add("치즈");
    
    ingredientlist19.add("밥");
    ingredientlist19.add("김치");
    ingredientlist19.add("스팸");
    ingredientlist19.add("양파");
    ingredientlist19.add("파");
    ingredientlist19.add("계란");
    
    ingredientlist20.add("콩나물");
    ingredientlist20.add("김치");
    ingredientlist20.add("파");
    ingredientlist20.add("무");
    ingredientlist20.add("다시다");
    
    recipelist.add(new RecipeInfo("부대찌개", 5, ingredientlist1, a));
    recipelist.add(new RecipeInfo("연근조림", 4, ingredientlist2, b));
    recipelist.add(new RecipeInfo("낚지볶음", 4, ingredientlist3, c));
    recipelist.add(new RecipeInfo("배추김치", 3, ingredientlist4, d));
    recipelist.add(new RecipeInfo("된장찌개", 5, ingredientlist5, e));
    recipelist.add(new RecipeInfo("갈치조림", 5, ingredientlist6, f));
    recipelist.add(new RecipeInfo("홍합탕", 4, ingredientlist7, g));
    recipelist.add(new RecipeInfo("볶음밥", 7, ingredientlist8, h));
    recipelist.add(new RecipeInfo("미역초무침", 5, ingredientlist9, i));
    recipelist.add(new RecipeInfo("제육볶음", 10, ingredientlist10,j));
    recipelist.add(new RecipeInfo("닭개장", 10, ingredientlist11,k));
    recipelist.add(new RecipeInfo("육개장", 10, ingredientlist12,l));
    recipelist.add(new RecipeInfo("스크램블", 5, ingredientlist13,m));
    recipelist.add(new RecipeInfo("치즈밥", 6, ingredientlist14, n));
    recipelist.add(new RecipeInfo("베이컨볶음밥", 6, ingredientlist15, o));
    recipelist.add(new RecipeInfo("참치마요", 6, ingredientlist16, p));
    recipelist.add(new RecipeInfo("고추참치달걀말이", 5, ingredientlist17, q));
    recipelist.add(new RecipeInfo("버섯리조또", 5, ingredientlist18, r));
    recipelist.add(new RecipeInfo("스팸김치덮밥", 6, ingredientlist19, s));
    recipelist.add(new RecipeInfo("콩나물국", 5, ingredientlist20, t));

    
  }

  public void initialize(SearchRecipe hashmap){
//    this.hashmap = hashmap;
	  hashmap.setRecipeNameInHashmap(1, "부대찌개");
	    hashmap.setRecipeNameInHashmap(2, "연근조림");
	    hashmap.setRecipeNameInHashmap(3, "낚지볶음");
	    hashmap.setRecipeNameInHashmap(4, "배추김치");
	    hashmap.setRecipeNameInHashmap(5, "된장찌개");
	    hashmap.setRecipeNameInHashmap(6, "갈치조림");
	    hashmap.setRecipeNameInHashmap(7, "홍합탕");
	    hashmap.setRecipeNameInHashmap(8, "볶음밥");
	    hashmap.setRecipeNameInHashmap(9, "미역초무침");
	    hashmap.setRecipeNameInHashmap(10, "제육볶음");
	    hashmap.setRecipeNameInHashmap(11, "닭개장");
	    hashmap.setRecipeNameInHashmap(12, "육개장");
	    hashmap.setRecipeNameInHashmap(13, "스크램블");
	    hashmap.setRecipeNameInHashmap(14, "치즈밥");
	    hashmap.setRecipeNameInHashmap(15, "베이컨볶음밥");
	    hashmap.setRecipeNameInHashmap(16, "참치마요");
	    hashmap.setRecipeNameInHashmap(17, "고추참치달걀말이");
	    hashmap.setRecipeNameInHashmap(18, "버섯리조또");
	    hashmap.setRecipeNameInHashmap(19, "스팸김치덮밥");
	    hashmap.setRecipeNameInHashmap(20, "콩나물국");
  }
  
  // selectlist와 recipelist의 재료 일치를 비교하고 새로운 배열을 만들어 리턴.
  public Vector<RecipeInfo> search(Vector<IngredientInfo> selectlist){
    for(int i = 0; i < recipelist.size(); i++){ // 이전에 검색된 카운트 초기화
      recipelist.get(i).setCount(0);
    }
    
    int k = 0;
    Vector<RecipeInfo> templist = new Vector<RecipeInfo>();
    System.out.println("선택하신 재료 수는 : " + selectlist.size());
    System.out.println("전체 레시피DB 갯수는 : " + recipelist.size());
    for(int i = 0; i < selectlist.size(); i++){
      for(int j = 0; j < recipelist.size(); j++){
        for(k = 0; k < recipelist.get(j).getIngredient().size(); k++){
          //System.out.println(recipelist.get(j).getIngredient().size());          
          if(selectlist.get(i).getIngredientName().equals(recipelist.get(j).getIngredient().get(k))){
            if(recipelist.get(j).getCount() == 0){ // 일치하고 아직 선택된적이 없으면 해당 recipe를 templist에 추가
              templist.add((recipelist.get(j))); 
              System.out.println("일치 레시피 명 : " + recipelist.get(j).getRecipeName() + ",  일치 재료 명" + " : " + recipelist.get(j).getIngredient().get(k));
            }
            recipelist.get(j).countUp(); // 해당 recipe의 count++
          }
        }
        k = 0;
      }
    }
//    for(int a = 0; a < recipelist.size(); a++){ // test
//      System.out.println(a + "번째 레시피의 count : " + recipelist.get(a).getCount());
//    }
    return resultlist = templist; // 최종 resultlist를 새로 만들어진 templist로 교체
  }
  
  public int getLikelist(){ // 좋아요가 1이상인 list에 레시피인포 생성
    // test
     recipelist.get(0).setLike(4); 
     recipelist.get(1).setLike(5);
     recipelist.get(2).setLike(1);
     recipelist.get(3).setLike(7);
     recipelist.get(4).setLike(3);
     recipelist.get(5).setLike(10);
     recipelist.get(6).setLike(6);
     recipelist.get(7).setLike(16);
     recipelist.get(8).setLike(11);
     recipelist.get(9).setLike(9);
     recipelist.get(10).setLike(12);
     recipelist.get(11).setLike(0);
     
     
     System.out.println("recipelist size print : " + recipelist.size());
     
     this.likelist = new Vector <RecipeInfo>(); 
     
     for(int x = 0; x < recipelist.size(); x++){
        if(recipelist.get(x).getLike()!=0){ // list에 좋아요가 0이 아닌 리스트를 넣는다
           likelist.add(recipelist.get(x));
           System.out.println("likelist "+ x + " print : " + likelist.size());
        }
     }
     return likelist.size(); // 생성된 리스트의 컴포넌트 수를 반환
  }
  
  public Vector<RecipeInfo> sortLike(JTable table){
    getLikelist(); // 테스트용
    quickSort(likelist, 0, likelist.size()-1 );
    return likelist;

 }
  /*
  void bubbleSort(Vector<RecipeInfo> likelist) {

       int n = likelist.size();
       Vector<RecipeInfo> temp = new Vector<RecipeInfo>();

       for (int i = 0; i < n-1; i++) {
           for (int j = 1; j < (n - i); j++) {

               if (likelist.get(j-1).getLike() < likelist.get(j).getLike()) {
                  temp.add(0, likelist.get(j-1));
                  likelist.set(j-1, likelist.get(j));
                  likelist.set(j, temp.get(0));
               }

           }
       }
   }
  
  */
  
  
  int partition(Vector<RecipeInfo> likelist, int left, int right)
  {
        int i = left, j = right;
        int middle = left + (right - left) /2;
        Vector<RecipeInfo> temp = new Vector<RecipeInfo>();
        int pivot = likelist.get(middle).getLike();
       
        while (i <= j) {
              for (;likelist.get(i).getLike() > pivot;)
                    i++;
              for (;likelist.get(j).getLike() < pivot;)
                    j--;
              if (i <= j) {
                 temp.add(0, likelist.get(i));
                 likelist.set(i, likelist.get(j));
                 likelist.set(j, temp.get(0));
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

  
  
 
 }
