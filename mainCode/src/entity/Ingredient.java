package entity;

import java.io.*;
import java.util.*;

import valueObject.*;

public class Ingredient {
	private Vector<IngredientInfo> ingredientlist;
	public Ingredient(){
		try {
			BufferedWriter fileWriter = new BufferedWriter(new FileWriter("ingredient.txt"));
			BufferedReader fileReader = new BufferedReader(new FileReader("typeID.txt"));
			int typeID = fileReader.read();
			if(typeID ==1){
				fileWriter.write(1);
				fileWriter.write("닭고기");
				fileWriter.newLine();
				fileWriter.write(2);
				fileWriter.write("돼지고기");
				fileWriter.newLine();
				fileWriter.write(3);
				fileWriter.write("소고기");
				fileWriter.newLine();
				fileWriter.write(4);
				fileWriter.write("양고기");
				fileWriter.newLine();
				fileWriter.write(5);
				fileWriter.write("오리고기");
				fileWriter.newLine();
				}else if(typeID==2){
					fileWriter.write(1);
					fileWriter.write("생선1");
					fileWriter.newLine();
					fileWriter.write(2);
					fileWriter.write("생선2");
					fileWriter.newLine();
					fileWriter.write(3);
					fileWriter.write("생선3");
					fileWriter.newLine();
					fileWriter.write(4);
					fileWriter.write("생선4");
					fileWriter.newLine();
					fileWriter.write(5);
					fileWriter.write("생선5");
					fileWriter.newLine();
				}
				else if(typeID==3){
					fileWriter.write(1);
					fileWriter.write("채소1");
					fileWriter.newLine();
					fileWriter.write(2);
					fileWriter.write("채소2");
					fileWriter.newLine();
					fileWriter.write(3);
					fileWriter.write("채소3");
					fileWriter.newLine();
					fileWriter.write(4);
					fileWriter.write("채소4");
					fileWriter.newLine();
					fileWriter.write(5);
					fileWriter.write("채소5");
					fileWriter.newLine();
				}
				else if(typeID==4){
					fileWriter.write(1);
					fileWriter.write("양념1");
					fileWriter.newLine();
					fileWriter.write(2);
					fileWriter.write("양념2");
					fileWriter.newLine();
					fileWriter.write(3);
					fileWriter.write("양념3");
					fileWriter.newLine();
					fileWriter.write(4);
					fileWriter.write("양념4");
					fileWriter.newLine();
					fileWriter.write(5);
					fileWriter.write("양념5");
					fileWriter.newLine();
				}
			
			fileReader.close();
			fileWriter.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public Vector<IngredientInfo> getList() {
		// TODO Auto-generated method stub
		try {
		
			BufferedReader fileReader = new BufferedReader(new FileReader("ingredient.txt"));
			ingredientlist = new Vector<IngredientInfo>();
		    //System.out.println(fileReader.read());
			
			ingredientlist.add(new IngredientInfo(fileReader.read(), fileReader.readLine()));
			ingredientlist.add(new IngredientInfo(fileReader.read(), fileReader.readLine()));
			ingredientlist.add(new IngredientInfo(fileReader.read(), fileReader.readLine()));
			ingredientlist.add(new IngredientInfo(fileReader.read(), fileReader.readLine()));
			ingredientlist.add(new IngredientInfo(fileReader.read(), fileReader.readLine()));
			
			fileReader.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ingredientlist;
	}

	public void setSelectlist(int ingredientID) { // 수정필요!
		try {
		  
		  /*
			BufferedWriter fileWriter = new BufferedWriter(new FileWriter("selectlist.txt", true));
			for(int i=0; i < ingredientlist.size(); i++){
				if(ingredientlist.get(i).getIngredientID()==ingredientID){
					fileWriter.write(ingredientlist.get(i).getIngredientID());
					fileWriter.write(ingredientlist.get(i).getIngredientName());
					fileWriter.newLine();
					}
				}
			
			fileWriter.close();
			*/
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public Vector<IngredientInfo> getSelectlist() {
		// TODO Auto-generated method stub
		Vector<IngredientInfo> selectlist = new Vector<IngredientInfo>();
		try {
			
			BufferedReader fileReader = new BufferedReader(new FileReader("selectlist.txt"));
			
		    //System.out.println(fileReader.read());
			
			selectlist.add(new IngredientInfo(fileReader.read(), fileReader.readLine()));
			selectlist.add(new IngredientInfo(fileReader.read(), fileReader.readLine()));
			selectlist.add(new IngredientInfo(fileReader.read(), fileReader.readLine()));
			selectlist.add(new IngredientInfo(fileReader.read(), fileReader.readLine()));
			selectlist.add(new IngredientInfo(fileReader.read(), fileReader.readLine()));
			
			fileReader.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		return selectlist;
		}
}


