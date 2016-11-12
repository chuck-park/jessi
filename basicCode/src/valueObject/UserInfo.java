package valueObject;
/**
 * @author admin
 * @version 1.0
 * @created 17-3-2016 ¿ÀÈÄ 3:09:34
 */
public class UserInfo {

	private String id;
	private String password;
	
	public String getId() {return id;}
	public void setId(String id) {this.id = id;}

	public String getPassword() {return password;}
	public void setPassword(String password) {this.password = password;}


	public UserInfo(){

	}

	public void finalize() throws Throwable {

	}
}//end UserInfo