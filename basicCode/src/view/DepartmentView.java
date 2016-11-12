package view;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

import control.DepartmentManager;
import valueObject.DepartmentInfo;

public class DepartmentView {
	private DepartmentManager  departmentManager;
	private Vector<DepartmentInfo> departmentList;
	public DepartmentView(){
		this.departmentManager = new DepartmentManager();
	}

	public void getDepartmentID(Scanner scanner) throws IOException {
		System.out.print("학과아이디를 입력하세요: ");
		try {
			BufferedWriter fileWriter = new BufferedWriter(new FileWriter("departmentID.txt"));
			int id = scanner.nextInt();
			fileWriter.write(id);
			fileWriter.newLine();
		
			fileWriter.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//scanner.close();
	}

	public void showDepartmentList() {
		System.out.println("=====학과선택창====");
		 this.departmentList = departmentManager.getList();
			for (int i=0; i<departmentList.size(); i++) {
				System.out.print(departmentList.get(i).getDepartmentID());
				System.out.print(", ");
				System.out.println(departmentList.get(i).getDepartmnetName());
			}		
	}
}
