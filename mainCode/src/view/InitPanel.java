package view;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

import javax.swing.*;
import javax.swing.border.*;

import control.*;
import entity.*;
import view.InitPanel.ButtonListener.*;
   
@SuppressWarnings("serial")
public class InitPanel extends JFrame{
JFrame frame = this;
  SearchRecipeManager serchRecipeManager = new SearchRecipeManager();
  Container con = getContentPane();
  
//  SearchRecipe hashmap = new SearchRecipe();
//  Ingredient ingredient;
//  Recipe recipe;
  
  JLabel titlelabel = new JLabel("JESSI:재료부터 시작하는 레시피");
  JPanel initPanel = new JPanel(); // 제일 큰거
  JPanel mainPanel = new JPanel(); // 왼쪽
  JPanel rightPanel = new JPanel(); // 오른쪽
  JPanel pastePanel = new JPanel(); // 장류
  JPanel meatPanel = new JPanel(); // 고기류
  JPanel seafoodPanel = new JPanel(); // 해산물
  JPanel vagetablePanel = new JPanel(); // 채소류
  JPanel sortButtonPanel = new JPanel(); // 오른쪽 위의 버튼들
  JPanel saucePanel = new JPanel(); // 조미료
  JPanel herbPanel = new JPanel(); // 나물류
  JPanel leftPanel = new JPanel(); // 왼쪽 + 선택완료
  JPanel selectPanel = new JPanel(); // 재료 정리
  
  JButton selectButton = new JButton("선택완료");
  JButton accuracyButton  = new JButton("정확도순");
  JButton alphButton = new JButton("가나다순");
  JButton likeButton = new JButton("좋아요순");
  JButton searchButton = new JButton("검색");
  JTextField serchTextField = new JTextField(10);
  
  String colName[] = {"순번", "레시피 이름", "정확도", "좋아요 수"};
  
  private ButtonListener buttonListener;
  private SearchButtonListener searchButtonListener;
  
  public JCheckBox pig;
  public JCheckBox beef;
  public JCheckBox chicken;
  public JCheckBox gochujang;
  public JCheckBox soysauce;
  public JCheckBox doenjang;
  public JCheckBox eggplant;
  public JCheckBox mushroom;
  public JCheckBox carrot;
  public JCheckBox pumpkin;
  public JCheckBox paprika;
  public JCheckBox garlic;
  public JCheckBox onion;
  public JCheckBox chili;
  public JCheckBox ginger;
  public JCheckBox scallion;
  public JCheckBox ChubMackerel;
  public JCheckBox seaweed;
  public JCheckBox mussel;
  public JCheckBox ManilaClam;
  public JCheckBox squid;
  public JCheckBox shrimp;
  public JCheckBox crab;
  public JCheckBox hairtail;
  public JCheckBox sugar;
  public JCheckBox salt;
  public JCheckBox pepper;
  public JCheckBox ChiliPowder;
  public JCheckBox StarchSyrup;
  public JCheckBox vinegar;
  public JCheckBox OysterSauce;
  public JCheckBox BeanSprouts;
  public JCheckBox GreenBeanSprouts;
  public JCheckBox bracken;
  public JCheckBox spinach;

  public IngredientView ingredientView;
  
  public InitPanel() throws IOException{
    this.setTitle("JESSI");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    TypeView typeView = new TypeView();
    typeView.getList();
    IngredientView ingredientView = new IngredientView();
    ingredientView.getList();
    ingredientView.clearSelectlist(); // 기존 selectlist.txt 초기화
    RecipeView recipeView = new RecipeView();
    
    buttonListener = new ButtonListener(ingredientView);
    searchButtonListener = new SearchButtonListener();
    
    initPanel.setLayout(new BorderLayout());
    initPanel.setSize(1000,700);
    titlelabel.setSize(500, 50);
    initPanel.add(titlelabel, BorderLayout.NORTH);
    initPanel.add(mainPanel, BorderLayout.CENTER);
        
    mainPanel.setLayout(new GridLayout(0, 2));
    mainPanel.add(leftPanel);
    mainPanel.add(rightPanel);
    
    meatPanel.setBorder(new TitledBorder(UIManager.getBorder("TitleBorder.border"), "육류", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0,0,0)));
    this.pig = new JCheckBox("돼지고기");
    this.beef = new JCheckBox("소고기");
    this.chicken = new JCheckBox("닭고기");
    
    meatPanel.add(pig);
    meatPanel.add(beef);
    meatPanel.add(chicken);
    
    pastePanel.setBorder(new TitledBorder(UIManager.getBorder("TitleBorder.border"), "장류", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0,0,0)));
    this.gochujang = new JCheckBox("고추장");
    this.soysauce= new JCheckBox("간장");
    this.doenjang = new JCheckBox("된장");
    
    pastePanel.add(gochujang);
    pastePanel.add(soysauce);
    pastePanel.add(doenjang);
    
    vagetablePanel.setBorder(new TitledBorder(UIManager.getBorder("TitleBorder.border"), "채소류", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0,0,0)));
    this.eggplant = new JCheckBox("가지");
    this.mushroom = new JCheckBox("버섯");
    this.carrot = new JCheckBox("당근");
    this.pumpkin = new JCheckBox("호박");
    this.paprika = new JCheckBox("파프리카");
    this.garlic = new JCheckBox("마늘");
    this.onion = new JCheckBox("양파");
    this.chili = new JCheckBox("고추");
    this.ginger = new JCheckBox("생강");
    this.scallion = new JCheckBox("파");
    
    vagetablePanel.add(eggplant);
    vagetablePanel.add(mushroom);
    vagetablePanel.add(carrot);
    vagetablePanel.add(pumpkin);
    vagetablePanel.add(paprika);
    vagetablePanel.add(garlic);
    vagetablePanel.add(onion);
    vagetablePanel.add(chili);
    vagetablePanel.add(ginger);
    vagetablePanel.add(scallion);
    
    seafoodPanel.setBorder(new TitledBorder(UIManager.getBorder("TitleBorder.border"), "해산물", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0,0,0)));
    this.ChubMackerel = new JCheckBox("고등어");
    this.seaweed = new JCheckBox("미역");
    this.mussel = new JCheckBox("홍합");
    this.ManilaClam = new JCheckBox("바지락");
    this.squid = new JCheckBox("오징어");
    this.shrimp = new JCheckBox("새우");
    this.crab = new JCheckBox("꽃게");
    this.hairtail = new JCheckBox("갈치");
    
    seafoodPanel.add(ChubMackerel);
    seafoodPanel.add(seaweed);
    seafoodPanel.add(mussel);
    seafoodPanel.add(ManilaClam);
    seafoodPanel.add(squid);
    seafoodPanel.add(shrimp);
    seafoodPanel.add(crab);
    seafoodPanel.add(hairtail);
    
    saucePanel.setBorder(new TitledBorder(UIManager.getBorder("TitleBorder.border"), "조미료", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0,0,0)));
    this.sugar = new JCheckBox("설탕");
    this.salt = new JCheckBox("소금");
    this.pepper = new JCheckBox("후추");
    this.ChiliPowder = new JCheckBox("고춧가루");
    this.StarchSyrup = new JCheckBox("물엿");
    this.vinegar = new JCheckBox("식초");
    this.OysterSauce = new JCheckBox("굴소스");
    
    saucePanel.add(sugar);
    saucePanel.add(salt);
    saucePanel.add(pepper);
    saucePanel.add(ChiliPowder);
    saucePanel.add(StarchSyrup);
    saucePanel.add(vinegar);
    saucePanel.add(OysterSauce);
    
    herbPanel.setBorder(new TitledBorder(UIManager.getBorder("TitleBorder.border"), "나물류", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0,0,0)));
    this.BeanSprouts = new JCheckBox("콩나물");
    this.GreenBeanSprouts = new JCheckBox("숙주나물");
    this.bracken = new JCheckBox("고사리");
    this.spinach = new JCheckBox("시금치");
    
    herbPanel.add(BeanSprouts);
    herbPanel.add(GreenBeanSprouts);
    herbPanel.add(bracken);
    herbPanel.add(spinach);
    
    selectPanel.setLayout(new GridLayout(6,0));
    selectPanel.add(pastePanel);
    selectPanel.add(meatPanel);
    selectPanel.add(seafoodPanel);
    selectPanel.add(vagetablePanel);
    selectPanel.add(saucePanel);
    selectPanel.add(herbPanel);
    
    leftPanel.setLayout(new BorderLayout());
    leftPanel.add(selectPanel, BorderLayout.CENTER);
    leftPanel.add(selectButton, BorderLayout.SOUTH);
    
    rightPanel.setLayout(new BorderLayout());
    sortButtonPanel.setLayout(new FlowLayout());

    selectButton.addActionListener(buttonListener);
    searchButton.addActionListener(searchButtonListener);
    
    rightPanel.add(sortButtonPanel, BorderLayout.NORTH);
    
    sortButtonPanel.add(accuracyButton);
    sortButtonPanel.add(alphButton);
    sortButtonPanel.add(likeButton);
    sortButtonPanel.add(serchTextField);
    sortButtonPanel.add(searchButton);
    
     JTable table;
     JScrollPane scroll; // 테이블 위에 열 라벨을 넣어주자~ scroll
     String[] [] data; // 3명의 정보를 담을 2차원 배열을 생성한다.
     String[] title = {"번호","레시피 이름","정확도 순","좋아요 순"}; //컬럼의 제목 정보를 표현할 1차원 배열
     
      data = new String[35][4];
      
      table=new JTable(data,title); // table=new JTable(데이터-2차원배열, 컬럼배열);
      scroll = new JScrollPane(table);
      rightPanel.add(scroll);

      serchRecipeManager.setJTable(table);
      con.add(initPanel); 
    
    setVisible(true);
    setSize(1000,700);
    
    
  }
  
  public class ButtonListener implements ActionListener{
    IngredientView ingredientView;
    
    public ButtonListener(IngredientView ingredientView){
      this.ingredientView = ingredientView;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {  
      ingredientView.setSelectlist(pig);
      ingredientView.setSelectlist(beef);
      ingredientView.setSelectlist(chicken);
      ingredientView.setSelectlist(gochujang);
      ingredientView.setSelectlist(soysauce);
      ingredientView.setSelectlist(doenjang);
      ingredientView.setSelectlist(eggplant);
      ingredientView.setSelectlist(mushroom);
      ingredientView.setSelectlist(carrot);
      ingredientView.setSelectlist(pumpkin);
      ingredientView.setSelectlist(paprika);
      ingredientView.setSelectlist(garlic);
      ingredientView.setSelectlist(onion);
      ingredientView.setSelectlist(chili);
      ingredientView.setSelectlist(ginger);
      ingredientView.setSelectlist(scallion);
      ingredientView.setSelectlist(ChubMackerel);
      ingredientView.setSelectlist(seaweed);
      ingredientView.setSelectlist(mussel);
      ingredientView.setSelectlist(ManilaClam);
      ingredientView.setSelectlist(squid);
      ingredientView.setSelectlist(shrimp);
      ingredientView.setSelectlist(crab);
      ingredientView.setSelectlist(hairtail);
      ingredientView.setSelectlist(sugar);
      ingredientView.setSelectlist(salt);
      ingredientView.setSelectlist(pepper);
      ingredientView.setSelectlist(ChiliPowder);
      ingredientView.setSelectlist(StarchSyrup);
      ingredientView.setSelectlist(vinegar);
      ingredientView.setSelectlist(OysterSauce);
      ingredientView.setSelectlist(BeanSprouts);
      ingredientView.setSelectlist(GreenBeanSprouts);
      ingredientView.setSelectlist(bracken);
      ingredientView.setSelectlist(spinach);
    } 
  }
  public class SearchButtonListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
      serchRecipeManager.initialize();
//      recipe = new Recipe();
//      recipe.initialize(hashmap);
//      hashmap.getRecipeNameInHashmap(serchTextField.getText());
      serchRecipeManager.getHashmap().getRecipeNameInHashmap(serchTextField.getText(),  serchRecipeManager.getJTable(),  frame );
   
      }
  }
}

