package entity;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

import valueObject.LectureInfo;

public class Homework {
	private Vector<LectureInfo> homeworklist;
	
	public Homework(){
		try {
			
			BufferedReader fileReader = new BufferedReader(new FileReader("selectlist.txt"));
			homeworklist = new Vector<LectureInfo>();
		    //System.out.println(fileReader.read());
			
			homeworklist.add(new LectureInfo(fileReader.read(), fileReader.readLine()));
			homeworklist.add(new LectureInfo(fileReader.read(), fileReader.readLine()));
			homeworklist.add(new LectureInfo(fileReader.read(), fileReader.readLine()));
			homeworklist.add(new LectureInfo(fileReader.read(), fileReader.readLine()));
			homeworklist.add(new LectureInfo(fileReader.read(), fileReader.readLine()));
			
			fileReader.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void SubmitHomework(int lectureID) {
		try {
			BufferedWriter fileWriter = new BufferedWriter(new FileWriter("homework.txt"));
			for (int i=0; i < homeworklist.size(); i++){
				if(homeworklist.get(i).getLectureID() == lectureID){
					System.out.println(homeworklist.get(i).getLectureName()+ "에 과제 제출이 완료되었습니다");
					fileWriter.write(homeworklist.get(i).getLectureID());
					fileWriter.write(homeworklist.get(i).getLectureName());
					fileWriter.newLine();
					break;
				}
			}
			fileWriter.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Vector<LectureInfo> getList() {
		// TODO Auto-generated method stub
		return homeworklist;
	}
	
}
