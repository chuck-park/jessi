package control;
import java.util.Vector;

import entity.Type;
import valueObject.TypeInfo;

public class TypeManager {
	private Type type;
	public TypeManager(){
		this.type = new Type();
	}
	
	public Vector<TypeInfo> getList() {
	  return type.getList();
	}
}

