package control;

import java.util.Vector;

import entity.Score;
import valueObject.ScoreInfo;

public class ScoreManager {
	private Score score;
	private Vector<ScoreInfo> scoreList;
	public ScoreManager() {
		score = new Score();
		// TODO Auto-generated constructor stub
		
	}

	
	public Vector<ScoreInfo> getList() {
		scoreList = score.getList();
//		scoreList.add(new ScoreInfo(0, null, "F"));
//		scoreList.add(new ScoreInfo(0, null, "F"));
//		scoreList.add(new ScoreInfo(0, null, "F"));
//		scoreList.add(new ScoreInfo(0, null, "F"));
//		scoreList.add(new ScoreInfo(0, null, "F"));
//		for(int i=0; i<scoreList.size(); i++) {
//			scoreList.get(i).setLectureID(lecureManager.getSelectList().get(i).getLectureID());
//			scoreList.get(i).setLectureName(lecureManager.getSelectList().get(i).getLectureName());
//			scoreList.get(i).setLectureGrade("A");
//		}
		return scoreList;
		// TODO Auto-generated method stub
		
	}

}
