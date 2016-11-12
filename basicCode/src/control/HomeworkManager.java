package control;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

import entity.Homework;
import valueObject.LectureInfo;

public class HomeworkManager {
	private LectureManager lectureManager; 
	private Homework homework;
	private Vector<LectureInfo> homeworklist;
	
	public HomeworkManager(){
		homework = new Homework();
	}

	public void SubmitHomework(int lectureID) {
		homework.SubmitHomework(lectureID);
	}

	public  Vector<LectureInfo> getList() {
		homeworklist = homework.getList();
		return homeworklist;
	}

}
