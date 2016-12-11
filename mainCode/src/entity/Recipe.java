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

  String a = "<html><br><br>부대찌개<br>" + "조리법<br>" + "<br><br>1. 냄비에 육수 재료를 넣고 한소끔 끓여 멸치 육수 3컵(600ml)을 만든다.<br>"
      + "<br><br>2. 볼에 양념 재료를 넣고 골고루 섞는다.<br>"
      + "<br><br>3. 통조림 햄은 0.5cm 두깨로 썰고 소시지는 어슷 썬다. 다진 돼지고기는 청주 1큰술과 후춧가루 약간에 버무려 재운다.<br>"
      + "<br><br>4. 대파는 어슷 썰고 양파는 채 썬다.<br>" + "<br><br>5. 냄비에 햄, 소시지, 다진 돼지고기, 김치, 떡국떡, 양파, 대파, 삶은 마카로니, 통조림 콩을 넣는다."
      + "<br>(떡국떡은 물에 담가 두었다가 넣는다.)<br>" + "<br><br>6. 양념과 육수를 넣고 끓인다.(간이 부족하면 소금으로 간한다.)<br></html>";
  String b = "<html><br><br>연근조림<br><br><br>1. 연근 껍질은 벗기고 0.5cm 두께로 썬다. 냄비에 물 1컵(200ml), 식초, 연근을 넣고 연근이 반쯤 익을 때까지 데친다."
      + "<br> 체에 밭쳐 물기를 뺀다.(연근을 식촛물에 데처내어 아린맛을 없애고 조리는 시간을 줄일 수 있다.)<br>"
      + "<br><br>2. 냄비에 물 1컵(200ml)과 양념 재료, 연근을 넣고 조린다."
      + "<br><br><br>3. 국물이 거의 없어질 때까지 조린 뒤 불을 끄고 참기름과 통깨를 넣고 버무린다.</html>";
  String c = "<html><br><br>낙지볶음<br><br><br>1. 낙지는 가위로 머리 한쪽을 잘라 뒤집어 내장을 떼어낸다. 머리와 다리를 연결하는 부분의 눈을 자르고 다리를 뒤집어 안쪽에 있는 뼈를 뺀다."
      + "<br> 볼에 낙지와 밀가루를 넣고 바락바락 주물러 씻은 후 흐르는 물에 깨끗이 헹군다." + "<br> 끓는 물에 넣어 살짝 데친 후 체에 밭쳐 물기를 뺀다."
      + "<br><br>2. 데친 낙지는 5cm 길이로 썬다.<br><br><br>3. 양배추, 양파, 당근은 5cm 길이로 가늘게 채 썰고, 쪽파는 5cm 길이로 썬다. 홍고추는 어슷 썬다.<br>"
      + "<br><br>4. 볼에 양념 재료를 넣고 골고루 섞는다.<br><br><br>5. 달군 팬에 식용유를 두르고 양배추, 당근, 양파, 홍고추, 쪽파를 넣고 센 불에 재빨리 볶는다.<br><br><br>6. 낙지와 양념을 넣고 중간 불에서 재빨리 볶는다."
      + "<br><br><br>7. 양념장을 넣어 골고루 섞어가며 볶는다.</html>",
      d = "<html><br><br>배추김치<br><br><br>1. 배추는 밑동을 자르고 겉잎을 떼어낸다. 배추 밑동이 위를 향하도록 세우고 밑동 부분의 1/3지점까지 칼집을 내어 양손으로 반을 쪼갠다. "
          + "<br>크기에 따라 2~4등분 한다."
          + "<br><br><br>2. 큰 볼에 배추를 담고 굵은 소금을 켜켜이 뿌린다. 미지근한 물 4~5컵을 부어 5~6시간 동안 중간중간 뒤집어가며 절인다."
          + "<br> 떼어낸 겉잎을 함께 절인다." + "<br><br><br>3. 절인 배추는 찬물에 2~3번 헹군 후 30분 시간 체에 밭쳐 물기르 뺀다."
          + "<br><br><br>4. 무는 껍질을 벗긴 후" + ".5cm 두께로 채 썬다. 쪽파, 미나리, 갓은 깨끗이 씻어 체에 밭쳐 물기를 뺀 후 3cm 길이로 썬다."
          + "<br><br><br>5. 새우젓은 곱게 다진다." + "<br><br><br>6. 볼에 무와 고춧가루, 소금을 넣고 버무려 고춧물을 들인다."
          + "<br><br><br>7. 06에 양념 재료를 넣고 골고루 버무린 후 미나리, 갓, 쪽파를 넣고 풋내가 나지 않도록 가볍게 버무린다."
          + "<br><br><br>8. 양념 볼 위에 절인 배추김치를 올리고 겉잎부터 소를 바르듯이 넣고 켜켜이 펴 바른다."
          + "<br><br><br>9. 김치소가 쏟아지지 않도록 잎을 모아 잡고 절인 겉잎으로 감싼다."
          + "<br> 저장용기에 차곡차곡 담고 남은 양념에 소금과 물 1컵을 담고 양념을 씻어내 김치 위에 붓는다. " + "<br>실온에서 하룻동안 숙성한 후 냉장실에서 익혀 먹는다.</html>",
      e = "<html><br><br>된장찌개" + "<br><br><br>1. 냄비에 국물용 멸치와 물을 넣고 한소끔 끓여 체에 걸러 멸치 육수를 2컵(400ml)을 만든다."
          + "<br>(국물용 멸치의 머리와 내장은 떼어내면 멸치 육수의 쓴맛이 없어진다.) 무는 사방 3cm 크기로 납작하게 썬다"
          + "<br>. 두부는 사방 2cm 크기로 깍뚝 썰고 애호박은 0.5cm 두께로 4등분한다. 청양고추와 대파는 송송 썬다. " + "<br>팽이버섯은 밑동을 제거한 후 가닥가닥 뜯는다."
          + "<br><br><br>2. 냄비에 멸치 국물을 붓고 체에 된장을 올려 풀어준다." + "<br><br><br>3. 무를 넣고 푹 익도록 끓인다."
          + "<br><br><br>4. 대파, 버섯, 고춧가루를 넣고 한소끔 끓인다.(중간 중간에 떠오르는 거품을 걷어낸다.)</html>",
      f = "<html><br><br>갈치조림" + "<br><br><br>1. 갈치는 지느러미와 내장을 제거하고 4~5토막으로 썬다. 칼로 비늘을 긁어 흐르는 물에 헹군다. "
          + "<br>대파, 마늘, 생강은 가늘게 채 썬다." + "<br><br><br>2. 작은 볼에 양념 재료와 01의 대파, 마늘, 생강을 넣어 골고루 섞는다."
          + "<br><br><br>3. 무는 3×3cm 크기로 납작하게 썬다. 냄비에 무를 깐다."
          + "<br><br><br>4. 무 위에 02의 양념 1/2분량을 붓고 그위에 갈치를 올린다. 남은 양념 1/2분량을 붓는다."
          + "<br><br><br>5. 뚜껑을 덮고 센 불에서 바글바글 끓어오르면 뚜껑을 열고 약한 불로 줄여 양념을 끼얹으며 조린다.</html>",
      g = "<html><br><br>홍합탕" + "<br><br><br>1. 홍합은 껍데기에 붙은 이물질을 제거하고 깨끗이 씻는다."
          + "<br><br><br>2. 무는 3cm 길이의 사각형 모양으로 썰고 붉은 고추, 풋고추는 어슷썬다." + "<br><br><br>3. 향신 채소는 다듬어 깨끗이 씻어 조리용 망에 담는다."
          + "<br><br><br>4. 냄비에 물을 붓고 홍합, 무, 향신 채소를 넣어 푹 끓인다."
          + "<br><br><br>5. 홍합 국물이 우러나면 향신 채소는 빼고 붉은 고추, 풋고추를 넣어 소금으로 간한다.</html>",
      h = "<html><br><br>볶음밥" + "<br><br><br>1. 당근은 곱게 채썰어 잘게 다진다." + "<br><br><br>2. 파프리카는 씨를 빼고 0.5㎝ 크기로 잘게 썬다."
          + "<br><br><br>3. 양파는 곱게 다진다." + "<br><br><br>4. 준비된 모든 야채를 넣고 팬에 기름을 두르고 소금 1작은술을 넣고 볶은 후 밥을 섞어가면서 볶는다."
          + "<br><br><br>5. 볶은 밥을 준비된 접시에 담고 밥 주위를 옥수수로 장식한다.</html>",
      i = "<html><br><br>미역초무침" + "<br><br><br>1. 마른미역을 미지근한 물에 담가 10분 이상 충분히 불린다."
          + "<br><br><br>2. 불린 미역을 체에 밭쳐 물기를 뺀 다음 손으로 물기를 꼭 짜고 한입크기로 썬다."
          + "<br><br><br>3. 오이는 0.2cm 두께로 둥글게 썬 뒤 소금을 넣고 버무려 5분 정도 절인다."
          + "<br><br><br>4. 절인 오이를 찬물에 가볍게 헹구고 체에 밭쳐 물기를 뺀 다음 손으로 물기를 꼭 짠다." + "<br><br><br>5. 볼에 분량의 양념 재료를 섞어 준비한다."
          + "<br><br><br>6. 볼에 미역, 오이, 양념을 넣고 고루 버무린 다음 그릇에 담아 완성한다.</html>",
      j = "<html><br><br>제육볶음" + "<br><br><br>1. 돼지고기는 3cm두께로 썰어 청주, 소금, 후춧가루를 10분간 재운다."
          + "<br><br><br>2. 01에 양념 재료를 넣고 조물조물 버무려 20분간 더 재운다."
          + "<br><br><br>3. 양배추, 당근, 양파는 사방 3cm 크기로 썰고 대파, 청양고추, 홍고추는 어슷 썬다."
          + "<br><br><br>4. 달군 팬에 식용유를 두르고 재워둔 돼지고기를 넣고 볶다가 양배추, 당근, 양파, " + "<br>대파, 청양고추, 홍고추를 넣고 볶는다.</html>",
      k = "<html><br><br>닭개장" + "<br>1. 통닭을 핏줄과 내장을 말끔히 떼어 내고 끓이다가 도중에 "
          + "<br>파, 마늘, 생강을 넣어 뼈에서 살이 쉽게 떨어질 때까지 2시간 이상 삶는다." + "<br>2. 닭이 물러지면 건져서 뼈를 발라내고 살을 찢어 놓고, 국물은 식혀서 기름을 걷어낸다."
          + "<br>3. 파는 7cm 길이로 대강 가르고, 숙주는 씻어서 각각 끓는 물에 데쳐 내고, 삶은 고사리는 단단한 부분을 다듬는다."
          + "<br>4. (가)의 양념 중 먼저 고춧가루만 그릇에 담고 기름을 조금씩 넣으면서 " + "<br>고루 저어서 잘 섞이면 나머지 조미료를 모두 넣고 고루 섞는다."
          + "<br>5. 닭 국물에 고추장을 풀어 끓이다가 닭고기와 데친 채소를 ④의 양념으로 고루 무쳐서 넣고 끓이다가"
          + "<br> 소금으로 간을 맞춘다. 달걀을 풀어 살짝 익혀도 맛있다.</html>",
      l = "<html><br><br>육개장" + "<br>1. 쇠고기(양지머리)는 덩어리째 냉수에 담가 핏물을 빼고 두꺼운 솥에 물을 부어 "
          + "<br>펄펄 끓으면 고기와 무를 넣고 끓어 오르면 불을 줄이고 고기가 무르게 익을 때까지 은근히 끓인다."
          + "<br>2. 쇠고기가 충분히 무르면 건져내어 결대로 찢어두고 무는 납작납작하게 썬다." + "<br>3. 국물 위의 뜨는 기름을 제거하고 육수는 면보에 걸러둔다."
          + "<br>4. 대파는 8㎝ 길이로 토막 내어 끓는 물에 살짝 데쳐 내어 길이로 찢어둔다."
          + "<br>5. 숙주는 끓는 물에 데치고, 삶아서 부드럽게 불린 고사리와 토란대는 7㎝ 정도로 잘라서 굵으면 세로로 찢어 둔다."
          + "<br>6. 쇠고기, 숙주, 대파, 고사리, 토란대에 밑양념을 하여 3의 국물에 넣어 맛이 " + "<br>어우러지도록 끓인 다음 간을 맞춘다.</html>",
      m = "<html><br><br>스크램블" + "<br><br><br>1. 볼에 달걀, 우유, 소금을 넣고 젓가락으로 잘 풀어 달걀물을 만든다."
          + "<br><br><br>2. 달군 팬에 식용유를 두르고 달걀물을 붓는다. " + "<br>가장자리가 익기 시작하면 젓가락으로 둥글게 저어가며 익힌다.</html>",
      n = "<html><br><br>치즈밥" + "<br>1. 밥에 기름을 뺀 참치와 옥수수 통조림, 자른 양파을 넣어준다." + "<br>2. 케첩과 굴소스를 넣고 섞는다."
          + "<br>3. 냄비나 뚝배기에 식용류를 살짝 바른다." + "<br>4. 비벼진 밥을 담고 치즈를 위에 뿌린다." + "<br>5. 3~5분정도 데워준다.</html>",
      o = "<html><br><br>베이컨 볶음밥" + "<br><br><br>1. 베이컨은 1×7cm 길이로 자른다." + "<br><br><br>2. 피망은 4cm 길이로 채썬다."
          + "<br><br><br>3. 파르메산 치즈는 칼로 얇게 썬다." + "<br><br><br>4. 팬을 달군 후 베이컨을 굽는다."
          + "<br><br><br>5. 베이컨을 구운 팬에 밥을 넣어 볶아 둔다." + "<br><br><br>6. 토마토 소스를 넣어 볶는다."
          + "<br><br><br>7. 밥을 넣어 볶으면서 간을 하고 베이컨, 치즈를 넣는다. 간은 간장으로 한다.</html>",
      p = "<html><br><br>참치마요" + "<br>1. 닭고기를 볶는다." + "<br>2. 채소는 식용유 두른 팬에 볶다 양념 넣어서 볶아주세요. 센불에서 빠르게 살짝만 볶습니다."
          + "<br>3. 볶음밥은 먼저 식용유 두른 팬에 소금 약간 넣고 섞은 계란을 넣어 볶아 살짝 익혀 둔 뒤 덜어 내고 식용유와" + "<br> 대파를 넣어 향을 낸 후 밥을 넣어 볶습니다."
          + "<br>4. 양념을 넣어 볶다 소금, 후추, 볶은 계란을 넣고 고루 섞은 후 다른 재료와 함께 접시에 담아 냅니다." + "<br>5. 위에 마요네즈를 뿌려준다</html>",
      q = "<html><br><br>고추참치달걀말이" + "<br>1. 계란을 풀어 소금간을 한다." + "<br>2. 계란물을 프라이팬에 약간 붓는다. "
          + "<br>3. 적당히 익으면 계란을 말고 다시 계란물을 붓는다." + "<br>4. 두번정도 부은 후 고추참치를 계란 위에 얹는다."
          + "<br>5. 계란을 말면 고추참치 계란말이!!</html>",
      r = "<html><br><br>버섯리조또" + "<br>1. 버섯을 센 불에 볶는다." + "<br>2. 다른 팬에 마늘과 양파를 넣고 볶는다."
          + "<br>3. 양파가 투명해지면 쌀을 넣고 볶는다." + "<br>4. 쌀이 어느정도 익으면 치즈를 넣는다." + "<br>5. 버섯을 넣고 소금, 후추로 간을 한다."
          + "<br>6. 뚜껑을 덮어 2~3분간 기다린다.</html>",
      s = "<html><br><br>스팸김치덮밥" + "<br><br><br>1. 김치는 1cm정도의 폭으로 네모지게 썬다."
          + "<br><br><br>2. 스팸도 김치와 비슷한 크기로 썰고 양파도 같은 크기로 썬다. 대파는 송송 썰어 굵게 다진다."
          + "<br><br><br>3. 중불로 달군 팬에 식용유를 두른 뒤 대파를 넣고 볶다가 김치를 넣고 1분간 볶다가 센불로 올려 스팸과 양파를 넣고 1분간 더 볶는다."
          + "<br><br><br>4. 물, 고추장, 설탕을 넣는다." + "<br><br><br>5. 그릇에 밥을 담고 스팸김치볶음을 얹어 완성한다.</html>",
      t = "<html><br><br>콩나물국" + "<br><br><br>1. 냄비에 국물용 멸치를 넣고 한소끔 끓여 멸치 육수를 7컵(1,400ml) 만든다. 대파는 어슷 썬다."
          + "<br><br><br>2. 01에 콩나물을 넣고 뚜껑을 덮어 콩나물이 익을 때까지 끓인다."
          + "<br><br><br>3. 뚜껑을 열고 대파, 마늘, 고춧가루를 넣고 끓인다.(기호에 따라 고춧가루 양을 가감한다.)" + "<br><br><br>4. 소금으로 간한다.</html>";

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
    recipelist.add(new RecipeInfo("제육볶음", 10, ingredientlist10, j));
    recipelist.add(new RecipeInfo("닭개장", 10, ingredientlist11, k));
    recipelist.add(new RecipeInfo("육개장", 10, ingredientlist12, l));
    recipelist.add(new RecipeInfo("스크램블", 5, ingredientlist13, m));
    recipelist.add(new RecipeInfo("치즈밥", 6, ingredientlist14, n));
    recipelist.add(new RecipeInfo("베이컨볶음밥", 6, ingredientlist15, o));
    recipelist.add(new RecipeInfo("참치마요", 6, ingredientlist16, p));
    recipelist.add(new RecipeInfo("고추참치달걀말이", 5, ingredientlist17, q));
    recipelist.add(new RecipeInfo("버섯리조또", 5, ingredientlist18, r));
    recipelist.add(new RecipeInfo("스팸김치덮밥", 6, ingredientlist19, s));
    recipelist.add(new RecipeInfo("콩나물국", 5, ingredientlist20, t));

  }

  public void initialize(SearchRecipe hashmap) {
    // this.hashmap = hashmap;
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
  public Vector<RecipeInfo> search(Vector<IngredientInfo> selectlist) {
    for (int i = 0; i < recipelist.size(); i++) { // 이전에 검색된 카운트 초기화
      recipelist.get(i).setCount(0);
    }

    int k = 0;
    Vector<RecipeInfo> templist = new Vector<RecipeInfo>();
    System.out.println("선택하신 재료 수는 : " + selectlist.size());
    System.out.println("전체 레시피DB 갯수는 : " + recipelist.size());
    for (int i = 0; i < selectlist.size(); i++) {
      for (int j = 0; j < recipelist.size(); j++) {
        for (k = 0; k < recipelist.get(j).getIngredient().size(); k++) {
          // System.out.println(recipelist.get(j).getIngredient().size());
          if (selectlist.get(i).getIngredientName().equals(recipelist.get(j).getIngredient().get(k))) {
            if (recipelist.get(j).getCount() == 0) { // 일치하고 아직 선택된적이 없으면 해당
                                                     // recipe를 templist에 추가
              templist.add((recipelist.get(j)));
              System.out.println("일치 레시피 명 : " + recipelist.get(j).getRecipeName() + ",  일치 재료 명" + " : "
                  + recipelist.get(j).getIngredient().get(k));
            }
            recipelist.get(j).countUp(); // 해당 recipe의 count++
          }
        }
        k = 0;
      }
    }
    return resultlist = templist; // 최종 resultlist를 새로 만들어진 templist로 교체
  }

  // HashTable search
  public Vector<RecipeInfo> Hsearch(String recipeName) {
    Vector<RecipeInfo> templist = new Vector<RecipeInfo>();

    for (int j = 0; j < recipelist.size(); j++) {
      if (recipeName.equals(recipelist.get(j).getRecipeName())) {
        templist.add((recipelist.get(j)));
        System.out.println("!!");
      }
    }
    return templist;

  }

  public Vector<RecipeInfo> nameSort(Vector<RecipeInfo> resultlist) {

    int result = 0;
    Vector<RecipeInfo> namelist = resultlist;

    for (int i = 0; i < namelist.size() - 1; i++) {
      for (int j = i + 1; j < namelist.size(); j++) {
        result = namelist.get(i).getRecipeName().compareTo(namelist.get(j).getRecipeName());
        // System.out.println(result);

        if (result > 0) {
          Vector<RecipeInfo> temp = new Vector<RecipeInfo>();
          temp.add(0, namelist.get(i));
          namelist.set(i, namelist.get(j));
          namelist.set(j, temp.get(0));

          for (int x = 0; x < namelist.size(); x++) {
            // System.out.println(namelist.get(x).getRecipeName());
          }
        }
      }
    }

    return namelist;
  }

  // for likeSort
  void quickSort(Vector<RecipeInfo> likelist, int left, int right) {
    int index = partition(likelist, left, right);
    if (left < index - 1)
      quickSort(likelist, left, index - 1);
    if (index < right)
      quickSort(likelist, index, right);
  }

  // for likeSort
  int partition(Vector<RecipeInfo> likelist, int left, int right) {
    int i = left, j = right;
    int middle = left + (right - left) / 2;
    Vector<RecipeInfo> temp = new Vector<RecipeInfo>();
    int pivot = likelist.get(middle).getLike();

    while (i <= j) {
      for (; likelist.get(i).getLike() > pivot;)
        i++;
      for (; likelist.get(j).getLike() < pivot;)
        j--;
      if (i <= j) {
        temp.add(0, likelist.get(i));
        likelist.set(i, likelist.get(j));
        likelist.set(j, temp.get(0));
        i++;
        j--;
      }
    }

    return i;
  }
  
  // likeSort
  public Vector<RecipeInfo> likeSort(Vector<RecipeInfo> resultlist) {
    likelist = resultlist;
    quickSort(this.likelist, 0, this.likelist.size() - 1);
    return this.likelist;
  }
  // accuracySort
  public Vector<RecipeInfo> accuracySort(Vector<RecipeInfo> resultlist) {
    Vector<RecipeInfo> accuracylist = resultlist;
    
    for (int i = 0; i < accuracylist.size() - 1; i++) {
      for (int j = i + 1; j < accuracylist.size(); j++) {
        if( (((float)(resultlist.get(i).getCount()) / (float)(resultlist.get(i).getTotal())) * 100) <
              (((float)(resultlist.get(j).getCount()) / (float)(resultlist.get(j).getTotal())) * 100) ){
          Vector<RecipeInfo> temp = new Vector<RecipeInfo>();
          temp.add(0, accuracylist.get(i));
          accuracylist.set(i, accuracylist.get(j));
          accuracylist.set(j, temp.get(0));
        }
      }
    }
    return accuracylist;
  }

}
