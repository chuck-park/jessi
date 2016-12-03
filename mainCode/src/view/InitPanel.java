package view;
import java.awt.*;

import javax.swing.*;
import javax.swing.border.*;
   
@SuppressWarnings("serial")
public class InitPanel extends JFrame{
  
  Container con = getContentPane();
  
  JLabel titlelabel = new JLabel("JESSI:재료부터 시작하는 레시피");
  JPanel panel1 = new JPanel(); // 제일 큰거
  JPanel panel2 = new JPanel(); // 왼쪽
  JPanel panel3 = new JPanel(); // 오른쪽
  JPanel panel4 = new JPanel(); // 장류
  JPanel panel5 = new JPanel(); // 고기류
  JPanel panel6 = new JPanel(); // 해산물
  JPanel panel7 = new JPanel(); // 채소류
  JPanel panel8 = new JPanel(); // 오른쪽 위의 버튼들
  JPanel panel9 = new JPanel(); // 왼쪽 + 선택완료
  JPanel panel0 = new JPanel(); // 재료 정리
  JPanel panel11 = new JPanel(); // 조미료
  JPanel panel12 = new JPanel(); // 나물류
  JButton select = new JButton("선택완료");
  String colName[] = {"순번", "레시피 이름", "정확도", "좋아요 수"};
  
  public InitPanel(){
    this.setTitle("JESSI");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    panel1.setLayout(new BorderLayout());
    panel1.setSize(1000,700);
    titlelabel.setSize(500, 50);
    panel1.add(titlelabel, BorderLayout.NORTH);
    panel1.add(panel2, BorderLayout.CENTER);
        
    panel2.setLayout(new GridLayout(0, 2));
    panel2.add(panel9);
    panel2.add(panel3);
    
    panel5.setBorder(new TitledBorder(UIManager.getBorder("TitleBorder.border"), "육류", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0,0,0)));
    JCheckBox pig = new JCheckBox("돼지고기");
    JCheckBox cow = new JCheckBox("소고기");
    JCheckBox chicken = new JCheckBox("닭고기");
    
    panel5.add(pig);
    panel5.add(cow);
    panel5.add(chicken);
    
    panel4.setBorder(new TitledBorder(UIManager.getBorder("TitleBorder.border"), "장류", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0,0,0)));
    JCheckBox gochujang = new JCheckBox("고추장");
    JCheckBox ganjang= new JCheckBox("간장");
    JCheckBox doenjang = new JCheckBox("된장");
    
    panel4.add(gochujang);
    panel4.add(ganjang);
    panel4.add(doenjang);
    
    panel7.setBorder(new TitledBorder(UIManager.getBorder("TitleBorder.border"), "채소류", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0,0,0)));
    JCheckBox eggplant = new JCheckBox("가지");
    JCheckBox mushroom = new JCheckBox("버섯");
    JCheckBox carrot = new JCheckBox("당근");
    JCheckBox pumpkin = new JCheckBox("호박");
    JCheckBox paprika = new JCheckBox("파프리카");
    JCheckBox garlic = new JCheckBox("마늘");
    JCheckBox onion = new JCheckBox("양파");
    JCheckBox chili = new JCheckBox("고추");
    JCheckBox ginger = new JCheckBox("생강");
    JCheckBox scallion = new JCheckBox("파");
    
    panel7.add(eggplant);
    panel7.add(mushroom);
    panel7.add(carrot);
    panel7.add(pumpkin);
    panel7.add(paprika);
    panel7.add(garlic);
    panel7.add(onion);
    panel7.add(chili);
    panel7.add(ginger);
    panel7.add(scallion);
    
    panel6.setBorder(new TitledBorder(UIManager.getBorder("TitleBorder.border"), "해산물", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0,0,0)));
    JCheckBox ChubMackerel = new JCheckBox("고등어");
    JCheckBox seaweed = new JCheckBox("미역");
    JCheckBox mussel = new JCheckBox("홍합");
    JCheckBox ManilaClam = new JCheckBox("바지락");
    JCheckBox squid = new JCheckBox("오징어");
    JCheckBox shrimp = new JCheckBox("새우");
    JCheckBox crab = new JCheckBox("꽃게");
    JCheckBox hairtail = new JCheckBox("갈치");
    
    panel6.add(ChubMackerel);
    panel6.add(seaweed);
    panel6.add(mussel);
    panel6.add(ManilaClam);
    panel6.add(squid);
    panel6.add(shrimp);
    panel6.add(crab);
    panel6.add(hairtail);
    
    panel11.setBorder(new TitledBorder(UIManager.getBorder("TitleBorder.border"), "조미료", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0,0,0)));
    JCheckBox sugar = new JCheckBox("설탕");
    JCheckBox salt = new JCheckBox("소금");
    JCheckBox pepper = new JCheckBox("후추");
    JCheckBox ChiliPowder = new JCheckBox("고춧가루");
    JCheckBox StarchSyrup = new JCheckBox("물엿");
    JCheckBox vinegar = new JCheckBox("식초");
    JCheckBox OysterSauce = new JCheckBox("굴소스");
    
    panel11.add(sugar);
    panel11.add(salt);
    panel11.add(pepper);
    panel11.add(ChiliPowder);
    panel11.add(StarchSyrup);
    panel11.add(vinegar);
    panel11.add(OysterSauce);
    
    panel12.setBorder(new TitledBorder(UIManager.getBorder("TitleBorder.border"), "나물류", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0,0,0)));
    JCheckBox BeanSprouts = new JCheckBox("콩나물");
    JCheckBox GreenBeanSprouts = new JCheckBox("숙주나물");
    JCheckBox bracken = new JCheckBox("고사리");
    JCheckBox spinach = new JCheckBox("시금치");
    
    panel12.add(BeanSprouts);
    panel12.add(GreenBeanSprouts);
    panel12.add(bracken);
    panel12.add(spinach);
    
    panel9.setLayout(new BorderLayout());
    panel9.add(panel0, BorderLayout.CENTER);
    panel9.add(select, BorderLayout.SOUTH);
    panel0.setLayout(new GridLayout(6,0));
    panel0.add(panel4);
    panel0.add(panel5);
    panel0.add(panel6);
    panel0.add(panel7);
    panel0.add(panel11);
    panel0.add(panel12);
    
    panel3.setLayout(new BorderLayout());
    panel8.setLayout(new FlowLayout());
    
    
    JButton accuracy  = new JButton("정확도순");
    JButton alph = new JButton("가나다순");
    JButton like = new JButton("좋아요순");
    JButton serchbutton = new JButton("검색");
    JTextField serch = new JTextField(10);
    
    
    
    panel3.add(panel8, BorderLayout.NORTH);
    
    
    panel8.add(accuracy);
    panel8.add(alph);
    panel8.add(like);
    panel8.add(serch);
    panel8.add(serchbutton);
    
     JTable table;
     JScrollPane scroll; // 테이블 위에 열 라벨을 넣어주자~ scroll
     String[] [] data; // 3명의 정보를 담을 2차원 배열을 생성한다.
     String[] title = {"번호","레시피 이름","정확도 순","좋아요 순"}; //컬럼의 제목 정보를 표현할 1차원 배열

      data = new String[35][4];
      
      table=new JTable(data,title); // table=new JTable(데이터-2차원배열, 컬럼배열);
      scroll = new JScrollPane(table);
      panel3.add(scroll);

    con.add(panel1);
    
    
    setVisible(true);
    setSize(1000,700);
  }
}

