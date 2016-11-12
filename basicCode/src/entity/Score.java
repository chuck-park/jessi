package entity;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;
import valueObject.ScoreInfo;

public class Score {
		private Vector<ScoreInfo> scorelist;
		public Score(){
			try {
				BufferedWriter fileWriter = new BufferedWriter(new FileWriter("grade.txt"));
				fileWriter.write("A");
				fileWriter.newLine();
				fileWriter.write("B");
				fileWriter.newLine();
				fileWriter.write("D");
				fileWriter.newLine();
				fileWriter.write("C");
				fileWriter.newLine();
				fileWriter.write("F");
				fileWriter.newLine();
				
				
				fileWriter.close();
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		public Vector<ScoreInfo> getList() {
			try {
				
				BufferedReader fileReader = new BufferedReader(new FileReader("selectlist.txt"));
				BufferedReader gradefileReader = new BufferedReader(new FileReader("grade.txt"));
				scorelist = new Vector<ScoreInfo>();
				scorelist.add(new ScoreInfo(fileReader.read(), fileReader.readLine(), gradefileReader.readLine()));
				scorelist.add(new ScoreInfo(fileReader.read(), fileReader.readLine(), gradefileReader.readLine()));
				scorelist.add(new ScoreInfo(fileReader.read(), fileReader.readLine(), gradefileReader.readLine()));
				scorelist.add(new ScoreInfo(fileReader.read(), fileReader.readLine(), gradefileReader.readLine()));
				scorelist.add(new ScoreInfo(fileReader.read(), fileReader.readLine(), gradefileReader.readLine()));
				
				fileReader.close();
				gradefileReader.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			return scorelist;
		}
		
		public void putList(Vector<ScoreInfo> scorelist){
			
		}
}
