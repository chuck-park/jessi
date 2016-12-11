package view;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

import javax.swing.*;
import javax.swing.border.*;

import control.*;
import entity.Recipe;
import valueObject.*;

@SuppressWarnings("serial")
public class InitPanel extends JFrame {

  Vector<RecipeInfo> resultlist;
  JFrame frame = this;
  SearchRecipeManager searchRecipeManager = new SearchRecipeManager();
  Container con = getContentPane();

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
  JButton accuracySortButton = new JButton("정확도순");
  JButton nameSortButton = new JButton("가나다순");
  JButton likeSortButton = new JButton("좋아요순");
  JButton searchButton = new JButton("검색");
  JTextField serchTextField = new JTextField(10);

  JTable table;
  String colName[] = { "순번", "레시피 이름", "정확도", "좋아요 수" };

  private SelectButtonListener selectButtonListener;
  private SearchButtonListener searchButtonListener;
  private NameSortButtonListener nameSortButtonListener;
  private LikeSortButtonListener likeSortButtonListener;

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
  public JCheckBox lotusRoot;
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

  public InitPanel() throws IOException {
    this.setTitle("JESSI");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    TypeView typeView = new TypeView();
    typeView.getList();
    IngredientView ingredientView = new IngredientView();
    ingredientView.getList();
    ingredientView.clearSelectlist(); // 기존 selectlist.txt 초기화
    RecipeView recipeView = new RecipeView();
    selectButtonListener = new SelectButtonListener(ingredientView, recipeView);
    nameSortButtonListener = new NameSortButtonListener(recipeView);
    likeSortButtonListener = new LikeSortButtonListener(recipeView);
    searchButtonListener = new SearchButtonListener();

    initPanel.setLayout(new BorderLayout());
    initPanel.setSize(1000, 700);
    titlelabel.setSize(500, 50);
    initPanel.add(titlelabel, BorderLayout.NORTH);
    initPanel.add(mainPanel, BorderLayout.CENTER);

    mainPanel.setLayout(new GridLayout(0, 2));
    mainPanel.add(leftPanel);
    mainPanel.add(rightPanel);

    meatPanel.setBorder(new TitledBorder(UIManager.getBorder("TitleBorder.border"), "육류", TitledBorder.LEADING,
        TitledBorder.TOP, null, new Color(0, 0, 0)));
    this.pig = new JCheckBox("돼지고기");
    this.beef = new JCheckBox("소고기");
    this.chicken = new JCheckBox("닭고기");

    meatPanel.add(pig);
    meatPanel.add(beef);
    meatPanel.add(chicken);

    pastePanel.setBorder(new TitledBorder(UIManager.getBorder("TitleBorder.border"), "장류", TitledBorder.LEADING,
        TitledBorder.TOP, null, new Color(0, 0, 0)));
    this.gochujang = new JCheckBox("고추장");
    this.soysauce = new JCheckBox("간장");
    this.doenjang = new JCheckBox("된장");

    pastePanel.add(gochujang);
    pastePanel.add(soysauce);
    pastePanel.add(doenjang);

    vagetablePanel.setBorder(new TitledBorder(UIManager.getBorder("TitleBorder.border"), "채소류", TitledBorder.LEADING,
        TitledBorder.TOP, null, new Color(0, 0, 0)));
    this.eggplant = new JCheckBox("가지");
    this.mushroom = new JCheckBox("버섯");
    this.carrot = new JCheckBox("당근");
    this.pumpkin = new JCheckBox("호박");
    this.paprika = new JCheckBox("파프리카");
    this.garlic = new JCheckBox("마늘");
    this.onion = new JCheckBox("양파");
    this.lotusRoot = new JCheckBox("연근");
    this.ginger = new JCheckBox("생강");
    this.scallion = new JCheckBox("파");

    vagetablePanel.add(eggplant);
    vagetablePanel.add(mushroom);
    vagetablePanel.add(carrot);
    vagetablePanel.add(pumpkin);
    vagetablePanel.add(paprika);
    vagetablePanel.add(garlic);
    vagetablePanel.add(onion);
    vagetablePanel.add(lotusRoot);
    vagetablePanel.add(ginger);
    vagetablePanel.add(scallion);

    seafoodPanel.setBorder(new TitledBorder(UIManager.getBorder("TitleBorder.border"), "해산물", TitledBorder.LEADING,
        TitledBorder.TOP, null, new Color(0, 0, 0)));
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

    saucePanel.setBorder(new TitledBorder(UIManager.getBorder("TitleBorder.border"), "조미료", TitledBorder.LEADING,
        TitledBorder.TOP, null, new Color(0, 0, 0)));
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

    herbPanel.setBorder(new TitledBorder(UIManager.getBorder("TitleBorder.border"), "나물류", TitledBorder.LEADING,
        TitledBorder.TOP, null, new Color(0, 0, 0)));
    this.BeanSprouts = new JCheckBox("콩나물");
    this.GreenBeanSprouts = new JCheckBox("숙주나물");
    this.bracken = new JCheckBox("고사리");
    this.spinach = new JCheckBox("시금치");

    herbPanel.add(BeanSprouts);
    herbPanel.add(GreenBeanSprouts);
    herbPanel.add(bracken);
    herbPanel.add(spinach);

    selectPanel.setLayout(new GridLayout(6, 0));
    selectPanel.add(pastePanel);
    selectPanel.add(meatPanel);
    selectPanel.add(seafoodPanel);
    selectPanel.add(vagetablePanel);
    selectPanel.add(saucePanel);
    selectPanel.add(herbPanel);

    leftPanel.setLayout(new BorderLayout());
    leftPanel.add(selectPanel, BorderLayout.CENTER);
    leftPanel.add(selectButton, BorderLayout.SOUTH); // 선택완료 버튼

    rightPanel.setLayout(new BorderLayout());
    sortButtonPanel.setLayout(new FlowLayout());
    
    // 각 버튼에 리스너 붙이기
    selectButton.addActionListener(selectButtonListener); 
    searchButton.addActionListener(searchButtonListener);
    accuracySortButton.addActionListener(selectButtonListener);
    nameSortButton.addActionListener(nameSortButtonListener);
    likeSortButton.addActionListener(likeSortButtonListener);

    rightPanel.add(sortButtonPanel, BorderLayout.NORTH);

    sortButtonPanel.add(accuracySortButton); // 정확도순 정렬 버튼
    sortButtonPanel.add(nameSortButton); // 이름순 정렬 버튼
    sortButtonPanel.add(likeSortButton); // 좋아요순 정렬 버튼
    sortButtonPanel.add(serchTextField); // 검색 필드
    sortButtonPanel.add(searchButton); // 검색하기 버튼

    // 테이블 생성
    JScrollPane scroll; // 테이블 위에 열 라벨을 넣어주자~ scroll
    this.table = searchRecipeManager.newJTable();
    scroll = new JScrollPane(this.table);
    rightPanel.add(scroll);
    searchRecipeManager.setJTable(this.table);

    con.add(initPanel);

    setVisible(true);
    setSize(1000, 700);
    table.addMouseListener(new MouseAdapter() {

      public void mouseClicked(MouseEvent e) {
        String message = "결과없음";
        if (e.getClickCount() == 1) {
          JTable target = (JTable) e.getSource();
          int row = target.getSelectedRow();
          int column = target.getSelectedColumn();
          String data = (String) target.getValueAt(row, column);// ex"부대찌개"
          for (int i = 0; i < resultlist.size(); i++) {
            if (resultlist.get(i).getRecipeName().equals(data)) {
              message = resultlist.get(i).getRecipe();
              System.out.println("data" + data);
              System.out.println("resultlist.get(i).getRecipeName()" + resultlist.get(i).getRecipeName());

            }
          }
          RecipeDialog recipeDialog = new RecipeDialog(frame, message);
          recipeDialog.setVisible(true);

        }
      }
    });
  }

  // search with Vector
  public class SelectButtonListener implements ActionListener {
    private IngredientView ingredientView;
    private RecipeView recipeView;
    private Vector<IngredientInfo> selectlist;
    private JTable table;

    public SelectButtonListener(IngredientView ingredientView, RecipeView recipeView) throws IOException {
      this.ingredientView = ingredientView;
      this.recipeView = recipeView;

    }

    @Override
    public void actionPerformed(ActionEvent e) {

      try {
        ingredientView.clearSelectlist(); // 기존 selectlist.txt 초기화

      } catch (IOException e2) {
        e2.printStackTrace();
      }
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
      ingredientView.setSelectlist(lotusRoot);
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

      try {
        resultlist = recipeView.search(ingredientView.getSelectlist());
      } catch (IOException e1) {
        // TODO Auto-generated catch block
        e1.printStackTrace();
      }
      table = searchRecipeManager.getJTable();
      recipeView.clearTableData(table);
      recipeView.showTableData(resultlist, table); // 선택한 재료로 레시피를 검색하고 결과 리스트를
                                                     // 출력한다.
      // resultlist.elementAt(3).getRecipeName() // test
    }
  }
  
  public class NameSortButtonListener implements ActionListener {
    RecipeView recipeView;
    
    public NameSortButtonListener(RecipeView recipeView) {
      this.recipeView = recipeView;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
      table = searchRecipeManager.getJTable();
      resultlist = recipeView.nameSort(resultlist);
      recipeView.clearTableData(table);
      recipeView.showTableData(resultlist, table);
    }
    
  }
  
  // sort with a number of likes
  public class LikeSortButtonListener implements ActionListener {
    RecipeView recipeView;

    public LikeSortButtonListener(RecipeView recipeView) {
      this.recipeView = recipeView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      table = searchRecipeManager.getJTable();
      resultlist = recipeView.likeSort(resultlist);
      recipeView.clearTableData(table);
      recipeView.showTableData(resultlist, table);
    }

  }

  // search with hashmap method
  public class SearchButtonListener implements ActionListener {

    Recipe recipelist;

    @Override
    public void actionPerformed(ActionEvent e) {
      searchRecipeManager.initialize();
      resultlist = searchRecipeManager.getHashmap().getRecipeNameInHashmap(serchTextField.getText(),
          searchRecipeManager.getJTable(), frame);
      System.out.println(resultlist.get(0).getRecipeName());

    }
  }

}