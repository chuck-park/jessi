package Main;
import java.io.IOException;
import java.util.Scanner;
import control.LectureManager;
import view.DepartmentView;
import view.HomeworkView;
import view.LectureView;
import view.LoginView;
import view.ScoreView;
// 프로그램 실행후에 재실행시 selectlist.txt 지워야함
//( 입력할때마다 과목 선택을 하기위해 txt 파일 덮어쓰기가 아닌 이어쓰기를 했습니다.)
public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		LoginView loginView = new LoginView();
		boolean result = loginView.login();
		
		if(result){
			
			DepartmentView departmentView = new DepartmentView();
			departmentView.showDepartmentList();
			departmentView.getDepartmentID(scanner);
			
			LectureView lectureView = new LectureView();
			lectureView.selectLecture(scanner);
			HomeworkView homesubmitView = new HomeworkView();
			homesubmitView.getSubmitList(scanner);
			ScoreView scoreView = new ScoreView();
			scoreView.showScoreList();
		}
	}
}
