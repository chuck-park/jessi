package valueObject;

public class ScoreInfo {
	private int lectureID;
	private String lectureName;
	private String lectureGrade;

	public ScoreInfo(int lectureID, String lectureName, String lectureGrade) {
		this.lectureID = lectureID;
		this.lectureName = lectureName;
		this.lectureGrade = lectureGrade;
	}

	public int getLectureID() {
		return lectureID;
	}

	public void setLectureID(int lectureID) {
		this.lectureID = lectureID;
	}

	public String getLectureName() {
		return lectureName;
	}

	public void setLectureName(String lectureName) {
		this.lectureName = lectureName;
	}

	public String getLectureGrade() {
		return lectureGrade;
	}

	public void setLectureGrade(String lectureGrade) {
		this.lectureGrade = lectureGrade;
	}

}
