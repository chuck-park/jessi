package valueObject;

public class TypeInfo {
	private int typeID;
	private String typeName;
	public TypeInfo (int id, String typeName){
		this.typeID = id;
		this.typeName = typeName;
	}
	public int getTypeID() {
		return typeID;
	}
	public void setTypeID(int typeID) {
		this.typeID = typeID;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	

}
