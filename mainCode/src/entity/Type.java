package entity;

import java.io.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

import valueObject.*;


public class Type {
   private Vector<TypeInfo> typelist;
   public Type(){

      try {
         BufferedWriter fileWriter = new BufferedWriter(new FileWriter("type.txt"));
         fileWriter.write(1);
         fileWriter.write("장류");
         fileWriter.newLine();
         fileWriter.write(2);
         fileWriter.write("고기류");
         fileWriter.newLine();
         fileWriter.write(3);
         fileWriter.write("해산물");
         fileWriter.newLine();
         fileWriter.write(4);
         fileWriter.write("채소류");
         fileWriter.newLine();
         fileWriter.write(5);
         fileWriter.write("조미료");
      fileWriter.newLine();
      fileWriter.write(6);
      fileWriter.write("나물류");
      fileWriter.newLine();
         
         fileWriter.close();
         
         
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }
   public Vector<TypeInfo> getList() {
      try {
         
         BufferedReader fileReader = new BufferedReader(new FileReader("type.txt"));
         typelist = new Vector<TypeInfo>();
         int num = 1;
         String line;
      for(int i = 0; num != -1; i++){
        num = fileReader.read();
        line = fileReader.readLine();
        if(num != -1){
          typelist.add(new TypeInfo(num, line));
//          System.out.println(num);
//          System.out.println(line);
        }else {
          break;
        }
      }
         
         fileReader.close();
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      return typelist;
   }
}
