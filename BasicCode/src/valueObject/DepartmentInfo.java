package valueObject;

public class DepartmentInfo {
	private int departmentID;
	private String departmnetName;
	public DepartmentInfo (int id, String departmentName){
		this.departmentID=id;
		this.departmnetName = departmentName;
	}
	public int getDepartmentID() {
		return departmentID;
	}
	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}
	public String getDepartmnetName() {
		return departmnetName;
	}
	public void setDepartmnetName(String departmnetName) {
		this.departmnetName = departmnetName;
	}
	

}
