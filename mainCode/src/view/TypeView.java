package view;
import java.io.*;
import java.util.*;

import org.w3c.dom.*;

import control.*;
import valueObject.TypeInfo;

public class TypeView {
	private TypeManager typeManager;
	private Vector<valueObject.TypeInfo> typeList;
	public TypeView(){
		this.typeManager = new TypeManager();
	}
	
	public Vector<TypeInfo> getList(){
	  return typeManager.getList();
	}
}
