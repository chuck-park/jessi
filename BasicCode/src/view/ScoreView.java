package view;

import java.util.Scanner;
import java.util.Vector;
import control.ScoreManager;
import valueObject.ScoreInfo;

public class ScoreView {
	private ScoreManager scoreManager;
	private Vector<ScoreInfo> scoreList;

	public ScoreView() {
		this.scoreManager = new ScoreManager();
		// TODO Auto-generated constructor stub
	}

	public void showScoreList() {
		System.out.println(" ");
		System.out.println("====성적을 조회 합니다.====");
		scoreList = scoreManager.getList();
		for (int i=0; i < scoreList.size(); i++){
			System.out.print(scoreList.get(i).getLectureID());
			System.out.print(", ");
			System.out.print(scoreList.get(i).getLectureName());
			System.out.print(", ");
			System.out.println(scoreList.get(i).getLectureGrade());
			}
		}
	
	
	}
