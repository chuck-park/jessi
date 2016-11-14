package control;
import java.util.Vector;

import entity.Department;
import valueObject.DepartmentInfo;

public class DepartmentManager {
	private Department department;
	public DepartmentManager(){
		this.department = new Department();
	}
	
	public Vector<DepartmentInfo> getList() {
		Vector<DepartmentInfo> departmentlist = department.getList();
		
		return departmentlist;
	}

}

