package entity;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

import valueObject.LectureInfo;

public class Lecture {
	private Vector<LectureInfo> lecturelist;
	
	public Lecture(){
		try {
			BufferedWriter fileWriter = new BufferedWriter(new FileWriter("lecture.txt"));
			BufferedReader fileReader = new BufferedReader(new FileReader("departmentID.txt"));
			int departmentID = fileReader.read();
			if(departmentID ==1){
				fileWriter.write(1);
				fileWriter.write("C언어");
				fileWriter.newLine();
				fileWriter.write(2);
				fileWriter.write("C++");
				fileWriter.newLine();
				fileWriter.write(3);
				fileWriter.write("자료구조");
				fileWriter.newLine();
				fileWriter.write(4);
				fileWriter.write("데이터베이스");
				fileWriter.newLine();
				fileWriter.write(5);
				fileWriter.write("Java");
				fileWriter.newLine();
				}else if(departmentID==2){
					fileWriter.write(1);
					fileWriter.write("미적분학");
					fileWriter.newLine();
					fileWriter.write(2);
					fileWriter.write("건축설계");
					fileWriter.newLine();
					fileWriter.write(3);
					fileWriter.write("공학수학");
					fileWriter.newLine();
					fileWriter.write(4);
					fileWriter.write("디자인과패턴");
					fileWriter.newLine();
					fileWriter.write(5);
					fileWriter.write("성경개론");
					fileWriter.newLine();
				}
				else if(departmentID==3){
					fileWriter.write(1);
					fileWriter.write("미적분학");
					fileWriter.newLine();
					fileWriter.write(2);
					fileWriter.write("선형대수학");
					fileWriter.newLine();
					fileWriter.write(3);
					fileWriter.write("통계학개론");
					fileWriter.newLine();
					fileWriter.write(4);
					fileWriter.write("영어1");
					fileWriter.newLine();
					fileWriter.write(5);
					fileWriter.write("영어회화1");
					fileWriter.newLine();
				}
				else if(departmentID==4){
					fileWriter.write(1);
					fileWriter.write("물리학1");
					fileWriter.newLine();
					fileWriter.write(2);
					fileWriter.write("물리학2");
					fileWriter.newLine();
					fileWriter.write(3);
					fileWriter.write("물리학실험1");
					fileWriter.newLine();
					fileWriter.write(4);
					fileWriter.write("물리학실험2");
					fileWriter.newLine();
					fileWriter.write(5);
					fileWriter.write("회로이론");
					fileWriter.newLine();
				}
				else if(departmentID==5){
					fileWriter.write(1);
					fileWriter.write("수영");
					fileWriter.newLine();
					fileWriter.write(2);
					fileWriter.write("축구");
					fileWriter.newLine();
					fileWriter.write(3);
					fileWriter.write("테니스");
					fileWriter.newLine();
					fileWriter.write(4);
					fileWriter.write("필라테스");
					fileWriter.newLine();
					fileWriter.write(5);
					fileWriter.write("화성악개론");
					fileWriter.newLine();
				}
			
			fileReader.close();
			fileWriter.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public Vector<LectureInfo> getList() {
		// TODO Auto-generated method stub
		try {
		
			BufferedReader fileReader = new BufferedReader(new FileReader("lecture.txt"));
			lecturelist = new Vector<LectureInfo>();
		    //System.out.println(fileReader.read());
			
			lecturelist.add(new LectureInfo(fileReader.read(), fileReader.readLine()));
			lecturelist.add(new LectureInfo(fileReader.read(), fileReader.readLine()));
			lecturelist.add(new LectureInfo(fileReader.read(), fileReader.readLine()));
			lecturelist.add(new LectureInfo(fileReader.read(), fileReader.readLine()));
			lecturelist.add(new LectureInfo(fileReader.read(), fileReader.readLine()));
			
			fileReader.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		return lecturelist;
	}

	public void putList(Vector<LectureInfo> lecutrelist){
	}


	public void setSelectlist(int lectureID) {
		// TODO Auto-generated method stub
		try {
			BufferedWriter fileWriter = new BufferedWriter(new FileWriter("selectlist.txt", true));
			for(int i=0; i < lecturelist.size(); i++){
				if(lecturelist.get(i).getLectureID()==lectureID){
					fileWriter.write(lecturelist.get(i).getLectureID());
					fileWriter.write(lecturelist.get(i).getLectureName());
					fileWriter.newLine();
					}
				}
			
			fileWriter.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public Vector<LectureInfo> getSelectlist() {
		// TODO Auto-generated method stub
		Vector<LectureInfo> selectlist = new Vector<LectureInfo>();
		try {
			
			BufferedReader fileReader = new BufferedReader(new FileReader("selectlist.txt"));
			
		    //System.out.println(fileReader.read());
			
			selectlist.add(new LectureInfo(fileReader.read(), fileReader.readLine()));
			selectlist.add(new LectureInfo(fileReader.read(), fileReader.readLine()));
			selectlist.add(new LectureInfo(fileReader.read(), fileReader.readLine()));
			selectlist.add(new LectureInfo(fileReader.read(), fileReader.readLine()));
			selectlist.add(new LectureInfo(fileReader.read(), fileReader.readLine()));
			
			fileReader.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		return selectlist;
		}
}


