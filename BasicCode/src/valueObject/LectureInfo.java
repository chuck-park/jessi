package valueObject;

public class LectureInfo {
	private int lectureID;
	private String lectureName;
	private String lectureTime;
	private String lectureRoom;
	private String lectureProfessor;
	private String point;
	public LectureInfo (int id, String lectureName, String time, String room, String professor){
		this.lectureID=id;
		this.lectureName = lectureName;
		this.lectureTime = time;
		this.lectureRoom = room;
		this.lectureProfessor = professor;
	}
	
	public LectureInfo (int id, String lectureName){
		this.lectureID=id;
		this.lectureName = lectureName;
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
}
