package control;
import java.util.Vector;

import entity.Lecture;
import valueObject.LectureInfo;

public class LectureManager {
	private Vector<LectureInfo> lecturelist;
	Vector<LectureInfo> selectlist;
	
	

	private Lecture lecture;
	
	public LectureManager(){
		lecture = new Lecture();
		selectlist = new Vector<LectureInfo>();
		
	}
	public Vector<LectureInfo> getSelectlist() {
		this.selectlist = lecture.getSelectlist();
		return selectlist;
		
	}
	
	public void setSelectlist(int lectureID) {
		lecture.setSelectlist(lectureID);
		
	}
	
	public Vector<LectureInfo> getList() {
		// TODO Auto-generated method stub
		lecturelist = lecture.getList();
		
		return lecturelist;
	}
	
}
