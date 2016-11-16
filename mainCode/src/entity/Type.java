package entity;

import java.io.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

import valueObject.TypeInfo;


public class Type {
	private Vector<TypeInfo> typelist;
	public Type(){

		try {
			BufferedWriter fileWriter = new BufferedWriter(new FileWriter("type.txt"));
			fileWriter.write(1);
			fileWriter.write("육류");
			fileWriter.newLine();
			fileWriter.write(2);
			fileWriter.write("생선류");
			fileWriter.newLine();
			fileWriter.write(3);
			fileWriter.write("채소류");
			fileWriter.newLine();
			fileWriter.write(4);
			fileWriter.write("양념류");
			fileWriter.newLine();
			
			fileWriter.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Vector<TypeInfo> getList() {
		try {
			
			BufferedReader fileReader = new BufferedReader(new FileReader("type.txt"));
			typelist = new Vector<TypeInfo>();
			
			typelist.add(new TypeInfo(fileReader.read(), fileReader.readLine()));
			typelist.add(new TypeInfo(fileReader.read(), fileReader.readLine()));
			typelist.add(new TypeInfo(fileReader.read(), fileReader.readLine()));
			typelist.add(new TypeInfo(fileReader.read(), fileReader.readLine()));
			
			fileReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return typelist;
	}
}

