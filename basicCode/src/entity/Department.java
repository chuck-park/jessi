package entity;

import java.io.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

import valueObject.DepartmentInfo;


public class Department {
	private Vector<DepartmentInfo> departmentlist;
	public Department(){
		
		try {
			BufferedWriter fileWriter = new BufferedWriter(new FileWriter("department.txt"));
			fileWriter.write(1);
			fileWriter.write("컴공");
			fileWriter.newLine();
			fileWriter.write(2);
			fileWriter.write("건축");
			fileWriter.newLine();
			fileWriter.write(3);
			fileWriter.write("수학과");
			fileWriter.newLine();
			fileWriter.write(4);
			fileWriter.write("물리학과");
			fileWriter.newLine();
			fileWriter.write(5);
			fileWriter.write("체육학과");
			fileWriter.newLine();
			
			fileWriter.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Vector<DepartmentInfo> getList() {
		try {
			
			BufferedReader fileReader = new BufferedReader(new FileReader("department.txt"));
			departmentlist = new Vector<DepartmentInfo>();
		    //System.out.println(fileReader.read());
			
			departmentlist.add(new DepartmentInfo(fileReader.read(), fileReader.readLine()));
			departmentlist.add(new DepartmentInfo(fileReader.read(), fileReader.readLine()));
			departmentlist.add(new DepartmentInfo(fileReader.read(), fileReader.readLine()));
			departmentlist.add(new DepartmentInfo(fileReader.read(), fileReader.readLine()));
			departmentlist.add(new DepartmentInfo(fileReader.read(), fileReader.readLine()));
			
			
			fileReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return departmentlist;
	}
	
	public void putList(Vector<DepartmentInfo> departmentlist){
		
	}
}

